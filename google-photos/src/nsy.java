// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

public final class nsy extends SQLiteOpenHelper
{

    private static final String a = ntn.a(nsy);

    protected nsy(Context context, int i)
    {
        String s = String.valueOf("NotificationsDB");
        this(context, (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString());
    }

    private nsy(Context context, String s)
    {
        super(context, s, null, 15);
    }

    private static oyp a(Cursor cursor)
    {
        oyp oyp1;
        Object obj;
        Object obj1;
        ozd ozd1;
        byte abyte0[];
        obj = null;
        obj1 = cursor.getString(cursor.getColumnIndexOrThrow("default_destination"));
        oyp1 = ((oyp) (obj));
        if (obj1 != null)
        {
            oyp1 = ((oyp) (obj));
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                oyp1 = new oyp();
                obj = new oyr();
                obj.a = ((String) (obj1));
                oyp1.c = ((oyr) (obj));
            }
        }
        abyte0 = cursor.getBlob(cursor.getColumnIndexOrThrow("simple_collapsed_layout"));
        obj = oyp1;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        ozd1 = new ozd();
        obj1 = oyp1;
        qlw.a(ozd1, abyte0);
        obj = oyp1;
        if (oyp1 != null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj1 = oyp1;
        obj = new oyp();
        obj1 = obj;
        long l;
        try
        {
            obj.a = ozd1;
        }
        catch (qlv qlv1)
        {
            ntn.b(a, "Malformed SimpleCollapsedLayout.", qlv1);
            obj = obj1;
        }
        l = cursor.getLong(cursor.getColumnIndexOrThrow("creation_time"));
        cursor = ((Cursor) (obj));
        if (l != 0L)
        {
            cursor = ((Cursor) (obj));
            if (obj == null)
            {
                cursor = new oyp();
            }
            cursor.b = Long.valueOf(l);
        }
        return cursor;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        nsv.a(sqlitedatabase);
        nsv.b(sqlitedatabase);
        onCreate(sqlitedatabase);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE notifications(_id INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL, priority INT NOT NULL DEFAULT(0), read_state INT NOT NULL DEFAULT(0), sort_version INT NOT NULL DEFAULT(0), last_modified_version INT NOT NULL DEFAULT(0), system_tray_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0), sync_behavior INT NOT NULL DEFAULT(0), analytics_data BLOB, payload BLOB, collapsed_info BLOB, expanded_info BLOB, android_render_info BLOB );");
        sqlitedatabase.execSQL("CREATE TABLE user_data (_id INTEGER PRIMARY KEY, user_id TEXT, unread_count INT DEFAULT(0), unread_count_string STRING NOT NULL DEFAULT('0'), has_unread BOOLEAN DEFAULT(0), sync_version INT DEFAULT(0), viewed_sync_version INT DEFAULT(0), important_fetch_paging_token BLOB, low_fetch_paging_token BLOB, important_sync_token BLOB, low_sync_token BLOB, view_id TEXT );");
        sqlitedatabase.execSQL("CREATE TABLE statistics (_id INTEGER PRIMARY KEY, time INTEGER NOT NULL, log INTEGER NOT NULL, comment TEXT );");
    }

    public final void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i >= 7) goto _L2; else goto _L1
_L1:
        a(sqlitedatabase);
_L12:
        return;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        if (i < 8)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] {
                "notifications", "category", "TEXT"
            }));
            j = 8;
        } else
        {
            j = i;
        }
        i = j;
        if (j < 9)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] {
                "user_data", "viewed_sync_version", "INT DEFAULT(0)"
            }));
            i = 9;
        }
        j = i;
        if (i < 10)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS statistics");
            sqlitedatabase.execSQL("CREATE TABLE statistics (_id INTEGER PRIMARY KEY, time INTEGER NOT NULL, log INTEGER NOT NULL, comment TEXT );");
            j = 10;
        }
        i = j;
        if (j >= 11) goto _L4; else goto _L3
_L3:
        sqlitedatabase.execSQL("ALTER TABLE notifications ADD COLUMN collapsed_info BLOB");
        sqlitedatabase.execSQL("ALTER TABLE notifications ADD COLUMN android_render_info BLOB");
        obj1 = sqlitedatabase.query("notifications", new String[] {
            "_id", "default_destination", "category", "simple_collapsed_layout", "creation_time"
        }, null, null, null, null, null);
_L10:
        if (!((Cursor) (obj1)).moveToNext()) goto _L6; else goto _L5
_L5:
        obj2 = a(((Cursor) (obj1)));
        obj3 = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("category"));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_830;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj3))))
        {
            break MISSING_BLOCK_LABEL_830;
        }
        obj = new oym();
        obj.a = ((String) (obj3));
_L13:
        obj3 = new ContentValues();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        ((ContentValues) (obj3)).put("collapsed_info", qlw.a(((qlw) (obj2))));
        if (obj == null) goto _L8; else goto _L7
_L7:
        ((ContentValues) (obj3)).put("android_render_info", qlw.a(((qlw) (obj))));
_L8:
        if (((ContentValues) (obj3)).size() == 0) goto _L10; else goto _L9
_L9:
        i = ((Cursor) (obj1)).getColumnIndex("_id");
        if (i < 0) goto _L10; else goto _L11
_L11:
        sqlitedatabase.update("notifications", ((ContentValues) (obj3)), "_id = ?", new String[] {
            String.valueOf(((Cursor) (obj1)).getInt(i))
        });
          goto _L10
        sqlitedatabase;
        ((Cursor) (obj1)).close();
        throw sqlitedatabase;
_L6:
        ((Cursor) (obj1)).close();
        obj = String.valueOf("ALTER TABLE notifications RENAME TO ");
        obj1 = String.valueOf("tmp_notifications");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        sqlitedatabase.execSQL(((String) (obj)));
        sqlitedatabase.execSQL("CREATE TABLE notifications(_id  INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL, priority INT NOT NULL DEFAULT(0), read_state INT NOT NULL DEFAULT(0), sort_version INT NOT NULL DEFAULT(0), last_modified_version INT NOT NULL DEFAULT(0), push_enabled INT NOT NULL DEFAULT(0), payload BLOB, collapsed_info BLOB, expanded_info BLOB, android_render_info BLOB );");
        obj2 = new StringBuilder();
        for (i = 0; i < 11; i++)
        {
            ((StringBuilder) (obj2)).append((new String[] {
                "_id", "key", "priority", "read_state", "sort_version", "last_modified_version", "push_enabled", "payload", "collapsed_info", "expanded_info", 
                "android_render_info"
            })[i]);
            if (i != 10)
            {
                ((StringBuilder) (obj2)).append(",");
            }
        }

        obj = String.valueOf("INSERT INTO notifications(");
        obj1 = String.valueOf(((StringBuilder) (obj2)).toString());
        obj2 = String.valueOf(((StringBuilder) (obj2)).toString());
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(obj1).length() + String.valueOf(obj2).length() + String.valueOf("tmp_notifications").length())).append(((String) (obj))).append(((String) (obj1))).append(") SELECT ").append(((String) (obj2))).append(" FROM ").append("tmp_notifications").toString());
        obj = String.valueOf("tmp_notifications");
        if (((String) (obj)).length() != 0)
        {
            obj = "DROP TABLE IF EXISTS ".concat(((String) (obj)));
        } else
        {
            obj = new String("DROP TABLE IF EXISTS ");
        }
        sqlitedatabase.execSQL(((String) (obj)));
        i = 11;
_L4:
        j = i;
        if (i < 12)
        {
            sqlitedatabase.delete("notifications", "key = ?", new String[] {
                ""
            });
            j = 12;
        }
        i = j;
        if (j < 13)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] {
                "notifications", "sync_behavior", "INT NOT NULL DEFAULT(0)"
            }));
            i = 13;
        }
        j = i;
        if (i < 14)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] {
                "notifications", "analytics_data", "BLOB"
            }));
            j = 14;
        }
        if (j < 15)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", new Object[] {
                "notifications", "system_tray_version", "INT NOT NULL DEFAULT(0)"
            }));
            return;
        }
          goto _L12
        obj = null;
          goto _L13
    }

}
