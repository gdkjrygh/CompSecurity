// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.View;
import android.view.ViewGroup;
import com.skype.android.widget.recycler.RecyclerViewUtils;

// Referenced classes of package com.skype.android.widget:
//            SeparatedColumnsAdapter

public class c
{

    final SeparatedColumnsAdapter a;
    private int b;
    private android.support.v7.widget. c;

    static int a(c c1)
    {
        return c1.b;
    }

    public final int a()
    {
        return c.(b);
    }

    public final View a(ViewGroup viewgroup)
    {
        return RecyclerViewUtils.a(c, b, viewgroup);
    }

    public final b a(int i, android.support.v7.widget. )
    {
        b = i;
        c = ;
        return this;
    }

    public final long b()
    {
        return c.(b);
    }

    public (SeparatedColumnsAdapter separatedcolumnsadapter, int i, android.support.v7.widget. )
    {
        a = separatedcolumnsadapter;
        super();
        b = i;
        c = ;
    }
}
