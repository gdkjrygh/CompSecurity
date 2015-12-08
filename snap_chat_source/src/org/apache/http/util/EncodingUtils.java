// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.io.UnsupportedEncodingException;

// Referenced classes of package org.apache.http.util:
//            Args

public final class EncodingUtils
{

    public static byte[] getBytes(String s, String s1)
    {
        Args.notNull(s, "Input");
        Args.notEmpty(s1, "Charset");
        try
        {
            s1 = s.getBytes(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s.getBytes();
        }
        return s1;
    }
}
