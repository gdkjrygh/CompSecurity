// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.bt;
import com.vungle.publisher.bv;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            SessionStart

public static class 
{

    bt a;
    bv b;

    public final SessionStart a(long l)
    {
        SessionStart sessionstart = new SessionStart();
        sessionstart.a = a.a();
        sessionstart.b = a.c();
        sessionstart.c = a.j();
        sessionstart.d = b.b();
        sessionstart.e = Long.valueOf(l);
        return sessionstart;
    }

    public ()
    {
    }
}
