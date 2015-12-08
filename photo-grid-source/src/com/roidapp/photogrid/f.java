// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.hlistview.AdapterView;
import com.roidapp.baselib.hlistview.HListView;
import com.roidapp.baselib.hlistview.s;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.release.GridImageView;
import com.roidapp.photogrid.release.kp;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            g, j, MainPage, i, 
//            h

public final class f extends b
    implements android.view.View.OnClickListener, s
{

    private HListView a;
    private HorizontalScrollView b;
    private ImageView c;
    private MainPage d;
    private View e;
    private View f;
    private List g;
    private i h;
    private boolean i;
    private Handler j;
    private kp k;
    private boolean l;

    public f()
    {
        j = new g(this);
    }

    static Handler a(f f1)
    {
        return f1.j;
    }

    static String a(String s1)
    {
        return b(s1);
    }

    static List a(f f1, List list)
    {
        f1.g = list;
        return list;
    }

    private static String b(String s1)
    {
        int i1 = s1.lastIndexOf("/");
        if (i1 < 0)
        {
            return null;
        }
        try
        {
            s1 = s1.substring(0, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return "";
        }
        return s1;
    }

    static List b(f f1)
    {
        return f1.g;
    }

    static kp c(f f1)
    {
        return f1.k;
    }

    static void h()
    {
    }

    public final void a(AdapterView adapterview, View view, int i1)
    {
        adapterview = (String)((j)view.getTag()).a.getTag();
        if (d != null)
        {
            af.b(getActivity(), "SNS", "click", (new StringBuilder("Main/Create/Recent/Position---")).append(i1).toString(), Long.valueOf(1L));
            d.a(adapterview);
        }
    }

    public final void d()
    {
        if (h == null)
        {
            h = new i(this, (byte)0);
            a.a(h);
        }
        h.notifyDataSetChanged();
        l = false;
        if (g == null || g.size() <= 0)
        {
            e.setVisibility(0);
            return;
        } else
        {
            e.setVisibility(8);
            return;
        }
    }

    public final void f()
    {
        if (f != null)
        {
            f.findViewById(0x7f0d02ad).setVisibility(8);
        }
    }

    public final void g()
    {
        if (i)
        {
            l = true;
            if (d.n() != com.roidapp.videolib.f.a && PreferenceManager.getDefaultSharedPreferences(d).getBoolean("hideVideo", false))
            {
                f();
            }
            com.roidapp.photogrid.common.b.a("FastTools/initRecent");
            if (!Environment.getExternalStorageState().equals("mounted"))
            {
                an.a(getActivity(), 0x7f07028d);
                return;
            }
            if (getActivity() != null)
            {
                (new Thread(new h(this))).start();
                return;
            }
        }
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        char c1 = 'd';
        int i1 = getResources().getDisplayMetrics().widthPixels;
        if (i1 <= 480)
        {
            c1 = 'F';
        } else
        if (i1 >= 1440)
        {
            c1 = '\226';
        }
        k = new kp(getActivity(), c1, j);
        bundle = new android.graphics.BitmapFactory.Options();
        bundle.inScaled = false;
        try
        {
            bundle = BitmapFactory.decodeResource(getResources(), 0x7f020086, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            bundle = null;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            bundle = null;
        }
        k.a(bundle);
        h = new i(this, (byte)0);
        a.a(h);
        i = true;
        g();
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = (MainPage)activity;
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131559089: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Close/Fast");
            af.b(getActivity(), "SNS", "click", "Main/Create/Close/Fast", Long.valueOf(1L));
            d.y();
            return;

        case 2131559082: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Grid");
            af.b(getActivity(), "SNS", "click", "Main/Create/Grid", Long.valueOf(1L));
            d.r();
            return;

        case 2131559083: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/PhotoEditor");
            af.b(getActivity(), "SNS", "click", "Main/Create/PhotoEditor", Long.valueOf(1L));
            d.q();
            return;

        case 2131559084: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/SelfCam");
            af.b(getActivity(), "SNS", "click", "Main/Create/SelfCam", Long.valueOf(1L));
            d.t();
            return;

        case 2131559085: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Video");
            af.b(getActivity(), "SNS", "click", "Main/Create/Video", Long.valueOf(1L));
            d.s();
            return;

        case 2131559086: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Scrapbook");
            af.b(getActivity(), "SNS", "click", "Main/Create/Scrapbook", Long.valueOf(1L));
            d.v();
            return;

        case 2131559087: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Template");
            af.b(getActivity(), "SNS", "click", "Main/Create/Template", Long.valueOf(1L));
            d.w();
            return;

        case 2131559088: 
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Filmstrip");
            af.b(getActivity(), "SNS", "click", "Main/Create/Filmstrip", Long.valueOf(1L));
            d.u();
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b0, viewgroup, false);
        layoutinflater.findViewById(0x7f0d02a5).setOnClickListener(this);
        a = (HListView)layoutinflater.findViewById(0x7f0d02a7);
        b = (HorizontalScrollView)layoutinflater.findViewById(0x7f0d02a8);
        c = (ImageView)layoutinflater.findViewById(0x7f0d02b1);
        e = layoutinflater.findViewById(0x7f0d0171);
        c.setOnClickListener(this);
        a.a(this);
        layoutinflater.findViewById(0x7f0d02aa).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d02ab).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d02ac).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d02ad).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d02ae).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d02af).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d02b0).setOnClickListener(this);
        f = layoutinflater;
        return layoutinflater;
    }
}
