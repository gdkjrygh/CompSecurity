// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.auditude.ads.util:
//            StringUtil

public class MD5
{

    private static MessageDigest md = null;

    public MD5()
    {
    }

    public static String GetMd5String(String s)
    {
        if (md == null)
        {
            try
            {
                md = MessageDigest.getInstance("MD5");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        if (StringUtil.isNullOrEmpty(s))
        {
            return null;
        }
        StringBuffer stringbuffer;
        int i;
        try
        {
            s = s.getBytes("UTF-8");
            md.reset();
            md.update(s);
            s = md.digest();
            stringbuffer = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        i = 0;
        if (i >= s.length)
        {
            return stringbuffer.toString();
        }
        stringbuffer.append(Integer.toHexString(s[i] & 0xff | 0x100).substring(1, 3));
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_63;
        }
    }

}
