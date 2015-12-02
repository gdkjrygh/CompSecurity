// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.google.common.a.es;
import com.google.common.base.Supplier;
import java.util.Iterator;

// Referenced classes of package com.facebook.d.d:
//            c

public class a
    implements Supplier
{

    private static final Class a = com/facebook/d/d/a;
    private static final l b = new l();
    private final Context c;
    private final com.facebook.common.executors.a d;
    private final com.facebook.d.b.a e;
    private final es f;
    private final String g;
    private final es h;
    private SQLiteDatabase i;

    protected a(Context context, com.facebook.common.executors.a a1, com.facebook.d.b.a a2, es es1, String s, es es2)
    {
        c = context;
        d = a1;
        e = a2;
        f = es1;
        g = s;
        h = es2;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        d.b();
        obj = i;
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e.b(getClass());
        obj = com.facebook.debug.d.e.a("ensureDatabase");
        com.facebook.debug.log.b.b(a, "Initializing database %s", new Object[] {
            g
        });
        String s;
        for (Iterator iterator = h.iterator(); iterator.hasNext(); c.deleteDatabase(s))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_111;
        Object obj1;
        obj1;
        ((e) (obj)).a();
        throw obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        i = c();
_L4:
        ((e) (obj)).a();
        if (true) goto _L1; else goto _L3
_L3:
        obj1;
        com.facebook.debug.log.b.a(b, a, "Possible database corruption", ((Throwable) (obj1)));
        c.deleteDatabase(g);
        i = c();
          goto _L4
    }

    private SQLiteDatabase c()
    {
        return (new c(c, g, f, a(), f())).getWritableDatabase();
    }

    protected int a()
    {
        return 51200;
    }

    public SQLiteDatabase e()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        b();
        sqlitedatabase = i;
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    protected int f()
    {
        return -1;
    }

    public Object get()
    {
        return e();
    }

}
