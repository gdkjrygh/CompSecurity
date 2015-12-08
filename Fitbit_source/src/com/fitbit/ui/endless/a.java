// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.endless;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.fitbit.ui.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import se.emilsjolander.stickylistheaders.h;

public abstract class a extends c
    implements h
{

    private Set a;

    public a()
    {
        super(new ArrayList(), false);
        a = new HashSet();
    }

    public void a(Set set)
    {
        a = set;
    }

    public abstract View b(int i, View view, ViewGroup viewgroup);

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = b(i, view, viewgroup);
        viewgroup = Integer.valueOf(i);
        if (a.contains(viewgroup))
        {
            a.remove(viewgroup);
            viewgroup = new AlphaAnimation(0.0F, 1.0F);
            viewgroup.setFillAfter(true);
            viewgroup.setDuration(250L);
            viewgroup.setStartOffset(0L);
            view.startAnimation(viewgroup);
        }
        return view;
    }
}
