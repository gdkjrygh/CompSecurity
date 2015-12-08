// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;


// Referenced classes of package com.google.android.gms.measurement.internal:
//            ae, ac

abstract class af extends ae
{

    private boolean a;
    private boolean b;
    boolean i;

    af(ac ac1)
    {
        super(ac1);
        ac1 = h;
        ac1.f = ac1.f + 1;
    }

    protected abstract void a();

    final boolean s()
    {
        return a && !b;
    }

    protected final void t()
    {
        if (!s())
        {
            throw new IllegalStateException("Not initialized");
        } else
        {
            return;
        }
    }

    public final void u()
    {
        if (a)
        {
            throw new IllegalStateException("Can't initialize twice");
        } else
        {
            a();
            ac ac1 = h;
            ac1.g = ac1.g + 1;
            a = true;
            return;
        }
    }
}
