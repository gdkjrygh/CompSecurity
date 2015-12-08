// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import java.net.Socket;

public final class gsu
{

    String a;
    Socket b;
    gtl c;
    public Protocol d;
    gto e;
    boolean f;

    public gsu(String s, Socket socket)
    {
        c = gtl.a;
        d = Protocol.c;
        e = gto.a;
        a = s;
        f = true;
        b = socket;
    }
}
