// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

// Referenced classes of package com.google.android.gms.internal:
//            eu

public class da
{

    public static boolean a(PublicKey publickey, String s, String s1)
    {
label0:
        {
            try
            {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publickey);
                signature.update(s.getBytes());
                if (signature.verify(Base64.decode(s1, 0)))
                {
                    break label0;
                }
                eu.A("Signature verification failed.");
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                eu.A("NoSuchAlgorithmException.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                eu.A("Invalid key specification.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                eu.A("Signature exception.");
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean b(String s, String s1, String s2)
    {
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(s2))
        {
            eu.A("Purchase verification failed: missing data.");
            return false;
        } else
        {
            return a(r(s), s1, s2);
        }
    }

    public static PublicKey r(String s)
    {
        try
        {
            s = Base64.decode(s, 0);
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
            eu.A("Invalid key specification.");
            throw new IllegalArgumentException(s);
        }
        return s;
    }
}
