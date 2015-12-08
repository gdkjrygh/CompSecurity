// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.a.b;
import com.roidapp.cloudlib.template.g;
import com.roidapp.cloudlib.template.i;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.w;
import com.roidapp.videolib.core.l;
import com.roidapp.videolib.f;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage, t

public final class s
    implements android.view.View.OnClickListener, b
{

    protected TextView a;
    private MainPage b;

    public s()
    {
    }

    static MainPage a(s s1)
    {
        return s1.b;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        l.a().a(b.getApplication());
        viewgroup = layoutinflater.inflate(0x7f0300b3, viewgroup, false);
        g g1 = new g(b);
        layoutinflater = g1.a();
        if (((i) (layoutinflater)).a > ((i) (layoutinflater)).b)
        {
            PreferenceManager.getDefaultSharedPreferences(b).edit().putBoolean("template_new", true).apply();
        }
        Object obj = viewgroup.findViewById(0x7f0d02b6);
        Object obj1 = viewgroup.findViewById(0x7f0d02bb);
        layoutinflater = viewgroup.findViewById(0x7f0d02c0);
        if (b.n() != f.a && PreferenceManager.getDefaultSharedPreferences(b).getBoolean("hideVideo", false))
        {
            b.a((ViewGroup)obj, (ViewGroup)obj1);
        }
        Object obj2 = b.getResources().getDisplayMetrics();
        int j = ((DisplayMetrics) (obj2)).widthPixels;
        int k = ((DisplayMetrics) (obj2)).heightPixels;
        if (j > k)
        {
            j = k;
        }
        float f1 = b.getResources().getDimension(0x7f090044);
        j = Math.round(((((float)j - f1 * 3F) / 2.0F) * 2.0F) / 3F);
        ((android.view.ViewGroup.MarginLayoutParams)((View) (obj)).getLayoutParams()).height = j;
        ((android.view.ViewGroup.MarginLayoutParams)((View) (obj1)).getLayoutParams()).height = j;
        ((android.view.ViewGroup.MarginLayoutParams)layoutinflater.getLayoutParams()).height = j;
        obj = viewgroup.findViewById(0x7f0d02b7);
        ((View) (obj)).setOnClickListener(this);
        obj2 = viewgroup.findViewById(0x7f0d02b9);
        ((View) (obj2)).setOnClickListener(this);
        obj1 = viewgroup.findViewById(0x7f0d02bc);
        ((View) (obj1)).setOnClickListener(this);
        Object obj6 = viewgroup.findViewById(0x7f0d02be);
        if (obj6 != null)
        {
            ((View) (obj6)).setOnClickListener(this);
        }
        Object obj4 = viewgroup.findViewById(0x7f0d02c1);
        ((View) (obj4)).setOnClickListener(this);
        Object obj5 = viewgroup.findViewById(0x7f0d02c3);
        ((View) (obj5)).setOnClickListener(this);
        a = (TextView)((View) (obj5)).findViewById(0x7f0d02c4);
        Object obj3 = viewgroup.findViewById(0x7f0d02c5);
        ((View) (obj3)).setOnClickListener(this);
        b.h.a(new View[] {
            obj, obj2, obj1, obj6, layoutinflater
        });
        obj = (TextView)((View) (obj)).findViewById(0x7f0d02b8);
        obj2 = (TextView)((View) (obj2)).findViewById(0x7f0d02ba);
        obj4 = (TextView)((View) (obj4)).findViewById(0x7f0d02c2);
        if (obj6 == null)
        {
            layoutinflater = null;
        } else
        {
            layoutinflater = (TextView)((View) (obj6)).findViewById(0x7f0d02bf);
        }
        obj5 = (TextView)((View) (obj5)).findViewById(0x7f0d01c3);
        obj3 = (TextView)((View) (obj3)).findViewById(0x7f0d02c6);
        obj1 = (TextView)((View) (obj1)).findViewById(0x7f0d02bd);
        n.a(((TextView) (obj)), 0, 0x7f02033c, 0);
        n.a(((TextView) (obj4)), 0, 0x7f02033a, 0);
        n.a(((TextView) (obj2)), 0, 0x7f02033f, 0);
        n.a(layoutinflater, 0, 0x7f020341, 0);
        n.a(((TextView) (obj5)), 0, 0x7f020340, 0);
        n.a(((TextView) (obj3)), 0, 0x7f02033d, 0);
        n.a(((TextView) (obj1)), 0, 0x7f020339, 0);
        obj1 = com.roidapp.photogrid.cloud.w.a(b, an.a(b));
        if (((com.roidapp.photogrid.cloud.w) (obj1)).a())
        {
            obj6 = b.getResources();
            ((TextView) (obj)).setText(((com.roidapp.photogrid.cloud.w) (obj1)).a("main_gridmode", ((Resources) (obj6)).getString(0x7f0701a9)));
            ((TextView) (obj2)).setText(((com.roidapp.photogrid.cloud.w) (obj1)).a("main_singlemode", ((Resources) (obj6)).getString(0x7f0701ae)));
            ((TextView) (obj4)).setText(((com.roidapp.photogrid.cloud.w) (obj1)).a("main_freemode", ((Resources) (obj6)).getString(0x7f0701a8)));
            if (layoutinflater != null)
            {
                layoutinflater.setText(((com.roidapp.photogrid.cloud.w) (obj1)).a("main_video", ((Resources) (obj6)).getString(0x7f0701b1)));
            }
            ((TextView) (obj5)).setText(((com.roidapp.photogrid.cloud.w) (obj1)).a("main_templatemode", ((Resources) (obj6)).getString(0x7f0701af)));
            ((TextView) (obj3)).setText(((com.roidapp.photogrid.cloud.w) (obj1)).a("main_high_wide", ((Resources) (obj6)).getString(0x7f0701aa)));
        }
        b.i.postDelayed(new t(this, g1), 500L);
        return viewgroup;
    }

    public final void a()
    {
        if (b != null)
        {
            com.roidapp.cloudlib.a.a.a(b).a(this);
        }
    }

    public final void a(Activity activity)
    {
        b = (MainPage)activity;
    }

    public final void b()
    {
        if (b != null)
        {
            com.roidapp.cloudlib.a.a.a(b).b(this);
        }
    }

    public final void c()
    {
    }

    public final void onClick(View view)
    {
        if (b != null && !b.isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        view.getId();
        JVM INSTR tableswitch 2131559095 2131559109: default 96
    //                   2131559095 97
    //                   2131559096 96
    //                   2131559097 182
    //                   2131559098 96
    //                   2131559099 96
    //                   2131559100 706
    //                   2131559101 96
    //                   2131559102 588
    //                   2131559103 96
    //                   2131559104 96
    //                   2131559105 385
    //                   2131559106 96
    //                   2131559107 470
    //                   2131559108 96
    //                   2131559109 267;
           goto _L3 _L4 _L3 _L5 _L3 _L3 _L6 _L3 _L7 _L3 _L3 _L8 _L3 _L9 _L3 _L10
_L6:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (b.o()) goto _L1; else goto _L11
_L11:
        com.roidapp.photogrid.b.f.a(com.roidapp.photogrid.b.g.b);
        com.roidapp.photogrid.b.f.a("CartPage_View", "Home_Cart");
        int j = com.roidapp.photogrid.MainPage.g;
        com.roidapp.photogrid.MainPage.g = j + 1;
        com.roidapp.photogrid.b.f.c("Grid", j);
        aj.a();
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Home/Grid");
        af.b(aj.a(), "SNS", "click", "Main/Home/Grid", Long.valueOf(1L));
        b.r();
        return;
_L5:
        if (b.o()) goto _L1; else goto _L12
_L12:
        com.roidapp.photogrid.b.f.a(com.roidapp.photogrid.b.g.a);
        com.roidapp.photogrid.b.f.a("CartPage_View", "Home_Cart");
        int k = com.roidapp.photogrid.MainPage.g;
        com.roidapp.photogrid.MainPage.g = k + 1;
        com.roidapp.photogrid.b.f.c("PhotoEditor", k);
        aj.a();
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Home/PhotoEditor");
        af.b(aj.a(), "SNS", "click", "Main/Home/PhotoEditor", Long.valueOf(1L));
        b.q();
        return;
_L10:
        if (b.o()) goto _L1; else goto _L13
_L13:
        if (b.f != null && b.f.isShowing())
        {
            b.f.dismiss();
        }
        com.roidapp.photogrid.b.f.a(com.roidapp.photogrid.b.g.f);
        com.roidapp.photogrid.b.f.a("CartPage_View", "Home_Cart");
        int i1 = com.roidapp.photogrid.MainPage.g;
        com.roidapp.photogrid.MainPage.g = i1 + 1;
        com.roidapp.photogrid.b.f.c("FilmStrip", i1);
        aj.a();
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Home/Filmstrip");
        af.b(aj.a(), "SNS", "click", "Main/Home/Filmstrip", Long.valueOf(1L));
        b.u();
        return;
_L8:
        if (b.o()) goto _L1; else goto _L14
_L14:
        com.roidapp.photogrid.b.f.a(com.roidapp.photogrid.b.g.c);
        com.roidapp.photogrid.b.f.a("CartPage_View", "Home_Cart");
        int j1 = com.roidapp.photogrid.MainPage.g;
        com.roidapp.photogrid.MainPage.g = j1 + 1;
        com.roidapp.photogrid.b.f.c("Scrapbook", j1);
        aj.a();
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Home/Scrapbook");
        af.b(aj.a(), "SNS", "click", "Main/Home/Scrapbook", Long.valueOf(1L));
        b.v();
        return;
_L9:
        if (b.o()) goto _L1; else goto _L15
_L15:
        if (b.f != null && b.f.isShowing())
        {
            b.f.dismiss();
        }
        com.roidapp.photogrid.b.f.a(com.roidapp.photogrid.b.g.e);
        com.roidapp.photogrid.b.f.a("TemplateSelect_View", "Home_TemplateSelect");
        int k1 = com.roidapp.photogrid.MainPage.g;
        com.roidapp.photogrid.MainPage.g = k1 + 1;
        com.roidapp.photogrid.b.f.c("Template", k1);
        aj.a();
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Home/Template");
        af.b(aj.a(), "SNS", "click", "Main/Home/Template", Long.valueOf(1L));
        b.w();
        return;
_L7:
        if (b.o()) goto _L1; else goto _L16
_L16:
        if (b.f != null && b.f.isShowing())
        {
            b.f.dismiss();
        }
        com.roidapp.photogrid.b.f.a(com.roidapp.photogrid.b.g.d);
        com.roidapp.photogrid.b.f.a("CartPage_View", "Home_Cart");
        int l1 = com.roidapp.photogrid.MainPage.g;
        com.roidapp.photogrid.MainPage.g = l1 + 1;
        com.roidapp.photogrid.b.f.c("Video", l1);
        aj.a();
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Home/Video");
        af.b(aj.a(), "SNS", "click", "Main/Home/Video", Long.valueOf(1L));
        b.s();
        return;
        if (b.o()) goto _L1; else goto _L17
_L17:
        if (b.f != null && b.f.isShowing())
        {
            b.f.dismiss();
        }
        aj.a();
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Home/SelfCam");
        af.b(aj.a(), "SNS", "click", "Main/Home/SelfCam", Long.valueOf(1L));
        b.t();
        return;
    }
}
