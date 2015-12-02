// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import com.google.common.base.Charsets;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.facebook.common.w:
//            m

public class n
{

    public n()
    {
    }

    public static String a(String s)
    {
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

    public static String a(String s, int i)
    {
        if (Strings.isNullOrEmpty(s) || i == 0 || s.length() < i)
        {
            return s;
        } else
        {
            return s.substring(0, i - (Character.charCount(Character.codePointAt(s, i - 1)) - 1));
        }
    }

    public static transient String a(String s, Object aobj[])
    {
        return m.a(s, aobj);
    }

    public static String a(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, Charsets.UTF_8.name());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("UTF-8 not supported");
        }
        return abyte0;
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static boolean a(String s, String s1)
    {
        return Objects.equal(b(s), b(s1));
    }

    public static transient boolean a(CharSequence acharsequence[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        Preconditions.checkNotNull(acharsequence);
        flag = flag1;
        if (acharsequence == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = acharsequence.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (!a(acharsequence[i])) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static CharSequence b(CharSequence charsequence)
    {
        int i = charsequence.length();
        do
        {
            if (i <= 0 || !Character.isWhitespace(charsequence.charAt(i - 1)))
            {
                if (i == charsequence.length())
                {
                    return charsequence;
                } else
                {
                    return charsequence.subSequence(0, i);
                }
            }
            i--;
        } while (true);
    }

    public static String b(String s)
    {
        String s1 = s;
        if (a(s))
        {
            s1 = null;
        }
        return s1;
    }

    public static boolean c(CharSequence charsequence)
    {
        boolean flag1 = false;
        if (!a(charsequence)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= charsequence.length())
                {
                    break label1;
                }
                flag = flag1;
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public static byte[] c(String s)
    {
        try
        {
            s = s.getBytes(Charsets.UTF_8.name());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported");
        }
        return s;
    }

    public static long d(String s)
    {
        long l = 0x3ffffffffffe5L;
        int j = s.length();
        for (int i = 0; i < j; i++)
        {
            l = l * 31L + (long)s.charAt(i);
        }

        return l;
    }
}
