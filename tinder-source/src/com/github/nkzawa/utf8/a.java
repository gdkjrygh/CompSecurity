// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.utf8;

import java.util.List;

// Referenced classes of package com.github.nkzawa.utf8:
//            UTF8Exception

public final class a
{

    public static int a[];
    public static int b;
    public static int c;

    public static int a()
        throws UTF8Exception
    {
        if (c >= b)
        {
            throw new UTF8Exception("Invalid byte index");
        }
        int i = a[c] & 0xff;
        c++;
        if ((i & 0xc0) == 128)
        {
            return i & 0x3f;
        } else
        {
            throw new UTF8Exception("Invalid continuation byte");
        }
    }

    public static String a(String s)
    {
        int ai[] = b(s);
        int j = ai.length;
        int i = -1;
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            i++;
            if (i < j)
            {
                int k = ai[i];
                s = new StringBuilder();
                if ((k & 0xffffff80) == 0)
                {
                    s = s.append(Character.toChars(k)).toString();
                } else
                {
                    if ((k & 0xfffff800) == 0)
                    {
                        s.append(Character.toChars(k >> 6 & 0x1f | 0xc0));
                    } else
                    if ((0xffff0000 & k) == 0)
                    {
                        s.append(Character.toChars(k >> 12 & 0xf | 0xe0));
                        s.append(a(k, 6));
                    } else
                    if ((0xffe00000 & k) == 0)
                    {
                        s.append(Character.toChars(k >> 18 & 7 | 0xf0));
                        s.append(a(k, 12));
                        s.append(a(k, 6));
                    }
                    s.append(Character.toChars(k & 0x3f | 0x80));
                    s = s.toString();
                }
                stringbuilder.append(s);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static String a(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.appendCodePoint(ai[i]);
        }

        return stringbuilder.toString();
    }

    private static char[] a(int i, int j)
    {
        return Character.toChars(i >> j & 0x3f | 0x80);
    }

    public static int[] a(List list)
    {
        int j = list.size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        return ai;
    }

    public static int[] b(String s)
    {
        int j = 0;
        int k = s.length();
        int ai[] = new int[s.codePointCount(0, k)];
        for (int i = 0; j < k; i++)
        {
            int l = s.codePointAt(j);
            ai[i] = l;
            j += Character.charCount(l);
        }

        return ai;
    }
}
