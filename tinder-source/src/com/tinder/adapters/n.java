// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.enums.UserType;
import com.tinder.fragments.bm;
import com.tinder.fragments.o;
import com.tinder.model.Match;

public final class n extends p
{

    public boolean a;
    public int b;
    public bm c;
    private Match d;

    public n(m m, Match match)
    {
        super(m);
        b = 0;
        d = match;
    }

    public final Fragment a(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        Object obj = o.a(d);
_L4:
        com.tinder.utils.o.a(((Fragment) (obj)));
        return ((Fragment) (obj));
_L2:
        bm bm1 = bm.a(null, UserType.MATCH);
        bm1.i = false;
        obj = bm1;
        if (bm1.getView() != null)
        {
            bm1.getView().findViewById(0x7f0e01f6).setVisibility(8);
            bm1.getView().findViewById(0x7f0e02bb).setVisibility(8);
            obj = bm1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        super.destroyItem(viewgroup, i, obj);
    }

    public final int getCount()
    {
        if (a)
        {
            return 0;
        } else
        {
            return b;
        }
    }

    public final int getItemPosition(Object obj)
    {
        return a ? -2 : -1;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup = ((ViewGroup) (super.instantiateItem(viewgroup, i)));
        if (viewgroup instanceof bm)
        {
            c = (bm)viewgroup;
        }
        com.tinder.utils.o.a((Fragment)viewgroup);
        return viewgroup;
    }
}
