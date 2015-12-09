// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.d.a.c;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.p;
import com.nuance.a.a.a.c.a.a.b.b;
import com.nuance.a.a.a.c.a.c.e;
import com.nuance.a.a.a.c.a.c.f;
import com.nuance.a.a.a.c.a.c.i;
import com.nuance.a.a.a.c.a.c.j;
import com.nuance.a.a.a.c.a.c.k;
import com.nuance.a.a.a.c.c.h;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            r, c, e, i, 
//            j, n, q, f, 
//            u, h, d, b, 
//            g, p

public class a
    implements c, e
{

    private static final com.nuance.a.a.a.a.d.a.e g = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/a/a/a/a);
    protected byte a;
    private r h;
    private k i;
    private j j;
    private com.nuance.a.a.a.c.a.a.b.c k;
    private com.nuance.a.a.a.c.b.c.c l;
    private short m;
    private com.nuance.a.a.a.a.d.a.a n;
    private p o;
    private long p;
    private boolean q;
    private String r;
    private boolean s;
    private com.nuance.a.a.a.c.a.a.a.c t;
    private Object u;

    protected a(com.nuance.a.a.a.a.d.a.a a1, j j1, String s1, String s2, com.nuance.a.a.a.c.a.a.b.c c1, String s3, String s4, 
            String s5, String s6, String s7, String s8, String s9, com.nuance.a.a.a.a.b.b b1, String s10, 
            String s11, String s12, String s13, String s14, long l1, com.nuance.a.a.a.c.b.b.a a2, 
            r r1, k k1, byte byte0)
    {
        j = null;
        k = null;
        m = -1;
        s = false;
        g.b();
        u = new Object();
        n = a1;
        k = c1;
        j = j1;
        p = l1;
        h = r1;
        i = k1;
        a = byte0;
        r = s1;
        q = false;
        if (((b)r1.i()).b() != null)
        {
            t = new com.nuance.a.a.a.c.a.a.a.c(a, this);
            b(t, "INTERNAL_ERROR");
        }
        synchronized (u)
        {
            m = 0;
        }
        j1 = ((j) (new Object[19]));
        j1[0] = s3;
        j1[1] = s4;
        j1[2] = s5;
        j1[3] = s6;
        j1[4] = s7;
        j1[5] = s8;
        j1[6] = s9;
        j1[7] = b1;
        j1[8] = s10;
        j1[9] = new Short((short)1);
        j1[10] = new Short((short)1);
        j1[11] = s11;
        j1[12] = s12;
        j1[13] = s13;
        j1[14] = s14;
        j1[15] = s2;
        j1[16] = s1;
        j1[17] = a2;
        a1.a(new com.nuance.a.a.a.a.d.a.b((byte)1, j1), this, Thread.currentThread(), a1.a()[0]);
    }

    static Object a(a a1)
    {
        return a1.u;
    }

    static void a(a a1, com.nuance.a.a.a.c.a.a.a.c c1)
    {
        for (a1 = (Vector)((b)a1.h.i()).b(); a1 == null || a1.contains(c1);)
        {
            return;
        }

        a1.addElement(c1);
    }

    static void a(a a1, String s1)
    {
        a1.a(s1);
    }

    static void a(com.nuance.a.a.a.c.a.a.a.c c1, String s1)
    {
        b(c1, s1);
    }

    private void a(String s1)
    {
        if (l != null)
        {
            l.b(s1).a();
        }
    }

    private void a(String s1, boolean flag)
    {
        com.nuance.a.a.a.c.b.c.a a1;
        com.nuance.a.a.a.c.b.c.a a2;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        a2 = l.b("NMASResponse");
        a1 = a2;
        com.nuance.a.a.a.c.b.c.a a3 = a2.a("ResultType", s1);
        a2 = a3;
        a1 = a3;
        if (s1.compareTo("QUERY_RESULT") == 0)
        {
            a1 = a3;
            try
            {
                a2 = a3.a("IsFinal", flag);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                a2 = a1;
            }
        }
        a2.a();
    }

    private static String b(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i1 = 0;
        while (i1 < abyte0.length) 
        {
            String s1 = Integer.toHexString(abyte0[i1]);
            if (s1.length() > 1)
            {
                stringbuffer.append(s1.substring(s1.length() - 2));
            } else
            {
                stringbuffer.append(s1);
            }
            if (i1 == 3 || i1 == 5 || i1 == 7 || i1 == 9)
            {
                stringbuffer.append('-');
            }
            i1++;
        }
        return stringbuffer.toString();
    }

    static short b(a a1)
    {
        a1.m = -1;
        return -1;
    }

    private static void b(com.nuance.a.a.a.c.a.a.a.c c1, String s1)
    {
        if (c1 != null)
        {
            com.nuance.a.a.a.c.a.a.a.c.a(c1, s1);
        }
    }

    static j c(a a1)
    {
        return a1.j;
    }

    static com.nuance.a.a.a.c.a.a.a.c d(a a1)
    {
        return a1.t;
    }

    static com.nuance.a.a.a.c.a.a.b.c e(a a1)
    {
        return a1.k;
    }

    static com.nuance.a.a.a.a.d.a.e g()
    {
        return g;
    }

    public final void a()
    {
label0:
        {
            g.b();
            synchronized (u)
            {
                if (m == -1)
                {
                    g.b("PDXTransactionImpl.end() transaction already finished!");
                    throw new com.nuance.a.a.a.c.c.a("transaction already finished!");
                }
                break label0;
            }
        }
        if (m != 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        m = 1;
        n.a(new com.nuance.a.a.a.a.d.a.b((byte)4, null), this, Thread.currentThread(), n.a()[0]);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (m == 1)
        {
            g.b("PDXTransactionImpl.end() transaction already finished!");
            throw new com.nuance.a.a.a.c.c.a("transaction already finished!");
        }
        if (m == 2)
        {
            g.b("PDXTransactionImpl.end() transaction already expired!");
            throw new h("transaction already expired!");
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(com.nuance.a.a.a.c.a.a.a.e e1, byte byte0)
    {
label0:
        {
            g.b();
            if (byte0 != a)
            {
                return;
            }
            synchronized (u)
            {
                if (m != -1 && m != 2)
                {
                    break label0;
                }
            }
            return;
        }
        q = true;
        a("QUERY_RESULT", e1.a());
        if (!e1.a()) goto _L2; else goto _L1
_L1:
        if (o != null)
        {
            n.a(o);
        }
_L3:
        j j1 = j;
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (e1.a())
        {
            b(t, "FINAL_RESULT");
        }
        j.a(e1);
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        f();
          goto _L3
        e1;
        g.b((new StringBuilder("got exp in PDXCommandListener.PDXQueryResultReturned() [")).append(e1.getClass().getName()).append("] msg [").append(e1.getMessage()).append("]").toString());
          goto _L4
    }

    public final void a(g g1, byte byte0)
    {
label0:
        {
            if (byte0 != a)
            {
                return;
            }
            synchronized (u)
            {
                if (m != -1 && m != 2)
                {
                    break label0;
                }
            }
            return;
        }
        j j1;
        m = -1;
        a("QUERY_ERROR", true);
        if (o != null)
        {
            n.a(o);
        }
        j1 = j;
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        b(t, "QUERY_ERROR");
        j.a(g1);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        g1;
        g.b((new StringBuilder("got exp in PDXCommandListener.PDXQueryErrorReturned() [")).append(g1.getClass().getName()).append("] msg [").append(g1.getMessage()).append("]").toString());
          goto _L1
    }

    public final void a(com.nuance.a.a.a.c.a.a.a.p p1, byte byte0)
    {
label0:
        {
            if (byte0 != a)
            {
                return;
            }
            synchronized (u)
            {
                if (m != -1 && m != 2)
                {
                    break label0;
                }
            }
            return;
        }
        j j1;
        m = -1;
        a("QUERY_RETRY", true);
        if (o != null)
        {
            n.a(o);
        }
        j1 = j;
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        b(t, "QUERY_RETRY");
        j.a(p1);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        p1;
        g.b((new StringBuilder("got exp in PDXCommandListener.PDXQueryRetryReturned() [")).append(p1.getClass().getName()).append("] msg [").append(p1.getMessage()).append("]").toString());
          goto _L1
    }

    public final void a(i i1)
    {
label0:
        {
            g.b();
            if (i1 == null)
            {
                throw new NullPointerException("Parameter cannot be null");
            }
            synchronized (u)
            {
                if (m == -1)
                {
                    g.b("PDXTransactionImpl.sendParam() transaction already finished!");
                    throw new com.nuance.a.a.a.c.c.a("transaction already finished!");
                }
                break label0;
            }
        }
        if (m != 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        n.a(new com.nuance.a.a.a.a.d.a.b((byte)2, i1), this, Thread.currentThread(), n.a()[0]);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (m == 1)
        {
            g.b("PDXTransactionImpl.sendParam() transaction already finished!");
            throw new com.nuance.a.a.a.c.c.a("transaction already finished!");
        }
        if (m == 2)
        {
            g.b("PDXTransactionImpl.sendParam() transaction already expired!");
            throw new h("transaction already expired!");
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (com.nuance.a.a.a.a.d.a.b)obj;
        obj1 = ((com.nuance.a.a.a.a.d.a.b) (obj)).b;
        ((com.nuance.a.a.a.a.d.a.b) (obj)).a;
        JVM INSTR tableswitch 1 6: default 52
    //                   1 53
    //                   2 778
    //                   3 937
    //                   4 984
    //                   5 1054
    //                   6 1065;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        obj = ((Object) ((Object[])obj1));
        Object obj2 = (String)obj[0];
        Object obj3 = (String)obj[1];
        Object obj4 = (String)obj[2];
        Object obj5 = (String)obj[3];
        String s1 = (String)obj[4];
        String s2 = (String)obj[5];
        String s3 = (String)obj[6];
        obj1 = (com.nuance.a.a.a.a.b.b)obj[7];
        String s4 = (String)obj[8];
        short word0 = ((Short)obj[9]).shortValue();
        short word1 = ((Short)obj[10]).shortValue();
        String s5 = (String)obj[11];
        String s6 = (String)obj[12];
        String s7 = (String)obj[13];
        String s8 = (String)obj[14];
        byte abyte0[] = k.d();
        String s9 = (String)obj[15];
        String s10 = (String)obj[16];
        com.nuance.a.a.a.c.b.b.a a2 = (com.nuance.a.a.a.c.b.b.a)obj[17];
        obj = obj1;
        if ((new com.nuance.a.a.a.b.c(h.d)).a())
        {
            obj = com.nuance.a.a.a.a.c.e.c(((com.nuance.a.a.a.a.b.b) (obj1)));
        }
        com.nuance.a.a.a.c.a.a.b.a.j();
        obj1 = k.h();
        if (obj1 != null)
        {
            obj1 = ((com.nuance.a.a.a.c.b.c.c) (obj1)).b("NMASCommand");
            com.nuance.a.a.a.c.b.c.a a1;
            int i1;
            int j1;
            try
            {
                l = ((com.nuance.a.a.a.c.b.c.a) (obj1)).a("Name", r).a("Tid", (new Integer(a)).toString()).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj = new com.nuance.a.a.a.c.a.a.a.i(((String) (obj2)), ((String) (obj3)), ((String) (obj4)), ((String) (obj5)), s1, s2, s3, ((com.nuance.a.a.a.a.b.b) (obj)), s4, word0, word1, s5, s6, s7, s8, abyte0, s9, s10, a2);
        obj1 = (Vector)((b)h.i()).b();
        if (obj1 != null && ((Vector) (obj1)).size() != 0)
        {
            j1 = ((Vector) (obj1)).size();
            obj2 = new com.nuance.a.a.a.c.b.a.b.h();
            obj3 = new com.nuance.a.a.a.c.b.a.b.b();
            for (i1 = 0; i1 < j1; i1++)
            {
                obj4 = (com.nuance.a.a.a.c.a.a.a.c)((Vector) (obj1)).elementAt(i1);
                if (((com.nuance.a.a.a.c.a.a.a.c) (obj4)).a() != a)
                {
                    obj5 = new com.nuance.a.a.a.c.b.a.b.h();
                    ((com.nuance.a.a.a.c.b.a.b.h) (obj5)).a("id", (new StringBuilder()).append(((com.nuance.a.a.a.c.a.a.a.c) (obj4)).b()).append(":").append(((com.nuance.a.a.a.c.a.a.a.c) (obj4)).a()).toString(), (short)193);
                    ((com.nuance.a.a.a.c.b.a.b.h) (obj5)).a("status", ((com.nuance.a.a.a.c.a.a.a.c) (obj4)).c().toString(), (short)193);
                    ((com.nuance.a.a.a.c.b.a.b.b) (obj3)).a(((com.nuance.a.a.a.c.b.b.a) (obj5)));
                    ((com.nuance.a.a.a.c.a.a.a.c) (obj4)).d();
                }
            }

            ((com.nuance.a.a.a.c.b.a.b.h) (obj2)).a("device_log", ((com.nuance.a.a.a.c.b.b.b) (obj3)));
            ((com.nuance.a.a.a.c.a.a.a.i) (obj)).a("app_info", ((com.nuance.a.a.a.c.b.b.a) (obj2)));
        }
        k.a((short)2597, (new StringBuilder("SEND_BCP_BEGIN")).append(a).toString(), ((com.nuance.a.a.a.c.a.a.a.i) (obj)).d(), null, a, 0L, h, false);
        if (abyte0 != null)
        {
            try
            {
                if (!s)
                {
                    s = true;
                    (new StringBuilder("PDXCommandCreated() called from handleInit()")).append(b(abyte0)).append(":").append(a).append(" (").append(this).append(",").append(i).append(")");
                    i.a((new StringBuilder()).append(b(abyte0)).append(":").append(a).toString());
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                g.b((new StringBuilder("got exp in PDXCommandListener.PDXCommandCreated() [")).append(obj.getClass().getName()).append("] msg [").append(((Throwable) (obj)).getMessage()).append("]").toString());
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj = (i)obj1;
        if (((com.nuance.a.a.a.c.a.a.a.j)obj).b() == 127)
        {
            k.a(((n)obj).c(), ((n)obj).e(), h);
        }
        com.nuance.a.a.a.c.a.a.b.a.j();
        if (obj instanceof q)
        {
            obj1 = ((q)obj).a();
            i1 = ((q)obj).c();
            if (l != null)
            {
                a1 = l.b("NMASAudioParameter");
                try
                {
                    a1.a("Name", ((String) (obj1))).a("AudioId", i1).a();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
        }
        obj = new com.nuance.a.a.a.c.a.a.a.f((com.nuance.a.a.a.c.a.a.a.j)obj);
        k.a((short)2585, "SEND_BCP_DATA", ((com.nuance.a.a.a.c.a.a.a.f) (obj)).e(), null, a, 0L, h, false);
        return;
_L4:
        obj = (byte[])obj1;
        com.nuance.a.a.a.c.a.a.b.a.j();
        obj = new u(((byte []) (obj)));
        k.a((short)2585, "SEND_BCP_DATA", ((u) (obj)).e(), null, a, 0L, h, false);
        return;
_L5:
        com.nuance.a.a.a.c.a.a.b.a.j();
        obj = new com.nuance.a.a.a.c.a.a.a.h();
        k.a((short)2585, "SEND_BCP_DATA", ((com.nuance.a.a.a.c.a.a.a.h) (obj)).e(), null, a, 0L, h, false);
        o = new com.nuance.a.a.a.c.a.a.a.d(this);
        n.a(o, p);
        return;
_L6:
        j.a((short)4);
        return;
_L7:
        obj = (f)obj1;
        obj1 = t;
        if (obj1 != null)
        {
            ((com.nuance.a.a.a.c.a.a.a.c) (obj1)).a(((f) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void a(short word0)
    {
label0:
        {
            g.b();
            synchronized (u)
            {
                if (m == 1 && o != null)
                {
                    n.a(o);
                }
                if (m != 2)
                {
                    break label0;
                }
            }
            return;
        }
        if (word0 != 0) goto _L2; else goto _L1
_L1:
        if (m != -1)
        {
            b(t, "REMOTE_DISC");
            j.a((short)3);
        }
_L4:
        m = 2;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (word0 != 1)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if (m == -1) goto _L4; else goto _L3
_L3:
        j.a((short)4);
          goto _L4
        Throwable throwable;
        throwable;
        g.b((new StringBuilder("got exp in PDXCommandListener.PDXCommandEvent() or PDXManagerListener.PDXManagerError() or PDXManagerListener.PDXManagerDisconnected() reasonCode [")).append(word0).append("] [").append(throwable.getClass().getName()).append("] msg [").append(throwable.getMessage()).append("]").toString());
          goto _L4
        if (word0 != 3)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        if (m == -1) goto _L4; else goto _L5
_L5:
        b(t, "TIMEOUT_IDLE");
        j.a((short)5);
          goto _L4
        if (word0 != 4)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (m == -1) goto _L4; else goto _L6
_L6:
        b(t, "CONN_FAILED");
        i.a();
          goto _L4
        if (word0 != 5)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        if (m == -1) goto _L4; else goto _L7
_L7:
        b(t, "CONN_FAILED");
        i.a();
          goto _L4
        if (word0 != 6)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        if (m == -1) goto _L4; else goto _L8
_L8:
        b(t, "REMOTE_DISC");
        j.a((short)3);
          goto _L4
        if (word0 != 7) goto _L10; else goto _L9
_L9:
        if (m == -1) goto _L4; else goto _L11
_L11:
        b(t, "CONN_FAILED");
        i.a();
          goto _L4
_L10:
        if (word0 != 8) goto _L4; else goto _L12
_L12:
        if (m == -1) goto _L4; else goto _L13
_L13:
        b(t, "REMOTE_DISC");
        j.a((short)3);
          goto _L4
    }

    public final void a(byte abyte0[])
    {
        g.b();
        Object obj = u;
        obj;
        JVM INSTR monitorenter ;
        short word0;
        if (m == 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        word0 = m;
        if (word0 != 1)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        com.nuance.a.a.a.c.a.a.a.c c1;
        abyte0 = b(abyte0);
        c1 = t;
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        c1.a(abyte0);
        if (!s)
        {
            s = true;
            (new StringBuilder("PDXCommandCreated() called from onSessionConnected()")).append(abyte0).append(":").append(a).append(" (").append(this).append(",").append(i).append(")");
            i.a((new StringBuilder()).append(abyte0).append(":").append(a).toString());
        }
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        g.b((new StringBuilder("got exp in PDXCommandListener.PDXCommandCreated() [")).append(abyte0.getClass().getName()).append("] msg [").append(abyte0.getMessage()).append("]").toString());
          goto _L1
        abyte0;
        throw abyte0;
    }

    public final void b()
    {
        f();
    }

    public final void c()
    {
        f();
    }

    public final void d()
    {
        f();
    }

    public final void e()
    {
label0:
        {
            synchronized (u)
            {
                if (m == 1 && o != null)
                {
                    n.a(o);
                }
                if (m != 2)
                {
                    break label0;
                }
            }
            return;
        }
        if (m != -1)
        {
            if (!q)
            {
                a("CommandAbort");
            }
            n.a(new com.nuance.a.a.a.a.d.a.b((byte)5, null), this, Thread.currentThread(), n.a()[0]);
        }
        m = 2;
        obj;
        JVM INSTR monitorexit ;
    }

    protected final void f()
    {
        if (o != null)
        {
            if (n.a(o))
            {
                o = new com.nuance.a.a.a.c.a.a.a.b(this);
            }
            n.a(o, p);
        }
    }

}
