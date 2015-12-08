// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.b;

import com.nuance.a.a.a.a.d.a.b;
import com.nuance.a.a.a.a.d.a.c;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.a.b.d;
import java.io.ByteArrayOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.a.a.b:
//            d, b, c

public class a
    implements c, com.nuance.a.a.a.c.a.a.b.d, d
{

    private static final e l = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/a/a/b/a);
    private static long p = 1L;
    protected com.nuance.a.a.a.c.a.a.b.c a;
    protected com.nuance.a.a.a.a.b.b b;
    protected com.nuance.a.a.a.a.b.b c;
    public Vector d;
    protected com.nuance.a.a.a.a.d.a.a e;
    protected com.nuance.a.a.a.c.a.b.e f;
    protected int g;
    protected Object h;
    protected Hashtable i;
    protected byte j;
    protected long k;
    private com.nuance.a.a.a.c.a.b.b m;
    private com.nuance.a.a.a.c.a.a.b.d n;
    private byte o;
    private Hashtable q;

    public a(com.nuance.a.a.a.c.a.a.b.b b1, com.nuance.a.a.a.c.a.b.b b2, Vector vector)
    {
        g = 0;
        j = 0;
        f = b1;
        a = b1.a();
        m = b2;
        b = b1.h();
        c = b1.i();
        o = 5;
        e = b1.d();
        h = new Object();
        j = a.f();
        i = new Hashtable();
        q = new Hashtable();
        k = a.e();
        d = new Vector();
        if (vector != null)
        {
            for (int i1 = 0; i1 < vector.size(); i1++)
            {
                b1 = ((com.nuance.a.a.a.c.c.c)vector.elementAt(i1)).e();
                d.addElement(b1);
            }

        }
    }

    private static com.nuance.a.a.a.c.c.d a(String s)
    {
        if (s.equalsIgnoreCase("sdk"))
        {
            return com.nuance.a.a.a.c.c.d.a;
        }
        if (s.equalsIgnoreCase("nmsp"))
        {
            return com.nuance.a.a.a.c.c.d.b;
        }
        if (s.equalsIgnoreCase("app"))
        {
            return com.nuance.a.a.a.c.c.d.c;
        }
        if (s.equalsIgnoreCase("nss"))
        {
            return com.nuance.a.a.a.c.c.d.d;
        }
        if (s.equalsIgnoreCase("slog"))
        {
            return com.nuance.a.a.a.c.c.d.e;
        }
        if (s.equalsIgnoreCase("nsslog"))
        {
            return com.nuance.a.a.a.c.c.d.f;
        }
        if (s.equalsIgnoreCase("gwlog"))
        {
            return com.nuance.a.a.a.c.c.d.g;
        }
        if (s.equalsIgnoreCase("svsp"))
        {
            return com.nuance.a.a.a.c.c.d.h;
        }
        if (s.equalsIgnoreCase("sip"))
        {
            return com.nuance.a.a.a.c.c.d.i;
        }
        if (s.equalsIgnoreCase("sdp"))
        {
            return com.nuance.a.a.a.c.c.d.j;
        } else
        {
            return null;
        }
    }

    private void a(Vector vector, long l1)
    {
        i.put(new Long(l1), new Byte((byte)2));
        q.put(new Long(l1), vector);
        String s = (new StringBuilder("<gp><rid>")).append(l1).append("</rid>").toString();
        for (int i1 = 0; i1 < vector.size();)
        {
            String s1;
label0:
            {
                com.nuance.a.a.a.c.c.c c1 = (com.nuance.a.a.a.c.c.c)vector.elementAt(i1);
                if (c1.d() != com.nuance.a.a.a.c.c.d.c && c1.d() != com.nuance.a.a.a.c.c.d.b && c1.d() != com.nuance.a.a.a.c.c.d.d)
                {
                    s1 = s;
                    if (c1.d() != com.nuance.a.a.a.c.c.d.h)
                    {
                        break label0;
                    }
                }
                s1 = (new StringBuilder()).append(s).append("<").append(c1.d()).append(" p=\"").append(c1.a()).append("\"/>").toString();
            }
            i1++;
            s = s1;
        }

        s = (new StringBuilder()).append(s).append("</gp>").toString();
        vector = a;
        byte abyte0[] = s.getBytes();
        byte byte0 = j;
        com.nuance.a.a.a.c.a.a.b.d d1 = n;
        vector.a((short)2583, "SEND_BCP_GET_PARAMS", abyte0, new byte[0], byte0, l1, d1, false);
    }

    public static long j()
    {
        return 0L;
    }

    protected long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        l1 = p;
        p = 1L + l1;
        if (p == 0x8000000000000000L)
        {
            p = 1L;
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(byte byte0, long l1, short word0, short word1, short word2)
    {
        (new StringBuilder("onBcpResponse, TID: ")).append(byte0).append(", RID: ").append(l1).append(", status code: ").append(word0).append(" , request state: ").append(word1).append(", completion cause: ").append(word2);
        if (word0 == 200) goto _L2; else goto _L1
_L1:
        Byte byte1 = (Byte)i.get(new Long(l1));
        if (byte1 == null) goto _L2; else goto _L3
_L3:
        byte1.byteValue();
        JVM INSTR tableswitch 1 2: default 116
    //                   1 117
    //                   2 134;
           goto _L2 _L4 _L5
_L2:
        return;
_L4:
        i.remove(new Long(l1));
        return;
_L5:
        i.remove(new Long(l1));
        return;
    }

    public final void a(byte byte0, long l1, short word0, byte abyte0[])
    {
        int i1 = 0;
        (new StringBuilder("onBcpGetParamsComplete, TID: ")).append(byte0).append(", RID: ").append(l1);
        if (i.remove(new Long(l1)) == null)
        {
            l.a((new StringBuilder("onBcpGetParamsComplete, RID: ")).append(l1).append(" already removed!").toString());
            q.remove(new Long(l1));
        } else
        {
            Vector vector = (Vector)q.remove(new Long(l1));
            if (vector == null)
            {
                l.b((new StringBuilder("Could not find the grammars associated with RID: ")).append(l1).toString());
                return;
            }
            abyte0 = new String(abyte0);
            if (abyte0.startsWith(";"))
            {
                byte0 = 1;
                i1 = 0;
            } else
            {
                boolean flag = false;
                byte0 = i1;
                i1 = ((flag) ? 1 : 0);
            }
            do
            {
                int j1 = abyte0.indexOf(";", byte0);
                if (j1 == -1)
                {
                    break;
                }
                String s = abyte0.substring(byte0, j1);
                if (s.indexOf(":") == -1)
                {
                    com.nuance.a.a.a.c.c.c c2 = (com.nuance.a.a.a.c.c.c)vector.elementAt(i1);
                    vector.setElementAt(new com.nuance.a.a.a.c.c.c(c2.a(), s.getBytes(), c2.d()), i1);
                }
                i1++;
                byte0 = j1 + 1;
            } while (true);
            if (byte0 < abyte0.length())
            {
                abyte0 = abyte0.substring(byte0);
                if (abyte0.indexOf(":") == -1)
                {
                    com.nuance.a.a.a.c.c.c c1 = (com.nuance.a.a.a.c.c.c)vector.elementAt(i1);
                    vector.setElementAt(new com.nuance.a.a.a.c.c.c(c1.a(), abyte0.getBytes(), c1.d()), i1);
                }
            }
            if (word0 != 200 && word0 == 201)
            {
                return;
            }
        }
    }

    public void a(byte byte0, short word0)
    {
        (new StringBuilder("onBcpEvent, TID: ")).append(byte0).append(", event code: ").append(word0);
        if (g == 2)
        {
            g = 0;
            Enumeration enumeration = i.keys();
            do
            {
                if (enumeration.hasMoreElements())
                {
                    Long long1 = (Long)enumeration.nextElement();
                    switch (((Byte)i.remove(long1)).byteValue())
                    {
                    }
                    continue;
                }
                a.b(this);
                break;
            } while (true);
        }
    }

    public void a(byte byte0, byte abyte0[])
    {
    }

    protected final void a(com.nuance.a.a.a.c.a.a.b.d d1)
    {
        if ((new com.nuance.a.a.a.b.c(d)).a())
        {
            b = com.nuance.a.a.a.a.c.e.c(b);
            c = com.nuance.a.a.a.a.c.e.c(c);
            ((com.nuance.a.a.a.c.a.a.b.b)f).a(b);
            ((com.nuance.a.a.a.c.a.a.b.b)f).b(c);
        }
        n = d1;
        a.a(d1);
        if (g != 0) goto _L2; else goto _L1
_L1:
        String s;
        long l1;
        if (a.d() != null)
        {
            g = 2;
        } else
        {
            a.a(b, c);
            g = 1;
        }
        l1 = a();
        s = (new StringBuilder("<lr><rid>")).append(l1).append("</rid>").toString();
        o;
        JVM INSTR tableswitch 1 5: default 168
    //                   1 238
    //                   2 262
    //                   3 286
    //                   4 310
    //                   5 214;
           goto _L3 _L4 _L5 _L6 _L7 _L2
_L3:
        s = (new StringBuilder()).append(s).append("</lr>").toString().getBytes();
        a.a((short)2599, "SEND_BCP_LOAD_RESOURCE", s, null, j, l1, d1, false);
_L2:
        return;
_L4:
        s = (new StringBuilder()).append(s).append("<nr9><reco/></nr9>").toString();
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new StringBuilder()).append(s).append("<nr9><tts/></nr9>").toString();
        continue; /* Loop/switch isn't completed */
_L6:
        s = (new StringBuilder()).append(s).append("<oper></oper>").toString();
        continue; /* Loop/switch isn't completed */
_L7:
        s = (new StringBuilder()).append(s).append("<dict>").toString();
        s = (new StringBuilder()).append(s).append("</dict>").toString();
        if (true) goto _L3; else goto _L8
_L8:
    }

    public void a(Object obj, Object obj1)
    {
        obj = (b)obj;
        ((b) (obj)).a;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 463
    //                   3 491
    //                   4 521;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        obj = ((Object) ((Object[])((b) (obj)).b));
        obj1 = (Vector)obj[0];
        long l2 = ((Long)obj[1]).longValue();
        if (g == 2)
        {
            boolean flag = true;
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            byte abyte0[] = new byte[4];
            i.put(new Long(l2), new Byte((byte)1));
            obj = (new StringBuilder("<sp><rid>")).append(l2).append("</rid>").toString();
            int l1 = 1;
            int i1 = 0;
            while (i1 < ((Vector) (obj1)).size()) 
            {
                com.nuance.a.a.a.c.c.c c1 = (com.nuance.a.a.a.c.c.c)((Vector) (obj1)).elementAt(i1);
                if (c1.d() == com.nuance.a.a.a.c.c.d.c || c1.d() == com.nuance.a.a.a.c.c.d.b || c1.d() == com.nuance.a.a.a.c.c.d.d)
                {
                    flag = false;
                    String s = new String(c1.b());
                    obj = (new StringBuilder()).append(((String) (obj))).append("<").append(c1.d()).append(" p=\"").append(c1.a()).append("\" v=\"").append(com.nuance.a.a.a.a.c.e.a(s)).append("\"/>").toString();
                } else
                {
                    if (c1.d() == com.nuance.a.a.a.c.c.d.h)
                    {
                        flag = false;
                    }
                    obj = (new StringBuilder()).append(((String) (obj))).append("<").append(c1.d().toString()).append(" p=\"").append(c1.a()).append("\" v=\"").append(l1).append("\"/>").toString();
                    byte abyte1[] = c1.b();
                    com.nuance.a.a.a.a.c.c.a(abyte1.length, abyte0, 0);
                    bytearrayoutputstream.write(abyte0, 0, 4);
                    bytearrayoutputstream.write(abyte1, 0, abyte1.length);
                    l1++;
                }
                i1++;
            }
            obj = (new StringBuilder()).append(((String) (obj))).append("</sp>").toString();
            a.a((short)2581, "SEND_BCP_SET_PARAMS", ((String) (obj)).getBytes(), bytearrayoutputstream.toByteArray(), j, l2, n, flag);
            try
            {
                bytearrayoutputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
          goto _L1
_L3:
        obj = ((Object) ((Object[])((b) (obj)).b));
        a((Vector)obj[0], ((Long)obj[1]).longValue());
        return;
_L4:
        int j1 = ((Integer)((b) (obj)).b).intValue();
        a.a(j, j1, n);
        return;
_L5:
        int k1 = ((Integer)((b) (obj)).b).intValue();
        long l3 = a();
        obj = (new StringBuilder("<fr><rid>")).append(l3).append("</rid>").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("<n>1</n>").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("<resids>").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("<res1><id>").append(k).append("</id>").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("<timeout>").append(k1).append("<timeout></res1>").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("</resids>").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("</fr>").toString().getBytes();
        a.a((short)2608, "SEND_BCP_FREE_RESOURCE_ID", ((byte []) (obj)), null, j, l3, n, true);
        return;
    }

    public void a(short word0)
    {
        l.b();
        Enumeration enumeration = i.keys();
        do
        {
            if (enumeration.hasMoreElements())
            {
                Long long1 = (Long)enumeration.nextElement();
                switch (((Byte)i.remove(long1)).byteValue())
                {
                }
            } else
            {
                synchronized (h)
                {
                    g = 0;
                }
                return;
            }
        } while (true);
    }

    public void a(byte abyte0[])
    {
        if (l.b())
        {
            (new StringBuilder("onSessionConnected, SID: ")).append(abyte0);
        }
        synchronized (h)
        {
            g = 2;
        }
    }

    public final void b(byte byte0, long l1, short word0, byte abyte0[])
    {
        (new StringBuilder("onBcpSetParamsComplete, TID: ")).append(byte0).append(", RID: ").append(l1).append(", status code: ").append(word0);
        if (i.remove(new Long(l1)) == null)
        {
            l.a((new StringBuilder("onBcpSetParamsComplete, RID: ")).append(l1).append(" already removed!").toString());
        } else
        {
            Vector vector = new Vector();
            if (abyte0 != null)
            {
                abyte0 = new String(abyte0);
                if (abyte0.startsWith(";"))
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                do
                {
                    int i1 = abyte0.indexOf(";", byte0);
                    if (i1 == -1)
                    {
                        break;
                    }
                    String s = abyte0.substring(byte0, i1);
                    byte0 = s.indexOf(".");
                    if (byte0 != -1)
                    {
                        vector.addElement(new com.nuance.a.a.a.c.c.c(s.substring(byte0 + 1), a(s.substring(0, byte0))));
                    }
                    byte0 = i1 + 1;
                } while (true);
                if (byte0 < abyte0.length())
                {
                    abyte0 = abyte0.substring(byte0);
                    byte0 = abyte0.indexOf(".");
                    if (byte0 != -1)
                    {
                        vector.addElement(new com.nuance.a.a.a.c.c.c(abyte0.substring(byte0 + 1), a(abyte0.substring(0, byte0))));
                    }
                }
            }
            if (word0 != 200 && word0 == 201)
            {
                return;
            }
        }
    }

    public void d()
    {
label0:
        {
            synchronized (h)
            {
                if (g != 2)
                {
                    break label0;
                }
                g = 0;
                Integer integer = new Integer(0);
                e.a(new b((byte)3, integer), this, Thread.currentThread(), e.a()[0]);
            }
            return;
        }
        l.b("ResourceException the resource was unloaded. ");
        throw new com.nuance.a.a.a.c.a.b.a("the resource was unloaded. ");
    }

    public void e()
    {
    }

    public void f()
    {
    }

    public void g()
    {
    }

    public void h()
    {
    }

    public final com.nuance.a.a.a.c.a.b.e i()
    {
        return f;
    }

}
