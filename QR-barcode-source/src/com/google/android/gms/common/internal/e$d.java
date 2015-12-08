// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.common.internal:
//            e

public abstract class II extends II
{

    private final DataHolder II;
    final e LF;

    protected abstract void a(Object obj, DataHolder dataholder);

    protected final void g(Object obj)
    {
        a(obj, II);
    }

    protected void gT()
    {
        if (II != null)
        {
            II.close();
        }
    }

    public volatile void gU()
    {
        super.gU();
    }

    public volatile void gV()
    {
        super.gV();
    }

    public volatile void unregister()
    {
        super.unregister();
    }

    public er(e e1, Object obj, DataHolder dataholder)
    {
        LF = e1;
        super(e1, obj);
        II = dataholder;
    }
}
