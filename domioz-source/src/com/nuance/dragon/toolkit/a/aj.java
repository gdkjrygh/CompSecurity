// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.d.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            s, x, aa, ak, 
//            e

abstract class aj extends s
{

    private final Queue a = new LinkedList();
    private x b;
    private boolean c;

    aj()
    {
    }

    static Queue a(aj aj1)
    {
        return aj1.a;
    }

    static void b(aj aj1)
    {
        aj1.c();
    }

    static x c(aj aj1)
    {
        return aj1.b;
    }

    private void c()
    {
        if (b == null && b() && !a.isEmpty() && ((x)a.peek()).m())
        {
            b = (x)a.remove();
            e e = a(b);
            b.i().a(b);
            b.a(e);
        }
    }

    static x d(aj aj1)
    {
        aj1.b = null;
        return null;
    }

    protected abstract e a(x x1);

    public void a()
    {
        Object obj;
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a(this, flag);
        c = true;
        obj = new ArrayList(a.size());
        ((ArrayList) (obj)).addAll(a);
        a.clear();
        if (b != null)
        {
            b.f();
            b = null;
        }
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((x)((Iterator) (obj)).next()).f()) { }
    }

    public final void a(x x1, int i)
    {
        LinkedList linkedlist;
        x x2;
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a(this, flag);
        com.nuance.dragon.toolkit.d.b.c.a("transaction", x1);
        x1.a(i);
        linkedlist = (LinkedList)a;
        i = 0;
_L3:
        if (i >= linkedlist.size())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        x2 = (x)linkedlist.get(i);
        if (x1.d() <= x2.d()) goto _L2; else goto _L1
_L1:
        linkedlist.add(i, x1);
_L4:
        x1.a(new ak(this));
        c();
        return;
_L2:
        i++;
          goto _L3
        linkedlist.add(x1);
          goto _L4
    }

    protected abstract boolean b();
}
