// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import jz;
import ka;
import kb;
import kc;
import kd;
import km;
import lq;

// Referenced classes of package android.support.v4.view:
//            ViewPager

public class PagerTitleStrip extends ViewGroup
    implements lq
{

    private static final int n[] = {
        0x1010034, 0x1010095, 0x1010098, 0x10100af
    };
    private static final int o[] = {
        0x101038c
    };
    private static final kb q;
    public ViewPager a;
    TextView b;
    TextView c;
    TextView d;
    int e;
    int f;
    private int g;
    private float h;
    private int i;
    private boolean j;
    private boolean k;
    private final ka l = new ka(this, (byte)0);
    private WeakReference m;
    private int p;

    public PagerTitleStrip(Context context, AttributeSet attributeset)
    {
        boolean flag = false;
        super(context, attributeset);
        g = -1;
        h = -1F;
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
            float f1 = j1;
            b.setTextSize(0, f1);
            c.setTextSize(0, f1);
            d.setTextSize(0, f1);
        }
        if (attributeset.hasValue(2))
        {
            j1 = attributeset.getColor(2, 0);
            b.setTextColor(j1);
            c.setTextColor(j1);
            d.setTextColor(j1);
        }
        i = attributeset.getInteger(3, 80);
        attributeset.recycle();
        f = c.getTextColors().getDefaultColor();
        p = 153;
        j1 = p << 24 | f & 0xffffff;
        b.setTextColor(j1);
        d.setTextColor(j1);
        b.setEllipsize(android.text.TextUtils.TruncateAt.END);
        c.setEllipsize(android.text.TextUtils.TruncateAt.END);
        d.setEllipsize(android.text.TextUtils.TruncateAt.END);
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
        e = (int)(context.getResources().getDisplayMetrics().density * 16F);
    }

    public static float a(PagerTitleStrip pagertitlestrip)
    {
        return pagertitlestrip.h;
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

    public void a(int i1)
    {
        e = i1;
        requestLayout();
    }

    public void a(int i1, float f1, boolean flag)
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
        if (i1 != g)
        {
            a(i1, a.a);
        } else
        if (!flag && f1 == h)
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
        f3 = 0.5F + f1;
        f2 = f3;
        if (f3 > 1.0F)
        {
            f2 = f3 - 1.0F;
        }
        i3 = j2 - k3 - (int)(f2 * (float)(j2 - (l2 + i3) - k3)) - i3;
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
        j4 = Math.max(Math.max(j4 + i4, k4 + l3), l4 + k3);
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
        j1 = Math.min(l2, i3 - e - i2);
        b.layout(j1, k1, i2 + j1, b.getMeasuredHeight() + k1);
        j1 = Math.max(j2 - k2 - l1, e + j3);
        d.layout(j1, i1, j1 + l1, d.getMeasuredHeight() + i1);
        h = f1;
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

    public final void a(int i1, jz jz1)
    {
        Object obj = null;
        CharSequence charsequence;
        TextView textview;
        int j1;
        int k1;
        if (jz1 != null)
        {
            j1 = jz1.b();
        } else
        {
            j1 = 0;
        }
        j = true;
        if (i1 > 0 && jz1 != null)
        {
            charsequence = jz1.b(i1 - 1);
        } else
        {
            charsequence = null;
        }
        b.setText(charsequence);
        textview = c;
        if (jz1 != null && i1 < j1)
        {
            charsequence = jz1.b(i1);
        } else
        {
            charsequence = null;
        }
        textview.setText(charsequence);
        charsequence = obj;
        if (i1 + 1 < j1)
        {
            charsequence = obj;
            if (jz1 != null)
            {
                charsequence = jz1.b(i1 + 1);
            }
        }
        d.setText(charsequence);
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)(getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), 0x80000000);
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), 0x80000000);
        b.measure(j1, k1);
        c.measure(j1, k1);
        d.measure(j1, k1);
        g = i1;
        if (!k)
        {
            a(i1, h, false);
        }
        j = false;
    }

    public final void a(jz jz1, jz jz2)
    {
        if (jz1 != null)
        {
            jz1.b(l);
            m = null;
        }
        if (jz2 != null)
        {
            jz2.a(l);
            m = new WeakReference(jz2);
        }
        if (a != null)
        {
            g = -1;
            h = -1F;
            a(a.b, jz2);
            requestLayout();
        }
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
        jz jz1 = ((ViewPager) (obj)).a;
        ((ViewPager) (obj)).b(l);
        obj.d = l;
        a = ((ViewPager) (obj));
        if (m != null)
        {
            obj = (jz)m.get();
        } else
        {
            obj = null;
        }
        a(((jz) (obj)), jz1);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            a(a.a, null);
            a.b(null);
            a.d = null;
            a = null;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        float f1 = 0.0F;
        if (a != null)
        {
            if (h >= 0.0F)
            {
                f1 = h;
            }
            a(g, f1, true);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000)
        {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int l1 = getPaddingTop() + getPaddingBottom();
        int i2 = getChildMeasureSpec(j1, l1, -2);
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = getChildMeasureSpec(i1, (int)((float)k1 * 0.2F), -2);
        b.measure(i1, i2);
        c.measure(i1, i2);
        d.measure(i1, i2);
        if (android.view.View.MeasureSpec.getMode(j1) == 0x40000000)
        {
            i1 = android.view.View.MeasureSpec.getSize(j1);
        } else
        {
            i1 = c.getMeasuredHeight();
            i1 = Math.max(a(), l1 + i1);
        }
        setMeasuredDimension(k1, km.a(i1, j1, km.l(c) << 16));
    }

    public void requestLayout()
    {
        if (!j)
        {
            super.requestLayout();
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            q = new kd();
        } else
        {
            q = new kc();
        }
    }
}
