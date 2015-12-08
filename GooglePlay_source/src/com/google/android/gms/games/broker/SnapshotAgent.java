// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.TransientDataHolder;
import com.google.android.gms.common.images.ImageBroker;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.ImageUtils;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.internal.DriveClientImpl;
import com.google.android.gms.drive.internal.DriveFolderImpl;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import com.google.android.gms.drive.metadata.internal.fields.DateFields;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SearchableField;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import com.google.android.gms.drive.query.internal.FullTextSearchDetector;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.service.FilesApi;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.server.api.Snapshot;
import com.google.android.gms.games.server.api.SnapshotListResponse;
import com.google.android.gms.games.server.api.SnapshotsApi;
import com.google.android.gms.games.server.api.SnapshotsApiInternal;
import com.google.android.gms.games.server.postprocessor.PostProcessorHelper;
import com.google.android.gms.games.service.PlaySnapshotEventService;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.utils.GamesDataUtils;
import com.google.android.gms.mdm.DeviceManager;
import com.google.android.gms.mdm.DeviceManagerApi;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, Agents, GamesClientContext, ApiRateLimitUtil

public final class SnapshotAgent extends Lockable
{
    private static interface DriveIdQuery
    {

        public static final String PROJECTION[] = {
            "drive_resolved_id_string", "drive_resource_id_string"
        };

    }

    private static final class ResultPair
    {

        public final Object result;
        public final Status status;

        public ResultPair()
        {
            result = null;
            status = GamesStatusCodes.create(4005);
        }

        public ResultPair(Object obj, Status status1)
        {
            result = obj;
            status = status1;
        }
    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private static final ColumnSpec SNAPSHOT_SPEC;
    private final FilesApi mDriveFilesApi;
    private final SnapshotsApi mSnapshotsApi;
    private final SnapshotsApiInternal mSnapshotsApiInternal;

    public SnapshotAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1, BaseApiaryServer baseapiaryserver2)
    {
        super("SnapshotAgent", LOCK, lockable);
        mSnapshotsApi = new SnapshotsApi(baseapiaryserver);
        mSnapshotsApiInternal = new SnapshotsApiInternal(baseapiaryserver1);
        mDriveFilesApi = new FilesApi(baseapiaryserver2);
    }

    private static void addPurgeSnapshotOps(GoogleApiClient googleapiclient, Uri uri, HashSet hashset, ArrayList arraylist)
    {
        googleapiclient = (com.google.android.gms.drive.DriveApi.ResourceIdSetResult)Drive.DriveApi.checkResourceIdsExist(googleapiclient, hashset).await();
        java.util.Set set = googleapiclient.getExistingResourceIds();
        if (googleapiclient.getStatus().isSuccess() && set != null)
        {
            hashset.removeAll(set);
            googleapiclient = hashset.iterator();
            while (googleapiclient.hasNext()) 
            {
                hashset = (String)googleapiclient.next();
                GamesLog.d("SnapshotAgent", (new StringBuilder("Deleting snapshot ")).append(hashset).toString());
                QuerySpec queryspec = new QuerySpec(uri);
                queryspec.addWhere("drive_resource_id_string", hashset);
                arraylist.add(ContentProviderOperation.newDelete(uri).withSelection(queryspec.getSelection(), queryspec.mSelectionArgs).build());
            }
        }
    }

    static com.google.android.gms.drive.MetadataChangeSet.Builder convertSnapshotToDriveChange(SnapshotMetadataChange snapshotmetadatachange, String s, String s1)
    {
        s = (new com.google.android.gms.drive.MetadataChangeSet.Builder()).setMimeType(s);
        if (snapshotmetadatachange.getDescription() != null)
        {
            String s2 = snapshotmetadatachange.getDescription();
            ((com.google.android.gms.drive.MetadataChangeSet.Builder) (s)).mBag.put(BasicFields.DESCRIPTION, s2);
        }
        if (snapshotmetadatachange.getPlayedTimeMillis() != null)
        {
            setCustomProperty(s, new CustomPropertyKey("duration", 0), String.valueOf(snapshotmetadatachange.getPlayedTimeMillis()));
        }
        if (snapshotmetadatachange.getProgressValue() != null)
        {
            setCustomProperty(s, new CustomPropertyKey("progressValue", 0), String.valueOf(snapshotmetadatachange.getProgressValue()));
        }
        if (snapshotmetadatachange.getCoverImage() != null)
        {
            snapshotmetadatachange = snapshotmetadatachange.getCoverImage();
            com.google.android.gms.drive.MetadataChangeSet.Builder.checkSize("Thumbnail size", 0xc8000, snapshotmetadatachange.getRowBytes() * snapshotmetadatachange.getHeight());
            ((com.google.android.gms.drive.MetadataChangeSet.Builder) (s)).mBag.put(BasicFields.THUMBNAIL, new BitmapTeleporter(snapshotmetadatachange));
            setCustomProperty(s, new CustomPropertyKey("coverImageHeight", 0), String.valueOf(snapshotmetadatachange.getHeight()));
            setCustomProperty(s, new CustomPropertyKey("coverImageWidth", 0), String.valueOf(snapshotmetadatachange.getWidth()));
        }
        if (!TextUtils.isEmpty(s1))
        {
            setCustomProperty(s, new CustomPropertyKey("deviceName", 0), s1);
        }
        return s;
    }

    public static void decrementPendingChangeCount(Context context, ClientContext clientcontext, String s)
    {
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getUriForExternalSnapshotId(clientcontext, s);
        int i = Agents.queryInt(context, clientcontext, "pending_change_count", -1);
        if (i < 0)
        {
            GamesLog.d("SnapshotAgent", String.format("Snapshot %s deleted before op completed", new Object[] {
                s
            }));
            return;
        }
        if (i == 0)
        {
            Asserts.fail((new StringBuilder("Attempting to underflow ref count for ")).append(s).toString());
            return;
        } else
        {
            s = new ContentValues();
            s.put("pending_change_count", Integer.valueOf(i - 1));
            context.getContentResolver().update(clientcontext, s, null, null);
            return;
        }
    }

    private ResultPair findChildByTitle(GoogleApiClient googleapiclient, Query query, boolean flag)
    {
        DriveClientImpl driveclientimpl;
        Object obj;
        com.google.android.gms.drive.DriveApi.MetadataBufferResult metadatabufferresult;
        do
        {
            driveclientimpl = null;
            metadatabufferresult = (com.google.android.gms.drive.DriveApi.MetadataBufferResult)Drive.DriveApi.query(googleapiclient, query).await();
            obj = metadatabufferresult.getStatus();
            if (!((Status) (obj)).isSuccess())
            {
                GamesLog.w("SnapshotAgent", (new StringBuilder("Failed to list children: ")).append(obj).toString());
                return new ResultPair(null, ((Status) (obj)));
            }
            GamesLog.d("SnapshotAgent", (new StringBuilder("More may exist: ")).append(metadatabufferresult.moreEntriesMayExist()).toString());
            if (!flag || !metadatabufferresult.moreEntriesMayExist())
            {
                break;
            }
            metadatabufferresult.getMetadataBuffer().release();
            driveclientimpl = (DriveClientImpl)googleapiclient.getClient(Drive.CLIENT_KEY);
            obj = ((Query)Preconditions.checkNotNull(query)).mFilter;
            if (obj == null)
            {
                flag = false;
            } else
            {
                flag = ((Boolean)((Filter) (obj)).visit(new FullTextSearchDetector())).booleanValue();
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Cannot sync more with full text search");
            googleapiclient.execute(new com.google.android.gms.drive.internal.DriveClientImpl._cls6(driveclientimpl, googleapiclient, query)).await();
            flag = false;
        } while (true);
        query = metadatabufferresult.getMetadataBuffer();
        int i = query.getCount();
        googleapiclient = driveclientimpl;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        if (i <= 1)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        GamesLog.w("SnapshotAgent", "Found multiple files with title, taking the oldest one");
        googleapiclient = query.get(0).getDriveId();
        query.release();
        return new ResultPair(googleapiclient, ((Status) (obj)));
        googleapiclient;
        query.release();
        throw googleapiclient;
    }

    static long getContentSizeBytes(DriveContents drivecontents)
    {
        long l1 = -1L;
        long l = l1;
        if (drivecontents != null)
        {
            l = l1;
            if (drivecontents.getMode() != 0x20000000)
            {
                l = drivecontents.getParcelFileDescriptor().getStatSize();
            }
        }
        return l;
    }

    static String getDeviceName(GoogleApiClient googleapiclient)
    {
        String s;
        com.google.android.gms.mdm.DeviceManagerApi.DeviceNameResult devicenameresult;
        try
        {
            devicenameresult = (com.google.android.gms.mdm.DeviceManagerApi.DeviceNameResult)DeviceManager.DeviceManagerApi.getDeviceName(googleapiclient).await(15L, TimeUnit.SECONDS);
            s = devicenameresult.getName();
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            GamesLog.e("SnapshotAgent", "Failed to retrieve device name - ignoring");
            return null;
        }
        googleapiclient = s;
        if (TextUtils.isEmpty(s))
        {
            googleapiclient = devicenameresult.getModel();
        }
        return googleapiclient;
    }

    static DriveId getDriveId(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s)
    {
        String s1;
        String s2;
        Uri uri;
        Object obj;
        uri = com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getUriForExternalSnapshotId(gamesclientcontext.mClientContext, s);
        s2 = null;
        s1 = null;
        obj = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri);
        obj.mProjection = DriveIdQuery.PROJECTION;
        obj = ((Agents.QueryBuilder) (obj)).queryCursor();
        if (((Cursor) (obj)).moveToFirst())
        {
            s1 = ((Cursor) (obj)).getString(1);
            s2 = ((Cursor) (obj)).getString(0);
        }
        ((Cursor) (obj)).close();
        if (s2 != null)
        {
            return DriveId.decodeFromString(s2);
        }
        break MISSING_BLOCK_LABEL_102;
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
        if (s1 == null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("No Drive resource ID for snapshot ")).append(s).toString());
            return null;
        }
        s = (com.google.android.gms.drive.DriveApi.DriveIdResult)Drive.DriveApi.fetchDriveId(googleapiclient, s1).await();
        googleapiclient = s.getDriveId();
        if (googleapiclient == null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("Failed to resolve drive ID ")).append(s1).append(" ").append(s.getStatus()).toString());
            return null;
        } else
        {
            s = new ContentValues();
            s.put("drive_resolved_id_string", googleapiclient.encodeToString());
            gamesclientcontext.mContext.getContentResolver().update(uri, s, null, null);
            return googleapiclient;
        }
    }

    static Uri getLoadUri(GamesClientContext gamesclientcontext)
    {
        return com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
    }

    private ContentValues getMetadataValues(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, DriveFile drivefile, boolean flag)
        throws GoogleAuthException
    {
        googleapiclient = (com.google.android.gms.drive.DriveResource.MetadataResult)drivefile.getMetadata(googleapiclient).await();
        if (!googleapiclient.getStatus().isSuccess())
        {
            GamesLog.wtf(gamesclientcontext.mContext, "SnapshotAgent", (new StringBuilder("Failed to retrieve metadata: ")).append(googleapiclient.getStatus()).toString(), new Throwable());
            gamesclientcontext = null;
        } else
        {
            Metadata metadata = googleapiclient.getMetadata();
            Object obj = metadata.getCustomProperties();
            googleapiclient = (String)((Map) (obj)).get(new CustomPropertyKey("duration", 0));
            String s2 = (String)((Map) (obj)).get(new CustomPropertyKey("progressValue", 0));
            String s = (String)((Map) (obj)).get(new CustomPropertyKey("coverImageHeight", 0));
            String s1 = (String)((Map) (obj)).get(new CustomPropertyKey("coverImageWidth", 0));
            obj = (String)((Map) (obj)).get(new CustomPropertyKey("deviceName", 0));
            long l;
            long l1;
            boolean flag1;
            if (googleapiclient == null)
            {
                l = -1L;
            } else
            {
                l = Long.parseLong(googleapiclient);
            }
            if (s2 == null)
            {
                l1 = -1L;
            } else
            {
                l1 = Long.parseLong(s2);
            }
            googleapiclient = drivefile.getDriveId();
            drivefile = (Boolean)metadata.get(BasicFields.HAS_THUMBNAIL);
            if (drivefile == null)
            {
                flag1 = false;
            } else
            {
                flag1 = drivefile.booleanValue();
            }
            if (!flag1)
            {
                gamesclientcontext = null;
            } else
            {
                gamesclientcontext = getThumbnailUrl(gamesclientcontext, ((DriveId) (googleapiclient)).mResourceId);
            }
            googleapiclient = new ContentValues();
            googleapiclient.put("title", (String)metadata.get(BasicFields.TITLE));
            googleapiclient.put("unique_name", (String)metadata.get(BasicFields.UNIQUE_IDENTIFIER));
            googleapiclient.put("description", (String)metadata.get(BasicFields.DESCRIPTION));
            googleapiclient.put("last_modified_timestamp", Long.valueOf(((Date)metadata.get(DateFields.MODIFIED)).getTime()));
            googleapiclient.put("duration", Long.valueOf(l));
            googleapiclient.put("progress_value", Long.valueOf(l1));
            googleapiclient.put("device_name", ((String) (obj)));
            if (flag)
            {
                googleapiclient.put("pending_change_count", Integer.valueOf(1));
            }
            if (gamesclientcontext != null)
            {
                googleapiclient.put("cover_icon_image_url", gamesclientcontext);
                int i;
                if (s == null)
                {
                    i = 0;
                } else
                {
                    i = Integer.parseInt(s);
                }
                googleapiclient.put("cover_icon_image_height", Integer.valueOf(i));
                if (s1 == null)
                {
                    i = 0;
                } else
                {
                    i = Integer.parseInt(s1);
                }
                googleapiclient.put("cover_icon_image_width", Integer.valueOf(i));
            }
            gamesclientcontext = googleapiclient;
            if (((String)G.snapshotInitialMimeType.get()).equals((String)metadata.get(BasicFields.MIME_TYPE)))
            {
                googleapiclient.put("visible", Boolean.valueOf(false));
                return googleapiclient;
            }
        }
        return gamesclientcontext;
    }

    private static String getSnapshotIdForFile(GamesClientContext gamesclientcontext, String s)
    {
        return String.format("drive://%s/%s/%s", new Object[] {
            gamesclientcontext.mExternalCurrentPlayerId, gamesclientcontext.mExternalTargetGameId, s
        });
    }

    public static DataHolder getSnapshotMetadataById(Context context, ClientContext clientcontext, String s)
    {
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getUriForExternalSnapshotId(clientcontext, s);
        return (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext).query();
    }

    private String getThumbnailUrl(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        if (s == null)
        {
            return null;
        }
        FilesApi filesapi;
        ClientContext clientcontext;
        Boolean boolean1;
        Boolean boolean2;
        Boolean boolean3;
        StringBuilder stringbuilder;
        try
        {
            filesapi = mDriveFilesApi;
            clientcontext = gamesclientcontext.mClientContext;
            boolean1 = Boolean.valueOf(false);
            boolean2 = Boolean.valueOf(true);
            boolean3 = Boolean.valueOf(false);
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("files/%1$s", new Object[] {
                FilesApi.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "SnapshotAgent");
            }
            return null;
        }
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        FilesApi.append(stringbuilder, "acknowledgeAbuse", String.valueOf(boolean1));
        if (boolean2 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        FilesApi.append(stringbuilder, "allProperties", String.valueOf(boolean2));
        FilesApi.append(stringbuilder, "fileScopeAppIds", FilesApi.enc("0"));
        if (boolean3 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        FilesApi.append(stringbuilder, "updateViewedDate", String.valueOf(boolean3));
        s = stringbuilder.toString();
        s = (File)filesapi.mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/drive/internal/model/File);
        return PostProcessorHelper.getMaxWidthImageUrl(gamesclientcontext.mContext, ((File) (s)).mThumbnailLink);
    }

    private static ResultPair openDriveContents$eebda31(GoogleApiClient googleapiclient, DriveFile drivefile)
    {
        int i = 0;
        Object obj = null;
        googleapiclient = (com.google.android.gms.drive.DriveApi.DriveContentsResult)drivefile.open$298a1a43(googleapiclient, 0x30000000).await();
        if (googleapiclient.getStatus().isSuccess())
        {
            googleapiclient = googleapiclient.getDriveContents();
        } else
        {
            GamesLog.e("SnapshotAgent", (new StringBuilder("Failed to open contents. Result: ")).append(googleapiclient.getStatus()).toString());
            i = 4002;
            googleapiclient = obj;
        }
        return new ResultPair(googleapiclient, GamesStatusCodes.create(i));
    }

    private static void preloadImageData(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        ImageBroker.acquireBroker$3d64b9a2(gamesclientcontext.mContext).fetchImageData(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(gamesclientcontext.mClientContext), arraylist);
    }

    static int remapCommonStatusCode(int i)
    {
        switch (i)
        {
        case 5: // '\005'
        case 9: // '\t'
        default:
            GamesLog.d("SnapshotAgent", (new StringBuilder("No remapping for status code ")).append(i).toString());
            // fall through

        case 8: // '\b'
            return 1;

        case 7: // '\007'
            return 6;

        case 4: // '\004'
        case 6: // '\006'
            return 2;

        case 10: // '\n'
            return 8;
        }
    }

    private com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData reportConflict(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, DriveFile drivefile, DriveFile drivefile1, String s, Uri uri, int i)
        throws GoogleAuthException
    {
        ContentValues contentvalues;
        contentvalues = null;
        uri = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri).queryCursor();
        if (uri.moveToFirst())
        {
            contentvalues = SNAPSHOT_SPEC.extractRowValues(uri);
        }
        uri.close();
        if (contentvalues == null)
        {
            GamesLog.e("SnapshotAgent", "Failed to load metadata while resolving conflict");
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(1);
        }
        break MISSING_BLOCK_LABEL_80;
        gamesclientcontext;
        uri.close();
        throw gamesclientcontext;
        Object obj;
        TransientDataHolder transientdataholder;
        DriveContents drivecontents;
        String s1;
        ContentValues contentvalues1;
        transientdataholder = new TransientDataHolder(SNAPSHOT_SPEC.mColumnNames);
        transientdataholder.addRow(contentvalues);
        uri = drivefile.open$298a1a43(googleapiclient, 0x30000000);
        obj = drivefile1.open$298a1a43(googleapiclient, 0x30000000);
        drivefile = Drive.DriveApi.newDriveContents(googleapiclient, 0x30000000);
        uri = ((com.google.android.gms.drive.DriveApi.DriveContentsResult)uri.await()).getDriveContents();
        obj = ((com.google.android.gms.drive.DriveApi.DriveContentsResult)((PendingResult) (obj)).await()).getDriveContents();
        drivecontents = ((com.google.android.gms.drive.DriveApi.DriveContentsResult)drivefile.await()).getDriveContents();
        if (obj == null || drivecontents == null)
        {
            GamesLog.e("SnapshotAgent", "Failed to open contents while resolving conflict");
            if (uri == null)
            {
                i = 4002;
            } else
            {
                i = 0;
            }
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(transientdataholder.build(i), uri);
        }
        s1 = drivefile1.getDriveId().encodeToString();
        contentvalues1 = new ContentValues(contentvalues);
        contentvalues1.putAll(getMetadataValues(gamesclientcontext, googleapiclient, drivefile1, false));
        drivefile = contentvalues1.getAsString("cover_icon_image_url");
        if (drivefile != null)
        {
            drivefile1 = new ContentValues();
            drivefile1.put("url", drivefile);
            contentvalues1.put("cover_icon_image_uri", gamesclientcontext.mContext.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(gamesclientcontext.mClientContext), drivefile1).toString());
            drivefile1 = new ArrayList();
            drivefile1.add(drivefile);
            preloadImageData(gamesclientcontext, drivefile1);
        }
        drivefile1 = null;
        drivefile = null;
        i;
        JVM INSTR tableswitch 1 4: default 392
    //                   1 421
    //                   2 563
    //                   3 584
    //                   4 491;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_584;
_L6:
        long l;
        if (drivefile1 != null)
        {
            drivecontents.discard(googleapiclient);
            return resolveSnapshotConflict(gamesclientcontext, googleapiclient, s1, s, drivefile, drivefile1, i);
        } else
        {
            transientdataholder.addRow(contentvalues1);
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(transientdataholder.build(4004), s1, uri, ((DriveContents) (obj)), drivecontents);
        }
_L2:
        l = contentvalues.getAsLong("duration").longValue();
        if (contentvalues1.getAsLong("duration").longValue() > l)
        {
            GamesLog.d("SnapshotAgent", "Resolved conflict using longest (most recent)");
            drivefile1 = ((DriveFile) (obj));
            drivefile = valuesToMetadataChange(contentvalues1);
        } else
        {
            GamesLog.d("SnapshotAgent", "Resolved conflict using longest (last known good)");
            drivefile1 = uri;
            drivefile = valuesToMetadataChange(contentvalues);
        }
          goto _L6
_L5:
        long l1 = contentvalues.getAsLong("progress_value").longValue();
        if (contentvalues1.getAsLong("progress_value").longValue() > l1)
        {
            GamesLog.d("SnapshotAgent", "Resolved conflict using progress (most recent)");
            drivefile1 = ((DriveFile) (obj));
            drivefile = valuesToMetadataChange(contentvalues1);
        } else
        {
            GamesLog.d("SnapshotAgent", "Resolved conflict using progress (last known good)");
            drivefile1 = uri;
            drivefile = valuesToMetadataChange(contentvalues);
        }
          goto _L6
_L3:
        GamesLog.d("SnapshotAgent", "Resolved conflict using LAST_KNOWN_GOOD");
        drivefile1 = uri;
        drivefile = valuesToMetadataChange(contentvalues);
          goto _L6
        GamesLog.d("SnapshotAgent", "Resolved conflict using MOST_RECENTLY_MODIFIED");
        drivefile1 = ((DriveFile) (obj));
        drivefile = valuesToMetadataChange(contentvalues1);
          goto _L6
    }

    static com.google.android.gms.drive.MetadataChangeSet.Builder setCustomProperty(com.google.android.gms.drive.MetadataChangeSet.Builder builder, CustomPropertyKey custompropertykey, String s)
    {
        int i = custompropertykey.mKey.length();
        boolean flag;
        if (s.length() + i <= ((Integer)G.maxSnapshotPropertyLength.get()).intValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, String.format("Property %s is too long!", new Object[] {
            custompropertykey.mKey
        }));
        Preconditions.checkNotNull(custompropertykey, "key");
        Preconditions.checkNotNull(s, "value");
        com.google.android.gms.drive.MetadataChangeSet.Builder.checkSize("The total size of key string and value string of a custom property", 124, com.google.android.gms.drive.MetadataChangeSet.Builder.getUtf8EncodedByteLength(custompropertykey.mKey) + com.google.android.gms.drive.MetadataChangeSet.Builder.getUtf8EncodedByteLength(s));
        if (builder.mCustomPropertiesBuilder == null)
        {
            builder.mCustomPropertiesBuilder = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder();
        }
        builder.mCustomPropertiesBuilder.add(custompropertykey, s);
        return builder;
    }

    private static void storeSnapshots(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, ArrayList arraylist)
    {
        Uri uri = getLoadUri(gamesclientcontext);
        HashSet hashset = Agents.getColumnValues(gamesclientcontext.mContext, uri, "drive_resource_id_string");
        Map map = Agents.applyTwoColumnMapper(gamesclientcontext.mContext, uri, "external_snapshot_id", "last_modified_timestamp", null, Agents.STRING_TO_LONG_MAPPER);
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        int i = 0;
        int k = arraylist.size();
        while (i < k) 
        {
            Object obj = (Snapshot)arraylist.get(i);
            hashset.remove((String)((FastContentValuesJsonResponse) (obj)).mValues.get("drive_resource_id_string"));
            Long long1 = (Long)map.get(((Snapshot) (obj)).getId());
            if (long1 != null && ((Long)((FastContentValuesJsonResponse) (obj)).mValues.get("last_modified_timestamp")).longValue() < long1.longValue())
            {
                GamesLog.d("SnapshotAgent", (new StringBuilder("Ignoring locally modified snapshot ")).append(((Snapshot) (obj)).getId()).toString());
            } else
            {
                ContentValues contentvalues = ((FastContentValuesJsonResponse) (obj)).mValues;
                contentvalues.put("game_id", Long.valueOf(gamesclientcontext.resolveTargetGameId()));
                long l = gamesclientcontext.resolveCurrentPlayerId();
                boolean flag;
                if (l != -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Asserts.checkState(flag, "Attempting to store snapshot for unknown player!");
                contentvalues.put("owner_id", Long.valueOf(l));
                arraylist2.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getContentUri(gamesclientcontext.mClientContext)).withValues(contentvalues).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist2.size())).build());
                obj = ((FastContentValuesJsonResponse) (obj)).mValues.getAsString("cover_icon_image_url");
                if (obj != null)
                {
                    arraylist1.add(obj);
                }
            }
            i++;
        }
        if (hashset.size() > 0)
        {
            GamesLog.d("SnapshotAgent", "Trimming deleted snapshots");
            if (googleapiclient != null)
            {
                arraylist = (String[])hashset.toArray(new String[hashset.size()]);
                hashset = new HashSet();
                for (int j = 0; j < arraylist.length; j++)
                {
                    hashset.add(arraylist[j]);
                    if (hashset.size() == 50)
                    {
                        addPurgeSnapshotOps(googleapiclient, uri, hashset, arraylist2);
                        hashset.clear();
                    }
                }

                if (hashset.size() > 0)
                {
                    addPurgeSnapshotOps(googleapiclient, uri, hashset, arraylist2);
                    hashset.clear();
                }
            }
        }
        if (arraylist2.size() > 0)
        {
            Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist2, "SnapshotAgent");
        }
        ApiRateLimitUtil.updateUriTimestamp(getLoadUri(gamesclientcontext));
        preloadImageData(gamesclientcontext, arraylist1);
    }

    private static SnapshotMetadataChange valuesToMetadataChange(ContentValues contentvalues)
    {
        com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder builder = new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder();
        builder.mDescription = contentvalues.getAsString("description");
        builder.mPlayedTimeMillis = Long.valueOf(contentvalues.getAsLong("duration").longValue());
        builder.mProgressValue = Long.valueOf(contentvalues.getAsLong("progress_value").longValue());
        contentvalues = contentvalues.getAsString("cover_icon_image_uri");
        if (contentvalues == null)
        {
            contentvalues = null;
        } else
        {
            contentvalues = Uri.parse(contentvalues);
        }
        builder.mCoverImage = null;
        builder.mCoverImageUri = contentvalues;
        return builder.build();
    }

    final DataHolder commitSnapshot(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s, SnapshotMetadataChange snapshotmetadatachange, int i, DriveContents drivecontents)
    {
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getUriForExternalSnapshotId(gamesclientcontext.mClientContext, s);
        if (getDriveId(gamesclientcontext, googleapiclient, s) == null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("Could not find Drive ID for snapshot ")).append(s).toString());
            return DataHolder.empty(4000);
        }
        String s1 = getDeviceName(googleapiclient);
        com.google.android.gms.drive.MetadataChangeSet.Builder builder = convertSnapshotToDriveChange(snapshotmetadatachange, (String)G.snapshotCommittedMimeType.get(), s1);
        Context context = gamesclientcontext.mContext;
        String s2 = gamesclientcontext.mClientContext.mCallingPackageName;
        String s3 = gamesclientcontext.mExternalTargetGameId;
        String s4 = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        Bitmap bitmap = snapshotmetadatachange.getCoverImage();
        Object obj;
        if (bitmap == null)
        {
            obj = "";
        } else
        {
            obj = AndroidUtils.getMessageDigest("MD5");
            if (obj == null)
            {
                obj = "";
            } else
            {
                bitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, false);
                ByteBuffer bytebuffer = ByteBuffer.allocate(ImageUtils.calculateBytes(bitmap));
                bitmap.copyPixelsToBuffer(bytebuffer);
                obj = AndroidUtils.toHex$5a238448(((MessageDigest) (obj)).digest(bytebuffer.array()));
            }
        }
        GamesPlayLogger.logSnapshotAction(context, s2, s3, s4, i, s, ((String) (obj)), 4, getContentSizeBytes(drivecontents));
        s = PlaySnapshotEventService.buildTrackingTag(gamesclientcontext, s, i);
        obj = new com.google.android.gms.drive.ExecutionOptions.Builder();
        obj.mNotifyOnCompletion = true;
        s = ((com.google.android.gms.drive.ExecutionOptions.Builder) (obj)).setConflictStrategy$4bdbcb8d().setTrackingTag(s).build();
        googleapiclient = (Status)drivecontents.commit(googleapiclient, builder.build(), s).await();
        if (!googleapiclient.isSuccess())
        {
            GamesLog.e("SnapshotAgent", (new StringBuilder("Failed to update snapshot contents: ")).append(googleapiclient).toString());
            i = 4003;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            return DataHolder.empty(i);
        }
        ApiRateLimitUtil.clearUriTimestamp(getLoadUri(gamesclientcontext));
        gamesclientcontext = gamesclientcontext.mContext;
        googleapiclient = snapshotmetadatachange.toContentValues();
        googleapiclient.put("last_modified_timestamp", Long.valueOf(DefaultClock.getInstance().currentTimeMillis()));
        googleapiclient.put("visible", Boolean.valueOf(true));
        googleapiclient.put("pending_change_count", Integer.valueOf(Agents.queryInt(gamesclientcontext, uri, "pending_change_count", 0) + 1));
        if (!TextUtils.isEmpty(s1))
        {
            googleapiclient.put("device_name", s1);
        }
        gamesclientcontext.getContentResolver().update(uri, googleapiclient, null, null);
        return (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri).query();
    }

    final ResultPair getSnapshotFolder(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient)
    {
        DriveFolder drivefolder = Drive.DriveApi.getAppFolder(googleapiclient);
        if (drivefolder == null)
        {
            GamesLog.e("SnapshotAgent", (new StringBuilder("Could not find the app folder for game ")).append(gamesclientcontext.mExternalTargetGameId).toString());
            return new ResultPair();
        }
        String s = (String)G.snapshotFolder.get();
        com.google.android.gms.drive.DriveApi.DriveIdResult driveidresult = (com.google.android.gms.drive.DriveApi.DriveIdResult)Drive.DriveApi.getDriveIdFromUniqueIdentifier$70b7f367(googleapiclient, s).await();
        if (driveidresult.getStatus().isSuccess())
        {
            googleapiclient = driveidresult.getDriveId();
            if (((DriveId) (googleapiclient)).mResourceType == 0)
            {
                throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
            }
            googleapiclient = new DriveFolderImpl(googleapiclient);
        } else
        {
            googleapiclient = (com.google.android.gms.drive.DriveFolder.DriveFolderResult)drivefolder.createUniqueFolder(googleapiclient, s, (new com.google.android.gms.drive.MetadataChangeSet.Builder()).setTitle((String)G.snapshotFolder.get()).build()).await();
            if (!googleapiclient.getStatus().isSuccess())
            {
                GamesLog.e("SnapshotAgent", (new StringBuilder("Folder could not be created: ")).append(googleapiclient.getStatus()).append(" ").append(googleapiclient.getStatus().mStatusCode).toString());
                googleapiclient = null;
            } else
            {
                GamesLog.d("SnapshotAgent", (new StringBuilder("Created folder: ")).append(googleapiclient.getDriveFolder().getDriveId()).toString());
                googleapiclient = googleapiclient.getDriveFolder();
            }
        }
        if (googleapiclient == null)
        {
            GamesLog.e("SnapshotAgent", (new StringBuilder("Could not find the games folder for game ")).append(gamesclientcontext.mExternalTargetGameId).toString());
            return new ResultPair();
        } else
        {
            return new ResultPair(googleapiclient, GamesStatusCodes.create(0));
        }
    }

    public final DataHolder loadSnapshots(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient)
        throws GoogleAuthException
    {
        Object obj1;
        QuerySpec queryspec;
        int i;
        i = 0;
        Uri uri = getLoadUri(gamesclientcontext);
        queryspec = new QuerySpec(uri);
        queryspec.addWhere("visible", "0", ">?");
        if (ApiRateLimitUtil.isUriRateLimited(uri, 0x36ee80L, gamesclientcontext.mForceReload))
        {
            gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
            gamesclientcontext.mQuery = queryspec;
            gamesclientcontext.mSortOrder = "last_modified_timestamp DESC";
            gamesclientcontext.mStatusCode = 0;
            return gamesclientcontext.query();
        }
        obj1 = null;
        ArrayList arraylist;
        String s;
        arraylist = new ArrayList();
        s = Agents.getLocaleString(gamesclientcontext.mContext);
        Object obj = null;
_L4:
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        Object obj2;
        ClientContext clientcontext;
        StringBuilder stringbuilder1;
        obj2 = mSnapshotsApiInternal;
        clientcontext = gamesclientcontext.mClientContext;
        String s1 = gamesclientcontext.mExternalTargetPlayerId;
        String s3 = gamesclientcontext.mExternalTargetGameId;
        stringbuilder1 = new StringBuilder();
        (new Formatter(stringbuilder1)).format("players/%1$s/applications/%2$s/snapshots", new Object[] {
            SnapshotsApiInternal.enc(s1), SnapshotsApiInternal.enc(s3)
        });
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        SnapshotsApiInternal.append(stringbuilder1, "language", SnapshotsApiInternal.enc(s));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        SnapshotsApiInternal.append(stringbuilder1, "pageToken", SnapshotsApiInternal.enc(((String) (obj))));
        obj = stringbuilder1.toString();
        obj = (SnapshotListResponse)((SnapshotsApiInternal) (obj2)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/SnapshotListResponse);
_L5:
        obj2 = (String)((FastMapJsonResponse) (obj)).mValues.get("nextPageToken");
        obj = ((SnapshotListResponse) (obj)).getItems();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        arraylist.addAll(((java.util.Collection) (obj)));
        obj = obj2;
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        obj = arraylist;
_L6:
        if (obj != null)
        {
            storeSnapshots(gamesclientcontext, googleapiclient, ((ArrayList) (obj)));
        }
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        gamesclientcontext.mSortOrder = "last_modified_timestamp DESC";
        gamesclientcontext.mStatusCode = i;
        return gamesclientcontext.query();
_L2:
        StringBuilder stringbuilder;
        obj2 = mSnapshotsApi;
        clientcontext = gamesclientcontext.mClientContext;
        String s2 = gamesclientcontext.mExternalTargetGameId;
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("players/%1$s/snapshots", new Object[] {
            SnapshotsApi.enc(s2)
        });
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        SnapshotsApi.append(stringbuilder, "language", SnapshotsApi.enc(s));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        SnapshotsApi.append(stringbuilder, "pageToken", SnapshotsApi.enc(((String) (obj))));
        obj = stringbuilder.toString();
        obj = (SnapshotListResponse)((SnapshotsApi) (obj2)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/SnapshotListResponse);
          goto _L5
        VolleyError volleyerror;
        volleyerror;
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(volleyerror, "SnapshotAgent");
        }
        i = 500;
        volleyerror = obj1;
          goto _L6
    }

    public final com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData openSnapshot(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s, boolean flag, int i)
        throws GoogleAuthException
    {
        Object obj = getSnapshotFolder(gamesclientcontext, googleapiclient);
        Object obj2 = (DriveFolder)((ResultPair) (obj)).result;
        if (obj2 == null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("Could not open snapshot folder for game ")).append(gamesclientcontext.mExternalTargetGameId).toString());
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(((ResultPair) (obj)).status.mStatusCode);
        }
        boolean flag1 = false;
        obj = (com.google.android.gms.drive.DriveApi.DriveIdResult)Drive.DriveApi.getDriveIdFromUniqueIdentifier$70b7f367(googleapiclient, s).await();
        Object obj1;
        if (((com.google.android.gms.drive.DriveApi.DriveIdResult) (obj)).getStatus().isSuccess())
        {
            obj = ((com.google.android.gms.drive.DriveApi.DriveIdResult) (obj)).getDriveId().asDriveFile();
        } else
        {
            obj = null;
        }
        obj1 = obj;
        if (obj == null)
        {
            if (!flag)
            {
                GamesLog.w("SnapshotAgent", (new StringBuilder("Failed to find snapshot file ")).append(s).toString());
                return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(4000);
            }
            obj = PlaySnapshotEventService.buildTrackingTag(gamesclientcontext, getSnapshotIdForFile(gamesclientcontext, s), 1);
            GamesLog.d("SnapshotAgent", (new StringBuilder("Creating new snapshot ")).append(s).toString());
            obj1 = (new com.google.android.gms.drive.MetadataChangeSet.Builder()).setTitle(s).setMimeType((String)G.snapshotInitialMimeType.get()).build();
            com.google.android.gms.drive.ExecutionOptions.Builder builder = new com.google.android.gms.drive.ExecutionOptions.Builder();
            builder.mNotifyOnCompletion = true;
            obj = (com.google.android.gms.drive.DriveFolder.DriveFileResult)((DriveFolder) (obj2)).createUniqueFile$c19798a(googleapiclient, s, ((com.google.android.gms.drive.MetadataChangeSet) (obj1)), builder.setConflictStrategy$4bdbcb8d().setTrackingTag(((String) (obj))).build()).await();
            if (!((com.google.android.gms.drive.DriveFolder.DriveFileResult) (obj)).getStatus().isSuccess())
            {
                GamesLog.e("SnapshotAgent", (new StringBuilder("Failed to create snapshot file: ")).append(((com.google.android.gms.drive.DriveFolder.DriveFileResult) (obj)).getStatus()).toString());
                obj = null;
            } else
            {
                obj = ((com.google.android.gms.drive.DriveFolder.DriveFileResult) (obj)).getDriveFile();
            }
            flag1 = true;
            obj1 = obj;
        }
        if (obj1 == null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("Failed to create snapshot file ")).append(s).toString());
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(4001);
        }
        ResultPair resultpair = openDriveContents$eebda31(googleapiclient, ((DriveFile) (obj1)));
        obj = getMetadataValues(gamesclientcontext, googleapiclient, ((DriveFile) (obj1)), flag1);
        if (obj == null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("Could not open snapshot ")).append(s).toString());
            if (flag)
            {
                i = 4001;
            } else
            {
                i = 4000;
            }
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(i);
        }
        GamesLog.d("SnapshotAgent", (new StringBuilder("SNAPSHOT FOUND: ")).append(((DriveFile) (obj1)).getDriveId()).toString());
        Object obj3 = ((DriveFile) (obj1)).getDriveId();
        long l = gamesclientcontext.resolveTargetGameId();
        long l1 = gamesclientcontext.resolveCurrentPlayerId();
        Object obj4 = getSnapshotIdForFile(gamesclientcontext, ((ContentValues) (obj)).getAsString("unique_name"));
        ((ContentValues) (obj)).put("game_id", Long.valueOf(l));
        ((ContentValues) (obj)).put("owner_id", Long.valueOf(l1));
        ((ContentValues) (obj)).put("external_snapshot_id", ((String) (obj4)));
        ((ContentValues) (obj)).put("drive_resolved_id_string", ((DriveId) (obj3)).encodeToString());
        ((ContentValues) (obj)).put("drive_resource_id_string", ((DriveId) (obj3)).mResourceId);
        obj3 = gamesclientcontext.mContext.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getContentUri(gamesclientcontext.mClientContext), ((ContentValues) (obj)));
        obj4 = new ArrayList();
        ((ArrayList) (obj4)).add(((ContentValues) (obj)).getAsString("cover_icon_image_url"));
        preloadImageData(gamesclientcontext, ((ArrayList) (obj4)));
        if (obj3 == null)
        {
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(1);
        }
        obj4 = getSnapshotIdForFile(gamesclientcontext, s);
        obj = new CustomPropertyKey("conflictsWith", 0);
        obj2 = (new com.google.android.gms.drive.query.Query.Builder()).addFilter(new InFilter(SearchableField.PARENTS, ((DriveFolder) (obj2)).getDriveId()));
        Object obj5 = SearchableField.MIME_TYPE;
        Object obj6 = G.snapshotConflictMimeType.get();
        obj2 = ((com.google.android.gms.drive.query.Query.Builder) (obj2)).addFilter(new ComparisonFilter(Operator.EQUALS, ((com.google.android.gms.drive.metadata.SearchableMetadataField) (obj5)), obj6));
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Custom property value may not be null.");
        obj = ((com.google.android.gms.drive.query.Query.Builder) (obj2)).addFilter(new HasFilter(SearchableField.CUSTOM_FILE_PROPERTIES, (new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder()).add(((CustomPropertyKey) (obj)), s).build()));
        obj2 = new com.google.android.gms.drive.query.SortOrder.Builder();
        obj5 = DateFields.CREATED;
        ((com.google.android.gms.drive.query.SortOrder.Builder) (obj2)).mSortingFields.add(new FieldWithSortOrder(((SortableMetadataField) (obj5)).getName()));
        obj.mSortOrder = new SortOrder(((com.google.android.gms.drive.query.SortOrder.Builder) (obj2)).mSortingFields, false, (byte)0);
        obj = findChildByTitle(googleapiclient, new Query(new LogicalFilter(Operator.AND, ((com.google.android.gms.drive.query.Query.Builder) (obj)).mFilters), null, ((com.google.android.gms.drive.query.Query.Builder) (obj)).mSortOrder, null, false, null, false, (byte)0), true);
        if (((ResultPair) (obj)).result != null)
        {
            obj = ((DriveId)((ResultPair) (obj)).result).asDriveFile();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("Found conflict for snapshot ")).append(s).toString());
            return reportConflict(gamesclientcontext, googleapiclient, ((DriveFile) (obj1)), ((DriveFile) (obj)), ((String) (obj4)), ((Uri) (obj3)), i);
        } else
        {
            GamesPlayLogger.logSnapshotAction(gamesclientcontext.mContext, gamesclientcontext.mClientContext.mCallingPackageName, gamesclientcontext.mExternalTargetGameId, AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext), 1, ((String) (obj4)), 4, getContentSizeBytes((DriveContents)resultpair.result));
            gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj3)));
            gamesclientcontext.mStatusCode = resultpair.status.mStatusCode;
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(gamesclientcontext.query(), (DriveContents)resultpair.result);
        }
    }

    final com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData resolveSnapshotConflict(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents, int i)
        throws GoogleAuthException
    {
        DriveFile drivefile;
        Object obj;
        FileOutputStream fileoutputstream;
        obj = getDriveId(gamesclientcontext, googleapiclient, s1);
        if (obj == null)
        {
            GamesLog.w("SnapshotAgent", (new StringBuilder("Could not find Drive ID for snapshot ")).append(s1).toString());
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(4000);
        }
        drivefile = DriveId.decodeFromString(s).asDriveFile();
        if (!((com.google.android.gms.drive.DriveResource.MetadataResult)drivefile.getMetadata(googleapiclient).await()).getStatus().isSuccess())
        {
            GamesLog.e("SnapshotAgent", (new StringBuilder("Conflict not found when resolving conflict ")).append(s).toString());
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(4006);
        }
        s = openDriveContents$eebda31(googleapiclient, ((DriveId) (obj)).asDriveFile());
        int j = ((ResultPair) (s)).status.mStatusCode;
        if (j != 0)
        {
            GamesLog.e("SnapshotAgent", (new StringBuilder("Failed to open content while resolving conflict for ")).append(s1).toString());
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(j);
        }
        obj = (DriveContents)((ResultPair) (s)).result;
        fileoutputstream = new FileOutputStream(((DriveContents) (obj)).getParcelFileDescriptor().getFileDescriptor());
        s = new FileInputStream(drivecontents.getParcelFileDescriptor().getFileDescriptor());
        s.getChannel().position(0L);
        long l = IOUtils.copyStream(s, fileoutputstream, false, 8192);
        fileoutputstream.getChannel().truncate(l);
        drivecontents.discard(googleapiclient);
        IOUtils.closeQuietly(s);
        s = null;
        snapshotmetadatachange = commitSnapshot(gamesclientcontext, googleapiclient, s1, snapshotmetadatachange, 6, ((DriveContents) (obj)));
        s = snapshotmetadatachange;
        int k = ((DataHolder) (snapshotmetadatachange)).mStatusCode;
        if (snapshotmetadatachange != null)
        {
            snapshotmetadatachange.close();
        }
        if (k != 0)
        {
            return new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(k);
        } else
        {
            drivefile.delete(googleapiclient);
            s = com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getUriForExternalSnapshotId(gamesclientcontext.mClientContext, s1);
            return openSnapshot(gamesclientcontext, googleapiclient, Agents.queryString$510a9928(gamesclientcontext.mContext, s, "unique_name"), false, i);
        }
        gamesclientcontext;
        GamesLog.e("SnapshotAgent", (new StringBuilder("Failed to write contents while resolving ")).append(s1).toString());
        gamesclientcontext = new com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData(4002);
        drivecontents.discard(googleapiclient);
        IOUtils.closeQuietly(s);
        return gamesclientcontext;
        gamesclientcontext;
        drivecontents.discard(googleapiclient);
        IOUtils.closeQuietly(s);
        throw gamesclientcontext;
        gamesclientcontext;
        if (s != null)
        {
            s.close();
        }
        throw gamesclientcontext;
    }

    static 
    {
        SNAPSHOT_SPEC = ColumnSpec.builder().withColumnsFrom(GamesDataUtils.SNAPSHOT_METADATA_SPEC).withColumnsFrom(GamesDataUtils.GAME_SPEC).withColumnsFrom(GamesDataUtils.PLAYER_SPEC).build();
    }
}
