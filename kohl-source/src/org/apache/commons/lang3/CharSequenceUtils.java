// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


public class CharSequenceUtils
{

    public CharSequenceUtils()
    {
    }

    static int indexOf(CharSequence charsequence, int i, int j)
    {
        if (!(charsequence instanceof String)) goto _L2; else goto _L1
_L1:
        int k = ((String)charsequence).indexOf(i, j);
_L4:
        return k;
_L2:
        int l = charsequence.length();
        k = j;
        if (j < 0)
        {
            k = 0;
        }
        j = k;
label0:
        do
        {
label1:
            {
                if (j >= l)
                {
                    break label1;
                }
                k = j;
                if (charsequence.charAt(j) == i)
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    static int indexOf(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        return charsequence.toString().indexOf(charsequence1.toString(), i);
    }

    static int lastIndexOf(CharSequence charsequence, int i, int j)
    {
        if (!(charsequence instanceof String)) goto _L2; else goto _L1
_L1:
        int k = ((String)charsequence).lastIndexOf(i, j);
_L4:
        return k;
_L2:
        int l = charsequence.length();
        if (j < 0)
        {
            return -1;
        }
        k = j;
        if (j >= l)
        {
            k = l - 1;
        }
        j = k;
label0:
        do
        {
label1:
            {
                if (j < 0)
                {
                    break label1;
                }
                k = j;
                if (charsequence.charAt(j) == i)
                {
                    break label0;
                }
                j--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    static int lastIndexOf(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        return charsequence.toString().lastIndexOf(charsequence1.toString(), i);
    }

    static boolean regionMatches(CharSequence charsequence, boolean flag, int i, CharSequence charsequence1, int j, int k)
    {
        if ((charsequence instanceof String) && (charsequence1 instanceof String))
        {
            return ((String)charsequence).regionMatches(flag, i, (String)charsequence1, j, k);
        } else
        {
            return charsequence.toString().regionMatches(flag, i, charsequence1.toString(), j, k);
        }
    }

    public static CharSequence subSequence(CharSequence charsequence, int i)
    {
        if (charsequence == null)
        {
            return null;
        } else
        {
            return charsequence.subSequence(i, charsequence.length());
        }
    }

    static char[] toCharArray(CharSequence charsequence)
    {
        if (!(charsequence instanceof String)) goto _L2; else goto _L1
_L1:
        char ac[] = ((String)charsequence).toCharArray();
_L4:
        return ac;
_L2:
        int j = charsequence.length();
        char ac1[] = new char[charsequence.length()];
        int i = 0;
        do
        {
            ac = ac1;
            if (i >= j)
            {
                continue;
            }
            ac1[i] = charsequence.charAt(i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
