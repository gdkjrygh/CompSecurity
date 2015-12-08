// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.c.a;

import com.c.a.a.r;
import com.c.a.b.o;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.c.c.a:
//            b

final class c
{

    private static final r a = r.a("");

    private static int a(List list, CharSequence charsequence, com.c.a.b.o.a a1)
    {
        int i;
        int j;
        int k = charsequence.length();
        char c1 = '\0';
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            char c2 = charsequence.charAt(i);
            c1 = c2;
            if (c2 == '&')
            {
                break;
            }
            c1 = c2;
            if (c2 == '?')
            {
                break;
            }
            c1 = c2;
            if (c2 == '!')
            {
                break;
            }
            c1 = c2;
            if (c2 == ':')
            {
                break;
            }
            c1 = c2;
            if (c2 == ',')
            {
                break;
            }
            i++;
            c1 = c2;
        } while (true);
        Object obj = charsequence.subSequence(0, i);
        int l = ((CharSequence) (obj)).length();
        if (l > 1)
        {
            char ac[] = new char[l];
            ac[0] = ((CharSequence) (obj)).charAt(l - 1);
            for (j = 1; j < l; j++)
            {
                ac[j] = ((CharSequence) (obj)).charAt(l - 1 - j);
                if (Character.isSurrogatePair(ac[j], ac[j - 1]))
                {
                    int i1 = j - 1;
                    char c3 = ac[i1];
                    ac[i1] = ac[j];
                    ac[j] = c3;
                }
            }

            obj = new String(ac);
        }
        list.add(0, obj);
        if (c1 == '!' || c1 == '?' || c1 == ':' || c1 == ',')
        {
            obj = a.a(list);
            if (((String) (obj)).length() > 0)
            {
                a1.a(obj, b.a(c1));
            }
        }
        i++;
        if (c1 == '?' || c1 == ',') goto _L2; else goto _L1
_L1:
label0:
        {
            do
            {
                j = i;
                if (i >= k)
                {
                    break label0;
                }
                j = i + a(list, charsequence.subSequence(i, k), a1);
                if (charsequence.charAt(j) == '?')
                {
                    break;
                }
                i = j;
            } while (charsequence.charAt(j) != ',');
            j++;
        }
_L4:
        list.remove(0);
        return j;
_L2:
        j = i;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static o a(CharSequence charsequence)
    {
        com.c.a.b.o.a a1 = o.h();
        int j = charsequence.length();
        for (int i = 0; i < j; i += a(((List) (new LinkedList())), charsequence.subSequence(i, j), a1)) { }
        return a1.a();
    }

}
