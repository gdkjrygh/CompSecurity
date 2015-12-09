// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.content.Context;
import java.text.DateFormatSymbols;
import java.util.Calendar;

// Referenced classes of package com.pandora.android.data:
//            AlarmData

public static final class b
{

    private static int a[] = {
        2, 3, 4, 5, 6, 7, 1
    };
    private int b;

    static int a(b b1)
    {
        return b1.b;
    }

    private boolean a(int i)
    {
        return (b & 1 << i) > 0;
    }

    public int a()
    {
        return b;
    }

    public int a(Calendar calendar)
    {
        if (b != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i;
        int k;
        k = calendar.get(7);
        i = 0;
_L6:
        j = i;
        if (i >= 7) goto _L4; else goto _L3
_L3:
        j = i;
        if (a(((k + 5) % 7 + i) % 7)) goto _L4; else goto _L5
_L5:
        i++;
          goto _L6
    }

    public String a(Context context, boolean flag)
    {
        boolean flag1 = false;
        StringBuilder stringbuilder = new StringBuilder();
        if (b == 0)
        {
            if (flag)
            {
                return context.getText(0x7f08008f).toString();
            } else
            {
                return "";
            }
        }
        if (b == 96)
        {
            return context.getText(0x7f080091).toString();
        }
        if (b == 31)
        {
            return context.getText(0x7f080090).toString();
        }
        if (b == 127)
        {
            return context.getText(0x7f08008e).toString();
        }
        int j = b;
        int i;
        int k;
        for (i = 0; j > 0; i = k)
        {
            k = i;
            if ((j & 1) == 1)
            {
                k = i + 1;
            }
            j >>= 1;
        }

        Object obj = new DateFormatSymbols();
        if (i > 1)
        {
            obj = ((DateFormatSymbols) (obj)).getShortWeekdays();
            j = ((flag1) ? 1 : 0);
        } else
        {
            obj = ((DateFormatSymbols) (obj)).getWeekdays();
            j = ((flag1) ? 1 : 0);
        }
        while (j < 7) 
        {
            int l = i;
            if ((b & 1 << j) != 0)
            {
                stringbuilder.append(obj[a[j]]);
                i--;
                l = i;
                if (i > 0)
                {
                    stringbuilder.append(context.getText(0x7f08008c));
                    l = i;
                }
            }
            j++;
            i = l;
        }
        return stringbuilder.toString();
    }

    public void a(int i, boolean flag)
    {
        if (flag)
        {
            b = b | 1 << i;
            return;
        } else
        {
            b = b & ~(1 << i);
            return;
        }
    }

    public boolean[] b()
    {
        boolean aflag[] = new boolean[7];
        for (int i = 0; i < 7; i++)
        {
            aflag[i] = a(i);
        }

        return aflag;
    }

    public boolean c()
    {
        return b != 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (b != ((b) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return b + 31;
    }


    public (int i)
    {
        b = i;
    }
}
