// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import com.kik.g.p;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import kik.a.e.o;
import kik.a.f.a.c;
import kik.a.f.b.a;
import kik.a.f.c.e;
import kik.a.f.f.y;
import kik.a.f.i;
import kik.a.f.n;

// Referenced classes of package kik.android.net.communicator:
//            j, a, b

private final class <init> extends j
{

    final kik.android.net.communicator.a a;

    protected final void a()
    {
        try
        {
            kik.android.net.communicator.a.a(a, null);
            kik.android.net.communicator.a.r(a).put(new <init>(a, 2));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    protected final void a(n n1)
    {
        if (n1.a("pong"))
        {
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).b();
                    kik.android.net.communicator.a.D(a);
                }
            }
            n1.skipSubTree();
        } else
        {
            if (n1.a("ack"))
            {
                String s = n1.getAttributeValue(null, "id");
                kik.android.net.communicator.a.w(a).b(s);
                n1.skipSubTree();
                return;
            }
            if (n1.a("hold"))
            {
                String s1 = n1.getAttributeValue(null, "stanza");
                kik.android.net.communicator.a.w(a).c(s1);
                n1.skipSubTree();
                return;
            }
            if (n1.a("stc"))
            {
                n1 = c.a(n1);
                kik.android.net.communicator.a.z(a).a(n1, new b(this, n1));
                return;
            }
            if (n1.a("iq"))
            {
                Object obj1 = n1.getAttributeValue(null, "id");
                obj1 = kik.android.net.communicator.a.w(a).d(((String) (obj1)));
                if (obj1 != null)
                {
                    ((y) (obj1)).c(n1);
                    return;
                } else
                {
                    n1.skipSubTree();
                    return;
                }
            }
            n1.getName();
            kik.a.f.c.c c1 = e.a(n1, (KeyPair)kik.android.net.communicator.a.F(a).b().f(), kik.android.net.communicator.a.F(a));
            if (c1 != null)
            {
                n1 = kik.android.net.communicator.a.G(a).iterator();
                while (n1.hasNext()) 
                {
                    ((i)n1.next()).a(c1);
                }
            } else
            {
                n1.skipSubTree();
                return;
            }
        }
        return;
        n1;
        obj;
        JVM INSTR monitorexit ;
        throw n1;
    }

    private e(kik.android.net.communicator.a a1)
    {
        a = a1;
        super();
    }

    nit>(kik.android.net.communicator.a a1, byte byte0)
    {
        this(a1);
    }
}
