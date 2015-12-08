// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.makeramen;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RoundedDrawable extends Drawable
{

    private final RectF a;
    private final RectF b;
    private float c;
    private final boolean d[] = {
        1, 1, 1, 1
    };
    private final RectF e;
    private final RectF f;
    private final Bitmap g;
    private final BitmapShader h;
    private final Paint i;
    private final int j;
    private final int k;
    private final RectF l;
    private final Paint m;
    private boolean n;
    private float o;
    private ColorStateList p;
    private android.widget.ImageView.ScaleType q;
    private final Matrix r;

    public RoundedDrawable(Bitmap bitmap)
    {
        this(bitmap, (byte)0);
    }

    private RoundedDrawable(Bitmap bitmap, byte byte0)
    {
        this(bitmap, 0, null);
    }

    private RoundedDrawable(Bitmap bitmap, int i1, ColorStateList colorstatelist)
    {
        a = new RectF();
        b = new RectF();
        e = new RectF();
        f = new RectF();
        l = new RectF();
        n = false;
        q = android.widget.ImageView.ScaleType.FIT_XY;
        r = new Matrix();
        o = i1;
        if (colorstatelist == null)
        {
            colorstatelist = ColorStateList.valueOf(0xff000000);
        }
        p = colorstatelist;
        g = bitmap;
        j = g.getWidth();
        k = g.getHeight();
        f.set(0.0F, 0.0F, j, k);
        c = 0.0F;
        h = new BitmapShader(g, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        h.setLocalMatrix(r);
        i = new Paint();
        i.setStyle(android.graphics.Paint.Style.FILL);
        i.setAntiAlias(true);
        i.setShader(h);
        m = new Paint();
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setAntiAlias(true);
        m.setColor(p.getColorForState(getState(), 0xff000000));
        m.setStrokeWidth(i1);
    }

    public static Drawable a(Drawable drawable)
    {
        return a(drawable, 0, ColorStateList.valueOf(0xff000000));
    }

    public static Drawable a(Drawable drawable, int i1, ColorStateList colorstatelist)
    {
label0:
        {
            Object obj = drawable;
            if (drawable != null)
            {
                if (!(drawable instanceof TransitionDrawable))
                {
                    break label0;
                }
                drawable = (TransitionDrawable)drawable;
                int k1 = drawable.getNumberOfLayers();
                obj = new Drawable[k1];
                int j1 = 0;
                while (j1 < k1) 
                {
                    Drawable drawable1 = drawable.getDrawable(j1);
                    if (drawable1 instanceof ColorDrawable)
                    {
                        obj[j1] = drawable1;
                    } else
                    {
                        obj[j1] = new RoundedDrawable(b(drawable.getDrawable(j1)), i1, colorstatelist);
                    }
                    j1++;
                }
                obj = new TransitionDrawable(((Drawable []) (obj)));
            }
            return ((Drawable) (obj));
        }
        Bitmap bitmap = b(drawable);
        if (bitmap != null)
        {
            return new RoundedDrawable(bitmap, i1, colorstatelist);
        } else
        {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return drawable;
        }
    }

    public static RoundedDrawable a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            return new RoundedDrawable(bitmap);
        } else
        {
            return null;
        }
    }

    private void a(Canvas canvas)
    {
        if (!a(d) && c != 0.0F)
        {
            float f1 = b.left;
            float f2 = b.top;
            float f3 = b.width() + f1;
            float f4 = b.height() + f2;
            float f5 = c;
            if (!d[0])
            {
                e.set(f1, f2, f1 + f5, f2 + f5);
                canvas.drawRect(e, i);
            }
            if (!d[1])
            {
                e.set(f3 - f5, f2, f3, f5);
                canvas.drawRect(e, i);
            }
            if (!d[2])
            {
                e.set(f3 - f5, f4 - f5, f3, f4);
                canvas.drawRect(e, i);
            }
            if (!d[3])
            {
                e.set(f1, f4 - f5, f5 + f1, f4);
                canvas.drawRect(e, i);
                return;
            }
        }
    }

    private static boolean a(boolean aflag[])
    {
        int j1 = aflag.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (!aflag[i1])
            {
                return false;
            }
        }

        return true;
    }

    private static Bitmap b(Drawable drawable)
    {
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        int i1 = Math.max(drawable.getIntrinsicWidth(), 2);
        int j1 = Math.max(drawable.getIntrinsicHeight(), 2);
        if (i1 > 0 && j1 > 0)
        {
            Bitmap bitmap = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } else
        {
            return null;
        }
    }

    private void b()
    {
        float f1;
        f1 = 0.0F;
        l.set(a);
        b.set(o, o, l.width() - o, l.height() - o);
        _cls1.a[q.ordinal()];
        JVM INSTR tableswitch 1 6: default 100
    //                   1 180
    //                   2 294
    //                   3 505
    //                   4 751
    //                   5 870
    //                   6 989;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        l.set(a);
        b.set(l);
        r.set(null);
        r.setRectToRect(f, b, android.graphics.Matrix.ScaleToFit.FILL);
_L9:
        l.inset(o / 2.0F, o / 2.0F);
        h.setLocalMatrix(r);
        return;
_L2:
        l.set(a);
        b.set(o, o, l.width() - o, l.height() - o);
        r.set(null);
        r.setTranslate((int)((b.width() - (float)j) * 0.5F + 0.5F), (int)((b.height() - (float)k) * 0.5F + 0.5F));
        continue; /* Loop/switch isn't completed */
_L3:
        l.set(a);
        b.set(o, o, l.width() - o, l.height() - o);
        r.set(null);
        float f3;
        float f5;
        if ((float)j * b.height() > b.width() * (float)k)
        {
            f5 = b.height() / (float)k;
            f3 = (b.width() - (float)j * f5) * 0.5F;
        } else
        {
            f5 = b.width() / (float)j;
            f1 = b.height();
            float f7 = k;
            f3 = 0.0F;
            f1 = (f1 - f7 * f5) * 0.5F;
        }
        r.setScale(f5, f5);
        r.postTranslate((float)(int)(f3 + 0.5F) + o, (float)(int)(f1 + 0.5F) + o);
        continue; /* Loop/switch isn't completed */
_L4:
        r.set(null);
        float f2;
        float f4;
        float f6;
        if ((float)j <= a.width() && (float)k <= a.height())
        {
            f2 = 1.0F;
        } else
        {
            f2 = Math.min(a.width() / (float)j, a.height() / (float)k);
        }
        f4 = (int)((a.width() - (float)j * f2) * 0.5F + 0.5F);
        f6 = (int)((a.height() - (float)k * f2) * 0.5F + 0.5F);
        r.setScale(f2, f2);
        r.postTranslate(f4, f6);
        l.set(f);
        r.mapRect(l);
        b.set(l.left + o, l.top + o, l.right - o, l.bottom - o);
        r.setRectToRect(f, b, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L5:
        l.set(f);
        r.setRectToRect(f, a, android.graphics.Matrix.ScaleToFit.CENTER);
        r.mapRect(l);
        b.set(l.left + o, l.top + o, l.right - o, l.bottom - o);
        r.setRectToRect(f, b, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L6:
        l.set(f);
        r.setRectToRect(f, a, android.graphics.Matrix.ScaleToFit.END);
        r.mapRect(l);
        b.set(l.left + o, l.top + o, l.right - o, l.bottom - o);
        r.setRectToRect(f, b, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L7:
        l.set(f);
        r.setRectToRect(f, a, android.graphics.Matrix.ScaleToFit.START);
        r.mapRect(l);
        b.set(l.left + o, l.top + o, l.right - o, l.bottom - o);
        r.setRectToRect(f, b, android.graphics.Matrix.ScaleToFit.FILL);
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected final android.widget.ImageView.ScaleType a()
    {
        return q;
    }

    public final RoundedDrawable a(float f1)
    {
        a(f1, f1, f1, f1);
        return this;
    }

    public final RoundedDrawable a(float f1, float f2, float f3, float f4)
    {
        boolean flag1 = true;
        HashSet hashset = new HashSet(4);
        hashset.add(Float.valueOf(f1));
        hashset.add(Float.valueOf(f2));
        hashset.add(Float.valueOf(f3));
        hashset.add(Float.valueOf(f4));
        hashset.remove(Float.valueOf(0.0F));
        if (hashset.size() > 1)
        {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        boolean aflag[];
        boolean flag;
        if (!hashset.isEmpty())
        {
            float f5 = ((Float)hashset.iterator().next()).floatValue();
            if (Float.isInfinite(f5) || Float.isNaN(f5) || f5 < 0.0F)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid radius value: ")).append(f5).toString());
            }
            c = f5;
        } else
        {
            c = 0.0F;
        }
        aflag = d;
        if (f1 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aflag[0] = flag;
        aflag = d;
        if (f2 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aflag[1] = flag;
        aflag = d;
        if (f3 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aflag[2] = flag;
        aflag = d;
        if (f4 > 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        aflag[3] = flag;
        return this;
    }

    public final void a(int i1)
    {
        o = i1;
        m.setStrokeWidth(o);
    }

    public final void a(ColorStateList colorstatelist)
    {
        if (colorstatelist == null)
        {
            colorstatelist = ColorStateList.valueOf(0);
        }
        p = colorstatelist;
        m.setColor(p.getColorForState(getState(), 0xff000000));
    }

    public final void a(android.widget.ImageView.ScaleType scaletype)
    {
        android.widget.ImageView.ScaleType scaletype1 = scaletype;
        if (scaletype == null)
        {
            scaletype1 = android.widget.ImageView.ScaleType.FIT_XY;
        }
        if (q != scaletype1)
        {
            q = scaletype1;
            b();
        }
    }

    public final void a(boolean flag)
    {
        n = flag;
    }

    public void draw(Canvas canvas)
    {
        if (!n) goto _L2; else goto _L1
_L1:
        if (o <= 0.0F) goto _L4; else goto _L3
_L3:
        canvas.drawOval(l, m);
        canvas.drawOval(b, i);
_L7:
        return;
_L4:
        canvas.drawOval(b, i);
        return;
_L2:
        boolean aflag[];
        int i1;
        int j1;
        aflag = d;
        j1 = aflag.length;
        i1 = 0;
_L8:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        if (!aflag[i1]) goto _L6; else goto _L5
_L5:
        i1 = 1;
_L9:
        if (i1 != 0)
        {
            float f1 = c;
            if (o > 0.0F)
            {
                canvas.drawRoundRect(b, f1, f1, i);
                canvas.drawRoundRect(l, f1, f1, m);
                a(canvas);
                if (!a(d) && c != 0.0F)
                {
                    f1 = b.left;
                    float f2 = b.top;
                    float f3 = f1 + b.width();
                    float f4 = f2 + b.height();
                    float f5 = c;
                    float f6 = o / 2.0F;
                    if (!d[0])
                    {
                        canvas.drawLine(f1 - f6, f2, f1 + f5, f2, m);
                        canvas.drawLine(f1, f2 - f6, f1, f2 + f5, m);
                    }
                    if (!d[1])
                    {
                        canvas.drawLine(f3 - f5 - f6, f2, f3, f2, m);
                        canvas.drawLine(f3, f2 - f6, f3, f2 + f5, m);
                    }
                    if (!d[2])
                    {
                        canvas.drawLine(f3 - f5 - f6, f4, f3 + f6, f4, m);
                        canvas.drawLine(f3, f4 - f5, f3, f4, m);
                    }
                    if (!d[3])
                    {
                        canvas.drawLine(f1 - f6, f4, f1 + f5, f4, m);
                        canvas.drawLine(f1, f4 - f5, f1, f4, m);
                        return;
                    }
                }
            } else
            {
                canvas.drawRoundRect(b, f1, f1, i);
                a(canvas);
                return;
            }
        } else
        {
            canvas.drawRect(b, i);
            if (o > 0.0F)
            {
                canvas.drawRect(l, m);
                return;
            }
        }
          goto _L7
_L6:
        i1++;
          goto _L8
        i1 = 0;
          goto _L9
    }

    public int getIntrinsicHeight()
    {
        return k;
    }

    public int getIntrinsicWidth()
    {
        return j;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isStateful()
    {
        return p.isStateful();
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        a.set(rect);
        b();
    }

    protected boolean onStateChange(int ai[])
    {
        int i1 = p.getColorForState(ai, 0);
        if (m.getColor() != i1)
        {
            m.setColor(i1);
            return true;
        } else
        {
            return super.onStateChange(ai);
        }
    }

    public void setAlpha(int i1)
    {
        i.setAlpha(i1);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        i.setColorFilter(colorfilter);
        invalidateSelf();
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[android.widget.ImageView.ScaleType.values().length];
            try
            {
                a[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
