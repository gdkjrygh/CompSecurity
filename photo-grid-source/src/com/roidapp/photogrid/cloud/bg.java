// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.cloud.a.l;
import com.roidapp.photogrid.cloud.a.t;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            bf, p

final class bg extends l
{

    final bf a;
    private p b;

    public bg(bf bf1, Context context, t t)
    {
        a = bf1;
        super(context, 48337, t);
        b = bf.a(bf1);
    }

    public final View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        if (layoutinflater != null)
        {
            if (view != null && !(view.getTag() instanceof bg))
            {
                view = null;
            }
            if (view == null)
            {
                view = layoutinflater.inflate(0x7f03001f, viewgroup, false);
            }
            if (view != null)
            {
                if (view != null)
                {
                    layoutinflater = (TextView)view.findViewById(0x7f0d00a4);
                    viewgroup = (TextView)view.findViewById(0x7f0d00a5);
                    TextView textview = (TextView)view.findViewById(0x7f0d00a6);
                    if (layoutinflater != null && viewgroup != null && textview != null)
                    {
                        n.a(layoutinflater, 0, 0x7f020165, 0);
                        n.a(textview, 0, 0x7f020180, 0);
                        layoutinflater.setOnClickListener(bf.b(a));
                        textview.setOnClickListener(bf.b(a));
                        if (b != null)
                        {
                            viewgroup.setText(b.c);
                            n.a(viewgroup, 0, b.b, 0);
                            viewgroup.setId(b.a);
                            viewgroup.setOnClickListener(bf.b(a));
                        }
                    }
                }
                view.setTag(this);
                return view;
            }
        }
        return null;
    }
}
