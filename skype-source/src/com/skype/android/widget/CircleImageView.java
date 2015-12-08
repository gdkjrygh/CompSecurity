// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.widget.ImageView;

public class CircleImageView extends ImageView
{

    private static final PorterDuffXfermode a;
    private static final int o[] = {
        0x10100a7
    };
    private Paint b;
    private int c;
    private ColorStateList d;
    private int e;
    private Paint f;
    private Paint g;
    private Bitmap h;
    private Canvas i;
    private boolean j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;

    public CircleImageView(Context context)
    {
        super(context);
        a(((AttributeSet) (null)), 0x7f010000);
    }

    public CircleImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset, 0x7f010000);
    }

    public CircleImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(attributeset, i1);
    }

    private int a()
    {
        return d.getColorForState(o, d.getDefaultColor());
    }

    private void a(int i1, int j1)
    {
        d = new ColorStateList(new int[][] {
            o, StateSet.WILD_CARD
        }, new int[] {
            j1, i1
        });
    }

    private void a(AttributeSet attributeset, int i1)
    {
        j = true;
        attributeset = getContext().obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.CircleImageView, i1, 0x7f090156);
        d = attributeset.getColorStateList(0);
        if (isInEditMode())
        {
            a(getContext().getResources().getColor(0x7f0f0135), getContext().getResources().getColor(0x7f0f0135));
        }
        c = attributeset.getDimensionPixelSize(1, getResources().getDimensionPixelSize(0x7f0c004b));
        b = new Paint();
        b.setAntiAlias(true);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        g = new Paint();
        g.setColor(getResources().getColor(0x7f0f00d3));
        g.setStyle(android.graphics.Paint.Style.STROKE);
        g.setStrokeWidth(getResources().getDimensionPixelSize(0x7f0c0159));
        g.setAntiAlias(true);
        float f1 = getResources().getDimensionPixelSize(0x7f0c0158);
        g.setPathEffect(new DashPathEffect(new float[] {
            f1, f1
        }, 0.0F));
        f = new Paint();
        k = getResources().getDrawable(0x7f020071);
        e = getResources().getColor(0x7f0f0096);
        attributeset.recycle();
    }

    protected void drawableStateChanged()
    {
        invalidate();
        super.drawableStateChanged();
    }

    public CharSequence getContentDescription()
    {
        CharSequence charsequence = super.getContentDescription();
        Object obj = charsequence;
        if (TextUtils.isEmpty(charsequence))
        {
            obj = ",";
        }
        return ((CharSequence) (obj));
    }

    protected void onDraw(Canvas canvas)
    {
        Drawable drawable;
        int i1;
        int j1;
        int i2;
        int k2;
        int l2;
        drawable = getDrawable();
        j1 = getWidth();
        i1 = getHeight();
        k2 = j1 / 2;
        l2 = i1 / 2;
        if (isPressed())
        {
            i2 = a();
        } else
        {
            i2 = d.getDefaultColor();
        }
        if (!j)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        if (drawable != null) goto _L2; else goto _L1
_L1:
        super.onDraw(canvas);
_L4:
        return;
_L2:
        int i3 = canvas.saveLayer(0.0F, 0.0F, j1, i1, f, 31);
        canvas.drawColor(0);
        f.setColor(0xff000000);
        f.setAntiAlias(true);
        canvas.drawCircle(k2, l2, k2 - 1, f);
        android.graphics.Xfermode xfermode = f.getXfermode();
        f.setXfermode(a);
        float f1 = (float)drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight();
        int k1;
        int l1;
        if (f1 > 1.0F)
        {
            k1 = (int)((float)i1 * f1);
            l1 = 0;
            j1 = (j1 - k1) / 2;
            k1 = j1 + k1;
        } else
        if (f1 < 1.0F)
        {
            int j3 = (int)((float)j1 / f1);
            l1 = 0;
            k1 = j1;
            int j2 = (i1 - j3) / 2;
            i1 = j2 + j3;
            j1 = l1;
            l1 = j2;
        } else
        {
            boolean flag = false;
            l1 = 0;
            k1 = j1;
            j1 = ((flag) ? 1 : 0);
        }
        drawable.setBounds(j1, l1, k1, i1);
        drawable.draw(i);
        if (l)
        {
            k.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            k.draw(i);
        }
        if (m && isPressed())
        {
            i.drawColor(e);
        }
        canvas.drawBitmap(h, 0.0F, 0.0F, f);
        f.setXfermode(xfermode);
        canvas.restoreToCount(i3);
        if (c > 0)
        {
            b.setStrokeWidth(c);
            b.setColor(i2);
            canvas.drawCircle(k2, l2, (float)k2 - b.getStrokeWidth() / 2.0F, b);
        }
        if (!n) goto _L4; else goto _L3
_L3:
        canvas.drawCircle(k2, l2, k2 - c, g);
        return;
        super.onDraw(canvas);
        if (l)
        {
            k.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            k.draw(canvas);
        }
        if (m && isPressed())
        {
            canvas.drawColor(e);
        }
        f.setColor(i2);
        f.setAntiAlias(true);
        f.setStyle(android.graphics.Paint.Style.STROKE);
        f.setStrokeWidth(k2);
        canvas.drawCircle(k2, l2, (k2 / 2 + k2) - 1, f);
        return;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        k1 = getWidth();
        int i2 = getHeight();
        l1 = i2;
        j1 = k1;
        if (isInEditMode())
        {
            j1 = getContext().getResources().getDimensionPixelSize(0x7f0c00cb);
            i1 = k1;
            if (k1 <= 0)
            {
                i1 = j1;
            }
            k1 = getContext().getResources().getDimensionPixelSize(0x7f0c00cb);
            l1 = i2;
            j1 = i1;
            if (i2 <= 0)
            {
                l1 = k1;
                j1 = i1;
            }
        }
        if (j && (h == null || h.getWidth() != j1 && h.getHeight() != l1))
        {
            h = Bitmap.createBitmap(j1, l1, android.graphics.Bitmap.Config.ARGB_8888);
            i = new Canvas(h);
        }
    }

    public void setBorderClickedColor(int i1)
    {
        a(d.getDefaultColor(), i1);
    }

    public void setBorderColor(int i1)
    {
        a(i1, a());
    }

    public void setBorderWidth(int i1)
    {
        c = i1;
    }

    public void setClipCircleEnabled(boolean flag)
    {
        j = flag;
    }

    public void setDottedBorderDefaultAvatar(boolean flag)
    {
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l = flag1;
        n = flag;
        if (flag)
        {
            ColorDrawable colordrawable = new ColorDrawable(-1);
            Drawable drawable = getResources().getDrawable(0x7f020073).mutate();
            int i1 = g.getColor();
            drawable.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[] {
                (float)Color.red(i1) / 255F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, (float)Color.green(i1) / 255F, 0.0F, 0.0F, 0.0F, 
                0.0F, 0.0F, (float)Color.blue(i1) / 255F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F
            })));
            setImageDrawable(new LayerDrawable(new Drawable[] {
                colordrawable, drawable
            }));
        }
    }

    public void setDrawOverlayOnClick(boolean flag)
    {
        m = flag;
    }

    static 
    {
        a = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
