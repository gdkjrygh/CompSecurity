// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.net.Socket;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, i, l

public static final class b
{

    String a;
    Socket b;
    i c;
    public Protocol d;
    l e;
    boolean f;

    public (String s, Socket socket)
        throws IOException
    {
        c = i.a;
        d = Protocol.c;
        e = l.a;
        a = s;
        f = true;
        b = socket;
    }
}
