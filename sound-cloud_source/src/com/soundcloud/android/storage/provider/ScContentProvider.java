// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.accounts.Account;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.storage.DatabaseManager;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.collections.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.soundcloud.android.storage.provider:
//            Content, SCQueryBuilder

public class ScContentProvider extends ContentProvider
{
    public static interface CollectionItemTypes
    {

        public static final int FOLLOWER = 3;
        public static final int FOLLOWING = 2;
        public static final int LIKE = 1;
        public static final int PLAYLIST = 8;
        public static final int REPOST = 7;
        public static final int TRACK = 0;
    }

    private static interface DbOperation
    {

        public abstract Object execute();
    }

    public static interface Parameter
    {

        public static final String CACHED = "cached";
        public static final String IDS_ONLY = "idsOnly";
        public static final String LIMIT = "limit";
        public static final String OFFSET = "offset";
        public static final String RANDOM = "random";
        public static final String TYPE_IDS_ONLY = "typeIdsOnly";
    }

    private abstract class QueryOperation
        implements DbOperation
    {

        private final String columns[];
        private final String selection;
        private final String selectionArgs[];
        private final String sortOrder;
        final ScContentProvider this$0;
        private final Uri uri;

        public String toString()
        {
            return (new StringBuilder("DbOperation{uri=")).append(uri).append(", columns=").append(Arrays.toString(columns)).append(", selection='").append(selection).append('\'').append(", selectionArgs=").append(Arrays.toString(selectionArgs)).append(", sortOrder='").append(sortOrder).append('\'').append('}').toString();
        }

        public QueryOperation(Uri uri1, String as[], String s, String as1[], String s1)
        {
            this$0 = ScContentProvider.this;
            super();
            uri = uri1;
            columns = as;
            selection = s;
            selectionArgs = as1;
            sortOrder = s1;
        }
    }


    public static final String AUTHORITY = "com.soundcloud.android.provider.ScContentProvider";
    public static String POST_TYPE = "post_type";
    private static final String TAG = com/soundcloud/android/storage/provider/ScContentProvider.getSimpleName();
    private DatabaseManager databaseManager;

    public ScContentProvider()
    {
    }

    public ScContentProvider(DatabaseManager databasemanager)
    {
        databaseManager = databasemanager;
    }

    private static String[] addFakeLikeAssociationColumns(String as[], long l)
    {
        String as1[] = new String[as.length + 3];
        as = Lists.newArrayList(as);
        as.add((new StringBuilder()).append(Table.Likes).append(".created_at AS association_timestamp").toString());
        as.toArray(as1);
        return as1;
    }

    private void appendSoundType(SCQueryBuilder scquerybuilder, Content content)
    {
        StringBuilder stringbuilder = new StringBuilder(" _type = '");
        int i;
        if (content.modelType == com/soundcloud/android/api/legacy/model/PublicApiTrack)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        scquerybuilder.appendWhere(stringbuilder.append(i).append("'").toString());
    }

    public static void disableSyncing(Account account)
    {
        ContentResolver.setSyncAutomatically(account, "com.soundcloud.android.provider.ScContentProvider", false);
        ContentResolver.removePeriodicSync(account, "com.soundcloud.android.provider.ScContentProvider", new Bundle());
    }

    private int doDelete(Uri uri, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        Content content;
        long l;
        sqlitedatabase = databaseManager.getWritableDatabase();
        content = Content.match(uri);
        l = SoundCloudApplication.fromContext(getContext()).getAccountOperations().getLoggedInUserId();
        _cls5..SwitchMap.com.soundcloud.android.storage.provider.Content[content.ordinal()];
        JVM INSTR tableswitch 4 24: default 136
    //                   4 160
    //                   5 136
    //                   6 349
    //                   7 349
    //                   8 160
    //                   9 516
    //                   10 468
    //                   11 269
    //                   12 201
    //                   13 201
    //                   14 201
    //                   15 136
    //                   16 136
    //                   17 160
    //                   18 608
    //                   19 374
    //                   20 136
    //                   21 136
    //                   22 136
    //                   23 136
    //                   24 160;
           goto _L1 _L2 _L1 _L3 _L3 _L2 _L4 _L5 _L6 _L7 _L7 _L7 _L1 _L1 _L2 _L8 _L9 _L1 _L1 _L1 _L1 _L2
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown URI ")).append(uri).toString());
_L2:
        Object obj;
        String as1[];
        as1 = as;
        obj = s;
_L11:
        int i = sqlitedatabase.delete(content.table.name(), ((String) (obj)), as1);
        getContext().getContentResolver().notifyChange(uri, null, false);
        return i;
_L7:
        if (TextUtils.isEmpty(s))
        {
            obj = (new StringBuilder("_id=")).append(uri.getLastPathSegment()).toString();
            as1 = as;
        } else
        {
            obj = (new StringBuilder()).append(s).append(" AND _id=").append(uri.getLastPathSegment()).toString();
            as1 = as;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new StringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder()).append(s).append(" AND ").toString();
        } else
        {
            s = "";
        }
        obj = ((StringBuilder) (obj)).append(s).append("playlist_id=").append((String)uri.getPathSegments().get(1)).toString();
        as1 = as;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "content_id= ?";
        as1 = new String[1];
        as1[0] = String.valueOf(content.id);
        continue; /* Loop/switch isn't completed */
_L9:
        String s1 = (new StringBuilder()).append(Table.Posts.field("type")).append(" = 'post' AND ").append(Table.Posts.field("target_type")).append(" = 1").toString();
        obj = s1;
        as1 = as;
        if (!TextUtils.isEmpty(s))
        {
            obj = (new StringBuilder()).append(s).append(" AND ").append(s1).toString();
            as1 = as;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "type = 'repost'";
        as1 = as;
        if (!TextUtils.isEmpty(s))
        {
            obj = (new StringBuilder()).append(s).append(" AND ").append("type = 'repost'").toString();
            as1 = as;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        String s2 = (new StringBuilder()).append(Table.UserAssociations.name()).append(".owner_id = ").append(l).append(" AND association_type = ").append(content.collectionType).toString();
        obj = s2;
        as1 = as;
        if (!TextUtils.isEmpty(s))
        {
            obj = (new StringBuilder()).append(s).append(" AND ").append(s2).toString();
            as1 = as;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        String s3 = (new StringBuilder()).append(Table.UserAssociations.name()).append(".owner_id = ").append(l).toString();
        obj = s3;
        as1 = as;
        if (!TextUtils.isEmpty(s))
        {
            obj = (new StringBuilder()).append(s).append(" AND ").append(s3).toString();
            as1 = as;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    private Uri doInsert(Uri uri, ContentValues contentvalues)
    {
        long l = SoundCloudApplication.fromContext(getContext()).getAccountOperations().getLoggedInUserId();
        SQLiteDatabase sqlitedatabase = databaseManager.getWritableDatabase();
        Content content = Content.match(uri);
        switch (_cls5..SwitchMap.com.soundcloud.android.storage.provider.Content[content.ordinal()])
        {
        case 3: // '\003'
        case 5: // '\005'
        case 15: // '\017'
        case 16: // '\020'
        case 21: // '\025'
        case 22: // '\026'
        case 24: // '\030'
        case 25: // '\031'
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown URI ")).append(uri).toString());

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 26: // '\032'
            long l1 = sqlitedatabase.insertWithOnConflict(content.table.name(), null, contentvalues, 5);
            l = l1;
            if (l1 >= 0L)
            {
                l = l1;
                if (contentvalues.containsKey("_id"))
                {
                    l = contentvalues.getAsLong("_id").longValue();
                }
            }
            uri = uri.buildUpon().appendPath(String.valueOf(l)).build();
            getContext().getContentResolver().notifyChange(uri, null, false);
            return uri;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
            long l2 = upsert(content.table, sqlitedatabase, new ContentValues[] {
                contentvalues
            });
            l = l2;
            if (l2 >= 0L)
            {
                l = l2;
                if (contentvalues.containsKey("_id"))
                {
                    l = contentvalues.getAsLong("_id").longValue();
                }
            }
            uri = uri.buildUpon().appendPath(String.valueOf(l)).build();
            getContext().getContentResolver().notifyChange(uri, null, false);
            return uri;

        case 11: // '\013'
            l = sqlitedatabase.insert(content.table.name(), null, contentvalues);
            uri = uri.buildUpon().appendPath(String.valueOf(l)).build();
            getContext().getContentResolver().notifyChange(uri, null, false);
            contentvalues = contentvalues.getAsString("playlist_id");
            sqlitedatabase.execSQL((new StringBuilder("UPDATE ")).append(Table.Sounds.name()).append(" SET track_count=track_count + 1 WHERE _id=? AND _type=?").toString(), new String[] {
                contentvalues, "1"
            });
            return uri;

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            if (upsert(content.table, sqlitedatabase, new ContentValues[] {
    contentvalues
}) != -1)
            {
                getContext().getContentResolver().notifyChange(uri, null, false);
                return uri;
            } else
            {
                log((new StringBuilder("Error inserting to uri ")).append(uri.toString()).toString());
                return uri;
            }

        case 23: // '\027'
            break;
        }
        if (!contentvalues.containsKey("user_id"))
        {
            contentvalues.put("user_id", Long.valueOf(l));
        }
        upsert(content.table, sqlitedatabase, new ContentValues[] {
            contentvalues
        });
        return uri.buildUpon().appendPath(contentvalues.getAsString("_id")).build();
    }

    private Cursor doQuery(Uri uri, String as[], String s, String as1[], String s1)
    {
        Object obj;
        SCQueryBuilder scquerybuilder;
        Content content;
        long l;
        l = SoundCloudApplication.fromContext(getContext()).getAccountOperations().getLoggedInUserId();
        scquerybuilder = new SCQueryBuilder();
        content = Content.match(uri);
        obj = as;
        _cls5..SwitchMap.com.soundcloud.android.storage.provider.Content[content.ordinal()];
        JVM INSTR tableswitch 1 24: default 152
    //                   1 1123
    //                   2 1393
    //                   3 152
    //                   4 1123
    //                   5 1665
    //                   6 1547
    //                   7 1600
    //                   8 292
    //                   9 857
    //                   10 752
    //                   11 1295
    //                   12 1432
    //                   13 1216
    //                   14 1216
    //                   15 152
    //                   16 177
    //                   17 276
    //                   18 276
    //                   19 354
    //                   20 469
    //                   21 1086
    //                   22 1379
    //                   23 1508
    //                   24 1600;
           goto _L1 _L2 _L3 _L1 _L2 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L1 _L13 _L14 _L14 _L15 _L16 _L17 _L18 _L19 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder("No query available for: ")).append(uri).toString());
_L13:
        scquerybuilder.setTables(content.table.name());
        as1 = new String[1];
        as1[0] = String.valueOf(l);
        s = "_id = ?";
_L25:
        as = scquerybuilder.buildQuery(as, s, null, null, s1, getRowLimit(uri));
        log((new StringBuilder("query: ")).append(as).toString());
        as = databaseManager.getReadableDatabase().rawQuery(as, as1);
        as.setNotificationUri(getContext().getContentResolver(), uri);
        return as;
_L14:
        scquerybuilder.setTables(content.table.name());
        continue; /* Loop/switch isn't completed */
_L7:
        joinPostsAndSoundView(scquerybuilder);
        s1 = as;
        if (as == null)
        {
            s1 = getPostsColumns();
        }
        obj = makeCollectionSort(uri, (new StringBuilder()).append(Table.Posts.field("created_at")).append(" DESC").toString());
        as = s1;
        s1 = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L15:
        joinPostsAndSoundView(scquerybuilder);
        s1 = as;
        if (as == null)
        {
            s1 = getPostsColumns();
        }
        scquerybuilder.appendWhere((new StringBuilder(" AND ")).append(Table.Posts.field("type")).append(" = 'post' AND ").append(Table.Posts.field("target_type")).append(" = '1'").toString());
        obj = makeCollectionSort(uri, (new StringBuilder()).append(Table.Posts.field("created_at")).append(" DESC").toString());
        as = s1;
        s1 = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L16:
        scquerybuilder.setTables((new StringBuilder()).append(Table.SoundView.name()).append(" INNER JOIN ").append(Table.Likes.name()).append(" ON ").append(Table.SoundView).append("._id = ").append(Table.Likes.name()).append("._id").toString());
        if (!"1".equals(uri.getQueryParameter("typeIdsOnly"))) goto _L21; else goto _L20
_L20:
        s1 = new String[2];
        s1[0] = (new StringBuilder()).append(Table.Likes).append("._type").toString();
        s1[1] = (new StringBuilder()).append(Table.Likes).append("._id").toString();
_L23:
        Object obj1;
        as = (new StringBuilder()).append(Table.Likes).append(".created_at DESC").toString();
        scquerybuilder.appendWhere((new StringBuilder()).append(Table.Likes).append("._type = ").append(Table.SoundView).append("._type").toString());
        scquerybuilder.appendWhere(" AND removed_at IS NULL");
        obj = s1;
        obj1 = as;
        if (!"1".equals(uri.getQueryParameter("cached")))
        {
            break; /* Loop/switch isn't completed */
        }
        scquerybuilder.appendWhere(" AND sound_cached= 1");
        obj = as;
        as = s1;
        s1 = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L21:
        s1 = as;
        if (as == null)
        {
            s1 = addFakeLikeAssociationColumns(getSoundViewColumns(Table.SoundView), l);
        }
        if (true) goto _L23; else goto _L22
_L9:
        joinPostsAndSoundView(scquerybuilder);
        s1 = as;
        if (as == null)
        {
            s1 = getPostsColumns();
        }
        scquerybuilder.appendWhere((new StringBuilder(" AND ")).append(Table.Posts.field("type")).append(" = 'repost'").toString());
        as = makeCollectionSort(uri, "created_at DESC");
        obj = s1;
        obj1 = as;
        if ("1".equals(uri.getQueryParameter("cached")))
        {
            scquerybuilder.appendWhere(" AND sound_cached= 1");
            obj = as;
            as = s1;
            s1 = ((String) (obj));
            continue; /* Loop/switch isn't completed */
        }
          goto _L22
_L8:
        if ("1".equals(uri.getQueryParameter("idsOnly")))
        {
            scquerybuilder.setTables(Table.UserAssociations.name());
            scquerybuilder.appendWhere((new StringBuilder()).append(Table.UserAssociations.name()).append(".owner_id = ").append(l).toString());
            scquerybuilder.appendWhere((new StringBuilder(" AND association_type = ")).append(content.collectionType).toString());
            s1 = makeCollectionSort(uri, s1);
            as = (new String[] {
                "target_id"
            });
        } else
        {
            scquerybuilder.setTables(Table.UserAssociationView.name());
            obj = as;
            if (as == null)
            {
                obj = formatWithUser(getUserViewColumns(Table.UserAssociationView), l);
            }
            scquerybuilder.appendWhere((new StringBuilder()).append(Table.UserAssociationView.name()).append(".association_owner_id = ").append(l).toString());
            scquerybuilder.appendWhere((new StringBuilder(" AND association_type = ")).append(content.collectionType).toString());
            if (s1 == null)
            {
                s1 = "user_association_position";
            }
            s1 = makeCollectionSort(uri, s1);
            as = ((String []) (obj));
        }
        continue; /* Loop/switch isn't completed */
_L17:
        uri = new MatrixCursor(new String[] {
            "_id"
        }, 1);
        uri.addRow(new Object[] {
            Long.valueOf(l)
        });
        return uri;
_L2:
        scquerybuilder.setTables(Table.SoundView.name());
        String as2[] = as;
        if (as == null)
        {
            as2 = getSoundViewColumns(Table.SoundView);
        }
        if ("1".equals(uri.getQueryParameter("random")))
        {
            s1 = "RANDOM()";
        }
        appendSoundType(scquerybuilder, content);
        obj = as2;
        obj1 = s1;
        if ("1".equals(uri.getQueryParameter("cached")))
        {
            scquerybuilder.appendWhere(" AND sound_cached= 1");
            as = as2;
            continue; /* Loop/switch isn't completed */
        }
          goto _L22
_L12:
        scquerybuilder.setTables(Table.SoundView.name());
        appendSoundType(scquerybuilder, content);
        scquerybuilder.appendWhere((new StringBuilder(" AND ")).append(Table.SoundView.id).append(" = ").append(uri.getLastPathSegment()).toString());
        obj = as;
        obj1 = s1;
        if (as == null)
        {
            as = getSoundViewColumns(Table.SoundView);
            continue; /* Loop/switch isn't completed */
        }
          goto _L22
_L10:
        scquerybuilder.setTables(Table.PlaylistTracksView.name());
        scquerybuilder.appendWhere((new StringBuilder("playlist_id = ")).append((String)uri.getPathSegments().get(1)).toString());
        String as3[] = as;
        if (as == null)
        {
            as3 = getSoundViewColumns(Table.PlaylistTracksView);
        }
        obj = as3;
        obj1 = s1;
        if (s1 == null)
        {
            s1 = "playlist_position ASC, playlist_added_at DESC";
            as = as3;
            continue; /* Loop/switch isn't completed */
        }
          goto _L22
_L18:
        scquerybuilder.setTables(Table.PlaylistTracks.name());
        continue; /* Loop/switch isn't completed */
_L3:
        scquerybuilder.setTables(content.table.name());
        obj = as;
        obj1 = s1;
        if (as == null)
        {
            as = formatWithUser(getUserViewColumns(Table.Users), l);
            continue; /* Loop/switch isn't completed */
        }
          goto _L22
_L11:
        scquerybuilder.setTables(content.table.name());
        scquerybuilder.appendWhere((new StringBuilder()).append(Table.Users.id).append(" = ").append(uri.getLastPathSegment()).toString());
        obj = as;
        obj1 = s1;
        if (as == null)
        {
            as = formatWithUser(getUserViewColumns(Table.Users), l);
            continue; /* Loop/switch isn't completed */
        }
          goto _L22
_L19:
        scquerybuilder.setTables(content.table.name());
        scquerybuilder.appendWhere((new StringBuilder("user_id = ")).append(l).toString());
        continue; /* Loop/switch isn't completed */
_L5:
        obj1 = as;
        if (as == null)
        {
            obj1 = getSoundViewColumns(Table.ActivityView, "sound_id", "sound_type");
        }
        obj = obj1;
        if ("1".equals(uri.getQueryParameter("cached")))
        {
            scquerybuilder.appendWhere("sound_cached= 1 AND ");
            obj = obj1;
        }
_L6:
        scquerybuilder.setTables(Table.ActivityView.name());
        if (content != Content.ME_ALL_ACTIVITIES)
        {
            scquerybuilder.appendWhere((new StringBuilder("content_id=")).append(content.id).append(" ").toString());
        }
        s1 = makeActivitiesSort(uri, s1);
        as = ((String []) (obj));
        continue; /* Loop/switch isn't completed */
_L4:
        scquerybuilder.setTables(content.table.name());
        continue; /* Loop/switch isn't completed */
_L22:
        s1 = ((String) (obj1));
        as = ((String []) (obj));
        if (true) goto _L25; else goto _L24
_L24:
    }

    private int doUpdate(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase = databaseManager.getWritableDatabase();
        Content content = Content.match(uri);
        switch (_cls5..SwitchMap.com.soundcloud.android.storage.provider.Content[content.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown URI ")).append(uri).toString());

        case 17: // '\021'
        case 18: // '\022'
            int i = sqlitedatabase.update(content.table.name(), contentvalues, s, as);
            getContext().getContentResolver().notifyChange(uri, null, false);
            return i;

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 26: // '\032'
            break;
        }
        int j;
        if (TextUtils.isEmpty(s))
        {
            s = (new StringBuilder("_id=")).append(uri.getLastPathSegment()).toString();
        } else
        {
            s = (new StringBuilder()).append(s).append(" AND _id=").append(uri.getLastPathSegment()).toString();
        }
        j = sqlitedatabase.update(content.table.name(), contentvalues, s, as);
        getContext().getContentResolver().notifyChange(uri, null, false);
        return j;
    }

    public static void enableSyncing(Account account, long l)
    {
        ContentResolver.setIsSyncable(account, "com.soundcloud.android.provider.ScContentProvider", 1);
        ContentResolver.setSyncAutomatically(account, "com.soundcloud.android.provider.ScContentProvider", true);
        ContentResolver.addPeriodicSync(account, "com.soundcloud.android.provider.ScContentProvider", new Bundle(), l);
    }

    public static String[] formatWithUser(String as[], long l)
    {
        for (int i = 0; i < as.length; i++)
        {
            as[i] = as[i].replace("$$$", String.valueOf(l));
        }

        return as;
    }

    private static String[] getPostsColumns()
    {
        return (new String[] {
            (new StringBuilder()).append(Table.SoundView.name()).append(".*").toString(), (new StringBuilder()).append(Table.Posts.field("created_at")).append(" AS association_timestamp").toString(), (new StringBuilder()).append(Table.Posts.field("type")).append(" AS ").append(POST_TYPE).toString(), (new StringBuilder("EXISTS (SELECT 1 FROM ")).append(Table.Likes).append(", ").append(Table.Sounds.name()).append(" WHERE Sounds._id = ").append(Table.Likes.name()).append("._id AND Sounds._type = ").append(Table.Likes.name()).append("._type AND removed_at IS NULL) AS sound_user_like").toString(), (new StringBuilder("EXISTS (SELECT 1 FROM ")).append(Table.Posts).append(", ").append(Table.Sounds.name()).append(" WHERE Sounds._id = target_id AND Sounds._type = target_type AND type = 'repost') AS sound_user_repost").toString()
        });
    }

    private String getRowLimit(Uri uri)
    {
        String s = uri.getQueryParameter("limit");
        String s1 = uri.getQueryParameter("offset");
        uri = s;
        if (s != null)
        {
            uri = s;
            if (s1 != null)
            {
                uri = (new StringBuilder()).append(s1).append(",").append(s).toString();
            }
        }
        return uri;
    }

    private static String[] getSoundViewColumns(Table table)
    {
        return getSoundViewColumns(table, table.id, table.type);
    }

    private static String[] getSoundViewColumns(Table table, String s, String s1)
    {
        return (new String[] {
            (new StringBuilder()).append(table.name()).append(".*").toString(), (new StringBuilder("EXISTS (SELECT 1 FROM ")).append(Table.Likes).append(", ").append(Table.Sounds.name()).append(" WHERE ").append(s).append(" = ").append(Table.Likes.name()).append("._id AND ").append(s1).append(" = ").append(Table.Likes.name()).append("._type AND removed_at IS NULL) AS sound_user_like").toString(), (new StringBuilder("EXISTS (SELECT 1 FROM ")).append(Table.Posts).append(", ").append(Table.Sounds.name()).append(" WHERE ").append(s).append(" = target_id AND ").append(s1).append(" = target_type AND type = 'repost') AS sound_user_repost").toString()
        });
    }

    public static String[] getUserViewColumns(Table table)
    {
        return (new String[] {
            (new StringBuilder()).append(table).append(".*").toString(), (new StringBuilder("EXISTS (SELECT 1 FROM ")).append(Table.UserAssociations).append(", ").append(Table.Users.name()).append(" WHERE _id = target_id AND association_type = 2 AND owner_id = $$$) AS user_following").toString(), (new StringBuilder("EXISTS (SELECT 1 FROM ")).append(Table.UserAssociations).append(", ").append(Table.Users.name()).append(" WHERE _id = target_id AND association_type = 3 AND owner_id = $$$) AS user_follower").toString()
        });
    }

    private void joinPostsAndSoundView(SCQueryBuilder scquerybuilder)
    {
        scquerybuilder.setTables((new StringBuilder()).append(Table.Posts.name()).append(",").append(Table.SoundView.name()).toString());
        scquerybuilder.appendWhere((new StringBuilder()).append(Table.Posts.field("target_type")).append(" = ").append(Table.SoundView.field("_type")).append(" AND ").append(Table.Posts.field("target_id")).append(" = ").append(Table.SoundView.field("_id")).toString());
    }

    private static void log(String s)
    {
        Log.isLoggable(TAG, 3);
    }

    static String makeActivitiesSort(Uri uri, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if ("1".equals(uri.getQueryParameter("random")))
        {
            stringbuilder.append("RANDOM()");
        } else
        {
            uri = s;
            if (s == null)
            {
                uri = "created_at DESC";
            }
            stringbuilder.append(uri);
        }
        return stringbuilder.toString();
    }

    static String makeCollectionSort(Uri uri, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if ("1".equals(uri.getQueryParameter("random")))
        {
            stringbuilder.append("RANDOM()");
        } else
        {
            uri = s;
            if (TextUtils.isEmpty(s))
            {
                uri = "position";
            }
            stringbuilder.append(uri);
        }
        return stringbuilder.toString();
    }

    private Object safeExecute(DbOperation dboperation, Object obj)
    {
        Object obj1;
        try
        {
            obj1 = dboperation.execute();
        }
        catch (Throwable throwable)
        {
            ErrorUtils.handleSilentException((new StringBuilder("DB op failed; op=")).append(dboperation.toString()).toString(), throwable);
            return obj;
        }
        return obj1;
    }

    private static int upsert(Table table, SQLiteDatabase sqlitedatabase, ContentValues acontentvalues[])
    {
        if (table.fields == null || table.fields.length == 0)
        {
            throw new IllegalStateException("no fields defined");
        }
        sqlitedatabase.beginTransaction();
        int l = acontentvalues.length;
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            Object obj = acontentvalues[j];
            if (obj == null)
            {
                continue;
            }
            long l1 = ((ContentValues) (obj)).getAsLong("_id").longValue();
            ArrayList arraylist = new ArrayList();
            StringBuilder stringbuilder = new StringBuilder(5000);
            stringbuilder.append("INSERT OR REPLACE INTO ").append(table.name()).append('(').append(TextUtils.join(",", table.fields)).append(") VALUES (");
            int k = 0;
            while (k < table.fields.length) 
            {
                String s = table.fields[k];
                if (((ContentValues) (obj)).containsKey(s))
                {
                    stringbuilder.append('?');
                    arraylist.add(((ContentValues) (obj)).get(s));
                } else
                {
                    stringbuilder.append("(SELECT ").append(s).append(" FROM ").append(table.name()).append(" WHERE _id=?)");
                    arraylist.add(Long.valueOf(l1));
                }
                if (k < table.fields.length - 1)
                {
                    stringbuilder.append(',');
                }
                k++;
            }
            stringbuilder.append(");");
            obj = stringbuilder.toString();
            Log.isLoggable(TAG, 3);
            sqlitedatabase.execSQL(((String) (obj)), arraylist.toArray());
            i++;
        }

        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return i;
    }

    public int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        Object obj;
        SQLiteDatabase sqlitedatabase;
        if (acontentvalues == null || acontentvalues.length == 0)
        {
            return 0;
        }
        sqlitedatabase = databaseManager.getWritableDatabase();
        obj = Content.match(uri);
        _cls5..SwitchMap.com.soundcloud.android.storage.provider.Content[((Content) (obj)).ordinal()];
        JVM INSTR tableswitch 1 11: default 92
    //                   1 133
    //                   2 133
    //                   3 133
    //                   4 133
    //                   5 161
    //                   6 161
    //                   7 161
    //                   8 176
    //                   9 189
    //                   10 222
    //                   11 233;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L3 _L3 _L4 _L5 _L6 _L7
_L1:
        Table table;
        int i;
        table = ((Content) (obj)).table;
        obj = null;
        i = 0;
_L9:
        if (table == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No table for URI ")).append(uri).toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        upsert(((Content) (obj)).table, sqlitedatabase, acontentvalues);
        getContext().getContentResolver().notifyChange(uri, null, false);
        return acontentvalues.length;
_L3:
        table = ((Content) (obj)).table;
        obj = null;
        i = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        table = Table.Posts;
        obj = null;
        i = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        table = Table.UserAssociations;
        obj = (new String[] {
            "association_type", String.valueOf(((Content) (obj)).collectionType)
        });
        i = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        throw new IllegalArgumentException("Trying to bulkInsert reposts, and should not");
_L7:
        table = Table.PlaylistTracks;
        obj = new String[2];
        obj[0] = "playlist_id";
        obj[1] = (String)uri.getPathSegments().get(1);
        i = 1;
        if (true) goto _L9; else goto _L8
_L8:
        sqlitedatabase.beginTransaction();
        if (!i)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        delete(uri, null, null);
        int j = acontentvalues.length;
        i = 0;
_L11:
        ContentValues contentvalues;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        contentvalues = acontentvalues[i];
        if (contentvalues == null)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        contentvalues.put(obj[0], obj[1]);
        log((new StringBuilder("bulkInsert: ")).append(contentvalues).toString());
        if (sqlitedatabase.insertWithOnConflict(table.name(), null, contentvalues, 5) >= 0L)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        for (i = 1; i != 0; i = 0)
        {
            break MISSING_BLOCK_LABEL_386;
        }

        sqlitedatabase.setTransactionSuccessful();
        if (sqlitedatabase.inTransaction())
        {
            sqlitedatabase.endTransaction();
        }
        getContext().getContentResolver().notifyChange(uri, null, false);
        return acontentvalues.length;
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        uri;
        if (sqlitedatabase.inTransaction())
        {
            sqlitedatabase.endTransaction();
        }
        throw uri;
    }

    public int delete(final Uri uri, final String where, final String whereArgs[])
    {
        return ((Integer)safeExecute(new _cls3(), Integer.valueOf(0))).intValue();
    }

    public String getType(Uri uri)
    {
        switch (_cls5..SwitchMap.com.soundcloud.android.storage.provider.Content[Content.match(uri).ordinal()])
        {
        default:
            return null;

        case 12: // '\f'
            return "vnd.soundcloud/user";

        case 13: // '\r'
            return "vnd.soundcloud.playable/track";

        case 14: // '\016'
            return "vnd.soundcloud.playable/playlist";

        case 15: // '\017'
            return "vnd.soundcloud/search_item";
        }
    }

    public Uri insert(final Uri uri, final ContentValues values)
    {
        return (Uri)safeExecute(new _cls2(), null);
    }

    public boolean onCreate()
    {
        if (databaseManager == null)
        {
            databaseManager = DatabaseManager.getInstance(getContext());
        }
        return true;
    }

    public Cursor query(final Uri final_uri1, final String final_as[], final String final_s, final String final_as1[], final String final_s1)
    {
        return (Cursor)safeExecute(new _cls1(final_uri1, final_as, final_s, final_as1, final_s1), null);
    }

    public int update(final Uri uri, final ContentValues values, final String where, final String whereArgs[])
    {
        return ((Integer)safeExecute(new _cls4(), Integer.valueOf(0))).intValue();
    }






    private class _cls5
    {

        static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

        static 
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACKS.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror25) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USERS.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror24) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.SOUNDS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror23) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.PLAYLISTS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror22) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.COMMENTS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror21) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_SOUND_STREAM.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror20) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_ACTIVITIES.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror19) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_SOUNDS.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror18) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_FOLLOWINGS.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror17) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_REPOSTS.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror16) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.PLAYLIST_TRACKS.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.PLAYLIST.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.SEARCH_ITEM.ordinal()] = 15;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME.ordinal()] = 16;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.COLLECTIONS.ordinal()] = 17;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER_ASSOCIATIONS.ordinal()] = 18;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_PLAYLISTS.ordinal()] = 19;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_LIKES.ordinal()] = 20;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_USERID.ordinal()] = 21;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.PLAYLIST_ALL_TRACKS.ordinal()] = 22;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK_METADATA.ordinal()] = 23;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_ALL_ACTIVITIES.ordinal()] = 24;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.UNKNOWN.ordinal()] = 25;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.COLLECTION.ordinal()] = 26;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3
        implements DbOperation
    {

        final ScContentProvider this$0;
        final Uri val$uri;
        final String val$where;
        final String val$whereArgs[];

        public Integer execute()
        {
            return Integer.valueOf(doDelete(uri, where, whereArgs));
        }

        public volatile Object execute()
        {
            return execute();
        }

        _cls3()
        {
            this$0 = ScContentProvider.this;
            uri = uri1;
            where = s;
            whereArgs = as;
            super();
        }
    }


    private class _cls2
        implements DbOperation
    {

        final ScContentProvider this$0;
        final Uri val$uri;
        final ContentValues val$values;

        public Uri execute()
        {
            return doInsert(uri, values);
        }

        public volatile Object execute()
        {
            return execute();
        }

        _cls2()
        {
            this$0 = ScContentProvider.this;
            uri = uri1;
            values = contentvalues;
            super();
        }
    }


    private class _cls1 extends QueryOperation
    {

        final ScContentProvider this$0;
        final String val$columns[];
        final String val$selection;
        final String val$selectionArgs[];
        final String val$sortOrder;
        final Uri val$uri;

        public Cursor execute()
        {
            return doQuery(uri, columns, selection, selectionArgs, sortOrder);
        }

        public volatile Object execute()
        {
            return execute();
        }

        _cls1(Uri uri2, 
                String as2[], String s2, String as3[], String s3)
        {
            this$0 = ScContentProvider.this;
            uri = uri2;
            columns = as2;
            selection = s2;
            selectionArgs = as3;
            sortOrder = s3;
            super(final_uri1, final_as, final_s, final_as1, final_s1);
        }
    }


    private class _cls4
        implements DbOperation
    {

        final ScContentProvider this$0;
        final Uri val$uri;
        final ContentValues val$values;
        final String val$where;
        final String val$whereArgs[];

        public Integer execute()
        {
            return Integer.valueOf(doUpdate(uri, values, where, whereArgs));
        }

        public volatile Object execute()
        {
            return execute();
        }

        _cls4()
        {
            this$0 = ScContentProvider.this;
            uri = uri1;
            values = contentvalues;
            where = s;
            whereArgs = as;
            super();
        }
    }

}
