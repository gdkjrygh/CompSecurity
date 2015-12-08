// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package com.arist.model.skin:
//            ColorCircleView, b

final class f extends BaseAdapter
{

    int a[];
    Context b;
    LayoutInflater c;
    final b d;

    private f(b b1, int ai[], Context context)
    {
        d = b1;
        super();
        a = ai;
        b = context;
        c = LayoutInflater.from(context);
    }

    f(b b1, int ai[], Context context, byte byte0)
    {
        this(b1, ai, context);
    }

    private Integer a(int i)
    {
        return Integer.valueOf(a[i]);
    }

    public final int getCount()
    {
        return a.length;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = c.inflate(0x7f03003e, null);
        ((ColorCircleView)view.findViewById(0x7f0600e2)).a(a(i).intValue());
        return view;
    }
}
