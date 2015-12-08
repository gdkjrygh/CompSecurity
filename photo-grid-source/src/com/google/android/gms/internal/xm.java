// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            pl

public class xm extends Exception
{

    public final pl a;
    private long b;

    public xm()
    {
        a = null;
    }

    public xm(pl pl)
    {
        a = pl;
    }

    public xm(Throwable throwable)
    {
        super(throwable);
        a = null;
    }

    final void a(long l)
    {
        b = l;
    }
}
