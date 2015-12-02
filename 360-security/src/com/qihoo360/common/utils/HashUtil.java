// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class HashUtil
{

    public static final String HASH_MD5 = "MD5";
    public static final String HASH_SHA1 = "SHA1";

    public HashUtil()
    {
    }

    public static byte[] getFileHash(String s, File file)
    {
        try
        {
            s = getInputStreamHash(s, new FileInputStream(file));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static byte[] getHash(String s, byte abyte0[])
    {
        try
        {
            s = MessageDigest.getInstance(s);
            s.update(abyte0);
            s = s.digest();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static byte[] getInputStreamHash(String s, InputStream inputstream)
    {
        byte abyte0[] = new byte[1024];
        s = MessageDigest.getInstance(s);
_L2:
        int i = inputstream.read(abyte0);
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            s.update(abyte0, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            return null;
        }
        finally { }
        if (i != -1) goto _L2; else goto _L1
_L1:
        s = s.digest();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return s;
        }
        return s;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw s;
    }
}
