// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.b;
import com.google.android.m4b.maps.bw.e;
import java.lang.ref.SoftReference;

// Referenced classes of package com.google.android.m4b.maps.be:
//            k

public final class j
    implements k
{
    static final class a
    {

        final SoftReference a;
        final aa b;

        public a(aa aa1)
        {
            Object obj1 = null;
            super();
            Object obj;
            boolean flag;
            if (aa1.b() == ah.q && ((ap)aa1).n() == 0 || (aa1 instanceof b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = aa1;
            } else
            {
                obj = null;
            }
            b = ((aa) (obj));
            obj = obj1;
            if (b == null)
            {
                obj = new SoftReference(aa1);
            }
            a = ((SoftReference) (obj));
        }
    }


    private static aa b = new b();
    private e a;

    public j(int i)
    {
        a = new e(i);
    }

    public final void a(ac ac, aa aa1)
    {
        synchronized (a)
        {
            a.b(ac, new a(aa1));
        }
        return;
        ac;
        e1;
        JVM INSTR monitorexit ;
        throw ac;
    }

    public final boolean a()
    {
        synchronized (a)
        {
            a.a(0);
        }
        return true;
        exception;
        e1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(aa aa1)
    {
        return aa1 == b;
    }

    public final void a_(ac ac)
    {
        a(ac, b);
    }

    public final boolean b(ac ac)
    {
        return c(ac) != null;
    }

    public final aa c(ac ac)
    {
        e e1 = a;
        e1;
        JVM INSTR monitorenter ;
        Object obj = (a)a.c(ac);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (((a) (obj)).b == null) goto _L2; else goto _L1
_L1:
        obj = ((a) (obj)).b;
_L3:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        a.d(ac);
        e1;
        JVM INSTR monitorexit ;
        return ((aa) (obj));
_L2:
        if (((a) (obj)).a != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = null;
          goto _L3
        obj = (aa)((a) (obj)).a.get();
          goto _L3
        e1;
        JVM INSTR monitorexit ;
        return null;
        ac;
        e1;
        JVM INSTR monitorexit ;
        throw ac;
    }

}
