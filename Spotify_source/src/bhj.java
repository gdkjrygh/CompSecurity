// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class bhj extends cbx
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final Object a = new Object();
    private final FrameLayout b;
    private final FrameLayout c;
    private final Map d = new HashMap();
    private bha e;
    private bhg f;
    private boolean g;
    private int h;
    private int i;

    public bhj(FrameLayout framelayout, FrameLayout framelayout1)
    {
        g = false;
        b = framelayout;
        c = framelayout1;
        (new cks(b, this)).a();
        (new ckt(b, this)).a();
        b.setOnTouchListener(this);
    }

    private int a(int j)
    {
        bfq.a();
        return bjz.b(f.a, j);
    }

    static FrameLayout a(bhj bhj1)
    {
        return bhj1.c;
    }

    public final byb a(String s)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        s = (WeakReference)d.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        s = bye.a(s);
        obj;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = (View)s.get();
        if (true) goto _L4; else goto _L3
_L3:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(byb byb)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        g = true;
        byb = (bhg)bye.a(byb);
        if (!(f instanceof bhf) || !((bhf)f).b())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        ((bhf)f).a(byb);
_L2:
        c.removeAllViews();
        e = byb.a(this);
        if (e != null)
        {
            d.put("1007", new WeakReference(e.a));
            c.addView(e);
        }
        cjj.a.post(new Runnable(byb) {

            private bhg a;
            private bhj b;

            public final void run()
            {
                ckw ckw1 = a.c();
                if (ckw1 != null)
                {
                    bhj.a(b).addView(ckw1.b());
                }
            }

            
            {
                b = bhj.this;
                a = bhg1;
                super();
            }
        });
        byb.a(b);
        return;
        f = byb;
        if (f instanceof bhf)
        {
            ((bhf)f).a(null);
        }
        if (true) goto _L2; else goto _L1
_L1:
        byb;
        obj;
        JVM INSTR monitorexit ;
        throw byb;
    }

    public final void a(String s, byb byb)
    {
        View view = (View)bye.a(byb);
        byb = ((byb) (a));
        byb;
        JVM INSTR monitorenter ;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        d.remove(s);
_L2:
        byb;
        JVM INSTR monitorexit ;
        return;
        d.put(s, new WeakReference(view));
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        byb;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void onClick(View view)
    {
label0:
        {
            synchronized (a)
            {
                if (f != null)
                {
                    break label0;
                }
            }
            return;
        }
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = new JSONObject();
        iterator = d.entrySet().iterator();
_L1:
        Object obj;
        java.util.Map.Entry entry;
        View view1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_339;
        }
        entry = (java.util.Map.Entry)iterator.next();
        view1 = (View)((WeakReference)entry.getValue()).get();
        if (e == null || !e.a.equals(view1))
        {
            break MISSING_BLOCK_LABEL_314;
        }
        obj = new Point();
        b.getGlobalVisibleRect(new Rect(), ((Point) (obj)));
        Point point = new Point();
        view1.getGlobalVisibleRect(new Rect(), point);
        obj = new Point(point.x - ((Point) (obj)).x, point.y - ((Point) (obj)).y);
_L2:
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("width", a(view1.getWidth()));
        jsonobject1.put("height", a(view1.getHeight()));
        jsonobject1.put("x", a(((Point) (obj)).x));
        jsonobject1.put("y", a(((Point) (obj)).y));
        jsonobject.put((String)entry.getKey(), jsonobject1);
          goto _L1
        obj;
        bka.e((new StringBuilder("Unable to get view rectangle for view ")).append((String)entry.getKey()).toString());
          goto _L1
        view;
        obj1;
        JVM INSTR monitorexit ;
        throw view;
        obj = new Point();
        view1.getGlobalVisibleRect(new Rect(), ((Point) (obj)));
          goto _L2
        obj = new JSONObject();
        ((JSONObject) (obj)).put("x", a(h));
        ((JSONObject) (obj)).put("y", a(i));
_L3:
        if (e == null || !e.a.equals(view))
        {
            break MISSING_BLOCK_LABEL_424;
        }
        f.a("1007", jsonobject, ((JSONObject) (obj)));
_L4:
        obj1;
        JVM INSTR monitorexit ;
        return;
        JSONException jsonexception;
        jsonexception;
        bka.e("Unable to get click location");
          goto _L3
        f.a(view, d, jsonobject, ((JSONObject) (obj)));
          goto _L4
    }

    public final void onGlobalLayout()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int j;
        int k;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        j = b.getMeasuredWidth();
        k = b.getMeasuredHeight();
        if (j == 0 || k == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(j, k));
        g = false;
        if (f != null)
        {
            f.b(b);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onScrollChanged()
    {
        synchronized (a)
        {
            if (f != null)
            {
                f.b(b);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            synchronized (a)
            {
                if (f != null)
                {
                    break label0;
                }
            }
            return false;
        }
        float f1;
        int ai[];
        ai = new int[2];
        b.getLocationOnScreen(ai);
        f1 = motionevent.getRawX();
        float f2 = ai[0];
        float f3 = motionevent.getRawY();
        float f4 = ai[1];
        Point point = new Point((int)(f1 - f2), (int)(f3 - f4));
        h = point.x;
        i = point.y;
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setLocation(point.x, point.y);
        f.c.a(motionevent);
        motionevent.recycle();
        view;
        JVM INSTR monitorexit ;
        return false;
        motionevent;
        view;
        JVM INSTR monitorexit ;
        throw motionevent;
    }
}
