// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import kik.a.d.g;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.l:
//            v, x

public final class w
{

    private static final b a = org.c.c.a("ConversationStatusStorage");
    private final SQLiteOpenHelper b;
    private final int c = 19;

    public w(SQLiteOpenHelper sqliteopenhelper)
    {
        b = sqliteopenhelper;
    }

    public final Hashtable a()
    {
        Hashtable hashtable = new Hashtable();
        synchronized (b)
        {
            ((v)v.a(b.getWritableDatabase(), com/kik/l/v, "KIKConversationStatusTable")).a(new x(this, hashtable));
        }
        return hashtable;
        exception;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(String s)
    {
        boolean flag1 = true;
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        boolean flag;
        flag = flag1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        sqlitedatabase.delete("KIKConversationStatusTable", "jid = ?", new String[] {
            s
        });
        flag = flag1;
_L1:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        s;
        (new StringBuilder("deleteConversationStatus failed: ")).append(s.getMessage());
        flag = false;
          goto _L1
        s;
        throw s;
        s;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean a(ArrayList arraylist)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        arraylist = arraylist.iterator();
_L4:
        if (!arraylist.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        Object obj;
        obj = (g)arraylist.next();
        s = ((g) (obj)).a();
        if (s == null) goto _L4; else goto _L3
_L3:
        obj = v.a(((g) (obj)));
        if (sqlitedatabase.update("KIKConversationStatusTable", ((android.content.ContentValues) (obj)), (new StringBuilder("jid ='")).append(s).append("'").toString(), null) == 0)
        {
            sqlitedatabase.insert("KIKConversationStatusTable", null, ((android.content.ContentValues) (obj)));
        }
          goto _L4
        arraylist;
        (new StringBuilder("Kikconvostatus update failed:")).append(arraylist.getMessage());
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
        arraylist;
        sqlitedatabase.endTransaction();
        throw arraylist;
        arraylist;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw arraylist;
    }

    public final boolean a(g g1)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        boolean flag = true;
        String s;
        sqlitedatabase.beginTransaction();
        s = g1.a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        g1 = v.a(g1);
        if (sqlitedatabase.update("KIKConversationStatusTable", g1, (new StringBuilder("jid ='")).append(s).append("'").toString(), null) == 0)
        {
            sqlitedatabase.insert("KIKConversationStatusTable", null, g1);
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L1:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        g1;
        (new StringBuilder("Kikconvostatus update failed:")).append(g1.getMessage());
        flag = false;
        sqlitedatabase.endTransaction();
          goto _L1
        g1;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw g1;
        g1;
        sqlitedatabase.endTransaction();
        throw g1;
    }

}
