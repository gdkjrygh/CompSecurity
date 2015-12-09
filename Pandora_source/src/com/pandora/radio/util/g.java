// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            i

public class g
{

    public static String a(String s)
    {
        String s1;
        int j;
        j = 0;
        s1 = "";
        if (!com.pandora.radio.util.i.a(s)) goto _L2; else goto _L1
_L1:
        return s1;
_L2:
        String s2 = s1;
        String s3 = s1;
        MessageDigest messagedigest;
        byte abyte0[];
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.e("OneWayHash", "MD5 is not available.");
            return s2;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.e("OneWayHash", "UTF-8 is not available.");
            return s3;
        }
        s2 = s1;
        s3 = s1;
        messagedigest.update(s.getBytes("UTF-8"));
        s2 = s1;
        s3 = s1;
        abyte0 = messagedigest.digest();
        s = s1;
_L4:
        s1 = s;
        s2 = s;
        s3 = s;
        if (j >= abyte0.length) goto _L1; else goto _L3
_L3:
        s2 = s;
        s3 = s;
        s = (new StringBuilder()).append(s).append(String.format("%02X", new Object[] {
            Byte.valueOf(abyte0[j])
        })).toString();
        j++;
          goto _L4
    }
}
