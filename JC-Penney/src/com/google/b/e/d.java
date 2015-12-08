// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.b.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            r, c

public final class d extends r
{

    public d()
    {
    }

    private static boolean a(CharSequence charsequence, int i, int j)
    {
        j = i + j;
        int k;
        int l;
        for (l = charsequence.length(); i < j && i < l; j = k)
        {
label0:
            {
                char c1 = charsequence.charAt(i);
                if (c1 >= '0')
                {
                    k = j;
                    if (c1 <= '9')
                    {
                        break label0;
                    }
                }
                if (c1 != '\361')
                {
                    return false;
                }
                k = j + 1;
            }
            i++;
        }

        boolean flag;
        if (j <= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public b a(String s, a a1, int i, int j, Map map)
    {
        if (a1 != a.e)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode CODE_128, but got ").append(a1).toString());
        } else
        {
            return super.a(s, a1, i, j, map);
        }
    }

    public boolean[] a(String s)
    {
        int i;
        boolean flag;
        int l1;
        flag = false;
        l1 = s.length();
        if (l1 < 1 || l1 > 80)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Contents length should be between 1 and 80 characters, but got ").append(l1).toString());
        }
        i = 0;
_L9:
        Object obj;
        int k;
        int l;
        int i1;
        if (i < l1)
        {
            char c1 = s.charAt(i);
            if (c1 < ' ' || c1 > '~')
            {
                switch (c1)
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Bad character in input: ").append(c1).toString());

                case 241: 
                case 242: 
                case 243: 
                case 244: 
                    break;
                }
            }
            i++;
            continue; /* Loop/switch isn't completed */
        }
        obj = new ArrayList();
        k = 0;
        l = 0;
        i = 1;
        i1 = 0;
_L6:
        int j;
        int j1;
        j1 = i;
        if (k >= l1)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        int k1;
        if (l == 99)
        {
            i = 2;
        } else
        {
            i = 4;
        }
        if (a(((CharSequence) (s)), k, i))
        {
            j = 99;
        } else
        {
            j = 100;
        }
        if (j != l)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        s.charAt(k);
        JVM INSTR tableswitch 241 244: default 248
    //                   241 346
    //                   242 353
    //                   243 360
    //                   244 367;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (l == 100)
        {
            i = s.charAt(k) - 32;
        } else
        {
            i = Integer.parseInt(s.substring(k, k + 2));
            k++;
        }
        k++;
        j = l;
        l = k;
_L7:
        ((Collection) (obj)).add(com.google.b.e.c.a[i]);
        int ai[];
        if (l != 0)
        {
            k = j1 + 1;
        } else
        {
            k = j1;
        }
        k1 = k;
        i1 += i * j1;
        k = l;
        l = j;
        i = k1;
        if (true) goto _L6; else goto _L2
_L2:
        i = 102;
        break MISSING_BLOCK_LABEL_266;
_L3:
        i = 97;
        break MISSING_BLOCK_LABEL_266;
_L4:
        i = 96;
        break MISSING_BLOCK_LABEL_266;
_L5:
        i = 100;
        break MISSING_BLOCK_LABEL_266;
        if (l == 0)
        {
            if (j == 100)
            {
                i = 104;
                l = k;
            } else
            {
                i = 105;
                l = k;
            }
        } else
        {
            i = j;
            l = k;
        }
          goto _L7
        ((Collection) (obj)).add(com.google.b.e.c.a[i1 % 103]);
        ((Collection) (obj)).add(com.google.b.e.c.a[106]);
        s = ((Collection) (obj)).iterator();
        j = 0;
        do
        {
label0:
            {
                if (!s.hasNext())
                {
                    break label0;
                }
                ai = (int[])s.next();
                l = ai.length;
                k = 0;
                i = j;
                do
                {
                    j = i;
                    if (k >= l)
                    {
                        break;
                    }
                    j = ai[k];
                    k++;
                    i = j + i;
                } while (true);
            }
        } while (true);
        s = new boolean[j];
        obj = ((Collection) (obj)).iterator();
        for (i = ((flag) ? 1 : 0); ((Iterator) (obj)).hasNext(); i += a(((boolean []) (s)), i, (int[])((Iterator) (obj)).next(), true)) { }
        return s;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
