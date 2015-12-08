// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import com.roidapp.imagelib.k;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageGuideFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            s, r, ac, v, 
//            q, u, t, n, 
//            o, p

public final class m extends Fragment
    implements android.view.View.OnClickListener, jp.co.cyberagent.android.gpuimage.GPUImageRenderer.OnDrawDoneListener
{

    private int A;
    private boolean B;
    private Handler C;
    private final AtomicBoolean D = new AtomicBoolean(true);
    private boolean E;
    protected View a;
    protected String b;
    private final String c = "SkinFragment";
    private final int d = 1026;
    private final int e = 1027;
    private final int f = 1028;
    private final int g = 1029;
    private GPUImageView h;
    private boolean i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private TextView o;
    private ImageView p;
    private ViewGroup q;
    private v r;
    private ac s;
    private GPUImageGuideFilter t;
    private t u;
    private int v;
    private int w;
    private int x;
    private int y;
    private String z;

    public m()
    {
        v = -1;
        w = -1;
        B = true;
        C = new s(this, (byte)0);
        E = true;
    }

    static int a(m m1, int i1)
    {
        m1.v = i1;
        return i1;
    }

    static t a(m m1)
    {
        return m1.u;
    }

    static GPUImageGuideFilter a(m m1, GPUImageGuideFilter gpuimageguidefilter)
    {
        m1.t = gpuimageguidefilter;
        return gpuimageguidefilter;
    }

    private void a(View view)
    {
        if (q.getChildCount() > 0)
        {
            q.removeAllViews();
        }
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        q.addView(view, layoutparams);
    }

    static void a(m m1, Throwable throwable, String s1)
    {
        m1.a(throwable, s1);
    }

    private void a(Throwable throwable, String s1)
    {
        C.post(new r(this, throwable, s1));
    }

    private void a(boolean flag)
    {
        if (t == null)
        {
            t = new GPUImageGuideFilter(10F, 0.0F, v, w);
            if (flag)
            {
                h.setFilter(t);
            } else
            {
                h.setFilterNoApply(t);
            }
            t.setEps(((float)x * 0.004F) / 100F);
            t.setAlpha((float)y / 100F);
            h.requestRender();
        }
    }

    static int b(m m1, int i1)
    {
        m1.w = i1;
        return i1;
    }

    static AtomicBoolean b(m m1)
    {
        return m1.D;
    }

    static int c(m m1)
    {
        return m1.y;
    }

    private void c()
    {
        a(true);
        if (s == null)
        {
            s = new ac(z, getActivity(), h, o, t, m, n);
            s.a(u);
            s.a(y);
        }
        if (r == null)
        {
            r = new v(z, getActivity(), h, o, t, m, n);
            r.a(u);
            r.a(x);
        }
    }

    static int d(m m1)
    {
        return m1.x;
    }

    static Handler e(m m1)
    {
        return m1.C;
    }

    static void f(m m1)
    {
        m1.c();
    }

    static void g(m m1)
    {
        if (m1.q.getChildCount() > 0)
        {
            m1.q.removeAllViews();
        }
        if (m1.q.isShown())
        {
            m1.q.setVisibility(8);
        }
        m1.j.setBackgroundResource(d.k);
        m1.l.setBackgroundResource(d.k);
    }

    static View h(m m1)
    {
        return m1.m;
    }

    static ac i(m m1)
    {
        return m1.s;
    }

    static v j(m m1)
    {
        return m1.r;
    }

    static GPUImageView k(m m1)
    {
        return m1.h;
    }

    static View l(m m1)
    {
        return m1.n;
    }

    static void m(m m1)
    {
        Object obj = m1.getActivity();
        if (obj != null)
        {
            m1.E = false;
            Dialog dialog = new Dialog(((android.content.Context) (obj)), k.a);
            obj = new ImageView(((android.content.Context) (obj)));
            ((ImageView) (obj)).setImageResource(f.bd);
            ((ImageView) (obj)).setBackgroundColor(0);
            android.view.WindowManager.LayoutParams layoutparams = dialog.getWindow().getAttributes();
            DisplayMetrics displaymetrics = m1.getResources().getDisplayMetrics();
            layoutparams.width = (int)((double)displaymetrics.widthPixels * 0.5D);
            layoutparams.height = (int)((double)displaymetrics.heightPixels * 0.40000000000000002D);
            dialog.setContentView(((View) (obj)));
            dialog.show();
            (new Handler()).postDelayed(new q(m1, dialog), 500L);
        }
    }

    static GPUImageGuideFilter n(m m1)
    {
        return m1.t;
    }

    static ImageView o(m m1)
    {
        return m1.p;
    }

    static boolean p(m m1)
    {
        m1.E = true;
        return true;
    }

    public final boolean a()
    {
        if (m == null)
        {
            return false;
        } else
        {
            return m.isSelected();
        }
    }

    public final boolean b()
    {
        if (D.get())
        {
            return false;
        }
        D.set(true);
        h.setDrawListener(null);
        if (s != null)
        {
            y = s.getProgress();
        }
        if (r != null)
        {
            x = r.getProgress();
        }
        if (q.isShown())
        {
            q.setVisibility(8);
        }
        if (q.getChildCount() > 0)
        {
            q.removeAllViews();
        }
        j.setBackgroundResource(d.k);
        l.setBackgroundResource(d.k);
        (new Thread(new u(this, getActivity(), y, x, 0))).start();
        return true;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof t)
        {
            u = (t)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet SkinFragment.OnImageReTouchListener").toString());
        }
    }

    public final void onClick(View view)
    {
        int i1;
        i1 = view.getId();
        break MISSING_BLOCK_LABEL_5;
_L2:
        do
        {
            return;
        } while (D.get() || u == null);
        j.setBackgroundResource(d.k);
        l.setBackgroundResource(d.k);
        if (A == i1)
        {
            if (q.isShown())
            {
                q.setVisibility(8);
                return;
            }
            q.setVisibility(0);
        } else
        {
            q.setVisibility(0);
        }
        if (i1 == g.d)
        {
            q.setVisibility(8);
        }
        if (i1 == g.aP)
        {
            l.setBackgroundResource(d.j);
            c();
            a(r);
        } else
        if (i1 == g.aS)
        {
            j.setBackgroundResource(d.j);
            c();
            a(s);
        } else
        if (i1 == g.d)
        {
            if (!E)
            {
                continue; /* Loop/switch isn't completed */
            }
            u.a(b);
        }
        A = i1;
        return;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            i = bundle.getBoolean("auto_retouch");
            b = bundle.getString("image_path");
            x = bundle.getInt("smoother_bar");
            y = bundle.getInt("whiten_bar");
            z = bundle.getString("modeStr");
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (!com.roidapp.baselib.c.n.b(getActivity()))
        {
            a(new IllegalStateException("OpenGL ES 2.0 is not supported on this phone."), "");
            return null;
        }
        try
        {
            android/opengl/GLSurfaceView.getMethod("setEGLContextClientVersion", new Class[] {
                Integer.TYPE
            });
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            layoutinflater.printStackTrace();
            a(layoutinflater, "");
            return null;
        }
        D.set(true);
        a = layoutinflater.inflate(h.n, viewgroup, false);
        layoutinflater = a;
        ImageLibrary.a().a("SkinFrag/initView");
        h = (GPUImageView)layoutinflater.findViewById(g.aL);
        h.setFile(new File(b), new com.roidapp.imagelib.retouch.n(this));
        h.setDrawListener(this);
        layoutinflater = getResources().getDisplayMetrics();
        v = ((DisplayMetrics) (layoutinflater)).widthPixels;
        w = ((DisplayMetrics) (layoutinflater)).heightPixels;
        if (x > 0 || y > 0)
        {
            a(false);
        } else
        {
            h.setFilterNoApply(new GPUImageFilter());
        }
        layoutinflater = a;
        n = layoutinflater.findViewById(g.n);
        m = layoutinflater.findViewById(g.b);
        if (i)
        {
            n.setVisibility(0);
            m.setSelected(true);
        } else
        {
            n.setVisibility(8);
            m.setSelected(false);
        }
        m.setOnClickListener(new o(this));
        j = layoutinflater.findViewById(g.aS);
        j.setOnClickListener(this);
        k = layoutinflater.findViewById(g.d);
        k.setOnClickListener(this);
        l = layoutinflater.findViewById(g.aP);
        l.setOnClickListener(this);
        q = (ViewGroup)layoutinflater.findViewById(g.E);
        o = (TextView)layoutinflater.findViewById(g.aN);
        p = (ImageView)layoutinflater.findViewById(g.a);
        p.setClickable(true);
        p.setOnTouchListener(new p(this));
        return a;
    }

    public final void onDrawLoadDone()
    {
        Message message = Message.obtain(C, 1029);
        C.sendMessage(message);
    }

    public final void onPause()
    {
        super.onPause();
        if (h != null)
        {
            h.releaseGLSurfaceView();
            h.onPause();
        }
    }

    public final void onPreviewFailed()
    {
    }

    public final void onResume()
    {
        super.onResume();
        if (h != null)
        {
            if (u != null)
            {
                u.a();
            }
            h.onResume();
        }
    }
}
