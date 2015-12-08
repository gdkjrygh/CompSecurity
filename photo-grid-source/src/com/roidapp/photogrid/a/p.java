// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

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

// Referenced classes of package com.roidapp.photogrid.a:
//            b, a

public final class p
{

    private static PublicKey a(String s)
    {
        try
        {
            s = com.roidapp.photogrid.a.a.a(s);
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
        if (s1 == null)
        {
            Log.e("IABUtil/Security", "data is null");
            return false;
        }
        if (!TextUtils.isEmpty(s2) && !a(a(s), s1, s2))
        {
            Log.w("IABUtil/Security", "signature does not match data.");
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean a(PublicKey publickey, String s, String s1)
    {
label0:
        {
            try
            {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publickey);
                signature.update(s.getBytes());
                if (signature.verify(com.roidapp.photogrid.a.a.a(s1)))
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
