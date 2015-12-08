// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

class HighlightView
{
    static final class HandleMode extends Enum
    {

        private static final HandleMode $VALUES[];
        public static final HandleMode Always;
        public static final HandleMode Changing;
        public static final HandleMode Never;

        public static HandleMode valueOf(String s)
        {
            return (HandleMode)Enum.valueOf(com/soundcloud/android/crop/HighlightView$HandleMode, s);
        }

        public static HandleMode[] values()
        {
            return (HandleMode[])$VALUES.clone();
        }

        static 
        {
            Changing = new HandleMode("Changing", 0);
            Always = new HandleMode("Always", 1);
            Never = new HandleMode("Never", 2);
            $VALUES = (new HandleMode[] {
                Changing, Always, Never
            });
        }

        private HandleMode(String s, int i)
        {
            super(s, i);
        }
    }

    static final class ModifyMode extends Enum
    {

        private static final ModifyMode $VALUES[];
        public static final ModifyMode Grow;
        public static final ModifyMode Move;
        public static final ModifyMode None;

        public static ModifyMode valueOf(String s)
        {
            return (ModifyMode)Enum.valueOf(com/soundcloud/android/crop/HighlightView$ModifyMode, s);
        }

        public static ModifyMode[] values()
        {
            return (ModifyMode[])$VALUES.clone();
        }

        static 
        {
            None = new ModifyMode("None", 0);
            Move = new ModifyMode("Move", 1);
            Grow = new ModifyMode("Grow", 2);
            $VALUES = (new ModifyMode[] {
                None, Move, Grow
            });
        }

        private ModifyMode(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int DEFAULT_HIGHLIGHT_COLOR = 0xff33b5e5;
    public static final int GROW_BOTTOM_EDGE = 16;
    public static final int GROW_LEFT_EDGE = 2;
    public static final int GROW_NONE = 1;
    public static final int GROW_RIGHT_EDGE = 4;
    public static final int GROW_TOP_EDGE = 8;
    private static final float HANDLE_RADIUS_DP = 12F;
    public static final int MOVE = 32;
    private static final float OUTLINE_DP = 2F;
    RectF cropRect;
    Rect drawRect;
    private HandleMode handleMode;
    private final Paint handlePaint = new Paint();
    private float handleRadius;
    private int highlightColor;
    private RectF imageRect;
    private float initialAspectRatio;
    private boolean isFocused;
    private boolean maintainAspectRatio;
    Matrix matrix;
    private ModifyMode modifyMode;
    private final Paint outlinePaint = new Paint();
    private float outlineWidth;
    private final Paint outsidePaint = new Paint();
    private boolean showCircle;
    private boolean showThirds;
    private View viewContext;

    public HighlightView(View view)
    {
        modifyMode = ModifyMode.None;
        handleMode = HandleMode.Changing;
        viewContext = view;
        initStyles(view.getContext());
    }

    private Rect computeLayout()
    {
        RectF rectf = new RectF(cropRect.left, cropRect.top, cropRect.right, cropRect.bottom);
        matrix.mapRect(rectf);
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    private float dpToPx(float f)
    {
        return viewContext.getResources().getDisplayMetrics().density * f;
    }

    private void drawCircle(Canvas canvas)
    {
        outlinePaint.setStrokeWidth(1.0F);
        canvas.drawOval(new RectF(drawRect), outlinePaint);
    }

    private void drawHandles(Canvas canvas)
    {
        int i = drawRect.left + (drawRect.right - drawRect.left) / 2;
        int j = drawRect.top + (drawRect.bottom - drawRect.top) / 2;
        canvas.drawCircle(drawRect.left, j, handleRadius, handlePaint);
        canvas.drawCircle(i, drawRect.top, handleRadius, handlePaint);
        canvas.drawCircle(drawRect.right, j, handleRadius, handlePaint);
        canvas.drawCircle(i, drawRect.bottom, handleRadius, handlePaint);
    }

    private void drawOutsideFallback(Canvas canvas)
    {
        canvas.drawRect(0.0F, 0.0F, canvas.getWidth(), drawRect.top, outsidePaint);
        canvas.drawRect(0.0F, drawRect.bottom, canvas.getWidth(), canvas.getHeight(), outsidePaint);
        canvas.drawRect(0.0F, drawRect.top, drawRect.left, drawRect.bottom, outsidePaint);
        canvas.drawRect(drawRect.right, drawRect.top, canvas.getWidth(), drawRect.bottom, outsidePaint);
    }

    private void drawThirds(Canvas canvas)
    {
        outlinePaint.setStrokeWidth(1.0F);
        float f = (drawRect.right - drawRect.left) / 3;
        float f1 = (drawRect.bottom - drawRect.top) / 3;
        canvas.drawLine((float)drawRect.left + f, drawRect.top, (float)drawRect.left + f, drawRect.bottom, outlinePaint);
        canvas.drawLine(f * 2.0F + (float)drawRect.left, drawRect.top, f * 2.0F + (float)drawRect.left, drawRect.bottom, outlinePaint);
        canvas.drawLine(drawRect.left, (float)drawRect.top + f1, drawRect.right, (float)drawRect.top + f1, outlinePaint);
        canvas.drawLine(drawRect.left, f1 * 2.0F + (float)drawRect.top, drawRect.right, f1 * 2.0F + (float)drawRect.top, outlinePaint);
    }

    private void initStyles(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.cropImageStyle, typedvalue, true);
        context = context.obtainStyledAttributes(typedvalue.resourceId, R.styleable.CropImageView);
        showThirds = context.getBoolean(R.styleable.CropImageView_showThirds, false);
        showCircle = context.getBoolean(R.styleable.CropImageView_showCircle, false);
        highlightColor = context.getColor(R.styleable.CropImageView_highlightColor, 0xff33b5e5);
        handleMode = HandleMode.values()[context.getInt(R.styleable.CropImageView_showHandles, 0)];
        context.recycle();
        return;
        Exception exception;
        exception;
        context.recycle();
        throw exception;
    }

    private boolean isClipPathSupported(Canvas canvas)
    {
        if (android.os.Build.VERSION.SDK_INT != 17)
        {
            if (android.os.Build.VERSION.SDK_INT < 14 || android.os.Build.VERSION.SDK_INT > 15)
            {
                return true;
            }
            if (!canvas.isHardwareAccelerated())
            {
                return true;
            }
        }
        return false;
    }

    protected void draw(Canvas canvas)
    {
        canvas.save();
        Path path = new Path();
        outlinePaint.setStrokeWidth(outlineWidth);
        if (!hasFocus())
        {
            outlinePaint.setColor(0xff000000);
            canvas.drawRect(drawRect, outlinePaint);
        } else
        {
            Rect rect = new Rect();
            viewContext.getDrawingRect(rect);
            path.addRect(new RectF(drawRect), android.graphics.Path.Direction.CW);
            outlinePaint.setColor(highlightColor);
            if (isClipPathSupported(canvas))
            {
                canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
                canvas.drawRect(rect, outsidePaint);
            } else
            {
                drawOutsideFallback(canvas);
            }
            canvas.restore();
            canvas.drawPath(path, outlinePaint);
            if (showThirds)
            {
                drawThirds(canvas);
            }
            if (showCircle)
            {
                drawCircle(canvas);
            }
            if (handleMode == HandleMode.Always || handleMode == HandleMode.Changing && modifyMode == ModifyMode.Grow)
            {
                drawHandles(canvas);
                return;
            }
        }
    }

    public int getHit(float f, float f1)
    {
        int i = 0;
        Rect rect = computeLayout();
        int j;
        boolean flag;
        boolean flag1;
        if (f1 >= (float)rect.top - 20F && f1 < (float)rect.bottom + 20F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = i;
        if (f >= (float)rect.left - 20F)
        {
            flag = i;
            if (f < (float)rect.right + 20F)
            {
                flag = true;
            }
        }
        if (Math.abs((float)rect.left - f) < 20F && flag1)
        {
            j = 3;
        } else
        {
            j = 1;
        }
        i = j;
        if (Math.abs((float)rect.right - f) < 20F)
        {
            i = j;
            if (flag1)
            {
                i = j | 4;
            }
        }
        j = i;
        if (Math.abs((float)rect.top - f1) < 20F)
        {
            j = i;
            if (flag)
            {
                j = i | 8;
            }
        }
        if (Math.abs((float)rect.bottom - f1) < 20F && flag)
        {
            i = j | 0x10;
        } else
        {
            i = j;
        }
        j = i;
        if (i == 1)
        {
            j = i;
            if (rect.contains((int)f, (int)f1))
            {
                j = 32;
            }
        }
        return j;
    }

    public Rect getScaledCropRect(float f)
    {
        return new Rect((int)(cropRect.left * f), (int)(cropRect.top * f), (int)(cropRect.right * f), (int)(cropRect.bottom * f));
    }

    void growBy(float f, float f1)
    {
        float f2;
        RectF rectf;
        float f3 = f;
        f2 = f1;
        if (maintainAspectRatio)
        {
            if (f != 0.0F)
            {
                f2 = f / initialAspectRatio;
                f3 = f;
            } else
            {
                f3 = f;
                f2 = f1;
                if (f1 != 0.0F)
                {
                    f3 = f1 * initialAspectRatio;
                    f2 = f1;
                }
            }
        }
        rectf = new RectF(cropRect);
        f = f3;
        if (f3 <= 0.0F) goto _L2; else goto _L1
_L1:
        f = f3;
        if (rectf.width() + 2.0F * f3 <= imageRect.width()) goto _L2; else goto _L3
_L3:
        f1 = (imageRect.width() - rectf.width()) / 2.0F;
        f = f1;
        if (!maintainAspectRatio) goto _L2; else goto _L4
_L4:
        f2 = f1 / initialAspectRatio;
        f = f1;
        f1 = f2;
_L6:
        f2 = f1;
        f3 = f;
        if (f1 > 0.0F)
        {
            f2 = f1;
            f3 = f;
            if (rectf.height() + 2.0F * f1 > imageRect.height())
            {
                f1 = (imageRect.height() - rectf.height()) / 2.0F;
                f2 = f1;
                f3 = f;
                if (maintainAspectRatio)
                {
                    f3 = initialAspectRatio * f1;
                    f2 = f1;
                }
            }
        }
        rectf.inset(-f3, -f2);
        if (rectf.width() < 25F)
        {
            rectf.inset(-(25F - rectf.width()) / 2.0F, 0.0F);
        }
        if (maintainAspectRatio)
        {
            f = 25F / initialAspectRatio;
        } else
        {
            f = 25F;
        }
        if (rectf.height() < f)
        {
            rectf.inset(0.0F, -(f - rectf.height()) / 2.0F);
        }
        if (rectf.left < imageRect.left)
        {
            rectf.offset(imageRect.left - rectf.left, 0.0F);
        } else
        if (rectf.right > imageRect.right)
        {
            rectf.offset(-(rectf.right - imageRect.right), 0.0F);
        }
        if (rectf.top < imageRect.top)
        {
            rectf.offset(0.0F, imageRect.top - rectf.top);
        } else
        if (rectf.bottom > imageRect.bottom)
        {
            rectf.offset(0.0F, -(rectf.bottom - imageRect.bottom));
        }
        cropRect.set(rectf);
        drawRect = computeLayout();
        viewContext.invalidate();
        return;
_L2:
        f1 = f2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void handleMotion(int i, float f, float f1)
    {
        Rect rect = computeLayout();
        if (i == 32)
        {
            moveBy((cropRect.width() / (float)rect.width()) * f, (cropRect.height() / (float)rect.height()) * f1);
            return;
        }
        if ((i & 6) == 0)
        {
            f = 0.0F;
        }
        if ((i & 0x18) == 0)
        {
            f1 = 0.0F;
        }
        float f2 = cropRect.width() / (float)rect.width();
        float f3 = cropRect.height() / (float)rect.height();
        float f4;
        int j;
        if ((i & 2) != 0)
        {
            j = -1;
        } else
        {
            j = 1;
        }
        f4 = j;
        if ((i & 8) != 0)
        {
            i = -1;
        } else
        {
            i = 1;
        }
        growBy(f * f2 * f4, (float)i * (f1 * f3));
    }

    public boolean hasFocus()
    {
        return isFocused;
    }

    public void invalidate()
    {
        drawRect = computeLayout();
    }

    void moveBy(float f, float f1)
    {
        Rect rect = new Rect(drawRect);
        cropRect.offset(f, f1);
        cropRect.offset(Math.max(0.0F, imageRect.left - cropRect.left), Math.max(0.0F, imageRect.top - cropRect.top));
        cropRect.offset(Math.min(0.0F, imageRect.right - cropRect.right), Math.min(0.0F, imageRect.bottom - cropRect.bottom));
        drawRect = computeLayout();
        rect.union(drawRect);
        rect.inset(-(int)handleRadius, -(int)handleRadius);
        viewContext.invalidate(rect);
    }

    public void setFocus(boolean flag)
    {
        isFocused = flag;
    }

    public void setMode(ModifyMode modifymode)
    {
        if (modifymode != modifyMode)
        {
            modifyMode = modifymode;
            viewContext.invalidate();
        }
    }

    public void setup(Matrix matrix1, Rect rect, RectF rectf, boolean flag)
    {
        matrix = new Matrix(matrix1);
        cropRect = rectf;
        imageRect = new RectF(rect);
        maintainAspectRatio = flag;
        initialAspectRatio = cropRect.width() / cropRect.height();
        drawRect = computeLayout();
        outsidePaint.setARGB(125, 50, 50, 50);
        outlinePaint.setStyle(android.graphics.Paint.Style.STROKE);
        outlinePaint.setAntiAlias(true);
        outlineWidth = dpToPx(2.0F);
        handlePaint.setColor(highlightColor);
        handlePaint.setStyle(android.graphics.Paint.Style.FILL);
        handlePaint.setAntiAlias(true);
        handleRadius = dpToPx(12F);
        modifyMode = ModifyMode.None;
    }
}
