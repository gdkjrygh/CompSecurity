// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ab, gl, hs, z, 
//            cw

public class y
    implements ab
{

    private final Object a = new Object();
    private final WeakHashMap b = new WeakHashMap();
    private final ArrayList c = new ArrayList();
    private final Context d;
    private final VersionInfoParcel e;
    private final cw f;

    public y(Context context, VersionInfoParcel versioninfoparcel, cw cw)
    {
        d = context.getApplicationContext();
        e = versioninfoparcel;
        f = cw;
    }

    public z a(AdSizeParcel adsizeparcel, gl gl1)
    {
        return a(adsizeparcel, gl1, ((View) (gl1.b.getWebView())));
    }

    public z a(AdSizeParcel adsizeparcel, gl gl1, View view)
    {
label0:
        {
            synchronized (a)
            {
                if (!a(gl1))
                {
                    break label0;
                }
                adsizeparcel = (z)b.get(gl1);
            }
            return adsizeparcel;
        }
        adsizeparcel = new z(adsizeparcel, gl1, e, view, f);
        adsizeparcel.a(this);
        b.put(gl1, adsizeparcel);
        c.add(adsizeparcel);
        obj;
        JVM INSTR monitorexit ;
        return adsizeparcel;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public void a(z z1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!z1.f())
        {
            c.remove(z1);
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == z1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        z1;
        obj;
        JVM INSTR monitorexit ;
        throw z1;
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean a(gl gl1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gl1 = (z)b.get(gl1);
        if (gl1 == null) goto _L2; else goto _L1
_L1:
        if (!gl1.f()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        gl1;
        obj;
        JVM INSTR monitorexit ;
        throw gl1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b(gl gl1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gl1 = (z)b.get(gl1);
        if (gl1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gl1.d();
        obj;
        JVM INSTR monitorexit ;
        return;
        gl1;
        obj;
        JVM INSTR monitorexit ;
        throw gl1;
    }

    public void c(gl gl1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gl1 = (z)b.get(gl1);
        if (gl1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gl1.l();
        obj;
        JVM INSTR monitorexit ;
        return;
        gl1;
        obj;
        JVM INSTR monitorexit ;
        throw gl1;
    }

    public void d(gl gl1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gl1 = (z)b.get(gl1);
        if (gl1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gl1.m();
        obj;
        JVM INSTR monitorexit ;
        return;
        gl1;
        obj;
        JVM INSTR monitorexit ;
        throw gl1;
    }

    public void e(gl gl1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gl1 = (z)b.get(gl1);
        if (gl1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gl1.n();
        obj;
        JVM INSTR monitorexit ;
        return;
        gl1;
        obj;
        JVM INSTR monitorexit ;
        throw gl1;
    }
}
