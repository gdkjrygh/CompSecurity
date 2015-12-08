// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class a
    implements d.b
{

    private final DataHolder JG;

    protected a(DataHolder dataholder)
    {
        JG = dataholder;
    }

    protected abstract void a(Object obj, DataHolder dataholder);

    public final void c(Object obj)
    {
        a(obj, JG);
    }

    public void gG()
    {
        if (JG != null)
        {
            JG.close();
        }
    }
}
