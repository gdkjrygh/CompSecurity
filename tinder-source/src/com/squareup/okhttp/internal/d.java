// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.e;
import com.squareup.okhttp.f;
import com.squareup.okhttp.i;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.h;
import com.squareup.okhttp.internal.http.q;
import com.squareup.okhttp.j;
import com.squareup.okhttp.k;
import com.squareup.okhttp.s;
import com.squareup.okhttp.t;
import java.io.IOException;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal:
//            e, j, g

public abstract class d
{

    public static final Logger a = Logger.getLogger(com/squareup/okhttp/s.getName());
    public static d b;

    public d()
    {
    }

    public abstract com.squareup.okhttp.internal.e a(s s1);

    public abstract q a(i i, h h)
        throws IOException;

    public abstract void a(e e1)
        throws IOException;

    public abstract void a(e e1, f f);

    public abstract void a(i i, Protocol protocol);

    public abstract void a(i i, Object obj)
        throws IOException;

    public abstract void a(j j, i i);

    public abstract void a(k k, SSLSocket sslsocket, boolean flag);

    public abstract void a(com.squareup.okhttp.o.a a1, String s1);

    public abstract void a(s s1, i i, h h, t t)
        throws RouteException;

    public abstract boolean a(i i);

    public abstract int b(i i);

    public abstract i b(e e1);

    public abstract com.squareup.okhttp.internal.j b(s s1);

    public abstract void b(i i, h h);

    public abstract void b(i i, Object obj);

    public abstract g c(s s1);

    public abstract boolean c(i i);

    public abstract okio.e d(i i);

    public abstract okio.d e(i i);

}
