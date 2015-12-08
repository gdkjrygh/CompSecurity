// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Picture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.f.b;
import com.roidapp.imagelib.f.d;
import com.roidapp.imagelib.filter.av;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import com.roidapp.imagelib.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            p, f, h, TemplateClipView, 
//            FreeCropView, i, n, g, 
//            Magnifier, j, d

public final class e extends Fragment
    implements android.view.View.OnClickListener, p
{

    private Handler A;
    public int a;
    protected String b;
    protected View c;
    private final int d = 1024;
    private final int e = 1025;
    private FreeCropView f;
    private Magnifier g;
    private RelativeLayout h;
    private Integer i[];
    private av j;
    private final int k = 0;
    private final int l = 1;
    private Bitmap m;
    private n n;
    private com.roidapp.imagelib.freecrop.d o;
    private volatile boolean p;
    private boolean q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TemplateClipView u;
    private FrameLayout v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public e()
    {
        a = 1;
        p = false;
        q = true;
        w = -1;
        z = true;
        A = new com.roidapp.imagelib.freecrop.f(this);
    }

    static int a(e e1, int i1)
    {
        e1.x = i1;
        return i1;
    }

    static Bitmap a(e e1, Bitmap bitmap)
    {
        e1.m = bitmap;
        return bitmap;
    }

    static av a(e e1)
    {
        return e1.j;
    }

    static com.roidapp.imagelib.freecrop.d a(e e1, com.roidapp.imagelib.freecrop.d d1)
    {
        e1.o = d1;
        return d1;
    }

    static void a(e e1, Throwable throwable, String s1)
    {
        e1.A.post(new com.roidapp.imagelib.freecrop.h(e1, throwable, s1));
    }

    static int b(e e1, int i1)
    {
        e1.y = i1;
        return i1;
    }

    private void b(int i1)
    {
        if (u.getParent() == null)
        {
            v.addView(u);
        }
        if (n == null)
        {
            c();
        }
        q = false;
        f.a(n);
        if (i.a != i1) goto _L2; else goto _L1
_L1:
        u.a(0);
_L4:
        f.invalidate();
        return;
_L2:
        if (com.roidapp.imagelib.freecrop.i.b == i1)
        {
            u.a(1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean b(e e1)
    {
        e1.p = false;
        return false;
    }

    private void c()
    {
        int i1 = x;
        int j1 = y;
        n = new n(getActivity(), m, i1, j1);
        n.a(f);
    }

    static void c(e e1)
    {
        e1.f.getViewTreeObserver().addOnGlobalLayoutListener(new com.roidapp.imagelib.freecrop.g(e1));
    }

    static boolean d(e e1)
    {
        return e1.q;
    }

    static FreeCropView e(e e1)
    {
        return e1.f;
    }

    static int f(e e1)
    {
        return e1.x;
    }

    static int g(e e1)
    {
        return e1.y;
    }

    static Bitmap h(e e1)
    {
        return e1.m;
    }

    static com.roidapp.imagelib.freecrop.d i(e e1)
    {
        return e1.o;
    }

    static Magnifier j(e e1)
    {
        return e1.g;
    }

    static Integer[] k(e e1)
    {
        return e1.i;
    }

    static Handler l(e e1)
    {
        return e1.A;
    }

    static n m(e e1)
    {
        return e1.n;
    }

    public final void a(int i1)
    {
        ImageLibrary.a().a("FreeCropFrag/setClipImage");
        if (i1 == -1 && n != null)
        {
            n.a(null);
            f.invalidate();
            return;
        }
        Object obj = com.roidapp.imagelib.f.d.a(getResources(), i1);
        Picture picture = ((b) (obj)).a();
        obj = ((b) (obj)).b();
        if (n == null)
        {
            c();
        }
        if (n != null && obj != null)
        {
            int j1 = m.getWidth();
            int k1 = m.getHeight();
            int l1 = picture.getWidth();
            int i2 = picture.getHeight();
            float f1 = Math.min((float)j1 / (float)l1, (float)k1 / (float)i2) / 2.0F;
            n.b((float)j1 / 2.0F - ((float)l1 * f1) / 2.0F, (float)k1 / 2.0F - ((float)i2 * f1) / 2.0F, f1);
            if (i1 == w)
            {
                n.a();
            }
            ((Path) (obj)).transform(n.j());
            n.a(l1, i2);
            n.a(((Path) (obj)));
            f.a(n);
            q = false;
        }
        f.invalidate();
        w = i1;
    }

    public final boolean a()
    {
        ImageLibrary.a().a("FreeCropFrag/saveImage");
        p = true;
        f.a();
        f.setVisibility(8);
        ImageLibrary.a().a("FreeCropFrag/saveBtn");
        Message message = Message.obtain(A, 1024);
        A.sendMessage(message);
        return true;
    }

    public final boolean b()
    {
        return p;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof av)
        {
            j = (av)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet ImageEditCropFragment.OnImageEditCropListener").toString());
        }
    }

    public final void onClick(View view)
    {
        if (!p)
        {
            int i1 = view.getId();
            if (i1 != g.N)
            {
                if (h.isShown())
                {
                    h.setVisibility(8);
                }
                if (z)
                {
                    an.c(new WeakReference(getActivity()), getString(j.j));
                    z = false;
                }
            }
            if (i1 == g.N)
            {
                if (!h.isShown() && f.b)
                {
                    h.setVisibility(0);
                }
                f.a(o);
                f.invalidate();
                u.b();
                u.a();
                q = true;
                r.setBackgroundResource(com.roidapp.imagelib.d.j);
                s.setBackgroundResource(f.o);
                t.setBackgroundResource(f.o);
                return;
            }
            if (i1 == g.Q)
            {
                b(i.a);
                r.setBackgroundResource(f.o);
                s.setBackgroundResource(com.roidapp.imagelib.d.j);
                t.setBackgroundResource(f.o);
                return;
            }
            if (i1 == g.O)
            {
                b(com.roidapp.imagelib.freecrop.i.b);
                r.setBackgroundResource(f.o);
                s.setBackgroundResource(f.o);
                t.setBackgroundResource(com.roidapp.imagelib.d.j);
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ImageLibrary.a().a("FreeCropFrag/onCreate");
        bundle = getArguments();
        if (bundle != null)
        {
            b = bundle.getString("edit_image_path");
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        float f1;
        ImageLibrary.a().a("FreeCropFrag/onCreateView");
        c = layoutinflater.inflate(h.j, viewgroup, false);
        layoutinflater = c;
        ImageLibrary.a().a("FreeCropFrag/initView");
        f = (FreeCropView)layoutinflater.findViewById(g.aB);
        h = (RelativeLayout)layoutinflater.findViewById(g.aG);
        g = (Magnifier)layoutinflater.findViewById(g.aH);
        viewgroup = new android.widget.RelativeLayout.LayoutParams(g.a(), g.a());
        h.setLayoutParams(viewgroup);
        f.a(g, h);
        v = (FrameLayout)layoutinflater.findViewById(g.az);
        u = new TemplateClipView(getActivity());
        u.setHorizontalScrollBarEnabled(false);
        u.a(this);
        getActivity();
        layoutinflater = b;
        viewgroup = new ArrayList();
        f1 = (float)Runtime.getRuntime().maxMemory() / 1024F / 1024F;
        if (f1 < 96F) goto _L2; else goto _L1
_L1:
        viewgroup.add(0, Integer.valueOf(1660));
        viewgroup.add(1, Integer.valueOf(960));
        viewgroup.add(2, Integer.valueOf(640));
_L4:
        bundle = new Integer[viewgroup.size()];
        viewgroup.toArray(bundle);
        layoutinflater = com.roidapp.imagelib.b.d.a(layoutinflater, bundle);
        (new StringBuilder("Load min length is ")).append(Arrays.toString(layoutinflater));
        i = layoutinflater;
        p = true;
        (new Thread(new com.roidapp.imagelib.freecrop.j(this, b, 0))).start();
        layoutinflater = c;
        ImageLibrary.a().a("FreeCropFrag/initControls");
        r = (TextView)layoutinflater.findViewById(g.N);
        r.setOnClickListener(this);
        s = (TextView)layoutinflater.findViewById(g.Q);
        s.setOnClickListener(this);
        t = (TextView)layoutinflater.findViewById(g.O);
        t.setOnClickListener(this);
        r.setBackgroundResource(com.roidapp.imagelib.d.j);
        s.setBackgroundResource(f.o);
        t.setBackgroundResource(f.o);
        return c;
_L2:
        if (f1 < 96F && f1 >= 64F)
        {
            viewgroup.add(0, Integer.valueOf(1280));
            viewgroup.add(1, Integer.valueOf(960));
            viewgroup.add(2, Integer.valueOf(640));
        } else
        if (f1 < 64F && f1 >= 32F)
        {
            viewgroup.add(0, Integer.valueOf(1024));
            viewgroup.add(1, Integer.valueOf(720));
            viewgroup.add(2, Integer.valueOf(480));
        } else
        if (f1 < 32F)
        {
            viewgroup.add(0, Integer.valueOf(640));
            viewgroup.add(1, Integer.valueOf(480));
            viewgroup.add(2, Integer.valueOf(320));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onDestroyView()
    {
        com.roidapp.imagelib.b.c.a(m);
        super.onDestroyView();
    }

    public final void onDetach()
    {
        super.onDetach();
        j = null;
    }
}
