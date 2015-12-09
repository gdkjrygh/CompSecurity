// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class fhf extends epd
{

    private fhd a;

    private fhf(fhd fhd1)
    {
        a = fhd1;
        super();
    }

    fhf(fhd fhd1, byte byte0)
    {
        this(fhd1);
    }

    protected final int a()
    {
        return 2;
    }

    protected final void a(int i)
    {
        a.d.removeCallbacks(a.a);
        a.e.c();
    }

    protected final boolean b()
    {
        return a.e.b();
    }

    protected final void c()
    {
        a.e.a();
    }
}
