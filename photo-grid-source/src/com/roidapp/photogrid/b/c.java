// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

final class c
{

    public static String a(File file)
    {
        byte abyte0[];
        if (!file.isFile())
        {
            return null;
        }
        abyte0 = new byte[1024];
        MessageDigest messagedigest;
        messagedigest = MessageDigest.getInstance("MD5");
        file = new FileInputStream(file);
_L1:
        int i = file.read(abyte0, 0, 1024);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                messagedigest.update(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
        }
          goto _L1
        file.close();
        return a(messagedigest.digest());
    }

    public static String a(InputStream inputstream)
    {
        byte abyte0[];
        if (inputstream == null)
        {
            return null;
        }
        abyte0 = new byte[1024];
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
_L1:
        int i = inputstream.read(abyte0, 0, 1024);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                messagedigest.update(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return null;
            }
        }
          goto _L1
        inputstream.close();
        return a(messagedigest.digest());
    }

    private static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            stringbuilder.append("0123456789abcdef".charAt((byte0 & 0xf0) >>> 4));
            stringbuilder.append("0123456789abcdef".charAt(byte0 & 0xf));
        }

        return stringbuilder.toString();
    }
}
