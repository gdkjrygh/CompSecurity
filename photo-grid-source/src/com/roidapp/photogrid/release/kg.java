// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.cc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            kk, kl, ImageSelector, ig, 
//            ki, kj, kh

public class kg extends Fragment
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    private ImageSelector a;
    private ImageView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private RelativeLayout g;
    private ProgressBar h;
    private ig i;
    private HashMap j;
    private Bitmap k;
    private GestureDetector l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private String q;
    private int r;
    private Handler s;

    public kg()
    {
        j = new HashMap();
        s = new kk(this);
    }

    static int a(kg kg1, int i1)
    {
        kg1.o = i1;
        return i1;
    }

    static Bitmap a(kg kg1, Bitmap bitmap)
    {
        kg1.k = bitmap;
        return bitmap;
    }

    static ig a(kg kg1, ig ig1)
    {
        kg1.i = ig1;
        return ig1;
    }

    static String a(kg kg1, String s1)
    {
        kg1.q = s1;
        return s1;
    }

    private void a(ig ig1, int i1, int j1)
    {
        if (ig1 == null)
        {
            return;
        }
        Log.e("start load bitmap", "start...................");
        if (b != null)
        {
            b.setImageBitmap(null);
        }
        if (k != null && !k.isRecycled())
        {
            k.recycle();
        }
        k = null;
        if (h != null)
        {
            h.setVisibility(0);
        }
        (new Thread(new kl(this, ig1, i1, j1))).start();
    }

    static void a(kg kg1, ig ig1, int i1, int j1)
    {
        kg1.a(ig1, i1, j1);
    }

    static boolean a(kg kg1)
    {
        return kg1.p;
    }

    static boolean a(kg kg1, boolean flag)
    {
        kg1.p = flag;
        return flag;
    }

    static int b(kg kg1)
    {
        return kg1.o;
    }

    static int b(kg kg1, int i1)
    {
        kg1.r = i1;
        return i1;
    }

    static int c(kg kg1, int i1)
    {
        kg1.m = i1;
        return i1;
    }

    static ImageSelector c(kg kg1)
    {
        return kg1.a;
    }

    private void c()
    {
        if (a != null)
        {
            Object obj = a.b();
            if (obj != null)
            {
                ig ig1;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); j.put(ig1.n, ig1))
                {
                    ig1 = (ig)((Iterator) (obj)).next();
                }

            }
        }
    }

    private int d()
    {
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (a != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (a.b() != null)
            {
                i1 = a.b().size();
            }
        }
        return i1;
    }

    static int d(kg kg1, int i1)
    {
        kg1.n = i1;
        return i1;
    }

    static ig d(kg kg1)
    {
        return kg1.i;
    }

    static int e(kg kg1)
    {
        return kg1.m;
    }

    private void e()
    {
label0:
        {
            if (a != null && k != null && !k.isRecycled())
            {
                if (a.f())
                {
                    break label0;
                }
                TextView textview = f;
                int i1 = r + 1;
                r = i1;
                textview.setText(String.valueOf(i1));
                a.a(i);
                if (r > 0)
                {
                    c.setVisibility(0);
                    f.setVisibility(0);
                } else
                {
                    c.setVisibility(8);
                    f.setVisibility(8);
                }
                e.setText((new StringBuilder()).append(d()).append("/").append(a.a).toString());
            }
            return;
        }
        a.a();
    }

    static int f(kg kg1)
    {
        return kg1.n;
    }

    static ProgressBar g(kg kg1)
    {
        return kg1.h;
    }

    static Bitmap h(kg kg1)
    {
        return kg1.k;
    }

    static ImageView i(kg kg1)
    {
        return kg1.b;
    }

    static RelativeLayout j(kg kg1)
    {
        return kg1.g;
    }

    static ImageView k(kg kg1)
    {
        return kg1.c;
    }

    static int l(kg kg1)
    {
        return kg1.r;
    }

    static TextView m(kg kg1)
    {
        return kg1.f;
    }

    static Handler n(kg kg1)
    {
        return kg1.s;
    }

    public final void a()
    {
        r = 0;
        c.setVisibility(8);
        f.setVisibility(8);
        e.setText((new StringBuilder()).append(d()).append("/").append(a.a).toString());
    }

    public final void a(String s1)
    {
        if (a != null)
        {
            e.setText((new StringBuilder()).append(d()).append("/").append(a.a).toString());
        }
        while (s1 == null || !s1.equals(q) || a == null) 
        {
            return;
        }
        s1 = f;
        int i1 = r - 1;
        r = i1;
        s1.setText(String.valueOf(i1));
        if (r > 0)
        {
            c.setVisibility(0);
            f.setVisibility(0);
            return;
        } else
        {
            c.setVisibility(8);
            f.setVisibility(8);
            return;
        }
    }

    public final void a(String s1, int i1, int j1)
    {
        i = new ig(s1);
        o = i1;
        q = s1;
        r = j1;
    }

    protected final void b()
    {
        com.roidapp.photogrid.common.b.a("FragmentImagePreview/onDestroyByUser");
        if (b != null)
        {
            b.setImageBitmap(null);
        }
        if (k != null && !k.isRecycled())
        {
            k.recycle();
        }
        k = null;
    }

    public void onAttach(Activity activity)
    {
        a = (ImageSelector)activity;
        super.onAttach(activity);
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 4: default 48
    //                   2131558442: 73
    //                   2131559113: 48
    //                   2131559114: 61
    //                   2131559117: 49;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        return;
_L4:
        if (p)
        {
            e();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (p)
        {
            e();
            return;
        }
        if (true) goto _L1; else goto _L2
_L2:
        b();
        a.a(false);
        return;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = layoutinflater.inflate(0x7f0300b5, viewgroup, false);
        layoutinflater = bundle;
_L2:
        c();
        d = (TextView)layoutinflater.findViewById(0x7f0d02ca);
        e = (TextView)layoutinflater.findViewById(0x7f0d002a);
        b = (ImageView)layoutinflater.findViewById(0x7f0d02ce);
        c = (ImageView)layoutinflater.findViewById(0x7f0d02cf);
        f = (TextView)layoutinflater.findViewById(0x7f0d02d0);
        g = (RelativeLayout)layoutinflater.findViewById(0x7f0d02cd);
        h = (ProgressBar)layoutinflater.findViewById(0x7f0d0094);
        layoutinflater.findViewById(0x7f0d02c9).setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        if (a != null)
        {
            viewgroup = a.b();
            if (viewgroup != null)
            {
                e.setText((new StringBuilder()).append(viewgroup.size()).append("/").append(a.a).toString());
            }
            l = new GestureDetector(a, new ki(this));
            g.setOnClickListener(this);
            g.setOnLongClickListener(new kj(this));
            g.setOnTouchListener(this);
        }
        m = getResources().getDisplayMetrics().widthPixels;
        if (az.g == 0)
        {
            viewgroup = new Rect();
            getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(viewgroup);
            if (((Rect) (viewgroup)).top > 0)
            {
                az.g = ((Rect) (viewgroup)).top;
            }
        }
        n = getResources().getDisplayMetrics().heightPixels - az.g - getResources().getDimensionPixelSize(0x7f0900f5) - getResources().getDimensionPixelSize(0x7f0900ee);
        if (i != null)
        {
            a(i, m, n);
            if (isAdded())
            {
                viewgroup = PreferenceManager.getDefaultSharedPreferences(getActivity());
                bundle = com/roidapp/photogrid/release/kg.getSimpleName();
                if (!viewgroup.getBoolean(bundle, false))
                {
                    viewgroup.edit().putBoolean(bundle, true).apply();
                    viewgroup = new Dialog(getActivity(), 0x7f0b001d);
                    try
                    {
                        viewgroup.setContentView(0x7f0300f1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (ViewGroup viewgroup)
                    {
                        viewgroup.printStackTrace();
                        return layoutinflater;
                    }
                    // Misplaced declaration of an exception variable
                    catch (ViewGroup viewgroup)
                    {
                        viewgroup.printStackTrace();
                        return layoutinflater;
                    }
                    viewgroup.findViewById(0x7f0d0279).setOnClickListener(new kh(this, viewgroup));
                    viewgroup.show();
                }
            }
        }
        return layoutinflater;
        bundle;
        System.gc();
        System.gc();
        try
        {
            layoutinflater = layoutinflater.inflate(0x7f0300b5, viewgroup, false);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            layoutinflater.printStackTrace();
            (new cc(a)).a();
            layoutinflater = new TextView(a);
            layoutinflater.setText(" ");
            return layoutinflater;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onDestroy()
    {
        com.roidapp.photogrid.common.b.a("FragmentImagePreview/onDestroy");
        super.onDestroy();
    }

    public void onResume()
    {
        com.roidapp.photogrid.common.b.a("FragmentImagePreview/onResume");
        if (i == null && a != null)
        {
            b();
            a.a(false);
        }
        super.onResume();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (l != null)
        {
            return l.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }
}
