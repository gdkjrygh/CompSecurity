// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.j;
import b.a.a.a.d;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.a.a.c:
//            x, U

final class z
    implements Callable
{

    final Map a;
    final x b;

    z(x x1, Map map)
    {
        b = x1;
        a = map;
        super();
    }

    private Void a()
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        String s = x.c(b);
        obj2 = new U(com.a.a.c.x.d(b));
        obj1 = a;
        obj2 = ((U) (obj2)).c(s);
        String s1;
        s1 = U.a(((Map) (obj1)));
        obj1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((java.io.File) (obj2))), U.a));
        obj = obj1;
        ((Writer) (obj1)).write(s1);
        obj = obj1;
        ((Writer) (obj1)).flush();
        j.a(((java.io.Closeable) (obj1)));
        return null;
        obj;
        obj1 = null;
_L4:
        obj = obj1;
        d.a();
        j.a(((java.io.Closeable) (obj1)));
        return null;
        Exception exception1;
        exception1;
_L2:
        j.a(((java.io.Closeable) (obj)));
        throw exception1;
        exception1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Object call()
        throws Exception
    {
        return a();
    }
}
