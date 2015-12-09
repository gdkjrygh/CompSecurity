// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;

import android.text.TextUtils;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p.bn.a;

public class f
{

    public static PublicKey a(String s)
    {
        try
        {
            s = p.bn.a.a(s);
            s = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.a("GoogleInApp", "Security: Invalid key specification.");
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static boolean a(String s, String s1, String s2)
    {
        if (TextUtils.isEmpty(s1))
        {
            p.df.a.a("GoogleInApp", "Security: data is empty");
            return false;
        }
        if (TextUtils.isEmpty(s))
        {
            p.df.a.a("GoogleInApp", "Security: key is empty");
            return false;
        }
        if (TextUtils.isEmpty(s2))
        {
            p.df.a.a("GoogleInApp", "Security: signature is empty");
            return false;
        } else
        {
            return a(a(s), s1, s2);
        }
    }

    public static boolean a(PublicKey publickey, String s, String s1)
    {
label0:
        {
            try
            {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publickey);
                signature.update(s.getBytes());
                if (signature.verify(p.bn.a.a(s1)))
                {
                    break label0;
                }
                p.df.a.a("GoogleInApp", "Security: Signature verification failed.");
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                p.df.a.a("GoogleInApp", "Security: NoSuchAlgorithmException.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                p.df.a.a("GoogleInApp", "Security: Invalid key specification.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                p.df.a.a("GoogleInApp", "Security: Signature exception.");
                return false;
            }
            return false;
        }
        return true;
    }
}
