// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.y.j;
import java.io.ByteArrayInputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            ae, q, d, s

final class c
    implements Runnable
{

    private final b a;
    private final String b;
    private boolean c;
    private ae d;

    public final void run()
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj2 = null;
        Thread.currentThread().getName();
        obj = obj3;
        Object obj1 = ae.a(d);
        obj = obj3;
        Object obj4 = b;
        obj = obj3;
        long l = q.a;
        if (obj4 == null) goto _L2; else goto _L1
_L1:
        obj = obj3;
        if (((String) (obj4)).length() >= 5) goto _L2; else goto _L3
_L3:
        obj = obj3;
        throw new IllegalArgumentException("persistentKey");
        obj;
        obj1 = obj2;
        obj2 = obj;
_L15:
        obj = obj1;
        com.google.android.m4b.maps.bv.d.a("PM failed to load config", ((Throwable) (obj2)));
        obj = ae.b(d);
        if (b != null && b.equals(obj))
        {
            obj1.p = c;
            a.a(false, ((q) (obj1)));
        }
        ae.a(d, b);
        return;
_L2:
        if (l >= 1L) goto _L5; else goto _L4
_L4:
        obj = obj3;
        throw new IllegalArgumentException("shelfLife");
        obj;
        obj = null;
_L13:
        obj1 = obj;
        com.google.android.m4b.maps.bv.d.b("PM was interrupted loading config");
        obj1 = obj;
        Thread.currentThread().interrupt();
        obj = ae.b(d);
        if (b != null && b.equals(obj))
        {
            boolean flag = c;
            a.a(true, null);
        }
        ae.a(d, b);
        return;
_L5:
        obj = obj3;
        if (((s) (obj1)).a == null || obj4 == null) goto _L7; else goto _L6
_L6:
        obj = obj3;
        obj1 = ((s) (obj1)).b(((String) (obj4)), l);
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        obj = obj3;
        obj4 = new ByteArrayInputStream(((byte []) (obj1)));
        obj = q.a(((java.io.InputStream) (obj4)));
        obj1 = obj;
        s.a(((java.io.Closeable) (obj4)));
        obj1 = ae.b(d);
        if (b != null && b.equals(obj1))
        {
            obj.p = c;
            a.a(false, ((q) (obj)));
        }
        ae.a(d, b);
        return;
_L9:
        obj = obj3;
        if (!Thread.interrupted()) goto _L11; else goto _L10
_L10:
        obj = obj3;
        throw new InterruptedException("read");
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
_L12:
        exception1 = ((Exception) (ae.b(d)));
        if (b != null && b.equals(exception1))
        {
            obj1.p = c;
            a.a(false, ((q) (obj1)));
        }
        ae.a(d, b);
        throw obj;
_L11:
        obj1 = null;
          goto _L8
_L7:
        obj1 = null;
          goto _L8
        Exception exception;
        exception;
        obj = obj3;
        s.a(((java.io.Closeable) (obj4)));
        obj = obj3;
        throw exception;
        obj;
          goto _L12
        exception;
          goto _L13
        exception1;
        exception = ((Exception) (obj));
        if (true) goto _L15; else goto _L14
_L14:
    }

    public (ae ae1,  , String s1, boolean flag)
    {
        d = ae1;
        super();
        a = ;
        b = s1;
        j.a(s1, "persistentKey");
        c = flag;
    }
}
