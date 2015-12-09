// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import gcg;
import gmr;

public class ConnectIconView extends View
{

    private Aspect a;
    private Path b;
    private Path c;
    private Path d;
    private Path e;
    private Path f;
    private Paint g;
    private Paint h;
    private Paint i;
    private Paint j;
    private Paint k;
    private int l;
    private int m;
    private long n;
    private int o;
    private int p;
    private int q;
    private float r;
    private SparseArray s;

    public ConnectIconView(Context context)
    {
        super(context);
        a = Aspect.a;
        s = new SparseArray();
        new android.animation.Animator.AnimatorListener() {

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

        };
    }

    public ConnectIconView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = Aspect.a;
        s = new SparseArray();
        new _cls1();
        a(context, attributeset);
    }

    public ConnectIconView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = Aspect.a;
        s = new SparseArray();
        new _cls1();
        a(context, attributeset);
    }

    private DashPathEffect a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        DashPathEffect dashpatheffect = new DashPathEffect(new float[] {
            f1, (r - f1) / 2.0F
        }, f1);
        this;
        JVM INSTR monitorexit ;
        return dashpatheffect;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        o = i1;
        g.setColor(i1);
        h.setColor(i1);
        i.setColor(i1);
        j.setColor(i1);
        k.setColor(i1);
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, gmr.d);
        a = Aspect.values()[context.getInt(0, Aspect.a.ordinal())];
        context.recycle();
    }

    private void a(Aspect aspect)
    {
        this;
        JVM INSTR monitorenter ;
        final class _cls2
        {

            static final int a[];
            private static int b[];

            static 
            {
                a = new int[Aspect.values().length];
                try
                {
                    a[Aspect.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[Aspect.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Aspect.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Aspect.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                b = new int[com.spotify.mobile.android.connect.ConnectManager.ConnectState.values().length];
                try
                {
                    b[com.spotify.mobile.android.connect.ConnectManager.ConnectState.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.spotify.mobile.android.connect.ConnectManager.ConnectState.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[com.spotify.mobile.android.connect.ConnectManager.ConnectState.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    b[com.spotify.mobile.android.connect.ConnectManager.ConnectState.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    b[com.spotify.mobile.android.connect.ConnectManager.ConnectState.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[aspect.ordinal()];
        JVM INSTR tableswitch 1 2: default 103
    //                   1 60
    //                   2 84;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_84;
_L1:
        a(q);
        b(0.0F);
_L4:
        n = SystemClock.elapsedRealtime();
        a = aspect;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(q);
        b(r);
          goto _L4
        aspect;
        throw aspect;
        a(p);
        b(r);
          goto _L4
    }

    private void b(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = Math.round(f1);
        if (s.get(i1) == null)
        {
            s.put(i1, a(f1));
        }
        k.setPathEffect((PathEffect)s.get(i1));
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i1;
        if (l != getWidth() || m != getHeight())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = getWidth();
            int j1 = getHeight();
            l = i1;
            m = j1;
            i1 = Math.min(i1 - getPaddingLeft() - getPaddingRight(), j1 - getPaddingTop() - getPaddingBottom());
            j1 = (m - i1) / 2;
            int k1 = getPaddingTop();
            int l1 = getPaddingBottom();
            int i2 = (l - i1) / 2;
            int j2 = getPaddingLeft();
            int k2 = getPaddingRight();
            p = gcg.b(getContext(), 0x7f0f00f8);
            q = gcg.b(getContext(), 0x7f0f00fd);
            o = q;
            float f1 = (float)i1 / 46.06F;
            float f2 = 3F * f1;
            canvas = new Path();
            canvas.moveTo(27F, 11.48F);
            canvas.cubicTo(27F, 11F, 26.73F, 10.57F, 26.3F, 10.37F);
            canvas.cubicTo(25.87F, 10.17F, 25.36F, 10.23F, 25F, 10.52F);
            canvas.cubicTo(23.07F, 12.09F, 17.38F, 16.25F, 14.31F, 16.68F);
            canvas.cubicTo(14.3F, 16.69F, 14.28F, 16.69F, 14.27F, 16.69F);
            canvas.cubicTo(13.05F, 16.91F, 9.96F, 17.35F, 9.93F, 17.36F);
            canvas.cubicTo(9.33F, 17.45F, 8.88F, 17.96F, 8.88F, 18.57F);
            canvas.lineTo(8.88F, 22.9F);
            canvas.cubicTo(8.88F, 22.92F, 8.88F, 22.94F, 8.88F, 22.96F);
            canvas.cubicTo(8.88F, 22.98F, 8.88F, 23F, 8.88F, 23.02F);
            canvas.lineTo(8.88F, 27.34F);
            canvas.cubicTo(8.88F, 27.95F, 9.33F, 28.47F, 9.93F, 28.56F);
            canvas.cubicTo(9.96F, 28.56F, 13.05F, 29.01F, 14.27F, 29.23F);
            canvas.cubicTo(14.28F, 29.23F, 14.3F, 29.23F, 14.31F, 29.23F);
            canvas.cubicTo(17.38F, 29.66F, 23.06F, 33.82F, 25F, 35.39F);
            canvas.cubicTo(25.22F, 35.57F, 25.5F, 35.67F, 25.77F, 35.67F);
            canvas.cubicTo(25.95F, 35.67F, 26.13F, 35.63F, 26.3F, 35.55F);
            canvas.cubicTo(26.73F, 35.35F, 27F, 34.91F, 27F, 34.44F);
            canvas.lineTo(27F, 23.02F);
            canvas.cubicTo(27F, 23F, 27F, 22.98F, 27F, 22.96F);
            canvas.cubicTo(27F, 22.94F, 27F, 22.92F, 27F, 22.9F);
            canvas.lineTo(27F, 11.48F);
            canvas.close();
            b = canvas;
            canvas = new Path();
            canvas.moveTo(30.37F, 18.78F);
            canvas.cubicTo(31.09F, 20.02F, 31.51F, 21.47F, 31.51F, 23.01F);
            canvas.cubicTo(31.51F, 24.53F, 31.1F, 25.96F, 30.4F, 27.19F);
            c = canvas;
            canvas = new Path();
            canvas.moveTo(34.98F, 15.33F);
            canvas.cubicTo(36.42F, 17.54F, 37.25F, 20.18F, 37.25F, 23.01F);
            canvas.cubicTo(37.25F, 25.8F, 36.44F, 28.41F, 35.04F, 30.61F);
            d = canvas;
            canvas = new Path();
            canvas.moveTo(39.58F, 11.88F);
            canvas.cubicTo(41.73F, 15.06F, 42.99F, 18.89F, 42.99F, 23.01F);
            canvas.cubicTo(42.99F, 27.08F, 41.77F, 30.86F, 39.66F, 34.01F);
            e = canvas;
            canvas = new Path();
            canvas.moveTo(36.41F, 37.78F);
            canvas.cubicTo(32.87F, 40.97F, 28.18F, 42.91F, 23.03F, 42.91F);
            canvas.cubicTo(12F, 42.91F, 3.07F, 34F, 3.07F, 23.01F);
            canvas.cubicTo(3.07F, 12.02F, 12F, 3.11F, 23.03F, 3.11F);
            canvas.cubicTo(28.15F, 3.11F, 32.83F, 5.04F, 36.37F, 8.2F);
            f = canvas;
            canvas = new Matrix();
            canvas.setScale(f1, f1);
            canvas.postTranslate(i2 + (j2 - k2), j1 + (k1 - l1));
            b.transform(canvas);
            c.transform(canvas);
            d.transform(canvas);
            e.transform(canvas);
            f.transform(canvas);
            canvas = new Paint(1);
            canvas.setStyle(android.graphics.Paint.Style.FILL);
            canvas.setColor(o);
            g = canvas;
            canvas = new Paint(1);
            canvas.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.setStrokeWidth(f2);
            canvas.setColor(o);
            canvas.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            canvas.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            canvas.setAlpha(255);
            h = canvas;
            canvas = new Paint(1);
            canvas.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.setStrokeWidth(f2);
            canvas.setColor(o);
            canvas.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            canvas.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            canvas.setAlpha(255);
            i = canvas;
            canvas = new Paint(1);
            canvas.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.setStrokeWidth(f2);
            canvas.setColor(o);
            canvas.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            canvas.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            canvas.setAlpha(255);
            j = canvas;
            canvas = new Paint(1);
            canvas.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.setStrokeWidth(f2);
            canvas.setColor(o);
            canvas.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            canvas.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            canvas.setPathEffect(a(0.0F));
            k = canvas;
            r = (new PathMeasure(f, false)).getLength();
            k.setPathEffect(null);
            h.setAlpha(255);
            i.setAlpha(255);
            j.setAlpha(255);
            s.put(0, a(0.0F));
            a(a);
            return;
        } else
        {
            canvas.drawPath(b, g);
            canvas.drawPath(c, h);
            canvas.drawPath(d, i);
            canvas.drawPath(e, j);
            canvas.drawPath(f, k);
            return;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        this;
        JVM INSTR monitorenter ;
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        a = ((SavedState) (parcelable)).a;
        n = ((SavedState) (parcelable)).b;
        this;
        JVM INSTR monitorexit ;
        return;
        parcelable;
        throw parcelable;
    }

    protected Parcelable onSaveInstanceState()
    {
        this;
        JVM INSTR monitorenter ;
        SavedState savedstate = new SavedState(super.onSaveInstanceState(), a, n);
        this;
        JVM INSTR monitorexit ;
        return savedstate;
        Exception exception;
        exception;
        throw exception;
    }

    private class Aspect extends Enum
    {

        public static final Aspect a;
        public static final Aspect b;
        public static final Aspect c;
        public static final Aspect d;
        private static final Aspect e[];

        public static Aspect valueOf(String s1)
        {
            return (Aspect)Enum.valueOf(com/spotify/mobile/android/ui/view/ConnectIconView$Aspect, s1);
        }

        public static Aspect[] values()
        {
            return (Aspect[])e.clone();
        }

        static 
        {
            a = new Aspect("NORMAL", 0);
            b = new Aspect("ARC", 1);
            c = new Aspect("ARC_GREEN", 2);
            d = new Aspect("ANIMATED_GREEN", 3);
            e = (new Aspect[] {
                a, b, c, d
            });
        }

        private Aspect(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        public final Aspect a;
        public final long b;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a.ordinal());
            parcel.writeLong(b);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = Aspect.values()[parcel.readInt()];
            b = parcel.readLong();
        }

        SavedState(Parcelable parcelable, Aspect aspect, long l1)
        {
            super(parcelable);
            a = aspect;
            b = l1;
        }
    }

}
