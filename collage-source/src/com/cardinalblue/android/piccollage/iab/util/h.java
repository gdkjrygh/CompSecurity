// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            b, a

public class h
{

    public h()
    {
    }

    public static PublicKey a(String s)
    {
        try
        {
            s = com.cardinalblue.android.piccollage.iab.util.a.a(s);
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
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static boolean a(String s, String s1, String s2)
    {
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(s2))
        {
            Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
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
                if (signature.verify(com.cardinalblue.android.piccollage.iab.util.a.a(s1)))
                {
                    break label0;
                }
                Log.e("IABUtil/Security", "Signature verification failed.");
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                Log.e("IABUtil/Security", "NoSuchAlgorithmException.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                Log.e("IABUtil/Security", "Invalid key specification.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                Log.e("IABUtil/Security", "Signature exception.");
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                Log.e("IABUtil/Security", "Base64 decoding failed.");
                return false;
            }
            return false;
        }
        return true;
    }
}
