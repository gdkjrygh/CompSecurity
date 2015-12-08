// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.preprocess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.preprocess:
//            d, c

public final class b
{

    private static final HashMap a;

    private static int a(int i, int ai[])
    {
        int l = 0;
        int i1 = ai.length;
        int k = 0;
        while (k < i1) 
        {
            int j1 = ai[k];
            int j = Arrays.binarySearch(d.b[j1], i);
            if (j >= 0)
            {
                j = l | 1 << j1;
            } else
            {
                int k1 = -(j + 1);
                int ai1[] = d.c[j1];
                j = l;
                if (k1 > 0)
                {
                    j = l;
                    if (k1 <= ai1.length)
                    {
                        j = l;
                        if (i <= ai1[k1 - 1])
                        {
                            j = l | 1 << j1;
                        }
                    }
                }
            }
            k++;
            l = j;
        }
        return l;
    }

    private static ArrayList a(String s, ArrayList arraylist)
    {
        int j1 = 0;
        BitSet bitset = new BitSet();
        int k1 = arraylist.size();
        for (int i = 0; i < k1; i++)
        {
            int ai[] = ((c)arraylist.get(i)).b;
            int i2 = ai.length;
            for (int l = 0; l < i2; l++)
            {
                bitset.set(ai[l]);
            }

        }

        int ai1[] = new int[bitset.cardinality()];
        int i1 = bitset.nextSetBit(0);
        for (int j = 0; i1 >= 0; j++)
        {
            ai1[j] = i1;
            i1 = bitset.nextSetBit(i1 + 1);
        }

        i1 = s.length();
label0:
        for (int k = j1; k < i1; k = Character.charCount(j1) + k)
        {
            j1 = s.codePointAt(k);
            if (!Character.isLetter(j1))
            {
                continue;
            }
            int l1 = a(j1, ai1);
            Iterator iterator = arraylist.iterator();
            do
            {
                c c2;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    c2 = (c)iterator.next();
                } while ((c2.c & l1) == 0);
                c2.e = c2.e + 1;
            } while (true);
        }

        Collections.sort(arraylist);
        s = new ArrayList();
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            c c1 = (c)arraylist.next();
            if (c1.e > 0)
            {
                s.add(c1.a);
            }
        } while (true);
        return s;
    }

    public static ArrayList a(String s, List list)
    {
        if (s != null && s.length() > 0 && list != null && !list.isEmpty())
        {
            ArrayList arraylist = new ArrayList();
            int l = list.size();
            int i = 0;
            while (i < l) 
            {
                String s1 = (String)list.get(i);
                int k = s1.indexOf('-');
                int j = k;
                if (k < 0)
                {
                    j = s1.indexOf('_');
                }
                Object obj;
                if (j > 0)
                {
                    obj = s1.substring(0, j);
                } else
                {
                    obj = s1;
                }
                obj = (Integer)a.get(obj);
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = new c(s1, d.d[((Integer) (obj)).intValue()], d.e[((Integer) (obj)).intValue()], d.f[((Integer) (obj)).intValue()]);
                }
                if (obj != null)
                {
                    arraylist.add(obj);
                }
                i++;
            }
            if (!arraylist.isEmpty())
            {
                return a(s, arraylist);
            }
        }
        return new ArrayList();
    }

    static 
    {
        a = new HashMap();
        for (int i = 0; i < d.a.length; i++)
        {
            a.put(d.a[i], Integer.valueOf(i));
        }

    }
}
