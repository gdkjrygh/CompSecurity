// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.a.m;
import com.nineoldandroids.a.o;

// Referenced classes of package com.qihoo.security.widget.shadow:
//            ZDepth, e, a, c, 
//            b

public class d extends View
{

    protected a a;
    protected e b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected long g;
    protected boolean h;

    protected d(Context context)
    {
        this(context, null);
        a();
    }

    protected d(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        a();
    }

    protected d(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private ZDepth a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("unknown zDepth value.");

        case 0: // '\0'
            return ZDepth.Depth0;

        case 1: // '\001'
            return ZDepth.Depth1;

        case 2: // '\002'
            return ZDepth.Depth2;

        case 3: // '\003'
            return ZDepth.Depth3;

        case 4: // '\004'
            return ZDepth.Depth4;

        case 5: // '\005'
            return ZDepth.Depth5;
        }
    }

    protected int a(ZDepth zdepth)
    {
        return (int)Math.max(zdepth.getBlurTopShadowPx(getContext()) + zdepth.getOffsetYTopShadowPx(getContext()), zdepth.getBlurBottomShadowPx(getContext()) + zdepth.getOffsetYBottomShadowPx(getContext()));
    }

    protected void a()
    {
        setWillNotDraw(false);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setLayerType(1, null);
        }
    }

    protected void b(ZDepth zdepth)
    {
        int i = zdepth.getAlphaTopShadow();
        int j = zdepth.getAlphaBottomShadow();
        float f1 = zdepth.getOffsetYTopShadowPx(getContext());
        float f2 = zdepth.getOffsetYBottomShadowPx(getContext());
        float f3 = zdepth.getBlurTopShadowPx(getContext());
        float f4 = zdepth.getBlurBottomShadowPx(getContext());
        if (!h)
        {
            b.a = i;
            b.b = j;
            b.c = f1;
            b.d = f2;
            b.e = f3;
            b.f = f4;
            a.a(b, c, d, getWidth() - e, getHeight() - f);
            invalidate();
            return;
        } else
        {
            int k = b.a;
            int l = b.b;
            float f5 = b.c;
            float f6 = b.d;
            float f7 = b.e;
            float f8 = b.f;
            zdepth = o.a(new m[] {
                m.a("alphaTopShadow", new int[] {
                    k, i
                }), m.a("alphaBottomShadow", new int[] {
                    l, j
                }), m.a("offsetTopShadow", new float[] {
                    f5, f1
                }), m.a("offsetBottomShadow", new float[] {
                    f6, f2
                }), m.a("blurTopShadow", new float[] {
                    f7, f3
                }), m.a("blurBottomShadow", new float[] {
                    f8, f4
                })
            });
            zdepth.d(g);
            zdepth.a(new LinearInterpolator());
            zdepth.a(new com.nineoldandroids.a.o.b() {

                final d a;

                public void a(o o1)
                {
                    int i1 = ((Integer)o1.b("alphaTopShadow")).intValue();
                    int j1 = ((Integer)o1.b("alphaBottomShadow")).intValue();
                    float f9 = ((Float)o1.b("offsetTopShadow")).floatValue();
                    float f10 = ((Float)o1.b("offsetBottomShadow")).floatValue();
                    float f11 = ((Float)o1.b("blurTopShadow")).floatValue();
                    float f12 = ((Float)o1.b("blurBottomShadow")).floatValue();
                    a.b.a = i1;
                    a.b.b = j1;
                    a.b.c = f9;
                    a.b.d = f10;
                    a.b.e = f11;
                    a.b.f = f12;
                    a.a.a(a.b, a.c, a.d, a.getWidth() - a.e, a.getHeight() - a.f);
                    a.invalidate();
                }

            
            {
                a = d.this;
                super();
            }
            });
            zdepth.a();
            return;
        }
    }

    protected int getZDepthPaddingBottom()
    {
        return f;
    }

    protected int getZDepthPaddingLeft()
    {
        return c;
    }

    protected int getZDepthPaddingRight()
    {
        return e;
    }

    protected int getZDepthPaddingTop()
    {
        return d;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        a.a(canvas);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.a(b, c, d, k - i - e, l - j - f);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        l = android.view.View.MeasureSpec.getSize(i);
        k = android.view.View.MeasureSpec.getSize(j);
        i1 = android.view.View.MeasureSpec.getMode(i);
        j1 = android.view.View.MeasureSpec.getMode(j);
        i = l;
        i1;
        JVM INSTR lookupswitch 3: default 64
    //                   -2147483648: 123
    //                   0: 123
    //                   1073741824: 67;
           goto _L1 _L2 _L2 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        i = l;
_L4:
        j = k;
        switch (j1)
        {
        default:
            j = k;
            break;

        case -2147483648: 
        case 0: // '\0'
            break MISSING_BLOCK_LABEL_128;

        case 1073741824: 
            break;
        }
_L5:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, i1), android.view.View.MeasureSpec.makeMeasureSpec(j, j1));
        return;
_L2:
        i = 0;
          goto _L4
        j = 0;
          goto _L5
    }

    protected void setShape(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("unknown shape value.");

        case 0: // '\0'
            a = new c();
            return;

        case 1: // '\001'
            a = new b();
            break;
        }
    }

    protected void setZDepth(int i)
    {
        setZDepth(a(i));
    }

    protected void setZDepth(ZDepth zdepth)
    {
        b = new e();
        b.a(getContext(), zdepth);
    }

    protected void setZDepthAnimDuration(long l)
    {
        g = l;
    }

    protected void setZDepthDoAnimation(boolean flag)
    {
        h = flag;
    }

    protected void setZDepthPaddingBottom(int i)
    {
        f = a(a(i));
    }

    protected void setZDepthPaddingLeft(int i)
    {
        c = a(a(i));
    }

    protected void setZDepthPaddingRight(int i)
    {
        e = a(a(i));
    }

    protected void setZDepthPaddingTop(int i)
    {
        d = a(a(i));
    }
}
