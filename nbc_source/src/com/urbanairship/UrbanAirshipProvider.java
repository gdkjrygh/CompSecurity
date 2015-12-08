// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.urbanairship.util.DataManager;
import com.urbanairship.util.UAStringUtil;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.urbanairship:
//            UAirship, PreferencesDataManager, RichPushDataManager, Logger

public class UrbanAirshipProvider extends ContentProvider
{
    private static class DatabaseModel
    {

        Uri contentUri;
        DataManager dataManager;
        String notificationColumnId;
        String table;

        static DatabaseModel createPreferencesModel(Context context)
        {
            return new DatabaseModel(new PreferencesDataManager(context), "preferences", UrbanAirshipProvider.getPreferencesContentUri(), "_id");
        }

        static DatabaseModel createRichPushModel(Context context)
        {
            return new DatabaseModel(new RichPushDataManager(context), "richpush", UrbanAirshipProvider.getRichPushContentUri(), "message_id");
        }

        void notifyDatabaseChange(Context context, String as[], String s)
        {
            as = Uri.withAppendedPath(contentUri, (new StringBuilder()).append(UAStringUtil.join(Arrays.asList(as), "|")).append("/").append(s).toString());
            Logger.verbose((new StringBuilder()).append("Notifying of change to ").append(as.toString()).toString());
            context.getContentResolver().notifyChange(as, null);
        }

        private DatabaseModel(DataManager datamanager, String s, Uri uri, String s1)
        {
            dataManager = datamanager;
            table = s;
            contentUri = uri;
            notificationColumnId = s1;
        }
    }


    public static final String DB_CHANGE_ACTION_KEY = "com.urbanairship.DB_CHANGE_ACTION";
    public static final String DB_CHANGE_KEYS_KEY = "com.urbanairship.DB_CHANGE_KEYS";
    public static final String DELETE_ACTION = "delete";
    public static final String INSERT_ACTION = "insert";
    public static final String KEYS_DELIMITER = "|";
    private static final int KEYS_LOCATION = 1;
    private static final UriMatcher MATCHER = new UriMatcher(-1);
    static final String MULTIPLE_SUFFIX = "vnd.urbanairship.cursor.dir/";
    static final String PREFERENCES_CONTENT_ITEM_TYPE = "vnd.urbanairship.cursor.item/preference";
    static final String PREFERENCES_CONTENT_TYPE = "vnd.urbanairship.cursor.dir/preference";
    private static final int PREFERENCES_URI_TYPE = 2;
    private static final int PREFERENCE_URI_TYPE = 3;
    public static final String REPLACE_ACTION = "replace";
    private static final int RICHPUSH_MESSAGES_URI_TYPE = 0;
    private static final int RICHPUSH_MESSAGE_URI_TYPE = 1;
    static final String RICH_PUSH_CONTENT_ITEM_TYPE = "vnd.urbanairship.cursor.item/richpush";
    static final String RICH_PUSH_CONTENT_TYPE = "vnd.urbanairship.cursor.dir/richpush";
    static final String SINGLE_SUFFIX = "vnd.urbanairship.cursor.item/";
    public static final String UPDATE_ACTION = "update";
    private static String authorityString;
    private DatabaseModel preferencesModel;
    private DatabaseModel richPushModel;

    public UrbanAirshipProvider()
    {
    }

    public static String getAuthorityString()
    {
        if (authorityString == null)
        {
            String s = UAirship.getPackageName();
            authorityString = (new StringBuilder()).append(s).append(".urbanairship.provider").toString();
        }
        return authorityString;
    }

    private DatabaseModel getDatabaseModel(Uri uri)
    {
        switch (MATCHER.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Uri: ").append(uri).toString());

        case 0: // '\0'
        case 1: // '\001'
            return getRichPushModel();

        case 2: // '\002'
        case 3: // '\003'
            return getPreferencesModel();
        }
    }

    private String[] getKeys(Uri uri)
    {
        try
        {
            uri = ((String)uri.getPathSegments().get(1)).split("\\|");
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return new String[0];
        }
        return uri;
    }

    public static Uri getPreferencesContentUri()
    {
        return Uri.parse((new StringBuilder()).append("content://").append(getAuthorityString()).append("/preferences").toString());
    }

    private DatabaseModel getPreferencesModel()
    {
        if (preferencesModel == null)
        {
            preferencesModel = DatabaseModel.createPreferencesModel(getContext());
        }
        return preferencesModel;
    }

    public static Uri getRichPushContentUri()
    {
        return Uri.parse((new StringBuilder()).append("content://").append(getAuthorityString()).append("/richpush").toString());
    }

    private DatabaseModel getRichPushModel()
    {
        if (richPushModel == null)
        {
            richPushModel = DatabaseModel.createRichPushModel(getContext());
        }
        return richPushModel;
    }

    public static void init()
    {
        MATCHER.addURI(getAuthorityString(), "richpush", 0);
        MATCHER.addURI(getAuthorityString(), "richpush/*", 1);
        MATCHER.addURI(getAuthorityString(), "preferences", 2);
        MATCHER.addURI(getAuthorityString(), "preferences/*", 3);
    }

    public int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        uri = getDatabaseModel(uri);
        acontentvalues = ((DatabaseModel) (uri)).dataManager.bulkInsert(((DatabaseModel) (uri)).table, acontentvalues);
        String as[] = new String[acontentvalues.size()];
        for (int i = 0; i < as.length; i++)
        {
            as[i] = ((ContentValues)acontentvalues.get(i)).getAsString(((DatabaseModel) (uri)).notificationColumnId);
        }

        uri.notifyDatabaseChange(getContext(), as, "insert");
        return acontentvalues.size();
    }

    public int delete(Uri uri, String s, String as[])
    {
        DatabaseModel databasemodel = getDatabaseModel(uri);
        int i = databasemodel.dataManager.delete(databasemodel.table, s, as);
        databasemodel.notifyDatabaseChange(getContext(), getKeys(uri), "delete");
        return i;
    }

    public String getType(Uri uri)
    {
        switch (MATCHER.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Uri: ").append(uri).toString());

        case 0: // '\0'
            return "vnd.urbanairship.cursor.dir/richpush";

        case 1: // '\001'
            return "vnd.urbanairship.cursor.item/richpush";

        case 2: // '\002'
            return "vnd.urbanairship.cursor.dir/preference";

        case 3: // '\003'
            return "vnd.urbanairship.cursor.item/preference";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        DatabaseModel databasemodel = getDatabaseModel(uri);
        if (databasemodel.dataManager.insert(databasemodel.table, contentvalues) != -1L)
        {
            contentvalues = contentvalues.getAsString(databasemodel.notificationColumnId);
            databasemodel.notifyDatabaseChange(getContext(), new String[] {
                contentvalues
            }, "insert");
            return Uri.withAppendedPath(uri, contentvalues);
        } else
        {
            return null;
        }
    }

    public boolean onCreate()
    {
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        DatabaseModel databasemodel = getDatabaseModel(uri);
        as = databasemodel.dataManager.query(databasemodel.table, as, s, as1, s1);
        if (as != null)
        {
            as.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return as;
    }

    public void shutdown()
    {
        getRichPushModel().dataManager.close();
        getPreferencesModel().dataManager.close();
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        DatabaseModel databasemodel = getDatabaseModel(uri);
        int i = databasemodel.dataManager.update(databasemodel.table, contentvalues, s, as);
        if (i != -1)
        {
            databasemodel.notifyDatabaseChange(getContext(), getKeys(uri), "update");
        }
        return i;
    }

}
