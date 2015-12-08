// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import bolts.j;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.cardinalblue.android.b.e;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.events.i;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uk.co.senab.photoview.PhotoView;

public class k extends Fragment
{

    PhotoView a;
    private int b;
    private ProgressBar c;
    private uk.co.senab.photoview.PhotoViewAttacher.b d;
    private WebView e;
    private GestureDetector f;
    private WebPhoto g;
    private TextView h;
    private WebChromeClient i;
    private WebViewClient j;
    private android.view.View.OnTouchListener k;
    private j l;

    public k()
    {
        i = new WebChromeClient();
        j = new WebViewClient() {

            final k a;

            public void onPageFinished(WebView webview, String s)
            {
                if (a.a.getVisibility() == 0)
                {
                    a.a.setVisibility(4);
                }
                com.cardinalblue.android.piccollage.view.fragments.k.e(a).setVisibility(4);
                com.cardinalblue.android.piccollage.view.fragments.k.a(a).setOnTouchListener(k.f(a));
            }

            
            {
                a = k.this;
                super();
            }
        };
        k = new android.view.View.OnTouchListener() {

            final k a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                com.cardinalblue.android.piccollage.view.fragments.k.g(a).onTouchEvent(motionevent);
                return view.onTouchEvent(motionevent);
            }

            
            {
                a = k.this;
                super();
            }
        };
        l = bolts.j.a(Boolean.valueOf(false));
    }

    static WebView a(k k1)
    {
        return k1.e;
    }

    public static k a(WebPhoto webphoto, int i1)
    {
        k k1 = new k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_webphoto", webphoto);
        bundle.putInt("position", i1);
        k1.setArguments(bundle);
        return k1;
    }

    private void a(Bitmap bitmap)
    {
        int i1 = com.cardinalblue.android.b.k.c();
        android.view.ViewGroup.LayoutParams layoutparams = e.getLayoutParams();
        layoutparams.width = -1;
        float f1 = bitmap.getHeight();
        layoutparams.height = (int)(((float)i1 * f1) / (float)bitmap.getWidth());
        e.setLayoutParams(layoutparams);
    }

    static void a(k k1, Bitmap bitmap)
    {
        k1.a(bitmap);
    }

    static uk.co.senab.photoview.PhotoViewAttacher.b b(k k1)
    {
        return k1.d;
    }

    static WebPhoto c(k k1)
    {
        return k1.g;
    }

    private void c()
    {
        c.setVisibility(0);
        a.setVisibility(0);
        f();
        e.setWebViewClient(j);
        f = new GestureDetector(getActivity(), new android.view.GestureDetector.SimpleOnGestureListener() {

            final k a;

            private void a()
            {
                String s = com.cardinalblue.android.piccollage.view.fragments.k.a(a).getUrl();
                if (!TextUtils.isEmpty(s))
                {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(s));
                    a.startActivity(intent);
                }
            }

            private boolean a(String s)
            {
                return k.c(a).getOriginalImageUrl().equals(s);
            }

            public boolean onSingleTapUp(MotionEvent motionevent)
            {
                motionevent = com.cardinalblue.android.piccollage.view.fragments.k.a(a).getHitTestResult();
                if (motionevent != null)
                {
                    if (com.cardinalblue.android.piccollage.view.fragments.k.b(a) != null && motionevent.getType() == 5)
                    {
                        if (com.cardinalblue.android.b.e.a() || android.os.Build.VERSION.SDK_INT == 15)
                        {
                            if (!a(motionevent.getExtra()))
                            {
                                a();
                                com.cardinalblue.android.piccollage.a.b.m("video", "collage show");
                            } else
                            {
                                com.cardinalblue.android.piccollage.view.fragments.k.b(a).a(null, 0.0F, 0.0F);
                            }
                            return true;
                        } else
                        {
                            com.cardinalblue.android.piccollage.view.fragments.k.b(a).a(null, 0.0F, 0.0F);
                            return true;
                        }
                    }
                    com.cardinalblue.android.piccollage.a.b.m("video", "collage show");
                    if (com.cardinalblue.android.b.e.a() || android.os.Build.VERSION.SDK_INT == 15)
                    {
                        a();
                        return true;
                    }
                }
                return false;
            }

            
            {
                a = k.this;
                super();
            }
        });
        e.getSettings().setUseWideViewPort(true);
        e.setOnTouchListener(k);
        e.loadUrl(g.getInteractiveUrl());
        e.setWebChromeClient(i);
    }

    private void d()
    {
        e.setWebViewClient(null);
        e.setWebChromeClient(null);
        e.setOnTouchListener(null);
        e.getSettings().setUseWideViewPort(false);
        e.loadDataWithBaseURL("about:blank", "<html></html>", "text/html", "UTF-8", null);
        a.setVisibility(0);
        e();
    }

    static void d(k k1)
    {
        k1.c();
    }

    static ProgressBar e(k k1)
    {
        return k1.c;
    }

    private void e()
    {
        Method method = null;
        Method method1 = android/webkit/WebView.getMethod("onPause", new Class[0]);
        method = method1;
_L2:
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        method.invoke(e, new Object[0]);
        return;
        Object obj;
        obj;
        return;
        obj;
        return;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static android.view.View.OnTouchListener f(k k1)
    {
        return k1.k;
    }

    private void f()
    {
        Method method = null;
        Method method1 = android/webkit/WebView.getMethod("onResume", new Class[0]);
        method = method1;
_L2:
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        method.invoke(e, new Object[0]);
        return;
        Object obj;
        obj;
        return;
        obj;
        return;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static GestureDetector g(k k1)
    {
        return k1.f;
    }

    private j g()
    {
        c.setVisibility(0);
        bolts.j.a a1 = bolts.j.a();
        a a2 = com.bumptech.glide.g.a(getActivity()).a(g.getThumbnailImageUrl()).l().a(true).a(new com.bumptech.glide.request.e(a1) {

            final bolts.j.a a;
            final k b;

            public boolean a(Bitmap bitmap, String s, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                com.cardinalblue.android.piccollage.view.fragments.k.a(b, bitmap);
                a.a(Boolean.valueOf(true));
                return false;
            }

            public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                return a(exception, (String)obj, j1, flag);
            }

            public boolean a(Exception exception, String s, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                return false;
            }

            public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                return a((Bitmap)obj, (String)obj1, j1, flag, flag1);
            }

            
            {
                b = k.this;
                a = a1;
                super();
            }
        });
        com.bumptech.glide.g.a(getActivity()).a(g.getOriginalImageUrl()).l().a(a2).c(0x7f020229).a(new com.bumptech.glide.request.e(a1) {

            final bolts.j.a a;
            final k b;

            public boolean a(Bitmap bitmap, String s, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                com.cardinalblue.android.piccollage.view.fragments.k.e(b).setVisibility(8);
                com.cardinalblue.android.piccollage.view.fragments.k.a(b, bitmap);
                a.a(Boolean.valueOf(true));
                return false;
            }

            public volatile boolean a(Exception exception, Object obj, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                return a(exception, (String)obj, j1, flag);
            }

            public boolean a(Exception exception, String s, com.bumptech.glide.request.b.j j1, boolean flag)
            {
                com.cardinalblue.android.piccollage.view.fragments.k.e(b).setVisibility(8);
                b.a.setBackgroundResource(0x7f0f00a5);
                a.a(Boolean.valueOf(false));
                return false;
            }

            public volatile boolean a(Object obj, Object obj1, com.bumptech.glide.request.b.j j1, boolean flag, boolean flag1)
            {
                return a((Bitmap)obj, (String)obj1, j1, flag, flag1);
            }

            
            {
                b = k.this;
                a = a1;
                super();
            }
        }).a(a);
        return a1.a();
    }

    public String a()
    {
        return g.getOriginalImageUrl();
    }

    public void a(int i1)
    {
        h.setVisibility(0);
        h.setText(i1);
    }

    public void a(uk.co.senab.photoview.PhotoViewAttacher.b b1)
    {
        d = b1;
    }

    public Bitmap b()
    {
        android.graphics.drawable.Drawable drawable = a.getDrawable();
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        } else
        {
            return null;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        int i1;
        if (bundle1 != null)
        {
            bundle = (WebPhoto)bundle1.getParcelable("extra_webphoto");
        } else
        {
            bundle = new WebPhoto();
        }
        g = bundle;
        if (bundle1 != null)
        {
            i1 = bundle1.getInt("position");
        } else
        {
            i1 = 0;
        }
        b = i1;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b5, viewgroup, false);
        a = (PhotoView)layoutinflater.findViewById(0x7f1001c8);
        a.setOnPhotoTapListener(d);
        c = (ProgressBar)layoutinflater.findViewById(0x7f100105);
        h = (TextView)layoutinflater.findViewById(0x7f1001ca);
        e = (WebView)layoutinflater.findViewById(0x7f1001c9);
        e.setBackgroundColor(0xff000000);
        if (g.isInteractive())
        {
            e.getSettings().setJavaScriptEnabled(true);
            e.getSettings().setSupportZoom(true);
            e.getSettings().setBuiltInZoomControls(true);
            e.getSettings().setDisplayZoomControls(false);
            e.getSettings().setUseWideViewPort(true);
            e.setInitialScale(100);
            return layoutinflater;
        } else
        {
            e.setVisibility(8);
            return layoutinflater;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        d();
        a.setOnPhotoTapListener(null);
        d = null;
    }

    public void onPageSelected(i i1)
    {
        if (b == i1.b)
        {
            if (g.isInteractive())
            {
                l.c(new bolts.i() {

                    final k a;

                    public Void a(j j1)
                        throws Exception
                    {
                        if (((Boolean)j1.e()).booleanValue())
                        {
                            com.cardinalblue.android.piccollage.view.fragments.k.d(a);
                        }
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                a = k.this;
                super();
            }
                }, com.cardinalblue.android.b.k.a);
            }
            return;
        } else
        {
            d();
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        Object obj = getActivity();
        if (obj != null && (obj instanceof PublicCollageActivity))
        {
            if ((obj = ((PublicCollageActivity)obj).v()) != null)
            {
                int i1 = ((ViewPager) (obj)).getCurrentItem();
                int j1 = ((ViewPager) (obj)).getOffscreenPageLimit();
                if (b >= i1 - j1 && b <= j1 + i1)
                {
                    l = g();
                }
                com.cardinalblue.android.piccollage.controller.d.b(this);
                return;
            }
        }
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }
}
