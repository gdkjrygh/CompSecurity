// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b;

import java.util.regex.Pattern;

// Referenced classes of package org.a.a.b:
//            a

public final class d
{

    private static final Pattern a = Pattern.compile("\\s+");

    public static String a(String s, String s1, String s2)
    {
        int k;
        if (!a(((CharSequence) (s))) && !a(((CharSequence) (s1))) && s2 != null)
        {
            if ((k = s.indexOf(s1, 0)) != -1)
            {
                int i1 = s1.length();
                int j = s2.length() - i1;
                int i = j;
                if (j < 0)
                {
                    i = 0;
                }
                StringBuilder stringbuilder = new StringBuilder(i * 16 + s.length());
                i = 0;
                j = -1;
                int l;
                do
                {
                    l = i;
                    if (k == -1)
                    {
                        break;
                    }
                    stringbuilder.append(s.substring(i, k)).append(s2);
                    i = k + i1;
                    j--;
                    l = i;
                    if (j == 0)
                    {
                        break;
                    }
                    k = s.indexOf(s1, i);
                } while (true);
                stringbuilder.append(s.substring(l));
                return stringbuilder.toString();
            }
        }
        return s;
    }

    private static boolean a(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static transient boolean a(CharSequence charsequence, char ac[])
    {
        boolean flag1 = true;
        if (!a(charsequence) && !org.a.a.b.a.a(ac)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L6:
        return flag;
_L2:
        int i;
        int k;
        int l;
        k = charsequence.length();
        l = ac.length;
        i = 0;
_L10:
        char c;
        int j;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        c = charsequence.charAt(i);
        j = 0;
_L9:
        if (j >= l) goto _L4; else goto _L3
_L3:
        if (ac[j] != c)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!Character.isHighSurrogate(c)) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (j == l - 1) goto _L6; else goto _L7
_L7:
        if (i >= k - 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (ac[j + 1] == charsequence.charAt(i + 1)) goto _L6; else goto _L8
_L8:
        j++;
          goto _L9
_L4:
        i++;
          goto _L10
        return false;
    }

    public static transient boolean b(CharSequence charsequence, char ac[])
    {
        boolean flag1 = false;
        if (charsequence != null && ac != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L6:
        return flag;
_L2:
        int i;
        int k;
        int l;
        k = charsequence.length();
        l = ac.length;
        i = 0;
_L10:
        char c;
        int j;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        c = charsequence.charAt(i);
        j = 0;
_L9:
        if (j >= l) goto _L4; else goto _L3
_L3:
        if (ac[j] != c)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!Character.isHighSurrogate(c)) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (j == l - 1) goto _L6; else goto _L7
_L7:
        if (i >= k - 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (ac[j + 1] == charsequence.charAt(i + 1)) goto _L6; else goto _L8
_L8:
        j++;
          goto _L9
_L4:
        i++;
          goto _L10
        return true;
    }

}
