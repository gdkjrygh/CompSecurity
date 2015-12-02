// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

// Referenced classes of package com.qihoo360.common.utils:
//            ByteConvertor

public class SecurityUtil
{

    public SecurityUtil()
    {
    }

    public static File DES_decrypt(File file, String s, File file1)
        throws IOException
    {
        Object obj;
        FileWriter filewriter = null;
        byte abyte0[] = new byte[1024];
        int i;
        try
        {
            obj = new FileInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file1)
        {
            file = null;
            s = filewriter;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        filewriter = new FileWriter(file1);
_L1:
        i = ((FileInputStream) (obj)).read(abyte0);
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        filewriter.flush();
        try
        {
            ((FileInputStream) (obj)).close();
            filewriter.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
            return file1;
        }
        return file1;
        filewriter.write(DES_decrypt(new String(abyte0, 0, i), s));
          goto _L1
        file1;
        s = ((String) (obj));
        file = filewriter;
_L5:
        throw file1;
        file1;
        obj = s;
        s = file;
        file = file1;
_L3:
        try
        {
            ((FileInputStream) (obj)).close();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        throw file;
        file;
        s = null;
        continue; /* Loop/switch isn't completed */
        file;
        s = filewriter;
        if (true) goto _L3; else goto _L2
_L2:
        break MISSING_BLOCK_LABEL_19;
        file1;
        file = null;
        s = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String DES_decrypt(String s, String s1)
    {
        try
        {
            SecureRandom securerandom = new SecureRandom();
            s1 = new DESKeySpec(MD5(s1.getBytes()));
            s1 = SecretKeyFactory.getInstance("DES").generateSecret(s1);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, s1, securerandom);
            s = new String(cipher.doFinal(ByteConvertor.hexStringToBytes(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static File DES_encrypt(File file, String s, File file1)
        throws IOException
    {
        Object obj;
        FileWriter filewriter = null;
        byte abyte0[] = new byte[1024];
        int i;
        try
        {
            obj = new FileInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file1)
        {
            file = null;
            s = filewriter;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        filewriter = new FileWriter(file1);
_L1:
        i = ((FileInputStream) (obj)).read(abyte0);
        if (i <= 0)
        {
            try
            {
                filewriter.flush();
                ((FileInputStream) (obj)).close();
                filewriter.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
                return file1;
            }
            return file1;
        }
        filewriter.write(DES_encrypt(new String(abyte0, 0, i), s));
          goto _L1
        file1;
        s = ((String) (obj));
        file = filewriter;
_L5:
        throw file1;
        file1;
        obj = s;
        s = file;
        file = file1;
_L3:
        try
        {
            s.flush();
            ((FileInputStream) (obj)).close();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        throw file;
        file;
        s = null;
        continue; /* Loop/switch isn't completed */
        file;
        s = filewriter;
        if (true) goto _L3; else goto _L2
_L2:
        break MISSING_BLOCK_LABEL_19;
        file1;
        file = null;
        s = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String DES_encrypt(String s, String s1)
    {
        try
        {
            SecureRandom securerandom = new SecureRandom();
            s1 = new DESKeySpec(MD5(s1.getBytes()));
            s1 = SecretKeyFactory.getInstance("DES").generateSecret(s1);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, s1, securerandom);
            s = ByteConvertor.bytesToHexString(cipher.doFinal(s.getBytes()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static byte[] MD5(File file)
    {
        byte abyte0[] = null;
        Object obj;
        obj = MessageDigest.getInstance("MD5");
        file = new BufferedInputStream(new FileInputStream(file));
        byte abyte1[] = new byte[1024];
_L3:
        int i = file.read(abyte1);
        if (i != -1) goto _L2; else goto _L1
_L1:
        file.close();
        obj = ((MessageDigest) (obj)).digest();
        abyte0 = ((byte []) (obj));
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return ((byte []) (obj));
            }
            abyte0 = ((byte []) (obj));
        }
_L8:
        return abyte0;
_L2:
        ((MessageDigest) (obj)).update(abyte1, 0, i);
          goto _L3
        obj;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj;
        file = null;
_L5:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        file;
        file = null;
        if (true) goto _L7; else goto _L6
_L6:
          goto _L8
    }

    public static byte[] MD5(String s)
    {
        return MD5(new File(s));
    }

    public static byte[] MD5(byte abyte0[])
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

    public static Key createDesKey()
        throws Exception
    {
        SecureRandom securerandom = new SecureRandom();
        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        keygenerator.init(securerandom);
        return keygenerator.generateKey();
    }

    public static String getFileMD5(String s)
    {
        s = MD5(s);
        if (s == null)
        {
            return null;
        } else
        {
            return ByteConvertor.bytesToHexString(s);
        }
    }

    public static String getMD5(InputStream inputstream)
    {
        Object obj;
        MessageDigest messagedigest;
        messagedigest = MessageDigest.getInstance("MD5");
        obj = new BufferedInputStream(inputstream);
        inputstream = new byte[1024];
_L3:
        int i = ((BufferedInputStream) (obj)).read(inputstream);
        if (i != -1) goto _L2; else goto _L1
_L1:
        inputstream = messagedigest.digest();
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
_L8:
        if (inputstream == null)
        {
            return null;
        } else
        {
            return ByteConvertor.bytesToHexString(inputstream);
        }
_L2:
        messagedigest.update(inputstream, 0, i);
          goto _L3
        inputstream;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        try
        {
            ((BufferedInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
            break MISSING_BLOCK_LABEL_45;
        }
        inputstream = null;
        break MISSING_BLOCK_LABEL_45;
        inputstream;
        obj = null;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw inputstream;
        inputstream;
        if (true) goto _L5; else goto _L4
_L4:
        inputstream;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
        inputstream = null;
          goto _L8
    }

    public static String getMD5(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return getMD5(s.getBytes());
        }
    }

    public static String getMD5(byte abyte0[])
    {
        return ByteConvertor.bytesToHexString(MD5(abyte0));
    }
}
