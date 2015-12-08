// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.e;
import c.g;
import c.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.c.a:
//            r, p, x

public final class s
{
    private static final class a extends x
    {

        private final i a;
        private final r b;
        private final List c;
        private final List d;
        private long e;

        private long a(g g1, boolean flag)
            throws IOException
        {
            long l2 = 0L;
            g g2;
            x x1;
            Object obj;
            int i1;
            int j1;
            int k1;
            int l1;
            long l3;
            if (flag)
            {
                g1 = new e();
                g2 = g1;
            } else
            {
                g2 = null;
            }
            k1 = c.size();
            i1 = 0;
            if (i1 >= k1) goto _L2; else goto _L1
_L1:
            obj = (p)c.get(i1);
            x1 = (x)d.get(i1);
            g1.b(s.a());
            g1.b(a);
            g1.b(s.b());
            if (obj != null)
            {
                j1 = 0;
                for (l1 = ((p) (obj)).a.length / 2; j1 < l1; j1++)
                {
                    g1.b(((p) (obj)).a(j1)).b(s.c()).b(((p) (obj)).b(j1)).b(s.b());
                }

            }
            obj = x1.contentType();
            if (obj != null)
            {
                g1.b("Content-Type: ").b(((r) (obj)).toString()).b(s.b());
            }
            l3 = x1.contentLength();
            if (l3 == -1L) goto _L4; else goto _L3
_L3:
            g1.b("Content-Length: ").j(l3).b(s.b());
_L6:
            g1.b(s.b());
            if (flag)
            {
                l2 = l3 + l2;
            } else
            {
                ((x)d.get(i1)).writeTo(g1);
            }
            g1.b(s.b());
            i1++;
            break MISSING_BLOCK_LABEL_31;
_L4:
            if (!flag) goto _L6; else goto _L5
_L5:
            g2.n();
            l3 = -1L;
_L8:
            return l3;
_L2:
            g1.b(s.a());
            g1.b(a);
            g1.b(s.a());
            g1.b(s.b());
            l3 = l2;
            if (flag)
            {
                l3 = ((e) (g2)).b;
                g2.n();
                return l2 + l3;
            }
            if (true) goto _L8; else goto _L7
_L7:
        }

        public final long contentLength()
            throws IOException
        {
            long l1 = e;
            if (l1 != -1L)
            {
                return l1;
            } else
            {
                long l2 = a(null, true);
                e = l2;
                return l2;
            }
        }

        public final r contentType()
        {
            return b;
        }

        public final void writeTo(g g1)
            throws IOException
        {
            a(g1, false);
        }

        public a(r r1, i i1, List list, List list1)
        {
            e = -1L;
            if (r1 == null)
            {
                throw new NullPointerException("type == null");
            } else
            {
                a = i1;
                b = r.a((new StringBuilder()).append(r1).append("; boundary=").append(i1.a()).toString());
                c = com.c.a.a.i.a(list);
                d = com.c.a.a.i.a(list1);
                return;
            }
        }
    }


    public static final r a = r.a("multipart/mixed");
    public static final r b = r.a("multipart/alternative");
    public static final r c = r.a("multipart/digest");
    public static final r d = r.a("multipart/parallel");
    public static final r e = r.a("multipart/form-data");
    private static final byte j[] = {
        58, 32
    };
    private static final byte k[] = {
        13, 10
    };
    private static final byte l[] = {
        45, 45
    };
    public final i f;
    public r g;
    public final List h;
    public final List i;

    public s()
    {
        this(UUID.randomUUID().toString());
    }

    private s(String s1)
    {
        g = a;
        h = new ArrayList();
        i = new ArrayList();
        f = c.i.a(s1);
    }

    private static StringBuilder a(StringBuilder stringbuilder, String s1)
    {
        int i1;
        int j1;
        stringbuilder.append('"');
        i1 = 0;
        j1 = s1.length();
_L6:
        char c1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        c1 = s1.charAt(i1);
        c1;
        JVM INSTR lookupswitch 3: default 64
    //                   10: 77
    //                   13: 87
    //                   34: 97;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_97;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuilder.append(c1);
_L7:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        stringbuilder.append("%0A");
          goto _L7
_L3:
        stringbuilder.append("%0D");
          goto _L7
        stringbuilder.append("%22");
          goto _L7
        stringbuilder.append('"');
        return stringbuilder;
    }

    static byte[] a()
    {
        return l;
    }

    static byte[] b()
    {
        return k;
    }

    static byte[] c()
    {
        return j;
    }

    public final s a(String s1, String s2, x x)
    {
        if (s1 == null)
        {
            throw new NullPointerException("name == null");
        }
        StringBuilder stringbuilder = new StringBuilder("form-data; name=");
        a(stringbuilder, s1);
        if (s2 != null)
        {
            stringbuilder.append("; filename=");
            a(stringbuilder, s2);
        }
        s1 = p.a(new String[] {
            "Content-Disposition", stringbuilder.toString()
        });
        if (x == null)
        {
            throw new NullPointerException("body == null");
        }
        if (s1.a("Content-Type") != null)
        {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (s1.a("Content-Length") != null)
        {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        } else
        {
            h.add(s1);
            i.add(x);
            return this;
        }
    }

}
