// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.Vector;
import kik.a.d.i;
import org.c.b;
import org.c.c;

public final class w
{

    private static final b a = c.a("ItemStorage");
    private SQLiteOpenHelper b;

    public w(SQLiteOpenHelper sqliteopenhelper)
    {
        b = sqliteopenhelper;
    }

    public final i a(String s)
    {
        i j;
        Object obj1;
        obj1 = null;
        j = null;
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        Object obj = b.getWritableDatabase();
        s = ((SQLiteDatabase) (obj)).query("KIKItemsTable", null, "item_sku=?", new String[] {
            s
        }, null, null, null, null);
        obj = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = s;
        j = new i(s.getString(s.getColumnIndex("item_sku")), s.getString(s.getColumnIndex("formatted_price")));
        obj = j;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        s.close();
        obj = j;
_L2:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return ((i) (obj));
        Exception exception;
        exception;
        s = null;
_L5:
        obj = s;
        (new StringBuilder("Error in getting item:")).append(exception.getMessage());
        obj = obj1;
        if (s == null) goto _L2; else goto _L1
_L1:
        s.close();
        obj = obj1;
          goto _L2
        s;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        ((Cursor) (obj)).close();
        throw s;
        s;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
          goto _L5
    }

    public final boolean a(Vector vector)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        vector = vector.iterator();
_L4:
        if (!vector.hasNext()) goto _L2; else goto _L1
_L1:
        i j;
        String s;
        j = (i)vector.next();
        s = j.a();
        if (s == null) goto _L4; else goto _L3
_L3:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("item_sku", j.a());
        contentvalues.put("formatted_price", j.b());
        if (sqlitedatabase.update("KIKItemsTable", contentvalues, (new StringBuilder("item_sku ='")).append(s).append("'").toString(), null) == 0)
        {
            sqlitedatabase.insert("KIKItemsTable", null, contentvalues);
        }
          goto _L4
        vector;
        (new StringBuilder("Item update failed:")).append(vector.getMessage());
        boolean flag = false;
        sqlitedatabase.endTransaction();
_L5:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        flag = true;
          goto _L5
        vector;
        sqlitedatabase.endTransaction();
        throw vector;
        vector;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw vector;
    }

    public final boolean a(i j)
    {
        boolean flag;
        synchronized (b)
        {
            Vector vector = new Vector();
            vector.add(j);
            flag = a(vector);
        }
        return flag;
        j;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw j;
    }

}
