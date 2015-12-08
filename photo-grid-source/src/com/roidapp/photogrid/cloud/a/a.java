// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.google.ads.AdLoader;
import com.google.ads.formats.NativeAppInstallAd;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ads.f;
import com.roidapp.cloudlib.ads.m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            l, j, c, b, 
//            d, e, f, g, 
//            h, i, t

public final class a extends l
    implements m
{

    public int a;
    public int b;
    boolean c;
    private int g;
    private WeakReference h;
    private Queue i;
    private int j;
    private int k;
    private com.cmcm.a.a.d l;
    private com.cmcm.a.a.a m;
    private com.roidapp.cloudlib.ads.n n;
    private NativeAppInstallAd o;
    private AdLoader p;
    private boolean q;
    private final Activity r;

    public a(Activity activity, int i1, int j1, t t)
    {
        super(activity, 0, t);
        b = 6;
        r = activity;
        g = i1;
        a = j1;
        activity = d.getResources().getDisplayMetrics();
        float f1 = (float)((DisplayMetrics) (activity)).widthPixels - ((DisplayMetrics) (activity)).density * 48F;
        k = (int)(f1 / 1.9F);
        j = (int)f1;
        i = com.roidapp.cloudlib.a.a.a(d).e("ad", "sort_native");
        if (i == null)
        {
            i = new LinkedList(Arrays.asList(new Integer[] {
                Integer.valueOf(5), Integer.valueOf(3)
            }));
        }
    }

    static com.cmcm.a.a.a a(a a1, com.cmcm.a.a.a a2)
    {
        a1.m = a2;
        return a2;
    }

    static com.cmcm.a.a.d a(a a1)
    {
        return a1.l;
    }

    static NativeAppInstallAd a(a a1, NativeAppInstallAd nativeappinstallad)
    {
        a1.o = nativeappinstallad;
        return nativeappinstallad;
    }

    static int b(a a1)
    {
        return a1.g;
    }

    static void c(a a1)
    {
        a1.e();
    }

    static boolean d(a a1)
    {
        a1.q = true;
        return true;
    }

    static AdLoader e(a a1)
    {
        a1.p = null;
        return null;
    }

    private void e()
    {
_L2:
        return;
_L13:
        if (d == null || i == null) goto _L2; else goto _L1
_L1:
        Integer integer;
        boolean flag;
        boolean flag1;
        if (i != null)
        {
            integer = (Integer)i.poll();
        } else
        {
            integer = null;
        }
        if (integer == null) goto _L2; else goto _L3
_L3:
        flag1 = false;
        flag = flag1;
        integer.intValue();
        JVM INSTR tableswitch 3 5: default 72
    //                   3 84
    //                   4 74
    //                   5 92;
           goto _L4 _L5 _L6 _L7
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        flag = flag1;
_L11:
        if (flag)
        {
            return;
        }
          goto _L8
_L5:
        flag = f();
          goto _L9
_L7:
        l = new j(this);
        com.roidapp.cloudlib.ads.f.a().a(d, g, l);
        flag = true;
_L9:
        if (true) goto _L11; else goto _L10
_L10:
_L8:
        if (true) goto _L13; else goto _L12
_L12:
    }

    static NativeAppInstallAd f(a a1)
    {
        return a1.o;
    }

    private boolean f()
    {
        if (com.roidapp.photogrid.common.a.a().a || q)
        {
            return false;
        }
        p = (new com.google.ads.AdLoader.Builder(d, "ca-app-pub-5185134000426737/1982366401")).forAppInstallAd(new com.roidapp.photogrid.cloud.a.c(this)).withAdListener(new b(this)).build();
        try
        {
            p.loadAd((new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder()).build());
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            p = null;
            return false;
        }
        return true;
    }

    public final View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        if (!c || f || layoutinflater == null || d == null)
        {
            view = null;
        } else
        {
            if (view != null && !(view.getTag() instanceof a))
            {
                view = null;
            }
            int i1;
            if (view != null)
            {
                layoutinflater = view;
            } else
            {
                layoutinflater = layoutinflater.inflate(0x7f03001d, viewgroup, false);
            }
            layoutinflater.setVisibility(0);
            if (m != null && layoutinflater != null)
            {
                TextView textview = (TextView)layoutinflater.findViewById(0x7f0d009c);
                ImageView imageview = (ImageView)layoutinflater.findViewById(0x7f0d009d);
                TextView textview1 = (TextView)layoutinflater.findViewById(0x7f0d009b);
                TextView textview3 = (TextView)layoutinflater.findViewById(0x7f0d009f);
                TextView textview5 = (TextView)layoutinflater.findViewById(0x7f0d009a);
                view = (ImageView)layoutinflater.findViewById(0x7f0d0098);
                viewgroup = (ImageView)layoutinflater.findViewById(0x7f0d009e);
                if (textview != null)
                {
                    textview.setVisibility(8);
                }
                if (imageview != null)
                {
                    imageview.setVisibility(8);
                }
                if (textview1 != null)
                {
                    textview1.setText(m.d());
                }
                if (textview3 != null)
                {
                    textview3.setText(m.h());
                    textview3.setMaxLines(100);
                }
                if (m != null)
                {
                    if (!TextUtils.isEmpty(m.g()))
                    {
                        textview5.setText(m.g());
                    } else
                    {
                        textview5.setText("Try it");
                    }
                }
                if (viewgroup != null)
                {
                    Object obj = m.e();
                    ImageView imageview1;
                    TextView textview2;
                    TextView textview4;
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
                        if (layoutparams != null)
                        {
                            layoutparams.height = k;
                            layoutparams.width = j;
                        }
                        com.bumptech.glide.h.a(r).a(((String) (obj))).a(e.c).g().b(com.roidapp.baselib.b.a.b()).a(viewgroup);
                        viewgroup.setVisibility(0);
                    } else
                    {
                        viewgroup.setVisibility(8);
                    }
                }
                viewgroup = m.f();
                if (!TextUtils.isEmpty(viewgroup) && view != null)
                {
                    com.bumptech.glide.h.a(r).a(viewgroup).g().b(com.roidapp.baselib.b.a.b()).a(view);
                }
                view = (ImageView)layoutinflater.findViewById(0x7f0d0099);
                if (m.j())
                {
                    i1 = 0x7f02014b;
                } else
                {
                    i1 = 0;
                }
                com.roidapp.baselib.c.n.a(view, i1);
                m.a(layoutinflater);
                b = 6;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            view = layoutinflater;
            if (i1 == 0)
            {
                view = layoutinflater;
                if (o != null)
                {
                    view = layoutinflater;
                    if (layoutinflater != null)
                    {
                        view = layoutinflater;
                        if (o != null)
                        {
                            obj = (TextView)layoutinflater.findViewById(0x7f0d009c);
                            imageview1 = (ImageView)layoutinflater.findViewById(0x7f0d009d);
                            textview2 = (TextView)layoutinflater.findViewById(0x7f0d009b);
                            textview4 = (TextView)layoutinflater.findViewById(0x7f0d009f);
                            textview5 = (TextView)layoutinflater.findViewById(0x7f0d009a);
                            view = (ImageView)layoutinflater.findViewById(0x7f0d0098);
                            viewgroup = (ImageView)layoutinflater.findViewById(0x7f0d009e);
                            if (o.getAttributionText() != null && !"".equals(o.getAttributionText()))
                            {
                                ((TextView) (obj)).setVisibility(0);
                                ((TextView) (obj)).setText(o.getAttributionText());
                                ((TextView) (obj)).setOnClickListener(new com.roidapp.photogrid.cloud.a.d(this));
                            }
                            if (o.getAttributionIcon() != null)
                            {
                                imageview1.setVisibility(0);
                                imageview1.setImageDrawable(o.getAttributionIcon());
                                imageview1.setOnClickListener(new com.roidapp.photogrid.cloud.a.e(this));
                            }
                            if (textview2 != null)
                            {
                                textview2.setText(o.getHeadline());
                                textview2.setOnClickListener(new com.roidapp.photogrid.cloud.a.f(this));
                            }
                            if (textview4 != null)
                            {
                                textview4.setText(o.getBody());
                                textview4.setMaxLines(100);
                            }
                            if (textview5 != null)
                            {
                                textview5.setText(o.getCallToAction());
                                textview5.setOnClickListener(new g(this));
                            }
                            if (viewgroup != null)
                            {
                                obj = o.getImage();
                                if (obj != null)
                                {
                                    android.view.ViewGroup.LayoutParams layoutparams1 = viewgroup.getLayoutParams();
                                    if (layoutparams1 != null)
                                    {
                                        i1 = ((Drawable) (obj)).getIntrinsicWidth();
                                        int j1 = ((Drawable) (obj)).getIntrinsicHeight();
                                        if (i1 > 0 && j1 > 0)
                                        {
                                            if (j1 > i1)
                                            {
                                                j1 = Math.round(((float)i1 * (float)k) / (float)j1);
                                                i1 = k;
                                            } else
                                            {
                                                i1 = Math.round(((float)j1 * (float)j) / (float)i1);
                                                j1 = j;
                                            }
                                            layoutparams1.height = i1;
                                            layoutparams1.width = j1;
                                        } else
                                        {
                                            layoutparams1.height = k;
                                            layoutparams1.width = j;
                                        }
                                    }
                                    viewgroup.setLayoutParams(layoutparams1);
                                    viewgroup.setImageDrawable(((Drawable) (obj)));
                                    viewgroup.setOnClickListener(new com.roidapp.photogrid.cloud.a.h(this));
                                    viewgroup.setVisibility(0);
                                } else
                                {
                                    viewgroup.setVisibility(8);
                                }
                            }
                            view.setImageDrawable(o.getIcon());
                            view.setOnClickListener(new i(this));
                            com.roidapp.baselib.c.n.a((ImageView)layoutinflater.findViewById(0x7f0d0099), 0x7f02014b);
                            b = 8;
                            return layoutinflater;
                        }
                    }
                }
            }
        }
        return view;
    }

    public final void a()
    {
        n = null;
        m = null;
        p = null;
        o = null;
        com.roidapp.cloudlib.ads.f.a().a(g, l);
        l = null;
        super.a();
    }

    public final void a(BaseAdapter baseadapter)
    {
        h = new WeakReference(baseadapter);
    }

    protected final void b()
    {
        if (d != null && h != null)
        {
            BaseAdapter baseadapter = (BaseAdapter)h.get();
            if (baseadapter != null)
            {
                baseadapter.notifyDataSetChanged();
            }
        }
    }

    public final void c()
    {
        e();
    }
}
