// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b;

import com.kik.g.as;
import com.kik.g.p;
import com.kik.g.s;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import org.bouncycastle.openssl.EncryptionException;

// Referenced classes of package kik.a.b:
//            a

final class d
    implements as
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    private p a(KeyPair keypair)
    {
        if (keypair != null)
        {
            return s.a(keypair);
        }
        try
        {
            keypair = kik.a.b.a.d(a);
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            return s.a(keypair);
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            return s.a(keypair);
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            return s.a(keypair);
        }
        // Misplaced declaration of an exception variable
        catch (KeyPair keypair)
        {
            return s.a(keypair);
        }
        return keypair;
    }

    public final volatile Object a(Object obj)
    {
        return a((KeyPair)obj);
    }
}
