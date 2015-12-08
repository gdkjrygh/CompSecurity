// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            l, t

public final class k extends l
{

    public k(Context context, t t)
    {
        super(context, 5, t);
    }

    public final View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        Object obj1 = null;
        Object obj = null;
        View view1 = obj;
        if (!f)
        {
            if (layoutinflater == null)
            {
                view1 = obj;
            } else
            {
                if (view != null && !(view.getTag() instanceof k))
                {
                    view1 = obj1;
                } else
                {
                    view1 = view;
                }
                view = view1;
                if (view1 == null)
                {
                    view = layoutinflater.inflate(0x7f030012, viewgroup, false);
                }
                view1 = view;
                if (view != null)
                {
                    view.setOnClickListener(this);
                    view.setTag(this);
                    return view;
                }
            }
        }
        return view1;
    }
}
