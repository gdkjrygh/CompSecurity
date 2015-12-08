// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.av;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import java.util.HashMap;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.crop:
//            k, a, l, m, 
//            ImageViewTouchBase, q, n, CropImageView, 
//            o

public final class j extends Fragment
    implements android.view.View.OnClickListener, jp.co.cyberagent.android.gpuimage.GPUImageView.OnPictureSavedListener
{

    private bi A;
    private final int B = 0;
    private boolean C;
    private boolean D;
    private volatile boolean E;
    private GPUImageView F;
    private int G;
    private ViewGroup H;
    private boolean I;
    private TextView J;
    private boolean K;
    private boolean L;
    private HorizontalScrollView M;
    private int N;
    private Handler O;
    private int P;
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected View e;
    protected Uri f;
    protected IGroupInfo g;
    b h;
    Integer i[];
    private final int j = 0;
    private final int k = 1;
    private final int l = 2;
    private final int m = 3;
    private final int n = 4;
    private HorizontalScrollView o;
    private TextView p;
    private CropImageView q;
    private m r;
    private a s;
    private Bitmap t;
    private Bitmap u;
    private Bitmap v;
    private HashMap w;
    private av x;
    private boolean y;
    private int z[] = {
        -1, -1
    };

    public j()
    {
        r = null;
        y = true;
        f = null;
        h = new b();
        C = false;
        D = false;
        E = false;
        F = null;
        I = false;
        K = false;
        L = false;
        M = null;
        N = -1;
        O = new k(this);
    }

    static Bitmap a(j j1, Bitmap bitmap)
    {
        j1.t = bitmap;
        return bitmap;
    }

    static av a(j j1)
    {
        return j1.x;
    }

    private void a(int i1, int j1)
    {
        ImageLibrary.a().a("ImageEditCropFragment/doCrop");
        if (s.d == null)
        {
            s.b(i1, j1);
            s.b(t);
        } else
        {
            s.a(i1, j1);
        }
        z[0] = i1;
        z[1] = j1;
    }

    private void a(View view)
    {
        if (view != null && getActivity() != null && getView() != null)
        {
            if (M == null)
            {
                M = (HorizontalScrollView)getView().findViewById(g.aj);
            }
            if (N == -1)
            {
                N = getResources().getDisplayMetrics().widthPixels;
            }
            if (M != null)
            {
                int i1 = view.getWidth();
                int j1 = N - M.getLeft() - (view.getRight() - M.getScrollX());
                if (j1 < i1)
                {
                    M.smoothScrollBy(i1 - j1, 0);
                    return;
                }
                j1 = view.getLeft() - M.getScrollX();
                if (j1 < i1)
                {
                    M.smoothScrollBy(j1 - i1, 0);
                    return;
                }
            }
        }
    }

    static void a(j j1, int i1, int k1)
    {
        j1.a(i1, k1);
    }

    static void a(j j1, Throwable throwable, String s1)
    {
        j1.a(throwable, s1);
    }

    private void a(m m1)
    {
        ImageLibrary.a().a("ImageEditCropFragment/setCropRatioBackground");
        Object obj = r;
        r = m1;
        if (obj != null)
        {
            ((RelativeLayout)e.findViewById(((Integer)w.get(obj)).intValue())).setBackgroundColor(0);
        }
        m1 = (RelativeLayout)e.findViewById(((Integer)w.get(r)).intValue());
        obj = getActivity();
        if (obj != null && !((Activity) (obj)).isFinishing())
        {
            m1.setBackgroundColor(getResources().getColor(d.a));
        }
    }

    private void a(m m1, boolean flag)
    {
        m1 = (RelativeLayout)e.findViewById(((Integer)w.get(m1)).intValue());
        if (flag)
        {
            m1.setVisibility(0);
            return;
        } else
        {
            m1.setVisibility(8);
            return;
        }
    }

    private void a(Throwable throwable, String s1)
    {
        O.post(new l(this, throwable, s1));
    }

    static Bitmap b(j j1)
    {
        return j1.t;
    }

    private void b()
    {
        a(com.roidapp.imagelib.crop.m.c, true);
        a(m.e, true);
        a(com.roidapp.imagelib.crop.m.f, true);
        a(m.i, true);
        a(m.k, true);
        a(com.roidapp.imagelib.crop.m.d, false);
        a(com.roidapp.imagelib.crop.m.g, false);
        a(com.roidapp.imagelib.crop.m.h, false);
        a(m.j, false);
        a(m.l, false);
        if (r == com.roidapp.imagelib.crop.m.d)
        {
            a(com.roidapp.imagelib.crop.m.c);
            a(2, 3);
        } else
        {
            if (r == com.roidapp.imagelib.crop.m.g)
            {
                a(m.e);
                a(3, 4);
                return;
            }
            if (r == com.roidapp.imagelib.crop.m.h)
            {
                a(com.roidapp.imagelib.crop.m.f);
                a(3, 5);
                return;
            }
            if (r == m.j)
            {
                a(m.i);
                a(5, 7);
                return;
            }
            if (r == m.l)
            {
                a(m.k);
                a(9, 16);
                return;
            }
        }
    }

    static CropImageView c(j j1)
    {
        return j1.q;
    }

    static boolean d(j j1)
    {
        return j1.L;
    }

    static int[] e(j j1)
    {
        return j1.z;
    }

    static boolean f(j j1)
    {
        j1.E = false;
        return false;
    }

    static int g(j j1)
    {
        return j1.P;
    }

    static Handler h(j j1)
    {
        return j1.O;
    }

    static boolean i(j j1)
    {
        return j1.C;
    }

    static bi j(j j1)
    {
        return j1.A;
    }

    static a k(j j1)
    {
        return j1.s;
    }

    static Bitmap l(j j1)
    {
        return j1.u;
    }

    static Bitmap m(j j1)
    {
        return j1.v;
    }

    public final void a()
    {
label0:
        {
            ImageLibrary.a().a("ImageEditCropFragment/backToFilter");
            if (x != null)
            {
                if (c == null)
                {
                    break label0;
                }
                x.a(0, c, h, g, P);
            }
            return;
        }
        x.a(0, a, h, g, P);
    }

    public final void a(int i1)
    {
        ImageLibrary.a().a("ImageEditCropFragment/saveBtn");
        if (q != null)
        {
            q.a(null);
        }
        E = true;
        G = i1;
        if (!L) goto _L2; else goto _L1
_L1:
        (new Thread(new q(this, 0, 1, android.graphics.Bitmap.CompressFormat.JPEG))).start();
_L4:
        return;
_L2:
        Object obj;
        if (!D)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj = t;
        if (F == null || obj == null) goto _L4; else goto _L3
_L3:
        if (((Bitmap) (obj)).isRecycled()) goto _L4; else goto _L5
_L5:
        u = s.c(((Bitmap) (obj)));
        i1 = u.getWidth();
        int j1 = u.getHeight();
        F.deleteImage();
        F.setImage(u, false);
        H.addView(F, -1);
        F.setVisibility(0);
        i1 = Math.round(360F / ((float)i1 / (float)j1));
        obj = new android.widget.RelativeLayout.LayoutParams(1, 1);
        F.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        F.forceLayout();
        F.saveToPictures(null, null, 360, i1, this);
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        a(((Throwable) (exception)), "");
        return;
        (new Thread(new q(this, 0, i1, android.graphics.Bitmap.CompressFormat.JPEG))).start();
        return;
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
            x = (av)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet ImageEditCropFragment.OnImageEditCropListener").toString());
        }
    }

    public final void onClick(View view)
    {
        boolean flag = true;
        boolean flag1 = false;
        if (!E)
        {
            int i1 = view.getId();
            if (g.aK == i1)
            {
                x.a();
                com.roidapp.imagelib.b.c.a(t);
                t = null;
                s.b();
                if (!K)
                {
                    J.setText(com.roidapp.imagelib.j.k);
                    J.setCompoundDrawablesWithIntrinsicBounds(f.ax, 0, 0, 0);
                    getActivity();
                    i = com.roidapp.imagelib.b.d.b(b);
                    d = b;
                    (new Thread(new n(this, d, 0))).start();
                } else
                {
                    J.setText(com.roidapp.imagelib.j.i);
                    J.setCompoundDrawablesWithIntrinsicBounds(f.aw, 0, 0, 0);
                    getActivity();
                    i = com.roidapp.imagelib.b.d.b(a);
                    d = a;
                    (new Thread(new n(this, d, 0))).start();
                }
                flag = flag1;
                if (!K)
                {
                    flag = true;
                }
                K = flag;
                E = true;
                return;
            }
            if (g.ai == i1)
            {
                if (y)
                {
                    p.setText(com.roidapp.imagelib.j.f);
                    view = getResources().getDrawable(f.ay);
                    p.setCompoundDrawablesWithIntrinsicBounds(null, view, null, null);
                    a(com.roidapp.imagelib.crop.m.f, false);
                    a(m.i, false);
                    a(m.k, false);
                    a(com.roidapp.imagelib.crop.m.c, false);
                    a(m.e, false);
                    a(com.roidapp.imagelib.crop.m.d, true);
                    a(com.roidapp.imagelib.crop.m.g, true);
                    a(com.roidapp.imagelib.crop.m.h, true);
                    a(m.j, true);
                    a(m.l, true);
                    if (r == com.roidapp.imagelib.crop.m.c)
                    {
                        a(com.roidapp.imagelib.crop.m.d);
                        a(3, 2);
                    } else
                    if (r == m.e)
                    {
                        a(com.roidapp.imagelib.crop.m.g);
                        a(4, 3);
                    } else
                    if (r == com.roidapp.imagelib.crop.m.f)
                    {
                        a(com.roidapp.imagelib.crop.m.h);
                        a(5, 3);
                    } else
                    if (r == m.i)
                    {
                        a(m.j);
                        a(7, 5);
                    } else
                    if (r == m.k)
                    {
                        a(m.l);
                        a(16, 9);
                    }
                } else
                {
                    p.setText(com.roidapp.imagelib.j.h);
                    view = getResources().getDrawable(f.au);
                    p.setCompoundDrawablesWithIntrinsicBounds(null, view, null, null);
                    b();
                }
                if (y)
                {
                    flag = false;
                }
                y = flag;
                return;
            }
            if (g.av == i1)
            {
                a(view);
                a(m.a);
                a(0, 0);
                return;
            }
            if (g.al == i1)
            {
                a(view);
                a(com.roidapp.imagelib.crop.m.b);
                a(1, 1);
                return;
            }
            if (g.am == i1)
            {
                a(view);
                a(com.roidapp.imagelib.crop.m.c);
                a(2, 3);
                return;
            }
            if (g.an == i1)
            {
                a(view);
                a(com.roidapp.imagelib.crop.m.d);
                a(3, 2);
                return;
            }
            if (g.ao == i1)
            {
                a(view);
                a(m.e);
                a(3, 4);
                return;
            }
            if (g.ap == i1)
            {
                a(view);
                a(com.roidapp.imagelib.crop.m.f);
                a(3, 5);
                return;
            }
            if (g.aq == i1)
            {
                a(view);
                a(com.roidapp.imagelib.crop.m.g);
                a(4, 3);
                return;
            }
            if (g.ar == i1)
            {
                a(view);
                a(com.roidapp.imagelib.crop.m.h);
                a(5, 3);
                return;
            }
            if (g.as == i1)
            {
                a(view);
                a(m.i);
                a(5, 7);
                return;
            }
            if (g.at == i1)
            {
                a(view);
                a(m.j);
                a(7, 5);
                return;
            }
            if (g.au == i1)
            {
                a(view);
                a(m.k);
                a(9, 16);
                return;
            }
            if (g.ak == i1)
            {
                a(view);
                a(m.l);
                a(16, 9);
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ImageLibrary.a().a("ImageEditCropFragment/onCreate");
        bundle = getArguments();
        if (bundle != null)
        {
            a = bundle.getString("edit_image_path");
            b = bundle.getString("edit_image_origin_path");
            c = bundle.getString("edit_crop_image_path");
            d = a;
            int i1 = bundle.getInt("edit_image_property_lightness", 150);
            int j1 = bundle.getInt("edit_image_property_contast", 100);
            int k1 = bundle.getInt("edit_image_property_saturation", 100);
            int l1 = bundle.getInt("edit_image_property_hue", 180);
            I = bundle.getBoolean("edit_is_crop");
            L = bundle.getBoolean("edit_photo_profile");
            h = new b(i1, j1, k1, l1);
            g = (IGroupInfo)bundle.getParcelable("edit_filter_type");
            P = bundle.getInt("alphaProgress", 100);
            com.roidapp.baselib.gl.c.a();
            if (com.roidapp.baselib.gl.c.b(getActivity()) && !L)
            {
                C = true;
                A = new bi(getActivity());
                if (A != null && com.roidapp.imagelib.filter.groupinfo.b.a(g))
                {
                    bundle = g.a();
                    A.a(h, bundle.a());
                    A.a(bundle);
                    A.a(P);
                    A.c(C);
                } else
                {
                    A.a(h);
                    A.a(P);
                    A.c(true);
                }
                if (com.roidapp.baselib.gl.c.a().c())
                {
                    D = true;
                    DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
                    F = new GPUImageView(getActivity());
                    bundle = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                    F.setLayoutParams(bundle);
                    F.setGalaxyYSeries(D);
                    Object obj = null;
                    bundle = ((Bundle) (obj));
                    if (g != null)
                    {
                        bundle = ((Bundle) (obj));
                        if (g.a() != null)
                        {
                            if (g.g() && (g instanceof CloudFilterInfo))
                            {
                                bundle = A.a((CloudFilterInfo)g.a(), displaymetrics.widthPixels, displaymetrics.heightPixels, A.g());
                            } else
                            {
                                bundle = A.a(g.a().a(), displaymetrics.widthPixels, displaymetrics.heightPixels, A.g(), false);
                            }
                        }
                    }
                    obj = bundle;
                    if (bundle == null)
                    {
                        obj = A.a(0, displaymetrics.widthPixels, displaymetrics.heightPixels, A.g(), false);
                    }
                    F.setFilterNoApply(((jp.co.cyberagent.android.gpuimage.GPUImageFilter) (obj)));
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ImageLibrary.a().a("ImageEditCropFragment/onCreateView");
        e = layoutinflater.inflate(h.e, viewgroup, false);
        layoutinflater = e;
        ImageLibrary.a().a("ImageEditCropFragment/initControls");
        p = (TextView)layoutinflater.findViewById(g.ai);
        p.setOnClickListener(this);
        p.setText(com.roidapp.imagelib.j.h);
        layoutinflater.findViewById(g.av).setOnClickListener(this);
        layoutinflater.findViewById(g.al).setOnClickListener(this);
        layoutinflater.findViewById(g.am).setOnClickListener(this);
        layoutinflater.findViewById(g.an).setOnClickListener(this);
        layoutinflater.findViewById(g.ao).setOnClickListener(this);
        layoutinflater.findViewById(g.ap).setOnClickListener(this);
        layoutinflater.findViewById(g.aq).setOnClickListener(this);
        layoutinflater.findViewById(g.ar).setOnClickListener(this);
        layoutinflater.findViewById(g.as).setOnClickListener(this);
        layoutinflater.findViewById(g.at).setOnClickListener(this);
        layoutinflater.findViewById(g.au).setOnClickListener(this);
        layoutinflater.findViewById(g.ak).setOnClickListener(this);
        J = (TextView)layoutinflater.findViewById(g.aK);
        if (I)
        {
            J.setVisibility(0);
            J.setOnClickListener(this);
        } else
        {
            J.setVisibility(8);
        }
        z[0] = 0;
        z[1] = 0;
        layoutinflater = e;
        ImageLibrary.a().a("ImageEditCropFragment/initView");
        q = (CropImageView)layoutinflater.findViewById(g.aA);
        o = (HorizontalScrollView)layoutinflater.findViewById(g.aj);
        H = (ViewGroup)q.getParent();
        s = new a(getActivity(), q);
        getActivity();
        i = com.roidapp.imagelib.b.d.b(a);
        if (L)
        {
            s.a();
            o.setVisibility(8);
            (new Thread(new o(this, d))).start();
        } else
        {
            (new Thread(new n(this, d, 0))).start();
        }
        ImageLibrary.a().a("ImageEditCropFragment/initCropLayoutMap");
        w = new HashMap();
        w.put(m.a, Integer.valueOf(g.av));
        w.put(com.roidapp.imagelib.crop.m.b, Integer.valueOf(g.al));
        w.put(com.roidapp.imagelib.crop.m.c, Integer.valueOf(g.am));
        w.put(com.roidapp.imagelib.crop.m.d, Integer.valueOf(g.an));
        w.put(m.e, Integer.valueOf(g.ao));
        w.put(com.roidapp.imagelib.crop.m.f, Integer.valueOf(g.ap));
        w.put(com.roidapp.imagelib.crop.m.g, Integer.valueOf(g.aq));
        w.put(com.roidapp.imagelib.crop.m.h, Integer.valueOf(g.ar));
        w.put(m.i, Integer.valueOf(g.as));
        w.put(m.j, Integer.valueOf(g.at));
        w.put(m.k, Integer.valueOf(g.au));
        w.put(m.l, Integer.valueOf(g.ak));
        b();
        a(m.a);
        return e;
    }

    public final void onDestroyView()
    {
        com.roidapp.imagelib.b.c.a(t);
        if (F != null)
        {
            ImageLibrary.a().a("ImageEditCropFragment/destroyGPUView");
            ViewGroup viewgroup = (ViewGroup)F.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(F);
            }
            F.removeAllViews();
            F = null;
        }
        super.onDestroyView();
    }

    public final void onDetach()
    {
        super.onDetach();
        x = null;
    }

    public final void onPause()
    {
        super.onPause();
        if (F != null)
        {
            F.onPause();
        }
    }

    public final void onPictureSaved(Bitmap bitmap)
    {
        v = bitmap;
        (new Thread(new q(this, 1, G, android.graphics.Bitmap.CompressFormat.PNG))).start();
    }

    public final void onResume()
    {
        super.onResume();
        if (F != null)
        {
            F.onResume();
        }
    }
}
