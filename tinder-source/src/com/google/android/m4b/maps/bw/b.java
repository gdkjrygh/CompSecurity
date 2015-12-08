// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class b
{
    public static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final Logger c = Logger.getLogger(com/google/android/m4b/maps/bw/b.getCanonicalName());
    private List a;
    private byte b[];

    public b(List list, byte abyte0[])
    {
        boolean flag1 = true;
        super();
        a = null;
        b = null;
        j.a(list);
        boolean flag;
        if (list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "The list of featureIds is empty");
        j.a(abyte0);
        if (abyte0.length > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j.a(flag, "The featureMapRaster is empty");
        a = list;
        b = abyte0;
    }

    private int a(int i)
    {
        if (i + 1 > b.length)
        {
            a(b);
        }
        return (c(i) << 6) + c(i + 1);
    }

    private static void a(byte abyte0[])
    {
        String s = new String(abyte0);
        abyte0 = s;
        if (s.length() > 100)
        {
            abyte0 = s.substring(0, 100);
        }
        abyte0 = String.valueOf(abyte0);
        if (abyte0.length() != 0)
        {
            abyte0 = "Invalid featureMap raster:".concat(abyte0);
        } else
        {
            abyte0 = new String("Invalid featureMap raster:");
        }
        if (ab.a(com/google/android/m4b/maps/bw/b.getSimpleName(), 6))
        {
            Log.e(com/google/android/m4b/maps/bw/b.getSimpleName(), abyte0);
        }
        throw new a(abyte0);
    }

    private int b(int i)
    {
        if (i + 2 > b.length)
        {
            a(b);
        }
        return (c(i) << 12) + (c(i + 1) << 6) + c(i + 2);
    }

    private int c(int i)
    {
        if (i > b.length)
        {
            a(b);
        }
        return b[i] - 63;
    }

    private int d(int i)
    {
        return b(i * 3 + 5);
    }

    public final List a(int i, int k)
    {
        boolean flag = false;
        if (c(0) != 0)
        {
            a(b);
        }
        ArrayList arraylist1 = new ArrayList();
        int i1 = a(3);
        int l = d(k);
        if (k == i1 - 1)
        {
            i1 = b.length;
        } else
        {
            i1 = d(k + 1);
        }
        k = l;
        l = 0;
        do
        {
            if (l <= i && k < i1)
            {
                int j1 = c(k);
                k++;
                switch (j1)
                {
                case 1: // '\001'
                    l++;
                    break;

                case 2: // '\002'
                    l += c(k);
                    k++;
                    break;

                case 3: // '\003'
                    l += a(k);
                    k += 2;
                    break;

                case 5: // '\005'
                    arraylist1.add(Integer.valueOf(c(k)));
                    k++;
                    break;

                case 6: // '\006'
                    arraylist1.add(Integer.valueOf(a(k)));
                    k += 2;
                    break;

                case 7: // '\007'
                    arraylist1.add(Integer.valueOf(b(k)));
                    k += 3;
                    break;

                case 8: // '\b'
                    arraylist1.clear();
                    break;
                }
            } else
            {
                ArrayList arraylist = new ArrayList();
                for (i = ((flag) ? 1 : 0); i < arraylist1.size(); i++)
                {
                    if (((Integer)arraylist1.get(i)).intValue() > a.size() - 1)
                    {
                        throw new a("FeatureIndex is bigger than the total number of features available");
                    }
                    arraylist.add(a.get(((Integer)arraylist1.get(i)).intValue()));
                }

                if (arraylist.size() > 1)
                {
                    HashSet hashset = new HashSet();
                    ArrayList arraylist2 = new ArrayList();
                    Iterator iterator = arraylist.iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        String s = (String)iterator.next();
                        if (hashset.add(s))
                        {
                            arraylist2.add(s);
                        }
                    } while (true);
                    arraylist.clear();
                    arraylist.addAll(arraylist2);
                }
                return arraylist;
            }
        } while (true);
    }

}
