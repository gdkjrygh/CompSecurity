// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.b.a;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.codec.binary.Base64;

public class e
{

    public static String a(String s)
    {
        if (s == null)
        {
            return new String("");
        } else
        {
            return b(a(s.getBytes()));
        }
    }

    public static String a(String s, String s1)
    {
        try
        {
            Object obj = new DESKeySpec(s1.getBytes());
            obj = SecretKeyFactory.getInstance("DES").generateSecret(((java.security.spec.KeySpec) (obj)));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(1, ((java.security.Key) (obj)), new IvParameterSpec(s1.getBytes()));
            s = new String(Base64.encodeBase64(cipher.doFinal(s.getBytes())));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static boolean a(Context context, String s)
    {
        PackageManager packagemanager = context.getPackageManager();
        if (packagemanager != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        context = null;
        s = packagemanager.getPackageInfo(s, 0);
        context = s;
_L4:
        if (context != null)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
          goto _L4
    }

    private static byte[] a(byte abyte0[])
    {
        byte abyte1[] = null;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception.printStackTrace();
            nosuchalgorithmexception = null;
        }
        if (messagedigest != null)
        {
            messagedigest.update(abyte0);
            abyte1 = messagedigest.digest();
        }
        return abyte1;
    }

    private static String b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append("0123456789abcdef".charAt(abyte0[i] >> 4 & 0xf));
            stringbuilder.append("0123456789abcdef".charAt(abyte0[i] & 0xf));
            i++;
        } while (true);
    }
}
