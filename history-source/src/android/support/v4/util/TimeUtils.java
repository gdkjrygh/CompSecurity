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
        int l1;
        int i2;
        boolean flag;
        int j2;
        if (l > 0L)
        {
            c = '+';
        } else
        {
            c = '-';
            l = -l;
        }
        j2 = (int)(l % 1000L);
        k = (int)Math.floor(l / 1000L);
        j1 = 0;
        k1 = 0;
        l1 = 0;
        j = k;
        if (k > 0x15180)
        {
            j1 = k / 0x15180;
            j = k - 0x15180 * j1;
        }
        k = j;
        if (j > 3600)
        {
            k1 = j / 3600;
            k = j - k1 * 3600;
        }
        i1 = k;
        if (k > 60)
        {
            l1 = k / 60;
            i1 = k - l1 * 60;
        }
        i2 = 0;
        flag = false;
        if (i != 0)
        {
            j = accumField(j1, 1, false, 0);
            boolean flag1;
            if (j > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            j += accumField(k1, 1, flag1, 2);
            if (j > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            j += accumField(l1, 1, flag1, 2);
            if (j > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            k = j + accumField(i1, 1, flag1, 2);
            if (k > 0)
            {
                j = 3;
            } else
            {
                j = 0;
            }
            k += accumField(j2, 2, true, j) + 1;
            j = ((flag) ? 1 : 0);
            do
            {
                i2 = j;
                if (k >= i)
                {
                    break;
                }
                ac[j] = ' ';
                j++;
                k++;
            } while (true);
        }
        ac[i2] = c;
        k = i2 + 1;
        boolean flag2;
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j1 = printField(ac, j1, 'd', k, false, 0);
        if (j1 != k)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        j1 = printField(ac, k1, 'h', j1, flag2, j);
        if (j1 != k)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        j1 = printField(ac, l1, 'm', j1, flag2, j);
        if (j1 != k)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        j = printField(ac, i1, 's', j1, flag2, j);
        if (i != 0 && j != k)
        {
            i = 3;
        } else
        {
            i = 0;
        }
        i = printField(ac, j2, 'm', j, true, i);
        ac[i] = 's';
        return i + 1;
    }

    private static int printField(char ac[], int i, char c, int j, boolean flag, int k)
    {
        int l;
label0:
        {
            int i1;
label1:
            {
                if (!flag)
                {
                    l = j;
                    if (i <= 0)
                    {
                        break label0;
                    }
                }
                if (!flag || k < 3)
                {
                    l = i;
                    i1 = j;
                    if (i <= 99)
                    {
                        break label1;
                    }
                }
                l = i / 100;
                ac[j] = (char)(l + 48);
                i1 = j + 1;
                l = i - l * 100;
            }
label2:
            {
                if ((!flag || k < 2) && l <= 9)
                {
                    k = l;
                    i = i1;
                    if (j == i1)
                    {
                        break label2;
                    }
                }
                j = l / 10;
                ac[i1] = (char)(j + 48);
                i = i1 + 1;
                k = l - j * 10;
            }
            ac[i] = (char)(k + 48);
            i++;
            ac[i] = c;
            l = i + 1;
        }
        return l;
    }

}
