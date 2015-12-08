// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.a.a.a.b;
import com.nineoldandroids.a.k;

public class a extends b
{

    private final long a;
    private final long d;

    public a(BaseAdapter baseadapter)
    {
        this(baseadapter, 100L, 300L);
    }

    public a(BaseAdapter baseadapter, long l, long l1)
    {
        super(baseadapter);
        a = l;
        d = l1;
    }

    protected com.nineoldandroids.a.a a(ViewGroup viewgroup, View view)
    {
        return k.a(view, "translationY", new float[] {
            500F, 0.0F
        });
    }

    protected long c()
    {
        return a;
    }

    protected long d()
    {
        return d;
    }
}
