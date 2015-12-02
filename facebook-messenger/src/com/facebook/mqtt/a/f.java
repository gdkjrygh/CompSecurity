// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.a;

import com.facebook.mqtt.messages.SubscribeTopic;
import com.facebook.mqtt.messages.a;
import com.facebook.mqtt.messages.b;
import com.facebook.mqtt.messages.c;
import com.facebook.mqtt.messages.d;
import com.facebook.mqtt.messages.h;
import com.facebook.mqtt.messages.j;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.l;
import com.facebook.mqtt.messages.m;
import com.facebook.mqtt.messages.n;
import com.facebook.mqtt.messages.o;
import com.facebook.mqtt.messages.p;
import com.facebook.mqtt.messages.q;
import com.facebook.mqtt.messages.r;
import com.facebook.mqtt.messages.s;
import com.facebook.mqtt.messages.u;
import com.facebook.mqtt.messages.v;
import com.facebook.mqtt.messages.w;
import com.google.common.a.es;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

// Referenced classes of package com.facebook.mqtt.a:
//            g

public class f
{

    private static final Class a = com/facebook/mqtt/a/f;
    private DataOutputStream b;

    public f()
    {
    }

    private int a(com.facebook.mqtt.messages.f f1)
    {
        int i1 = 0;
        if (f1.b())
        {
            i1 = 128;
        }
        int i = i1;
        if (f1.c())
        {
            i = i1 | 0x40;
        }
        i1 = i;
        if (f1.e())
        {
            i1 = i | 0x20;
        }
        i1 |= (f1.f() & 3) << 3;
        i = i1;
        if (f1.d())
        {
            i = i1 | 4;
        }
        i1 = i;
        if (f1.g())
        {
            i1 = i | 2;
        }
        return i1;
    }

    private int a(h h1)
    {
        int i1 = 0 | h1.a().toInt() << 4;
        int i = i1;
        if (h1.b())
        {
            i = i1 | 8;
        }
        i1 = i | h1.c() << 1;
        i = i1;
        if (h1.d())
        {
            i = i1 | 1;
        }
        return i;
    }

    private void a(int i)
    {
        int i1;
        do
        {
            int j1 = i % 128;
            i1 = i / 128;
            i = j1;
            if (i1 > 0)
            {
                i = j1 | 0x80;
            }
            b.writeByte(i);
            i = i1;
        } while (i1 > 0);
    }

    private void a(a a1)
    {
        b.writeByte(a(a1.f()));
        b.writeByte(2);
        b.writeByte(0);
        b.writeByte(a1.a().a());
        b.flush();
    }

    private void a(c c1)
    {
        h h1 = c1.f();
        com.facebook.mqtt.messages.f f1 = c1.a();
        Object obj = c1.c();
        byte abyte3[] = a(((d) (obj)).a());
        int i1 = 0 + (abyte3.length + 2);
        c1 = ((d) (obj)).b();
        String s1;
        byte abyte0[];
        String s2;
        byte abyte1[];
        byte abyte2[];
        int i;
        if (c1 != null)
        {
            c1 = a(((String) (c1)));
        } else
        {
            c1 = new byte[0];
        }
        s1 = ((d) (obj)).c();
        if (s1 != null)
        {
            abyte0 = a(s1);
        } else
        {
            abyte0 = new byte[0];
        }
        i = i1;
        if (f1.d())
        {
            i = i1 + (c1.length + 2) + (abyte0.length + 2);
        }
        s2 = ((d) (obj)).d();
        if (s2 != null)
        {
            abyte1 = a(s2);
        } else
        {
            abyte1 = new byte[0];
        }
        i1 = i;
        if (f1.b())
        {
            i1 = i + (abyte1.length + 2);
        }
        obj = ((d) (obj)).e();
        if (obj != null)
        {
            abyte2 = a(((String) (obj)));
        } else
        {
            abyte2 = new byte[0];
        }
        i = i1;
        if (f1.c())
        {
            i = i1 + (abyte2.length + 2);
        }
        b.writeByte(a(h1));
        a(i + 12);
        b.writeByte(0);
        b.writeByte(6);
        b.writeByte(77);
        b.writeByte(81);
        b.writeByte(73);
        b.writeByte(115);
        b.writeByte(100);
        b.writeByte(112);
        b.write(f1.a());
        b.write(a(f1));
        b.writeShort(f1.h());
        b.writeShort(abyte3.length);
        b.write(abyte3, 0, abyte3.length);
        if (f1.d())
        {
            b.writeShort(c1.length);
            b.write(c1, 0, c1.length);
            b.writeShort(abyte0.length);
            b.write(abyte0, 0, abyte0.length);
        }
        if (f1.b())
        {
            b.writeShort(abyte1.length);
            b.write(abyte1, 0, abyte1.length);
        }
        if (f1.c())
        {
            b.writeShort(abyte2.length);
            b.write(abyte2, 0, abyte2.length);
        }
        b.flush();
    }

    private void a(m m1)
    {
        h h1 = m1.f();
        m1 = m1.a();
        b.writeByte(a(h1));
        a(2);
        b.writeShort(m1.a());
        b.flush();
    }

    private void a(n n1)
    {
        h h1 = n1.f();
        o o1 = n1.a();
        n1 = n1.c();
        byte abyte0[] = a(o1.a());
        int i = abyte0.length;
        byte byte0;
        int i1;
        if (h1.c() > 0)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        i1 = n1.length;
        b.writeByte(a(h1));
        a(byte0 + (i + 2) + i1);
        b.writeShort(abyte0.length);
        b.write(abyte0, 0, abyte0.length);
        if (h1.c() > 0)
        {
            b.writeShort(o1.b());
        }
        b.write(n1, 0, n1.length);
        b.flush();
    }

    private void a(p p1)
    {
        int i = p1.c().a().size();
        b.writeByte(a(p1.f()));
        a(2 + i);
        b.writeShort(p1.a().a());
        int i1;
        for (p1 = p1.c().a().iterator(); p1.hasNext(); b.writeByte(i1))
        {
            i1 = ((Integer)p1.next()).intValue();
        }

        b.flush();
    }

    private void a(r r1)
    {
        h h1 = r1.f();
        j j1 = r1.a();
        r1 = r1.c();
        Iterator iterator = r1.a().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = a(((SubscribeTopic)iterator.next()).a()).length + 2 + i + 1) { }
        b.writeByte(a(h1));
        a(2 + i);
        i = j1.a();
        b.writeShort(i);
        SubscribeTopic subscribetopic;
        for (r1 = r1.a().iterator(); r1.hasNext(); b.write(subscribetopic.b()))
        {
            subscribetopic = (SubscribeTopic)r1.next();
            byte abyte0[] = a(subscribetopic.a());
            b.writeShort(abyte0.length);
            b.write(abyte0, 0, abyte0.length);
        }

        b.flush();
    }

    private void a(u u1)
    {
        b.writeByte(a(u1.f()));
        a(2);
        b.writeShort(u1.a().a());
        b.flush();
    }

    private void a(v v1)
    {
        h h1 = v1.f();
        j j1 = v1.a();
        v1 = v1.c();
        Iterator iterator = v1.a().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = a((String)iterator.next()).length + 2 + i) { }
        b.writeByte(a(h1));
        a(2 + i);
        i = j1.a();
        b.writeShort(i);
        byte abyte0[];
        for (v1 = v1.a().iterator(); v1.hasNext(); b.write(abyte0, 0, abyte0.length))
        {
            abyte0 = a((String)v1.next());
            b.writeShort(abyte0.length);
        }

        b.flush();
    }

    private byte[] a(String s1)
    {
        try
        {
            s1 = s1.getBytes("utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new RuntimeException(s1);
        }
        return s1;
    }

    private void b(l l1)
    {
        l1 = l1.f();
        b.writeByte(a(l1));
        b.writeByte(0);
        b.flush();
    }

    private void c(l l1)
    {
        l1 = l1.f();
        b.writeByte(a(l1));
        b.writeByte(0);
        b.flush();
    }

    public void a(l l1)
    {
        this;
        JVM INSTR monitorenter ;
        k k1 = l1.e();
        com.facebook.mqtt.a.g.a[k1.ordinal()];
        JVM INSTR tableswitch 1 10: default 847
    //                   1 126
    //                   2 207
    //                   3 285
    //                   4 366
    //                   5 444
    //                   6 525
    //                   7 629
    //                   8 710
    //                   9 738
    //                   10 766;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        com.facebook.debug.log.b.a(a, "MQTT Packet unexpected send: %s", new Object[] {
            k1.toString()
        });
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown message type: ").append(l1.e().toString()).toString());
        l1;
        this;
        JVM INSTR monitorexit ;
        throw l1;
_L2:
        if (!(l1 instanceof a))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (a)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s retcode:%d", new Object[] {
            k1.toString(), Byte.valueOf(l1.a().a())
        });
        a(((a) (l1)));
_L12:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!(l1 instanceof r))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (r)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s topics:%s", new Object[] {
            k1.toString(), l1.c().a()
        });
        a(((r) (l1)));
          goto _L12
_L4:
        if (!(l1 instanceof p))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (p)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s id:%d", new Object[] {
            k1.toString(), Integer.valueOf(l1.a().a())
        });
        a(((p) (l1)));
          goto _L12
_L5:
        if (!(l1 instanceof v))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (v)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s topics:%s", new Object[] {
            k1.toString(), l1.c().a()
        });
        a(((v) (l1)));
          goto _L12
_L6:
        if (!(l1 instanceof u))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (u)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s id:%d", new Object[] {
            k1.toString(), Integer.valueOf(l1.a().a())
        });
        a(((u) (l1)));
          goto _L12
_L7:
        if (!(l1 instanceof n))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (n)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s id:%d qos:%d topic:%s", new Object[] {
            k1.toString(), Integer.valueOf(l1.a().b()), Integer.valueOf(l1.f().c()), l1.a().a()
        });
        a(((n) (l1)));
          goto _L12
_L8:
        if (!(l1 instanceof m))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (m)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s id:%d", new Object[] {
            k1.toString(), Integer.valueOf(l1.a().a())
        });
        a(((m) (l1)));
          goto _L12
_L9:
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s", new Object[] {
            k1.toString()
        });
        b(l1);
          goto _L12
_L10:
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s", new Object[] {
            k1.toString()
        });
        c(l1);
          goto _L12
_L11:
        if (!(l1 instanceof c))
        {
            throw new AssertionError((new StringBuilder()).append("Unexpected type: ").append(l1).toString());
        }
        l1 = (c)l1;
        com.facebook.debug.log.b.a(a, "MQTT Packet sending: %s timeout:%d", new Object[] {
            k1.toString(), Integer.valueOf(l1.a().h())
        });
        a(((c) (l1)));
          goto _L12
    }

    public void a(DataOutputStream dataoutputstream)
    {
        b = dataoutputstream;
    }

}
