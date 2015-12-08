// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.v;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.tracking:
//            b, c, a, e, 
//            d

class ObjectTracker
{

    private static final af a = new af();
    private static ObjectTracker b;
    private final Map c = new HashMap();
    private long d;
    private b e;
    private final Vector f = new Vector(30);
    private final LinkedList g = new LinkedList();
    private final int h;
    private final int i;
    private final float j;

    private ObjectTracker(int k, int l, int i1)
    {
        h = k;
        i = l;
        j = i1;
        initNative(k, l);
    }

    static float a(ObjectTracker objecttracker)
    {
        return objecttracker.j;
    }

    private static int a(float f1)
    {
        return Math.max(0, Math.min((int)(255.999F * f1), 255));
    }

    private PointF a(long l, float f1, float f2)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = a(l, new RectF(f1 - 100F, f2 - 100F, f1 + 100F, 100F + f2));
        obj = new PointF(((RectF) (obj)).centerX() - f1, ((RectF) (obj)).centerY() - f2);
        this;
        JVM INSTR monitorexit ;
        return ((PointF) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    private RectF a(long l, RectF rectf)
    {
        this;
        JVM INSTR monitorenter ;
        rectf = a(rectf);
        float af1[] = new float[4];
        getCurrentPositionNative(l, rectf.left, rectf.top, rectf.right, rectf.bottom, af1);
        rectf = b(new RectF(af1[0], af1[1], af1[2], af1[3]));
        this;
        JVM INSTR monitorexit ;
        return rectf;
        rectf;
        throw rectf;
    }

    private RectF a(RectF rectf)
    {
        return new RectF(rectf.left / j, rectf.top / j, rectf.right / j, rectf.bottom / j);
    }

    static RectF a(ObjectTracker objecttracker, RectF rectf)
    {
        return objecttracker.a(rectf);
    }

    public static ObjectTracker a(int k, int l, int i1)
    {
        com/google/android/apps/unveil/tracking/ObjectTracker;
        JVM INSTR monitorenter ;
        ObjectTracker objecttracker;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        b = new ObjectTracker(k, l, i1);
        objecttracker = b;
        com/google/android/apps/unveil/tracking/ObjectTracker;
        JVM INSTR monitorexit ;
        return objecttracker;
        throw new RuntimeException("Tried to create a new objectracker before releasing the old one!");
        Exception exception;
        exception;
        com/google/android/apps/unveil/tracking/ObjectTracker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Canvas canvas)
    {
        Paint paint = new Paint();
        if (e != null)
        {
            float f1 = e.b;
            float f2 = e.c;
            Iterator iterator = e.a.iterator();
            while (iterator.hasNext()) 
            {
                c c1 = (c)iterator.next();
                if (c1.d)
                {
                    paint.setColor(a((c1.a.c - f1) / (f2 - f1)) << 16 | 0xff000000 | a(1.0F - (c1.a.c - f1) / (f2 - f1)));
                    float af1[] = new float[4];
                    af1[0] = c1.a.a;
                    af1[1] = c1.a.b;
                    af1[2] = c1.b.a;
                    af1[3] = c1.b.b;
                    canvas.drawRect(af1[2] - 3F, af1[3] - 3F, 3F + af1[2], 3F + af1[3], paint);
                    paint.setColor(0xff00ffff);
                    canvas.drawLine(af1[2], af1[3], af1[0], af1[1], paint);
                } else
                {
                    paint.setColor(-256);
                    float af2[] = new float[2];
                    af2[0] = c1.a.a;
                    af2[1] = c1.a.b;
                    canvas.drawCircle(af2[0], af2[1], 5F, paint);
                }
            }
        }
    }

    static void a(ObjectTracker objecttracker, String s)
    {
        objecttracker.forgetNative(s);
    }

    static void a(ObjectTracker objecttracker, String s, float f1, float f2, float f3, float f4, long l)
    {
        objecttracker.setPreviousPositionNative(s, f1, f2, f3, f4, l);
    }

    static void a(ObjectTracker objecttracker, String s, float f1, float f2, float f3, float f4, byte abyte0[])
    {
        objecttracker.registerAppearanceInFrameNative(s, f1, f2, f3, f4, abyte0);
    }

    static void a(ObjectTracker objecttracker, String s, float af1[])
    {
        objecttracker.getTrackedPositionNative(s, af1);
    }

    private RectF b(RectF rectf)
    {
        return new RectF(rectf.left * j, rectf.top * j, rectf.right * j, rectf.bottom * j);
    }

    static RectF b(ObjectTracker objecttracker, RectF rectf)
    {
        return objecttracker.b(rectf);
    }

    static af b()
    {
        return a;
    }

    static Map b(ObjectTracker objecttracker)
    {
        return objecttracker.c;
    }

    static boolean b(ObjectTracker objecttracker, String s)
    {
        return objecttracker.isObjectVisible(s);
    }

    static ObjectTracker c()
    {
        return b;
    }

    private native void drawNative(int k, int l, int i1);

    private native void forgetNative(String s);

    private native float getCurrentCorrelation(String s);

    private native void getCurrentPositionNative(long l, float f1, float f2, float f3, float f4, float af1[]);

    private native float[] getFeaturesNative(boolean flag);

    private native byte[] getFeaturesPacked(float f1);

    private native void getTrackedPositionNative(String s, float af1[]);

    private native void initNative(int k, int l);

    private native boolean isObjectVisible(String s);

    private native void nextFrameNative(byte abyte0[], long l, float af1[]);

    private native void registerAppearanceInFrameNative(String s, float f1, float f2, float f3, float f4, byte abyte0[]);

    private native void releaseMemoryNative();

    private native void setPreviousPositionNative(String s, float f1, float f2, float f3, float f4, long l);

    public final e a(RectF rectf, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        rectf = new e(this, rectf, d, abyte0);
        this;
        JVM INSTR monitorexit ;
        return rectf;
        rectf;
        throw rectf;
    }

    protected final void a()
    {
        this;
        JVM INSTR monitorenter ;
        releaseMemoryNative();
        com/google/android/apps/unveil/tracking/ObjectTracker;
        JVM INSTR monitorenter ;
        b = null;
        com/google/android/apps/unveil/tracking/ObjectTracker;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/android/apps/unveil/tracking/ObjectTracker;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void a(Canvas canvas, Matrix matrix)
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        float f2;
        Paint paint;
        canvas.save();
        canvas.setMatrix(matrix);
        f1 = ((float)h * j) / 2.0F;
        f2 = ((float)i * j) / 2.0F;
        paint = new Paint();
        paint.setAntiAlias(false);
        paint.setTypeface(Typeface.SERIF);
        paint.setColor(0xffff0000);
        paint.setStrokeWidth(2.0F);
        paint.setColor(0xff00ff00);
        canvas.drawCircle(f1, f2, 3F, paint);
        paint.setColor(0xffff0000);
        matrix = f;
        matrix;
        JVM INSTR monitorenter ;
        int l = f.size();
        int k = 0;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        float f3;
        float f4;
        PointF pointf = (PointF)f.get(l - k - 1);
        f3 = pointf.x + f1;
        f4 = f2 + pointf.y;
        canvas.drawLine(f1, f2, f3, f4, paint);
        k++;
        f2 = f4;
        f1 = f3;
        if (true) goto _L2; else goto _L1
_L1:
        matrix;
        JVM INSTR monitorexit ;
        a(canvas);
        canvas.restore();
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        matrix;
        JVM INSTR monitorexit ;
        throw canvas;
        canvas;
        this;
        JVM INSTR monitorexit ;
        throw canvas;
    }

    protected final void a(Size size, int k)
    {
        this;
        JVM INSTR monitorenter ;
        drawNative(size.width, size.height, k);
        this;
        JVM INSTR monitorexit ;
        return;
        size;
        throw size;
    }

    protected final void a(byte abyte0[], long l, float af1[], boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        nextFrameNative(abyte0, l, af1);
        g.add(new d(l, getFeaturesPacked(j)));
        for (; g.size() > 200; g.removeFirst()) { }
        break MISSING_BLOCK_LABEL_63;
        abyte0;
        throw abyte0;
        for (abyte0 = c.values().iterator(); abyte0.hasNext(); ((e)abyte0.next()).a()) { }
        if (!flag) goto _L2; else goto _L1
_L1:
        e = new b(this, getFeaturesNative(false));
        af1 = a(d, h / 2, i / 2);
        abyte0 = f;
        abyte0;
        JVM INSTR monitorenter ;
        f.add(af1);
        for (; f.size() > 30; f.remove(0)) { }
        break MISSING_BLOCK_LABEL_196;
        af1;
        abyte0;
        JVM INSTR monitorexit ;
        throw af1;
        abyte0;
        JVM INSTR monitorexit ;
_L2:
        d = l;
        this;
        JVM INSTR monitorexit ;
    }

    static 
    {
        v.c("clientvision");
    }
}
