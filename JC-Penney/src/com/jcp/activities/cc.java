// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.support.v4.view.bi;
import android.view.View;
import android.view.ViewGroup;
import com.jcp.g.a;
import com.jcp.views.TouchImageView;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.ArrayList;
import java.util.List;

class cc extends bi
{

    private List a;

    public cc(List list)
    {
        a = new ArrayList();
        a = list;
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        return b(viewgroup, i);
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public int b()
    {
        return a.size();
    }

    public View b(ViewGroup viewgroup, int i)
    {
        TouchImageView touchimageview = new TouchImageView(viewgroup.getContext());
        com.jcp.g.a.a().a((String)a.get(i)).b(0x7f02017f).a(touchimageview);
        viewgroup.addView(touchimageview, -1, -1);
        return touchimageview;
    }
}
