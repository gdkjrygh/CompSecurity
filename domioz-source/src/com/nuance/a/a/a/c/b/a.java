// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b;

import com.nuance.a.a.a.a.d.a.b;
import com.nuance.a.a.a.a.d.a.c;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.f;
import com.nuance.a.a.a.a.d.a.h;
import com.nuance.a.a.a.a.d.a.i;
import com.nuance.a.a.a.a.d.a.j;
import com.nuance.a.a.a.a.d.a.k;
import com.nuance.a.a.a.a.d.a.l;
import com.nuance.a.a.a.a.d.a.m;
import com.nuance.a.a.a.a.d.a.n;
import com.nuance.a.a.a.a.d.a.p;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.b:
//            h, d, e, f, 
//            i, b, c, j, 
//            g

public class a
    implements c, i, j, k, n
{

    private static e h = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/b/a);
    private com.nuance.a.a.a.c.b.h A;
    private com.nuance.a.a.a.c.b.c.c B;
    private String C;
    private Queue D;
    private Queue E;
    private boolean F;
    protected String a;
    protected short b;
    protected byte c;
    public byte d[];
    protected int e;
    protected short f;
    protected short g;
    private p i;
    private int j;
    private p k;
    private int l;
    private p m;
    private Vector n;
    private boolean o;
    private Vector p;
    private com.nuance.a.a.a.a.d.a.a q;
    private Object r;
    private com.nuance.a.a.a.a.a.a s;
    private short t;
    private short u;
    private String v;
    private String w;
    private byte x[];
    private h y;
    private String z;

    public a(String s1, short word0, String s2, byte abyte0[], String s3, com.nuance.a.a.a.c.b.h h1, Vector vector, 
            com.nuance.a.a.a.a.d.a.a a1)
    {
        j = 30;
        l = 50;
        a = null;
        b = 0;
        o = false;
        p = null;
        q = null;
        s = null;
        t = 0;
        u = 9;
        v = "Not specified";
        w = "Not specified";
        x = null;
        y = null;
        z = "";
        C = "";
        D = new LinkedList();
        E = new LinkedList();
        F = false;
        a = s1;
        b = word0;
        v = s2;
        x = abyte0;
        w = s3;
        A = h1;
        p = new Vector();
        if (vector != null)
        {
            n = vector;
        } else
        {
            n = new Vector();
        }
        q = a1;
        if (h.b())
        {
            (new StringBuilder("XMode() server: ")).append(s1).append(" port: ").append(word0);
        }
        s1 = n.elements();
        do
        {
            if (!s1.hasMoreElements())
            {
                break;
            }
            s2 = (com.nuance.a.a.a.c.c.c)s1.nextElement();
            if (h.b())
            {
                (new StringBuilder("XMode() ")).append(s2.d()).append(" : ").append(s2.a()).append(" = ").append(new String(s2.b()));
            }
            if (s2.d() == com.nuance.a.a.a.c.c.d.a)
            {
                if (s2.a().equals("IdleSessionTimeout"))
                {
                    int i1 = Integer.parseInt(new String(s2.b()));
                    if (i1 > 0)
                    {
                        l = i1;
                    }
                } else
                if (s2.a().equals("ConnectionTimeout"))
                {
                    j = Integer.parseInt(new String(s2.b()));
                } else
                if (s2.a().equals("SSL_Socket_Enable") || s2.a().equals("SSL_Cert_Summary") || s2.a().equals("SSL_Cert_Data") || s2.a().equals("SSL_SelfSigned_Cert") || s2.a().equals("Android_Context") || s2.a().equals("Use_Device_ProxySetting_Only") || s2.a().equals("Use_Device_ProxySetting_If_Available"))
                {
                    if (s2.a().equals("SSL_Socket_Enable") && ((new String(s2.b())).equals("TRUE") || (new String(s2.b())).equals("true")))
                    {
                        o = true;
                    }
                    p.addElement(s2);
                }
            }
        } while (true);
        c = 3;
    }

    static short a(a a1)
    {
        a1.t = 3;
        return 3;
    }

    private void a(byte byte0, Object obj)
    {
        q.a(new b(byte0, obj), this, Thread.currentThread(), q.a()[0]);
_L1:
        return;
        obj;
        if (h.e())
        {
            h.b((new StringBuilder("XMode.sendCmdMsg() ")).append(((Exception) (obj)).getMessage()).toString());
            return;
        }
          goto _L1
    }

    private void a(com.nuance.a.a.a.a.a.a a1, byte abyte0[])
    {
        if (h.b())
        {
            (new StringBuilder("XMode.parseXModeMsg() protocol: ")).append(a1.a).append(" cmd: ").append(a1.c);
        }
        a1.a;
        JVM INSTR lookupswitch 4: default 88
    //                   1: 568
    //                   2: 470
    //                   3: 127
    //                   15: 126;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        if (h.e())
        {
            h.b((new StringBuilder("XMode.parseXModeMsg() unknown protocol: ")).append(Integer.toHexString(a1.a)).toString());
        }
_L11:
        return;
_L4:
        a1.c;
        JVM INSTR lookupswitch 4: default 172
    //                   257: 184
    //                   258: 328
    //                   512: 347
    //                   768: 415;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        A.a(a1, abyte0);
        return;
_L7:
        q.a(k);
        d = new byte[16];
        System.arraycopy(abyte0, 0, d, 0, 16);
        z = com.nuance.a.a.a.a.d.a.e.b(d);
        h.f();
        if (h.b())
        {
            (new StringBuilder("Received COP_Connected ")).append(z);
        }
        a((byte)10, null);
        h.g();
        a("SocketOpened");
        m = new com.nuance.a.a.a.c.b.d(this);
        q.a(m, l * 1000);
        continue; /* Loop/switch isn't completed */
        a1;
        h.g();
        throw a1;
_L8:
        e = com.nuance.a.a.a.a.c.c.b(abyte0, 0);
        a((byte)8, null);
        continue; /* Loop/switch isn't completed */
_L9:
        if (m != null)
        {
            q.a(m);
        }
        u = com.nuance.a.a.a.a.c.c.a(abyte0, 0);
        c = 2;
        t = 6;
        if (h.d())
        {
            h.a("XMode.parseXModeMsgCopDisconnect() Received COP DISCONNECT. ");
        }
        a((byte)4, null);
        continue; /* Loop/switch isn't completed */
_L10:
        short word0 = com.nuance.a.a.a.a.c.c.a(abyte0, 0);
        com.nuance.a.a.a.a.c.c.b(abyte0, 2);
        t = 7;
        u = word0;
        c = 2;
        if (h.e())
        {
            h.b("XMode.parseXModeMsgCopConnectFailed() COP CONNECT failure. ");
        }
        a((byte)4, null);
        if (true) goto _L6; else goto _L3
_L3:
        if (m != null && q.a(m))
        {
            m = new com.nuance.a.a.a.c.b.e(this);
            q.a(m, l * 1000);
        }
        if (a1.c == 2641)
        {
            if (h.d())
            {
                h.a("XMode.parseXModeMsg() BCP_LOG_RESPONSE is deprecated");
                return;
            }
        } else
        {
            A.a(a1, abyte0);
            return;
        }
        if (true) goto _L11; else goto _L2
_L2:
        if (m != null && q.a(m))
        {
            m = new com.nuance.a.a.a.c.b.f(this);
            q.a(m, l * 1000);
        }
        A.a(a1, abyte0);
        return;
    }

    static void a(a a1, byte byte0)
    {
        a1.a(byte0, null);
    }

    private void a(String s1)
    {
        if (B != null && !F)
        {
            B.b(s1).a();
        }
    }

    static int b(a a1)
    {
        return a1.l;
    }

    static e c()
    {
        return h;
    }

    public final void a()
    {
        if (h.b())
        {
            (new StringBuilder("XMode.closeSocketCallback() ")).append(z);
        }
        c = 3;
        if (i != null)
        {
            q.a(i);
            i = null;
        }
        if (m != null)
        {
            q.a(m);
            m = null;
        }
        if (r != null)
        {
            A.a(t, u);
        }
        r = null;
        y = null;
        d = null;
        z = "";
    }

    public final void a(int i1)
    {
        h.b();
        if (c != 1)
        {
            return;
        } else
        {
            byte abyte0[] = new byte[6];
            com.nuance.a.a.a.a.c.c.a(i1, abyte0, 0);
            com.nuance.a.a.a.a.c.c.a(f, abyte0, 4);
            a(com.nuance.a.a.a.a.a.b.a((byte)1, (byte)18, (short)257, abyte0), 3, "SEND_VAP_RECORD_BEGIN");
            return;
        }
    }

    public final void a(m m1, Object obj)
    {
        h.b();
        if (m1 != m.a) goto _L2; else goto _L1
_L1:
        r = obj;
        if (c != 0) goto _L4; else goto _L3
_L3:
        a((byte)7, null);
_L6:
        return;
_L4:
        c = 2;
        y.a(r);
        return;
_L2:
        if (m1 == m.b)
        {
            if (h.e())
            {
                h.b("XMode.openSocketCallback() NETWORK_ERROR");
            }
            c = 3;
            t = 4;
            A.a(t, u);
            r = null;
            y = null;
            d = null;
            z = "";
            return;
        }
        if (m1 == m.c)
        {
            t = 4;
            if (h.e())
            {
                h.b("XMode.openSocketCallback() NETWORK_MEMORY_ERROR");
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(m m1, Object obj, int i1, int j1, Object obj1)
    {
        boolean flag1 = false;
        boolean flag = false;
        String s1 = (String)((com.nuance.a.a.a.c.b.i)obj1).b;
        if (m1 == m.a && i1 == j1)
        {
            if (s1.equals("SEND_COP_CONNECT"))
            {
                a((byte)5, null);
            } else
            if (s1.equals("SEND_COP_DISCONNECT"))
            {
                y.a(obj);
            }
            a((byte)11, s1);
            D.remove(obj1);
            if (D.size() == 0 && E.size() > 0)
            {
                a((byte)14, null);
            }
        } else
        {
            if (m1 != m.b)
            {
                continue;
            }
            if (t != 1 && t != 3)
            {
                t = 8;
                if (h.e())
                {
                    h.b("XMode.writeSocketCallback() NETWORK_ERROR");
                }
            }
            a((byte)12, s1);
            D.remove(obj1);
            if (D.size() == 0)
            {
                j1 = E.size();
                i1 = ((flag) ? 1 : 0);
                while (i1 < j1) 
                {
                    a((byte)12, ((com.nuance.a.a.a.c.b.i)E.remove()).b);
                    i1++;
                }
            }
        }
        do
        {
            do
            {
                do
                {
                    return;
                } while (m1 != m.c);
                if (t != 1 && t != 3)
                {
                    t = 8;
                    if (h.e())
                    {
                        h.b("XMode.writeSocketCallback() NETWORK_MEMORY_ERROR");
                    }
                }
                a((byte)12, s1);
                D.remove(obj1);
            } while (D.size() != 0);
            j1 = E.size();
            i1 = ((flag1) ? 1 : 0);
            while (i1 < j1) 
            {
                a((byte)12, ((com.nuance.a.a.a.c.b.i)E.remove()).b);
                i1++;
            }
        } while (true);
    }

    public final void a(m m1, byte abyte0[], int i1, int j1, Object obj)
    {
        obj = (String)obj;
        h.b();
        if (h.a())
        {
            h.a(abyte0);
        }
        if (m1 != m.a) goto _L2; else goto _L1
_L1:
        if (!((String) (obj)).equals("READ_XMODE_HEADER")) goto _L4; else goto _L3
_L3:
        if (j1 != 0) goto _L6; else goto _L5
_L5:
        i = new com.nuance.a.a.a.c.b.b(this);
        q.a(i, 20L);
_L8:
        return;
_L6:
        if (j1 == i1)
        {
            s = new com.nuance.a.a.a.a.a.a(abyte0);
            if (s.d == 0)
            {
                a(s, ((byte []) (null)));
                a((byte)5, null);
                return;
            }
            if ((s.d > 0x7d000 || s.d < 0) && h.d())
            {
                h.a("XMode.readSocketCallback() Received a larger than anticipated payload size.");
            }
            a((byte)6, null);
            return;
        }
        if (h.e())
        {
            h.b((new StringBuilder("----***---- readSocketCallback fatal error in readSocketCallback NET_CONTEXT_READ_XMODE_HEADER bytesRead:[")).append(j1).append("] bufferLen:[").append(i1).append("]").toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((String) (obj)).equals("READ_XMODE_PAYLOAD"))
        {
            if (j1 == 0)
            {
                if (h.b())
                {
                    (new StringBuilder()).append(Integer.toHexString(s.c)).append(" payload not read bytesRead is 0");
                }
                i = new com.nuance.a.a.a.c.b.c(this);
                q.a(i, 20L);
                return;
            }
            if (j1 == i1)
            {
                if (s.d <= i1)
                {
                    a(s, abyte0);
                }
                a((byte)5, null);
                return;
            }
            if (h.e())
            {
                h.b((new StringBuilder("----***---- readSocketCallback fatal error in readSocketCallback NET_CONTEXT_READ_XMODE_PAYLOAD bytesRead:[")).append(j1).append("] bufferLen:[").append(i1).append("]").toString());
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (m1 == m.b)
        {
            if (t != 1 && t != 3 && t != 6)
            {
                t = 8;
                if (h.e())
                {
                    h.b("XMode.readSocketCallback() NETWORK_ERROR");
                }
            }
            a((byte)4, null);
            return;
        }
        if (m1 == m.c && t != 1 && t != 3)
        {
            t = 8;
            if (h.e())
            {
                h.b("XMode.readSocketCallback() NETWORK_MEMORY_ERROR");
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(com.nuance.a.a.a.c.b.c.c c1)
    {
        if (c1 != null)
        {
            B = c1.b("NMSPSocket").a();
        }
    }

    public final void a(Object obj, Object obj1)
    {
        ((b)obj).a;
        JVM INSTR tableswitch 1 14: default 76
    //                   1 77
    //                   2 844
    //                   3 116
    //                   4 909
    //                   5 728
    //                   6 772
    //                   7 218
    //                   8 944
    //                   9 990
    //                   10 1040
    //                   11 76
    //                   12 76
    //                   13 76
    //                   14 1101;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L1 _L1 _L1 _L12
_L1:
        return;
_L2:
        h.b();
        if (c == 0)
        {
            a((byte)3, null);
            return;
        } else
        {
            A.a(t, u);
            return;
        }
_L4:
        h.b();
        if (c == 0)
        {
            y = new com.nuance.a.a.a.b.m(q);
            if (o)
            {
                y.b(a, b, p, this, this);
                return;
            } else
            {
                y.a(a, b, p, this, this);
                return;
            }
        } else
        {
            A.a(t, u);
            return;
        }
_L8:
        h.b();
        if (c != 0) goto _L1; else goto _L13
_L13:
        boolean flag;
        obj1 = (new StringBuilder("<?xml version=\"1.0\"?><cc><s></s><t>7</t><b>20091023</b><bs>512000</bs><tsc>")).append(f).append("</tsc><fsc>").append(g).append("</fsc><nmaid>").append(v).append("</nmaid><uid>").append(w).append("</uid>");
        Enumeration enumeration;
        com.nuance.a.a.a.c.c.c c1;
        if (C != null)
        {
            obj = (new StringBuilder("<rootlog>")).append(C.substring(0, C.length() - 2)).append("</rootlog>").toString();
        } else
        {
            obj = "";
        }
        obj1 = ((StringBuilder) (obj1)).append(((String) (obj)));
        if (F)
        {
            obj = "<disablecalllogging/>";
        } else
        {
            obj = "";
        }
        obj = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        enumeration = n.elements();
        flag = false;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = (com.nuance.a.a.a.c.c.c)enumeration.nextElement();
        obj1 = obj;
        if (c1.d() != com.nuance.a.a.a.c.c.d.b)
        {
            break MISSING_BLOCK_LABEL_1119;
        }
        obj1 = new String(c1.b());
        obj = (new StringBuilder()).append(((String) (obj))).append("<nmsp p=\"").append(c1.a()).append("\" v=\"").append(com.nuance.a.a.a.a.c.e.a(((String) (obj1)))).append("\"/>").toString();
        obj1 = obj;
        if (!c1.a().equals("Ping_IntervalSecs"))
        {
            break MISSING_BLOCK_LABEL_1119;
        }
        flag = true;
_L16:
        if (c1.d() == com.nuance.a.a.a.c.c.d.c)
        {
            obj1 = new String(c1.b());
            obj = (new StringBuilder()).append(((String) (obj))).append("<app p=\"").append(c1.a()).append("\" v=\"").append(com.nuance.a.a.a.a.c.e.a(((String) (obj1)))).append("\"/>").toString();
        }
        if (true) goto _L15; else goto _L14
_L15:
        break MISSING_BLOCK_LABEL_379;
_L14:
        obj1 = obj;
        if (!flag)
        {
            obj1 = (new StringBuilder()).append(((String) (obj))).append("<nmsp p=\"Ping_IntervalSecs\" v=\"0\"/>").toString();
        }
        obj = (new StringBuilder()).append(((String) (obj1))).append("</cc>").toString().getBytes();
        int i1 = obj.length;
        int j1 = i1 + 4 + 1;
        obj1 = new byte[j1];
        com.nuance.a.a.a.a.c.c.a(j1 - 4, ((byte []) (obj1)), 0);
        obj1[4] = 0;
        System.arraycopy(obj, 0, obj1, 5, i1);
        a(com.nuance.a.a.a.a.a.b.a((byte)3, (byte)23, (short)256, ((byte []) (obj1))), 3, "SEND_COP_CONNECT");
        k = new com.nuance.a.a.a.c.b.j(this);
        q.a(k, j * 1000);
        c = 1;
        return;
_L6:
        if (y != null && r != null)
        {
            obj = new byte[8];
            y.a(r, l.b, ((byte []) (obj)), 8, this, "READ_XMODE_HEADER");
            return;
        }
          goto _L1
_L7:
        if (s.d > 0 && s.d <= 0x7d000)
        {
            obj = new byte[s.d];
            if (y != null && r != null)
            {
                y.a(r, l.b, ((byte []) (obj)), obj.length, this, "READ_XMODE_PAYLOAD");
                return;
            }
        }
          goto _L1
_L3:
        h.b();
        obj = new byte[2];
        com.nuance.a.a.a.a.c.c.a((short)0, ((byte []) (obj)), 0);
        obj = com.nuance.a.a.a.a.a.b.a((byte)3, (byte)23, (short)512, ((byte []) (obj)));
        if (y != null && r != null)
        {
            y.b(r);
        }
        a(((byte []) (obj)), 3, "SEND_COP_DISCONNECT");
        return;
_L5:
        h.b();
        if (y != null && r != null)
        {
            y.a(r);
            return;
        }
          goto _L1
_L9:
        h.b();
        obj = new byte[8];
        com.nuance.a.a.a.a.c.c.a(e, ((byte []) (obj)), 0);
        com.nuance.a.a.a.a.c.c.a(0, ((byte []) (obj)), 4);
        a(com.nuance.a.a.a.a.a.b.a((byte)3, (byte)23, (short)259, ((byte []) (obj))), 3, "SEND_COP_PING_RESPONSE");
        return;
_L10:
        h.b();
        if (c == 1)
        {
            c = 2;
            t = 5;
            if (h.e())
            {
                h.b("XMode.handleCopConnectTimeout() COP CONNECT timed out. ");
            }
            a((byte)4, null);
            return;
        }
          goto _L1
_L11:
        h.b();
        obj = com.nuance.a.a.a.a.d.a.f.b(x, d);
        obj1 = new byte[obj.length + 4];
        com.nuance.a.a.a.a.c.c.a(obj.length, ((byte []) (obj1)), 0);
        System.arraycopy(obj, 0, obj1, 4, obj.length);
        a(com.nuance.a.a.a.a.a.b.a((byte)3, (byte)23, (short)262, ((byte []) (obj1))), 3, "SEND_COP_CONFIRM");
        return;
_L12:
        h.b();
        a(((byte []) (null)), 2, null);
        return;
        obj = obj1;
          goto _L16
    }

    public final void a(short word0, short word1, String s1)
    {
        h.b();
        if (c != 0 || C == null || C.equals(s1)) goto _L2; else goto _L1
_L1:
        String s2 = C;
        if (B == null || s2 == null || s2.equals("")) goto _L2; else goto _L3
_L3:
        com.nuance.a.a.a.c.b.c.a a1 = B.b("CancelLogEvent");
        try
        {
            a1.a("CauseCode", 0);
            a1.a("CauseMessage", "New connecting request (New command created) while connecting, dropped the old reference Id");
            ((com.nuance.a.a.a.c.b.a.a.c)a1).b(s2, "NMSP_GATEWAY");
        }
        catch (com.nuance.a.a.a.c.b.c.b b1)
        {
            if (h.e())
            {
                h.b("XMode.cancelGwRemoteEvent() the builder is already committed.");
            }
            continue; /* Loop/switch isn't completed */
        }
_L10:
        a1.a();
_L2:
        C = s1;
        if (c == 1 || c == 0) goto _L5; else goto _L4
_L4:
        if (c != 2) goto _L7; else goto _L6
_L6:
        if (i != null)
        {
            q.a(i);
        }
        if (m != null)
        {
            q.a(m);
        }
        a("OpenSocket");
        r = null;
        y = null;
        d = null;
        z = "";
        f = word0;
        g = word1;
        c = 0;
        a((byte)1, null);
_L5:
        return;
_L7:
        if (c != 3) goto _L5; else goto _L8
_L8:
        a("OpenSocket");
        f = word0;
        g = word1;
        c = 0;
        a((byte)1, null);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void a(byte abyte0[], int i1)
    {
        h.b();
        if (c != 1)
        {
            return;
        } else
        {
            int j1 = abyte0.length;
            byte abyte1[] = new byte[j1 + 8];
            com.nuance.a.a.a.a.c.c.a(i1, abyte1, 0);
            com.nuance.a.a.a.a.c.c.a(j1, abyte1, 4);
            System.arraycopy(abyte0, 0, abyte1, 8, j1);
            a(com.nuance.a.a.a.a.a.b.a((byte)1, (byte)18, (short)513, abyte1), 3, "SEND_VAP_RECORD");
            return;
        }
    }

    public final void a(byte abyte0[], int i1, Object obj)
    {
        if (h.b())
        {
            (new StringBuilder("XMode.sendXModeMsg() ")).append(obj).append(", buffer.length:").append(abyte0.length);
        }
        if (m != null && q.a(m))
        {
            m = new g(this);
            q.a(m, l * 1000);
        }
        if (y == null || r == null) goto _L2; else goto _L1
_L1:
        if (i1 != 3 && i1 != 2 && (D.size() != 0 || E.size() != 0)) goto _L4; else goto _L3
_L3:
        if (i1 == 2)
        {
            obj = (com.nuance.a.a.a.c.b.i)E.remove();
            abyte0 = ((com.nuance.a.a.a.c.b.i) (obj)).a;
        } else
        {
            obj = new com.nuance.a.a.a.c.b.i(null, obj);
        }
        D.add(obj);
        y.a(r, abyte0, abyte0.length, this, obj);
_L6:
        return;
_L4:
        E.add(new com.nuance.a.a.a.c.b.i(abyte0, obj));
        return;
_L2:
        if (i1 == 1)
        {
            E.add(new com.nuance.a.a.a.c.b.i(abyte0, obj));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b()
    {
        if (h.b())
        {
            (new StringBuilder("XMode.disconnect() state:")).append(c).append(", socket:").append(r);
        }
        if (c != 3) goto _L2; else goto _L1
_L1:
        t = 1;
        A.a(t, u);
_L4:
        return;
_L2:
        if (c == 2) goto _L4; else goto _L3
_L3:
        if (c != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        a("CloseSocket");
        t = 1;
        c = 2;
        if (r == null) goto _L4; else goto _L5
_L5:
        y.a(r);
        return;
        if (c != 1) goto _L4; else goto _L6
_L6:
        c = 2;
        t = 1;
        a((byte)2, null);
        return;
    }

    public final void b(int i1)
    {
        h.b();
        if (c != 1)
        {
            return;
        } else
        {
            byte abyte0[] = new byte[4];
            com.nuance.a.a.a.a.c.c.a(i1, abyte0, 0);
            a(com.nuance.a.a.a.a.a.b.a((byte)1, (byte)18, (short)256, abyte0), 3, "SEND_VAP_RECORD_END");
            return;
        }
    }

}
