// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.internal:
//            aa

public abstract class c extends c
{

    final aa b;
    private final DataHolder c;

    protected void a()
    {
        if (c != null)
        {
            c.i();
        }
    }

    protected final void a(Object obj)
    {
        a(obj, c);
    }

    protected abstract void a(Object obj, DataHolder dataholder);

    public volatile void b()
    {
        super.b();
    }

    public volatile void c()
    {
        super.c();
    }

    public volatile void d()
    {
        super.d();
    }

    public taHolder(aa aa1, Object obj, DataHolder dataholder)
    {
        b = aa1;
        super(aa1, obj);
        c = dataholder;
    }
}
