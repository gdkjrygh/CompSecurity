// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.br.e;
import com.google.android.m4b.maps.cc.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            w, ab, i, v, 
//            ad, ah

public final class c extends w
{

    e a;
    private final ArrayList b = new ArrayList();
    private final int c;

    public c(int j, ah ah)
    {
        super(ah);
        c = j;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        if (a == null || ab1.b > 0 || ab1.a == i.f || ab1.a == com.google.android.m4b.maps.bx.i.e)
        {
            return;
        }
        d1.c();
        d1.a.glBlendFunc(1, 771);
        d1.a.glTexEnvx(8960, 8704, 8448);
        this;
        JVM INSTR monitorenter ;
        b.clear();
        com.google.android.m4b.maps.br.e.b b2 = new com.google.android.m4b.maps.br.e.b(a.g);
        do
        {
            if (!b2.hasNext())
            {
                break;
            }
            h h2 = b2.a();
            if ((c != 1 || h2.h) && (c != 2 || !h2.h))
            {
                b.add(h2);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_160;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        int j = 0;
_L2:
        if (j >= b.size())
        {
            break; /* Loop/switch isn't completed */
        }
        h h1 = (h)b.get(j);
        d1.f();
        h1.a(d1, b1, ab1);
        d1.g();
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(List list, float f, float f1, b b1, int j)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = b.iterator();
_L2:
        Object obj;
        int k;
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_95;
                }
                obj = (h)iterator.next();
            } while (!(obj instanceof v));
            obj = (v)obj;
            k = ((v) (obj)).a(f, f1, b1);
        } while (k >= j);
        list.add(new ad(((v) (obj)), this, k));
        if (true) goto _L2; else goto _L1
_L1:
        list;
        throw list;
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean a(b b1, d d1)
    {
        return true;
    }

    public final r.a d()
    {
        if (c == 1)
        {
            return r.a.k;
        } else
        {
            return r.a.j;
        }
    }
}
