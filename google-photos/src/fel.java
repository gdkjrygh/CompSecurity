// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class fel
    implements android.os.Handler.Callback
{

    private final SQLiteOpenHelper a;
    private final int b;
    private final List c;
    private final String d;
    private SQLiteStatement e;

    fel(SQLiteOpenHelper sqliteopenhelper, int i)
    {
        String s;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Batch update size must be > 0");
        a = sqliteopenhelper;
        b = i;
        c = new ArrayList(i);
        sqliteopenhelper = String.valueOf("UPDATE journal SET last_modified_time = ? WHERE ");
        s = String.valueOf(b.b("key", i));
        if (s.length() != 0)
        {
            sqliteopenhelper = sqliteopenhelper.concat(s);
        } else
        {
            sqliteopenhelper = new String(sqliteopenhelper);
        }
        d = sqliteopenhelper;
    }

    public final boolean handleMessage(Message message)
    {
        SQLiteStatement sqlitestatement;
        long l1;
        long l2;
        int i = 0;
        if (message.what != 1)
        {
            return false;
        }
        message = (String)message.obj;
        if (!c.contains(message))
        {
            c.add(message);
        }
        if (c.size() != b)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        l1 = System.currentTimeMillis();
        message = a.getWritableDatabase();
        if (e == null)
        {
            e = a.getWritableDatabase().compileStatement(d);
        }
        sqlitestatement = e;
        l2 = System.currentTimeMillis();
        sqlitestatement.bindLong(1, l2);
        for (int l = c.size(); i < l; i++)
        {
            sqlitestatement.bindString(i + 2, (String)c.get(i));
        }

        message.beginTransactionNonExclusive();
        int j = sqlitestatement.executeUpdateDelete();
        if (j != b && fek.b())
        {
            HashSet hashset = new HashSet(c);
            String s = String.valueOf("Failed to update modified time for all rows, time: ");
            int i1 = b;
            int j1 = hashset.size();
            (new StringBuilder(String.valueOf(s).length() + 100)).append(s).append(l2).append(", expected: ").append(i1).append(", actually updated: ").append(j).append(", unique keys: ").append(j1);
        }
        message.setTransactionSuccessful();
        message.endTransaction();
        if (fek.c())
        {
            int k = c.size();
            long l3 = System.currentTimeMillis();
            (new StringBuilder(71)).append("Completed update times with ").append(k).append(" updates in ").append(l3 - l1);
        }
        c.clear();
        return true;
        Exception exception;
        exception;
        message.endTransaction();
        throw exception;
    }
}
