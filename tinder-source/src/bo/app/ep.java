// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.security.MessageDigest;

public final class ep
{

    private static final String a;

    public ep()
    {
    }

    public static int a(String s, String s1)
    {
        return s.split(s1, -1).length - 1;
    }

    public static String a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("Provided String must be non-null.");
        }
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("Provided String must be non-empty.");
        } else
        {
            return s;
        }
    }

    public static String b(String s, String s1)
    {
        String s2;
        String s3;
        if (s == null)
        {
            s2 = "null";
        } else
        {
            s2 = s.toString();
        }
        s3 = e(s2);
        s2 = s3;
        if (s3 == null)
        {
            s2 = Integer.toString(s.hashCode());
        }
        return (new StringBuilder(".")).append(s2).append(".").append(s1).toString();
    }

    public static boolean b(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean c(String s)
    {
        return s == null || s.trim().length() == 0;
    }

    public static String d(String s)
    {
        String s1 = s;
        if (s.trim().equals(""))
        {
            s1 = null;
        }
        return s1;
    }

    private static String e(String s)
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
            AppboyLogger.i(a, "Failed to calculate MD5 hash", s);
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

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ep.getName()
        });
    }
}
