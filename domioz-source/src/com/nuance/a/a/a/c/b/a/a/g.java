// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.a;

import com.nuance.a.a.a.a.d.a.c;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.f;
import com.nuance.a.a.a.c.b.a.b.h;
import com.nuance.a.a.a.c.b.c.a;
import com.nuance.a.a.a.c.b.c.b;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.b.a.a:
//            c, f, h, a, 
//            b

public class g
    implements c
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/b/a/a/g);
    private long b;
    private com.nuance.a.a.a.c.b.c.c c;
    private boolean d;
    private com.nuance.a.a.a.a.d.a.a e;
    private byte f[];
    private int g;
    private com.nuance.a.a.a.c.b.a.a.f h;
    private List i;

    public g(String s, short word0, String s1, byte abyte0[], int j, int k, String s2, 
            Vector vector, String s3, com.nuance.a.a.a.a.d.a.a a1, com.nuance.a.a.a.c.b.a.a.f f1)
    {
        new LinkedList();
        b = 0L;
        d = false;
        f = null;
        g = 0;
        h = null;
        i = new LinkedList();
        com.nuance.a.a.a.a.c.b.a("CalllogImpl(uid)", s3);
        a(s, word0, abyte0, s1, s3, vector);
        g = j;
        e = a1;
        h = f1;
        if (s2 == null)
        {
            s = UUID.randomUUID().toString();
        } else
        {
            s = s2;
        }
        try
        {
            c = com.nuance.a.a.a.c.b.a.a.c.a(s, "CLIENT", "2.0", k, this, "CLIENT").a("Uid", s3).a("Nmaid", s1).a("client_hardware_model", com.nuance.a.a.a.c.c.b.a()).a("client_hardware_submodel", com.nuance.a.a.a.b.d.g().c()).a("client_os_type", com.nuance.a.a.a.c.c.b.b()).a("client_os_version", com.nuance.a.a.a.c.c.b.c()).a("client_sdk_release", "NMSP 5.2_2 client SDK - build 019").a("Origin", "Client").a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void a(String s, short word0, byte abyte0[], String s1, String s2, List list)
    {
        byte abyte1[] = s.getBytes();
        byte abyte2[] = s1.getBytes();
        s2 = s2.getBytes();
        s = new byte[1];
        byte byte0 = (byte)word0;
        byte byte2 = (byte)(word0 >> 8);
        int j;
        if (list == null)
        {
            s[0] = 0;
        } else
        {
            s[0] = (byte)list.size();
        }
        j = abyte1.length + 5 + 4 + 2 + 4 + abyte2.length + 4 + abyte0.length + 4 + s2.length + 4;
        for (word0 = 0; word0 < s[0]; word0++)
        {
            if (!(list.get(word0) instanceof com.nuance.a.a.a.c.c.c))
            {
                return;
            }
            s1 = (com.nuance.a.a.a.c.c.c)list.get(word0);
            j = j + 4 + s1.a().length() + 4 + 2 + 4 + s1.b().length;
        }

        s1 = ByteBuffer.allocate(j);
        try
        {
            a(abyte1, ((ByteBuffer) (s1)), true);
            a(new byte[] {
                byte0, byte2
            }, ((ByteBuffer) (s1)), true);
            a(abyte2, ((ByteBuffer) (s1)), true);
            a(abyte0, ((ByteBuffer) (s1)), true);
            a(((byte []) (s2)), ((ByteBuffer) (s1)), true);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            s1.clear();
            if (a.e())
            {
                a.b((new StringBuilder("serializeEvents() failed : ")).append(abyte0.getMessage()).toString());
            }
            continue;
        }
        do
        {
            a(((byte []) (s)), ((ByteBuffer) (s1)), true);
            word0 = 0;
            do
            {
                if (word0 >= s[0])
                {
                    break;
                }
                abyte0 = (com.nuance.a.a.a.c.c.c)list.get(word0);
                try
                {
                    byte byte1 = (byte)abyte0.d().a();
                    byte byte3 = (byte)(abyte0.d().a() >> 8);
                    a(abyte0.a().getBytes(), ((ByteBuffer) (s1)), true);
                    a(new byte[] {
                        byte1, byte3
                    }, ((ByteBuffer) (s1)), true);
                    a(abyte0.b(), ((ByteBuffer) (s1)), true);
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    s1.clear();
                    if (a.e())
                    {
                        a.b((new StringBuilder("serializeEvents() failed : ")).append(abyte0.getMessage()).toString());
                    }
                }
                word0++;
            } while (true);
            f = s1.array();
            return;
        } while (true);
    }

    private void a(boolean flag)
    {
        if (i.size() == 0)
        {
            if (flag)
            {
                h.a(null);
            }
            return;
        }
        h h2 = new h();
        com.nuance.a.a.a.c.b.a.b.b b1 = new com.nuance.a.a.a.c.b.a.b.b();
        LinkedList linkedlist = new LinkedList();
        int j = 0;
        do
        {
            if (i.size() <= 0)
            {
                break;
            }
            Object obj = (com.nuance.a.a.a.c.b.b.a)i.remove(0);
            b1.a(((com.nuance.a.a.a.c.b.b.a) (obj)));
            com.nuance.a.a.a.c.b.b.b b2 = ((com.nuance.a.a.a.c.b.b.a) (obj)).k("meta");
            obj = "";
            String s = "";
            int k = 0;
            int l = 0;
            while (k < b2.a()) 
            {
                com.nuance.a.a.a.c.b.b.a a1 = b2.f(k);
                String s2 = a1.i("k");
                String s1;
                int i1;
                if (s2.equals("RootParentId"))
                {
                    s1 = a1.h("v");
                    i1 = l;
                } else
                if (s2.equals("SeqId"))
                {
                    i1 = a1.f("v");
                    s1 = ((String) (obj));
                } else
                {
                    i1 = l;
                    s1 = ((String) (obj));
                    if (s2.equals("Name"))
                    {
                        s = a1.h("v");
                        i1 = l;
                        s1 = ((String) (obj));
                    }
                }
                k++;
                l = i1;
                obj = s1;
            }
            if (flag && j == 0)
            {
                linkedlist.add((new StringBuilder("###flushed###:")).append(s).append(":").append(((String) (obj))).append(".").append(l).toString());
            } else
            {
                linkedlist.add((new StringBuilder()).append(s).append(":").append(((String) (obj))).append(".").append(l).toString());
            }
            j++;
        } while (true);
        h2.a("events", b1);
        com.nuance.a.a.a.c.b.a.a.h h1 = new com.nuance.a.a.a.c.b.a.a.h();
        h1.a = c.g();
        h1.b = h2.e();
        byte abyte0[] = a(h1);
        if (abyte0 == null)
        {
            a.b("CalllogImpl.close serialized data is null");
        }
        b = 0L;
        h.a(abyte0);
    }

    private static void a(byte abyte0[], ByteBuffer bytebuffer, boolean flag)
    {
        if (flag)
        {
            int j = abyte0.length;
            byte abyte1[][] = new byte[2][];
            byte byte0 = (byte)j;
            byte byte1 = (byte)(j >> 8);
            byte byte2 = (byte)(j >> 16);
            byte byte3 = (byte)(j >>> 24);
            abyte1[0] = (new byte[] {
                4
            });
            abyte1[1] = (new byte[] {
                byte0, byte1, byte2, byte3
            });
            bytebuffer.put(abyte1[1], 0, abyte1[1].length);
        }
        bytebuffer.put(abyte0, 0, abyte0.length);
    }

    private byte[] a(com.nuance.a.a.a.c.b.a.a.h h1)
    {
        byte abyte0[];
        byte abyte1[] = new byte[4];
        int j = f.length + 28 + 4 + h1.b.length + 4 + h1.a.getBytes().length;
        abyte0 = ByteBuffer.allocate(j);
        com.nuance.a.a.a.a.c.c.a(j, abyte1, 0);
        a(abyte1, ((ByteBuffer) (abyte0)), true);
        abyte0.put(new byte[20]);
        a(f, ((ByteBuffer) (abyte0)), false);
        if (h1.b.length == 0)
        {
            return null;
        }
        a(h1.b, ((ByteBuffer) (abyte0)), true);
        a(h1.a.getBytes(), ((ByteBuffer) (abyte0)), true);
_L2:
        h1 = com.nuance.a.a.a.a.d.a.f.c("b84798d890d847063ac0145b627a1ecfe4538006".getBytes(), abyte0.array());
        abyte0 = abyte0.array();
        System.arraycopy(h1, 0, abyte0, 8, h1.length);
        return abyte0;
        h1;
        abyte0.clear();
        if (a.e())
        {
            a.b((new StringBuilder("serializeEvents() failed : ")).append(h1.getMessage()).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void b(com.nuance.a.a.a.c.b.a.a.a a1)
    {
        a1.c();
    }

    public final com.nuance.a.a.a.c.b.c.c a()
    {
        return c;
    }

    final void a(com.nuance.a.a.a.c.b.a.a.a a1)
    {
        if (d)
        {
            return;
        } else
        {
            e.a(new com.nuance.a.a.a.a.d.a.b((byte)16, ((Object) (new Object[] {
                a1
            }))), this, Thread.currentThread(), e.a()[0]);
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (com.nuance.a.a.a.a.d.a.b)obj;
        switch (((com.nuance.a.a.a.a.d.a.b) (obj)).a)
        {
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        default:
            return;

        case 16: // '\020'
            obj = (com.nuance.a.a.a.c.b.a.a.a)((Object[])((com.nuance.a.a.a.a.d.a.b) (obj)).b)[0];
            obj1 = new com.nuance.a.a.a.c.b.a.a.h();
            ((com.nuance.a.a.a.c.b.a.a.a) (obj)).e();
            com.nuance.a.a.a.c.b.b.a a1 = ((com.nuance.a.a.a.c.b.a.a.a) (obj)).b();
            i.add(a1);
            obj1.b = ((com.nuance.a.a.a.c.b.a.a.a) (obj)).a();
            obj1.a = (new StringBuilder()).append(((com.nuance.a.a.a.c.b.a.a.a) (obj)).a.h()).append(((com.nuance.a.a.a.c.b.a.a.a) (obj)).d).toString();
            if (((com.nuance.a.a.a.c.b.a.a.h) (obj1)).b.length > 0x249f0)
            {
                a.b("Trying to add new event larger than : 150000");
                return;
            }
            if (b + 4L + 4L + (long)f.length + 4L + (long)((com.nuance.a.a.a.c.b.a.a.h) (obj1)).b.length + 4L + (long)((com.nuance.a.a.a.c.b.a.a.h) (obj1)).a.getBytes().length > (long)g)
            {
                a(false);
            }
            b = b + (long)((com.nuance.a.a.a.c.b.a.a.h) (obj1)).b.length;
            b = b + 4L;
            long l = b;
            b = (long)((com.nuance.a.a.a.c.b.a.a.h) (obj1)).a.getBytes().length + l;
            b = b + 4L;
            return;

        case 21: // '\025'
            a(((Boolean)((Object[])((com.nuance.a.a.a.a.d.a.b) (obj)).b)[0]).booleanValue());
            return;

        case 22: // '\026'
            h.a(null);
            return;
        }
    }

    public final void b()
    {
        e.a(new com.nuance.a.a.a.a.d.a.b((byte)21, ((Object) (new Object[] {
            new Boolean(false)
        }))), this, Thread.currentThread(), e.a()[0]);
    }

    public final void c()
    {
        e.a(new com.nuance.a.a.a.a.d.a.b((byte)22, null), this, Thread.currentThread(), e.a()[0]);
    }

    public final String d()
    {
        return ((com.nuance.a.a.a.c.b.a.a.b)c).h();
    }

}
