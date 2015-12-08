// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.material.progress;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import b;
import mlw;
import mlx;
import mmb;
import mme;
import mmh;

public class MaterialProgressBar extends ProgressBar
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private int h;

    private MaterialProgressBar(Context context)
    {
        super(context, null, 0x1010078);
        a();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
        a(context, attributeset, 0, b.DM);
        b();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
        a(context, attributeset, i, b.DM);
        b();
    }

    private static int a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder(59)).append("Invalid attribute value for mtrlLinearGrowFrom: ").append(i).toString());

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;
        }
    }

    private void a()
    {
        f = true;
        g = false;
        h = super.getProgress();
    }

    private void a(Context context, AttributeSet attributeset, int i, int j)
    {
        attributeset = context.obtainStyledAttributes(attributeset, mmh.a, i, j);
        d = attributeset.getDimensionPixelSize(mmh.f, 0);
        e = attributeset.getDimensionPixelSize(mmh.g, 0);
        a = attributeset.getInt(mmh.e, 0);
        a;
        JVM INSTR tableswitch 0 2: default 80
    //                   0 90
    //                   1 476
    //                   2 476;
           goto _L1 _L2 _L3 _L3
_L1:
        throw new IllegalArgumentException("Invalid determinate progress style");
_L2:
        j = attributeset.getInt(mmh.i, 3);
        if (attributeset.hasValue(mmh.c))
        {
            context = getResources().getIntArray(attributeset.getResourceId(mmh.c, -1));
        } else
        if (attributeset.hasValue(mmh.b))
        {
            context = new int[1];
            context[0] = attributeset.getColor(mmh.b, 0);
        } else
        {
            context = null;
        }
        if (context == null)
        {
            context = getResources().getIntArray(b.DB);
        }
        j;
        JVM INSTR tableswitch 1 3: default 168
    //                   1 211
    //                   2 266
    //                   3 280;
           goto _L4 _L5 _L6 _L7
_L4:
        throw new IllegalStateException("Invalid progress circle size");
_L5:
        i = getResources().getDimensionPixelSize(b.DI);
_L12:
        c = i;
        j;
        JVM INSTR tableswitch 1 3: default 256
    //                   1 294
    //                   2 342
    //                   3 356;
           goto _L8 _L9 _L10 _L11
_L8:
        throw new IllegalStateException("Invalid progress circle size");
_L6:
        i = getResources().getDimensionPixelSize(b.DH);
          goto _L12
_L7:
        i = getResources().getDimensionPixelSize(b.DG);
          goto _L12
_L9:
        i = getResources().getDimensionPixelSize(b.DL);
_L17:
        j;
        JVM INSTR tableswitch 1 3: default 332
    //                   1 370
    //                   2 446
    //                   3 461;
           goto _L13 _L14 _L15 _L16
_L13:
        throw new IllegalStateException("Invalid progress circle size");
_L10:
        i = getResources().getDimensionPixelSize(b.DK);
          goto _L17
_L11:
        i = getResources().getDimensionPixelSize(b.DJ);
          goto _L17
_L14:
        j = getResources().getDimensionPixelSize(b.DF);
_L20:
        setIndeterminateDrawable(new mlx(-1F, i, j, context));
          goto _L18
_L15:
        j = getResources().getDimensionPixelSize(b.DE);
        continue; /* Loop/switch isn't completed */
_L16:
        j = getResources().getDimensionPixelSize(b.DD);
        continue; /* Loop/switch isn't completed */
_L3:
        a(((TypedArray) (attributeset)), true);
_L18:
        b = attributeset.getInt(mmh.d, 1);
        switch (b)
        {
        default:
            throw new IllegalArgumentException("Invalid determinate progress style");

        case 0: // '\0'
            throw new RuntimeException("Circular determinate is not yet supported!");

        case 1: // '\001'
            a(((TypedArray) (attributeset)), false);
            break;
        }
        attributeset.recycle();
        return;
        if (true) goto _L20; else goto _L19
_L19:
    }

    private void a(TypedArray typedarray, boolean flag)
    {
        boolean flag1 = true;
        int j = typedarray.getColor(mmh.b, -1);
        int i = j;
        if (j == -1)
        {
            i = getResources().getColor(b.DC);
        }
        TypedArray typedarray1 = getContext().getTheme().obtainStyledAttributes(new int[] {
            0x1010033
        });
        float f1 = typedarray1.getFloat(0, 0.2F);
        typedarray1.recycle();
        j = typedarray.getInt(mmh.h, 0);
        if (flag)
        {
            int k = d;
            if (a == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            setIndeterminateDrawable(new mme(k, i, f1, flag, a(j)));
            return;
        } else
        {
            setProgressDrawable(new mmb(d, i, f1, a(j)));
            return;
        }
    }

    private void b()
    {
        c();
        if (isIndeterminate())
        {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(true, true);
            return;
        } else
        {
            getProgressDrawable().setVisible(true, true);
            getIndeterminateDrawable().setVisible(false, false);
            return;
        }
    }

    private void c()
    {
        if (isIndeterminate())
        {
            if (a != 0)
            {
                setMinimumHeight(d);
                return;
            } else
            {
                setMinimumHeight(0);
                return;
            }
        }
        if (b != 0)
        {
            setMinimumHeight(d);
            return;
        } else
        {
            setMinimumHeight(0);
            return;
        }
    }

    private int d()
    {
        if (isIndeterminate())
        {
            return a;
        } else
        {
            return b;
        }
    }

    private Drawable e()
    {
        if (isIndeterminate())
        {
            return getIndeterminateDrawable();
        } else
        {
            return getProgressDrawable();
        }
    }

    public int getProgress()
    {
        this;
        JVM INSTR monitorenter ;
        int i = super.getProgress();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (getVisibility() == 0)
        {
            e().setVisible(true, false);
            setVisibility(0);
        }
    }

    protected void onDetachedFromWindow()
    {
        if (e() instanceof mlw)
        {
            ((mlw)e()).a();
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        e().draw(canvas);
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(i, j);
        if (d() != 0) goto _L2; else goto _L1
_L1:
        setMeasuredDimension(c + getPaddingLeft() + getPaddingRight(), c + getPaddingTop() + getPaddingBottom());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        setMeasuredDimension(getMeasuredWidth(), resolveSizeAndState(d + e + e + getPaddingTop() + getPaddingBottom(), j, 0));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (d() != 0)
        {
            Drawable drawable = getIndeterminateDrawable();
            if (drawable != null)
            {
                drawable.setBounds(0, 0, i, j);
            }
            drawable = getProgressDrawable();
            if (drawable != null)
            {
                drawable.setBounds(0, 0, i, j);
            }
            return;
        } else
        {
            super.onSizeChanged(i, j, k, l);
            return;
        }
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        view = e();
        if (view == null)
        {
            return;
        }
        if (i == 0 && (f || !isIndeterminate()))
        {
            view.setVisible(true, true);
            return;
        } else
        {
            view.setVisible(false, true);
            return;
        }
    }

    public void setIndeterminate(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Drawable drawable;
        super.setIndeterminate(flag);
        c();
        if (isIndeterminate())
        {
            break MISSING_BLOCK_LABEL_41;
        }
        drawable = getProgressDrawable();
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (getVisibility() == 0)
        {
            drawable.setVisible(true, false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgress(int i)
    {
        this;
        JVM INSTR monitorenter ;
        super.setProgress(i);
        h = i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        com/google/android/libraries/material/progress/MaterialProgressBar.getSimpleName();
    }
}
