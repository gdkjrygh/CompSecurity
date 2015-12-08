// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.h;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.c.a.d.h;
import java.io.File;
import java.io.IOException;
import kik.android.util.bx;

public abstract class i extends SQLiteOpenHelper
{

    private static final String a = kik/android/h/i.getSimpleName();
    private int b;
    private final int c;
    private final File d;

    i(Context context, String s, int j)
    {
        super(context, s, null, j);
        c = j;
        d = context.getDatabasePath(s);
        context = a(context, s);
        if (context == null) goto _L2; else goto _L1
_L1:
        context.beginTransaction();
        b = context.getVersion();
        if (b != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        onCreate(context);
_L3:
        context.setVersion(j);
        context.setTransactionSuccessful();
        context.endTransaction();
        context.close();
_L2:
        return;
        a(context, b, j);
          goto _L3
        s;
        context.endTransaction();
        context.close();
        throw s;
    }

    public i(Context context, String s, int j, String s1)
    {
        this(context, a(context, s, s1), j);
    }

    private static SQLiteDatabase a(Context context, String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = context.openOrCreateDatabase(s, 0, null);
        }
        catch (SQLiteException sqliteexception)
        {
            return SQLiteDatabase.openDatabase(context.getDatabasePath(s).getPath(), null, 1);
        }
        return sqlitedatabase;
    }

    private static String a(Context context, String s, String s1)
    {
        File file;
        if (context == null || s != null && s.contains(s1))
        {
            return s;
        }
        s1 = (new StringBuilder()).append(s1).append(".").append(s).toString();
        file = context.getDatabasePath(s);
        a(context.getDatabasePath(s).getAbsolutePath());
        context = context.getDatabasePath(s1);
        if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
        return s1;
_L2:
        h.a(file, context);
          goto _L1
        s;
_L3:
        bx.a(new Exception((new StringBuilder("File migration failed for ")).append(context.getName()).toString()));
          goto _L1
        s;
          goto _L3
        s;
          goto _L3
    }

    protected static void a(Cursor cursor, SQLiteDatabase sqlitedatabase, String s, String s1)
    {
        if (cursor.getColumnIndex(s1) == -1)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s VARCHAR", new Object[] {
                s, s1
            }));
        }
    }

    protected static void a(Cursor cursor, SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
    {
        if (cursor.getColumnIndex(s1) == -1)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s BOOLEAN DEFAULT %s", new Object[] {
                s, s1, s2
            }));
        }
    }

    private static void a(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            (new File((new StringBuilder()).append(s).append("-journal").toString())).delete();
            return;
        }
    }

    protected static void b(Cursor cursor, SQLiteDatabase sqlitedatabase, String s, String s1)
    {
        if (cursor.getColumnIndex(s1) == -1)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s BLOB", new Object[] {
                s, s1
            }));
        }
    }

    protected static void b(Cursor cursor, SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
    {
        if (cursor.getColumnIndex(s1) == -1)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INT DEFAULT %s", new Object[] {
                s, s1, s2
            }));
        }
    }

    protected static void c(Cursor cursor, SQLiteDatabase sqlitedatabase, String s, String s1)
    {
        if (cursor.getColumnIndex(s1) == -1)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s LONG", new Object[] {
                s, s1
            }));
        }
    }

    public final void a()
    {
        if (d != null)
        {
            a(d.getAbsolutePath());
            d.delete();
        }
    }

    public abstract void a(SQLiteDatabase sqlitedatabase, int j, int k);

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

}
