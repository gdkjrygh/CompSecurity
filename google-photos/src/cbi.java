// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.text.Layout;
import android.widget.LinearLayout;

public class cbi extends cat
    implements cay
{

    public static final TimeInterpolator b;
    private final Typeface c;
    private final int d;
    private final float e;
    private final float f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final int k;
    private final int l;
    private final float m;
    private final boolean n;
    private final float o;
    private final float p;
    private final float q;
    private final int r;
    private final int s;
    private final long t;
    private final long u;
    private final car v;
    private final int w;
    private Bitmap x;
    private Matrix y;
    private String z;

    public cbi(cbj cbj1)
    {
        super(cbj1.d);
        c = (Typeface)b.a(cbj1.k, "builder.mTypeface", null);
        d = cbj1.f;
        i = cbj1.e;
        e = cbj1.g;
        f = cbj1.h;
        g = cbj1.i;
        h = cbj1.j;
        m = cbj1.l;
        j = cbj1.a;
        k = cbj1.c;
        l = cbj1.b;
        n = cbj1.m;
        o = cbj1.n;
        p = cbj1.o;
        q = cbj1.p;
        r = cbj1.q;
        s = cbj1.r;
        v = cbj1.s;
        w = cbj1.t;
        t = cbj1.u;
        u = cbj1.v;
    }

    private static boolean a(char c1)
    {
        return c1 != '\240' && !Character.isLetterOrDigit(c1);
    }

    private boolean a(ccw ccw1)
    {
        boolean flag1 = false;
        Layout layout = ccw1.getLayout();
        CharSequence charsequence = ccw1.getText();
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < ccw1.getLineCount() - 1)
                {
                    int j1 = layout.getLineEnd(i1);
                    if (a(charsequence.charAt(j1 - 1)) || a(charsequence.charAt(j1)))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private boolean a(ccw ccw1, int i1, int j1, int k1, float f1, int l1)
    {
        f1 = ((float)i1 * f1) / 784F;
        ccw1.setLayoutParams(new android.view.ViewGroup.LayoutParams(j1, -2));
        ccw1.setTextSize(0, f1);
        if (n)
        {
            ccw1.setShadowLayer(o * f1, p * f1, f1 * q, r);
        }
        ccw1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), 0);
        if (!a(ccw1)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (l1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ccw1.getLineCount() == 0 || ccw1.getLineCount() > l1) goto _L1; else goto _L3
_L3:
        return true;
        if (android.view.View.MeasureSpec.getSize(ccw1.getMeasuredHeight()) > k1) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected final float A(cba cba1)
    {
        float f1 = 1.0F;
        if (!b.e(cba1))
        {
            f1 = 0.0F;
        } else
        {
            long l1 = cba1.r.c - cba1.a;
            if (l1 < u)
            {
                return (1.0F * (float)l1) / (float)u;
            }
        }
        return f1;
    }

    public final car E_()
    {
        if (v != null)
        {
            return v;
        } else
        {
            return super.E_();
        }
    }

    protected Bitmap a(Context context, Bitmap bitmap, cba cba1, int i1, int j1)
    {
        Bitmap bitmap1;
label0:
        {
            if (bitmap != null)
            {
                bitmap1 = bitmap;
                if (bitmap.isMutable())
                {
                    break label0;
                }
            }
            bitmap1 = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        }
        bitmap = new Canvas(bitmap1);
        bitmap.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        bitmap.drawColor(s);
        LinearLayout linearlayout = new LinearLayout(context);
        context = new ccw(context);
        float f1 = ddl.a(i1, j1);
        i1 = (int)(((float)h * f1) / 784F);
        context.setPadding(i1, i1, i1, i1);
        context.setVisibility(0);
        context.setGravity(d);
        context.setText(cba1.p);
        context.setTextColor(i);
        context.setAllCaps(j);
        context.setTypeface(c);
        context.a((float)g * 0.004F);
        if (f != 0.0F)
        {
            context.setLineSpacing(0.0F, f / e);
        }
        a(((ccw) (context)), bitmap.getWidth(), bitmap.getHeight(), f1);
        linearlayout.addView(context);
        linearlayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(bitmap.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(bitmap.getHeight(), 0x40000000));
        linearlayout.layout(0, 0, bitmap.getWidth(), bitmap.getHeight());
        linearlayout.draw(bitmap);
        return bitmap1;
    }

    public final Bitmap a(Context context, cba cba1, int i1, int j1)
    {
        b.a(cba1.p, "title");
        if (x != null && (x.getWidth() != i1 || x.getHeight() != j1))
        {
            x.recycle();
            x = null;
        }
        if (x == null || !cba1.p.equals(z))
        {
            x = a(context, x, cba1, i1, j1);
            z = cba1.p;
        }
        return x;
    }

    protected final void a(ccw ccw1, int i1, int j1, float f1)
    {
        if (k == -1) goto _L2; else goto _L1
_L1:
        int k1 = (int)e;
_L9:
        if (k1 <= 0 || (float)k1 / e < 0.8F) goto _L2; else goto _L3
_L3:
        if (!a(ccw1, k1, i1, j1, f1, k)) goto _L5; else goto _L4
_L4:
        k1 = 1;
_L7:
        if (k1 == 0)
        {
            for (k1 = (int)e; k1 > 0 && !a(ccw1, k1, i1, j1, f1, l); k1--) { }
        }
        break; /* Loop/switch isn't completed */
_L5:
        k1--;
        continue; /* Loop/switch isn't completed */
_L2:
        k1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
        ccw1.setLayoutParams(new android.view.ViewGroup.LayoutParams(i1, j1));
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public Matrix o(cba cba1)
    {
        if (y == null)
        {
            y = new Matrix();
        }
        return y;
    }

    public final float p(cba cba1)
    {
        float f1;
        float f2;
        f1 = 1.0F;
        f2 = m;
        if (b.e(cba1)) goto _L2; else goto _L1
_L1:
        f1 = 0.0F;
_L4:
        return Math.min(f1, A(cba1)) * f2;
_L2:
        long l1 = cba1.a - cba1.r.b;
        if (l1 < t)
        {
            f1 = (1.0F * (float)l1) / (float)t;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int q(cba cba1)
    {
        return w;
    }

    public float u(cba cba1)
    {
        float f1 = super.a.u(cba1);
        return f1 + (E_().h - f1) * A(cba1);
    }

    static 
    {
        b = dac.a;
    }
}
