// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.gl.c;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.c.b;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.LocalGroupInfo;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.GPUImageColorFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageFilterGroup;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.filter:
//            n, ad, ag, bf, 
//            ai, at, ao, bi, 
//            ap, ImageColorView, an, am, 
//            bg, az, av, ar, 
//            r, al, ab, a, 
//            ak, aq, ax

public final class aj extends com.roidapp.imagelib.filter.n
    implements android.view.View.OnClickListener, ad, ag, bf, jp.co.cyberagent.android.gpuimage.GPUImageView.OnPictureSavedListener
{

    private boolean A;
    private boolean B;
    private bi C;
    private Bitmap D;
    private boolean E;
    private bg F;
    private az G;
    private ImageColorView H;
    private FrameLayout I;
    private r J;
    private Handler K;
    private IGroupInfo L;
    public final String f = "FILTER_OPTIMIZATION";
    protected View g;
    protected String h;
    protected String i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected ai n;
    protected Uri o;
    Integer p[];
    public aq q;
    private FrameLayout r;
    private GPUImageView s;
    private String t;
    private View u;
    private View v;
    private boolean w;
    private volatile boolean x;
    private av y;
    private final int z = 1;

    public aj()
    {
        t = "GridActivity";
        j = -1;
        k = -1;
        l = -1;
        m = -1;
        n = ai.a;
        w = false;
        x = false;
        o = null;
        A = true;
        B = false;
        E = false;
        K = new at(this, (byte)0);
    }

    static Bitmap a(aj aj1, Bitmap bitmap)
    {
        aj1.D = bitmap;
        return bitmap;
    }

    static av a(aj aj1)
    {
        return aj1.y;
    }

    static void a(aj aj1, Throwable throwable, String s1)
    {
        aj1.a(throwable, s1);
    }

    private void a(Throwable throwable, String s1)
    {
        K.post(new ao(this, throwable, s1));
    }

    private void a(GPUImageFilter gpuimagefilter)
    {
        GPUImageFilter gpuimagefilter1 = C.h();
        if (gpuimagefilter1 == null || gpuimagefilter1 != null && gpuimagefilter != gpuimagefilter1)
        {
            C.a(gpuimagefilter);
            if (s != null)
            {
                s.setFilterNoApply(C.h());
            }
            o = null;
        }
    }

    static boolean a(aj aj1, boolean flag)
    {
        aj1.x = flag;
        return flag;
    }

    static Bitmap b(aj aj1)
    {
        return aj1.D;
    }

    static void b(aj aj1, Bitmap bitmap)
    {
        if (aj1.s == null || bitmap == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (!bitmap.isRecycled())
        {
            aj1.s.deleteImage();
            aj1.s.setImage(bitmap);
            ((LinearLayout)aj1.g.findViewById(g.aD)).setVisibility(8);
            ((FrameLayout)aj1.g.findViewById(g.ay)).setVisibility(8);
            aj1.s.setVisibility(4);
            int i1 = Math.round(360F / ((float)aj1.l / (float)aj1.m));
            aj1.s.saveToPictures(null, null, 360, i1, aj1);
        }
        return;
        bitmap;
        bitmap.printStackTrace();
        aj1.a(bitmap, "");
        return;
    }

    static az c(aj aj1)
    {
        return aj1.G;
    }

    static bg d(aj aj1)
    {
        return aj1.F;
    }

    static bi e(aj aj1)
    {
        return aj1.C;
    }

    static IGroupInfo f(aj aj1)
    {
        return aj1.L;
    }

    private void f(int i1)
    {
        Object obj;
        if (getActivity() != null && !getActivity().isFinishing())
        {
            if ((obj = (FrameLayout)g.findViewById(g.ay)) != null)
            {
                switch (ap.a[i1 - 1])
                {
                default:
                    return;

                case 1: // '\001'
                    a(((FrameLayout) (obj)), ((IGroupInfo) (null)));
                    return;

                case 2: // '\002'
                    u.setBackgroundResource(f.o);
                    break;
                }
                v.setBackgroundResource(d.j);
                if (H == null)
                {
                    ((FrameLayout) (obj)).removeAllViews();
                    H = new ImageColorView(getActivity());
                }
                H.a(this);
                if (((FrameLayout) (obj)).getChildCount() > 0)
                {
                    if (((FrameLayout) (obj)).getChildAt(0) instanceof ImageColorView)
                    {
                        v.setBackgroundResource(f.o);
                        ((FrameLayout) (obj)).removeAllViews();
                        return;
                    } else
                    {
                        ((FrameLayout) (obj)).removeAllViews();
                        ((FrameLayout) (obj)).addView(H);
                        H.a(C.g(), Integer.parseInt(n.toString()));
                        obj = Message.obtain(K, 1029, 2, 0);
                        K.sendMessage(((Message) (obj)));
                        return;
                    }
                } else
                {
                    ((FrameLayout) (obj)).addView(H);
                    H.a(C.g(), Integer.parseInt(n.toString()));
                    obj = Message.obtain(K, 1029, 2, 0);
                    K.sendMessage(((Message) (obj)));
                    return;
                }
            }
        }
    }

    static Handler g(aj aj1)
    {
        return aj1.K;
    }

    static GPUImageView h(aj aj1)
    {
        return aj1.s;
    }

    static boolean i(aj aj1)
    {
        return aj1.A;
    }

    public final ax a(IGroupInfo igroupinfo, Context context)
    {
        return new an(this, igroupinfo, context);
    }

    protected final void a(int i1)
    {
label0:
        {
            if (s != null)
            {
                if (i1 != 0 && i1 != 37 && i1 != 38 && i1 != 39 && i1 != 41 && i1 != 28)
                {
                    break label0;
                }
                s.openBlendMode();
            }
            return;
        }
        s.closeBlendMode();
    }

    public final void a(FrameLayout framelayout, IGroupInfo igroupinfo)
    {
        if (framelayout == null)
        {
            return;
        }
        ImageLibrary.a().a((new StringBuilder()).append(t).append("/ImageEditGLESFragment/editFilter").toString());
        v.setBackgroundResource(f.o);
        u.setBackgroundResource(d.j);
        if (igroupinfo == null)
        {
            e();
        } else
        {
            a(igroupinfo);
        }
        framelayout = Message.obtain(K, 1029, 1, 0);
        K.sendMessage(framelayout);
    }

    public final void a(ai ai1)
    {
        n = ai1;
    }

    public final void a(aq aq1)
    {
        ImageLibrary.a().a((new StringBuilder()).append(t).append("/ImageEditGLESFragment/saveBtn").toString());
        E = true;
        x = true;
        ((FrameLayout)g.findViewById(g.ay)).removeAllViews();
        if (B)
        {
            Message message = Message.obtain(K, 1027, 0, 0);
            K.sendMessage(message);
            q = aq1;
            return;
        } else
        {
            b.a(new am(this, aq1));
            return;
        }
    }

    public final void a(IGroupInfo igroupinfo)
    {
        FrameLayout framelayout = (FrameLayout)g.findViewById(g.ay);
        bg bg1 = F;
        int i1;
        if (C == null)
        {
            i1 = 100;
        } else
        {
            i1 = C.a();
        }
        bg1.a(igroupinfo, i1);
        igroupinfo = new android.widget.FrameLayout.LayoutParams(-1, -2);
        framelayout.removeAllViews();
        framelayout.addView(F, igroupinfo);
    }

    public final void b(int i1)
    {
        C.g().a(i1);
        Object obj = C.h();
        if (obj != null && s != null)
        {
            float f1 = com.roidapp.imagelib.filter.bi.c(i1);
            obj = ((GPUImageFilterGroup)obj).getFilters().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                GPUImageFilter gpuimagefilter = (GPUImageFilter)((Iterator) (obj)).next();
                if (gpuimagefilter instanceof GPUImageColorFilter)
                {
                    ((GPUImageColorFilter)gpuimagefilter).setBrightness(f1);
                    s.requestRender();
                    o = null;
                }
            } while (true);
        }
    }

    public final void c(int i1)
    {
        C.g().b(i1);
        Object obj = C.h();
        if (obj != null && s != null)
        {
            float f1 = com.roidapp.imagelib.filter.bi.d(i1);
            obj = ((GPUImageFilterGroup)obj).getFilters().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                GPUImageFilter gpuimagefilter = (GPUImageFilter)((Iterator) (obj)).next();
                if (gpuimagefilter instanceof GPUImageColorFilter)
                {
                    ((GPUImageColorFilter)gpuimagefilter).setContrast(f1);
                    s.requestRender();
                    o = null;
                }
            } while (true);
        }
    }

    public final boolean c()
    {
        return x;
    }

    public final void d()
    {
        C.a(new com.roidapp.imagelib.b.b());
        Object obj = C.h();
        if (obj != null && s != null)
        {
            obj = ((GPUImageFilterGroup)obj).getFilters().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                GPUImageFilter gpuimagefilter = (GPUImageFilter)((Iterator) (obj)).next();
                if (gpuimagefilter instanceof GPUImageColorFilter)
                {
                    ((GPUImageColorFilter)gpuimagefilter).setBrightness(0.0F);
                    ((GPUImageColorFilter)gpuimagefilter).setContrast(1.0F);
                    ((GPUImageColorFilter)gpuimagefilter).setSaturation(1.0F);
                    ((GPUImageColorFilter)gpuimagefilter).setHue(0.0F);
                    s.requestRender();
                    o = null;
                }
            } while (true);
        }
    }

    public final void d(int i1)
    {
        C.g().c(i1);
        Object obj = C.h();
        if (obj != null && s != null)
        {
            float f1 = com.roidapp.imagelib.filter.bi.e(i1);
            obj = ((GPUImageFilterGroup)obj).getFilters().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                GPUImageFilter gpuimagefilter = (GPUImageFilter)((Iterator) (obj)).next();
                if (gpuimagefilter instanceof GPUImageColorFilter)
                {
                    ((GPUImageColorFilter)gpuimagefilter).setSaturation(f1);
                    s.requestRender();
                    o = null;
                }
            } while (true);
        }
    }

    public final void e()
    {
        FrameLayout framelayout = (FrameLayout)g.findViewById(g.ay);
        framelayout.removeAllViews();
        Object obj = new View(getActivity());
        ((View) (obj)).setBackgroundResource(f.d);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, (int)getResources().getDimension(e.h));
        layoutparams.gravity = 80;
        framelayout.addView(((View) (obj)), layoutparams);
        obj = new android.widget.FrameLayout.LayoutParams(-1, (int)getResources().getDimension(e.f));
        framelayout.addView(G, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public final void e(int i1)
    {
        C.g().d(i1);
        Object obj = C.h();
        if (obj != null && s != null)
        {
            float f1 = com.roidapp.imagelib.filter.bi.g(i1);
            obj = ((GPUImageFilterGroup)obj).getFilters().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                GPUImageFilter gpuimagefilter = (GPUImageFilter)((Iterator) (obj)).next();
                if (gpuimagefilter instanceof GPUImageColorFilter)
                {
                    ((GPUImageColorFilter)gpuimagefilter).setHue(f1);
                    s.requestRender();
                    o = null;
                }
            } while (true);
        }
    }

    public final void f()
    {
        Object obj;
        if (F != null)
        {
            if (com.roidapp.imagelib.filter.groupinfo.b.a(((IGroupInfo) (obj = F.b()))))
            {
                obj = ((IGroupInfo) (obj)).a();
                int i1 = ((IFilterInfo) (obj)).a();
                C.a(new com.roidapp.imagelib.b.b());
                C.b(i1);
                C.a(((IFilterInfo) (obj)));
                C.a(F.a());
                a(i1);
                GPUImageFilter gpuimagefilter;
                if (obj instanceof CloudFilterInfo)
                {
                    obj = C.a((CloudFilterInfo)obj, j, k, C.g());
                } else
                {
                    obj = C.a(i1, j, k, C.g(), false);
                }
                gpuimagefilter = C.h();
                if (gpuimagefilter == null || gpuimagefilter != null && obj != gpuimagefilter)
                {
                    C.a(((GPUImageFilter) (obj)));
                    if (s != null)
                    {
                        s.setFilter(C.h());
                        s.requestRender();
                    }
                    o = null;
                    return;
                }
            }
        }
    }

    public final void g()
    {
        C.a(F.a());
        C.j();
        s.requestRender();
    }

    public final boolean h()
    {
        FrameLayout framelayout = (FrameLayout)g.findViewById(g.ay);
        if (framelayout.getChildCount() == 0)
        {
            return false;
        }
        if (framelayout.getChildAt(0) instanceof bg)
        {
            e();
            return true;
        } else
        {
            return false;
        }
    }

    public final IGroupInfo i()
    {
        if (G == null || getActivity() == null)
        {
            return null;
        } else
        {
            return G.B();
        }
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
            y = (av)activity;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implemenet ImageEditGLESFragment.OnImageEditListener").toString());
        }
    }

    public final void onClick(View view)
    {
        if (!x)
        {
            int i1 = view.getId();
            if (i1 == g.G)
            {
                f(ar.a);
                return;
            }
            if (i1 == g.I)
            {
                f(com.roidapp.imagelib.filter.ar.b);
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i("ImageEditGLESFragment", "onCreate");
        ImageLibrary.a().a("ImageEditGLESFragment/onCreate");
        w = false;
        bundle = getArguments();
        if (bundle != null)
        {
            a = bundle.getString("edit_image_path");
            h = bundle.getString("edit_image_origin_path");
            i = bundle.getString("edit_image_filter_path");
            t = bundle.getString("mode_str");
            int i1 = bundle.getInt("edit_image_property_lightness", 150);
            int j1 = bundle.getInt("edit_image_property_contast", 100);
            int k1 = bundle.getInt("edit_image_property_saturation", 100);
            int l1 = bundle.getInt("edit_image_property_hue", 180);
            A = bundle.getBoolean("edit_filter_support", true);
            if (com.roidapp.baselib.gl.c.a().c())
            {
                B = true;
            }
            com.roidapp.imagelib.b.b b1 = new com.roidapp.imagelib.b.b(i1, j1, k1, l1);
            j1 = bundle.getInt("alphaProgress", 100);
            L = (IGroupInfo)bundle.getParcelable("edit_filter_type");
            if (L != null && L.g())
            {
                bundle = (CloudGroupInfo)L;
                if (!com.roidapp.baselib.c.n.a(getActivity(), ((CloudGroupInfo) (bundle)).c))
                {
                    L = null;
                }
            }
            C = new bi(getActivity());
            bi bi1;
            if (!com.roidapp.imagelib.filter.groupinfo.b.a(L))
            {
                L = null;
                bundle = null;
            } else
            {
                bundle = L.a();
            }
            bi1 = C;
            if (bundle == null)
            {
                i1 = 0;
            } else
            {
                i1 = bundle.a();
            }
            bi1.a(b1, i1);
            C.a(bundle);
            C.c(A);
            C.a(j1);
            J = new r();
        }
    }

    public final Animation onCreateAnimation(int i1, boolean flag, int j1)
    {
        return super.onCreateAnimation(i1, flag, j1);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = null;
        Log.i("ImageEditGLESFragment", "onCreateView");
        if (!com.roidapp.baselib.c.n.b(getActivity()))
        {
            a(new IllegalStateException("OpenGL ES 2.0 is not supported on this phone."), "");
            return null;
        }
        float f1;
        Integer ainteger[];
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
        g = layoutinflater.inflate(h.g, viewgroup, false);
        a();
        layoutinflater = g;
        ImageLibrary.a().a("ImageEditGLESFragment/initImageView");
        I = (FrameLayout)g.findViewById(g.ay);
        r = (FrameLayout)layoutinflater.findViewById(g.ax);
        s = (GPUImageView)layoutinflater.findViewById(g.aC);
        s.setFile(new File(a), new al(this));
        layoutinflater = getResources().getDisplayMetrics();
        j = ((DisplayMetrics) (layoutinflater)).widthPixels;
        k = ((DisplayMetrics) (layoutinflater)).heightPixels;
        getActivity();
        layoutinflater = a;
        viewgroup = new ArrayList();
        f1 = (float)Runtime.getRuntime().maxMemory() / 1024F / 1024F;
        if (f1 >= 96F)
        {
            viewgroup.add(0, Integer.valueOf(4096));
            viewgroup.add(1, Integer.valueOf(2048));
            viewgroup.add(2, Integer.valueOf(1024));
        } else
        if (f1 < 96F && f1 >= 64F)
        {
            viewgroup.add(0, Integer.valueOf(2048));
            viewgroup.add(1, Integer.valueOf(1024));
            viewgroup.add(2, Integer.valueOf(640));
        } else
        if (f1 < 64F && f1 >= 32F)
        {
            viewgroup.add(0, Integer.valueOf(960));
            viewgroup.add(1, Integer.valueOf(640));
            viewgroup.add(2, Integer.valueOf(320));
        } else
        if (f1 < 32F)
        {
            viewgroup.add(0, Integer.valueOf(640));
            viewgroup.add(1, Integer.valueOf(320));
            viewgroup.add(2, Integer.valueOf(160));
        }
        ainteger = new Integer[viewgroup.size()];
        viewgroup.toArray(ainteger);
        layoutinflater = com.roidapp.imagelib.b.d.a(layoutinflater, ainteger);
        (new StringBuilder("save min length is ")).append(Arrays.toString(layoutinflater));
        p = layoutinflater;
        G = new az(getActivity(), this, w);
        if (L != null && (L instanceof LocalGroupInfo))
        {
            layoutinflater = ((ab)G.z()).a(L.c());
            if (layoutinflater != null)
            {
                layoutinflater.a(L.a());
                L = layoutinflater;
            }
            G.a(L);
        }
        F = new bg(getActivity(), this);
        F.a(false);
        F.a(G.A());
        viewgroup = g;
        u = viewgroup.findViewById(g.G);
        u.setOnClickListener(this);
        v = viewgroup.findViewById(g.I);
        v.setOnClickListener(this);
        if (A)
        {
            FrameLayout framelayout = (FrameLayout)g.findViewById(g.ay);
            layoutinflater = bundle;
            if (L instanceof LocalGroupInfo)
            {
                layoutinflater = L;
            }
            a(framelayout, layoutinflater);
            layoutinflater = Message.obtain(K, 1029, 1, 0);
            K.sendMessage(layoutinflater);
        } else
        {
            u.setVisibility(8);
            v.setVisibility(8);
            layoutinflater = Message.obtain(K, 1029, 0, 0);
            K.sendMessage(layoutinflater);
        }
        layoutinflater = new a(viewgroup.getContext());
        layoutinflater.a(new ak(this));
        layoutinflater.a();
        return g;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        b();
        if (s != null)
        {
            ImageLibrary.a().a("ImageEditGLESFragment/destroyView");
            ViewGroup viewgroup = (ViewGroup)s.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(s);
            }
            s.removeAllViews();
            s = null;
        }
        if (r != null)
        {
            r.removeAllViews();
            r = null;
        }
        com.roidapp.imagelib.filter.r.a();
    }

    public final void onDetach()
    {
        super.onDetach();
        y = null;
        com.roidapp.imagelib.b.c.a(D);
    }

    public final void onPause()
    {
        super.onPause();
        if (s != null)
        {
            s.onPause();
        }
    }

    public final void onPictureSaved(Bitmap bitmap)
    {
        Object obj;
        String s1;
        int j1;
        j1 = 1;
        x = true;
        if (s != null)
        {
            s.cancelSavePicturesTask();
        }
        obj = bitmap;
        if (q.e())
        {
            Bitmap bitmap1 = com.roidapp.imagelib.b.c.a(getActivity(), bitmap);
            obj = bitmap;
            if (bitmap1 != null)
            {
                obj = bitmap;
                if (!bitmap1.isRecycled())
                {
                    bitmap.recycle();
                    obj = bitmap1;
                }
            }
        }
        bitmap = ImageLibrary.a().a(getActivity());
        bitmap = (new StringBuilder()).append(bitmap);
        ImageLibrary.a();
        s1 = bitmap.append(ImageLibrary.b()).toString();
        boolean flag = getActivity().getSharedPreferences(getActivity().getPackageName(), 0).getBoolean("FILTER_OPTIMIZATION", false);
        StringBuilder stringbuilder = (new StringBuilder(".PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis());
        if (flag)
        {
            bitmap = ".png";
        } else
        {
            bitmap = ".jpg";
        }
        bitmap = stringbuilder.append(bitmap).toString();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        getActivity();
        bitmap = com.roidapp.imagelib.b.d.a(((Bitmap) (obj)), s1, bitmap, android.graphics.Bitmap.CompressFormat.PNG);
_L1:
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        obj = K;
        int i1;
        if (E)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (!flag)
        {
            j1 = 0;
        }
        bitmap = Message.obtain(((Handler) (obj)), 1025, i1, j1, bitmap);
        K.sendMessage(bitmap);
        x = false;
        return;
        getActivity();
        bitmap = com.roidapp.imagelib.b.d.a(((Bitmap) (obj)), s1, bitmap, android.graphics.Bitmap.CompressFormat.JPEG);
          goto _L1
        bitmap;
        bitmap.printStackTrace();
        a(bitmap, s1);
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        return;
        bitmap;
        bitmap.printStackTrace();
        a(bitmap, s1);
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        return;
        bitmap;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        throw bitmap;
    }

    public final void onResume()
    {
        boolean flag = false;
        super.onResume();
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        IFilterInfo ifilterinfo = C.i();
        if (ifilterinfo instanceof CloudFilterInfo)
        {
            a(C.a((CloudFilterInfo)ifilterinfo, displaymetrics.widthPixels, displaymetrics.heightPixels, C.g()));
        } else
        {
            a(C.a(C.f(), displaymetrics.widthPixels, displaymetrics.heightPixels, C.g(), false));
        }
        a(C.f());
        if (s != null)
        {
            if (y != null)
            {
                y.a();
            }
            s.onResume();
        }
        if (F != null && G != null && I != null)
        {
            if (I.getChildCount() != 0)
            {
                flag = I.getChildAt(0) instanceof bg;
            }
            if (flag)
            {
                Object obj = F.b();
                if (obj != null && (obj instanceof CloudGroupInfo))
                {
                    obj = (CloudGroupInfo)obj;
                    if (!com.roidapp.baselib.c.n.a(getActivity(), ((CloudGroupInfo) (obj)).c))
                    {
                        I.removeAllViews();
                        G.a(null);
                        a(I, ((IGroupInfo) (null)));
                        return;
                    }
                }
            }
        }
    }
}
