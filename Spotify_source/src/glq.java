// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import com.google.android.exoplayer.MediaCodecUtil;
import java.util.ArrayList;
import java.util.List;

public final class glq
{

    public static int[] a(List list, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        int k1 = MediaCodecUtil.a();
        int l = 0x7fffffff;
        int i1 = 0;
        while (i1 < list.size()) 
        {
            bad bad1 = (bad)list.get(i1);
            int k;
            int j1;
            if (bad1.d >= 1280 || bad1.e >= 720)
            {
                k = 0;
            } else
            if (bad1.d > 0 && bad1.e > 0 && bad1.d * bad1.e > k1)
            {
                k = 0;
            } else
            {
                k = 1;
            }
            j1 = l;
            if (k != 0)
            {
                arraylist.add(Integer.valueOf(i1));
                j1 = l;
                if (bad1.d > 0)
                {
                    j1 = l;
                    if (bad1.e > 0)
                    {
                        int l1 = bad1.d;
                        int i2 = bad1.e;
                        Object obj;
                        if (l1 > i2)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (i > j)
                        {
                            j1 = 1;
                        } else
                        {
                            j1 = 0;
                        }
                        if (k != j1)
                        {
                            k = i;
                            j1 = j;
                        } else
                        {
                            k = j;
                            j1 = i;
                        }
                        if (l1 * k >= i2 * j1)
                        {
                            obj = new Point(j1, ((j1 * i2 + l1) - 1) / l1);
                        } else
                        {
                            obj = new Point(((k * l1 + i2) - 1) / i2, k);
                        }
                        k = bad1.d * bad1.e;
                        j1 = l;
                        if (bad1.d >= (int)((float)((Point) (obj)).x * 0.98F))
                        {
                            j1 = l;
                            if (bad1.e >= (int)((float)((Point) (obj)).y * 0.98F))
                            {
                                j1 = l;
                                if (k < l)
                                {
                                    j1 = k;
                                }
                            }
                        }
                    }
                }
            }
            i1++;
            l = j1;
        }
        for (i = arraylist.size() - 1; i >= 0; i--)
        {
            obj = (bad)list.get(((Integer)arraylist.get(i)).intValue());
            if (((bad) (obj)).d <= 0 || ((bad) (obj)).e <= 0)
            {
                continue;
            }
            j = ((bad) (obj)).d;
            if (((bad) (obj)).e * j > l)
            {
                arraylist.remove(i);
            }
        }

        return bej.a(arraylist);
    }
}
