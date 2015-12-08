// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            v, w, x

public class u
    implements android.view.View.OnClickListener
{

    private Context a;
    private LayoutInflater b;
    private View c;
    private v d;
    private PopupWindow e;
    private x f;
    private w g;
    private List h;

    public u(Context context, View view)
    {
        h = new ArrayList();
        a = context;
        c = view;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        a();
    }

    static LayoutInflater a(u u1)
    {
        return u1.b;
    }

    private void a()
    {
        e = new PopupWindow(a);
        e.setFocusable(true);
        e.setOutsideTouchable(true);
        e.setWidth(b());
        e.setHeight(-2);
        e.setBackgroundDrawable(new BitmapDrawable());
    }

    private int b()
    {
        return (int)(160F * a.getResources().getDisplayMetrics().density);
    }

    static x b(u u1)
    {
        return u1.f;
    }

    static PopupWindow c(u u1)
    {
        return u1.e;
    }

    public void a(List list)
    {
        if (!h.isEmpty())
        {
            h.clear();
        }
        h.addAll(list);
    }

    public void a(List list, w w1)
    {
        g = w1;
        w1 = b.inflate(0x7f03009b, null);
        w1.findViewById(0x7f0e021e).setOnClickListener(this);
        w1.findViewById(0x7f0e0220).setOnClickListener(this);
        ListView listview = (ListView)w1.findViewById(0x7f0e0358);
        d = new v(this, list, 1);
        listview.setAdapter(d);
        if (!h.isEmpty())
        {
            d.a(h);
        }
        e.setContentView(w1);
        e.showAsDropDown(c);
    }

    public void a(List list, x x)
    {
        f = x;
        x = b.inflate(0x7f03009b, null);
        x.findViewById(0x7f0e0302).setVisibility(8);
        ListView listview = (ListView)x.findViewById(0x7f0e0358);
        d = new v(this, list, 2);
        listview.setAdapter(d);
        if (!h.isEmpty())
        {
            d.a(h);
        }
        e.setContentView(x);
        e.showAsDropDown(c);
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0e021e)
        {
            d.b();
        } else
        if (view.getId() == 0x7f0e0220)
        {
            if (g != null)
            {
                g.a(d.a());
                e.dismiss();
            }
            e.dismiss();
            return;
        }
    }
}
