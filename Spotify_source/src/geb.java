// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class geb
{

    private static int a(List list, int i)
    {
        int k = ((Integer)list.get(i)).intValue();
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); j < list.size() && ((Integer)list.get(j)).intValue() == k; i += k)
        {
            j++;
        }

        return i;
    }

    public static int a(List list, List list1, gec gec1, ged ged1)
    {
        if (list.size() * list1.size() > 10000)
        {
            Logger.b("Calculating difference on big lists! Be wary of performance issues.", new Object[0]);
        }
        int i = list.size();
        int j = list1.size();
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i + 1, j + 1
        });
        ai[0][0] = 0;
        for (i = 1; i <= list.size(); i++)
        {
            ai[i][0] = i;
        }

        for (i = 1; i <= list1.size(); i++)
        {
            ai[0][i] = i;
        }

        for (i = 1; i <= list.size(); i++)
        {
            j = 1;
            while (j <= list1.size()) 
            {
                if (a(list.get(i - 1), list1.get(j - 1), ged1))
                {
                    ai[i][j] = ai[i - 1][j - 1];
                } else
                {
                    int k = ai[i - 1][j];
                    int j1 = ai[i][j - 1];
                    ai[i][j] = Math.min(j1 + 1, k + 1);
                }
                j++;
            }
        }

        ArrayList arraylist = new ArrayList();
        j = list.size();
        i = list1.size();
        int l;
        do
        {
            l = j;
            if (j <= 0)
            {
                break;
            }
            l = j;
            if (i <= 0)
            {
                break;
            }
            if (a(list.get(j - 1), list1.get(i - 1), ged1))
            {
                arraylist.add(Integer.valueOf(0));
                j--;
                i--;
            } else
            if (ai[j - 1][i] + 1 == ai[j][i])
            {
                arraylist.add(Integer.valueOf(-1));
                j--;
            } else
            {
                arraylist.add(Integer.valueOf(1));
                i--;
            }
        } while (true);
        do
        {
            j = i;
            if (l <= 0)
            {
                break;
            }
            arraylist.add(Integer.valueOf(-1));
            l--;
        } while (true);
        for (; j > 0; j--)
        {
            arraylist.add(Integer.valueOf(1));
        }

        Collections.reverse(arraylist);
        i = 0;
        j = 0;
        do
        {
            while (i < arraylist.size()) 
            {
                if (((Integer)arraylist.get(i)).intValue() == 0)
                {
                    j++;
                    i++;
                } else
                {
                    int k1 = a(((List) (arraylist)), i);
                    int i1;
                    if (k1 > 0)
                    {
                        if (k1 == 1)
                        {
                            gec1.a(j);
                        } else
                        {
                            gec1.a(j, k1);
                        }
                    } else
                    if (k1 == -1)
                    {
                        gec1.b(j);
                    } else
                    {
                        gec1.b(j, -k1);
                    }
                    i1 = Math.abs(k1);
                    j = Math.max(0, k1) + j;
                    i = i1 + i;
                }
            }
            return ai[list.size()][list1.size()];
        } while (true);
    }

    private static boolean a(Object obj, Object obj1, ged ged1)
    {
        if (ged1 != null)
        {
            return ged1.a(obj, obj1);
        }
        return obj == obj1 || obj != null && obj.equals(obj1);
    }
}
