// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.internal:
//            de

public abstract class jf extends jf
{

    private final d jf;
    final de kP;

    protected final void a(Object obj)
    {
        a(obj, jf);
    }

    protected abstract void a(Object obj, d d1);

    protected void aF()
    {
        if (jf != null)
        {
            jf.close();
        }
    }

    public volatile void be()
    {
        super.be();
    }

    public volatile void bf()
    {
        super.bf();
    }

    public volatile void unregister()
    {
        super.unregister();
    }

    public (de de1, Object obj, d d1)
    {
        kP = de1;
        super(de1, obj);
        jf = d1;
    }
}
