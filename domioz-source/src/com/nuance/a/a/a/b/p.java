// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import com.nuance.a.a.a.a.d.a.n;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// Referenced classes of package com.nuance.a.a.a.b:
//            n

final class p
{

    Socket a;
    n b;
    InputStream c;
    OutputStream d;
    Object e;
    com.nuance.a.a.a.b.n f;

    public p(Socket socket, n n, Object obj, InputStream inputstream, OutputStream outputstream, com.nuance.a.a.a.b.n n1)
    {
        c = null;
        d = null;
        e = null;
        f = null;
        a = socket;
        b = n;
        e = obj;
        c = inputstream;
        d = outputstream;
        f = n1;
    }
}
