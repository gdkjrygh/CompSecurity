// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import java.io.FileInputStream;
import java.io.IOException;

public final class v
{

    public static String a(FileInputStream fileinputstream)
    {
        byte abyte0[] = new byte[4];
        try
        {
            fileinputstream.read(abyte0, 0, 4);
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            fileinputstream.printStackTrace();
        }
        fileinputstream = new StringBuilder();
        for (int i = 0; i < 4; i++)
        {
            String s1 = Integer.toHexString(abyte0[i] & 0xff);
            if (s1.length() < 2)
            {
                fileinputstream.append(0);
            }
            fileinputstream.append(s1);
        }

        String s = fileinputstream.toString().toUpperCase();
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
