// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.widget.Adapter;

// Referenced classes of package com.kik.view.adapters:
//            bb

public final class k extends bb
{

    private String a;
    private String b;
    private String c;
    private String d;

    public k(Context context)
    {
        super(context);
    }

    public final int a()
    {
        if (super.a(b) == null)
        {
            return 0;
        } else
        {
            return super.a(b).getCount();
        }
    }

    public final void a(Adapter adapter)
    {
        super.e(c, adapter);
    }

    public final void a(String s, Adapter adapter)
    {
        d = s;
        super.c(s, adapter, true);
    }

    public final void a(String s, Adapter adapter, boolean flag)
    {
        a = s;
        super.c(s, adapter, flag);
    }

    public final void b(Adapter adapter)
    {
        super.e(d, adapter);
    }

    public final void b(String s, Adapter adapter)
    {
        c = s;
        super.d(s, adapter);
    }

    public final void b(String s, Adapter adapter, boolean flag)
    {
        b = s;
        super.c(s, adapter, flag);
    }
}
