// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.http.annotations.SslSocketFactory;
import com.facebook.http.c.e;
import com.facebook.http.c.g;
import com.facebook.inject.d;
import org.apache.http.conn.scheme.SocketFactory;

// Referenced classes of package com.facebook.http.b:
//            m, w, x

class am extends d
{

    final w a;

    private am(w w)
    {
        a = w;
        super();
    }

    am(w w, x x)
    {
        this(w);
    }

    public g a()
    {
        return new g((m)a(com/facebook/http/b/m), b(org/apache/http/conn/scheme/SocketFactory, com/facebook/http/annotations/SslSocketFactory), (e)a(com/facebook/http/c/e));
    }

    public Object b()
    {
        return a();
    }
}
