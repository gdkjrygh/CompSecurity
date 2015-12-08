// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.aviary.android.feather.library.c.f;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.filters.TextFilter;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.graphics.a.b;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.a.e;
import com.aviary.android.feather.sdk.widget.AviaryAdapterView;
import com.aviary.android.feather.sdk.widget.AviaryGallery;
import com.aviary.android.feather.sdk.widget.ImageViewDrawableOverlay;
import com.aviary.android.feather.sdk.widget.d;
import com.aviary.android.feather.sdk.widget.i;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a

public class r extends com.aviary.android.feather.sdk.panels.a
    implements android.view.View.OnKeyListener, android.widget.TextView.OnEditorActionListener, com.aviary.android.feather.sdk.widget.AviaryGallery.a, com.aviary.android.feather.sdk.widget.ImageViewDrawableOverlay.a
{
    class a extends BaseAdapter
    {

        LayoutInflater a;
        Resources b;
        final r c;
        private final int d = 0;
        private final int e = 1;
        private int f[];

        public int getCount()
        {
            return f.length;
        }

        public Object getItem(int j)
        {
            return Integer.valueOf(f[j]);
        }

        public long getItemId(int j)
        {
            return 0L;
        }

        public int getItemViewType(int j)
        {
            if (j >= 0 && j < getCount())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            return j == 0 ? 1 : 0;
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            int k = getItemViewType(j);
            viewgroup = null;
            View view1;
            if (view == null)
            {
                view = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_item_view, com.aviary.android.feather.sdk.panels.r.b(c), false);
                view1 = view;
                if (k == 0)
                {
                    viewgroup = new e(c.B().a());
                    ((ImageView)view.findViewById(com.aviary.android.feather.sdk.R.id.image)).setImageDrawable(viewgroup);
                    view.setTag(viewgroup);
                    view1 = view;
                }
            } else
            {
                view1 = view;
                if (k == 0)
                {
                    viewgroup = (e)view.getTag();
                    view1 = view;
                }
            }
            if (viewgroup != null && k == 0)
            {
                k = f[j];
                viewgroup.a(k);
                boolean flag;
                try
                {
                    view1.setContentDescription((new StringBuilder()).append(c.s).append(" ").append(Integer.toHexString(k)).toString());
                }
                // Misplaced declaration of an exception variable
                catch (View view) { }
            }
            if (com.aviary.android.feather.sdk.panels.r.c(c) == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            view1.setId(j);
            return view1;
        }

        public int getViewTypeCount()
        {
            return 2;
        }

        public a(Context context, int ai[])
        {
            c = r.this;
            super();
            a = LayoutInflater.from(context);
            f = ai;
            b = context.getResources();
        }
    }

    abstract class b
        implements TextWatcher
    {

        public d b;
        final r c;

        b()
        {
            c = r.this;
            super();
        }
    }


    private EditText A;
    private ConfigService B;
    private final b C = new b() {

        final r a;

        public void afterTextChanged(Editable editable)
        {
            a.q.b("afterTextChanged");
        }

        public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
        {
            a.q.b("beforeTextChanged");
        }

        public void onTextChanged(CharSequence charsequence, int j, int k, int l)
        {
            com.aviary.android.feather.library.graphics.a.c c1;
label0:
            {
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
        }

            
            {
                a = r.this;
                super();
            }
    };
    String s;
    c t;
    private int u[];
    private int v;
    private AviaryGallery w;
    private int x;
    private int y;
    private Canvas z;

    public r(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
        v = 0;
        t = new c();
    }

    private void G()
    {
        ImageViewDrawableOverlay imageviewdrawableoverlay = (ImageViewDrawableOverlay)c;
        if (imageviewdrawableoverlay.getHighlightCount() > 0)
        {
            f(imageviewdrawableoverlay.a(0));
        }
        Object obj = new com.aviary.android.feather.library.graphics.a.b("", y);
        ((com.aviary.android.feather.library.graphics.a.b) (obj)).c(v);
        ((com.aviary.android.feather.library.graphics.a.b) (obj)).a(B.e(com.aviary.android.feather.sdk.R.integer.aviary_text_stroke_enabled));
        ((com.aviary.android.feather.library.graphics.a.b) (obj)).a(2);
        ((com.aviary.android.feather.library.graphics.a.b) (obj)).b(14F);
        ((com.aviary.android.feather.library.graphics.a.b) (obj)).a(A.getHint());
        d d1 = new d(c, imageviewdrawableoverlay.getOverlayStyleId(), ((com.aviary.android.feather.library.graphics.a.d) (obj)));
        Matrix matrix = c.getImageViewMatrix();
        int j1 = c.getWidth();
        int k1 = c.getHeight();
        int l1 = Math.max(j1, k1);
        int l = ((com.aviary.android.feather.library.graphics.a.b) (obj)).getIntrinsicWidth();
        int i1 = ((com.aviary.android.feather.library.graphics.a.b) (obj)).getIntrinsicHeight();
        int k = i1;
        int j = l;
        if (Math.max(l, i1) > l1)
        {
            j = j1 / 2;
            k = k1 / 2;
        }
        l = (j1 - j) / 2;
        i1 = (k1 - k) / 2;
        obj = new Matrix(matrix);
        ((Matrix) (obj)).invert(((Matrix) (obj)));
        float af[] = new float[4];
        af[0] = l;
        af[1] = i1;
        af[2] = j + l;
        af[3] = k + i1;
        com.aviary.android.feather.library.c.f.a(((Matrix) (obj)), af);
        obj = new RectF(af[0], af[1], af[2], af[3]);
        Rect rect = new Rect(0, 0, j1, k1);
        d1.a(B().a(), matrix, rect, ((RectF) (obj)), false);
        imageviewdrawableoverlay.a(d1);
        d(d1);
    }

    private com.aviary.android.feather.headless.moa.d H()
    {
        com.aviary.android.feather.headless.moa.d d1 = com.aviary.android.feather.headless.moa.c.a();
        if (((ImageViewDrawableOverlay)c).getHighlightCount() < 1)
        {
            return d1;
        }
        d d2 = ((ImageViewDrawableOverlay)c).a(0);
        if (d2 != null)
        {
            if (d2.n() instanceof com.aviary.android.feather.library.graphics.a.c)
            {
                com.aviary.android.feather.library.graphics.a.c c1 = (com.aviary.android.feather.library.graphics.a.c)d2.n();
                if (c1 != null && c1.e())
                {
                    return d1;
                }
            }
            return f(d2);
        } else
        {
            return d1;
        }
    }

    private void I()
    {
        ImageViewDrawableOverlay imageviewdrawableoverlay = (ImageViewDrawableOverlay)c;
        d d1 = imageviewdrawableoverlay.getSelectedHighlightView();
        if (d1 == null && imageviewdrawableoverlay.getHighlightCount() > 0)
        {
            d1 = imageviewdrawableoverlay.a(0);
        }
        if (d1 != null && (d1.n() instanceof com.aviary.android.feather.library.graphics.a.c))
        {
            ((com.aviary.android.feather.library.graphics.a.c)d1.n()).c(v);
            c.postInvalidate();
        }
    }

    private void a()
    {
        if (f != null && !f.isRecycled())
        {
            f.recycle();
            f = null;
        }
        f = com.aviary.android.feather.library.c.b.a(g, g.getConfig());
        z = new Canvas(f);
    }

    static void a(r r1)
    {
        r1.G();
    }

    private void a(d d1)
    {
        if (d1 != null)
        {
            d1.c(true);
            c.postInvalidate();
        }
        C.b = null;
        A.removeTextChangedListener(C);
        Object obj = (com.aviary.android.feather.library.graphics.a.c)d1.n();
        if (((com.aviary.android.feather.library.graphics.a.c) (obj)).e())
        {
            obj = "";
        } else
        {
            obj = (String)((com.aviary.android.feather.library.graphics.a.c) (obj)).m();
        }
        A.setText(((CharSequence) (obj)));
        A.setSelection(A.length());
        A.requestFocusFromTouch();
        obj = (InputMethodManager)B().a().getSystemService("input_method");
        if (obj != null)
        {
            ((InputMethodManager) (obj)).showSoftInput(A, 0);
        }
        C.b = d1;
        A.setOnEditorActionListener(this);
        A.addTextChangedListener(C);
    }

    static AviaryGallery b(r r1)
    {
        return r1.w;
    }

    static int c(r r1)
    {
        return r1.x;
    }

    private void e(d d1)
    {
        if (d1 != null)
        {
            d1.c(false);
            if (d1.o())
            {
                c.invalidate(d1.f());
            } else
            {
                c.postInvalidate();
            }
        }
        C.b = null;
        A.removeTextChangedListener(C);
        d1 = (InputMethodManager)B().a().getSystemService("input_method");
        if (d1 != null && d1.isActive(A))
        {
            d1.hideSoftInputFromWindow(A.getWindowToken(), 0);
        }
    }

    private com.aviary.android.feather.headless.moa.d f(d d1)
    {
        if (d1 != null)
        {
            Object obj1 = d1.c();
            float f1 = com.aviary.android.feather.library.c.f.a(c.getImageMatrix())[0];
            q.a((new StringBuilder()).append("cropRect: ").append(obj1).toString());
            int j = g.getWidth();
            int k = g.getHeight();
            float f2 = ((RectF) (obj1)).left;
            float f3 = ((RectF) (obj1)).top;
            float f4 = ((RectF) (obj1)).right;
            float f5 = ((RectF) (obj1)).bottom;
            Object obj2 = (com.aviary.android.feather.library.graphics.a.c)d1.n();
            ((com.aviary.android.feather.library.graphics.a.c) (obj2)).i();
            c.invalidate();
            Object obj = (TextFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.k);
            ((TextFilter) (obj)).a(j, k);
            ((TextFilter) (obj)).a(((com.aviary.android.feather.library.graphics.a.c) (obj2)).m());
            ((TextFilter) (obj)).b(((com.aviary.android.feather.library.graphics.a.c) (obj2)).n());
            if (((com.aviary.android.feather.library.graphics.a.c) (obj2)).d())
            {
                j = ((com.aviary.android.feather.library.graphics.a.c) (obj2)).o();
            } else
            {
                j = 0;
            }
            ((TextFilter) (obj)).c(j);
            ((TextFilter) (obj)).a(d1.i());
            ((TextFilter) (obj)).a(f3, f2);
            ((TextFilter) (obj)).b(f5, f4);
            ((TextFilter) (obj)).a(((com.aviary.android.feather.library.graphics.a.c) (obj2)).p() / f1);
            obj = (com.aviary.android.feather.headless.moa.d)((TextFilter) (obj)).a().clone();
            t.a((String)((com.aviary.android.feather.library.graphics.a.c) (obj2)).m());
            obj1 = new Rect((int)((RectF) (obj1)).left, (int)((RectF) (obj1)).top, (int)((RectF) (obj1)).right, (int)((RectF) (obj1)).bottom);
            j = z.save(1);
            obj2 = d1.d();
            z.concat(((Matrix) (obj2)));
            d1.n().setBounds(((Rect) (obj1)));
            d1.n().draw(z);
            z.restoreToCount(j);
            c.invalidate();
            g(d1);
            d1 = ((d) (obj));
        } else
        {
            d1 = com.aviary.android.feather.headless.moa.c.a();
        }
        a(f, false, false);
        return d1;
    }

    private void g(d d1)
    {
        d1.a(null);
        ((ImageViewDrawableOverlay)c).b(d1);
    }

    public void A()
    {
        ((ImageViewDrawableOverlay)c).setOnDrawableEventListener(null);
        w.setOnItemsScrollListener(null);
        e(null);
        super.A();
    }

    protected void F()
    {
        com.aviary.android.feather.headless.moa.d d1 = H();
        e.a(d1);
        e.a(t);
        super.a(e);
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        B = (ConfigService)B().a(com/aviary/android/feather/library/services/ConfigService);
        u = B.b(com.aviary.android.feather.sdk.R.array.aviary_text_fill_colors);
        x = B.a(com.aviary.android.feather.sdk.R.integer.aviary_text_fill_color_index);
        v = u[x];
        s = B.f(com.aviary.android.feather.sdk.R.string.feather_acc_color);
        w = (AviaryGallery)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_gallery);
        w.setDefaultPosition(x);
        w.setCallbackDuringFling(false);
        w.setAutoSelectChild(true);
        w.setAdapter(new a(B().a(), u));
        w.setOnItemsScrollListener(this);
        A = (EditText)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_text);
        c = (ImageViewTouch)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
        c.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        c.setDoubleTapEnabled(false);
        a();
        c.a(f, null, -1F, 8F);
    }

    public void a(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
    }

    public void a(d d1, d d2)
    {
        if (d2 != null && (d2.n() instanceof com.aviary.android.feather.library.graphics.a.c) && ((com.aviary.android.feather.library.graphics.a.c)d2.n()).q())
        {
            e(d2);
        }
        if (d1 != null && (d1.n() instanceof com.aviary.android.feather.library.graphics.a.c))
        {
            v = ((com.aviary.android.feather.library.graphics.a.c)d1.n()).n();
        }
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_text, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_crop, viewgroup, false);
    }

    public void b(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        if (j >= 0 && j < u.length)
        {
            v = u[j];
            I();
        }
    }

    public void b(d d1)
    {
    }

    public void c(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        if (j >= 0 && j < u.length)
        {
            v = u[j];
            try
            {
                B().h().a("text: colors_selected");
            }
            // Misplaced declaration of an exception variable
            catch (AviaryAdapterView aviaryadapterview) { }
            I();
        }
    }

    public void c(d d1)
    {
        if ((d1.n() instanceof com.aviary.android.feather.library.graphics.a.c) && ((com.aviary.android.feather.library.graphics.a.c)d1.n()).q())
        {
            e(d1);
        }
    }

    public void d(d d1)
    {
        if (d1 != null && (d1.n() instanceof com.aviary.android.feather.library.graphics.a.c) && !d1.m())
        {
            a(d1);
        }
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
    {
        q.b((new StringBuilder()).append("onEditorAction: ").append(j).append(", event: ").append(keyevent).toString());
        if (A != null && A.equals(textview) && j == 6)
        {
            textview = (ImageViewDrawableOverlay)c;
            if (textview.getSelectedHighlightView() != null)
            {
                textview = textview.getSelectedHighlightView();
                if ((textview.n() instanceof com.aviary.android.feather.library.graphics.a.c) && ((com.aviary.android.feather.library.graphics.a.c)textview.n()).q())
                {
                    e(textview);
                }
            }
        }
        return false;
    }

    public boolean onKey(View view, int j, KeyEvent keyevent)
    {
        view = ((ImageViewDrawableOverlay)c).getSelectedHighlightView();
        q.a((new StringBuilder()).append("onKey: ").append(j).toString());
        if (view != null && (j == 67 || j == 4))
        {
            keyevent = view.n();
            if (keyevent instanceof com.aviary.android.feather.library.graphics.a.c)
            {
                keyevent = (com.aviary.android.feather.library.graphics.a.c)keyevent;
                if (keyevent.e() && keyevent.q())
                {
                    keyevent.a("");
                    if (view.o())
                    {
                        c.invalidate(view.f());
                    }
                }
            }
        }
        return false;
    }

    public boolean x()
    {
        q.b("getIsChanged");
        Object obj;
        if (((ImageViewDrawableOverlay)c).getHighlightCount() > 0)
        {
            obj = ((ImageViewDrawableOverlay)c).a(0);
            if (obj != null && (((d) (obj)).n() instanceof com.aviary.android.feather.library.graphics.a.c))
            {
                obj = (com.aviary.android.feather.library.graphics.a.c)((d) (obj)).n();
                break MISSING_BLOCK_LABEL_59;
            }
        }
        do
        {
            return false;
        } while (obj == null || ((com.aviary.android.feather.library.graphics.a.c) (obj)).e() || ((com.aviary.android.feather.library.graphics.a.c) (obj)).m() == null);
        boolean flag;
        if (((com.aviary.android.feather.library.graphics.a.c) (obj)).m().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public void y()
    {
        z = null;
        ((ImageViewDrawableOverlay)c).a();
        super.y();
    }

    public void z()
    {
        super.z();
        a(new i[] {
            w
        });
        y = B.g(com.aviary.android.feather.sdk.R.dimen.aviary_text_overlay_default_size);
        ((ImageViewDrawableOverlay)c).setOnDrawableEventListener(this);
        ((ImageViewDrawableOverlay)c).setScaleWithContent(true);
        ((ImageViewDrawableOverlay)c).setForceSingleSelection(false);
        c.requestLayout();
        A.setOnKeyListener(this);
        d();
        g().postDelayed(new TextPanel._cls2(), 200L);
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/panels/TextPanel$2

/* anonymous class */
    class TextPanel._cls2
        implements Runnable
    {

        final r a;

        public void run()
        {
            com.aviary.android.feather.sdk.panels.r.a(a);
        }

            
            {
                a = r.this;
                super();
            }
    }

}
