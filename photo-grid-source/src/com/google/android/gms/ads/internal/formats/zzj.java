// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.rt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh, a, zzg, h

public class zzj extends eb
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    boolean a;
    int b;
    int c;
    private final Object d = new Object();
    private final FrameLayout e;
    private final FrameLayout f;
    private final Map g = new HashMap();
    private com.google.android.gms.ads.internal.formats.a h;
    private zzh i;

    public zzj(FrameLayout framelayout, FrameLayout framelayout1)
    {
        a = false;
        e = framelayout;
        f = framelayout1;
        rt.a(e, this);
        rt.a(e, this);
        e.setOnTouchListener(this);
    }

    private int a(int j)
    {
        return zzl.zzcF().zzc(i.getContext(), j);
    }

    static FrameLayout a(zzj zzj1)
    {
        return zzj1.f;
    }

    public void onClick(View view)
    {
label0:
        {
            synchronized (d)
            {
                if (i != null)
                {
                    break label0;
                }
            }
            return;
        }
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = new JSONObject();
        iterator = g.entrySet().iterator();
_L1:
        Object obj;
        java.util.Map.Entry entry;
        View view1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_338;
        }
        entry = (java.util.Map.Entry)iterator.next();
        view1 = (View)((WeakReference)entry.getValue()).get();
        if (h == null || !h.a().equals(view1))
        {
            break MISSING_BLOCK_LABEL_313;
        }
        obj = new Point();
        e.getGlobalVisibleRect(new Rect(), ((Point) (obj)));
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Unable to get view rectangle for view ")).append((String)entry.getKey()).toString());
          goto _L1
        view;
        obj1;
        JVM INSTR monitorexit ;
        throw view;
        obj = new Point();
        view1.getGlobalVisibleRect(new Rect(), ((Point) (obj)));
          goto _L2
        obj = new JSONObject();
        ((JSONObject) (obj)).put("x", a(b));
        ((JSONObject) (obj)).put("y", a(c));
_L3:
        if (h == null || !h.a().equals(view))
        {
            break MISSING_BLOCK_LABEL_422;
        }
        i.zza("1007", jsonobject, ((JSONObject) (obj)));
_L4:
        obj1;
        JVM INSTR monitorexit ;
        return;
        JSONException jsonexception;
        jsonexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzaH("Unable to get click location");
          goto _L3
        i.zza(view, g, jsonobject, ((JSONObject) (obj)));
          goto _L4
    }

    public void onGlobalLayout()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int j;
        int k;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        j = e.getMeasuredWidth();
        k = e.getMeasuredHeight();
        if (j == 0 || k == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        f.setLayoutParams(new android.widget.FrameLayout.LayoutParams(j, k));
        a = false;
        if (i != null)
        {
            i.zzi(e);
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

    public void onScrollChanged()
    {
        synchronized (d)
        {
            if (i != null)
            {
                i.zzi(e);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            synchronized (d)
            {
                if (i != null)
                {
                    break label0;
                }
            }
            return false;
        }
        float f1;
        int ai[];
        ai = new int[2];
        e.getLocationOnScreen(ai);
        f1 = motionevent.getRawX();
        float f2 = ai[0];
        float f3 = motionevent.getRawY();
        float f4 = ai[1];
        Point point = new Point((int)(f1 - f2), (int)(f3 - f4));
        b = point.x;
        c = point.y;
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setLocation(point.x, point.y);
        i.zzb(motionevent);
        motionevent.recycle();
        view;
        JVM INSTR monitorexit ;
        return false;
        motionevent;
        view;
        JVM INSTR monitorexit ;
        throw motionevent;
    }

    public a zzW(String s)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        s = (WeakReference)g.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        s = com.google.android.gms.b.d.a(s);
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

    public void zza(String s, a a1)
    {
        View view = (View)com.google.android.gms.b.d.a(a1);
        a1 = ((a) (d));
        a1;
        JVM INSTR monitorenter ;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        g.remove(s);
_L2:
        a1;
        JVM INSTR monitorexit ;
        return;
        g.put(s, new WeakReference(view));
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        a1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zzb(a a1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        a = true;
        a1 = (zzh)com.google.android.gms.b.d.a(a1);
        if (!(i instanceof zzg) || !((zzg)i).zzdB())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        ((zzg)i).zzb(a1);
_L2:
        f.removeAllViews();
        h = a1.zza(this);
        if (h != null)
        {
            g.put("1007", new WeakReference(h.a()));
            f.addView(h);
        }
        qa.a.post(new h(this, a1));
        a1.zzh(e);
        return;
        i = a1;
        if (i instanceof zzg)
        {
            ((zzg)i).zzb(null);
        }
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }
}
