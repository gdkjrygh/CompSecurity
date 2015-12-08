// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class nsv
{

    private static final String a = ntn.a(nsv);
    private static final String b[] = {
        "name"
    };

    public nsv()
    {
    }

    static void a(SQLiteDatabase sqlitedatabase)
    {
        int i;
        boolean flag;
        i = 0;
        flag = true;
_L4:
        Cursor cursor;
        int j;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i + 1;
        if (i >= 5)
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = sqlitedatabase.query("sqlite_master", b, "type='table'", null, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        flag = false;
_L1:
        String s2;
        boolean flag1;
        do
        {
            do
            {
                if (!cursor.moveToNext())
                {
                    break MISSING_BLOCK_LABEL_212;
                }
                s2 = cursor.getString(0);
            } while (s2.startsWith("android_"));
            flag1 = s2.startsWith("sqlite_");
        } while (flag1);
        String s;
        s = String.valueOf("DROP TABLE IF EXISTS ");
        String s3 = String.valueOf(s2);
        if (s3.length() == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s = s.concat(s3);
_L2:
        sqlitedatabase.execSQL(s);
        flag = true;
          goto _L1
        s = new String(s);
          goto _L2
        SQLException sqlexception;
        sqlexception;
        String s1 = a;
        String s4 = String.valueOf(sqlexception);
        ntn.b(s1, (new StringBuilder(String.valueOf(s2).length() + 22 + String.valueOf(s4).length())).append("unable to drop table ").append(s2).append(" ").append(s4).toString());
          goto _L1
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        cursor.close();
        i = j;
        continue; /* Loop/switch isn't completed */
        i = j;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("sqlite_master", b, "type='view'", null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        String s1 = cursor.getString(0);
        String s;
        String s2;
        s = String.valueOf("DROP VIEW IF EXISTS ");
        s2 = String.valueOf(s1);
        if (s2.length() == 0) goto _L6; else goto _L5
_L5:
        s = s.concat(s2);
_L7:
        sqlitedatabase.execSQL(s);
        continue; /* Loop/switch isn't completed */
        SQLException sqlexception;
        sqlexception;
        s = a;
        String s3 = String.valueOf(sqlexception);
        ntn.b(s, (new StringBuilder(String.valueOf(s1).length() + 21 + String.valueOf(s3).length())).append("unable to drop view ").append(s1).append(" ").append(s3).toString());
        continue; /* Loop/switch isn't completed */
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
_L6:
        s = new String(s);
        if (true) goto _L7; else goto _L4
_L4:
        cursor.close();
_L2:
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

}
