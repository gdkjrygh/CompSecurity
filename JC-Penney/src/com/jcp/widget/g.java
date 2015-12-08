// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.jcp.activities.MainActivity;
import com.jcp.adapters.bs;
import com.jcp.util.ap;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.widget:
//            i, h

public class g extends PopupWindow
{

    private MainActivity a;
    private WeakReference b;
    private WeakReference c;
    private ListView d;

    public g(MainActivity mainactivity)
    {
        super(mainactivity);
        b = new WeakReference(null);
        c = new WeakReference(null);
        a(mainactivity);
    }

    static MainActivity a(g g1)
    {
        return g1.a;
    }

    private void a(MainActivity mainactivity)
    {
        a = mainactivity;
    }

    public void a(View view)
    {
        if (c == null || c.get() == null)
        {
            c = new WeakReference(LayoutInflater.from(a).inflate(0x7f0300b7, null));
            d = (ListView)((View)c.get()).findViewById(0x7f0e039d);
            d.addFooterView(new i(a));
            d.setOnItemClickListener(new h(this));
        }
        d.setAdapter(new bs(a));
        if (b == null || b.get() == null)
        {
            b = new WeakReference(new PopupWindow(a));
            ((PopupWindow)b.get()).setFocusable(true);
            ((PopupWindow)b.get()).setOutsideTouchable(true);
            ((PopupWindow)b.get()).setWidth((new ap(a)).a());
            ((PopupWindow)b.get()).setHeight(-2);
            ((PopupWindow)b.get()).setContentView((View)c.get());
            ((PopupWindow)b.get()).setBackgroundDrawable(new BitmapDrawable());
        }
        ((PopupWindow)b.get()).showAsDropDown(view);
        com.jcp.h.g.a("Menu", "Account Menu", null);
    }

    public boolean a()
    {
        if (b != null && b.get() != null && ((PopupWindow)b.get()).isShowing())
        {
            ((PopupWindow)b.get()).dismiss();
            return true;
        } else
        {
            return false;
        }
    }
}
