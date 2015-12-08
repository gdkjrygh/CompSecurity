// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPager, s

public class PagerTitleStrip extends ViewGroup
    implements ViewPager.a
{
    private final class a extends DataSetObserver
        implements ViewPager.e, ViewPager.f
    {

        final PagerTitleStrip a;
        private int b;

        public final void a(s s1, s s2)
        {
            a.a(s1, s2);
        }

        public final void onChanged()
        {
            float f1 = 0.0F;
            a.a(a.a.b(), a.a.a());
            if (PagerTitleStrip.a(a) >= 0.0F)
            {
                f1 = PagerTitleStrip.a(a);
            }
            a.a(a.a.b(), f1, true);
        }

        public final void onPageScrollStateChanged(int i1)
        {
            b = i1;
        }

        public final void onPageScrolled(int i1, float f1, int j1)
        {
            j1 = i1;
            if (f1 > 0.5F)
            {
                j1 = i1 + 1;
            }
            a.a(j1, f1, false);
        }

        public final void onPageSelected(int i1)
        {
            float f1 = 0.0F;
            if (b == 0)
            {
                a.a(a.a.b(), a.a.a());
                if (PagerTitleStrip.a(a) >= 0.0F)
                {
                    f1 = PagerTitleStrip.a(a);
                }
                a.a(a.a.b(), f1, true);
            }
        }

        private a()
        {
            a = PagerTitleStrip.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    static interface b
    {

        public abstract void a(TextView textview);
    }

    static final class c
        implements b
    {

        public final void a(TextView textview)
        {
            textview.setSingleLine();
        }

        c()
        {
        }
    }

    static final class d
        implements b
    {

        public final void a(TextView textview)
        {
            textview.setTransformationMethod(new t.a(textview.getContext()));
        }

        d()
        {
        }
    }


    private static final int n[] = {
        0x1010034, 0x1010095, 0x1010098, 0x10100af
    };
    private static final int o[] = {
        0x101038c
    };
    private static final b q;
    ViewPager a;
    TextView b;
    TextView c;
    TextView d;
    int e;
    private int f;
    private float g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private final a l;
    private WeakReference m;
    private int p;

    public PagerTitleStrip(Context context)
    {
        this(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = -1;
        g = -1F;
        l = new a((byte)0);
        TextView textview = new TextView(context);
        b = textview;
        addView(textview);
        textview = new TextView(context);
        c = textview;
        addView(textview);
        textview = new TextView(context);
        d = textview;
        addView(textview);
        attributeset = context.obtainStyledAttributes(attributeset, n);
        int i1 = attributeset.getResourceId(0, 0);
        if (i1 != 0)
        {
            b.setTextAppearance(context, i1);
            c.setTextAppearance(context, i1);
            d.setTextAppearance(context, i1);
        }
        int j1 = attributeset.getDimensionPixelSize(1, 0);
        if (j1 != 0)
        {
            setTextSize(0, j1);
        }
        if (attributeset.hasValue(2))
        {
            int k1 = attributeset.getColor(2, 0);
            b.setTextColor(k1);
            c.setTextColor(k1);
            d.setTextColor(k1);
        }
        i = attributeset.getInteger(3, 80);
        attributeset.recycle();
        e = c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6F);
        b.setEllipsize(android.text.TextUtils.TruncateAt.END);
        c.setEllipsize(android.text.TextUtils.TruncateAt.END);
        d.setEllipsize(android.text.TextUtils.TruncateAt.END);
        boolean flag = false;
        if (i1 != 0)
        {
            attributeset = context.obtainStyledAttributes(i1, o);
            flag = attributeset.getBoolean(0, false);
            attributeset.recycle();
        }
        if (flag)
        {
            a(b);
            a(c);
            a(d);
        } else
        {
            b.setSingleLine();
            c.setSingleLine();
            d.setSingleLine();
        }
        h = (int)(16F * context.getResources().getDisplayMetrics().density);
    }

    static float a(PagerTitleStrip pagertitlestrip)
    {
        return pagertitlestrip.g;
    }

    private static void a(TextView textview)
    {
        q.a(textview);
    }

    int a()
    {
        int i1 = 0;
        Drawable drawable = getBackground();
        if (drawable != null)
        {
            i1 = drawable.getIntrinsicHeight();
        }
        return i1;
    }

    void a(int i1, float f1, boolean flag)
    {
        int j1;
        int k1;
        int k3;
        int l3;
        int i4;
        int j4;
        float f2;
        float f3;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k4;
        int l4;
        if (i1 != f)
        {
            a(i1, a.a());
        } else
        if (!flag && f1 == g)
        {
            return;
        }
        k = true;
        i2 = b.getMeasuredWidth();
        j3 = c.getMeasuredWidth();
        l1 = d.getMeasuredWidth();
        i3 = j3 / 2;
        j2 = getWidth();
        j1 = getHeight();
        l2 = getPaddingLeft();
        k2 = getPaddingRight();
        i1 = getPaddingTop();
        k1 = getPaddingBottom();
        k3 = k2 + i3;
        f3 = f1 + 0.5F;
        f2 = f3;
        if (f3 > 1.0F)
        {
            f2 = f3 - 1.0F;
        }
        i3 = j2 - k3 - (int)((float)(j2 - (l2 + i3) - k3) * f2) - i3;
        j3 = i3 + j3;
        i4 = b.getBaseline();
        l3 = c.getBaseline();
        k3 = d.getBaseline();
        j4 = Math.max(Math.max(i4, l3), k3);
        i4 = j4 - i4;
        l3 = j4 - l3;
        k3 = j4 - k3;
        j4 = b.getMeasuredHeight();
        k4 = c.getMeasuredHeight();
        l4 = d.getMeasuredHeight();
        j4 = Math.max(Math.max(i4 + j4, l3 + k4), k3 + l4);
        i & 0x70;
        JVM INSTR lookupswitch 2: default 304
    //                   16: 456
    //                   80: 489;
           goto _L1 _L2 _L3
_L1:
        k1 = i1 + i4;
        j1 = i1 + l3;
        i1 += k3;
_L5:
        c.layout(i3, j1, j3, c.getMeasuredHeight() + j1);
        j1 = Math.min(l2, i3 - h - i2);
        b.layout(j1, k1, j1 + i2, b.getMeasuredHeight() + k1);
        j1 = Math.max(j2 - k2 - l1, h + j3);
        d.layout(j1, i1, j1 + l1, d.getMeasuredHeight() + i1);
        g = f1;
        k = false;
        return;
_L2:
        i1 = (j1 - i1 - k1 - j4) / 2;
        k1 = i1 + i4;
        j1 = i1 + l3;
        i1 += k3;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1 - k1 - j4;
        k1 = i1 + i4;
        j1 = i1 + l3;
        i1 += k3;
        if (true) goto _L5; else goto _L4
_L4:
    }

    final void a(int i1, s s1)
    {
        CharSequence charsequence;
        TextView textview;
        int j1;
        int k1;
        if (s1 != null)
        {
            j1 = s1.getCount();
        } else
        {
            j1 = 0;
        }
        j = true;
        textview = null;
        charsequence = textview;
        if (i1 > 0)
        {
            charsequence = textview;
            if (s1 != null)
            {
                charsequence = s1.getPageTitle(i1 - 1);
            }
        }
        b.setText(charsequence);
        textview = c;
        if (s1 != null && i1 < j1)
        {
            charsequence = s1.getPageTitle(i1);
        } else
        {
            charsequence = null;
        }
        textview.setText(charsequence);
        textview = null;
        charsequence = textview;
        if (i1 + 1 < j1)
        {
            charsequence = textview;
            if (s1 != null)
            {
                charsequence = s1.getPageTitle(i1 + 1);
            }
        }
        d.setText(charsequence);
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)(getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), 0x80000000);
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), 0x80000000);
        b.measure(j1, k1);
        c.measure(j1, k1);
        d.measure(j1, k1);
        f = i1;
        if (!k)
        {
            a(i1, g, false);
        }
        j = false;
    }

    final void a(s s1, s s2)
    {
        if (s1 != null)
        {
            s1.unregisterDataSetObserver(l);
            m = null;
        }
        if (s2 != null)
        {
            s2.registerDataSetObserver(l);
            m = new WeakReference(s2);
        }
        if (a != null)
        {
            f = -1;
            g = -1F;
            a(a.b(), s2);
            requestLayout();
        }
    }

    public final int b()
    {
        return h;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Object obj = getParent();
        if (!(obj instanceof ViewPager))
        {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        obj = (ViewPager)obj;
        s s1 = ((ViewPager) (obj)).a();
        ((ViewPager) (obj)).b(l);
        ((ViewPager) (obj)).a(l);
        a = ((ViewPager) (obj));
        if (m != null)
        {
            obj = (s)m.get();
        } else
        {
            obj = null;
        }
        a(((s) (obj)), s1);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            a(a.a(), null);
            a.b(null);
            a.a(null);
            a = null;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        float f1 = 0.0F;
        if (a != null)
        {
            if (g >= 0.0F)
            {
                f1 = g;
            }
            a(f, f1, true);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (l1 != 0x40000000)
        {
            throw new IllegalStateException("Must measure with an exact width");
        }
        l1 = a();
        int i2 = getPaddingTop() + getPaddingBottom();
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)i1 * 0.8F)), 0x80000000);
        int k2 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(0, j1 - i2), 0x80000000);
        b.measure(j2, k2);
        c.measure(j2, k2);
        d.measure(j2, k2);
        if (k1 == 0x40000000)
        {
            setMeasuredDimension(i1, j1);
            return;
        } else
        {
            setMeasuredDimension(i1, Math.max(l1, c.getMeasuredHeight() + i2));
            return;
        }
    }

    public void requestLayout()
    {
        if (!j)
        {
            super.requestLayout();
        }
    }

    public void setGravity(int i1)
    {
        i = i1;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f1)
    {
        p = (int)(255F * f1) & 0xff;
        int i1 = p << 24 | e & 0xffffff;
        b.setTextColor(i1);
        d.setTextColor(i1);
    }

    public void setTextColor(int i1)
    {
        e = i1;
        c.setTextColor(i1);
        i1 = p << 24 | e & 0xffffff;
        b.setTextColor(i1);
        d.setTextColor(i1);
    }

    public void setTextSize(int i1, float f1)
    {
        b.setTextSize(i1, f1);
        c.setTextSize(i1, f1);
        d.setTextSize(i1, f1);
    }

    public void setTextSpacing(int i1)
    {
        h = i1;
        requestLayout();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            q = new d();
        } else
        {
            q = new c();
        }
    }
}
