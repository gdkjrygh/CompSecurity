// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util;


public class IPAddress
{

    public IPAddress()
    {
    }

    private static boolean isMaskValue(String s, int i)
    {
        boolean flag1 = false;
        int j;
        boolean flag;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        flag = flag1;
        if (j >= 0)
        {
            flag = flag1;
            if (j <= i)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean isValid(String s)
    {
        return isValidIPv4(s) || isValidIPv6(s);
    }

    public static boolean isValidIPv4(String s)
    {
        if (s.length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        int j;
        s = (new StringBuilder()).append(s).append(".").toString();
        j = 0;
        i = 0;
_L5:
        int k;
        if (j >= s.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        k = s.indexOf('.', j);
        if (k <= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 4) goto _L1; else goto _L3
_L3:
        try
        {
            j = Integer.parseInt(s.substring(j, k));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (j < 0 || j > 255) goto _L1; else goto _L4
_L4:
        j = k + 1;
        i++;
          goto _L5
        if (i != 4) goto _L1; else goto _L6
_L6:
        return true;
    }

    public static boolean isValidIPv4WithNetmask(String s)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            int i = s.indexOf("/");
            String s1 = s.substring(i + 1);
            flag = flag1;
            if (i <= 0)
            {
                break label0;
            }
            flag = flag1;
            if (!isValidIPv4(s.substring(0, i)))
            {
                break label0;
            }
            if (!isValidIPv4(s1))
            {
                flag = flag1;
                if (!isMaskValue(s1, 32))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public static boolean isValidIPv6(String s)
    {
        if (s.length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        boolean flag;
        int j;
        s = (new StringBuilder()).append(s).append(":").toString();
        j = 0;
        flag = false;
        i = 0;
_L7:
        int k;
        if (j >= s.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        k = s.indexOf(':', j);
        if (k < j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 8) goto _L1; else goto _L3
_L3:
        String s1;
        if (j == k)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s.substring(j, k);
        if (k != s.length() - 1 || s1.indexOf('.') <= 0) goto _L5; else goto _L4
_L4:
        if (!isValidIPv4(s1)) goto _L1; else goto _L6
_L6:
        i++;
_L10:
        j = k + 1;
        i++;
          goto _L7
_L5:
        try
        {
            j = Integer.parseInt(s.substring(j, k), 16);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (j < 0) goto _L1; else goto _L8
_L8:
        if (j <= 65535) goto _L10; else goto _L9
_L9:
        return false;
        if (k != 1 && k != s.length() - 1 && flag) goto _L1; else goto _L11
_L11:
        flag = true;
          goto _L10
        if (i != 8 && !flag) goto _L1; else goto _L12
_L12:
        return true;
    }

    public static boolean isValidIPv6WithNetmask(String s)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            int i = s.indexOf("/");
            String s1 = s.substring(i + 1);
            flag = flag1;
            if (i <= 0)
            {
                break label0;
            }
            flag = flag1;
            if (!isValidIPv6(s.substring(0, i)))
            {
                break label0;
            }
            if (!isValidIPv6(s1))
            {
                flag = flag1;
                if (!isMaskValue(s1, 128))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public static boolean isValidWithNetMask(String s)
    {
        return isValidIPv4WithNetmask(s) || isValidIPv6WithNetmask(s);
    }
}
