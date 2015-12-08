// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.photogrid.cloud.a.l;
import com.roidapp.photogrid.cloud.a.t;
import java.util.Collection;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br

final class cf extends l
{

    final br a;
    private Collection b;

    public cf(br br1, Context context, t t)
    {
        a = br1;
        super(context, 43969, t);
        b = br.a(br1);
    }

    public final View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        if (layoutinflater == null)
        {
            return null;
        }
        if (view != null && !(view.getTag() instanceof cf))
        {
            view = null;
        }
        if (view == null)
        {
            view = layoutinflater.inflate(0x7f030027, viewgroup, false);
        }
        if (view == null)
        {
            return null;
        }
        viewgroup = (ViewGroup)view.findViewById(0x7f0d00dd);
        ViewGroup viewgroup1 = (ViewGroup)view.findViewById(0x7f0d00de);
        if (viewgroup == null || viewgroup1 == null)
        {
            return null;
        } else
        {
            viewgroup.removeAllViews();
            viewgroup1.removeAllViews();
            br.a(a, layoutinflater, viewgroup, viewgroup1, b);
            view.setTag(this);
            return view;
        }
    }
}
