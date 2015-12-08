// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.hs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzb, zzh, zzg

public class zzj extends com.google.android.gms.internal.bl.a
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final FrameLayout zznY;
    private final Object zzpc = new Object();
    private zzh zzvT;
    private final FrameLayout zzwq;
    private final Map zzwr = new HashMap();
    private zzb zzws;
    boolean zzwt;

    public zzj(FrameLayout framelayout, FrameLayout framelayout1)
    {
        zzwt = false;
        zzwq = framelayout;
        zznY = framelayout1;
        ho.a(zzwq, this);
        ho.a(zzwq, this);
        zzwq.setOnTouchListener(this);
    }

    static FrameLayout zza(zzj zzj1)
    {
        return zzj1.zznY;
    }

    int getMeasuredHeight()
    {
        return zzwq.getMeasuredHeight();
    }

    int getMeasuredWidth()
    {
        return zzwq.getMeasuredWidth();
    }

    public void onClick(View view)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzvT != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (zzws == null || !zzws.zzdq().equals(view))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        zzvT.performClick("1007");
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
        zzvT.zzb(view, zzwr);
          goto _L1
    }

    public void onGlobalLayout()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        int i;
        int j;
        if (!zzwt)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        if (i == 0 || j == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        zznY.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, j));
        zzwt = false;
        if (zzvT != null)
        {
            zzvT.zzi(zzwq);
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
        synchronized (zzpc)
        {
            if (zzvT != null)
            {
                zzvT.zzi(zzwq);
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
            synchronized (zzpc)
            {
                if (zzvT != null)
                {
                    break label0;
                }
            }
            return false;
        }
        Point point = zzc(motionevent);
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setLocation(point.x, point.y);
        zzvT.zzb(motionevent);
        motionevent.recycle();
        view;
        JVM INSTR monitorexit ;
        return false;
        motionevent;
        view;
        JVM INSTR monitorexit ;
        throw motionevent;
    }

    public a zzU(String s)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        s = (WeakReference)zzwr.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        s = b.a(s);
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

    public void zza(String s, a a)
    {
        View view = (View)b.a(a);
        a = ((a) (zzpc));
        a;
        JVM INSTR monitorenter ;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        zzwr.remove(s);
_L2:
        a;
        JVM INSTR monitorexit ;
        return;
        zzwr.put(s, new WeakReference(view));
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        a;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zzb(a a)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzwt = true;
        a = (zzh)b.a(a);
        if (!(zzvT instanceof zzg) || !((zzg)zzvT).zzdx())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        ((zzg)zzvT).zzb(a);
_L2:
        zznY.removeAllViews();
        zzws = zzf(a);
        if (zzws != null)
        {
            zznY.addView(zzws);
        }
        gw.a.post(new Runnable(a) {

            final zzh zzwu;
            final zzj zzwv;

            public void run()
            {
                hs hs1 = zzwu.zzdy();
                if (hs1 != null)
                {
                    zzj.zza(zzwv).addView(hs1.getWebView());
                }
            }

            
            {
                zzwv = zzj.this;
                zzwu = zzh1;
                super();
            }
        });
        a.zzh(zzwq);
        return;
        zzvT = a;
        if (zzvT instanceof zzg)
        {
            ((zzg)zzvT).zzb(null);
        }
        if (true) goto _L2; else goto _L1
_L1:
        a;
        obj;
        JVM INSTR monitorexit ;
        throw a;
    }

    Point zzc(MotionEvent motionevent)
    {
        int ai[] = new int[2];
        zzwq.getLocationOnScreen(ai);
        float f = motionevent.getRawX();
        float f1 = ai[0];
        float f2 = motionevent.getRawY();
        float f3 = ai[1];
        return new Point((int)(f - f1), (int)(f2 - f3));
    }

    zzb zzf(zzh zzh1)
    {
        return zzh1.zza(this);
    }
}
