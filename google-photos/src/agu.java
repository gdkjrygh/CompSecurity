// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.renderscript.RenderScript;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

final class agu
{

    final aif a;
    int b[];
    long c;
    Vector d;
    int e;
    agw f;
    private final ahw g;
    private boolean h;
    private int i;
    private agw j;

    public agu(aif aif1, int ai[], ahw ahw1)
    {
        Object obj = null;
        super();
        c = -1L;
        d = new Vector();
        h = false;
        i = 0;
        e = 1;
        f = null;
        j = null;
        a = aif1;
        aif1 = obj;
        if (ai != null)
        {
            aif1 = Arrays.copyOf(ai, ai.length);
        }
        b = aif1;
        g = ahw1;
    }

    private void a(agw agw1)
    {
        ahw ahw1 = g;
        if (!agw1.f() || !ahw1.c.a(agw1))
        {
            agw1.g();
            ahw1.b.remove(agw1);
        }
    }

    private void a(agw agw1, int k)
    {
        if (k == 2)
        {
            if (i > 0)
            {
                agw1 = String.valueOf(this);
                throw new RuntimeException((new StringBuilder(String.valueOf(agw1).length() + 48)).append("Attempting to write-lock the read-locked frame ").append(agw1).append("!").toString());
            }
            if (h)
            {
                agw1 = String.valueOf(this);
                throw new RuntimeException((new StringBuilder(String.valueOf(agw1).length() + 49)).append("Attempting to write-lock the write-locked frame ").append(agw1).append("!").toString());
            }
            for (k = 0; k < d.size(); k++)
            {
                agw agw2 = (agw)d.get(k);
                if (agw2 != agw1)
                {
                    agw2.d = true;
                }
            }

            h = true;
            f = agw1;
        } else
        {
            if (h)
            {
                agw1 = String.valueOf(this);
                throw new RuntimeException((new StringBuilder(String.valueOf(agw1).length() + 38)).append("Attempting to read-lock locked frame ").append(agw1).append("!").toString());
            }
            i = i + 1;
        }
        j = agw1;
    }

    public final Object a(int k, int l)
    {
        return b(k, l).a(l);
    }

    public final void a(int ai[])
    {
        Vector vector = new Vector();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); a((agw)iterator.next())) { }
        d = vector;
        b = ai;
    }

    public final boolean a()
    {
        boolean flag = false;
        if (!h) goto _L2; else goto _L1
_L1:
        h = false;
_L6:
        j.d();
        j = null;
        flag = true;
_L4:
        return flag;
_L2:
        if (i <= 0) goto _L4; else goto _L3
_L3:
        i = i - 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final agw b(int k, int l)
    {
        int i1 = 0;
_L3:
        agw agw1;
        if (i1 >= d.size())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        agw1 = (agw)d.get(i1);
        int j1;
        if (k == 2)
        {
            j1 = agw1.b();
        } else
        {
            j1 = agw1.a();
        }
        if ((j1 & l) != l) goto _L2; else goto _L1
_L1:
        agw agw2 = agw1;
        if (agw1 == null)
        {
            agw2 = c(k, l);
            if (d.size() > 0)
            {
                agw2.d = true;
            }
            d.add(agw2);
        }
        if (agw2 != null && agw2.d && f != null)
        {
            agw2.a(f);
        }
        if (agw2 == null)
        {
            throw new RuntimeException("Could not fetch frame data!");
        } else
        {
            a(agw2, k);
            return agw2;
        }
_L2:
        i1++;
          goto _L3
        agw1 = null;
          goto _L1
    }

    void b()
    {
        for (int k = 0; k < d.size(); k++)
        {
            a((agw)d.get(k));
        }

        d.clear();
        f = null;
    }

    agw c(int k, int l)
    {
        Object obj;
        Object obj1;
        int i1;
        obj = null;
        i1 = a.d();
        boolean flag;
        if (l != 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = g;
            int ai[] = b;
            obj = ((ahw) (obj)).c.a(k, l, ai, i1);
        }
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        l;
        JVM INSTR lookupswitch 6: default 116
    //                   1: 160
    //                   2: 171
    //                   4: 171
    //                   8: 182
    //                   16: 193
    //                   32: 204;
           goto _L1 _L2 _L3 _L3 _L4 _L5 _L6
_L1:
        if (obj == null)
        {
            throw new RuntimeException((new StringBuilder(53)).append("Could not create backing for access type ").append(l).append("!").toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = new agy();
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new aha();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new agz();
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new agx();
        continue; /* Loop/switch isn't completed */
_L6:
        if (!agv.i())
        {
            throw new RuntimeException("Attempted to create an AllocationBacking in context that does not support RenderScript!");
        }
        obj = g.a.e;
        if (((ajr) (obj)).i == null)
        {
            obj.i = RenderScript.create(((ajr) (obj)).a);
        }
        obj = new agv(((ajr) (obj)).i);
        if (true) goto _L1; else goto _L7
_L7:
        if (((agw) (obj)).c() && !g.a.f())
        {
            throw new RuntimeException("Cannot create backing that requires GPU in a runner that does not support OpenGL!");
        }
        obj.a = b;
        obj.b = i1;
        obj.c = a.a;
        ((agw) (obj)).a(a);
        ahw ahw1 = g;
        obj1 = obj;
        if (obj != null)
        {
            ahw1.b.add(obj);
            obj1 = obj;
        }
        return ((agw) (obj1));
    }
}
