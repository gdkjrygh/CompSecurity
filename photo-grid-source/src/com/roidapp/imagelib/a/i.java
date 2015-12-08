// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.FilterListView;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import com.roidapp.imagelib.k;
import java.io.IOException;
import java.util.Calendar;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.Rotation;

// Referenced classes of package com.roidapp.imagelib.a:
//            e, h, j, q, 
//            v, w, k, a, 
//            o, p, m, ah, 
//            af, y, n, r, 
//            s, l, t, u

public final class i extends Fragment
    implements android.view.View.OnClickListener, e, jp.co.cyberagent.android.gpuimage.GPUImageRenderer.OnDrawDoneListener
{

    private static String X = "#0Cffffff";
    private boolean A;
    private boolean B;
    private boolean C;
    private String D;
    private y E;
    private boolean F;
    private boolean G;
    private boolean H;
    private b I;
    private volatile boolean J;
    private GPUImage K;
    private GLSurfaceView L;
    private android.hardware.Camera.Size M;
    private Animation N;
    private Animation O;
    private long P;
    private a Q;
    private FilterListView R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private final Interpolator W = new DecelerateInterpolator();
    private View Y;
    private Handler Z;
    protected View a;
    private Runnable aa;
    private Runnable ab;
    private Runnable ac;
    private Runnable ad;
    protected String b;
    private int c;
    private String d;
    private String e;
    private RelativeLayout f;
    private FrameLayout g;
    private TextView h;
    private FrameLayout i;
    private FrameLayout j;
    private FrameLayout k;
    private FrameLayout l;
    private FrameLayout m;
    private FrameLayout n;
    private CheckedTextView o;
    private RelativeLayout p;
    private RelativeLayout q;
    private ah r;
    private ImageView s;
    private ImageView t;
    private ImageView u;
    private TextView v;
    private SeekBar w;
    private SeekBar x;
    private int y;
    private boolean z;

    public i()
    {
        y = h.a;
        z = true;
        A = false;
        B = false;
        C = false;
        G = false;
        I = new b();
        J = false;
        b = "";
        P = 0L;
        Z = new j(this);
        aa = new q(this);
        ab = new v(this);
        ac = new w(this);
        ad = new com.roidapp.imagelib.a.k(this);
    }

    static int A(i i1)
    {
        return i1.c;
    }

    static String B(i i1)
    {
        return i1.d;
    }

    static String C(i i1)
    {
        return i1.e;
    }

    static long a(i i1, long l1)
    {
        i1.P = l1;
        return l1;
    }

    static a a(i i1)
    {
        return i1.Q;
    }

    static String a(i i1, String s1)
    {
        i1.D = s1;
        return s1;
    }

    static void a(i i1, Bitmap bitmap)
    {
        i1.f();
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (bitmap.isRecycled())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        i1.L.setRenderMode(0);
        if (i1.y != h.a)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        i1.K.setRotationCamera(Rotation.NORMAL, false, true);
_L2:
        i1.K.deleteImage();
        i1.K.setImage(bitmap);
        int j1 = Math.round(360F / ((float)bitmap.getWidth() / (float)bitmap.getHeight()));
        i1.Q.a(j1, i1);
        return;
        i1.K.setRotationCamera(Rotation.NORMAL, false, false);
        if (true) goto _L2; else goto _L1
_L1:
        bitmap;
        bitmap.printStackTrace();
        i1.a(((Throwable) (bitmap)), "Capture Image Error");
    }

    static void a(i i1, Throwable throwable, String s1)
    {
        i1.a(throwable, s1);
    }

    private void a(Throwable throwable, String s1)
    {
        Z.post(new o(this, throwable, s1));
    }

    static boolean a(i i1, boolean flag)
    {
        i1.J = flag;
        return flag;
    }

    static y b(i i1)
    {
        return i1.E;
    }

    static boolean b(i i1, boolean flag)
    {
        i1.H = flag;
        return flag;
    }

    static FilterListView c(i i1)
    {
        return i1.R;
    }

    static String c()
    {
        return X;
    }

    static TextView d(i i1)
    {
        return i1.h;
    }

    private void d()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle("Camera Error");
        builder.setMessage("Failed to connect to camera service. Please restart your device or allow camera permission");
        builder.setPositiveButton("OK", new p(this));
        builder.setCancelable(false);
        builder.create().show();
    }

    static FrameLayout e(i i1)
    {
        return i1.j;
    }

    private android.widget.SeekBar.OnSeekBarChangeListener e()
    {
        return new m(this);
    }

    static TextView f(i i1)
    {
        return i1.v;
    }

    private void f()
    {
        if (r != null)
        {
            r.l();
            r = null;
        }
    }

    static SeekBar g(i i1)
    {
        return i1.x;
    }

    private boolean g()
    {
        if (r != null)
        {
            return true;
        }
        Q.b(true);
        K.clearDrawQueue();
        r = new ah(getActivity(), y, af.a, Z, K);
        if (!r.k())
        {
            break MISSING_BLOCK_LABEL_173;
        }
        int i1 = h.a;
        y = i1;
        com.roidapp.imagelib.a.h.c = i1;
_L1:
        r.a(S / 2, T / 2);
        M = r.a(L, S, T);
        Q.a(r.a(), r.b(), r.c());
        Q.c();
        Q.a(com.roidapp.imagelib.a.h.g);
        Q.a();
        return true;
        try
        {
            int j1 = com.roidapp.imagelib.a.h.b;
            y = j1;
            com.roidapp.imagelib.a.h.c = j1;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
          goto _L1
    }

    static FrameLayout h(i i1)
    {
        return i1.m;
    }

    static CheckedTextView i(i i1)
    {
        return i1.o;
    }

    static Runnable j(i i1)
    {
        return i1.aa;
    }

    static boolean k(i i1)
    {
        return i1.J;
    }

    static ah l(i i1)
    {
        return i1.r;
    }

    static long m(i i1)
    {
        return i1.P;
    }

    static ImageView n(i i1)
    {
        return i1.s;
    }

    static Animation o(i i1)
    {
        return i1.N;
    }

    static int p(i i1)
    {
        return i1.S;
    }

    static int q(i i1)
    {
        return i1.T;
    }

    static Runnable r(i i1)
    {
        return i1.ab;
    }

    static Handler s(i i1)
    {
        return i1.Z;
    }

    static RelativeLayout t(i i1)
    {
        return i1.p;
    }

    static Runnable u(i i1)
    {
        return i1.ac;
    }

    static Runnable v(i i1)
    {
        return i1.ad;
    }

    static SeekBar w(i i1)
    {
        return i1.w;
    }

    static Animation x(i i1)
    {
        return i1.O;
    }

    static void y(i i1)
    {
        i1.f();
    }

    static String z(i i1)
    {
        return i1.D;
    }

    public final void a(Bitmap bitmap)
    {
        Object obj;
        Object obj1;
        if (Q != null)
        {
            Q.g();
        }
        obj = ImageLibrary.a().a(getActivity());
        obj = (new StringBuilder()).append(((String) (obj)));
        ImageLibrary.a();
        obj = ((StringBuilder) (obj)).append(ImageLibrary.b()).toString();
        obj1 = (new StringBuilder(".PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        getActivity();
        obj1 = com.roidapp.imagelib.b.d.a(bitmap, ((String) (obj)), ((String) (obj1)), android.graphics.Bitmap.CompressFormat.JPEG);
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
        bitmap = Message.obtain(Z, 5, obj1);
        Z.sendMessage(bitmap);
        return;
        Object obj2;
        obj2;
        ((IOException) (obj2)).printStackTrace();
        a(((Throwable) (obj2)), ((String) (obj)));
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
        return;
        obj2;
        ((Exception) (obj2)).printStackTrace();
        a(((Throwable) (obj2)), ((String) (obj)));
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
        return;
        Exception exception;
        exception;
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
        throw exception;
    }

    public final boolean a()
    {
        return m.isShown();
    }

    public final void b()
    {
label0:
        {
            if (R != null)
            {
                if (!R.a())
                {
                    break label0;
                }
                x.setVisibility(8);
                m.setVisibility(8);
                f.setVisibility(8);
                Y.setVisibility(0);
            }
            return;
        }
        x.setVisibility(8);
        R.d();
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof y)
        {
            E = (y)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet CameraPreivewFragment.OnCameraEditListener").toString());
        }
    }

    public final void onClick(View view)
    {
        boolean flag;
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = true;
        flag = true;
        break MISSING_BLOCK_LABEL_9;
_L7:
        int i1;
        do
        {
            do
            {
                do
                {
                    do
                    {
                        return;
                    } while (J || r == null);
                    i1 = view.getId();
                    if (i1 != g.ad)
                    {
                        break;
                    }
                    if (F)
                    {
                        H = false;
                        f();
                        if (z)
                        {
                            flag = false;
                        }
                        z = flag;
                        if (z)
                        {
                            i1 = h.a;
                        } else
                        {
                            i1 = com.roidapp.imagelib.a.h.b;
                        }
                        y = i1;
                        com.roidapp.imagelib.a.h.c = y;
                        g();
                        if (!z)
                        {
                            if (r != null && r.f())
                            {
                                k.setVisibility(0);
                            }
                        } else
                        {
                            k.setVisibility(8);
                        }
                        B = false;
                        h.e = false;
                        h.i = 0;
                        t.setBackgroundResource(f.as);
                        if (r != null)
                        {
                            if (!r.j())
                            {
                                p.setVisibility(8);
                                w.setOnSeekBarChangeListener(null);
                            } else
                            {
                                w.setOnSeekBarChangeListener(e());
                                w.setMax(r.i());
                                w.setProgress(0);
                                r.a(0);
                            }
                        }
                        F = false;
                        Z.postDelayed(ad, 1000L);
                        return;
                    }
                } while (true);
                if (i1 != g.aE)
                {
                    break;
                }
                if (G && H)
                {
                    if (E != null)
                    {
                        E.a();
                    }
                    J = true;
                    R.a(false);
                    if (!r.m())
                    {
                        if (E != null)
                        {
                            E.b();
                        }
                        J = false;
                        R.a(true);
                        return;
                    }
                }
            } while (true);
            if (i1 != g.W)
            {
                break;
            }
            f();
            if (E != null)
            {
                E.c();
                return;
            }
        } while (true);
        if (i1 == g.ab)
        {
            boolean flag1;
            if (!B)
            {
                flag1 = flag4;
            } else
            {
                flag1 = false;
            }
            B = flag1;
            h.e = B;
            if (B)
            {
                t.setBackgroundResource(f.ar);
            } else
            {
                t.setBackgroundResource(f.as);
            }
            r.a(B);
            return;
        }
        if (i1 != g.Z) goto _L2; else goto _L1
_L1:
        view = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (!view.getBoolean("key_selfiecamera_new", true)) goto _L4; else goto _L3
_L3:
        Dialog dialog = new Dialog(getActivity(), k.a);
        dialog.setContentView(h.l);
        dialog.findViewById(g.j).setOnClickListener(new com.roidapp.imagelib.a.n(this, dialog));
        dialog.show();
_L5:
        view.edit().putBoolean("key_selfiecamera_new", false).apply();
_L4:
        if (Q.b() != 0 && !R.a())
        {
            x.setVisibility(0);
        }
        m.setVisibility(0);
        f.setVisibility(0);
        Y.setVisibility(8);
        Object obj;
        boolean flag2;
        if (!U)
        {
            flag2 = flag5;
        } else
        {
            flag2 = false;
        }
        U = flag2;
        com.roidapp.imagelib.a.h.f = U;
        return;
        obj;
        ((OutOfMemoryError) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj;
        ((Exception) (obj)).printStackTrace();
        if (true) goto _L5; else goto _L2
_L2:
        if (i1 == g.Y)
        {
            boolean flag3;
            if (!C)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            C = flag3;
            com.roidapp.imagelib.a.h.g = C;
            if (C)
            {
                Q.c(true);
                u.setBackgroundResource(f.v);
                return;
            } else
            {
                Q.c(false);
                u.setBackgroundResource(f.u);
                return;
            }
        }
        if (i1 == g.D)
        {
            R.e();
            return;
        }
        if (i1 == g.ah)
        {
            x.setVisibility(8);
            m.setVisibility(8);
            f.setVisibility(8);
            Y.setVisibility(0);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (com.roidapp.baselib.c.n.a(getActivity()) && getResources().getConfiguration().orientation == 1)
        {
            H = false;
            f();
            Q.e();
            if (!g())
            {
                d();
            } else
            {
                if (r != null)
                {
                    r.a(h.i);
                    r.a(B);
                }
                if (Z != null)
                {
                    Z.postDelayed(ad, 1000L);
                    return;
                }
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            ImageLibrary.a().a("CameraPreivewFragment/onCreate");
            y = com.roidapp.imagelib.a.h.c;
            if (y == h.a)
            {
                z = true;
            } else
            {
                z = false;
            }
            V = com.roidapp.imagelib.a.h.d;
            U = com.roidapp.imagelib.a.h.f;
            bundle = getArguments();
            if (bundle != null)
            {
                if (!bundle.getString("current_mode").equalsIgnoreCase("ImageSelector"))
                {
                    break label0;
                }
                c = 1;
                d = bundle.getString("camera_image_dir", "");
                e = bundle.getString("camera_image_filename", "");
            }
            return;
        }
        c = 0;
        d = "";
        e = "";
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ImageLibrary.a().a("CameraPreivewFragment/onCreateView");
        a = layoutinflater.inflate(h.c, viewgroup, false);
        layoutinflater = a;
        ImageLibrary.a().a("CameraPreivewFragment/initView");
        f = (RelativeLayout)layoutinflater.findViewById(g.ah);
        f.setOnClickListener(this);
        ((ViewGroup)layoutinflater.findViewById(g.D)).setOnClickListener(this);
        g = (FrameLayout)layoutinflater.findViewById(g.aE);
        g.setOnClickListener(this);
        viewgroup = (ImageView)layoutinflater.findViewById(g.S);
        g.setOnTouchListener(new r(this, viewgroup));
        i = (FrameLayout)layoutinflater.findViewById(g.ad);
        i.setOnClickListener(this);
        j = (FrameLayout)layoutinflater.findViewById(g.W);
        j.setOnClickListener(this);
        layoutinflater.findViewById(g.R);
        j.setOnTouchListener(new s(this));
        n = (FrameLayout)layoutinflater.findViewById(g.Y);
        n.setOnClickListener(this);
        k = (FrameLayout)layoutinflater.findViewById(g.ab);
        k.setOnClickListener(this);
        l = (FrameLayout)layoutinflater.findViewById(g.Z);
        l.setOnClickListener(this);
        u = (ImageView)layoutinflater.findViewById(g.h);
        C = com.roidapp.imagelib.a.h.g;
        int i1;
        int j1;
        if (C)
        {
            u.setBackgroundResource(f.v);
        } else
        {
            u.setBackgroundResource(f.u);
        }
        t = (ImageView)layoutinflater.findViewById(g.U);
        q = (RelativeLayout)layoutinflater.findViewById(g.V);
        v = (TextView)layoutinflater.findViewById(g.af);
        w = (SeekBar)layoutinflater.findViewById(g.ag);
        p = (RelativeLayout)layoutinflater.findViewById(g.ae);
        p.setVisibility(8);
        x = (SeekBar)layoutinflater.findViewById(g.T);
        x.setOnSeekBarChangeListener(new l(this));
        x.setProgress(com.roidapp.imagelib.a.h.h);
        x.setVisibility(8);
        s = (ImageView)layoutinflater.findViewById(g.m);
        s.setVisibility(8);
        N = new AlphaAnimation(0.0F, 1.0F);
        N.setDuration(500L);
        O = new AlphaAnimation(1.0F, 0.0F);
        O.setDuration(500L);
        Y = layoutinflater.findViewById(g.X);
        viewgroup = Y.getLayoutParams();
        bundle = getResources().getDisplayMetrics();
        S = ((DisplayMetrics) (bundle)).widthPixels;
        T = (int)Math.round((double)S * 1.3333333333333333D);
        if (((DisplayMetrics) (bundle)).heightPixels - T > ((android.view.ViewGroup.LayoutParams) (viewgroup)).height)
        {
            viewgroup.height = ((DisplayMetrics) (bundle)).heightPixels - T;
        } else
        {
            Y.setBackgroundColor(getResources().getColor(com.roidapp.imagelib.d.d));
        }
        K = new GPUImage(getActivity());
        L = (GLSurfaceView)layoutinflater.findViewById(g.ac);
        K.setGLSurfaceView(L);
        K.setDrawListener(this);
        Q = new a(getActivity());
        Q.a(K, L);
        Q.a(C);
        Q.a(com.roidapp.imagelib.a.h.h);
        o = (CheckedTextView)layoutinflater.findViewById(g.i);
        m = (FrameLayout)layoutinflater.findViewById(g.aa);
        R = new FilterListView(getActivity(), "SelfieCam");
        m.addView(R);
        h = (TextView)layoutinflater.findViewById(g.aQ);
        layoutinflater = Typeface.createFromAsset(layoutinflater.getContext().getAssets(), "fonts/Roboto-Thin.ttf");
        h.setTypeface(layoutinflater);
        R.a(new t(this));
        if (com.roidapp.imagelib.a.h.k != null && h.j != null)
        {
            R.a(h.j, com.roidapp.imagelib.a.h.k);
        }
        i1 = getActivity().getResources().getDrawable(f.t).getIntrinsicWidth();
        j1 = getActivity().getResources().getDrawable(f.t).getIntrinsicHeight();
        L.setClickable(true);
        L.setOnTouchListener(new u(this, i1, j1));
        return a;
    }

    public final void onDestroyView()
    {
        ImageLibrary.a().a("CameraPreivewFragment/onDestroyView");
        h.removeCallbacks(aa);
        super.onDestroyView();
    }

    public final void onDetach()
    {
        super.onDetach();
        E = null;
    }

    public final void onDrawLoadDone()
    {
        F = true;
        G = true;
    }

    public final void onPause()
    {
        ImageLibrary.a().a("CameraPreivewFragment/onPause");
        if (E != null)
        {
            E.a(h.j, com.roidapp.imagelib.a.h.g);
        }
        f();
        Q.e();
        super.onPause();
    }

    public final void onPreviewFailed()
    {
        Message message = Message.obtain(Z, 3);
        Z.sendMessage(message);
    }

    public final void onResume()
    {
        ImageLibrary.a().a("CameraPreivewFragment/onResume");
        super.onResume();
        H = false;
        if (E != null)
        {
            E.b();
        }
        J = false;
        if (R != null)
        {
            R.a(true);
            R.c();
        }
        if (!g())
        {
            d();
            return;
        }
        if (!r.d())
        {
            i.setVisibility(8);
        }
        if (!r.f() || !r.e() || r.k())
        {
            k.setVisibility(8);
        }
        if (!r.j())
        {
            p.setVisibility(8);
            w.setOnSeekBarChangeListener(null);
        } else
        {
            w.setOnSeekBarChangeListener(e());
            w.setMax(r.i());
            w.setProgress(h.i);
            r.a(h.i);
        }
        B = h.e;
        if (B)
        {
            t.setBackgroundResource(f.ar);
        } else
        {
            t.setBackgroundResource(f.as);
        }
        if (r != null)
        {
            r.a(B);
        }
        if (Z != null)
        {
            Z.postDelayed(ad, 1000L);
            return;
        } else
        {
            H = true;
            return;
        }
    }

}
