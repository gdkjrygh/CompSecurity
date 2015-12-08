// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage.util;

import java.io.FileInputStream;
import java.io.IOException;

public class FileType
{

    public FileType()
    {
    }

    public static String bytesToHexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (abyte0 == null || abyte0.length <= 0)
        {
            return null;
        }
        for (int i = 0; i < abyte0.length; i++)
        {
            String s = Integer.toHexString(abyte0[i] & 0xff);
            if (s.length() < 2)
            {
                stringbuilder.append(0);
            }
            stringbuilder.append(s);
        }

        return stringbuilder.toString();
    }

    public static String getTypeByStream(FileInputStream fileinputstream)
    {
        byte abyte0[] = new byte[4];
        String s;
        try
        {
            fileinputstream.read(abyte0, 0, 4);
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            fileinputstream.printStackTrace();
        }
        s = bytesToHexString(abyte0).toUpperCase();
        if (s.contains("FFD8FF"))
        {
            fileinputstream = "jpg";
        } else
        {
            if (s.contains("89504E47"))
            {
                return "png";
            }
            if (s.contains("47494638"))
            {
                return "gif";
            }
            if (s.contains("49492A00"))
            {
                return "tif";
            }
            fileinputstream = s;
            if (s.contains("424D"))
            {
                return "bmp";
            }
        }
        return fileinputstream;
    }
}
