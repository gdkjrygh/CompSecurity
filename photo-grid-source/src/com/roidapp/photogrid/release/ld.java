// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.roidapp.photogrid.cloud.w;
import com.roidapp.photogrid.common.an;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ih, li, le, 
//            lf, lg, lh, lj

public final class ld
{

    PopupWindow a;
    private PhotoGridActivity b;
    private RelativeLayout c;
    private lj d;
    private ArrayList e;
    private ArrayList f;
    private boolean g;
    private boolean h;

    public ld(PhotoGridActivity photogridactivity, RelativeLayout relativelayout, lj lj, boolean flag)
    {
        b = photogridactivity;
        c = relativelayout;
        d = lj;
        h = flag;
        if (a() == 1)
        {
            g = true;
        }
        e = new ArrayList();
        f = new ArrayList();
        photogridactivity = w.a(b, an.a(b));
        if (g)
        {
            e.add(b.getString(0x7f0701ae));
            f.add(Integer.valueOf(0x7f0203f6));
        } else
        {
            e.add(photogridactivity.a("main_gridmode", b.getString(0x7f0701a9)));
            f.add(Integer.valueOf(0x7f0203a2));
        }
        e.add(photogridactivity.a("main_freemode", b.getString(0x7f0701a8)));
        f.add(Integer.valueOf(0x7f020399));
        if (h)
        {
            e.add(photogridactivity.a("main_video", b.getString(0x7f0701b1)));
            f.add(Integer.valueOf(0x7f020419));
        }
        e.add(photogridactivity.a("main_templatemode", b.getString(0x7f0701af)));
        f.add(Integer.valueOf(0x7f020404));
        e.add(photogridactivity.a("main_high_wide", b.getString(0x7f0701aa)));
        f.add(Integer.valueOf(0x7f0203a5));
    }

    public static int a()
    {
        if (ih.C().M() != null)
        {
            return ih.C().M().length;
        } else
        {
            return 0;
        }
    }

    static PhotoGridActivity a(ld ld1)
    {
        return ld1.b;
    }

    static boolean b(ld ld1)
    {
        return ld1.g;
    }

    static boolean c(ld ld1)
    {
        return ld1.h;
    }

    static lj d(ld ld1)
    {
        return ld1.d;
    }

    static ArrayList e(ld ld1)
    {
        return ld1.e;
    }

    static ArrayList f(ld ld1)
    {
        return ld1.f;
    }

    public final void b()
    {
        if (a == null)
        {
            View view = LayoutInflater.from(b).inflate(0x7f0300ff, null);
            ListView listview = (ListView)view.findViewById(0x7f0d03f6);
            listview.setAdapter(new li(this, b));
            listview.setOnItemClickListener(new le(this));
            listview.setOnKeyListener(new lf(this));
            view.setFocusableInTouchMode(true);
            view.setOnKeyListener(new lg(this));
            a = new PopupWindow(view, -2, -2, true);
            a.setInputMethodMode(1);
            a.setTouchable(true);
            a.setOutsideTouchable(true);
            a.setFocusable(true);
            a.getContentView().setOnTouchListener(new lh(this));
            a.update();
        }
        if (a.isShowing())
        {
            a.dismiss();
            return;
        }
        try
        {
            a.showAsDropDown(c, 0, 0);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            illegalstateexception.printStackTrace();
        }
    }
}
