// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.provider;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.phunware.nbc.sochi.caption.provider:
//            ClosedCaptioningStylesContract

public class ClosedCaptioningStylesProvider extends ContentProvider
{
    static class ProviderDatabaseHelper extends SQLiteOpenHelper
    {

        private static final String DATABASE_NAME = "Styles.db";
        private static final int DATABASE_VERSION = 1;
        private final Context mContext;

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            ClosedCaptioningStylesProvider.mIsTelemundo = "nbclive".equals("telemundo");
            NBCSystem.debugLog(com/phunware/nbc/sochi/caption/provider/ClosedCaptioningStylesProvider.getSimpleName(), "Creating the Styles table");
            StringBuilder stringbuilder = (new StringBuilder()).append("CREATE TABLE Styles (_id INTEGER PRIMARY KEY AUTOINCREMENT,title TEXT, font TEXT default '");
            String s;
            if (ClosedCaptioningStylesProvider.mIsTelemundo)
            {
                s = "Predeterminada";
            } else
            {
                s = "Default";
            }
            stringbuilder = stringbuilder.append(s).append("', ").append("text_size").append(" INTEGER default ").append(1).append(", ").append("text_color").append(" TEXT default ").append("White").append(", ").append("background_color").append(" TEXT default ").append("Black").append(", ").append("background_opacity").append(" INTEGER default ").append(50).append(", ").append("text_opacity").append(" INTEGER default ").append(100).append(", ").append("text_edge").append(" TEXT default '");
            if (ClosedCaptioningStylesProvider.mIsTelemundo)
            {
                s = "Predeterminado";
            } else
            {
                s = "Default";
            }
            sqlitedatabase.execSQL(stringbuilder.append(s).append("', ").append("text_esp_color").append(" TEXT default Blanco").append(", ").append("background_esp_color").append(" TEXT default Negro").append("").append(");").toString());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            Log.w(com/phunware/nbc/sochi/caption/provider/ClosedCaptioningStylesProvider.getSimpleName(), (new StringBuilder()).append("Upgrading database from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
            onCreate(sqlitedatabase);
        }

        ProviderDatabaseHelper(Context context)
        {
            super(context, "Styles.db", null, 1);
            mContext = context;
        }
    }


    private static final int BUNDLED_STYLE_DEFAULT = -1;
    private static final int BUNDLED_STYLE_LARGE_TEXT = 0;
    private static final int STYLES = 1;
    private static final int STYLES_ID = 2;
    private static final String TAG = "ClosedCaptioningStylesProvider";
    private static boolean mIsTelemundo = "nbclive".equals("telemundo");
    private static final UriMatcher uriMatcher = buildUriMatcher();
    private ProviderDatabaseHelper databaseHelper;
    private volatile boolean mNotificationsSuspended;
    private final LinkedList mSuspendedNotifications = new LinkedList();
    private final Set mSuspendedNotificationsSet = new HashSet();

    public ClosedCaptioningStylesProvider()
    {
    }

    private MatrixCursor buildBundledStyle(long l, MatrixCursor matrixcursor)
    {
        MatrixCursor matrixcursor1 = matrixcursor;
        if (matrixcursor == null)
        {
            matrixcursor1 = new MatrixCursor(new String[] {
                "_id", "title", "font", "text_size", "text_color", "background_color", "background_opacity", "text_opacity", "text_edge", "text_esp_color", 
                "background_esp_color"
            });
        }
        if (l == -1L)
        {
            if (mIsTelemundo)
            {
                matrixcursor = "Predeterminado";
            } else
            {
                matrixcursor = "Default";
            }
            matrixcursor1.addRow(new Object[] {
                Integer.valueOf(-1), matrixcursor, "Default", Integer.valueOf(1), "White", "Black", Integer.valueOf(50), Integer.valueOf(100), "Default", "White", 
                "Black"
            });
        } else
        if (l == 0L)
        {
            if (mIsTelemundo)
            {
                matrixcursor = "Texto Grande";
            } else
            {
                matrixcursor = "Large Text";
            }
            matrixcursor1.addRow(new Object[] {
                Long.valueOf(0L), matrixcursor, "Default", Integer.valueOf(2), "White", "Black", Integer.valueOf(50), Integer.valueOf(100), "Default", "White", 
                "Black"
            });
            return matrixcursor1;
        }
        return matrixcursor1;
    }

    private static UriMatcher buildUriMatcher()
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        urimatcher.addURI(ClosedCaptioningStylesContract.AUTHORITY, "Styles", 1);
        urimatcher.addURI(ClosedCaptioningStylesContract.AUTHORITY, "Styles/*", 2);
        return urimatcher;
    }

    private Uri insertStyles(Uri uri, ContentValues contentvalues)
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        sqlitedatabase.update("Styles", contentvalues, "title=?", new String[] {
            contentvalues.getAsString("title")
        });
        long l = sqlitedatabase.insertWithOnConflict("Styles", "title", contentvalues, 4);
        if (l > 0L)
        {
            contentvalues = ContentUris.withAppendedId(ClosedCaptioningStylesContract.Styles.CONTENT_ID_URI_BASE, l);
            notifyChange(uri);
            return contentvalues;
        } else
        {
            return uri;
        }
    }

    private Cursor queryStyles(Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder;
        boolean flag;
        sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("Styles");
        HashMap hashmap = new HashMap();
        hashmap.put("_id", "_id");
        hashmap.put("title", "title");
        hashmap.put("font", "font");
        hashmap.put("text_size", "text_size");
        hashmap.put("text_color", "text_color");
        hashmap.put("background_color", "background_color");
        hashmap.put("background_opacity", "background_opacity");
        hashmap.put("text_opacity", "text_opacity");
        hashmap.put("text_edge", "text_edge");
        hashmap.put("text_esp_color", "text_esp_color");
        hashmap.put("background_esp_color", "background_esp_color");
        sqlitequerybuilder.setProjectionMap(hashmap);
        flag = false;
        uriMatcher.match(uri);
        JVM INSTR tableswitch 1 2: default 176
    //                   1 270
    //                   2 276;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_276;
_L4:
        if (TextUtils.isEmpty(s1))
        {
            s1 = "_id asc";
        }
        as = sqlitequerybuilder.query(databaseHelper.getReadableDatabase(), as, s, as1, null, null, s1);
        if (flag)
        {
            mIsTelemundo = "nbclive".equals("telemundo");
            as = new MergeCursor(new Cursor[] {
                buildBundledStyle(0L, buildBundledStyle(-1L, null)), as
            });
            as.setNotificationUri(getContext().getContentResolver(), uri);
            return as;
        } else
        {
            as.setNotificationUri(getContext().getContentResolver(), uri);
            return as;
        }
_L2:
        flag = true;
          goto _L4
        if (ContentUris.parseId(uri) == 0L || ContentUris.parseId(uri) == -1L)
        {
            as = buildBundledStyle(ContentUris.parseId(uri), null);
            as.setNotificationUri(getContext().getContentResolver(), uri);
            return as;
        }
        sqlitequerybuilder.appendWhere((new StringBuilder()).append("_id=").append((String)uri.getPathSegments().get(1)).toString());
          goto _L4
    }

    private int updateStyles(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        uriMatcher.match(uri);
        JVM INSTR tableswitch 1 2: default 40
    //                   1 68
    //                   2 89;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());
_L2:
        int i = sqlitedatabase.update("Styles", contentvalues, s, as);
_L5:
        notifyChange(uri);
        return i;
_L3:
        NBCSystem.debugLog("ClosedCaptioningStylesProvider", (new StringBuilder()).append("updateStyles ").append(uri.toString()).toString());
        String s2 = (new StringBuilder()).append("_id = ").append((String)uri.getPathSegments().get(1)).toString();
        String s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s2).append(" AND ").append(s).toString();
        }
        i = sqlitedatabase.update("Styles", contentvalues, s1, as);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public ContentProviderResult[] applyBatch(ArrayList arraylist)
        throws OperationApplicationException
    {
        setNotificationsSuspended(true);
        databaseHelper.getWritableDatabase().beginTransaction();
        arraylist = super.applyBatch(arraylist);
        databaseHelper.getWritableDatabase().setTransactionSuccessful();
        databaseHelper.getWritableDatabase().endTransaction();
        setNotificationsSuspended(false);
        return arraylist;
        arraylist;
        databaseHelper.getWritableDatabase().endTransaction();
        throw arraylist;
    }

    public int delete(Uri uri, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        int i;
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 1: // '\001'
            i = sqlitedatabase.delete("Styles", s, as);
            break;
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
    }

    public String getType(Uri uri)
    {
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 1: // '\001'
            return "vnd.android.cursor.dir/vnd.npike.styles";

        case 2: // '\002'
            return "vnd.android.cursor.item/vnd.npike.styles";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 1: // '\001'
            return insertStyles(uri, contentvalues);
        }
    }

    protected void notifyChange(Uri uri)
    {
        if (mNotificationsSuspended)
        {
            synchronized (mSuspendedNotificationsSet)
            {
                if (mSuspendedNotificationsSet.contains(uri))
                {
                    mSuspendedNotifications.remove(uri);
                }
                mSuspendedNotifications.add(uri);
                mSuspendedNotificationsSet.add(uri);
            }
            return;
        } else
        {
            getContext().getContentResolver().notifyChange(uri, null);
            return;
        }
        uri;
        set;
        JVM INSTR monitorexit ;
        throw uri;
    }

    protected void notifyOutstandingChanges()
    {
        do
        {
            Uri uri = (Uri)mSuspendedNotifications.poll();
            if (uri != null)
            {
                getContext().getContentResolver().notifyChange(uri, null);
                mSuspendedNotificationsSet.remove(uri);
            } else
            {
                return;
            }
        } while (true);
    }

    public boolean onCreate()
    {
        databaseHelper = new ProviderDatabaseHelper(getContext());
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 1: // '\001'
        case 2: // '\002'
            return queryStyles(uri, as, s, as1, s1);
        }
    }

    protected void setNotificationsSuspended(boolean flag)
    {
        mNotificationsSuspended = flag;
        if (!flag)
        {
            notifyOutstandingChanges();
        }
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        switch (uriMatcher.match(uri))
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
            return updateStyles(uri, contentvalues, s, as);
        }
    }




/*
    static boolean access$002(boolean flag)
    {
        mIsTelemundo = flag;
        return flag;
    }

*/
}
