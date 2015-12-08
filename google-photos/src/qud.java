// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class qud extends qtx
{

    private static Logger o = Logger.getLogger(qud.getName());
    public int a;
    public int b;
    public int c;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public qua m;
    public quj n;
    private List p;

    public qud()
    {
        i = 0;
        p = new ArrayList();
    }

    public final int a()
    {
        int j1 = 5;
        if (b > 0)
        {
            j1 = 7;
        }
        int i1 = j1;
        if (c > 0)
        {
            i1 = j1 + (i + 1);
        }
        j1 = i1;
        if (g > 0)
        {
            j1 = i1 + 2;
        }
        return j1 + m.a() + 3;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        byte byte0 = 0;
        a = b.c(bytebuffer);
        int i1 = b.a(bytebuffer.get());
        b = i1 >>> 7;
        c = i1 >>> 6 & 1;
        g = i1 >>> 5 & 1;
        h = i1 & 0x1f;
        if (b == 1)
        {
            k = b.c(bytebuffer);
        }
        if (c == 1)
        {
            i = b.a(bytebuffer.get());
            j = b.a(bytebuffer, i);
        }
        if (g == 1)
        {
            l = b.c(bytebuffer);
        }
        int i2 = super.f;
        Object obj;
        int j1;
        long l2;
        if (b == 1)
        {
            i1 = 2;
        } else
        {
            i1 = 0;
        }
        if (c == 1)
        {
            j1 = i + 1;
        } else
        {
            j1 = 0;
        }
        if (g == 1)
        {
            byte0 = 2;
        }
        i1 = j1 + (i2 + 1 + 2 + 1 + i1) + byte0;
        j1 = bytebuffer.position();
        if (b() > i1 + 2)
        {
            qtx qtx1 = quh.a(-1, bytebuffer);
            l2 = bytebuffer.position() - j1;
            Logger logger = o;
            String s = String.valueOf(qtx1);
            int l1;
            if (qtx1 != null)
            {
                obj = Integer.valueOf(qtx1.b());
            } else
            {
                obj = null;
            }
            obj = String.valueOf(obj);
            logger.finer((new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(obj).length())).append(s).append(" - ESDescriptor1 read: ").append(l2).append(", size: ").append(((String) (obj))).toString());
            if (qtx1 != null)
            {
                int k1 = qtx1.b();
                bytebuffer.position(j1 + k1);
                j1 = k1 + i1;
            } else
            {
                j1 = (int)((long)i1 + l2);
            }
            i1 = j1;
            if (qtx1 instanceof qua)
            {
                m = (qua)qtx1;
                i1 = j1;
            }
        }
        j1 = bytebuffer.position();
        if (b() > i1 + 2)
        {
            qtx1 = quh.a(-1, bytebuffer);
            l2 = bytebuffer.position() - j1;
            logger = o;
            s = String.valueOf(qtx1);
            if (qtx1 != null)
            {
                obj = Integer.valueOf(qtx1.b());
            } else
            {
                obj = null;
            }
            obj = String.valueOf(obj);
            logger.finer((new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(obj).length())).append(s).append(" - ESDescriptor2 read: ").append(l2).append(", size: ").append(((String) (obj))).toString());
            if (qtx1 != null)
            {
                l1 = qtx1.b();
                bytebuffer.position(j1 + l1);
                j1 = i1 + l1;
            } else
            {
                j1 = (int)((long)i1 + l2);
            }
            i1 = j1;
            if (qtx1 instanceof quj)
            {
                n = (quj)qtx1;
                i1 = j1;
            }
        } else
        {
            o.warning("SLConfigDescriptor is missing!");
        }
        while (b() - i1 > 2) 
        {
            j1 = bytebuffer.position();
            qtx1 = quh.a(-1, bytebuffer);
            l2 = bytebuffer.position() - j1;
            logger = o;
            s = String.valueOf(qtx1);
            if (qtx1 != null)
            {
                obj = Integer.valueOf(qtx1.b());
            } else
            {
                obj = null;
            }
            obj = String.valueOf(obj);
            logger.finer((new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(obj).length())).append(s).append(" - ESDescriptor3 read: ").append(l2).append(", size: ").append(((String) (obj))).toString());
            if (qtx1 != null)
            {
                l1 = qtx1.b();
                bytebuffer.position(j1 + l1);
                i1 += l1;
            } else
            {
                i1 = (int)(l2 + (long)i1);
            }
            p.add(qtx1);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (qud)obj;
            if (c != ((qud) (obj)).c)
            {
                return false;
            }
            if (i != ((qud) (obj)).i)
            {
                return false;
            }
            if (k != ((qud) (obj)).k)
            {
                return false;
            }
            if (a != ((qud) (obj)).a)
            {
                return false;
            }
            if (l != ((qud) (obj)).l)
            {
                return false;
            }
            if (g != ((qud) (obj)).g)
            {
                return false;
            }
            if (b != ((qud) (obj)).b)
            {
                return false;
            }
            if (h != ((qud) (obj)).h)
            {
                return false;
            }
            if (j == null ? ((qud) (obj)).j != null : !j.equals(((qud) (obj)).j))
            {
                return false;
            }
            if (m == null ? ((qud) (obj)).m != null : !m.equals(((qud) (obj)).m))
            {
                return false;
            }
            if (p == null ? ((qud) (obj)).p != null : !p.equals(((qud) (obj)).p))
            {
                return false;
            }
            if (n == null ? ((qud) (obj)).n != null : !n.equals(((qud) (obj)).n))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int l1 = 0;
        int i2 = a;
        int j2 = b;
        int k2 = c;
        int l2 = g;
        int i3 = h;
        int j3 = i;
        int i1;
        int j1;
        int k1;
        int k3;
        int l3;
        if (j != null)
        {
            i1 = j.hashCode();
        } else
        {
            i1 = 0;
        }
        k3 = k;
        l3 = l;
        if (m != null)
        {
            j1 = m.hashCode();
        } else
        {
            j1 = 0;
        }
        if (n != null)
        {
            k1 = n.hashCode();
        } else
        {
            k1 = 0;
        }
        if (p != null)
        {
            l1 = p.hashCode();
        }
        return (k1 + (j1 + (((i1 + (((((i2 * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31) * 31 * 31 + k3) * 31 + l3) * 31) * 31) * 31 + l1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ESDescriptor");
        stringbuilder.append("{esId=").append(a);
        stringbuilder.append(", streamDependenceFlag=").append(b);
        stringbuilder.append(", URLFlag=").append(c);
        stringbuilder.append(", oCRstreamFlag=").append(g);
        stringbuilder.append(", streamPriority=").append(h);
        stringbuilder.append(", URLLength=").append(i);
        stringbuilder.append(", URLString='").append(j).append('\'');
        stringbuilder.append(", remoteODFlag=0");
        stringbuilder.append(", dependsOnEsId=").append(k);
        stringbuilder.append(", oCREsId=").append(l);
        stringbuilder.append(", decoderConfigDescriptor=").append(m);
        stringbuilder.append(", slConfigDescriptor=").append(n);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
