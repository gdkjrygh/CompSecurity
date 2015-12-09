// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.ui.a.c;

public class p extends c
{

    private Context a;

    public p(Context context)
    {
    }

    protected Context a()
    {
        return a;
    }

    protected View a(int i, View view)
    {
        return view;
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        a = viewgroup.getContext();
        view = b(i, view);
        a = null;
        return view;
    }

    protected View b(int i, View view)
    {
        return view;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        a = viewgroup.getContext();
        view = a(i, view);
        a = null;
        return view;
    }
}
