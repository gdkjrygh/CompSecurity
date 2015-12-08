// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class isk extends FrameLayout
    implements oiz
{

    int a;
    isf b;
    iso c[];
    int d;
    isp e;
    private Rect f;
    private Paint g;
    private List h;
    private ViewPropertyAnimator i;
    private final Handler j;
    private int k;
    private Runnable l;
    private int m;

    public isk(Context context)
    {
        this(context, null);
    }

    private isk(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private isk(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, 0);
        a = 0;
        f = new Rect();
        g = new Paint(1);
        h = new ArrayList();
        j = new Handler();
        k = -1;
        l = new isl(this);
        m = 0;
    }

    private Rect a(int i1)
    {
        int j1 = getMeasuredWidth();
        int k1 = getMeasuredHeight();
        if (j1 == 0 || k1 == 0)
        {
            return new Rect(0, 0, 1, 1);
        }
        if (c == null || i1 >= c.length)
        {
            Log.e("StoryLayoutCoverImageView", (new StringBuilder(47)).append("Invalid call to getCoverImageScale: ").append(i1).toString());
            return new Rect(0, 0, 1, 1);
        } else
        {
            iso iso1 = c[i1];
            return new Rect(0, 0, iso1.c, iso1.d);
        }
    }

    private void a(View view, ise ise1)
    {
        int i1 = getWidth();
        int j1 = getHeight();
        int k1 = view.getWidth();
        int l1 = view.getHeight();
        float f3 = ise1.a.right;
        float f4 = ise1.a.left;
        float f5 = k1;
        float f6 = ise1.a.bottom;
        float f7 = ise1.a.top;
        float f8 = l1;
        float f1 = ((ise1.a.right + ise1.a.left) * (float)k1) / 2.0F;
        float f2 = ((ise1.a.bottom + ise1.a.top) * (float)l1) / 2.0F;
        f3 = Math.max((float)i1 / ((f3 - f4) * f5), (float)j1 / ((f6 - f7) * f8));
        f6 = ise1.b.right;
        f7 = ise1.b.left;
        f8 = k1;
        float f9 = ise1.b.bottom;
        float f10 = ise1.b.top;
        float f11 = l1;
        f4 = ((ise1.b.right + ise1.b.left) * (float)k1) / 2.0F;
        f5 = ((ise1.b.bottom + ise1.b.top) * (float)l1) / 2.0F;
        f6 = Math.max((float)i1 / ((f6 - f7) * f8), (float)j1 / ((f9 - f10) * f11));
        f7 = (float)(i1 - k1) / 2.0F;
        f8 = (float)(j1 - l1) / 2.0F;
        f9 = k1 / 2;
        f10 = l1 / 2;
        f11 = k1 / 2;
        float f12 = l1 / 2;
        view.setScaleX(f3);
        view.setScaleY(f3);
        view.setTranslationX((f9 - f1) * f3 + f7);
        view.setTranslationY((f10 - f2) * f3 + f8);
        i = view.animate().scaleX(f6).scaleY(f6).translationX(f7 + (f11 - f4) * f6).translationY(f8 + (f12 - f5) * f6).setDuration(10000L);
        i.start();
    }

    private void a(isf isf1, int i1, int j1)
    {
        if (isf1 != null)
        {
            f.set(0, 0, i1, j1);
            g.setDither(true);
            g.setShader(new LinearGradient(isf1.a.a * (float)i1, isf1.a.b * (float)j1, isf1.a.c * (float)i1, isf1.a.d * (float)j1, isf1.b, isf1.c, android.graphics.Shader.TileMode.CLAMP));
        }
    }

    static void a(isk isk1)
    {
        if (isk1.k == -1)
        {
            isk1.k = 0;
            isk1.a(((View) ((MediaView)isk1.h.get(isk1.k))), isk1.c[isk1.k].b);
            return;
        }
        isk1.k = (isk1.k + 1) % isk1.h.size();
        Object obj = (MediaView)isk1.h.get(isk1.k);
        MediaView mediaview1 = (MediaView)isk1.h.get(1);
        MediaView mediaview = (MediaView)isk1.h.get(0);
        isk1.a(((View) (obj)), isk1.c[isk1.k].b);
        float f1;
        float f2;
        boolean flag;
        if (mediaview1.getAlpha() != 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        if (flag)
        {
            f2 = 1.0F;
        } else
        {
            f2 = 0.0F;
        }
        obj = ObjectAnimator.ofFloat(mediaview1, "alpha", new float[] {
            f1, f2
        });
        ((ObjectAnimator) (obj)).setDuration(2000L);
        ((ObjectAnimator) (obj)).addListener(new ism(isk1, flag, mediaview));
        ((ObjectAnimator) (obj)).start();
    }

    static Runnable b(isk isk1)
    {
        return isk1.l;
    }

    private void b()
    {
        j.removeCallbacks(l);
        if (i != null)
        {
            i.cancel();
        }
    }

    static Handler c(isk isk1)
    {
        return isk1.j;
    }

    static int d(isk isk1)
    {
        int i1 = isk1.m + 1;
        isk1.m = i1;
        return i1;
    }

    static isp e(isk isk1)
    {
        return isk1.e;
    }

    public final void ax_()
    {
        removeAllViews();
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((MediaView)iterator.next()).c()) { }
        a = 0;
        f = new Rect();
        g = new Paint(1);
        k = -1;
        b();
        m = 0;
        e = null;
        setMeasuredDimension(0, 0);
    }

    public final void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (a != 0)
        {
            canvas.drawColor(a);
        }
        if (b != null)
        {
            canvas.drawRect(f, g);
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a(b, getWidth(), getHeight());
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        b();
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            Rect rect = a(i1);
            getChildAt(i1).layout(0, 0, rect.width(), rect.height());
        }

    }

    protected final void onMeasure(int i1, int j1)
    {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i1), android.view.View.MeasureSpec.getSize(j1));
        if (getChildCount() == 0)
        {
            i1 = 0;
            while (i1 < 2) 
            {
                njr njr1 = c[i1].a;
                if (i1 == h.size())
                {
                    MediaView mediaview = new MediaView(getContext());
                    mediaview.c = false;
                    mediaview.setLayerType(2, null);
                    h.add(mediaview);
                }
                Object obj = c[i1].b;
                float f1 = Math.min(((ise) (obj)).a.left, ((ise) (obj)).b.left);
                float f2 = Math.min(((ise) (obj)).a.top, ((ise) (obj)).b.top);
                float f4 = Math.max(((ise) (obj)).a.right, ((ise) (obj)).b.right);
                float f3 = Math.max(((ise) (obj)).a.bottom, ((ise) (obj)).b.bottom);
                RectF rectf = new RectF(f1, f2, f4, f3);
                f4 -= f1;
                f3 -= f2;
                RectF rectf1 = new RectF((((ise) (obj)).a.left - f1) / f4, (((ise) (obj)).a.top - f2) / f3, (((ise) (obj)).a.right - f1) / f4, (((ise) (obj)).a.bottom - f2) / f3);
                RectF rectf2 = new RectF((((ise) (obj)).b.left - f1) / f4, (((ise) (obj)).b.top - f2) / f3, (((ise) (obj)).b.right - f1) / f4, (((ise) (obj)).b.bottom - f2) / f3);
                j1 = (int)((float)getMeasuredWidth() * (f4 / Math.max(((ise) (obj)).a.right - ((ise) (obj)).a.left, ((ise) (obj)).b.right - ((ise) (obj)).b.left)));
                f1 = getMeasuredHeight();
                int k1 = (int)((f3 / Math.max(((ise) (obj)).a.bottom - ((ise) (obj)).a.top, ((ise) (obj)).b.bottom - ((ise) (obj)).b.top)) * f1);
                c[i1].b.a = rectf1;
                c[i1].b.b = rectf2;
                c[i1].c = j1;
                c[i1].d = k1;
                obj = (MediaView)h.get(i1);
                obj.d = 0;
                if (((MediaView) (obj)).l != j1 || ((MediaView) (obj)).m != k1)
                {
                    ((MediaView) (obj)).c();
                    obj.l = j1;
                    obj.m = k1;
                    ((MediaView) (obj)).b();
                }
                obj.e = rectf;
                j1 = d;
                boolean flag1 = ((MediaView) (obj)).g();
                boolean flag;
                if ((j1 & 4) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj.i = j1;
                if (flag1 != flag)
                {
                    if (flag)
                    {
                        ((MediaView) (obj)).e();
                    } else
                    if (!((MediaView) (obj)).o)
                    {
                        ((MediaView) (obj)).f();
                    }
                }
                ((MediaView) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                if (((MediaView) (obj)).f == null || !((MediaView) (obj)).f.equals(njr1) || !MediaView.a(((MediaView) (obj)).g, null))
                {
                    obj.h = true;
                    obj.g = null;
                    ((MediaView) (obj)).c();
                    obj.f = njr1;
                    if (((MediaView) (obj)).f != null)
                    {
                        obj.a = false;
                    }
                    ((MediaView) (obj)).b();
                    ((MediaView) (obj)).invalidate();
                }
                if (i1 == 0)
                {
                    f1 = 1.0F;
                } else
                {
                    f1 = 0.0F;
                }
                ((MediaView) (obj)).setAlpha(f1);
                if (i1 == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj.b = flag;
                obj.n = new isn(this);
                addView(((View) (obj)));
                i1++;
            }
            j.removeCallbacks(l);
            j.post(l);
        }
        for (i1 = 0; i1 < getChildCount(); i1++)
        {
            Rect rect = a(i1);
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(rect.width(), 0x40000000);
            int l1 = android.view.View.MeasureSpec.makeMeasureSpec(rect.height(), 0x40000000);
            getChildAt(i1).measure(j1, l1);
        }

    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        a(b, i1, j1);
    }
}
