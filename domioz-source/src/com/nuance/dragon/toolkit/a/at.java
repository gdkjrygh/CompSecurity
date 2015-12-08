// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.a.a.a.c.a.c.a;
import com.nuance.dragon.toolkit.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            ap, x, e, al, 
//            o, an, au, ao, 
//            ar

final class at extends ap
{

    private final ArrayList c = new ArrayList();
    private boolean d;

    at(com.nuance.dragon.toolkit.a.e e1, x x1)
    {
        super(e1, true, false, x1);
        d = false;
    }

    final void a()
    {
        super.a();
        Iterator iterator;
        try
        {
            a.a(b.a(), b.b(), b.c());
            break MISSING_BLOCK_LABEL_34;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            e.a(this, (new StringBuilder("Failed to create command [")).append(b.a()).append("]").toString(), ((Throwable) (obj)));
            e();
        }
_L2:
        return;
        for (iterator = b.h().iterator(); iterator.hasNext();)
        {
            Object obj = (al)iterator.next();
            try
            {
                ((al) (obj)).a(a);
            }
            catch (Exception exception1)
            {
                e.a(this, (new StringBuilder("Failed to send param [")).append(((al) (obj)).b).append("] command [").append(b.a()).append("]").toString(), exception1);
                a(new an(b, 4, exception1.getMessage(), ((al) (obj)).b, null, 0));
                return;
            }
            if (((al) (obj)).d)
            {
                c.add((o)obj);
            }
        }

        if (b.g() || !c.isEmpty())
        {
            if (!d)
            {
                d = true;
                try
                {
                    a.b();
                }
                catch (Exception exception)
                {
                    e.a(this, (new StringBuilder("Error ending command ")).append(b.a()).toString(), exception);
                    a(new an(b));
                }
            }
            if (!c.isEmpty())
            {
                a(((ap) (new au(a, b, c))));
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    final void a(a a1)
    {
        super.a(a1);
        a1 = new ao(b, a1);
        boolean flag = a1.e();
        if (flag)
        {
            a(((ap) (new ar(a, b))));
        }
        b.a(a1, flag);
    }

    public final void a(al al1)
    {
        if (!b.g())
        {
            if (al1.d)
            {
                c.add((o)al1);
            }
            try
            {
                al1.a(a);
                return;
            }
            catch (Exception exception)
            {
                e.a(this, (new StringBuilder("Failed to send param ")).append(al1.b).toString(), exception);
            }
            a(new an(b, 4, null, al1.b, null, 0));
            return;
        } else
        {
            e.c(this, (new StringBuilder("Transaction already finished, parameter ")).append(al1.b).append(" can not be sent").toString());
            return;
        }
    }

    final void d()
    {
        if (!d)
        {
            d = true;
            try
            {
                a.b();
            }
            catch (Exception exception)
            {
                e.a(this, (new StringBuilder("Error ending command ")).append(b.a()).toString(), exception);
                a(new an(b));
            }
        }
        if (!c.isEmpty())
        {
            a(new au(a, b, c));
        }
    }
}
