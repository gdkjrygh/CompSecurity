// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b.a;

import c.a.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class f
{

    protected static final char a[] = "0123456789ABCDEF".toCharArray();
    private static final Logger b;
    private static SecureRandom c = new SecureRandom();

    public f()
    {
    }

    public static String a(String s, Key key)
    {
        s = c(s, key);
        if (s != null)
        {
            key = new char[s.length * 2];
            for (int i = 0; i < s.length; i++)
            {
                int j = s[i] & 0xff;
                key[i * 2] = a[j >>> 4];
                key[i * 2 + 1] = a[j & 0xf];
            }

            return new String(key);
        } else
        {
            return null;
        }
    }

    public static String a(Key key, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("-----BEGIN ").append(s).append("-----\r\n");
        key = c.a.a.a(key.getEncoded());
        char ac[] = new char[64];
        for (int i = 0; i < key.length; i += 64)
        {
            for (int j = 0; j != 64 && i + j < key.length; j++)
            {
                ac[j] = (char)key[i + j];
            }

            stringbuilder.append(ac);
            stringbuilder.append("\r\n");
        }

        stringbuilder.append("-----END ").append(s).append("-----");
        return stringbuilder.toString();
    }

    public static Key a(String s)
    {
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(s.getBytes("UTF-8"))));
        s = bufferedreader.readLine();
_L1:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (s.startsWith("-----BEGIN "))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s = bufferedreader.readLine();
          goto _L1
        StringBuilder stringbuilder = new StringBuilder();
        if (s == null) goto _L3; else goto _L2
_L2:
        s = bufferedreader.readLine();
        if (s == null) goto _L5; else goto _L4
_L4:
        if (s.contains("-----END ")) goto _L5; else goto _L6
_L6:
        stringbuilder.append(s.trim());
          goto _L2
        s;
        s.printStackTrace();
_L3:
        return null;
_L5:
        s = new X509EncodedKeySpec(c.a.a.a(stringbuilder.toString()));
        s = KeyFactory.getInstance("RSA").generatePublic(s);
        return s;
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (true) goto _L3; else goto _L7
_L7:
    }

    public static KeyPair a()
    {
        Object obj;
        try
        {
            obj = KeyPairGenerator.getInstance("RSA");
            ((KeyPairGenerator) (obj)).initialize(1024, c);
            obj = ((KeyPairGenerator) (obj)).generateKeyPair();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception.printStackTrace();
            return null;
        }
        return ((KeyPair) (obj));
    }

    private static byte[] a(byte abyte0[], Key key)
    {
        if (key == null)
        {
            return null;
        }
        Cipher cipher;
        int i;
        int j;
        try
        {
            cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, key);
            j = abyte0.length % 128;
            key = new ByteArrayOutputStream();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        i = 0;
        if (i + 128 > abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        key.write(cipher.doFinal(abyte0, i, 128));
        i += 128;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_36;
_L1:
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        key.write(cipher.doFinal(abyte0, i, j));
        key.close();
        abyte0 = key.toByteArray();
        return abyte0;
    }

    public static String b(String s, Key key)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        s = a(abyte0, key);
        if (s != null)
        {
            try
            {
                s = new String(s, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            return s;
        } else
        {
            return null;
        }
    }

    private static byte[] c(String s, Key key)
    {
        if (key == null)
        {
            return null;
        }
        Cipher cipher;
        byte abyte0[];
        int j;
        int k;
        int l;
        try
        {
            cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, key, c);
            l = cipher.getOutputSize(117);
            b.info((new StringBuilder("encryptString string length: ")).append(s.length()).toString());
            b.info((new StringBuilder("encryptString bytes length: ")).append(s.getBytes("UTF-8").length).toString());
            s = s.getBytes("UTF-8");
            int i = s.length / 117;
            k = s.length % 117;
            key = new ByteArrayOutputStream(i * l + cipher.getOutputSize(k));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        j = 0;
        abyte0 = new byte[l];
_L1:
        if (j + 117 > s.length)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        cipher.doFinal(s, j, 117, abyte0);
        key.write(abyte0);
        j += 117;
          goto _L1
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        abyte0 = new byte[cipher.getOutputSize(k)];
        cipher.doFinal(s, j, k, abyte0);
        key.write(abyte0);
        key.close();
        s = key.toByteArray();
        return s;
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/b/a/f.getName());
        b = logger;
        logger.setLevel(Level.OFF);
    }
}
