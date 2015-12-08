// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.RelativeLayout;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import com.roidapp.imagelib.k;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            f, d, w, BlemishImageView, 
//            l, g, t, e, 
//            Magnifier, c, b

public final class a extends Fragment
    implements android.view.View.OnClickListener
{

    private int A;
    private int B;
    private int C;
    private int D;
    protected View a;
    protected BlemishImageView b;
    protected String c;
    private final String d = "BlemishFragment";
    private Handler e;
    private t f;
    private Integer g[];
    private Bitmap h;
    private w i;
    private Bitmap j;
    private Magnifier k;
    private RelativeLayout l;
    private View m;
    private View n;
    private View o;
    private View p;
    private View q;
    private int r;
    private int s;
    private CheckedTextView t;
    private CheckedTextView u;
    private CheckedTextView v;
    private CheckedTextView w;
    private CheckedTextView x;
    private volatile boolean y;
    private int z;

    public a()
    {
        e = new f(this, (byte)0);
        y = false;
    }

    static int a(a a1)
    {
        return a1.r;
    }

    static Bitmap a(a a1, Bitmap bitmap)
    {
        a1.h = bitmap;
        return bitmap;
    }

    static void a(a a1, Throwable throwable, String s1)
    {
        a1.e.post(new com.roidapp.imagelib.retouch.d(a1, throwable, s1));
    }

    static int b(a a1)
    {
        return a1.s;
    }

    static t c(a a1)
    {
        return a1.f;
    }

    static Bitmap d(a a1)
    {
        return a1.h;
    }

    static boolean e(a a1)
    {
        return a1.y;
    }

    static Integer[] f(a a1)
    {
        return a1.g;
    }

    static boolean g(a a1)
    {
        a1.y = false;
        return false;
    }

    static Handler h(a a1)
    {
        return a1.e;
    }

    public final void a()
    {
        if (c())
        {
            i.d();
        }
    }

    public final void b()
    {
        if (d())
        {
            i.e();
        }
    }

    public final boolean c()
    {
        return i != null && i.b();
    }

    public final boolean d()
    {
        return i != null && i.c();
    }

    public final boolean e()
    {
        y = true;
        b.a(true);
        if (b.g())
        {
            com.roidapp.imagelib.retouch.l.f().c(i.f());
            j = b.a();
            (new Thread(new com.roidapp.imagelib.retouch.g(this, j))).start();
            return true;
        } else
        {
            return false;
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof t)
        {
            f = (t)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet SkinFragment.OnImageReTouchListener").toString());
        }
    }

    public final void onClick(View view)
    {
        if (!y)
        {
            int i1 = view.getId();
            m.setBackgroundResource(d.k);
            n.setBackgroundResource(d.k);
            o.setBackgroundResource(d.k);
            p.setBackgroundResource(d.k);
            q.setBackgroundResource(d.k);
            t.setChecked(false);
            u.setChecked(false);
            v.setChecked(false);
            w.setChecked(false);
            x.setChecked(false);
            if (i1 == g.r)
            {
                m.setBackgroundResource(d.j);
                t.setChecked(true);
                b.a(z);
                return;
            }
            if (i1 == g.s)
            {
                n.setBackgroundResource(d.j);
                u.setChecked(true);
                b.a(A);
                return;
            }
            if (i1 == g.t)
            {
                o.setBackgroundResource(d.j);
                v.setChecked(true);
                b.a(B);
                return;
            }
            if (i1 == g.u)
            {
                p.setBackgroundResource(d.j);
                w.setChecked(true);
                b.a(C);
                return;
            }
            if (i1 == g.v)
            {
                q.setBackgroundResource(d.j);
                x.setChecked(true);
                b.a(D);
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            c = bundle.getString("image_path");
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        float f1;
        a = layoutinflater.inflate(h.a, viewgroup, false);
        b = (BlemishImageView)a.findViewById(g.e);
        getActivity();
        layoutinflater = c;
        viewgroup = new ArrayList();
        f1 = (float)Runtime.getRuntime().maxMemory() / 1024F / 1024F;
        if (f1 < 96F) goto _L2; else goto _L1
_L1:
        viewgroup.add(0, Integer.valueOf(4096));
        viewgroup.add(1, Integer.valueOf(2048));
        viewgroup.add(2, Integer.valueOf(1024));
        viewgroup.add(3, Integer.valueOf(640));
        viewgroup.add(4, Integer.valueOf(320));
_L4:
        bundle = new Integer[viewgroup.size()];
        viewgroup.toArray(bundle);
        layoutinflater = com.roidapp.imagelib.b.d.a(layoutinflater, bundle);
        (new StringBuilder("Load min length is ")).append(Arrays.toString(layoutinflater));
        g = layoutinflater;
        z = getResources().getDimensionPixelSize(e.a);
        A = getResources().getDimensionPixelSize(e.b);
        B = getResources().getDimensionPixelSize(e.c);
        C = getResources().getDimensionPixelSize(e.d);
        D = getResources().getDimensionPixelSize(e.e);
        i = b;
        b.a(f);
        b.a(true);
        r = getResources().getDisplayMetrics().widthPixels;
        s = getResources().getDisplayMetrics().heightPixels;
        (new Thread(new com.roidapp.imagelib.retouch.e(this, c, 0, r, s))).start();
        layoutinflater = a;
        l = (RelativeLayout)layoutinflater.findViewById(g.aI);
        k = (Magnifier)layoutinflater.findViewById(g.aJ);
        viewgroup = new android.widget.RelativeLayout.LayoutParams(k.a(), k.a());
        l.setLayoutParams(viewgroup);
        m = layoutinflater.findViewById(g.r);
        m.setOnClickListener(this);
        n = layoutinflater.findViewById(g.s);
        n.setOnClickListener(this);
        o = layoutinflater.findViewById(g.t);
        o.setOnClickListener(this);
        p = layoutinflater.findViewById(g.u);
        p.setOnClickListener(this);
        q = layoutinflater.findViewById(g.v);
        q.setOnClickListener(this);
        t = (CheckedTextView)m.findViewById(g.w);
        u = (CheckedTextView)n.findViewById(g.x);
        v = (CheckedTextView)o.findViewById(g.y);
        w = (CheckedTextView)p.findViewById(g.z);
        x = (CheckedTextView)q.findViewById(g.A);
        layoutinflater = layoutinflater.findViewById(g.f);
        layoutinflater.setOnTouchListener(new c(this, layoutinflater));
        b.a(k, l);
        m.setBackgroundResource(d.j);
        t.setChecked(true);
        b.a(z);
        return a;
_L2:
        if (f1 < 96F && f1 >= 64F)
        {
            viewgroup.add(0, Integer.valueOf(2048));
            viewgroup.add(1, Integer.valueOf(1024));
            viewgroup.add(2, Integer.valueOf(640));
        } else
        if (f1 < 64F && f1 >= 32F)
        {
            viewgroup.add(0, Integer.valueOf(1660));
            viewgroup.add(1, Integer.valueOf(960));
            viewgroup.add(2, Integer.valueOf(640));
            viewgroup.add(3, Integer.valueOf(320));
        } else
        if (f1 < 32F)
        {
            viewgroup.add(0, Integer.valueOf(640));
            viewgroup.add(1, Integer.valueOf(480));
            viewgroup.add(2, Integer.valueOf(320));
            viewgroup.add(3, Integer.valueOf(160));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (!view.getBoolean("key_blemish_new", true)) goto _L2; else goto _L1
_L1:
        if (!isAdded())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        bundle = new Dialog(getActivity(), k.a);
        bundle.setContentView(h.b);
        bundle.findViewById(g.j).setOnClickListener(new b(this, bundle));
        bundle.show();
_L4:
        view.edit().putBoolean("key_blemish_new", false).apply();
_L2:
        return;
        bundle;
        bundle.printStackTrace();
        continue; /* Loop/switch isn't completed */
        bundle;
        bundle.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
    }
}
