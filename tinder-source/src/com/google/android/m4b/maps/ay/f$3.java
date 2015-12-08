// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.util.Log;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            af, f, ab

final class init> extends af
{

    private f a;

    public final void a()
    {
        a.b();
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (f.b(a).a() == null) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.ac.a a1 = f.a(f.b(a).a(), f.c(a));
        f.b(a).a(a1);
_L4:
        a.b();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!ab.a(f.c(), 5)) goto _L4; else goto _L3
_L3:
        Log.w(f.c(), "Could not find events in the store.");
          goto _L4
        Exception exception;
        exception;
        throw exception;
    }

    (f f1, byte abyte0[])
    {
        a = f1;
        super(125, abyte0, false);
    }
}
