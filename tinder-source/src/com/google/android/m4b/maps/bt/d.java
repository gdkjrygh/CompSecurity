// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.view.x;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.cg.aq;
import com.google.android.m4b.maps.cg.ba;
import com.google.android.m4b.maps.cg.bc;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bn;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.bt;
import com.google.android.m4b.maps.cg.bx;
import com.google.android.m4b.maps.cg.by;
import com.google.android.m4b.maps.cg.ca;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.cg.o;
import com.google.android.m4b.maps.cg.p;
import com.google.android.m4b.maps.cg.q;
import com.google.android.m4b.maps.cz.a;
import com.google.android.m4b.maps.df.ae;
import com.google.android.m4b.maps.df.ag;
import com.google.android.m4b.maps.df.an;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.y.j;
import java.util.Calendar;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            f, c, b, a, 
//            m, h, g, k

public final class d extends View
    implements p
{

    final com.google.android.m4b.maps.bt.a a;
    private final f b = new f(this);
    private h c;
    private final c d;
    private final Resources e;
    private final b f = new b(this);
    private k g;
    private GestureDetector h;
    private g i;
    private ae j;
    private ag k;
    private final Context l;
    private final by m;
    private final q n;
    private ca o;
    private final m p;
    private final bg q;
    private final cb r;

    private d(Context context, Resources resources, bt bt1, View view, bn bn1, by by1, o o1, 
            TextView textview, bg bg1, e e1, cb cb1, bc bc1)
    {
        super(context);
        l = context;
        e = resources;
        context = new Handler(Looper.getMainLooper());
        d = new c(this, resources, context);
        n = bn1.e;
        a(0, 0);
        a = new com.google.android.m4b.maps.bt.a(f, textview, bt1.b(), d, Calendar.getInstance(), w.a, o1, e1, bc1, bt1.a);
        m = by1;
        p = new m(this, view, bn1.a, ba.a(context), bg1);
        q = bg1;
        r = cb1;
    }

    public static d a(Context context, Resources resources, bt bt1, ScheduledExecutorService scheduledexecutorservice, View view, bn bn1, by by1, o o1, 
            TextView textview, bg bg1, e e1, cb cb1, bc bc1)
    {
        context = new d(context, resources, bt1, view, bn1, by1, o1, textview, bg1, e1, cb1, bc1);
        context.c = new h(context, scheduledexecutorservice);
        context.i = new g(context, ((d) (context)).c);
        context.h = new GestureDetector(((d) (context)).i);
        context.setFocusable(true);
        context.setClickable(true);
        context.o = new ca(context, ((d) (context)).c);
        android.support.v4.view.x.a(context, ((d) (context)).o);
        return context;
    }

    private void a(int i1, int j1)
    {
        int k1;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                return;
            }
            boolean flag = true;
            k1 = ((flag) ? 1 : 0);
            if (android.os.Build.VERSION.SDK_INT < 17)
            {
                break label0;
            }
            k1 = ((flag) ? 1 : 0);
            if (i1 <= 0)
            {
                break label0;
            }
            k1 = ((flag) ? 1 : 0);
            if (j1 <= 0)
            {
                break label0;
            }
            Display display = getDisplay();
            k1 = ((flag) ? 1 : 0);
            if (display == null)
            {
                break label0;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (i1 <= point.x)
            {
                k1 = ((flag) ? 1 : 0);
                if (j1 <= point.y)
                {
                    break label0;
                }
            }
            k1 = 0;
        }
        setLayerType(k1, null);
    }

    public final boolean A()
    {
        return false;
    }

    public final void a()
    {
    }

    public final void a(int i1)
    {
        com.google.android.m4b.maps.bt.a a1 = a;
        a1.b = i1;
        a1.a();
    }

    public final void a(ae ae1)
    {
        j = ae1;
    }

    public final void a(ag ag1)
    {
        k = ag1;
    }

    public final void a(an an)
    {
        ab.a(5, "setPoiClickListener not implemented in Lite Mode");
    }

    public final boolean a(MotionEvent motionevent)
    {
        boolean flag = true;
        if (g == null)
        {
            flag = false;
        } else
        if (j == null)
        {
            if (!com.google.android.m4b.maps.cz.a.a(l))
            {
                motionevent = c.a();
                m.a(g.e, motionevent, c.b());
                return true;
            }
        } else
        {
            motionevent = g.a(new Point((int)motionevent.getX(), (int)motionevent.getY()));
            try
            {
                j.a(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw new RuntimeRemoteException(motionevent);
            }
            return true;
        }
        return flag;
    }

    public final boolean a(boolean flag)
    {
        if (flag)
        {
            ab.a(5, "Traffic is not supported in Lite Mode");
        }
        return false;
    }

    public final boolean b(MotionEvent motionevent)
    {
        if (g == null || k == null)
        {
            return false;
        }
        motionevent = g.a(new Point((int)motionevent.getX(), (int)motionevent.getY()));
        try
        {
            k.a(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new RuntimeRemoteException(motionevent);
        }
        return true;
    }

    public final boolean b(boolean flag)
    {
        if (flag)
        {
            ab.a(5, "Indoor is not supported in Lite Mode");
        }
        return false;
    }

    public final boolean c(boolean flag)
    {
        if (flag)
        {
            ab.a(5, "Buildings are not supported in Lite Mode");
        }
        return false;
    }

    public final View d()
    {
        return this;
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            ab.a(5, "Map gestures are not supported in Lite Mode");
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        if (o.a(motionevent))
        {
            return true;
        } else
        {
            return super.dispatchHoverEvent(motionevent);
        }
    }

    public final bp e()
    {
        return d;
    }

    public final void e(boolean flag)
    {
        if (flag)
        {
            ab.a(5, "Map gestures are not supported in Lite Mode");
        }
    }

    public final com.google.android.m4b.maps.cg.ac.a f()
    {
        return c;
    }

    public final void f(boolean flag)
    {
        if (flag)
        {
            ab.a(5, "Map gestures are not supported in Lite Mode");
        }
    }

    public final com.google.android.m4b.maps.cg.ag g()
    {
        return c;
    }

    public final void g(boolean flag)
    {
        if (flag)
        {
            ab.a(5, "Map gestures are not supported in Lite Mode");
        }
    }

    public final Resources getResources()
    {
        return e;
    }

    public final com.google.android.m4b.maps.cg.ae.a h()
    {
        return b;
    }

    public final com.google.android.m4b.maps.cg.d i()
    {
        return null;
    }

    public final boolean isClickable()
    {
        if (q.a(0x64b540))
        {
            ViewGroup viewgroup;
            if (getParent() == null)
            {
                viewgroup = null;
            } else
            {
                viewgroup = (ViewGroup)getParent().getParent();
            }
            if (viewgroup != null)
            {
                return viewgroup.isClickable();
            } else
            {
                return true;
            }
        } else
        {
            return true;
        }
    }

    public final aq j()
    {
        return p;
    }

    public final void k()
    {
    }

    public final bc l()
    {
        return a.c;
    }

    public final void m()
    {
        com.google.android.m4b.maps.bt.a a1;
label0:
        {
            a1 = a;
            if (a1.c != null)
            {
                if (a1.c())
                {
                    break label0;
                }
                a1.a();
            }
            return;
        }
        Bitmap bitmap;
        if (a1.c.a)
        {
            bitmap = a1.h;
        } else
        {
            bitmap = a1.g;
        }
        a1.a.a(bitmap, a1.f);
    }

    protected final void onDetachedFromWindow()
    {
        r.a();
        a.b();
        super.onDetachedFromWindow();
    }

    protected final void onDraw(Canvas canvas)
    {
        Object obj;
        f f5;
        boolean flag;
        super.onDraw(canvas);
        obj = f;
        int i1 = getWidth();
        int j1 = getHeight();
        if (((b) (obj)).a != null)
        {
            Paint paint = new Paint();
            float f1 = (float)(i1 - ((b) (obj)).a.getWidth()) / 2.0F;
            float f4 = (float)(j1 - ((b) (obj)).a.getHeight()) / 2.0F;
            canvas.drawBitmap(((b) (obj)).a, f1, f4, paint);
        } else
        {
            ((b) (obj)).a(canvas);
        }
        g = ((b) (obj)).b;
        if (g == null) goto _L2; else goto _L1
_L1:
        c.a(canvas, g);
        f5 = b;
        obj = g;
        if (f5.b && f5.d != null) goto _L3; else goto _L2
_L2:
        o.b();
        flag = c.b();
        canvas = c.a();
        if (canvas != null)
        {
            n.a(true, canvas, flag);
            return;
        }
        break MISSING_BLOCK_LABEL_604;
_L3:
        Point point;
        Object obj1;
        obj1 = new LatLng(f5.d.getLatitude(), f5.d.getLongitude());
        point = ((com.google.android.m4b.maps.cg.al.a) (obj)).a(((LatLng) (obj1)));
        if (f5.d.hasAccuracy())
        {
            obj = ((com.google.android.m4b.maps.cg.al.a) (obj)).a(new LatLng(bx.a(f5.d.getAccuracy()) + ((LatLng) (obj1)).b, ((LatLng) (obj1)).c));
            float f2 = point.y - ((Point) (obj)).y;
            f5.c.setStyle(android.graphics.Paint.Style.STROKE);
            f5.c.setStrokeWidth(2.0F);
            f5.c.setColor(f5.a.getColor(com.google.android.m4b.maps.h.c.maps_accuracy_circle_line_color));
            canvas.drawCircle(point.x, point.y, f2, f5.c);
            f5.c.setStyle(android.graphics.Paint.Style.FILL);
            f5.c.setColor(f5.a.getColor(com.google.android.m4b.maps.h.c.maps_accuracy_circle_fill_color));
            canvas.drawCircle(point.x, point.y, f2, f5.c);
            f5.c.reset();
        }
        obj1 = new Matrix();
        if (!f5.d.hasBearing())
        {
            break; /* Loop/switch isn't completed */
        }
        ((Matrix) (obj1)).setRotate(f5.d.getBearing());
        if (f5.f == null)
        {
            f5.f = BitmapFactory.decodeResource(f5.a, com.google.android.m4b.maps.h.e.maps_chevron);
        }
        obj = f5.f;
_L5:
        com.google.android.m4b.maps.y.j.a(obj);
        ((Matrix) (obj1)).preTranslate(-((Bitmap) (obj)).getWidth() / 2, -((Bitmap) (obj)).getHeight() / 2);
        float f3 = f5.a.getDimension(com.google.android.m4b.maps.h.d.maps_vm_mylocation_dot_size);
        ((Matrix) (obj1)).postScale(f3 / (float)((Bitmap) (obj)).getWidth(), f3 / (float)((Bitmap) (obj)).getHeight());
        ((Matrix) (obj1)).postTranslate(point.x, point.y);
        canvas.drawBitmap(((Bitmap) (obj)), ((Matrix) (obj1)), f5.c);
        if (true) goto _L2; else goto _L4
_L4:
        if (f5.e == null)
        {
            f5.e = BitmapFactory.decodeResource(f5.a, com.google.android.m4b.maps.h.e.maps_blue_dot);
        }
        obj = f5.e;
          goto _L5
        if (true) goto _L2; else goto _L6
_L6:
        if (!flag)
        {
            n.a(false, canvas, flag);
            return;
        } else
        {
            n.a();
            return;
        }
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        a(i1, j1);
        super.onSizeChanged(i1, j1, k1, l1);
        a.a();
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        return isClickable() && h.onTouchEvent(motionevent);
    }

    public final void u()
    {
    }

    public final void v()
    {
    }

    public final void w()
    {
    }

    public final boolean x()
    {
        return false;
    }

    public final boolean y()
    {
        return false;
    }

    public final boolean z()
    {
        return false;
    }
}
