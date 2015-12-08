// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

final class aow
{

    public static PublicKey a(String s)
    {
        try
        {
            s = anH.a(s);
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
            throw new IllegalArgumentException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static boolean a(PublicKey publickey, String s, String s1)
    {
        boolean flag;
        try
        {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publickey);
            signature.update(s.getBytes());
            flag = signature.verify(anH.a(s1));
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            return false;
        }
        return flag;
    }
}
