// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.jcp.util:
//            ae

public final class ao
{

    private static final String a = com/jcp/util/ao.getName();

    private ao()
    {
    }

    public static String a(String s)
    {
        StringBuffer stringbuffer;
        int i;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes());
            stringbuffer = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.a(a, "Error ! while generating MD5Checksum");
            return null;
        }
        i = 0;
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append(Integer.toHexString(s[i] & 0xff | 0x100).substring(1, 3));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_23;
_L1:
        s = stringbuffer.toString();
        return s;
    }

}
