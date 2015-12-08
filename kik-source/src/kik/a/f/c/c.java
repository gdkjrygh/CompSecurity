// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.c;

import com.kik.m.e;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kik.a.d.j;
import kik.a.d.z;
import kik.a.e.o;
import kik.a.f.g;
import kik.a.f.n;
import kik.a.h.h;
import org.d.a.b;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;

// Referenced classes of package kik.a.f.c:
//            g

public abstract class c extends kik.a.f.c.g
{

    private static final org.c.b k = org.c.c.a("IncomingMessageAbstract");
    protected j a;
    protected j b;
    protected j c;
    protected String d;
    protected String e;
    protected long f;
    protected boolean g;
    protected boolean h;
    protected List i;
    private boolean j;
    private byte l[];
    private ECPublicKey m;
    private boolean n;
    private long o;

    protected c(int i1)
    {
        super(i1);
        g = false;
        h = false;
        j = false;
        i = new ArrayList();
    }

    protected void a()
    {
        if (c == null)
        {
            c = b;
        }
    }

    protected void a(n n1)
    {
        if (n1.a("request") && "kik:message:receipt".equals(n1.getAttributeValue(null, "xmlns")))
        {
            g = "true".equals(n1.getAttributeValue(null, "d"));
            h = "true".equals(n1.getAttributeValue(null, "r"));
            return;
        }
        if (n1.a("g"))
        {
            c = kik.a.d.j.a(n1.getAttributeValue(null, "jid"));
            return;
        } else
        {
            n1.skipSubTree();
            return;
        }
    }

    public final void a(n n1, KeyPair keypair, o o1)
    {
        if (!n1.a("message") && !n1.a("msg"))
        {
            throw new b("Not at start of message");
        }
        String s;
        b = kik.a.d.j.a(n1.getAttributeValue(null, "from"));
        s = n1.getAttributeValue(null, "to");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a = kik.a.d.j.a(s);
        long l1;
        e = n1.getAttributeValue(null, "id");
        if (e == null)
        {
            e = Long.toString((new Random()).nextLong(), 16);
        }
        f = kik.a.h.j.b();
        d = null;
        l1 = System.currentTimeMillis();
        if (keypair == null)
        {
            break MISSING_BLOCK_LABEL_824;
        }
        s = com.kik.m.e.b(keypair.getPublic().getEncoded());
_L25:
        long l2;
        l2 = System.currentTimeMillis();
        n1.next();
        l1 = 0L + (l2 - l1);
_L10:
        if (n1.b("message") || n1.b("msg"))
        {
            break MISSING_BLOCK_LABEL_808;
        }
        if (!n1.a("keys")) goto _L2; else goto _L1
_L1:
        l2 = System.currentTimeMillis();
_L7:
        if (n1.b("keys")) goto _L4; else goto _L3
_L3:
        boolean flag;
        n1.next();
        flag = n1.a("s");
        if (!flag) goto _L6; else goto _L5
_L5:
        m = kik.a.h.h.a(com.kik.m.e.a(n1.getAttributeValue(null, "pub"), 16));
          goto _L7
        keypair;
        try
        {
            throw new g(keypair);
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            n = true;
            j = true;
            for (; !n1.b("message") && !n1.b("msg"); n1.a(true))
            {
                if (n1.a("g"))
                {
                    c = kik.a.d.j.a(n1.getAttributeValue(null, "jid"));
                }
            }

        }
        break MISSING_BLOCK_LABEL_819;
        keypair;
        throw new g(keypair);
        keypair;
        throw new g(keypair);
_L6:
        if (!n1.a("r")) goto _L7; else goto _L8
_L8:
        String s1;
        String s2;
        s1 = n1.getAttributeValue(null, "pub");
        s2 = n1.getAttributeValue(null, "key");
        if (!s.equals(s1)) goto _L7; else goto _L9
_L9:
        byte abyte0[] = com.kik.m.e.a(s2, 16);
        if (keypair == null || o1 == null)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        l = o1.b(abyte0, m, (ECPrivateKey)keypair.getPrivate());
        n1.a(l);
          goto _L7
_L4:
        l1 += System.currentTimeMillis() - l2;
_L11:
        n1.next();
          goto _L10
_L2:
label0:
        {
            if (!n1.a("body"))
            {
                break label0;
            }
            d = n1.nextText();
            if (d != null && d.length() > 2048)
            {
                d = d.substring(0, 2048);
            }
        }
          goto _L11
        if (!n1.a("kik"))
        {
            break MISSING_BLOCK_LABEL_608;
        }
        s2 = n1.getAttributeValue(null, "timestamp");
        if (s2 != null) goto _L13; else goto _L12
_L12:
        f = kik.a.h.j.b() - 0x496cebb800L;
_L14:
        NumberFormatException numberformatexception;
        String s3;
        if (!"false".equals(n1.getAttributeValue(null, "qos")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
          goto _L11
_L13:
        f = Long.parseLong(s2);
          goto _L14
        numberformatexception;
        f = (long)Float.parseFloat(s2);
          goto _L14
        keypair;
        throw new b((new StringBuilder("Number format exception in timestamp: ")).append(numberformatexception.getMessage()).toString());
        if (!n1.a("suggested-responses")) goto _L16; else goto _L15
_L15:
        if (!n1.b("suggested-responses"))
        {
            n1.next();
        }
_L22:
        if (n1.b("suggested-responses")) goto _L11; else goto _L17
_L17:
        if (i.size() >= 7) goto _L19; else goto _L18
_L18:
        s3 = n1.getName();
        numberformatexception = n1.nextText();
        if (!s3.equals("text")) goto _L21; else goto _L20
_L20:
        s2 = numberformatexception.replace("\n", " ").trim();
        numberformatexception = s2;
        if (s2.length() > 20)
        {
            numberformatexception = s2.substring(0, 20);
        }
        i.add(new z(s3, numberformatexception));
_L19:
        n1.next();
          goto _L22
_L21:
        if (numberformatexception.length() <= 0 || numberformatexception.length() > 0x1f400) goto _L19; else goto _L23
_L23:
        i.add(new z(s3, numberformatexception));
          goto _L19
_L16:
        if (!n1.a(null)) goto _L11; else goto _L24
_L24:
        a(n1);
          goto _L11
        n1.a(null);
        o = l1;
        a();
        return;
        s = "";
          goto _L25
    }

    public final byte[] c()
    {
        return l;
    }

    public final boolean d()
    {
        return n;
    }

    public final long e()
    {
        return o;
    }

    public final boolean f()
    {
        return j;
    }

    public final boolean g()
    {
        return g;
    }

    public final String h()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.a();
        }
    }

    public final String i()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return c.a();
        }
    }

    public final String j()
    {
        return e;
    }

    public final long k()
    {
        return f;
    }

}
