// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b;

import com.kik.g.as;
import com.kik.g.k;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.m.o;
import com.kik.n.a.g.a;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import kik.a.h.h;
import kik.a.j.m;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.spec.ECParameterSpec;
import org.spongycastle.jce.spec.ECPublicKeySpec;
import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package kik.a.b:
//            a, c

final class b
    implements as
{

    final kik.a.b.a a;

    b(kik.a.b.a a1)
    {
        a = a1;
        super();
    }

    private p a(o o1)
    {
        Object obj;
        Object obj1;
        p p;
        a a1;
        boolean flag;
        obj = (a)o1.a;
        a1 = (a)o1.b;
        p = s.a(null);
        flag = true;
        obj1 = s.a(null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj2 = ((a) (obj)).b();
        if (a1 != null)
        {
            o1 = a1.b();
        } else
        {
            o1 = null;
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            obj2 = h.b(((com.b.a.b) (obj2)).c());
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            return p;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            return p;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            return p;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            return p;
        }
        if (a1 == null) goto _L6; else goto _L5
_L5:
        try
        {
            o1 = h.a(o1.c());
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            o1 = null;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            o1 = null;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            o1 = null;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            o1 = null;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
_L8:
        obj = o1;
        if (o1 != null)
        {
            obj = o1;
            if (!kik.a.b.a.a(a, o1, ((ECPrivateKey) (obj2))))
            {
                obj = null;
            }
        }
        if (obj == null)
        {
            try
            {
                o1 = (ECPublicKey)KeyFactory.getInstance("EC", "SC").generatePublic(new ECPublicKeySpec(((ECPrivateKey) (obj2)).b().c().a(((ECPrivateKey) (obj2)).c()), ((ECPrivateKey) (obj2)).b()));
                obj = o1.getEncoded();
                obj = kik.a.b.a.a(a).b("messaging_pub_key", null, (new a()).a(com.b.a.b.b(((byte []) (obj)))));
                kik.a.b.a.b(a).a(Boolean.valueOf(flag));
            }
            // Misplaced declaration of an exception variable
            catch (o o1)
            {
                kik.a.b.a.c(a).a(null);
                return p;
            }
            // Misplaced declaration of an exception variable
            catch (o o1)
            {
                kik.a.b.a.c(a).a(null);
                return p;
            }
            // Misplaced declaration of an exception variable
            catch (o o1)
            {
                kik.a.b.a.c(a).a(null);
                return p;
            }
            obj1 = o1;
            o1 = ((o) (obj));
        } else
        {
            o1 = ((o) (obj1));
            obj1 = obj;
        }
        return s.b(o1, new c(this, new KeyPair(((java.security.PublicKey) (obj1)), ((java.security.PrivateKey) (obj2)))));
_L2:
        return p;
_L4:
        return p;
_L6:
        o1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final volatile Object a(Object obj)
    {
        return a((o)obj);
    }
}
