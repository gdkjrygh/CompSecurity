// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import Jy;
import Mf;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.snapchat.android.Timber;
import com.snapchat.android.util.SnapMediaUtils;
import com.snapchat.android.util.eventbus.DrawingEvent;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.snapchat.android.ui:
//            CanvasViewBase

public class LegacyCanvasView extends CanvasViewBase
    implements android.view.View.OnTouchListener
{
    public final class a
    {

        public Paint a;
        Path b;
        private float c;

        public final void a(float f1, float f2)
        {
            b.lineTo(f1, f2);
        }

        public final void a(Canvas canvas)
        {
            canvas.drawPath(b, a);
        }

        public a(int i1, float f1)
        {
            c = f1;
            b = new Path();
            a = new Paint();
            a.setColor(i1);
            a.setAntiAlias(true);
            a.setStyle(android.graphics.Paint.Style.STROKE);
            a.setStrokeWidth(c * 6.5F);
            a.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        }
    }

    final class b
    {

        public ArrayList a;
        Paint b;
        Matrix c;
        Canvas d;
        Bitmap e;
        boolean f;
        final LegacyCanvasView g;

        public final void a()
        {
            b();
            Object obj = SnapMediaUtils.a(g.getContext().getResources().getDisplayMetrics(), LegacyCanvasView.a(g), LegacyCanvasView.b(g), android.graphics.Bitmap.Config.ARGB_8888);
            obj = Jy.a().a(((android.graphics.BitmapFactory.Options) (obj)), true);
            if (obj != null)
            {
                e = ((Bitmap) (obj));
            } else
            {
                e = SnapMediaUtils.a(LegacyCanvasView.a(g), LegacyCanvasView.b(g), android.graphics.Bitmap.Config.ARGB_8888);
            }
            d = new Canvas(e);
        }

        public final void b()
        {
            d = null;
            Jy.a().a(e);
            e = null;
        }

        public b()
        {
            g = LegacyCanvasView.this;
            super();
            a = new ArrayList();
            b = new Paint();
            c = new Matrix();
            f = false;
            a();
            b.setAntiAlias(true);
            b.setFilterBitmap(false);
        }
    }


    private int a;
    private int b;
    private int c;
    private float d;
    private boolean e;
    private boolean f;
    private Point g;
    private Paint h;
    private a i;
    private b j;
    private float k;
    private float l;

    public LegacyCanvasView(Context context)
    {
        super(context);
        c = 0xffff0000;
        d = 1.0F;
        e = false;
        f = false;
        h = new Paint();
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        if (Jo.f(context))
        {
            a = Math.min(displaymetrics.widthPixels, displaymetrics.heightPixels);
            b = Jo.i(context);
        } else
        {
            a = Math.max(displaymetrics.widthPixels, displaymetrics.heightPixels);
            b = Math.min(displaymetrics.widthPixels, displaymetrics.heightPixels);
        }
        h.setDither(true);
        setOnTouchListener(this);
        j = new b();
        setLayerType(2, null);
        d = getResources().getDisplayMetrics().density;
        Timber.c("LegacyCanvasView", "Canvas view instantiated", new Object[0]);
    }

    static int a(LegacyCanvasView legacycanvasview)
    {
        return legacycanvasview.a;
    }

    private static Matrix a(float f1, float f2, float f3)
    {
        f3 /= 2.0F;
        f2 /= 2.0F;
        Matrix matrix = new Matrix();
        float f4 = Math.abs(f3 - f2);
        matrix.postTranslate(-f4, f4);
        matrix.postTranslate(-f3, -f2);
        matrix.postRotate(f1);
        matrix.postTranslate(f3, f2);
        return matrix;
    }

    private void a(float f1, float f2)
    {
        float f3 = Math.abs(f1 - k);
        float f5 = Math.abs(f2 - l);
        if (f3 >= 4F || f5 >= 4F)
        {
            a a1 = i;
            float f4 = k;
            float f6 = l;
            float f7 = (k + f1) / 2.0F;
            float f8 = (l + f2) / 2.0F;
            a1.b.quadTo(f4, f6, f7, f8);
            k = f1;
            l = f2;
        }
    }

    static int b(LegacyCanvasView legacycanvasview)
    {
        return legacycanvasview.b;
    }

    private static Matrix b(float f1, float f2, float f3)
    {
        f3 /= 2.0F;
        f2 /= 2.0F;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-f3, -f2);
        matrix.postRotate(f1);
        matrix.postTranslate(f3, f2);
        f1 = Math.abs(f3 - f2);
        matrix.postTranslate(f1, -f1);
        return matrix;
    }

    public final void a()
    {
        j.b();
        j = null;
    }

    public final void a(int i1)
    {
        float f1;
        float f2;
        Object obj;
        int j2;
        obj = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        int j1 = Math.min(a, b);
        int k1 = Math.max(a, b);
        j2 = ((Display) (obj)).getRotation();
        if (i1 == j2)
        {
            return;
        }
        int l1;
        int i2;
        if (j2 == 1 || j2 == 3)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            i2 = k1;
        } else
        {
            i2 = j1;
        }
        a = i2;
        if (l1 != 0)
        {
            l1 = j1;
        } else
        {
            l1 = k1;
        }
        b = l1;
        j.a();
        f1 = k1;
        f2 = j1;
        if (j2 == i1) goto _L2; else goto _L1
_L1:
        Timber.c("LegacyCanvasView", "Rotate drawing from %d to %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j2)
        });
        if (j2 == 1)
        {
            obj = b(270F, f1, f2);
            Timber.c("LegacyCanvasView", "went to rotation 90", new Object[0]);
        } else
        if (j2 == 3)
        {
            obj = b(90F, f1, f2);
            Timber.c("LegacyCanvasView", "went to rotation 270", new Object[0]);
        } else
        if (i1 == 1)
        {
            obj = a(90F, f1, f2);
            Timber.c("LegacyCanvasView", "went from rotation 90 (probz back to portrait)", new Object[0]);
        } else
        {
            obj = a(270F, f1, f2);
            Timber.c("LegacyCanvasView", "else... back to portrait from 270?", new Object[0]);
        }
_L4:
        if (j == null || j.a == null)
        {
            Timber.c("LegacyCanvasView", "Drawing is null", new Object[0]);
        } else
        {
            for (Iterator iterator = j.a.iterator(); iterator.hasNext(); ((a)iterator.next()).b.transform(((Matrix) (obj)))) { }
            postInvalidate();
        }
_L2:
        for (obj = j.a.iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a(j.d)) { }
        invalidate();
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        b b1 = j;
        if (b1.a.size() != 0)
        {
            b1.a.remove(b1.a.size() - 1);
        }
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        b1.d.drawRect(0.0F, 0.0F, b1.g.a, b1.g.b, paint);
        b1.f = true;
        b1.g.invalidate();
    }

    public final int c()
    {
        return c;
    }

    public final boolean d()
    {
        return e;
    }

    public final int e()
    {
        return j.a.size();
    }

    public final boolean f()
    {
        return j.a.size() >= 4;
    }

    public final ArrayList g()
    {
        return j.a;
    }

    public void onDraw(Canvas canvas)
    {
        canvas.save();
        if (j != null)
        {
            b b1 = j;
            if (b1.f)
            {
                Iterator iterator = b1.a.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    a a1 = (a)iterator.next();
                    if (b1.f)
                    {
                        a1.a(b1.d);
                    }
                } while (true);
                b1.f = false;
            }
            canvas.drawBitmap(b1.e, b1.c, b1.b);
        }
        if (i != null)
        {
            i.a(canvas);
        }
        canvas.restore();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i1 = 0;
        if (!e) goto _L2; else goto _L1
_L1:
        if (i != null) goto _L4; else goto _L3
_L3:
        f = false;
        i = new a(c, d);
        g = new Point((int)motionevent.getX(), (int)motionevent.getY());
        view = i;
        float f1 = g.x;
        float f2 = g.y;
        ((a) (view)).b.moveTo(f1, f2);
        i.a((float)g.x + 0.1F, (float)g.y + 0.1F);
        k = g.x;
        l = g.y;
        Mf.a().a(new DrawingEvent(com.snapchat.android.util.eventbus.DrawingEvent.DrawingEventType.STARTED_STROKE));
_L7:
        invalidate();
_L6:
        return true;
_L4:
        if (motionevent.getAction() == 2)
        {
            f = true;
            for (int j1 = motionevent.getHistorySize(); i1 < j1; i1++)
            {
                a(motionevent.getHistoricalX(i1), motionevent.getHistoricalY(i1));
            }

            a(motionevent.getX(), motionevent.getY());
            continue; /* Loop/switch isn't completed */
        }
        if (motionevent.getAction() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (g == null) goto _L6; else goto _L5
_L5:
        if (!f)
        {
            i.a(g.x + 1, g.y + 1);
        }
        view = j;
        motionevent = i;
        motionevent.a(((b) (view)).d);
        ((b) (view)).a.add(motionevent);
        i = null;
        g = null;
        Mf.a().a(new DrawingEvent(com.snapchat.android.util.eventbus.DrawingEvent.DrawingEventType.COMPLETED_STROKE));
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public void setColor(int i1)
    {
        c = i1;
        h.setColor(i1);
    }

    public void setDrawingEnabled(boolean flag)
    {
        e = flag;
    }
}
