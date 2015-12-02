// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import android.net.Uri;
import android.text.TextUtils;

public final class UriUtil
{

    private UriUtil()
    {
    }

    public static Uri a(String s, String s1)
    {
        return Uri.parse(b(s, s1));
    }

    private static String a(StringBuilder stringbuilder, int i, int j)
    {
        int k;
        int l;
        if (i >= j)
        {
            return stringbuilder.toString();
        }
        k = i;
        if (stringbuilder.charAt(i) == '/')
        {
            k = i + 1;
        }
        i = k;
        int i1 = k;
        l = j;
        j = i1;
_L2:
        if (i > l)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1;
        if (i == l)
        {
            j1 = i;
        } else
        {
label0:
            {
                if (stringbuilder.charAt(i) != '/')
                {
                    break label0;
                }
                j1 = i + 1;
            }
        }
        if (i == j + 1 && stringbuilder.charAt(j) == '.')
        {
            stringbuilder.delete(j, j1);
            l -= j1 - j;
            i = j;
        } else
        if (i == j + 2 && stringbuilder.charAt(j) == '.' && stringbuilder.charAt(j + 1) == '.')
        {
            i = stringbuilder.lastIndexOf("/", j - 2) + 1;
            if (i > k)
            {
                j = i;
            } else
            {
                j = k;
            }
            stringbuilder.delete(j, j1);
            j1 = l - (j1 - j);
            j = i;
            l = i;
            i = j;
            j = l;
            l = j1;
        } else
        {
            i++;
            j = i;
        }
        continue; /* Loop/switch isn't completed */
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
    }

    private static int[] a(String s)
    {
label0:
        {
            int ai[] = new int[4];
            if (TextUtils.isEmpty(s))
            {
                ai[0] = -1;
                return ai;
            }
            int j = s.length();
            int i = s.indexOf('#');
            int k;
            int l;
            int i1;
            if (i != -1)
            {
                j = i;
            }
            k = s.indexOf('?');
            if (k != -1)
            {
                i = k;
                if (k <= j)
                {
                    break label0;
                }
            }
            i = j;
        }
label1:
        {
            l = s.indexOf('/');
            if (l != -1)
            {
                k = l;
                if (l <= i)
                {
                    break label1;
                }
            }
            k = i;
        }
        i1 = s.indexOf(':');
        l = i1;
        if (i1 > k)
        {
            l = -1;
        }
        if (l + 2 < i && s.charAt(l + 1) == '/' && s.charAt(l + 2) == '/')
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0) goto _L2; else goto _L1
_L1:
label2:
        {
            i1 = s.indexOf('/', l + 3);
            if (i1 != -1)
            {
                k = i1;
                if (i1 <= i)
                {
                    break label2;
                }
            }
            k = i;
        }
_L4:
        ai[0] = l;
        ai[1] = k;
        ai[2] = i;
        ai[3] = j;
        return ai;
_L2:
        k = l + 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        s1 = a(s);
        if (s1[0] != -1)
        {
            stringbuilder.append(s);
            a(stringbuilder, s1[1], s1[2]);
            return stringbuilder.toString();
        }
        int ai[] = a(s2);
        if (s1[3] == 0)
        {
            return stringbuilder.append(s2, 0, ai[3]).append(s).toString();
        }
        if (s1[2] == 0)
        {
            return stringbuilder.append(s2, 0, ai[2]).append(s).toString();
        }
        if (s1[1] != 0)
        {
            int i = ai[0] + 1;
            stringbuilder.append(s2, 0, i).append(s);
            return a(stringbuilder, s1[1] + i, i + s1[2]);
        }
        if (s1[1] != s1[2] && s.charAt(s1[1]) == '/')
        {
            stringbuilder.append(s2, 0, ai[1]).append(s);
            int j = ai[1];
            int i1 = ai[1];
            return a(stringbuilder, j, s1[2] + i1);
        }
        if (ai[0] + 2 < ai[1] && ai[1] == ai[2])
        {
            stringbuilder.append(s2, 0, ai[1]).append('/').append(s);
            int k = ai[1];
            int j1 = ai[1];
            return a(stringbuilder, k, s1[2] + j1 + 1);
        }
        int l = s2.lastIndexOf('/', ai[2] - 1);
        if (l == -1)
        {
            l = ai[1];
        } else
        {
            l++;
        }
        stringbuilder.append(s2, 0, l).append(s);
        return a(stringbuilder, ai[1], l + s1[2]);
    }
}
