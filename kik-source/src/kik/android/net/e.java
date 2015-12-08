// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net;

import java.net.Socket;
import kik.a.f.p;

public final class e
    implements p
{

    private final Socket a;

    public e(Socket socket)
    {
        a = socket;
    }

    public final void a()
    {
        a.close();
    }
}
