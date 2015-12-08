// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import android.content.Context;
import android.os.PowerManager;
import com.kik.g.e;
import com.kik.g.k;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.sdkutils.ab;
import java.io.IOException;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import kik.a.d.j;
import kik.a.e.f;
import kik.a.e.o;
import kik.a.e.y;
import kik.a.f.a.g;
import kik.a.f.f.w;
import kik.a.f.f.z;
import kik.a.f.i;
import kik.a.f.n;
import kik.android.chat.KikApplication;
import kik.android.d.d;
import kik.android.util.ar;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.net.communicator:
//            j, b, k

public final class kik.android.net.communicator.a
    implements f
{
    private final class a extends kik.android.net.communicator.j
    {

        final kik.android.net.communicator.a a;

        protected final void a()
        {
            try
            {
                kik.android.net.communicator.a.a(a, null);
                kik.android.net.communicator.a.r(a).put(a. new e(2));
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
                    String s1 = n1.getAttributeValue(null, "id");
                    kik.android.net.communicator.a.w(a).b(s1);
                    n1.skipSubTree();
                    return;
                }
                if (n1.a("hold"))
                {
                    String s2 = n1.getAttributeValue(null, "stanza");
                    kik.android.net.communicator.a.w(a).c(s2);
                    n1.skipSubTree();
                    return;
                }
                if (n1.a("stc"))
                {
                    n1 = kik.a.f.a.c.a(n1);
                    kik.android.net.communicator.a.z(a).a(n1, new kik.android.net.communicator.b(this, n1));
                    return;
                }
                if (n1.a("iq"))
                {
                    Object obj1 = n1.getAttributeValue(null, "id");
                    obj1 = kik.android.net.communicator.a.w(a).d(((String) (obj1)));
                    if (obj1 != null)
                    {
                        ((kik.a.f.f.y) (obj1)).c(n1);
                        return;
                    } else
                    {
                        n1.skipSubTree();
                        return;
                    }
                }
                n1.getName();
                kik.a.f.c.c c1 = kik.a.f.c.e.a(n1, (KeyPair)kik.android.net.communicator.a.F(a).b().f(), kik.android.net.communicator.a.F(a));
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

        private a()
        {
            a = kik.android.net.communicator.a.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements Runnable
    {

        final kik.android.net.communicator.a a;
        private String b;

        public final void run()
        {
            com.kik.android.b.a a1;
            if (b == null)
            {
                b = kik.android.net.communicator.a.n(a).d();
            }
            a1 = new com.kik.android.b.a(kik.android.net.communicator.a.o(a), "write", (byte)0);
            obj = a1.f();
_L23:
            if (kik.android.net.communicator.a.p(a)) goto _L2; else goto _L1
_L1:
            Object obj1;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            Object obj11;
            Object obj12;
            e e1;
            Object obj13;
            Object obj14;
            Object obj15;
            Object obj16;
            Object obj17;
            Object obj18;
            Object obj19;
            com.kik.g.ar ar1;
            Object obj20;
            Object obj21;
            Object obj22;
            Object obj23;
            Object obj24;
            Object obj25;
            Object obj26;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            boolean flag5;
            boolean flag6;
            boolean flag7;
            boolean flag8;
            long l1;
            obj16 = null;
            obj12 = null;
            e1 = null;
            obj13 = null;
            obj14 = null;
            obj15 = null;
            obj19 = null;
            obj18 = null;
            obj17 = null;
            flag1 = false;
            flag2 = false;
            flag3 = false;
            flag4 = false;
            flag5 = false;
            flag6 = false;
            flag7 = false;
            flag8 = false;
            flag = false;
            ar1 = null;
            obj20 = null;
            obj21 = null;
            obj22 = null;
            obj23 = null;
            obj24 = null;
            obj25 = null;
            obj26 = null;
            obj1 = null;
            l1 = 0L;
            obj3 = obj1;
            obj7 = ar1;
            obj8 = obj20;
            obj9 = obj21;
            obj4 = obj22;
            obj5 = obj23;
            obj10 = obj24;
            obj11 = obj25;
            obj6 = obj26;
            if (!kik.android.net.communicator.a.q(a).isEmpty())
            {
                break MISSING_BLOCK_LABEL_228;
            }
            obj3 = obj1;
            obj7 = ar1;
            obj8 = obj20;
            obj9 = obj21;
            obj4 = obj22;
            obj5 = obj23;
            obj10 = obj24;
            obj11 = obj25;
            obj6 = obj26;
            ((com.kik.g.ar) (obj)).c();
            obj3 = obj1;
            obj7 = ar1;
            obj8 = obj20;
            obj9 = obj21;
            obj4 = obj22;
            obj5 = obj23;
            obj10 = obj24;
            obj11 = obj25;
            obj6 = obj26;
            obj2 = (kik.a.e.f.b)kik.android.net.communicator.a.q(a).take();
            obj3 = obj2;
            obj7 = obj2;
            obj8 = obj2;
            obj9 = obj2;
            obj4 = obj2;
            obj5 = obj2;
            obj10 = obj2;
            obj11 = obj2;
            obj6 = obj2;
            if (((com.kik.g.ar) (obj)).b())
            {
                break MISSING_BLOCK_LABEL_347;
            }
            obj3 = obj2;
            obj7 = obj2;
            obj8 = obj2;
            obj9 = obj2;
            obj4 = obj2;
            obj5 = obj2;
            obj10 = obj2;
            obj11 = obj2;
            obj6 = obj2;
            ar1 = a1.f();
            obj = ar1;
            obj9 = obj2;
            obj11 = obj2;
            kik.android.net.communicator.a.r(a).clear();
            obj9 = obj2;
            obj11 = obj2;
            kik.android.net.communicator.a.a(a, 2);
            obj9 = obj2;
            obj11 = obj2;
            long l2 = System.currentTimeMillis();
            int i1;
            long l3;
            long l4;
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            boolean flag9 = kik.android.net.communicator.a.s(a);
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            long l5 = ab.a();
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            obj6 = kik.android.net.communicator.a.a(a).a();
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            if (!kik.android.net.communicator.a.b(a))
            {
                break MISSING_BLOCK_LABEL_538;
            }
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            obj6 = kik.android.net.communicator.a.a(a).l();
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            int j1 = kik.android.net.communicator.a.a(a).m();
            if (!flag9) goto _L4; else goto _L3
_L3:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            j1 = kik.android.net.communicator.a.a(a).n();
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            (new StringBuilder("Connect: using failover port (")).append(j1).append(")");
_L24:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            obj7 = kik.android.net.communicator.a.a(a).c();
            int k1;
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            k1 = j1;
            obj3 = obj6;
            if (System.currentTimeMillis() >= kik.android.net.communicator.a.d(a)) goto _L6; else goto _L5
_L5:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            k1 = j1;
            obj3 = obj6;
            if (kik.android.net.communicator.a.e(a) == null) goto _L6; else goto _L7
_L7:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            k1 = j1;
            obj3 = obj6;
            if (kik.android.net.communicator.a.f(a) <= 0) goto _L6; else goto _L8
_L8:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            (new StringBuilder("Connecting to redirected host ")).append(kik.android.net.communicator.a.e(a)).append(":").append(kik.android.net.communicator.a.f(a)).append(" security=").append(kik.android.net.communicator.a.g(a));
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            obj6 = kik.android.net.communicator.a.e(a);
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            j1 = kik.android.net.communicator.a.f(a);
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            k1 = j1;
            obj3 = obj6;
            if (kik.android.net.communicator.a.g(a) == null) goto _L6; else goto _L9
_L9:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            obj3 = kik.android.net.communicator.a.g(a);
            obj7 = obj6;
            obj6 = obj3;
_L43:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            obj3 = new kik.android.net.communicator.k(a. new a((byte)0), kik.android.net.communicator.a.h(a), kik.android.net.communicator.a.i(a), b, a.a);
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            ((kik.android.net.communicator.k) (obj3)).a(((String) (obj7)), j1, kik.android.net.communicator.a.j(a), kik.android.net.communicator.a.k(a), kik.android.net.communicator.a.a(a).o(), "CAN", KikApplication.b(), kik.android.net.communicator.a.l(a), ((kik.a.f.g.c) (obj6)), kik.android.net.communicator.a.m(a) + 1);
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            long l6 = ab.a();
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            kik.android.net.communicator.a.a(a, l6 - l5);
            kik.android.net.communicator.a.a(a, ((kik.android.net.communicator.k) (obj3)).c());
            kik.android.net.communicator.a.t(a);
            kik.android.net.communicator.a.a(a, 1);
            kik.android.net.communicator.a.u(a).a(Boolean.valueOf(a.m()));
            l3 = System.currentTimeMillis();
            l1 = l3;
            kik.android.net.communicator.a.v(a);
            System.currentTimeMillis();
            ((kik.a.e.f.b) (obj2)).a();
            kik.android.net.communicator.a.r(a).add(a. new e(1));
            obj4 = obj;
_L20:
            obj12 = obj4;
            if (obj3 == null) goto _L11; else goto _L10
_L10:
            obj5 = obj4;
            obj6 = obj4;
            obj7 = obj4;
            obj8 = obj4;
            obj9 = obj4;
            obj10 = obj4;
            obj11 = obj4;
            if (!kik.android.net.communicator.a.r(a).isEmpty())
            {
                break MISSING_BLOCK_LABEL_1372;
            }
            obj5 = obj4;
            obj6 = obj4;
            obj7 = obj4;
            obj8 = obj4;
            obj9 = obj4;
            obj10 = obj4;
            obj11 = obj4;
            ((com.kik.g.ar) (obj4)).c();
            obj5 = obj4;
            obj6 = obj4;
            obj7 = obj4;
            obj8 = obj4;
            obj9 = obj4;
            obj10 = obj4;
            obj11 = obj4;
            e1 = (e)kik.android.net.communicator.a.r(a).take();
            obj = obj4;
            obj5 = obj4;
            obj6 = obj4;
            obj7 = obj4;
            obj8 = obj4;
            obj9 = obj4;
            obj10 = obj4;
            obj11 = obj4;
            if (((com.kik.g.ar) (obj4)).b())
            {
                break MISSING_BLOCK_LABEL_1490;
            }
            obj5 = obj4;
            obj6 = obj4;
            obj7 = obj4;
            obj8 = obj4;
            obj9 = obj4;
            obj10 = obj4;
            obj11 = obj4;
            obj = a1.f();
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj12 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            if (kik.android.net.communicator.a.p(a)) goto _L11; else goto _L12
_L12:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            e1.a;
            JVM INSTR tableswitch 1 5: default 5208
        //                       1 1584
        //                       2 2456
        //                       3 1914
        //                       4 2529
        //                       5 3237;
               goto _L13 _L14 _L15 _L16 _L17 _L18
_L14:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            obj12 = kik.android.net.communicator.a.w(a).b();
            obj4 = obj;
            if (obj12 == null) goto _L20; else goto _L19
_L19:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            ((kik.android.net.communicator.k) (obj3)).a(((kik.a.f.f.ac) (obj12)));
              goto _L14
            obj;
            obj = obj5;
            i1 = 1;
_L42:
            obj4 = a;
            if (!kik.android.net.communicator.a.s(a))
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            kik.android.net.communicator.a.a(((kik.android.net.communicator.a) (obj4)), flag9);
            kik.android.net.communicator.a.a(a, 4);
            if (i1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            obj2 = obj;
            if (i1 == 0) goto _L22; else goto _L21
_L21:
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj3 != null)
            {
                ((kik.android.net.communicator.k) (obj3)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
              goto _L23
_L4:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = ((flag8) ? 1 : 0);
            obj4 = obj18;
            flag9 = ((Boolean)kik.android.net.communicator.a.c(a).a("use-wrong-socket-port").b()).booleanValue();
            if (flag9)
            {
                j1 = 5228;
            }
              goto _L24
_L16:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            obj4 = kik.android.net.communicator.a.x(a);
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            obj4;
            JVM INSTR monitorenter ;
            if (kik.android.net.communicator.a.y(a) != null)
            {
                kik.android.net.communicator.a.y(a).a();
            }
            obj4;
            JVM INSTR monitorexit ;
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            ((kik.android.net.communicator.k) (obj3)).a("<ping/>");
            obj4 = obj;
              goto _L20
            obj;
            j1 = 1;
            obj = obj3;
_L41:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj;
            kik.android.net.communicator.a.B(a).a(null);
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj;
            a.b.f();
            kik.android.net.communicator.a.a(a, 4);
            if (j1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            if (j1 != 0)
            {
                kik.android.net.communicator.a.c(a, ab.a());
                if (obj != null)
                {
                    ((kik.android.net.communicator.k) (obj)).b();
                }
                l2 = System.currentTimeMillis();
                kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
            }
_L2:
            return;
            obj12;
            obj4;
            JVM INSTR monitorexit ;
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            throw obj12;
            obj;
            i1 = 1;
            obj = obj6;
_L40:
            kik.android.net.communicator.a.a(a, 4);
            if (i1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            obj2 = obj;
            if (i1 == 0) goto _L22; else goto _L25
_L25:
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj3 != null)
            {
                ((kik.android.net.communicator.k) (obj3)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
              goto _L23
_L15:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            kik.android.net.communicator.a.a(a, 3);
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            ((kik.android.net.communicator.k) (obj3)).b();
            kik.android.net.communicator.a.z(a).a();
            obj3 = null;
            obj4 = obj;
              goto _L20
_L17:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            l3 = System.currentTimeMillis() - ((kik.android.net.communicator.k) (obj3)).d();
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            l4 = System.currentTimeMillis();
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            l5 = ((kik.android.net.communicator.k) (obj3)).e();
            if (l3 <= 20000L && (l3 <= 3000L || l4 - l5 <= 8000L)) goto _L27; else goto _L26
_L26:
            obj4 = obj;
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            if (!kik.android.net.communicator.a.a(a, (c)e1.b)) goto _L20; else goto _L28
_L28:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            kik.android.net.communicator.a.a(a, 3);
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            ((kik.android.net.communicator.k) (obj3)).b();
            obj3 = null;
            obj4 = obj;
              goto _L20
_L27:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            obj4 = kik.android.net.communicator.a.x(a);
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            obj4;
            JVM INSTR monitorenter ;
            kik.android.net.communicator.a.A(a).schedule(a. new d((c)e1.b), 3000L);
            obj4;
            JVM INSTR monitorexit ;
            obj4 = obj;
              goto _L20
            obj12;
            obj4;
            JVM INSTR monitorexit ;
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            throw obj12;
            obj4;
            j1 = 1;
            obj = obj7;
            obj6 = obj3;
            obj3 = obj4;
_L39:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            (new StringBuilder("Connection Redirected to ")).append(((kik.a.f.f) (obj3)).a()).append(":").append(((kik.a.f.f) (obj3)).b());
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            kik.android.net.communicator.a.b(a, ((kik.a.f.f) (obj3)).a());
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            kik.android.net.communicator.a.b(a, ((kik.a.f.f) (obj3)).b());
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            kik.android.net.communicator.a.b(a, System.currentTimeMillis() + (long)(((kik.a.f.f) (obj3)).c() * 1000));
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            kik.android.net.communicator.a.a(a, ((kik.a.f.f) (obj3)).d());
            kik.android.net.communicator.a.a(a, 4);
            if (j1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            obj2 = obj;
            if (j1 == 0) goto _L22; else goto _L29
_L29:
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj6 != null)
            {
                ((kik.android.net.communicator.k) (obj6)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
              goto _L23
_L18:
            obj5 = obj;
            obj6 = obj;
            obj7 = obj;
            obj8 = obj;
            obj9 = obj;
            obj10 = obj;
            obj11 = obj;
            ((kik.android.net.communicator.k) (obj3)).a((g)e1.b);
            obj4 = obj;
              goto _L20
            obj4;
            j1 = 1;
            obj = obj8;
            obj6 = obj3;
            obj3 = obj4;
_L38:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            ((kik.a.e.f.b) (obj2)).a(((kik.a.f.b) (obj3)).a());
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            ((kik.a.f.b) (obj3)).printStackTrace();
            kik.android.net.communicator.a.a(a, 4);
            if (j1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            obj2 = obj;
            if (j1 == 0) goto _L22; else goto _L30
_L30:
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj6 != null)
            {
                ((kik.android.net.communicator.k) (obj6)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
              goto _L23
_L11:
            kik.android.net.communicator.a.a(a, 4);
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj3 != null)
            {
                ((kik.android.net.communicator.k) (obj3)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
            obj = obj12;
              goto _L23
            obj2;
            obj;
            JVM INSTR monitorexit ;
            throw obj2;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj4;
            l2 = 0L;
            obj6 = obj13;
            j1 = ((flag4) ? 1 : 0);
            obj2 = obj3;
            obj3 = obj4;
_L37:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            ((kik.a.f.d) (obj3)).printStackTrace();
            kik.android.net.communicator.a.a(a, 4);
            if (j1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            obj2 = obj;
            if (j1 == 0) goto _L22; else goto _L31
_L31:
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj6 != null)
            {
                ((kik.android.net.communicator.k) (obj6)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
              goto _L23
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj3;
            l2 = 0L;
            obj6 = obj14;
            j1 = ((flag5) ? 1 : 0);
            obj2 = obj7;
_L36:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            ((kik.a.f.c) (obj3)).printStackTrace();
            kik.android.net.communicator.a.a(a, 4);
            if (j1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            obj2 = obj;
            if (j1 == 0) goto _L22; else goto _L32
_L32:
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj6 != null)
            {
                ((kik.android.net.communicator.k) (obj6)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
              goto _L23
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj3;
            l2 = 0L;
            obj6 = obj15;
            j1 = ((flag6) ? 1 : 0);
            obj2 = obj8;
_L35:
            obj5 = obj2;
            l4 = l1;
            l3 = l2;
            i1 = j1;
            obj4 = obj6;
            ((InterruptedException) (obj3)).printStackTrace();
            kik.android.net.communicator.a.a(a, 4);
            if (j1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            obj2 = obj;
            if (j1 == 0) goto _L22; else goto _L33
_L33:
            kik.android.net.communicator.a.c(a, ab.a());
            if (obj6 != null)
            {
                ((kik.android.net.communicator.k) (obj6)).b();
            }
            l2 = System.currentTimeMillis();
            kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
              goto _L23
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            l2 = 0L;
            obj4 = obj19;
            i1 = ((flag7) ? 1 : 0);
            obj2 = obj9;
_L34:
            kik.android.net.communicator.a.a(a, 4);
            if (i1 == 0)
            {
                kik.android.net.communicator.a.C(a);
                if (obj2 != null)
                {
                    ((kik.a.e.f.b) (obj2)).a(System.currentTimeMillis() - l2);
                }
            }
            a1.e();
            synchronized (kik.android.net.communicator.a.x(a))
            {
                if (kik.android.net.communicator.a.y(a) != null)
                {
                    kik.android.net.communicator.a.y(a).e();
                    kik.android.net.communicator.a.D(a);
                }
            }
            if (!kik.android.net.communicator.a.p(a))
            {
                kik.android.net.communicator.a.w(a).a();
                kik.android.net.communicator.a.r(a).clear();
            }
            if (i1 != 0)
            {
                kik.android.net.communicator.a.c(a, ab.a());
                if (obj4 != null)
                {
                    ((kik.android.net.communicator.k) (obj4)).b();
                }
                l2 = System.currentTimeMillis();
                kik.android.net.communicator.a.E(a).a(Long.valueOf(l2 - l1));
            }
            throw obj;
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
_L22:
            obj = obj2;
              goto _L23
            obj;
            obj2 = obj5;
            l1 = l4;
            l2 = l3;
              goto _L34
            obj;
            i1 = ((flag7) ? 1 : 0);
            obj4 = obj3;
              goto _L34
            obj;
            i1 = 1;
            obj4 = obj3;
              goto _L34
            obj;
            i1 = 1;
            obj4 = obj3;
              goto _L34
            obj;
            i1 = 1;
            obj4 = null;
              goto _L34
            obj;
            obj4 = obj3;
              goto _L34
            obj3;
            l2 = 0L;
            j1 = ((flag6) ? 1 : 0);
            obj6 = obj15;
              goto _L35
            obj3;
            j1 = ((flag6) ? 1 : 0);
            obj6 = obj15;
              goto _L35
            obj4;
            obj6 = obj3;
            obj3 = obj4;
            j1 = ((flag6) ? 1 : 0);
              goto _L35
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj3 = obj4;
              goto _L35
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj = obj9;
            obj3 = obj4;
              goto _L35
            obj3;
            j1 = 1;
            obj6 = null;
              goto _L35
            obj3;
            l2 = 0L;
            j1 = ((flag5) ? 1 : 0);
            obj6 = obj14;
              goto _L36
            obj3;
            j1 = ((flag5) ? 1 : 0);
            obj6 = obj14;
              goto _L36
            obj4;
            obj6 = obj3;
            obj3 = obj4;
            j1 = ((flag5) ? 1 : 0);
              goto _L36
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj3 = obj4;
              goto _L36
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj = obj10;
            obj3 = obj4;
              goto _L36
            obj3;
            j1 = 1;
            obj6 = null;
              goto _L36
            obj3;
            l2 = 0L;
            j1 = ((flag4) ? 1 : 0);
            obj6 = obj13;
              goto _L37
            obj3;
            j1 = ((flag4) ? 1 : 0);
            obj6 = obj13;
              goto _L37
            obj4;
            obj6 = obj3;
            obj3 = obj4;
            j1 = ((flag4) ? 1 : 0);
              goto _L37
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj3 = obj4;
              goto _L37
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj = obj11;
            obj3 = obj4;
              goto _L37
            obj3;
            j1 = 1;
            obj6 = null;
              goto _L37
            obj3;
            l2 = 0L;
            obj2 = obj4;
            j1 = ((flag3) ? 1 : 0);
            obj6 = e1;
              goto _L38
            obj3;
            l2 = 0L;
            j1 = ((flag3) ? 1 : 0);
            obj6 = e1;
              goto _L38
            obj3;
            j1 = ((flag3) ? 1 : 0);
            obj6 = e1;
              goto _L38
            obj4;
            obj6 = obj3;
            obj3 = obj4;
            j1 = ((flag3) ? 1 : 0);
              goto _L38
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj3 = obj4;
              goto _L38
            obj3;
            j1 = 1;
            obj6 = null;
              goto _L38
            obj3;
            l2 = 0L;
            obj2 = obj5;
            j1 = ((flag2) ? 1 : 0);
            obj6 = obj12;
              goto _L39
            obj3;
            l2 = 0L;
            j1 = ((flag2) ? 1 : 0);
            obj6 = obj12;
              goto _L39
            obj3;
            j1 = ((flag2) ? 1 : 0);
            obj6 = obj12;
              goto _L39
            obj4;
            obj6 = obj3;
            obj3 = obj4;
            j1 = ((flag2) ? 1 : 0);
              goto _L39
            obj4;
            j1 = 1;
            obj6 = obj3;
            obj3 = obj4;
              goto _L39
            obj3;
            j1 = 1;
            obj6 = null;
              goto _L39
            obj2;
            l2 = 0L;
            obj2 = obj10;
            i1 = ((flag1) ? 1 : 0);
            obj3 = obj16;
              goto _L40
            obj3;
            l2 = 0L;
            i1 = ((flag1) ? 1 : 0);
            obj3 = obj16;
              goto _L40
            obj3;
            i1 = ((flag1) ? 1 : 0);
            obj3 = obj16;
              goto _L40
            obj4;
            i1 = ((flag1) ? 1 : 0);
              goto _L40
            obj4;
            i1 = 1;
              goto _L40
            obj3;
            i1 = 1;
            obj3 = null;
              goto _L40
            obj;
            l2 = 0L;
            obj2 = obj11;
            j1 = ((flag) ? 1 : 0);
            obj = obj17;
              goto _L41
            obj;
            j1 = ((flag) ? 1 : 0);
            obj = obj17;
              goto _L41
            obj;
            obj = obj3;
            j1 = ((flag) ? 1 : 0);
              goto _L41
            obj;
            j1 = 1;
            obj = obj3;
              goto _L41
            obj;
            j1 = 1;
            obj = null;
              goto _L41
            IOException ioexception;
            ioexception;
            l2 = 0L;
            obj3 = null;
            l1 = 0L;
            i1 = 0;
            ioexception = ((IOException) (obj6));
              goto _L42
            obj3;
            l2 = 0L;
            i1 = 0;
            obj3 = null;
            l1 = 0L;
              goto _L42
            obj3;
            l1 = 0L;
            i1 = 0;
            obj3 = null;
              goto _L42
            obj4;
            l1 = 0L;
            i1 = 0;
              goto _L42
            obj4;
            i1 = 1;
              goto _L42
            obj3;
            obj3 = null;
            i1 = 1;
              goto _L42
_L6:
            j1 = k1;
            obj6 = obj7;
            obj7 = obj3;
              goto _L43
_L13:
            obj4 = obj;
              goto _L20
        }

        private b()
        {
            a = kik.android.net.communicator.a.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c
    {

        final kik.a.e.f.c a;
        final long b;
        final kik.android.net.communicator.a c;
        private volatile boolean d;
        private long e;
        private com.kik.g.ar f;

        public final void a()
        {
            e = System.currentTimeMillis();
        }

        public final void b()
        {
            if (!d)
            {
                kik.a.e.f.c c1 = a;
                System.currentTimeMillis();
                c1.a();
                d = true;
                f.c();
            }
        }

        public final boolean c()
        {
            return d;
        }

        public final boolean d()
        {
            if (!d)
            {
                kik.a.e.f.c c1 = a;
                System.currentTimeMillis();
                c1.b();
                d = true;
                f.c();
                return true;
            } else
            {
                return false;
            }
        }

        public final void e()
        {
            if (!d)
            {
                kik.android.net.communicator.a.y(c).d = true;
                kik.android.net.communicator.a.y(c);
                f.c();
            }
        }

        c(kik.a.e.f.c c1, long l1, com.kik.g.ar ar1)
        {
            c = kik.android.net.communicator.a.this;
            super();
            d = false;
            a = c1;
            b = l1;
            f = ar1;
        }
    }

    private final class d extends TimerTask
    {

        final kik.android.net.communicator.a a;
        private c b;

        public final void run()
        {
            try
            {
                if (b.c())
                {
                    return;
                }
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
            kik.android.net.communicator.a.r(a).put(a. new e(4, b));
            return;
        }

        public d(c c1)
        {
            a = kik.android.net.communicator.a.this;
            super();
            b = c1;
        }
    }

    private final class e
    {

        public final int a;
        public final Object b;
        final kik.android.net.communicator.a c;

        public e(int i1)
        {
            this(i1, null);
        }

        public e(int i1, Object obj)
        {
            c = kik.android.net.communicator.a.this;
            super();
            a = i1;
            b = obj;
        }
    }


    private static final org.c.b e = org.c.c.a("AndroidCommunicator");
    private y A;
    private String B;
    private String C;
    private String D;
    private String E;
    private PowerManager F;
    private long G;
    private long H;
    private boolean I;
    private volatile String J;
    private volatile boolean K;
    private volatile long L;
    private volatile String M;
    private volatile int N;
    private volatile kik.a.f.g.c O;
    protected com.kik.android.a a;
    protected kik.a.ab b;
    private k c;
    private k d;
    private k f;
    private k g;
    private k h;
    private o i;
    private kik.a.f.k j;
    private com.kik.android.b.a k;
    private com.kik.android.b.a l;
    private BlockingQueue m;
    private BlockingQueue n;
    private Context o;
    private kik.android.d.c p;
    private ArrayList q;
    private kik.a.f.b.a r;
    private kik.a.f.a.c s;
    private volatile int t;
    private volatile boolean u;
    private volatile long v;
    private volatile int w;
    private final Object x = new Object();
    private volatile c y;
    private final Timer z = new Timer("AndroidCommunicatorTimer");

    public kik.android.net.communicator.a(Context context, String s1, y y1, ar ar)
    {
        c = new k(this);
        q = new ArrayList();
        r = new kik.a.f.b.a();
        s = new kik.a.f.a.c();
        t = 4;
        u = false;
        v = 0L;
        w = 0;
        y = null;
        G = ab.a();
        I = false;
        K = false;
        L = 0L;
        M = null;
        N = 5222;
        O = null;
        context.getSystemService("power");
        D = s1;
        k = new com.kik.android.b.a(context, "ping", (byte)0);
        l = new com.kik.android.b.a(context, "read", (byte)0);
        m = new ArrayBlockingQueue(1);
        n = new ArrayBlockingQueue(128);
        o = context;
        F = (PowerManager)context.getSystemService("power");
        A = y1;
        p = kik.android.d.d.a(o);
        p.a(new kik.android.d.a(o, "use-wrong-socket-port", false, null, ar));
    }

    static Timer A(kik.android.net.communicator.a a1)
    {
        return a1.z;
    }

    static k B(kik.android.net.communicator.a a1)
    {
        return a1.g;
    }

    static int C(kik.android.net.communicator.a a1)
    {
        int i1 = a1.w;
        a1.w = i1 + 1;
        return i1;
    }

    static c D(kik.android.net.communicator.a a1)
    {
        a1.y = null;
        return null;
    }

    static k E(kik.android.net.communicator.a a1)
    {
        return a1.f;
    }

    static o F(kik.android.net.communicator.a a1)
    {
        return a1.i;
    }

    static ArrayList G(kik.android.net.communicator.a a1)
    {
        return a1.q;
    }

    static int a(kik.android.net.communicator.a a1, int i1)
    {
        a1.t = i1;
        return i1;
    }

    static long a(kik.android.net.communicator.a a1, long l1)
    {
        a1.H = l1;
        return l1;
    }

    static String a(kik.android.net.communicator.a a1, String s1)
    {
        a1.E = s1;
        return s1;
    }

    static kik.a.f.g.c a(kik.android.net.communicator.a a1, kik.a.f.g.c c1)
    {
        a1.O = c1;
        return c1;
    }

    static kik.a.f.k a(kik.android.net.communicator.a a1)
    {
        return a1.j;
    }

    private boolean a(c c1)
    {
        boolean flag = true;
        Object obj = x;
        obj;
        JVM INSTR monitorenter ;
        if (!c1.d() || t != 1 || c1.b != v)
        {
            flag = false;
        }
        if (y == c1)
        {
            y = null;
        }
        return flag;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    static boolean a(kik.android.net.communicator.a a1, c c1)
    {
        return a1.a(c1);
    }

    static boolean a(kik.android.net.communicator.a a1, boolean flag)
    {
        a1.I = flag;
        return flag;
    }

    static int b(kik.android.net.communicator.a a1, int i1)
    {
        a1.N = i1;
        return i1;
    }

    static long b(kik.android.net.communicator.a a1, long l1)
    {
        a1.L = l1;
        return l1;
    }

    static String b(kik.android.net.communicator.a a1, String s1)
    {
        a1.M = s1;
        return s1;
    }

    static boolean b(kik.android.net.communicator.a a1)
    {
        return a1.K;
    }

    static long c(kik.android.net.communicator.a a1, long l1)
    {
        a1.G = l1;
        return l1;
    }

    static kik.android.d.c c(kik.android.net.communicator.a a1)
    {
        return a1.p;
    }

    static long d(kik.android.net.communicator.a a1)
    {
        return a1.L;
    }

    static String e(kik.android.net.communicator.a a1)
    {
        return a1.M;
    }

    static int f(kik.android.net.communicator.a a1)
    {
        return a1.N;
    }

    static kik.a.f.g.c g(kik.android.net.communicator.a a1)
    {
        return a1.O;
    }

    static com.kik.android.b.a h(kik.android.net.communicator.a a1)
    {
        return a1.l;
    }

    static String i(kik.android.net.communicator.a a1)
    {
        return a1.D;
    }

    static String j(kik.android.net.communicator.a a1)
    {
        return a1.B;
    }

    static String k(kik.android.net.communicator.a a1)
    {
        return a1.C;
    }

    static String l(kik.android.net.communicator.a a1)
    {
        return a1.J;
    }

    static int m(kik.android.net.communicator.a a1)
    {
        return a1.w;
    }

    static y n(kik.android.net.communicator.a a1)
    {
        return a1.A;
    }

    static Context o(kik.android.net.communicator.a a1)
    {
        return a1.o;
    }

    static boolean p(kik.android.net.communicator.a a1)
    {
        return a1.u;
    }

    static BlockingQueue q(kik.android.net.communicator.a a1)
    {
        return a1.m;
    }

    static BlockingQueue r(kik.android.net.communicator.a a1)
    {
        return a1.n;
    }

    static boolean s(kik.android.net.communicator.a a1)
    {
        return a1.I;
    }

    static long t(kik.android.net.communicator.a a1)
    {
        long l1 = a1.v;
        a1.v = 1L + l1;
        return l1;
    }

    static k u(kik.android.net.communicator.a a1)
    {
        return a1.c;
    }

    static int v(kik.android.net.communicator.a a1)
    {
        a1.w = 0;
        return 0;
    }

    static kik.a.f.b.a w(kik.android.net.communicator.a a1)
    {
        return a1.r;
    }

    static Object x(kik.android.net.communicator.a a1)
    {
        return a1.x;
    }

    static c y(kik.android.net.communicator.a a1)
    {
        return a1.y;
    }

    static kik.a.f.a.c z(kik.android.net.communicator.a a1)
    {
        return a1.s;
    }

    public final com.kik.g.e a()
    {
        return d.a();
    }

    public final p a(z z1)
    {
        return a(z1, false);
    }

    public final p a(z z1, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1;
        if (B != null && C != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            flag2 = true;
        }
        if (flag2 ^ (z1 instanceof w))
        {
            (new StringBuilder("Trying to send stanza from wrong auth state: ")).append(z1.toString());
            z1.c(102);
            return com.kik.g.s.a(new kik.a.f.a(""));
        }
        r.a(z1);
        if (t == 1)
        {
            n.add(new e(1));
        }
        if (!flag)
        {
            d.a(null);
        }
        return z1.j();
    }

    public final void a(com.kik.android.a a1)
    {
        a = a1;
    }

    public final void a(String s1, kik.a.e.f.b b1, boolean flag)
    {
        if (t != 4)
        {
            throw new kik.a.e.f.a((new StringBuilder("State was ")).append(t).toString());
        }
        J = s1;
        K = flag;
        if (!m.offer(b1))
        {
            throw new kik.a.e.f.a("Already have connection enqueued");
        } else
        {
            return;
        }
    }

    public final void a(ExecutorService executorservice, kik.a.f.k k1, o o1)
    {
        h = new com.kik.g.a(this, executorservice);
        f = new com.kik.g.a(this, executorservice);
        g = new com.kik.g.a(this, executorservice);
        j = k1;
        i = o1;
        d = new com.kik.g.a(this, executorservice);
        (new Thread(new b((byte)0), "CommOutput")).start();
    }

    public final void a(kik.a.ab ab1)
    {
        b = ab1;
    }

    public final void a(kik.a.e.f.c c1)
    {
        if (t != 1)
        {
            throw new kik.a.e.f.a((new StringBuilder("State was ")).append(t).toString());
        }
        synchronized (x)
        {
            if (y == null)
            {
                y = new c(c1, v, k.a(15000L));
                z.schedule(new d(y), 8000L);
                n.add(new e(3));
            }
        }
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final void a(i i1)
    {
        q.add(i1);
    }

    public final void a(kik.a.z z1)
    {
        B = z1.a().c();
        C = z1.b();
        if (t == 1 || t == 2)
        {
            n.add(new e(2));
        }
    }

    public final boolean a(String s1)
    {
        return r.a(s1);
    }

    public final com.kik.g.e b()
    {
        return c.a();
    }

    public final void b(i i1)
    {
        q.remove(i1);
    }

    public final com.kik.g.e c()
    {
        return f.a();
    }

    public final com.kik.g.e d()
    {
        return g.a();
    }

    public final com.kik.g.e e()
    {
        return h.a();
    }

    public final void f()
    {
        h.a(null);
    }

    public final long g()
    {
        return G;
    }

    public final long h()
    {
        return H;
    }

    public final String i()
    {
        return E;
    }

    public final long j()
    {
        return ab.a();
    }

    public final boolean k()
    {
        return t == 1;
    }

    public final int l()
    {
        return t;
    }

    public final boolean m()
    {
        return B != null && C != null;
    }

    public final void n()
    {
        n.add(new e(2));
        u = true;
    }

    public final void o()
    {
        d.a(null);
    }

}
