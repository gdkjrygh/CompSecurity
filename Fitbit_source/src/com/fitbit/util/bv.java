// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.telephony.PhoneNumberUtils;
import java.util.Locale;

// Referenced classes of package com.fitbit.util:
//            d

public class bv
{

    private static final char a[] = {
        '/', '\\', '(', ')', ',', '.', '"', ':', ';', '[', 
        '{', '}', ']', '+', ' ', '!', '?'
    };

    public bv()
    {
    }

    public static String a(String s)
    {
        return a(s, a);
    }

    public static String a(String s, byte abyte0[], d.a a1)
    {
        s = com.fitbit.util.d.a(s.getBytes(), abyte0.length);
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = a1.a(s[i], abyte0[i]);
        }

        return new String(abyte1);
    }

    public static String a(String s, char ac[])
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        int l = s.length();
        StringBuffer stringbuffer = new StringBuffer(l);
        char c1;
        boolean flag;
        int i;
        int j;
        int k;
        boolean flag1;
        if (ac != null)
        {
            i = ac.length;
        } else
        {
            i = 0;
        }
        j = 0;
        flag = true;
        if (j >= l) goto _L2; else goto _L1
_L1:
        c1 = s.charAt(j);
        if (ac != null) goto _L4; else goto _L3
_L3:
        flag1 = Character.isWhitespace(c1);
_L7:
        if (flag1)
        {
            stringbuffer.append(c1);
            flag = true;
        } else
        if (flag)
        {
            stringbuffer.append(Character.toTitleCase(c1));
            flag = false;
        } else
        {
            stringbuffer.append(c1);
        }
        j++;
        break MISSING_BLOCK_LABEL_43;
_L4:
        k = 0;
_L5:
label0:
        {
            if (k >= i)
            {
                break MISSING_BLOCK_LABEL_157;
            }
            if (c1 != ac[k])
            {
                break label0;
            }
            flag1 = true;
        }
        continue; /* Loop/switch isn't completed */
        k++;
        if (true) goto _L5; else goto _L2
_L2:
        return stringbuffer.toString();
        continue; /* Loop/switch isn't completed */
        flag1 = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String b(String s)
    {
        return b(s, a);
    }

    public static String b(String s, char ac[])
    {
        if (s == null || s.length() == 0)
        {
            return s;
        } else
        {
            return a(s.toLowerCase(), ac);
        }
    }

    public static String c(String s)
    {
        return c(s, a);
    }

    public static String c(String s, char ac[])
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        int l = s.length();
        char c1;
        StringBuffer stringbuffer;
        boolean flag;
        int i;
        int j;
        int k;
        boolean flag1;
        if (ac != null)
        {
            i = ac.length;
        } else
        {
            i = 0;
        }
        stringbuffer = new StringBuffer(l);
        j = 0;
        flag = true;
        if (j >= l) goto _L2; else goto _L1
_L1:
        c1 = s.charAt(j);
        if (ac != null) goto _L4; else goto _L3
_L3:
        flag1 = Character.isWhitespace(c1);
_L7:
        if (flag1)
        {
            stringbuffer.append(c1);
            flag = true;
        } else
        if (flag)
        {
            stringbuffer.append(Character.toLowerCase(c1));
            flag = false;
        } else
        {
            stringbuffer.append(c1);
        }
        j++;
        break MISSING_BLOCK_LABEL_43;
_L4:
        k = 0;
_L5:
label0:
        {
            if (k >= i)
            {
                break MISSING_BLOCK_LABEL_157;
            }
            if (c1 != ac[k])
            {
                break label0;
            }
            flag1 = true;
        }
        continue; /* Loop/switch isn't completed */
        k++;
        if (true) goto _L5; else goto _L2
_L2:
        return stringbuffer.toString();
        continue; /* Loop/switch isn't completed */
        flag1 = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String d(String s)
    {
        int j;
label0:
        {
            if (s != null)
            {
                j = s.length();
                if (j != 0)
                {
                    break label0;
                }
            }
            return s;
        }
        StringBuffer stringbuffer = new StringBuffer(j);
        int i = 0;
        boolean flag = true;
        while (i < j) 
        {
            char c2 = s.charAt(i);
            char c1;
            if (Character.isUpperCase(c2))
            {
                c1 = Character.toLowerCase(c2);
            } else
            if (Character.isTitleCase(c2))
            {
                c1 = Character.toLowerCase(c2);
            } else
            if (Character.isLowerCase(c2))
            {
                if (flag)
                {
                    c1 = Character.toTitleCase(c2);
                } else
                {
                    c1 = Character.toUpperCase(c2);
                }
            } else
            {
                c1 = c2;
            }
            stringbuffer.append(c1);
            flag = Character.isWhitespace(c2);
            i++;
        }
        return stringbuffer.toString();
    }

    public static String e(String s)
    {
        return s.replace("\"", "'");
    }

    public static String f(String s)
    {
        if (Locale.getDefault().equals(Locale.US))
        {
            StringBuilder stringbuilder = new StringBuilder();
            int i = s.length() - 1;
            while (i >= 0) 
            {
                char c1 = s.charAt(i);
                if (stringbuilder.length() == 4)
                {
                    stringbuilder.append('-');
                }
                if (stringbuilder.length() == 8)
                {
                    if (s.length() == 10)
                    {
                        stringbuilder.append(" )");
                    } else
                    {
                        stringbuilder.append('-');
                    }
                }
                stringbuilder.append(c1);
                if (stringbuilder.length() == 13 && s.length() == 10)
                {
                    stringbuilder.append('(');
                }
                i--;
            }
            return stringbuilder.reverse().toString();
        } else
        {
            return PhoneNumberUtils.formatNumber(s);
        }
    }

}
