// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.c;

import java.security.KeyPair;
import java.util.HashMap;
import kik.a.e.o;
import kik.a.f.g;
import kik.a.f.n;
import org.c.c;
import org.d.a.b;

// Referenced classes of package kik.a.f.c:
//            a, b, d, c, 
//            f

public final class e
{

    private static final org.c.b a = c.a("IncomingRouting");
    private static final HashMap b;

    public static kik.a.f.c.c a(n n1, KeyPair keypair, o o)
    {
        Object obj;
        Object obj1;
        String s;
        obj = null;
        n1.a(null, null);
        s = n1.getName();
        if (!"message".equals(s) && !"msg".equals(s))
        {
            break MISSING_BLOCK_LABEL_199;
        }
        obj1 = n1.getAttributeValue(null, "type");
        if (b.containsKey(obj1))
        {
            obj = (Class)b.get(obj1);
            try
            {
                obj = (kik.a.f.c.c)((Class) (obj)).newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (n n1)
            {
                a.b((new StringBuilder("Class map failed to instantiate class for type: ")).append(((String) (obj1))).toString());
                throw new RuntimeException(n1);
            }
        } else
        {
            obj = new f();
        }
        obj1 = obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        ((kik.a.f.c.c) (obj)).a(n1, keypair, o);
        obj1 = obj;
_L1:
        if (obj1 == null && n1.a(s))
        {
            n1.skipSubTree();
        }
        if (((kik.a.f.c.c) (obj1)).i() == null || ((kik.a.f.c.c) (obj1)).h() == null)
        {
            throw new b("Message is missing bin or corrospondent");
        } else
        {
            return ((kik.a.f.c.c) (obj1));
        }
        keypair;
        a.b("Encryption error parsing stanza", keypair);
        obj1 = obj;
          goto _L1
        obj1 = obj;
        if ("iq".equals(s))
        {
            n1.a(3, "iq");
            obj1 = obj;
        }
          goto _L1
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("chat", kik/a/f/c/a);
        b.put("groupchat", kik/a/f/c/a);
        b.put("pic", kik/a/f/c/a);
        b.put("is-typing", kik/a/f/c/a);
        b.put("scan-notification", kik/a/f/c/a);
        b.put("error", kik/a/f/c/b);
        b.put("receipt", kik/a/f/c/d);
    }
}
