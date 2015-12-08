// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database;

import Bt;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.table.DbTable;
import com.snapchat.android.database.vtable.DbVirtualTable;
import com.snapchat.android.model.SharedPreferenceGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.database:
//            SharedPreferenceKey

public final class DatabaseHelper extends SQLiteOpenHelper
{
    public static final class TableType extends Enum
    {

        private static final TableType $VALUES[];
        public static final TableType TABLE;
        public static final TableType VIEW;
        private final String a;

        public static TableType valueOf(String s)
        {
            return (TableType)Enum.valueOf(com/snapchat/android/database/DatabaseHelper$TableType, s);
        }

        public static TableType[] values()
        {
            return (TableType[])$VALUES.clone();
        }

        public final String getType()
        {
            return a;
        }

        static 
        {
            TABLE = new TableType("TABLE", 0, "table");
            VIEW = new TableType("VIEW", 1, "view");
            $VALUES = (new TableType[] {
                TABLE, VIEW
            });
        }

        private TableType(String s, int i, String s1)
        {
            super(s, i);
            a = s1;
        }
    }


    private static DatabaseHelper a;

    private DatabaseHelper(Context context)
    {
        this(context, "tcspahn.db");
    }

    private DatabaseHelper(Context context, String s)
    {
        super(context, s, null, 244);
    }

    public static DatabaseHelper a(Context context)
    {
        com/snapchat/android/database/DatabaseHelper;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            Bt.a();
            a = new DatabaseHelper(context);
        }
        context = a;
        com/snapchat/android/database/DatabaseHelper;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        a(sqlitedatabase, TableType.TABLE);
        a(sqlitedatabase, TableType.VIEW);
        onCreate(sqlitedatabase);
        Bt.aP();
        Bt.y(null);
    }

    private static void a(SQLiteDatabase sqlitedatabase, TableType tabletype)
    {
        Object obj = new ArrayList();
        Object obj1 = tabletype.getType();
        obj1 = sqlitedatabase.query("sqlite_master", new String[] {
            "name"
        }, "type=? AND name NOT LIKE ? AND name NOT LIKE ?", new String[] {
            obj1, "sqlite_%", "android_metadata"
        }, null, null, null);
        if (obj1 != null && ((Cursor) (obj1)).moveToFirst())
        {
            do
            {
                String s1 = ((Cursor) (obj1)).getString(0);
                if (!TextUtils.isEmpty(s1))
                {
                    ((ArrayList) (obj)).add(s1);
                }
            } while (((Cursor) (obj1)).moveToNext());
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if (tabletype == TableType.TABLE)
            {
                DbTable.a(sqlitedatabase, s);
            } else
            if (tabletype == TableType.VIEW)
            {
                Timber.c("DbVirtualTable", (new StringBuilder("Drop virtual table ")).append(s).toString(), new Object[0]);
                sqlitedatabase.execSQL((new StringBuilder("DROP VIEW IF EXISTS ")).append(s).toString());
            }
        } while (true);
    }

    public final void close()
    {
        super.close();
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        int i = 0;
        Timber.c("DatabaseHelper", "Creating Database", new Object[0]);
        com.snapchat.android.database.table.DbTable.DatabaseTable adatabasetable[] = com.snapchat.android.database.table.DbTable.DatabaseTable.values();
        for (int j = adatabasetable.length; i < j; i++)
        {
            DbTable dbtable = adatabasetable[i].getTable();
            sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(dbtable.c()).append(" (").append(dbtable.d()).append(");").toString());
        }

        DbVirtualTable.a(sqlitedatabase);
    }

    public final void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Timber.d("DatabaseHelper", "Downgrading database from version %d to %d, which will destroy all old data", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Timber.d("DatabaseHelper", "Upgrading database from version %d to %d, which will destroy all old data", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        if (i < 223)
        {
            SharedPreferenceGroup.migrateAcrossGroups();
        }
        if (i < 231)
        {
            SharedPreferenceKey.IDENTITY_FRIENDS_SYNC_TOKEN.putString(null);
        }
        if (i < 238)
        {
            SharedPreferenceKey.HAS_ACCEPTED_TOU_9_14.putBoolean(false);
        }
        a(sqlitedatabase);
    }
}
