// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            gs

public class kp extends Exception
{

    public final gs a;
    private long b;

    public kp()
    {
        a = null;
    }

    public kp(gs gs)
    {
        a = gs;
    }

    public kp(Throwable throwable)
    {
        super(throwable);
        a = null;
    }

    final void a(long l)
    {
        b = l;
    }
}
