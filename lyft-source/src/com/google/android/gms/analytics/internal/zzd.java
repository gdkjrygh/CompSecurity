// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzc, zzf

public abstract class zzd extends zzc
{

    private boolean a;
    private boolean b;

    protected zzd(zzf zzf)
    {
        super(zzf);
    }

    public boolean C()
    {
        return a && !b;
    }

    protected void D()
    {
        if (!C())
        {
            throw new IllegalStateException("Not initialized");
        } else
        {
            return;
        }
    }

    public void E()
    {
        a();
        a = true;
    }

    protected abstract void a();
}
