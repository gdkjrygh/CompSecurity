// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.roidapp.photogrid.cloud.a.l;
import com.roidapp.photogrid.cloud.a.t;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            bf, p

final class bh extends l
{

    final bf a;
    private p b;

    public bh(bf bf1, Context context, t t)
    {
        a = bf1;
        super(context, 48338, t);
        b = bf.a(bf1);
    }

    public final View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        if (layoutinflater != null)
        {
            if (view != null && !(view.getTag() instanceof bh))
            {
                view = null;
            }
            if (view == null)
            {
                view = layoutinflater.inflate(0x7f030020, viewgroup, false);
            }
            if (view != null)
            {
                if (view != null)
                {
                    ((LinearLayout)view.findViewById(0x7f0d00a7)).setOnClickListener(this);
                }
                view.setTag(this);
                return view;
            }
        }
        return null;
    }
}
