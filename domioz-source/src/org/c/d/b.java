// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import android.util.Base64;
import java.io.IOException;
import org.c.d.a.a;

public final class b
{

    private static final Boolean a;

    public b()
    {
    }

    public static byte[] decode(String s)
    {
        if (a.booleanValue())
        {
            return Base64.decode(s, 2);
        }
        try
        {
            s = org.c.d.a.a.decode(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s.getLocalizedMessage());
        }
        return s;
    }

    public static byte[] decode(byte abyte0[])
    {
        if (a.booleanValue())
        {
            return Base64.decode(abyte0, 2);
        }
        try
        {
            abyte0 = org.c.d.a.a.decode(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException(abyte0.getLocalizedMessage());
        }
        return abyte0;
    }

    public static byte[] encode(byte abyte0[])
    {
        if (a.booleanValue())
        {
            return Base64.encode(abyte0, 2);
        } else
        {
            return org.c.d.a.a.encodeBytesToBytes(abyte0);
        }
    }

    public static String encodeToString(byte abyte0[])
    {
        if (a.booleanValue())
        {
            return Base64.encodeToString(abyte0, 2);
        } else
        {
            return org.c.d.a.a.encodeBytes(abyte0);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = Boolean.valueOf(flag);
    }
}
