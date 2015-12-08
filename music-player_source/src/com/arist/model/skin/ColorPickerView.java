// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.arist.model.skin:
//            k, a

public class ColorPickerView extends View
{

    private int A;
    private float B;
    private RectF C;
    private RectF D;
    private RectF E;
    private RectF F;
    private a G;
    private Point H;
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private k g;
    private Paint h;
    private Paint i;
    private Paint j;
    private Paint k;
    private Paint l;
    private Paint m;
    private Paint n;
    private Shader o;
    private Shader p;
    private Shader q;
    private Shader r;
    private int s;
    private float t;
    private float u;
    private float v;
    private String w;
    private int x;
    private int y;
    private boolean z;

    public ColorPickerView(Context context)
    {
        this(context, null);
    }

    public ColorPickerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = 30F;
        b = 20F;
        c = 10F;
        d = 5F;
        e = 2.0F;
        f = 1.0F;
        s = 255;
        t = 360F;
        u = 0.0F;
        v = 0.0F;
        w = "";
        x = 0xff1c1c1c;
        y = 0xff6e6e6e;
        z = false;
        A = 0;
        H = null;
        f = getContext().getResources().getDisplayMetrics().density;
        d = d * f;
        e = e * f;
        a = a * f;
        b = b * f;
        c = c * f;
        B = Math.max(Math.max(d, e), f * 1.0F) * 1.5F;
        h = new Paint();
        i = new Paint();
        j = new Paint();
        k = new Paint();
        l = new Paint();
        m = new Paint();
        n = new Paint();
        i.setStyle(android.graphics.Paint.Style.STROKE);
        i.setStrokeWidth(f * 2.0F);
        i.setAntiAlias(true);
        k.setColor(x);
        k.setStyle(android.graphics.Paint.Style.STROKE);
        k.setStrokeWidth(f * 2.0F);
        k.setAntiAlias(true);
        m.setColor(0xff1c1c1c);
        m.setTextSize(14F * f);
        m.setAntiAlias(true);
        m.setTextAlign(android.graphics.Paint.Align.CENTER);
        m.setFakeBoldText(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private boolean a(MotionEvent motionevent)
    {
        float f3 = 0.0F;
        float f1 = 0.0F;
        if (H != null)
        {
            int i1 = H.x;
            int k1 = H.y;
            if (E.contains(i1, k1))
            {
                A = 1;
                float f4 = motionevent.getY();
                motionevent = E;
                f3 = motionevent.height();
                if (f4 >= ((RectF) (motionevent)).top)
                {
                    if (f4 > ((RectF) (motionevent)).bottom)
                    {
                        f1 = f3;
                    } else
                    {
                        f1 = f4 - ((RectF) (motionevent)).top;
                    }
                }
                t = 360F - (f1 * 360F) / f3;
                return true;
            }
            if (D.contains(i1, k1))
            {
                A = 0;
                float f2 = motionevent.getX();
                float f7 = motionevent.getY();
                motionevent = D;
                float af[] = new float[2];
                float f5 = motionevent.width();
                float f6 = motionevent.height();
                if (f2 < ((RectF) (motionevent)).left)
                {
                    f2 = 0.0F;
                } else
                if (f2 > ((RectF) (motionevent)).right)
                {
                    f2 = f5;
                } else
                {
                    f2 -= ((RectF) (motionevent)).left;
                }
                if (f7 >= ((RectF) (motionevent)).top)
                {
                    if (f7 > ((RectF) (motionevent)).bottom)
                    {
                        f3 = f6;
                    } else
                    {
                        f3 = f7 - ((RectF) (motionevent)).top;
                    }
                }
                af[0] = f2 * (1.0F / f5);
                af[1] = 1.0F - f3 * (1.0F / f6);
                u = af[0];
                v = af[1];
                return true;
            }
            if (F != null && F.contains(i1, k1))
            {
                A = 2;
                int j1 = (int)motionevent.getX();
                motionevent = F;
                int l1 = (int)motionevent.width();
                if ((float)j1 < ((RectF) (motionevent)).left)
                {
                    j1 = 0;
                } else
                if ((float)j1 > ((RectF) (motionevent)).right)
                {
                    j1 = l1;
                } else
                {
                    j1 -= (int)((RectF) (motionevent)).left;
                }
                s = 255 - (j1 * 255) / l1;
                return true;
            }
        }
        return false;
    }

    private static int[] e()
    {
        int ai[] = new int[361];
        int j1 = ai.length - 1;
        int i1 = 0;
        do
        {
            if (j1 < 0)
            {
                return ai;
            }
            ai[i1] = Color.HSVToColor(new float[] {
                (float)j1, 1.0F, 1.0F
            });
            j1--;
            i1++;
        } while (true);
    }

    private int f()
    {
        int j1 = (int)(200F * f);
        int i1 = j1;
        if (z)
        {
            i1 = (int)((float)j1 + (c + b));
        }
        return i1;
    }

    public final int a()
    {
        return Color.HSVToColor(s, new float[] {
            t, u, v
        });
    }

    public final void a(int i1)
    {
        int j1 = Color.alpha(i1);
        float af[] = new float[3];
        Color.colorToHSV(i1, af);
        s = j1;
        t = af[0];
        u = af[1];
        v = af[2];
        if (g != null)
        {
            g.a(Color.HSVToColor(s, new float[] {
                t, u, v
            }));
        }
        invalidate();
    }

    public final void a(k k1)
    {
        g = k1;
    }

    public final float b()
    {
        return B;
    }

    public final void c()
    {
        if (!z)
        {
            z = true;
            o = null;
            p = null;
            q = null;
            r = null;
            requestLayout();
        }
    }

    public final boolean d()
    {
        return z;
    }

    protected void onDraw(Canvas canvas)
    {
        if (C.width() > 0.0F && C.height() > 0.0F)
        {
            RectF rectf = D;
            n.setColor(y);
            canvas.drawRect(C.left, C.top, rectf.right + 1.0F, rectf.bottom + 1.0F, n);
            if (o == null)
            {
                o = new LinearGradient(rectf.left, rectf.top, rectf.left, rectf.bottom, -1, 0xff000000, android.graphics.Shader.TileMode.CLAMP);
            }
            int i1 = Color.HSVToColor(new float[] {
                t, 1.0F, 1.0F
            });
            p = new LinearGradient(rectf.left, rectf.top, rectf.right, rectf.top, -1, i1, android.graphics.Shader.TileMode.CLAMP);
            Object obj = new ComposeShader(o, p, android.graphics.PorterDuff.Mode.MULTIPLY);
            h.setShader(((Shader) (obj)));
            canvas.drawRect(rectf, h);
            float f1 = u;
            float f3 = v;
            rectf = D;
            float f5 = rectf.height();
            float f6 = rectf.width();
            obj = new Point();
            obj.x = (int)(f1 * f6 + rectf.left);
            obj.y = (int)((1.0F - f3) * f5 + rectf.top);
            i.setColor(0xff000000);
            canvas.drawCircle(((Point) (obj)).x, ((Point) (obj)).y, d - f * 1.0F, i);
            i.setColor(0xffdddddd);
            canvas.drawCircle(((Point) (obj)).x, ((Point) (obj)).y, d, i);
            rectf = E;
            n.setColor(y);
            canvas.drawRect(rectf.left - 1.0F, rectf.top - 1.0F, rectf.right + 1.0F, rectf.bottom + 1.0F, n);
            if (q == null)
            {
                q = new LinearGradient(rectf.left, rectf.top, rectf.left, rectf.bottom, e(), null, android.graphics.Shader.TileMode.CLAMP);
                j.setShader(q);
            }
            canvas.drawRect(rectf, j);
            f1 = (f * 4F) / 2.0F;
            f3 = t;
            RectF rectf2 = E;
            f5 = rectf2.height();
            obj = new Point();
            obj.y = (int)((f5 - (f3 * f5) / 360F) + rectf2.top);
            obj.x = (int)rectf2.left;
            rectf2 = new RectF();
            rectf2.left = rectf.left - e;
            rectf2.right = rectf.right + e;
            rectf2.top = (float)((Point) (obj)).y - f1;
            rectf2.bottom = f1 + (float)((Point) (obj)).y;
            canvas.drawRoundRect(rectf2, 2.0F, 2.0F, k);
            if (z && F != null && G != null)
            {
                RectF rectf1 = F;
                n.setColor(y);
                canvas.drawRect(rectf1.left - 1.0F, rectf1.top - 1.0F, rectf1.right + 1.0F, rectf1.bottom + 1.0F, n);
                G.draw(canvas);
                float af[] = new float[3];
                af[0] = t;
                af[1] = u;
                af[2] = v;
                int j1 = Color.HSVToColor(af);
                int k1 = Color.HSVToColor(0, af);
                r = new LinearGradient(rectf1.left, rectf1.top, rectf1.right, rectf1.top, j1, k1, android.graphics.Shader.TileMode.CLAMP);
                l.setShader(r);
                canvas.drawRect(rectf1, l);
                if (w != null && w != "")
                {
                    canvas.drawText(w, rectf1.centerX(), rectf1.centerY() + f * 4F, m);
                }
                float f2 = (f * 4F) / 2.0F;
                j1 = s;
                RectF rectf3 = F;
                float f4 = rectf3.width();
                Point point = new Point();
                point.x = (int)((f4 - ((float)j1 * f4) / 255F) + rectf3.left);
                point.y = (int)rectf3.top;
                rectf3 = new RectF();
                rectf3.left = (float)point.x - f2;
                rectf3.right = f2 + (float)point.x;
                rectf3.top = rectf1.top - e;
                rectf3.bottom = rectf1.bottom + e;
                canvas.drawRoundRect(rectf3, 2.0F, 2.0F, k);
                return;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int k2 = android.view.View.MeasureSpec.getMode(i1);
        int j2 = android.view.View.MeasureSpec.getMode(j1);
        int l1 = android.view.View.MeasureSpec.getSize(i1);
        k1 = android.view.View.MeasureSpec.getSize(j1);
        i1 = l1;
        if (k2 != 0x80000000)
        {
            if (k2 == 0x40000000)
            {
                i1 = l1;
            } else
            {
                j1 = f();
                i1 = j1;
                if (z)
                {
                    i1 = (int)((float)j1 - (c + b));
                }
                i1 = (int)((float)i1 + a + c);
            }
        }
        if (j2 != 0x80000000 && j2 != 0x40000000)
        {
            k1 = f();
        }
        if (z) goto _L2; else goto _L1
_L1:
        j1 = (int)((float)i1 - c - a);
        if (j1 > k1 || getTag().equals("landscape"))
        {
            j1 = (int)((float)k1 + c + a);
        } else
        {
            k1 = j1;
            j1 = i1;
        }
_L4:
        setMeasuredDimension(j1, k1);
        return;
_L2:
        int i2 = (int)(((float)k1 - b) + a);
        j1 = i2;
        if (i2 > i1)
        {
            k1 = (int)(((float)i1 - a) + b);
            j1 = i1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        C = new RectF();
        C.left = B + (float)getPaddingLeft();
        C.right = (float)i1 - B - (float)getPaddingRight();
        C.top = B + (float)getPaddingTop();
        C.bottom = (float)j1 - B - (float)getPaddingBottom();
        RectF rectf = C;
        float f2 = rectf.height() - 2.0F;
        float f1 = f2;
        if (z)
        {
            f1 = f2 - (c + b);
        }
        f2 = rectf.left + 1.0F;
        float f4 = rectf.top + 1.0F;
        D = new RectF(f2, f4, f1 + f2, f4 + f1);
        rectf = C;
        f2 = rectf.right;
        f4 = a;
        float f6 = rectf.top;
        float f8 = rectf.bottom;
        if (z)
        {
            f1 = c + b;
        } else
        {
            f1 = 0.0F;
        }
        E = new RectF((f2 - f4) + 1.0F, f6 + 1.0F, rectf.right - 1.0F, f8 - 1.0F - f1);
        if (z)
        {
            RectF rectf1 = C;
            f1 = rectf1.left;
            float f3 = rectf1.bottom;
            float f5 = b;
            float f7 = rectf1.bottom;
            F = new RectF(f1 + 1.0F, (f3 - f5) + 1.0F, rectf1.right - 1.0F, f7 - 1.0F);
            G = new a((int)(5F * f));
            G.setBounds(Math.round(F.left), Math.round(F.top), Math.round(F.right), Math.round(F.bottom));
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 91
    //                   1 130
    //                   2 121;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_130;
_L1:
        boolean flag = false;
_L5:
        if (flag)
        {
            if (g != null)
            {
                g.a(Color.HSVToColor(s, new float[] {
                    t, u, v
                }));
            }
            invalidate();
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
_L2:
        H = new Point((int)motionevent.getX(), (int)motionevent.getY());
        flag = a(motionevent);
          goto _L5
_L4:
        flag = a(motionevent);
          goto _L5
        H = null;
        flag = a(motionevent);
          goto _L5
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        f1 = 0.0F;
        f2 = 0.0F;
        f4 = motionevent.getX();
        f3 = motionevent.getY();
        if (motionevent.getAction() != 2) goto _L2; else goto _L1
_L1:
        A;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 117
    //                   1 202
    //                   2 243;
           goto _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_243;
_L2:
        int i1 = 0;
_L6:
        if (i1 != 0)
        {
            if (g != null)
            {
                g.a(Color.HSVToColor(s, new float[] {
                    t, u, v
                }));
            }
            invalidate();
            return true;
        } else
        {
            return super.onTrackballEvent(motionevent);
        }
_L3:
        f4 = u + f4 / 50F;
        f3 = v - f3 / 50F;
        if (f4 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f4;
            if (f4 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        if (f3 >= 0.0F)
        {
            if (f3 > 1.0F)
            {
                f2 = 1.0F;
            } else
            {
                f2 = f3;
            }
        }
        u = f1;
        v = f2;
        i1 = 1;
          goto _L6
_L4:
        f2 = t - f3 * 10F;
        if (f2 >= 0.0F)
        {
            if (f2 > 360F)
            {
                f1 = 360F;
            } else
            {
                f1 = f2;
            }
        }
        t = f1;
        i1 = 1;
          goto _L6
        if (!z || F == null)
        {
            i1 = 0;
        } else
        {
            int j1 = (int)((float)s - f4 * 10F);
            if (j1 < 0)
            {
                i1 = 0;
            } else
            {
                i1 = j1;
                if (j1 > 255)
                {
                    i1 = 255;
                }
            }
            s = i1;
            i1 = 1;
        }
          goto _L6
    }
}
