// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.a.a.b.a;
import com.nuance.a.a.a.c.a.a.b.b;
import com.nuance.a.a.a.c.a.a.b.c;
import com.nuance.a.a.a.c.a.c.d;
import com.nuance.a.a.a.c.a.c.g;
import com.nuance.a.a.a.c.a.c.i;
import com.nuance.a.a.a.c.a.c.j;
import com.nuance.a.a.a.c.a.c.k;
import com.nuance.a.a.a.c.b.a.b.h;
import com.nuance.a.a.a.c.c.f;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            a, c, q, v, 
//            n, m, k, l, 
//            e, g, p

public class r extends a
    implements d
{

    private static final e l = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/a/a/a/r);
    private static String p;
    private com.nuance.a.a.a.a.d.a.a m;
    private k n;
    private com.nuance.a.a.a.c.a.a.a.a o;

    public r(b b1, k k1, Vector vector)
    {
        super(b1, k1, vector);
        n = k1;
        m = b1.d();
        a = b1.a();
        a.a(this);
        o = null;
        m.a(new com.nuance.a.a.a.a.d.a.b((byte)0, null), this, Thread.currentThread(), m.a()[0]);
    }

    private void a(byte byte0)
    {
        if (o != null && byte0 == o.a)
        {
            Vector vector = (Vector)((b)i()).b();
            if (vector != null && vector.size() > 0)
            {
                (new StringBuilder("clearResLogsToServer() before clean the log vector tranId[")).append(byte0).append("] log list size [").append(vector.size()).append("]");
                for (int i = 0; i < vector.size();)
                {
                    com.nuance.a.a.a.c.a.a.a.c c1 = (com.nuance.a.a.a.c.a.a.a.c)vector.elementAt(i);
                    if (c1.e())
                    {
                        vector.removeElement(c1);
                    } else
                    {
                        i++;
                    }
                }

                (new StringBuilder("clearResLogsToServer() after clean the log vector tranId[")).append(byte0).append("] log list size [").append(vector.size()).append("]");
                return;
            }
        }
    }

    public final long a()
    {
        return super.a();
    }

    public final com.nuance.a.a.a.c.a.c.e a(j j, String s, String s1, String s2, String s3, String s4, com.nuance.a.a.a.c.b.b.a a1, 
            long l1)
    {
        String s5;
label0:
        {
            String s6 = "";
            if (j == null)
            {
                s6 = (new StringBuilder()).append("").append("commandListener is invalid; ").toString();
            }
            if (s != null)
            {
                s5 = s6;
                if (!s.equals(""))
                {
                    break label0;
                }
            }
            s5 = (new StringBuilder()).append(s6).append("cmd should be non-null; ").toString();
        }
label1:
        {
            String s7 = s5;
            if (s1.equals(""))
            {
                s7 = (new StringBuilder()).append(s5).append("scriptVersion should be non-null; ").toString();
            }
            if (s2 != null)
            {
                s5 = s7;
                if (!s2.equals(""))
                {
                    break label1;
                }
            }
            s5 = (new StringBuilder()).append(s7).append("dictationLanguage should be non-null; ").toString();
        }
        String s8;
label2:
        {
            if (s4 != null)
            {
                s8 = s5;
                if (!s4.equals(""))
                {
                    break label2;
                }
            }
            s8 = (new StringBuilder()).append(s5).append("phoneModel should be non-null; ").toString();
        }
        s5 = s8;
        if (l1 <= 0L)
        {
            s5 = (new StringBuilder()).append(s8).append("commandTimeout is invalid; ").toString();
        }
        if (!s5.equals(""))
        {
            l.b((new StringBuilder("NMASResourceImpl.createCommand() ")).append(s5).toString());
            throw new IllegalArgumentException(s5);
        }
        synchronized (h)
        {
            if (o != null)
            {
                o.e();
            }
            a.b();
            if (g == 0)
            {
                m.a(new com.nuance.a.a.a.a.d.a.b((byte)0, null), this, Thread.currentThread(), m.a()[0]);
            }
            this.j = a.f();
            o = new com.nuance.a.a.a.c.a.a.a.a(m, j, s, ((b)f).a, a, ((b)f).g(), "1", "NMSP 5.2_2 client SDK - build 019", p, s1, "enus", "ne", ((b)f).h(), s2, s3, s4, ((b)f).g(), "", l1, a1, this, n, this.j);
            j = o;
        }
        return j;
    }

    public final g a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("name can not be null");
        } else
        {
            return new q(s, a, m);
        }
    }

    public final i a(String s, com.nuance.a.a.a.c.b.b.a a1)
    {
        if (s == null)
        {
            throw new NullPointerException("name can not be null");
        }
        if (a1 == null)
        {
            throw new NullPointerException("dict can not be null");
        } else
        {
            return new v(s, (h)a1);
        }
    }

    public final i a(String s, com.nuance.a.a.a.c.b.b.a a1, f f1)
    {
        if (s == null)
        {
            throw new NullPointerException("name can not be null");
        }
        if (a1 == null)
        {
            throw new NullPointerException("tts_dict can not be null");
        }
        if (f1 == null)
        {
            throw new NullPointerException("audioSink can not be null");
        } else
        {
            return new n(s, a, (h)a1, f1);
        }
    }

    public final i a(String s, String s1)
    {
        if (s == null)
        {
            throw new NullPointerException("name can not be null");
        }
        if (s1 == null)
        {
            throw new NullPointerException("text can not be null");
        } else
        {
            return new m(s, s1);
        }
    }

    public final void a(byte byte0, short word0)
    {
        if (byte0 != j)
        {
            return;
        }
        if (o != null)
        {
            o.e();
        }
        super.a(byte0, word0);
    }

    public final void a(byte byte0, byte abyte0[])
    {
        abyte0 = com.nuance.a.a.a.c.a.a.a.k.a(abyte0);
        abyte0.c();
        JVM INSTR tableswitch 29185 29189: default 44
    //                   29185 77
    //                   29186 102
    //                   29187 44
    //                   29188 44
    //                   29189 122;
           goto _L1 _L2 _L3 _L1 _L1 _L4
_L1:
        l.b((new StringBuilder("Session.parseXModeMsgBcpData() Unknown command: ")).append(abyte0.c()).append(". ").toString());
_L6:
        return;
_L2:
        a(byte0);
        if (o != null)
        {
            o.a((com.nuance.a.a.a.c.a.a.a.e)abyte0, byte0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (o != null)
        {
            o.a((com.nuance.a.a.a.c.a.a.a.g)abyte0, byte0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a(byte0);
        if (o != null)
        {
            o.a((p)abyte0, byte0);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Object obj, Object obj1)
    {
        switch (((com.nuance.a.a.a.a.d.a.b)obj).a)
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            super.a(obj, obj1);
            return;

        case 0: // '\0'
            super.a(this);
            return;

        case 3: // '\003'
            a.b(this);
            break;
        }
    }

    public final void a(short word0)
    {
        if (o != null)
        {
            o.a(word0);
        }
        super.a(word0);
    }

    public final void a(byte abyte0[])
    {
        super.a(abyte0);
        if (o != null)
        {
            o.a(abyte0);
        }
    }

    public final com.nuance.a.a.a.c.b.b.a b()
    {
        return new h();
    }

    public final com.nuance.a.a.a.c.b.b.b c()
    {
        return new com.nuance.a.a.a.c.b.a.b.b();
    }

    public final void d()
    {
label0:
        {
            if (o != null)
            {
                o.e();
            }
            synchronized (h)
            {
                if (g != 2)
                {
                    break label0;
                }
                g = 0;
                Integer integer = new Integer(0);
                m.a(new com.nuance.a.a.a.a.d.a.b((byte)3, integer), this, Thread.currentThread(), m.a()[0]);
            }
            return;
        }
        throw new com.nuance.a.a.a.c.a.b.a("the resource was unloaded. ");
    }

    public final void e()
    {
        if (o != null)
        {
            o.f();
        }
    }

    public final void f()
    {
        if (o != null)
        {
            o.b();
        }
    }

    public final void g()
    {
        if (o != null)
        {
            o.c();
        }
    }

    public final void h()
    {
        if (o != null)
        {
            o.d();
        }
    }

    static 
    {
        p = android.os.Build.VERSION.RELEASE;
    }
}
