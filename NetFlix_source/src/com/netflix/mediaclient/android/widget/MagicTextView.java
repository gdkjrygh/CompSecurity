// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class MagicTextView extends TextView
{
    public static class Shadow
    {

        int color;
        float dx;
        float dy;
        float r;

        public Shadow(float f, float f1, float f2, int i)
        {
            r = f;
            dx = f1;
            dy = f2;
            color = i;
        }
    }


    private WeakHashMap canvasStore;
    private Drawable foregroundDrawable;
    private boolean frozen;
    private ArrayList innerShadows;
    private int lockedCompoundPadding[];
    private ArrayList outerShadows;
    private Integer strokeColor;
    private android.graphics.Paint.Join strokeJoin;
    private float strokeMiter;
    private float strokeWidth;
    private Bitmap tempBitmap;
    private Canvas tempCanvas;

    public MagicTextView(Context context)
    {
        super(context);
        frozen = false;
        init(null);
    }

    public MagicTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        frozen = false;
        init(attributeset);
    }

    public MagicTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        frozen = false;
        init(attributeset);
    }

    private void generateTempCanvas()
    {
        String s = String.format("%dx%d", new Object[] {
            Integer.valueOf(getWidth()), Integer.valueOf(getHeight())
        });
        Pair pair = (Pair)canvasStore.get(s);
        if (pair != null)
        {
            tempCanvas = (Canvas)pair.first;
            tempBitmap = (Bitmap)pair.second;
            return;
        } else
        {
            tempCanvas = new Canvas();
            tempBitmap = Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            tempCanvas.setBitmap(tempBitmap);
            canvasStore.put(s, new Pair(tempCanvas, tempBitmap));
            return;
        }
    }

    public void addInnerShadow(float f, float f1, float f2, int i)
    {
        float f3 = f;
        if (f == 0.0F)
        {
            f3 = 1E-04F;
        }
        innerShadows.add(new Shadow(f3, f1, f2, i));
    }

    public void addOuterShadow(float f, float f1, float f2, int i)
    {
        float f3 = f;
        if (f == 0.0F)
        {
            f3 = 1E-04F;
        }
        outerShadows.add(new Shadow(f3, f1, f2, i));
    }

    public void clearInnerShadows()
    {
        innerShadows.clear();
    }

    public void clearOuterShadows()
    {
        outerShadows.clear();
    }

    public void freeze()
    {
        lockedCompoundPadding = (new int[] {
            getCompoundPaddingLeft(), getCompoundPaddingRight(), getCompoundPaddingTop(), getCompoundPaddingBottom()
        });
        frozen = true;
    }

    public int getCompoundPaddingBottom()
    {
        if (!frozen)
        {
            return super.getCompoundPaddingBottom();
        } else
        {
            return lockedCompoundPadding[3];
        }
    }

    public int getCompoundPaddingLeft()
    {
        if (!frozen)
        {
            return super.getCompoundPaddingLeft();
        } else
        {
            return lockedCompoundPadding[0];
        }
    }

    public int getCompoundPaddingRight()
    {
        if (!frozen)
        {
            return super.getCompoundPaddingRight();
        } else
        {
            return lockedCompoundPadding[1];
        }
    }

    public int getCompoundPaddingTop()
    {
        if (!frozen)
        {
            return super.getCompoundPaddingTop();
        } else
        {
            return lockedCompoundPadding[2];
        }
    }

    public Drawable getForeground()
    {
        if (foregroundDrawable == null)
        {
            return foregroundDrawable;
        } else
        {
            return new ColorDrawable(getCurrentTextColor());
        }
    }

    public void init(AttributeSet attributeset)
    {
        outerShadows = new ArrayList();
        innerShadows = new ArrayList();
        if (canvasStore == null)
        {
            canvasStore = new WeakHashMap();
        }
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        TypedArray typedarray = getContext().obtainStyledAttributes(attributeset, com.netflix.mediaclient.R.styleable.MagicTextView);
        attributeset = typedarray.getString(8);
        if (attributeset != null)
        {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), String.format("fonts/%s.ttf", new Object[] {
                attributeset
            })));
        }
        if (typedarray.hasValue(9))
        {
            attributeset = typedarray.getDrawable(9);
            float f;
            float f1;
            int i;
            if (attributeset != null)
            {
                setForegroundDrawable(attributeset);
            } else
            {
                setTextColor(typedarray.getColor(9, 0xff000000));
            }
        }
        if (typedarray.hasValue(10))
        {
            attributeset = typedarray.getDrawable(10);
            if (attributeset != null)
            {
                setBackgroundDrawable(attributeset);
            } else
            {
                setBackgroundColor(typedarray.getColor(10, 0xff000000));
            }
        }
        if (typedarray.hasValue(0))
        {
            addInnerShadow(typedarray.getFloat(1, 0.0F), typedarray.getFloat(2, 0.0F), typedarray.getFloat(3, 0.0F), typedarray.getColor(0, 0xff000000));
        }
        if (typedarray.hasValue(4))
        {
            addOuterShadow(typedarray.getFloat(5, 0.0F), typedarray.getFloat(6, 0.0F), typedarray.getFloat(7, 0.0F), typedarray.getColor(4, 0xff000000));
        }
        if (!typedarray.hasValue(13)) goto _L4; else goto _L3
_L3:
        f = typedarray.getFloat(11, 1.0F);
        i = typedarray.getColor(13, 0xff000000);
        f1 = typedarray.getFloat(12, 10F);
        attributeset = null;
        typedarray.getInt(14, 0);
        JVM INSTR tableswitch 0 2: default 312
    //                   0 359
    //                   1 366
    //                   2 373;
           goto _L5 _L6 _L7 _L8
_L5:
        setStroke(f, i, attributeset, f1);
_L4:
        typedarray.recycle();
_L2:
        return;
_L6:
        attributeset = android.graphics.Paint.Join.MITER;
        continue; /* Loop/switch isn't completed */
_L7:
        attributeset = android.graphics.Paint.Join.BEVEL;
        continue; /* Loop/switch isn't completed */
_L8:
        attributeset = android.graphics.Paint.Join.ROUND;
        if (true) goto _L5; else goto _L9
_L9:
    }

    public void invalidate()
    {
        if (!frozen)
        {
            super.invalidate();
        }
    }

    public void invalidate(int i, int j, int k, int l)
    {
        if (!frozen)
        {
            super.invalidate(i, j, k, l);
        }
    }

    public void invalidate(Rect rect)
    {
        if (!frozen)
        {
            super.invalidate(rect);
        }
    }

    public void onDraw(Canvas canvas)
    {
        int i = getCurrentTextColor();
        if (strokeColor != null)
        {
            TextPaint textpaint = getPaint();
            textpaint.setStyle(android.graphics.Paint.Style.STROKE);
            textpaint.setStrokeJoin(strokeJoin);
            textpaint.setStrokeMiter(strokeMiter);
            setTextColor(strokeColor.intValue());
            textpaint.setStrokeWidth(strokeWidth);
            super.onDraw(canvas);
            textpaint.setStyle(android.graphics.Paint.Style.FILL);
            setTextColor(i);
        }
        super.onDraw(canvas);
        freeze();
        Drawable drawable = getBackground();
        Drawable adrawable[] = getCompoundDrawables();
        setCompoundDrawables(null, null, null, null);
        for (Iterator iterator = outerShadows.iterator(); iterator.hasNext(); super.onDraw(canvas))
        {
            Shadow shadow = (Shadow)iterator.next();
            setShadowLayer(shadow.r, shadow.dx, shadow.dy, shadow.color);
        }

        setShadowLayer(0.0F, 0.0F, 0.0F, 0);
        setTextColor(i);
        if (foregroundDrawable != null && (foregroundDrawable instanceof BitmapDrawable))
        {
            generateTempCanvas();
            super.onDraw(tempCanvas);
            ((BitmapDrawable)foregroundDrawable).getPaint().setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_ATOP));
            foregroundDrawable.setBounds(canvas.getClipBounds());
            foregroundDrawable.draw(tempCanvas);
            canvas.drawBitmap(tempBitmap, 0.0F, 0.0F, null);
            tempCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        }
        if (innerShadows.size() > 0)
        {
            generateTempCanvas();
            TextPaint textpaint1 = getPaint();
            for (Iterator iterator1 = innerShadows.iterator(); iterator1.hasNext(); setShadowLayer(0.0F, 0.0F, 0.0F, 0))
            {
                Shadow shadow1 = (Shadow)iterator1.next();
                setTextColor(shadow1.color);
                super.onDraw(tempCanvas);
                setTextColor(0xff000000);
                textpaint1.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
                textpaint1.setMaskFilter(new BlurMaskFilter(shadow1.r, android.graphics.BlurMaskFilter.Blur.NORMAL));
                tempCanvas.save();
                tempCanvas.translate(shadow1.dx, shadow1.dy);
                super.onDraw(tempCanvas);
                tempCanvas.restore();
                canvas.drawBitmap(tempBitmap, 0.0F, 0.0F, null);
                tempCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                textpaint1.setXfermode(null);
                textpaint1.setMaskFilter(null);
                setTextColor(i);
            }

        }
        if (adrawable != null)
        {
            setCompoundDrawablesWithIntrinsicBounds(adrawable[0], adrawable[1], adrawable[2], adrawable[3]);
        }
        setBackgroundDrawable(drawable);
        setTextColor(i);
        unfreeze();
    }

    public void postInvalidate()
    {
        if (!frozen)
        {
            super.postInvalidate();
        }
    }

    public void postInvalidate(int i, int j, int k, int l)
    {
        if (!frozen)
        {
            super.postInvalidate(i, j, k, l);
        }
    }

    public void requestLayout()
    {
        if (!frozen)
        {
            super.requestLayout();
        }
    }

    public void setForegroundDrawable(Drawable drawable)
    {
        foregroundDrawable = drawable;
    }

    public void setStroke(float f, int i)
    {
        setStroke(f, i, android.graphics.Paint.Join.MITER, 10F);
    }

    public void setStroke(float f, int i, android.graphics.Paint.Join join, float f1)
    {
        strokeWidth = f;
        strokeColor = Integer.valueOf(i);
        strokeJoin = join;
        strokeMiter = f1;
    }

    public void unfreeze()
    {
        frozen = false;
    }
}
