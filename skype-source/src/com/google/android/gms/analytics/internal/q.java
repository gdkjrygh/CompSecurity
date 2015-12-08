// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            p, s

public abstract class q extends p
{

    private boolean a;
    private boolean b;

    protected q(s s)
    {
        super(s);
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
