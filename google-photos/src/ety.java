// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ety
{

    private static final String a[] = {
        "value"
    };
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(2)
    })));

    public static int a(SQLiteDatabase sqlitedatabase, etz etz1)
    {
        int i;
        sqlitedatabase = c(sqlitedatabase, etz1);
        i = 0;
        if (sqlitedatabase.moveToFirst())
        {
            i = sqlitedatabase.getInt(sqlitedatabase.getColumnIndexOrThrow("value"));
        }
        sqlitedatabase.close();
        return i;
        etz1;
        sqlitedatabase.close();
        throw etz1;
    }

    static String a()
    {
        return "CREATE TABLE metadata_sync (key INTEGER PRIMARY KEY, value BLOB);";
    }

    public static void a(SQLiteDatabase sqlitedatabase, etz etz1, int i)
    {
        a(sqlitedatabase, etz1, ((euc) (new eua(etz1, 1))), "UPDATE metadata_sync SET value = ? WHERE key = ?");
    }

    private static void a(SQLiteDatabase sqlitedatabase, etz etz1, euc euc1, String s)
    {
        sqlitedatabase.beginTransactionNonExclusive();
        s = sqlitedatabase.compileStatement(s);
        euc1.a(s, 1);
        s.bindString(2, Integer.toString(etz1.f));
        if (s.executeUpdateDelete() == 0)
        {
            sqlitedatabase.insert("metadata_sync", null, euc1.a());
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        etz1;
        sqlitedatabase.endTransaction();
        throw etz1;
    }

    public static void a(SQLiteDatabase sqlitedatabase, etz etz1, String s)
    {
        a(sqlitedatabase, etz1, ((euc) (new eub(etz1, s))), "UPDATE metadata_sync SET value = ? WHERE key = ?");
    }

    public static String b(SQLiteDatabase sqlitedatabase, etz etz1)
    {
        etz1 = c(sqlitedatabase, etz1);
        sqlitedatabase = null;
        if (etz1.moveToFirst())
        {
            sqlitedatabase = etz1.getString(etz1.getColumnIndexOrThrow("value"));
        }
        etz1.close();
        return sqlitedatabase;
        sqlitedatabase;
        etz1.close();
        throw sqlitedatabase;
    }

    static Set b()
    {
        return b;
    }

    private static Cursor c(SQLiteDatabase sqlitedatabase, etz etz1)
    {
        return sqlitedatabase.query("metadata_sync", a, "key = ?", new String[] {
            Integer.toString(etz1.f)
        }, null, null, null);
    }

}
