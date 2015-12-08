// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.aviary.android.feather.library.c.b;
import com.aviary.android.feather.library.c.f;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.filters.MemeFilter;
import com.aviary.android.feather.library.graphics.a.a;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.widget.AviaryButton;
import com.aviary.android.feather.sdk.widget.ImageViewDrawableOverlay;
import com.aviary.android.feather.sdk.widget.d;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a

public class m extends com.aviary.android.feather.sdk.panels.a
    implements android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, com.aviary.android.feather.sdk.widget.ImageViewDrawableOverlay.a, it.sephiroth.android.library.imagezoom.ImageViewTouchBase.c
{
    abstract class a
        implements TextWatcher
    {

        public d b;
        final m c;

        a()
        {
            c = m.this;
            super();
        }
    }


    Typeface A;
    String B;
    String C;
    View D;
    View E;
    int F;
    int G;
    int H;
    int I;
    boolean J;
    final c K = new c(new String[] {
        "", ""
    });
    Handler L;
    ResultReceiver M;
    private final a N = new a() {

        final m a;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int k, int l, int i1)
        {
        }

        public void onTextChanged(CharSequence charsequence, int k, int l, int i1)
        {
            com.aviary.android.feather.library.graphics.a.c c1;
label0:
            {
                k = 0;
                a.q.c("onTextChanged", new Object[] {
                    b
                });
                if (b != null && (b.n() instanceof com.aviary.android.feather.library.graphics.a.c))
                {
                    c1 = (com.aviary.android.feather.library.graphics.a.c)b.n();
                    if (c1.q())
                    {
                        break label0;
                    }
                }
                return;
            }
            c1.a(charsequence.toString());
            if (!b.equals(a.y)) goto _L2; else goto _L1
_L1:
            a.s.setText(charsequence);
            View view = a.D;
            if (charsequence != null && charsequence.length() > 0)
            {
                k = 0;
            } else
            {
                k = 4;
            }
            view.setVisibility(k);
_L4:
            if (b.o())
            {
                a.c.invalidate(b.f());
            }
            com.aviary.android.feather.sdk.panels.m.a(a);
            return;
_L2:
            if (b.equals(a.z))
            {
                a.t.setText(charsequence);
                View view1 = a.E;
                if (charsequence == null || charsequence.length() <= 0)
                {
                    k = 4;
                }
                view1.setVisibility(k);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                a = m.this;
                super();
            }
    };
    AviaryButton s;
    AviaryButton t;
    EditText u;
    EditText v;
    InputMethodManager w;
    Canvas x;
    d y;
    d z;

    public m(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
        F = 16;
        G = 16;
        H = -1;
        I = 0xff000000;
        J = true;
        L = new Handler();
        M = new ResultReceiver(L);
        iaviarycontroller = (ConfigService)iaviarycontroller.a(com/aviary/android/feather/library/services/ConfigService);
        if (iaviarycontroller != null)
        {
            C = iaviarycontroller.f(com.aviary.android.feather.sdk.R.string.aviary_meme_font);
            H = iaviarycontroller.d(com.aviary.android.feather.sdk.R.color.aviary_meme_text_color);
            I = iaviarycontroller.d(com.aviary.android.feather.sdk.R.color.aviary_meme_stroke_color);
            J = iaviarycontroller.e(com.aviary.android.feather.sdk.R.integer.aviary_meme_stroke_enabled);
        }
    }

    private void G()
    {
        ImageViewDrawableOverlay imageviewdrawableoverlay = (ImageViewDrawableOverlay)c;
        RectF rectf = imageviewdrawableoverlay.getBitmapRect();
        Object obj = new com.aviary.android.feather.library.graphics.a.a("", (int)((double)Math.min(rectf.width(), rectf.height()) / 7D), A, true);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).c(H);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).a(J);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).b(I);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).a(rectf.width(), rectf.height());
        y = new d(imageviewdrawableoverlay, imageviewdrawableoverlay.getOverlayStyleId(), ((com.aviary.android.feather.library.graphics.a.d) (obj)));
        Matrix matrix = imageviewdrawableoverlay.getImageViewMatrix();
        int k = ((com.aviary.android.feather.library.graphics.a.a) (obj)).getIntrinsicHeight();
        obj = new Matrix(matrix);
        ((Matrix) (obj)).invert(((Matrix) (obj)));
        float af[] = new float[4];
        af[0] = rectf.left;
        af[1] = rectf.top + (float)F;
        af[2] = rectf.right;
        af[3] = rectf.top + (float)k + (float)F;
        com.aviary.android.feather.library.c.f.a(((Matrix) (obj)), af);
        rectf = new RectF(af[0], af[1], af[2], af[3]);
        y.a(com.aviary.android.feather.sdk.widget.d.a.a);
        y.a(B().a(), matrix, null, rectf, false);
        imageviewdrawableoverlay.a(y);
    }

    private void H()
    {
        ImageViewDrawableOverlay imageviewdrawableoverlay = (ImageViewDrawableOverlay)c;
        RectF rectf = imageviewdrawableoverlay.getBitmapRect();
        Object obj = new com.aviary.android.feather.library.graphics.a.a("", (int)((double)Math.min(rectf.width(), rectf.height()) / 7D), A, false);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).c(H);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).a(J);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).b(I);
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).a(rectf.width(), rectf.height());
        ((com.aviary.android.feather.library.graphics.a.a) (obj)).a(new android.graphics.Paint.FontMetrics());
        z = new d(imageviewdrawableoverlay, imageviewdrawableoverlay.getOverlayStyleId(), ((com.aviary.android.feather.library.graphics.a.d) (obj)));
        Matrix matrix = imageviewdrawableoverlay.getImageViewMatrix();
        int k = ((com.aviary.android.feather.library.graphics.a.a) (obj)).getIntrinsicHeight();
        obj = new Matrix(matrix);
        ((Matrix) (obj)).invert(((Matrix) (obj)));
        float af[] = new float[4];
        af[0] = rectf.left;
        af[1] = rectf.bottom - (float)k - (float)G;
        af[2] = rectf.left + rectf.width();
        af[3] = rectf.bottom - (float)G;
        com.aviary.android.feather.library.c.f.a(((Matrix) (obj)), af);
        obj = new RectF(af[0], af[1], af[2], af[3]);
        q.a((new StringBuilder()).append("bitmap rect: ").append(rectf).toString());
        z.a(com.aviary.android.feather.sdk.widget.d.a.b);
        z.a(B().a(), matrix, null, ((RectF) (obj)), false);
        imageviewdrawableoverlay.a(z);
    }

    private void I()
    {
        if (h(y))
        {
            c(true);
        } else
        if (h(z))
        {
            c(true);
        } else
        {
            c(false);
        }
        q.a((new StringBuilder()).append("isChanged?: ").append(x()).toString());
    }

    private void J()
    {
        ApplicationInfo applicationinfo;
        try
        {
            A = com.aviary.android.feather.sdk.utils.d.a(B().a().getAssets(), C);
            applicationinfo = com.aviary.android.feather.common.utils.f.a(B().a());
        }
        catch (Exception exception)
        {
            A = Typeface.DEFAULT;
            return;
        }
        if (applicationinfo == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        B = applicationinfo.sourceDir;
    }

    private void a()
    {
        if (f != null && !f.isRecycled())
        {
            f.recycle();
            f = null;
        }
        f = com.aviary.android.feather.library.c.b.a(g, g.getConfig());
        x = new Canvas(f);
    }

    static void a(m m1)
    {
        m1.I();
    }

    private void a(d d1, MemeFilter memefilter)
    {
        if (d1 == null) goto _L2; else goto _L1
_L1:
        com.aviary.android.feather.library.graphics.a.a a1;
        d1.a(true);
        float f1 = com.aviary.android.feather.library.c.f.a(c.getImageMatrix())[0];
        int k = g.getWidth();
        int i1 = g.getHeight();
        Object obj = d1.c();
        obj = new Rect((int)((RectF) (obj)).left, (int)((RectF) (obj)).top, (int)((RectF) (obj)).right, (int)((RectF) (obj)).bottom);
        a1 = (com.aviary.android.feather.library.graphics.a.a)d1.n();
        int l = x.save(1);
        a1.i();
        a1.invalidateSelf();
        a1.a(k, i1);
        a1.setBounds(((Rect) (obj)).left, ((Rect) (obj)).top, ((Rect) (obj)).right, ((Rect) (obj)).bottom);
        a1.draw(x);
        memefilter.a(k, i1);
        memefilter.b(a1.n());
        if (a1.d())
        {
            k = a1.o();
        } else
        {
            k = 0;
        }
        memefilter.c(k);
        memefilter.a(a1.c() / f1);
        if (y != d1) goto _L4; else goto _L3
_L3:
        memefilter.b((String)a1.m());
        ((String[])K.a())[0] = (String)a1.m();
_L6:
        x.restoreToCount(l);
        c.invalidate();
_L2:
        a(f, false, false);
        return;
_L4:
        if (d1 == z)
        {
            memefilter.c((String)a1.m());
            ((String[])K.a())[1] = (String)a1.m();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static float[] a(Matrix matrix)
    {
        float af[] = new float[9];
        matrix.getValues(af);
        return af;
    }

    private void e(d d1)
    {
        int k = 0;
        if (d1 != null)
        {
            Object obj = (com.aviary.android.feather.library.graphics.a.c)d1.n();
            if (((com.aviary.android.feather.library.graphics.a.c) (obj)).q())
            {
                ((com.aviary.android.feather.library.graphics.a.c) (obj)).i();
                j(d1);
            }
            obj = ((com.aviary.android.feather.library.graphics.a.c) (obj)).m();
            if (d1.equals(y))
            {
                s.setText(((CharSequence) (obj)));
                d1 = D;
                if (obj != null && ((CharSequence) (obj)).length() > 0)
                {
                    k = 0;
                } else
                {
                    k = 4;
                }
                d1.setVisibility(k);
                return;
            }
            if (d1.equals(z))
            {
                t.setText(((CharSequence) (obj)));
                d1 = E;
                if (obj == null || ((CharSequence) (obj)).length() <= 0)
                {
                    k = 4;
                }
                d1.setVisibility(k);
                return;
            }
        }
    }

    private void f(d d1)
    {
        q.b("beginEditView");
        if (d1 == null)
        {
            return;
        }
        com.aviary.android.feather.library.graphics.a.c c1 = (com.aviary.android.feather.library.graphics.a.c)d1.n();
        if (d1 == y)
        {
            e(z);
        } else
        {
            e(y);
        }
        if (!c1.q())
        {
            c1.h();
        }
        i(d1);
    }

    private void g(d d1)
    {
        if (d1 != null)
        {
            com.aviary.android.feather.library.graphics.a.a a1 = (com.aviary.android.feather.library.graphics.a.a)d1.n();
            a1.a("");
            a1.invalidateSelf();
            if (d1.o())
            {
                c.invalidate(d1.f());
            }
            I();
        }
    }

    private boolean h(d d1)
    {
        if (d1 != null)
        {
            d1 = (com.aviary.android.feather.library.graphics.a.c)d1.n();
            if (d1 != null)
            {
                d1 = d1.m();
                if (d1 != null && d1.length() > 0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private void i(d d1)
    {
        q.c("beginEditText", new Object[] {
            d1
        });
        EditText edittext;
        if (d1 == y)
        {
            edittext = u;
        } else
        if (d1 == z)
        {
            edittext = v;
        } else
        {
            edittext = null;
        }
        if (edittext != null)
        {
            N.b = null;
            edittext.removeTextChangedListener(N);
            edittext.setText((String)((com.aviary.android.feather.library.graphics.a.c)d1.n()).m());
            edittext.setSelection(edittext.length());
            edittext.setImeOptions(6);
            edittext.requestFocusFromTouch();
            if (!w.showSoftInput(edittext, 0, M))
            {
                w.toggleSoftInput(2, 0);
            }
            N.b = d1;
            edittext.setOnEditorActionListener(this);
            edittext.addTextChangedListener(N);
            ((ImageViewDrawableOverlay)c).setSelectedHighlightView(d1);
            ((com.aviary.android.feather.library.graphics.a.c)d1.n()).b(((com.aviary.android.feather.library.graphics.a.c)d1.n()).m());
            if (d1.o())
            {
                c.invalidate(d1.f());
            }
            I();
        }
    }

    private void j(d d1)
    {
        q.c("endEditText", new Object[] {
            d1
        });
        N.b = null;
        if (d1 == y)
        {
            d1 = u;
        } else
        if (d1 == z)
        {
            d1 = v;
        } else
        {
            d1 = null;
        }
        if (d1 != null)
        {
            d1.removeTextChangedListener(N);
            d1.setOnEditorActionListener(null);
            if (w.isActive(d1))
            {
                w.hideSoftInputFromWindow(d1.getWindowToken(), 0);
            }
            d1.clearFocus();
        }
    }

    public void A()
    {
        super.A();
        e(y);
        e(z);
        ((ImageViewDrawableOverlay)c).setOnDrawableEventListener(null);
        ((ImageViewDrawableOverlay)c).setOnLayoutChangeListener(null);
        s.setOnClickListener(null);
        t.setOnClickListener(null);
        D.setOnClickListener(null);
        E.setOnClickListener(null);
        if (w.isActive(u))
        {
            w.hideSoftInputFromWindow(u.getWindowToken(), 0);
        }
        if (w.isActive(v))
        {
            w.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }

    protected void F()
    {
        Object obj = (MemeFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.m);
        float f1 = com.aviary.android.feather.library.c.f.a(c.getImageMatrix())[0];
        ((MemeFilter) (obj)).b((double)F / (double)f1);
        ((MemeFilter) (obj)).c((double)G / (double)f1);
        if (A != null)
        {
            ((MemeFilter) (obj)).d(C);
        }
        if (B != null)
        {
            ((MemeFilter) (obj)).a(B);
        }
        if (y != null)
        {
            a(y, ((MemeFilter) (obj)));
        }
        if (z != null)
        {
            a(z, ((MemeFilter) (obj)));
        }
        obj = (com.aviary.android.feather.headless.moa.d)((MemeFilter) (obj)).a().clone();
        e.a(((com.aviary.android.feather.headless.moa.d) (obj)));
        e.a(K);
        super.a(e);
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        s = (AviaryButton)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button1);
        t = (AviaryButton)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button2);
        c = (ImageViewTouch)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
        u = (EditText)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_invisible_text_1);
        v = (EditText)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_invisible_text_2);
        D = f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_clear_button1);
        E = f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_clear_button2);
        c.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.b);
        c.setDoubleTapEnabled(false);
        c.setScaleEnabled(false);
        c.setScrollEnabled(false);
        a();
        c.setOnDrawableChangedListener(new it.sephiroth.android.library.imagezoom.ImageViewTouchBase.b() {

            final m a;

            public void a(Drawable drawable)
            {
                a.q.b("onDrawableChanged");
                drawable = com.aviary.android.feather.sdk.panels.m.a(a.c.getImageViewMatrix());
                float f1 = a.g.getHeight();
                int k = (int)(drawable[4] * f1);
                drawable = a.b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_meme_dumb);
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)drawable.getLayoutParams();
                layoutparams.height = k - 50;
                drawable.setLayoutParams(layoutparams);
                drawable.requestLayout();
            }

            
            {
                a = m.this;
                super();
            }
        });
        c.a(f, null, -1F, -1F);
    }

    public void a(d d1)
    {
        q.c("onTopClick", new Object[] {
            d1
        });
        if (d1 != null && (d1.n() instanceof com.aviary.android.feather.library.graphics.a.c))
        {
            f(d1);
        }
    }

    public void a(d d1, d d2)
    {
        q.c("onFocusChange", new Object[] {
            d1, d2
        });
        if (d2 != null && d1 == null)
        {
            e(d2);
        }
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    public void a(boolean flag, int k, int l, int i1, int j1)
    {
        if (flag)
        {
            float af[] = a(c.getImageViewMatrix());
            float f1 = g.getWidth();
            float f2 = g.getHeight();
            float f3 = af[0];
            if (y != null)
            {
                ((com.aviary.android.feather.library.graphics.a.a)y.n()).a(f1 * f3, f2 * f3);
            }
            if (z != null)
            {
                ((com.aviary.android.feather.library.graphics.a.a)z.n()).a(f1 * f3, f2 * f3);
            }
        }
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_meme, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_meme, viewgroup, false);
    }

    public void b(d d1)
    {
    }

    public void c(d d1)
    {
    }

    public void d(d d1)
    {
        if (d1 != null && (d1.n() instanceof com.aviary.android.feather.library.graphics.a.c))
        {
            f(d1);
        }
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public void onClick(View view)
    {
        q.b("onClick");
        if (view != null)
        {
            int k = view.getId();
            if (k == s.getId())
            {
                if (y == null)
                {
                    G();
                }
                a(y);
                return;
            }
            if (k == t.getId())
            {
                if (z == null)
                {
                    H();
                }
                a(z);
                return;
            }
            if (k == D.getId())
            {
                g(y);
                e(y);
                return;
            }
            if (k == E.getId())
            {
                g(z);
                e(z);
                return;
            }
        }
    }

    public boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
    {
        q.c("onEditorAction", new Object[] {
            textview, Integer.valueOf(k), keyevent
        });
        if (textview != null && (k == 6 || k == 0))
        {
            textview = (ImageViewDrawableOverlay)c;
            if (textview.getSelectedHighlightView() != null)
            {
                textview = textview.getSelectedHighlightView();
                if (textview.n() instanceof com.aviary.android.feather.library.graphics.a.c)
                {
                    e(textview);
                }
            }
        }
        return false;
    }

    public void y()
    {
        x = null;
        w = null;
        ((ImageViewDrawableOverlay)c).a();
        super.y();
    }

    public void z()
    {
        super.z();
        J();
        ((ImageViewDrawableOverlay)c).setOnDrawableEventListener(this);
        ((ImageViewDrawableOverlay)c).setOnLayoutChangeListener(this);
        w = (InputMethodManager)B().a().getSystemService("input_method");
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setVisibility(0);
        v.setVisibility(0);
        u.getBackground().setAlpha(0);
        v.getBackground().setAlpha(0);
        D.setOnClickListener(this);
        E.setOnClickListener(this);
        b().setVisibility(0);
        d();
    }
}
