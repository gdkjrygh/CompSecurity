// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.apps.unveil.UnveilSettings;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.gl.BoundingBox;
import com.google.android.apps.unveil.env.gl.a;
import com.google.android.apps.unveil.env.gl.l;
import com.google.android.apps.unveil.k;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.unveil.tracking:
//            e, ObjectTracker

public class TrackingTestView extends SurfaceView
{

    private final af a = new af();
    private final SurfaceHolder b;
    private ObjectTracker c;
    private final ArrayList d = new ArrayList();
    private Matrix e;
    private a f;
    private final boolean g;
    private PointF h;
    private PointF i;
    private RectF j;
    private final Paint k;
    private RectF l;

    public TrackingTestView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = null;
        h = null;
        i = null;
        j = null;
        g = ((k)context.getApplicationContext()).i().useGLES2Overlay;
        if (!g)
        {
            k = new Paint();
            k.setStyle(android.graphics.Paint.Style.STROKE);
            k.setStrokeWidth(3F);
            b = getHolder();
            b.setFormat(-3);
            setZOrderMediaOverlay(true);
            return;
        } else
        {
            k = null;
            b = null;
            return;
        }
    }

    static Matrix a(TrackingTestView trackingtestview, Matrix matrix)
    {
        trackingtestview.e = matrix;
        return matrix;
    }

    private static RectF a(PointF pointf, PointF pointf1)
    {
        if (pointf == null || pointf1 == null)
        {
            return null;
        } else
        {
            pointf = new RectF(pointf.x, pointf.y, pointf1.x, pointf1.y);
            pointf.sort();
            return pointf;
        }
    }

    static ObjectTracker a(TrackingTestView trackingtestview)
    {
        return trackingtestview.c;
    }

    static ObjectTracker a(TrackingTestView trackingtestview, ObjectTracker objecttracker)
    {
        trackingtestview.c = objecttracker;
        return objecttracker;
    }

    private void a()
    {
        Canvas canvas = b.lockCanvas();
        if (canvas == null)
        {
            return;
        }
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.SRC);
        if (j != null)
        {
            k.setColor(0xff00ffff);
            canvas.drawRect(j, k);
        }
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            e e1 = (e)iterator.next();
            RectF rectf = e1.b();
            if (rectf != null)
            {
                e.mapRect(rectf);
                Paint paint = k;
                int i1;
                if (e1.c())
                {
                    i1 = 0xff00ff00;
                } else
                {
                    i1 = 0xffff0000;
                }
                paint.setColor(i1);
                canvas.drawRect(rectf, k);
            }
        } while (true);
        b.unlockCanvasAndPost(canvas);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        d.clear();
        if (c != null)
        {
            c.a();
            c = null;
            e = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static boolean b(TrackingTestView trackingtestview)
    {
        return trackingtestview.g;
    }

    static ArrayList c(TrackingTestView trackingtestview)
    {
        return trackingtestview.d;
    }

    static a d(TrackingTestView trackingtestview)
    {
        return trackingtestview.f;
    }

    static Matrix e(TrackingTestView trackingtestview)
    {
        return trackingtestview.e;
    }

    static void f(TrackingTestView trackingtestview)
    {
        trackingtestview.a();
    }

    static RectF g(TrackingTestView trackingtestview)
    {
        return trackingtestview.l;
    }

    static RectF h(TrackingTestView trackingtestview)
    {
        trackingtestview.l = null;
        return null;
    }

    static void i(TrackingTestView trackingtestview)
    {
        trackingtestview.b();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        flag = super.onTouchEvent(motionevent);
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (motionevent.getAction() == 0)
        {
            h = new PointF(motionevent.getX(), motionevent.getY());
            if (d.size() >= 5)
            {
                b();
            }
        }
_L4:
        j = a(h, i);
        if (!g)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        f.a(0).set(j);
        f.a(0).a = true;
          goto _L3
        motionevent;
        throw motionevent;
        i = new PointF(motionevent.getX(), motionevent.getY());
        if (motionevent.getAction() == 1)
        {
            motionevent = a(h, i);
            Matrix matrix = new Matrix();
            e.invert(matrix);
            matrix.mapRect(motionevent);
            h = null;
            i = null;
            if (motionevent.width() > 4F && motionevent.height() > 4F)
            {
                j = null;
                l = motionevent;
            }
        }
          goto _L4
        f.a(0).a = false;
          goto _L3
        a();
          goto _L3
    }

    public void setBoundingBoxLayer(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        f = a1;
        f.a();
        f.a(0).d = l.e;
        f.a(0).c = new l(0.0F, 0.0F, 0.0F, 0.25F);
        f.a(1).d = l.b;
        f.a(1).c = new l(1.0F, 0.0F, 0.0F, 0.5F);
        f.a(2).d = l.c;
        f.a(2).c = new l(0.0F, 1.0F, 0.0F, 0.5F);
        f.a(3).d = l.d;
        f.a(3).c = new l(0.0F, 0.0F, 1.0F, 0.5F);
        int i1 = 4;
_L3:
        if (i1 >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        f.a(i1).d = l.a;
        f.a(i1).c = new l(0.0F, 0.0F, 0.0F, 0.5F);
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }
}
