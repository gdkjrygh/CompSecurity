// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

public abstract class nwz
    implements nxe
{

    private static Handler a = new Handler(Looper.getMainLooper(), new nxa());
    private nxd b;
    private int c;
    private int d;
    private Object e;
    private nxb f;
    private volatile boolean g;
    private boolean h;

    public nwz(im im)
    {
    }

    private void d()
    {
        a.sendMessage(a.obtainMessage(1, this));
    }

    public final Object a()
    {
        b.v();
        a.sendMessage(a.obtainMessage(0, this));
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (h)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        flag = g;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        wait();
_L1:
        this;
        JVM INSTR monitorexit ;
        if (g)
        {
            throw new nxf(b);
        }
        break MISSING_BLOCK_LABEL_85;
        Object obj;
        obj;
        g = true;
        d();
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (c != 1)
        {
            throw new nxo(b, c, d);
        } else
        {
            return e;
        }
    }

    public final void a(nxb nxb1)
    {
        f = nxb1;
        c = nxb1.i;
        if (c == 2)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        b = nxb1.g;
        d = nxb1.k;
        e = nxb1.h;
        d();
        this;
        JVM INSTR monitorenter ;
        h = true;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        nxb1;
        this;
        JVM INSTR monitorexit ;
        throw nxb1;
    }

    public final void c()
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        nxb nxb1;
        nxb1 = f;
        b.u();
        nxb1.r();
        if (nxb1.n != this || nxb1.o != null && (nxb1.o == null || !nxb1.o.equals(null))) goto _L4; else goto _L3
_L3:
        nxb1.n = null;
        nxb1.o = null;
        nxb1.f.b(nxb1);
_L6:
        f = null;
_L2:
        return;
_L4:
        int i;
        int j;
        if (nxb1.p == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = nxb1.p.size();
        i = 0;
_L7:
label0:
        {
            if (i < j)
            {
                if (!((nxc)nxb1.p.get(i)).a(this, null))
                {
                    break label0;
                }
                nxb1.p.remove(i);
            }
            if (nxb1.p.isEmpty())
            {
                nxb1.f.b(nxb1);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

}
