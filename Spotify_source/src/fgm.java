// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fgm
{

    public final fgo a;
    public String b;
    public int c;

    public fgm(Locale locale)
    {
        a = new fgo((Locale)ctz.a(locale));
    }

    private int[] a(String s, int i)
    {
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = -1;
        ai[1] = -1;
        if (c == 0)
        {
            return ai;
        }
        int l1 = s.length();
        do
        {
            int i1;
label0:
            {
                if (i < l1)
                {
                    i1 = s.codePointAt(i);
                    int l = b.codePointAt(0);
                    int j = 0;
                    int k = i;
                    int j1;
                    int k1;
                    do
                    {
                        j1 = j;
                        k1 = k;
                        if (a.a(i1) != l)
                        {
                            break;
                        }
                        k += Character.charCount(i1);
                        j += Character.charCount(i1);
                        j1 = j;
                        k1 = k;
                        if (k == l1)
                        {
                            break;
                        }
                        j1 = j;
                        k1 = k;
                        if (j == c)
                        {
                            break;
                        }
                        i1 = s.codePointAt(k);
                        l = b.codePointAt(j);
                    } while (true);
                    if (j1 != c)
                    {
                        break label0;
                    }
                    ai[0] = i;
                    ai[1] = k1;
                }
                return ai;
            }
            i += Character.charCount(i1);
        } while (true);
    }

    public final List a(String s)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            int ai[] = a(s, i);
            if (ai[0] != -1)
            {
                arraylist.add(ai);
                i = ai[1];
            } else
            {
                return arraylist;
            }
        } while (true);
    }
}
