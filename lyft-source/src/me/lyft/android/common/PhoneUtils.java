// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;


// Referenced classes of package me.lyft.android.common:
//            Strings

public class PhoneUtils
{

    public PhoneUtils()
    {
    }

    public static String cleanPhoneNumber(String s)
    {
        if (!Strings.isNullOrEmpty(s))
        {
            String s1 = s.replaceAll("[^0-9]", "");
            s = s1;
            if (!s1.startsWith("1"))
            {
                s = (new StringBuilder()).append("1").append(s1).toString();
            }
            return (new StringBuilder()).append("+").append(s).toString();
        } else
        {
            return null;
        }
    }

    public static boolean isLengthValid(String s)
    {
        boolean flag = true;
        if (!Strings.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (!s.startsWith("1"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s.length() == 14) goto _L4; else goto _L3
_L3:
        return false;
        if (s.length() == 12) goto _L4; else goto _L5
_L5:
        return false;
    }
}
