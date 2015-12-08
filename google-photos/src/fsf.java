// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.List;

public class fsf extends View
{

    private static final Paint a = new Paint(2);
    private static final android.graphics.Matrix.ScaleToFit i[];
    private Matrix b;
    private fsg c;
    private int d;
    private int e;
    private Matrix f;
    private RectF g;
    private RectF h;
    Drawable o;
    Bitmap p;
    int q;
    int r;

    public fsf(Context context)
    {
        super(context);
        d = 255;
        e = 256;
        g = new RectF();
        h = new RectF();
        a();
    }

    public fsf(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public fsf(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        d = 255;
        e = 256;
        g = new RectF();
        h = new RectF();
        a();
    }

    private void a()
    {
        b = new Matrix();
        c = fsg.c;
        fsg fsg1 = fsg.e;
        if (fsg1 == null)
        {
            throw new NullPointerException();
        }
        if (c != fsg1)
        {
            c = fsg1;
            boolean flag;
            if (c == fsg.d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setWillNotCacheDrawing(flag);
            requestLayout();
            invalidate();
        }
    }

    public final void a(Drawable drawable)
    {
        if (o != drawable || p != null)
        {
            boolean flag;
            if (o == null && p == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = null;
            b(drawable);
            if (flag)
            {
                requestLayout();
            }
            invalidate();
        }
    }

    void b(Drawable drawable)
    {
        if (o != null)
        {
            o.setCallback(null);
            unscheduleDrawable(o);
        }
        o = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (drawable.isStateful())
            {
                drawable.setState(getDrawableState());
            }
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, true);
            drawable.setLevel(0);
            q = drawable.getIntrinsicWidth();
            r = drawable.getIntrinsicHeight();
            e();
            return;
        } else
        {
            r = -1;
            q = -1;
            return;
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = o;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    void e()
    {
        float f1 = 0.0F;
        if (o == null && p == null)
        {
            return;
        }
        int j = q;
        int k = r;
        int l = getWidth() - getPaddingLeft() - getPaddingRight();
        int i1 = getHeight() - getPaddingTop() - getPaddingBottom();
        boolean flag;
        if ((j < 0 || l == j) && (k < 0 || i1 == k))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j <= 0 || k <= 0 || fsg.b == c)
        {
            if (o != null)
            {
                o.setBounds(0, 0, l, i1);
                f = null;
                return;
            } else
            {
                g.set(0.0F, 0.0F, k, k);
                h.set(0.0F, 0.0F, l, i1);
                f = b;
                f.setRectToRect(g, h, android.graphics.Matrix.ScaleToFit.FILL);
                return;
            }
        }
        if (o != null)
        {
            o.setBounds(0, 0, j, k);
        }
        if (fsg.a == c)
        {
            if (b.isIdentity())
            {
                f = null;
                return;
            } else
            {
                f = b;
                return;
            }
        }
        if (flag)
        {
            f = null;
            return;
        }
        if (fsg.d == c)
        {
            f = b;
            f.setTranslate((int)((float)(l - j) * 0.5F + 0.5F), (int)((float)(i1 - k) * 0.5F + 0.5F));
            return;
        }
        if (fsg.e == c)
        {
            f = b;
            float f3;
            float f5;
            if (j * i1 > l * k)
            {
                f5 = (float)i1 / (float)k;
                f3 = ((float)l - (float)j * f5) * 0.5F;
            } else
            {
                f5 = (float)l / (float)j;
                f1 = i1;
                float f7 = k;
                f3 = 0.0F;
                f1 = (f1 - f7 * f5) * 0.5F;
            }
            f.setScale(f5, f5);
            f.postTranslate((int)(f3 + 0.5F), (int)(f1 + 0.5F));
            return;
        }
        if (fsg.f == c)
        {
            f = b;
            float f2;
            float f4;
            float f6;
            if (j <= l && k <= i1)
            {
                f2 = 1.0F;
            } else
            {
                f2 = Math.min((float)l / (float)j, (float)i1 / (float)k);
            }
            f4 = (int)(((float)l - (float)j * f2) * 0.5F + 0.5F);
            f6 = (int)(((float)i1 - (float)k * f2) * 0.5F + 0.5F);
            f.setScale(f2, f2);
            f.postTranslate(f4, f6);
            return;
        } else
        {
            g.set(0.0F, 0.0F, j, k);
            h.set(0.0F, 0.0F, l, i1);
            f = b;
            Matrix matrix = f;
            RectF rectf = g;
            RectF rectf1 = h;
            fsg fsg1 = c;
            matrix.setRectToRect(rectf, rectf1, i[fsg1.g - 1]);
            return;
        }
    }

    public boolean hasOverlappingRendering()
    {
        return getBackground() != null && getBackground().getCurrent() != null;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (drawable == o)
        {
            invalidate();
            return;
        } else
        {
            super.invalidateDrawable(drawable);
            return;
        }
    }

    public boolean isOpaque()
    {
        boolean flag2 = false;
        if (super.isOpaque()) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (o == null) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (o.getOpacity() != -1) goto _L4; else goto _L5
_L5:
        flag1 = flag2;
        if (d * e >> 8 != 255) goto _L4; else goto _L6
_L6:
        if (o == null) goto _L8; else goto _L7
_L7:
        Rect rect;
        Matrix matrix;
        rect = o.getBounds();
        matrix = f;
        if (matrix != null) goto _L10; else goto _L9
_L9:
        boolean flag;
        if (rect.left <= 0 && rect.top <= 0 && rect.right >= getWidth() && rect.bottom >= getHeight())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L12:
        flag1 = flag2;
        if (!flag) goto _L4; else goto _L2
_L2:
        flag1 = true;
_L4:
        return flag1;
_L10:
        if (matrix.rectStaysRect())
        {
            RectF rectf = g;
            RectF rectf1 = h;
            rectf.set(rect);
            matrix.mapRect(rectf1, rectf);
            if (rectf1.left <= 0.0F && rectf1.top <= 0.0F && rectf1.right >= (float)getWidth() && rectf1.bottom >= (float)getHeight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            continue; /* Loop/switch isn't completed */
        }
_L8:
        flag = false;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (o != null)
        {
            o.jumpToCurrentState();
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (o != null)
        {
            Drawable drawable = o;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    public int[] onCreateDrawableState(int j)
    {
        return super.onCreateDrawableState(j);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (o != null)
        {
            o.setVisible(false, false);
        }
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        while (o == null && p == null || q == 0 || r == 0) 
        {
            return;
        }
        if (o != null)
        {
            if (f == null && getPaddingTop() == 0 && getPaddingLeft() == 0)
            {
                o.draw(canvas);
                return;
            }
            int j = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (f != null)
            {
                canvas.concat(f);
            }
            o.draw(canvas);
            canvas.restoreToCount(j);
            return;
        }
        if (f == null)
        {
            canvas.drawBitmap(p, getPaddingLeft(), getPaddingTop(), a);
            return;
        } else
        {
            int k = canvas.getSaveCount();
            canvas.save();
            canvas.concat(f);
            canvas.drawBitmap(p, getPaddingLeft(), getPaddingTop(), a);
            canvas.restoreToCount(k);
            return;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/widget/ImageView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/ImageView.getName());
    }

    public void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        e();
    }

    public void onMeasure(int j, int k)
    {
        int j1 = 1;
        int l;
        int i1;
        int l1;
        int j2;
        int k2;
        if (o == null && p == null)
        {
            q = -1;
            r = -1;
            l = 0;
            i1 = 0;
        } else
        {
            int i2 = q;
            i1 = r;
            l = i2;
            if (i2 <= 0)
            {
                l = 1;
            }
            if (i1 <= 0)
            {
                i1 = l;
                l = j1;
            } else
            {
                int k1 = l;
                l = i1;
                i1 = k1;
            }
        }
        j2 = getPaddingLeft();
        k2 = getPaddingRight();
        j1 = getPaddingTop();
        l1 = getPaddingBottom();
        i1 = Math.max(i1 + (j2 + k2), getSuggestedMinimumWidth());
        l = Math.max(l + (j1 + l1), getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSizeAndState(i1, j, 0), resolveSizeAndState(l, k, 0));
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        CharSequence charsequence = getContentDescription();
        if (!TextUtils.isEmpty(charsequence))
        {
            accessibilityevent.getText().add(charsequence);
        }
    }

    public void setVisibility(int j)
    {
        super.setVisibility(j);
        if (o != null)
        {
            Drawable drawable = o;
            boolean flag;
            if (j == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable)
    {
        return o == drawable || super.verifyDrawable(drawable);
    }

    static 
    {
        i = (new android.graphics.Matrix.ScaleToFit[] {
            android.graphics.Matrix.ScaleToFit.FILL, android.graphics.Matrix.ScaleToFit.START, android.graphics.Matrix.ScaleToFit.CENTER, android.graphics.Matrix.ScaleToFit.END
        });
    }
}
