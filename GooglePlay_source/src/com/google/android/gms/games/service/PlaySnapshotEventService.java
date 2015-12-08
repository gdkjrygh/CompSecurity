// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.chimera.DriveEventService;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.SnapshotAgent;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.mdm.DeviceManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class PlaySnapshotEventService extends DriveEventService
{

    public PlaySnapshotEventService()
    {
        super("SnapshotEventService");
    }

    public static String buildTrackingTag(GamesClientContext gamesclientcontext, String s, int i)
    {
        return String.format("%s<:>%s<:>%s<:>%d", new Object[] {
            gamesclientcontext.mClientContext.mCallingPackageName, s, gamesclientcontext.mExternalTargetGameId, Integer.valueOf(i)
        });
    }

    private static ClientContext getClientContext(Context context, String s, String s1)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(s, 0).applicationInfo.uid;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("SnapshotEventService", (new StringBuilder("Bad package name: ")).append(s).toString(), context);
            return null;
        }
        context = new ClientContext(i, s1, s1, s);
        context.addGrantedScope("https://www.googleapis.com/auth/drive.appdata");
        context.addGrantedScope("https://www.googleapis.com/auth/games");
        return context;
    }

    private boolean handleFileConflict(GoogleApiClient googleapiclient, ClientContext clientcontext, DataBroker databroker, String s, CompletionEvent completionevent)
        throws GoogleAuthException
    {
        SnapshotMetadata snapshotmetadata;
        Object obj;
        obj = new SnapshotMetadataBuffer(databroker.getSnapshotMetadataById(this, clientcontext, s));
        snapshotmetadata = null;
        if (((SnapshotMetadataBuffer) (obj)).getCount() > 0)
        {
            snapshotmetadata = (SnapshotMetadata)((SnapshotMetadataBuffer) (obj)).get(0).freeze();
        }
        ((SnapshotMetadataBuffer) (obj)).release();
        if (snapshotmetadata == null)
        {
            GamesLog.e("SnapshotEventService", (new StringBuilder("Failed to load base snapshot ")).append(s).append(" while recording a conflict").toString());
            return false;
        }
        break MISSING_BLOCK_LABEL_91;
        googleapiclient;
        ((SnapshotMetadataBuffer) (obj)).release();
        throw googleapiclient;
        Object obj1;
        OutputStream outputstream;
        obj = new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder();
        obj.mDescription = snapshotmetadata.getDescription();
        obj.mPlayedTimeMillis = Long.valueOf(snapshotmetadata.getPlayedTime());
        obj.mProgressValue = Long.valueOf(snapshotmetadata.getProgressValue());
        if (((com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder) (obj)).mPlayedTimeMillis.longValue() == -1L)
        {
            obj.mPlayedTimeMillis = null;
        }
        obj.mCoverImageUri = snapshotmetadata.getCoverImageUri();
        if (((com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder) (obj)).mCoverImageUri != null)
        {
            obj.mCoverImage = null;
        }
        completionevent.throwIfReleased();
        if (completionevent.mModifiedMetadataBundle != null)
        {
            s = new MetadataChangeSet(completionevent.mModifiedMetadataBundle);
        } else
        {
            s = null;
        }
        if (s.getDescription() != null)
        {
            obj.mDescription = s.getDescription();
        }
        if (s.getThumbnail() != null)
        {
            obj.mCoverImage = new BitmapTeleporter(s.getThumbnail());
            obj.mCoverImageUri = null;
        }
        s = s.getCustomPropertyChangeMap();
        obj1 = (String)s.get(new CustomPropertyKey("duration", 0));
        if (obj1 != null)
        {
            obj.mPlayedTimeMillis = Long.valueOf(Long.parseLong(((String) (obj1))));
        }
        s = (String)s.get(new CustomPropertyKey("progressValue", 0));
        if (s != null)
        {
            obj.mProgressValue = Long.valueOf(Long.parseLong(s));
        }
        obj = ((com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder) (obj)).build();
        s = (com.google.android.gms.drive.DriveApi.DriveContentsResult)Drive.DriveApi.newDriveContents(googleapiclient).await();
        if (!s.getStatus().isSuccess())
        {
            GamesLog.e("SnapshotEventService", (new StringBuilder("Failed to open new conflict contents: ")).append(s.getStatus()).toString());
            return false;
        }
        obj1 = s.getDriveContents();
        outputstream = ((DriveContents) (obj1)).getOutputStream();
        completionevent.throwIfReleased();
        if (completionevent.mModifiedParcelFileDescriptor != null) goto _L2; else goto _L1
_L1:
        s = null;
_L3:
        try
        {
            IOUtils.copyStream(s, outputstream, false, 8192);
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            GamesLog.e("SnapshotEventService", "Failed to persist conflict contents!");
            return false;
        }
        clientcontext = new com.google.android.gms.games.broker.GamesClientContext.Builder(this, clientcontext);
        clientcontext.mExternalOwningGameId = snapshotmetadata.getGame().getApplicationId();
        clientcontext.mExternalTargetGameId = snapshotmetadata.getGame().getApplicationId();
        databroker.recordSnapshotConflict(clientcontext.build(), googleapiclient, ((com.google.android.gms.games.snapshot.SnapshotMetadataChange) (obj)), ((DriveContents) (obj1)));
        return true;
_L2:
        if (completionevent.mGetModifiedInputStreamCalled)
        {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        }
        completionevent.mGetModifiedInputStreamCalled = true;
        s = new FileInputStream(completionevent.mModifiedParcelFileDescriptor.getFileDescriptor());
          goto _L3
    }

    private boolean onCompletionInner(DataBroker databroker, CompletionEvent completionevent)
    {
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        int j;
        completionevent.throwIfReleased();
        j = completionevent.mStatus;
        completionevent.throwIfReleased();
        obj = new ArrayList(completionevent.mTrackingTags);
        String as[];
        String s;
        int k;
        boolean flag;
        if (((List) (obj)).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        as = ((String)((List) (obj)).get(0)).split("<:>");
        if (as.length == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        obj1 = as[0];
        obj = as[1];
        obj2 = as[2];
        k = Integer.parseInt(as[3]);
        completionevent.throwIfReleased();
        s = completionevent.mAccountName;
        j;
        JVM INSTR tableswitch 0 2: default 140
    //                   0 221
    //                   1 227
    //                   2 233;
           goto _L1 _L2 _L3 _L4
_L1:
        GamesLog.w("SnapshotEventService", (new StringBuilder("Unknown snapshot action status: ")).append(j).toString());
        i = 0;
_L6:
        GamesPlayLogger.logSnapshotAction(this, ((String) (obj1)), ((String) (obj2)), s, k, ((String) (obj)), i, -1L);
        obj2 = getClientContext(this, ((String) (obj1)), s);
        if (obj2 == null)
        {
            GamesLog.e("SnapshotEventService", "Cannot create client context - ignoring");
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 3;
        if (true) goto _L6; else goto _L5
_L5:
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mSnapshotAgent
        });
        SnapshotAgent.decrementPendingChangeCount(this, ((ClientContext) (obj2)), ((String) (obj)));
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mSnapshotAgent
        });
        if (j != 2)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_299;
        completionevent;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mSnapshotAgent
        });
        throw completionevent;
        Object obj3 = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this)).setAccountName(((ClientContext) (obj2)).getResolvedAccountName()).addApi(Drive.INTERNAL_API, (new com.google.android.gms.drive.Drive.DriveOptions.Builder()).setProxyType$24057e15().build()).addScope(Drive.SCOPE_APPFOLDER).addScope(Games.SCOPE_GAMES).addApi(DeviceManager.API);
        obj3.mRealClientPackageName = ((String) (obj1));
        obj1 = ((com.google.android.gms.common.api.GoogleApiClient.Builder) (obj3)).build();
        obj3 = ((GoogleApiClient) (obj1)).blockingConnect();
        if (!((ConnectionResult) (obj3)).isSuccess())
        {
            GamesLog.e("SnapshotEventService", (new StringBuilder("FAILED TO CONNECT WHILE RESOLVING: ")).append(obj3).toString());
            return false;
        }
        boolean flag1;
        try
        {
            flag1 = handleFileConflict(((GoogleApiClient) (obj1)), ((ClientContext) (obj2)), databroker, ((String) (obj)), completionevent);
        }
        // Misplaced declaration of an exception variable
        catch (DataBroker databroker)
        {
            GamesLog.e("SnapshotEventService", "Error while resolving conflict", databroker);
            return false;
        }
        return flag1;
    }

    public final void onCompletion(CompletionEvent completionevent)
    {
        DataBroker databroker;
        if (completionevent == null)
        {
            GamesLog.w("SnapshotEventService", "Null event received - ignoring");
            return;
        }
        databroker = DataBroker.acquireBroker(this);
        boolean flag = onCompletionInner(databroker, completionevent);
        if (flag)
        {
            completionevent.release(false);
        } else
        {
            completionevent.release(true);
        }
        databroker.release();
        return;
        Exception exception;
        exception;
        completionevent.release(true);
        databroker.release();
        throw exception;
    }
}
