// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.kik.m.e;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kik.a.d.a.f;
import kik.a.d.a.g;
import kik.a.d.s;
import kik.a.f.e.h;
import kik.a.f.e.i;
import kik.a.f.j;
import kik.a.f.o;
import kik.a.f.t;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;

// Referenced classes of package kik.a.f.f:
//            z

public final class v extends z
{

    protected final s a;
    protected final String b;
    private final kik.a.e.o c;
    private byte d[];
    private List e;
    private KeyPair i;
    private String j;
    private long k;

    private v(s s1, j j1, String s2, String s3, List list, KeyPair keypair, kik.a.e.o o1)
    {
        super(j1);
        d = s1.o();
        e = list;
        i = keypair;
        c = o1;
        if (!a(list, keypair))
        {
            d = null;
        }
        j = s2;
        if (!s1.d())
        {
            throw new IllegalArgumentException("Can't send an outgoing message from somebody else");
        }
        if (s1.i() == null || s1.h() == null)
        {
            throw new IllegalArgumentException("Can't send message with no identifier");
        } else
        {
            a = s1;
            b = s3;
            return;
        }
    }

    public static v a(s s1, List list, KeyPair keypair, kik.a.e.o o1, j j1)
    {
        return new v(s1, j1, "groupchat", "kik:groups", list, keypair, o1);
    }

    public static boolean a(List list, KeyPair keypair)
    {
        if (list == null || list.isEmpty() || keypair == null)
        {
            return false;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            if ((ECPublicKey)list.next() == null)
            {
                return false;
            }
        }

        return true;
    }

    public static v b(s s1, List list, KeyPair keypair, kik.a.e.o o1, j j1)
    {
        s1 = new v(s1, j1, "chat", null, list, keypair, o1);
        if (((v) (s1)).j.equals("chat") && g.a(((v) (s1)).a, kik/a/d/a/f) != null)
        {
            s1.j = "is-typing";
        }
        return s1;
    }

    private void b(o o1)
    {
        Vector vector = a.l();
        for (int i1 = 0; i1 < vector.size(); i1++)
        {
            i l = h.a((g)vector.elementAt(i1));
            if (l != null)
            {
                k = k + l.a(o1, (g)vector.elementAt(i1));
            }
        }

    }

    public final void a(o o1)
    {
        boolean flag2 = true;
        int l = g.c(a);
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        if ((l & 4) != 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if ((l & 8) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if ((l & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((l & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        o1.a("message");
        o1.a("type", j);
        if (b != null)
        {
            o1.a("xmlns", b);
        }
        o1.a("to", a.i());
        o1.a("id", a.b());
        if (f && flag3)
        {
            o1.a("cts", Long.toString(g));
        }
        if (d == null)
        {
            flag2 = false;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        String s1;
        String s3;
        try
        {
            byte abyte0[] = d;
            o1.a("keys");
            o1.a("s");
            o1.a("pub", com.kik.m.e.b(i.getPublic().getEncoded()));
            o1.b("s");
            if (c != null)
            {
                for (Iterator iterator = e.iterator(); iterator.hasNext(); o1.b("r"))
                {
                    ECPublicKey ecpublickey = (ECPublicKey)iterator.next();
                    byte abyte1[] = c.a(abyte0, ecpublickey, (ECPrivateKey)i.getPrivate());
                    o1.a("r");
                    o1.a("key", com.kik.m.e.b(abyte1));
                    o1.a("pub", com.kik.m.e.b(ecpublickey.getEncoded()));
                }

            }
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            throw new kik.a.f.g(o1);
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            throw new kik.a.f.g(o1);
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            throw new kik.a.f.g(o1);
        }
        o1.b("keys");
        o1.a(d);
        s3 = a.a();
        if (s3 != null)
        {
            o1.a("body");
            o1.a();
            o1.c(s3);
            k = k + o1.b();
            o1.b("body");
        }
        if (a.r() == kik.a.d.s.a.b)
        {
            o1.b("suggested-response", "");
        }
        if (s3 != null)
        {
            s1 = s3;
            if (kik.a.h.i.e(s3) > 10)
            {
                s1 = (new StringBuilder()).append(kik.a.h.i.d(s3).trim()).append("...").toString();
            }
            o1.b("preview", s1);
        }
        t.a(o1, flag4, flag3, g);
        if (flag || flag1)
        {
            o1.a("request");
            o1.a("xmlns", "kik:message:receipt");
            String s2;
            if (flag1)
            {
                s2 = "true";
            } else
            {
                s2 = "false";
            }
            o1.a("r", s2);
            if (flag)
            {
                s2 = "true";
            } else
            {
                s2 = "false";
            }
            o1.a("d", s2);
            o1.b("request");
        }
        b(o1);
        o1.b("message");
        o1.c();
        o1.a(null);
        a.a(k);
        return;
    }

    public final boolean a(long l)
    {
        return false;
    }

    public final boolean a(z z1)
    {
        if (z1 instanceof v)
        {
            z1 = (v)z1;
            if (g.a(a, kik/a/d/a/f) != null && g.a(((v) (z1)).a, kik/a/d/a/f) != null)
            {
                return a.i().equals(((v) (z1)).a.i());
            }
        }
        return false;
    }

    public final boolean c()
    {
        return g.a(a, kik/a/d/a/f) == null;
    }

    public final void d()
    {
        d = null;
    }

    public final s e()
    {
        return a;
    }

    public final String l_()
    {
        return a.b();
    }

    public final long m_()
    {
        return -1L;
    }
}
