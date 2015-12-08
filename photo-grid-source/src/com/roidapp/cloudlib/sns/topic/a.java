// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v7.widget.al;
import android.util.DisplayMetrics;
import android.view.View;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.roidapp.cloudlib.sns.b.n;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends al
    implements k, l
{

    protected final List a = new ArrayList();
    protected Fragment b;
    protected Context c;
    protected Object d;
    protected final int e;
    protected final int f;
    protected final int g;
    protected android.view.View.OnClickListener h;
    protected int i;

    public a(Fragment fragment, android.view.View.OnClickListener onclicklistener, int j)
    {
        b = fragment;
        c = fragment.getActivity();
        h = onclicklistener;
        f = j;
        g = c.getResources().getDisplayMetrics().widthPixels;
        e = g / j;
    }

    protected final void a(View view, n n)
    {
        if (view != null && h != null)
        {
            view.setTag(n);
            view.setOnClickListener(h);
        }
    }

    public final void b(Object obj)
    {
        d = obj;
    }

    public abstract boolean e(int j);

    public final void f(int j)
    {
        i = j;
    }
}
