// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.io.PrintWriter;

public class TimeUtils
{

    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 0x15180;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char sFormatStr[] = new char[24];
    private static final Object sFormatSync = new Object();

    public TimeUtils()
    {
    }

    private static int accumField(int i, int j, boolean flag, int k)
    {
        if (i > 99 || flag && k >= 3)
        {
            return j + 3;
        }
        if (i > 9 || flag && k >= 2)
        {
            return j + 2;
        }
        if (flag || i > 0)
        {
            return j + 1;
        } else
        {
            return 0;
        }
    }

    public static void formatDuration(long l, long l1, PrintWriter printwriter)
    {
        if (l == 0L)
        {
            printwriter.print("--");
            return;
        } else
        {
            formatDuration(l - l1, printwriter, 0);
            return;
        }
    }

    public static void formatDuration(long l, PrintWriter printwriter)
    {
        formatDuration(l, printwriter, 0);
    }

    public static void formatDuration(long l, PrintWriter printwriter, int i)
    {
        synchronized (sFormatSync)
        {
            i = formatDurationLocked(l, i);
            printwriter.print(new String(sFormatStr, 0, i));
        }
        return;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

    public static void formatDuration(long l, StringBuilder stringbuilder)
    {
        synchronized (sFormatSync)
        {
            int i = formatDurationLocked(l, 0);
            stringbuilder.append(sFormatStr, 0, i);
        }
        return;
        stringbuilder;
        obj;
        JVM INSTR monitorexit ;
        throw stringbuilder;
    }

    private static int formatDurationLocked(long l, int i)
    {
        if (sFormatStr.length < i)
        {
            sFormatStr = new char[i];
        }
        char ac[] = sFormatStr;
        if (l == 0L)
        {
            while (i - 1 < 0) 
            {
                ac[0] = ' ';
            }
            ac[0] = '0';
            return 1;
        }
        char c;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int j2;
        int k2;
        if (l > 0L)
        {
            c = '+';
        } else
        {
            l = -l;
            c = '-';
        }
        k2 = (int)(l % 1000L);
        i1 = (int)Math.floor(l / 1000L);
        k = 0;
        j = i1;
        if (i1 > 0x15180)
        {
            k = i1 / 0x15180;
            j = i1 - 0x15180 * k;
        }
        int i2;
        boolean flag1;
        if (j > 3600)
        {
            i1 = j / 3600;
            j1 = i1;
            j -= i1 * 3600;
        } else
        {
            j1 = 0;
        }
        if (j > 60)
        {
            i1 = j / 60;
            k1 = i1;
            i1 = j - i1 * 60;
        } else
        {
            k1 = 0;
            i1 = j;
        }
        if (i != 0)
        {
            j = accumField(k, 1, false, 0);
            int l1;
            boolean flag;
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j += accumField(j1, 1, flag, 2);
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j += accumField(k1, 1, flag, 2);
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l1 = j + accumField(i1, 1, flag, 2);
            if (l1 > 0)
            {
                j = 3;
            } else
            {
                j = 0;
            }
            j2 = accumField(k2, 2, true, j);
            j = 0;
            l1 = j2 + 1 + l1;
            do
            {
                j2 = j;
                if (l1 >= i)
                {
                    break;
                }
                ac[j] = ' ';
                l1++;
                j++;
            } while (true);
        } else
        {
            j2 = 0;
        }
        ac[j2] = c;
        i2 = j2 + 1;
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = printField(ac, k, 'd', i2, false, 0);
        if (k != i2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        k = printField(ac, j1, 'h', k, flag1, j);
        if (k != i2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        k = printField(ac, k1, 'm', k, flag1, j);
        if (k != i2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        j = printField(ac, i1, 's', k, flag1, j);
        if (i != 0 && j != i2)
        {
            i = 3;
        } else
        {
            i = 0;
        }
        i = printField(ac, k2, 'm', j, true, i);
        ac[i] = 's';
        return i + 1;
    }

    private static int printField(char ac[], int i, char c, int j, boolean flag, int k)
    {
label0:
        {
label1:
            {
                int l;
                if (!flag)
                {
                    l = j;
                    if (i <= 0)
                    {
                        break label0;
                    }
                }
                int j1;
                if (flag && k >= 3 || i > 99)
                {
                    int i1 = i / 100;
                    ac[j] = (char)(i1 + 48);
                    l = j + 1;
                    i -= i1 * 100;
                } else
                {
                    l = j;
                }
                if ((!flag || k < 2) && i <= 9)
                {
                    j1 = l;
                    k = i;
                    if (j == l)
                    {
                        break label1;
                    }
                }
                j = i / 10;
                ac[l] = (char)(j + 48);
                j1 = l + 1;
                k = i - j * 10;
            }
            ac[j1] = (char)(k + 48);
            i = j1 + 1;
            ac[i] = c;
            l = i + 1;
        }
        return l;
    }

}
