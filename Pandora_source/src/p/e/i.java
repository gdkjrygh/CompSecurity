// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.e;

import java.io.PrintWriter;

public class i
{

    private static final Object a = new Object();
    private static char b[] = new char[24];

    private static int a(int j, int k, boolean flag, int l)
    {
        if (j > 99 || flag && l >= 3)
        {
            return k + 3;
        }
        if (j > 9 || flag && l >= 2)
        {
            return k + 2;
        }
        if (flag || j > 0)
        {
            return k + 1;
        } else
        {
            return 0;
        }
    }

    private static int a(long l, int j)
    {
        if (b.length < j)
        {
            b = new char[j];
        }
        char ac[] = b;
        if (l == 0L)
        {
            while (j - 1 < 0) 
            {
                ac[0] = ' ';
            }
            ac[0] = '0';
            return 1;
        }
        char c;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        int k2;
        int l2;
        if (l > 0L)
        {
            c = '+';
        } else
        {
            l = -l;
            c = '-';
        }
        l2 = (int)(l % 1000L);
        j1 = (int)Math.floor(l / 1000L);
        i1 = 0;
        k = j1;
        if (j1 > 0x15180)
        {
            i1 = j1 / 0x15180;
            k = j1 - 0x15180 * i1;
        }
        int j2;
        boolean flag1;
        if (k > 3600)
        {
            j1 = k / 3600;
            k1 = j1;
            k -= j1 * 3600;
        } else
        {
            k1 = 0;
        }
        if (k > 60)
        {
            j1 = k / 60;
            l1 = j1;
            j1 = k - j1 * 60;
        } else
        {
            l1 = 0;
            j1 = k;
        }
        if (j != 0)
        {
            k = a(i1, 1, false, 0);
            int i2;
            boolean flag;
            if (k > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k += a(k1, 1, flag, 2);
            if (k > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k += a(l1, 1, flag, 2);
            if (k > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i2 = k + a(j1, 1, flag, 2);
            if (i2 > 0)
            {
                k = 3;
            } else
            {
                k = 0;
            }
            k2 = a(l2, 2, true, k);
            k = 0;
            i2 = k2 + 1 + i2;
            do
            {
                k2 = k;
                if (i2 >= j)
                {
                    break;
                }
                ac[k] = ' ';
                i2++;
                k++;
            } while (true);
        } else
        {
            k2 = 0;
        }
        ac[k2] = c;
        j2 = k2 + 1;
        if (j != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i1 = a(ac, i1, 'd', j2, false, 0);
        if (i1 != j2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (j != 0)
        {
            k = 2;
        } else
        {
            k = 0;
        }
        i1 = a(ac, k1, 'h', i1, flag1, k);
        if (i1 != j2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (j != 0)
        {
            k = 2;
        } else
        {
            k = 0;
        }
        i1 = a(ac, l1, 'm', i1, flag1, k);
        if (i1 != j2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (j != 0)
        {
            k = 2;
        } else
        {
            k = 0;
        }
        k = a(ac, j1, 's', i1, flag1, k);
        if (j != 0 && k != j2)
        {
            j = 3;
        } else
        {
            j = 0;
        }
        j = a(ac, l2, 'm', k, true, j);
        ac[j] = 's';
        return j + 1;
    }

    private static int a(char ac[], int j, char c, int k, boolean flag, int l)
    {
label0:
        {
label1:
            {
                int i1;
                if (!flag)
                {
                    i1 = k;
                    if (j <= 0)
                    {
                        break label0;
                    }
                }
                int k1;
                if (flag && l >= 3 || j > 99)
                {
                    int j1 = j / 100;
                    ac[k] = (char)(j1 + 48);
                    i1 = k + 1;
                    j -= j1 * 100;
                } else
                {
                    i1 = k;
                }
                if ((!flag || l < 2) && j <= 9)
                {
                    k1 = i1;
                    l = j;
                    if (k == i1)
                    {
                        break label1;
                    }
                }
                k = j / 10;
                ac[i1] = (char)(k + 48);
                k1 = i1 + 1;
                l = j - k * 10;
            }
            ac[k1] = (char)(l + 48);
            j = k1 + 1;
            ac[j] = c;
            i1 = j + 1;
        }
        return i1;
    }

    public static void a(long l, long l1, PrintWriter printwriter)
    {
        if (l == 0L)
        {
            printwriter.print("--");
            return;
        } else
        {
            a(l - l1, printwriter, 0);
            return;
        }
    }

    public static void a(long l, PrintWriter printwriter)
    {
        a(l, printwriter, 0);
    }

    public static void a(long l, PrintWriter printwriter, int j)
    {
        synchronized (a)
        {
            j = a(l, j);
            printwriter.print(new String(b, 0, j));
        }
        return;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

}
