// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            x, aa

public abstract class y extends x
{

    private boolean a;
    private boolean b;

    protected y(aa aa)
    {
        super(aa);
    }

    public final boolean A()
    {
        return a && !b;
    }

    protected final void B()
    {
        if (!A())
        {
            throw new IllegalStateException("Not initialized");
        } else
        {
            return;
        }
    }

    public final void C()
    {
        a();
        a = true;
    }

    protected abstract void a();
}
