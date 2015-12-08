// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.df.aj;
import com.google.android.m4b.maps.df.ak;
import com.google.android.m4b.maps.df.v;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            aa, cb, q, bm, 
//            p, ah

public class ac
{
    public static interface a
    {

        public abstract aa.a a(aa aa1);

        public abstract List c();
    }


    static final String a = com/google/android/m4b/maps/cg/ac.getSimpleName();
    int b;
    public final Map c = ax.d();
    final bm d;
    final cb e;
    final a f;
    final b g;
    aj h;
    public ak i;
    com.google.android.m4b.maps.df.ac j;
    public v k;
    final q l;
    final p m;
    final Resources n;
    private final boolean o;
    private final ah p;

    public ac(a a1, v v, bm bm, b b1, cb cb1, q q1, p p1, 
            boolean flag, ah ah, Resources resources)
    {
        b = 0;
        f = a1;
        k = v;
        d = bm;
        g = b1;
        e = cb1;
        l = q1;
        m = p1;
        o = flag;
        p = ah;
        n = resources;
    }

    final aa.a a(aa aa1)
    {
        aa.a a1 = (aa.a)c.get(aa1);
        Object obj = a1;
        if (a1 == null)
        {
            if (ab.a(a, 6))
            {
                obj = a;
                aa1 = String.valueOf(aa1);
                Log.e(((String) (obj)), (new StringBuilder(String.valueOf(aa1).length() + 35)).append("MarkerRenderer is null for Marker: ").append(aa1).toString());
            }
            obj = null;
        }
        return ((aa.a) (obj));
    }

    final void a(boolean flag)
    {
        Iterator iterator = c.keySet().iterator();
_L2:
        aa aa1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        aa1 = (aa)iterator.next();
        aa1.b.a();
        aa1;
        JVM INSTR monitorenter ;
        aa1.d = flag;
        aa1;
        JVM INSTR monitorexit ;
        aa1.a(64);
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        aa1;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    public final boolean b(aa aa1)
    {
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (!h.a(aa1))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        e.b(com.google.android.m4b.maps.cg.cb.a.v);
        return true;
        try
        {
            e.b(cb.a.u);
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            throw new RuntimeRemoteException(aa1);
        }
        aa1.r();
        if (!o)
        {
            boolean flag;
            if (f.c().size() > 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l.a(true, aa1, flag);
        }
        return false;
        e.b(cb.a.w);
        break MISSING_BLOCK_LABEL_46;
    }

    public final void c(aa aa1)
    {
        if (j == null)
        {
            e.b(cb.a.t);
            return;
        }
        try
        {
            e.b(cb.a.s);
            j.a(aa1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            throw new RuntimeRemoteException(aa1);
        }
    }

}
