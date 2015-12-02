// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import java.io.BufferedReader;
import java.io.FileReader;

public class d
{

    public static int a = 0;
    private static int b = 0;
    private static int c = 0;

    public static int a()
    {
        int j = 0;
        BufferedReader bufferedreader = new BufferedReader(new FileReader("/proc/meminfo"));
        String s;
        int k;
        s = bufferedreader.readLine().split("\\s+")[1];
        k = s.length();
        int i = 0;
_L5:
        if (j < k) goto _L2; else goto _L1
_L1:
        Object obj;
        if (bufferedreader != null)
        {
            j = i;
            char c1;
            boolean flag;
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                i = j;
            }
        }
        j = i;
        if (i == 0)
        {
            j = 0x100000;
        }
        return j;
_L2:
        c1 = s.charAt(j);
        flag = Character.isDigit(c1);
        if (!flag) goto _L1; else goto _L3
_L3:
        i = i * 10 + (c1 - 48);
        j++;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        bufferedreader = null;
        i = 0;
_L7:
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        j = i;
        bufferedreader.close();
        j = i;
        throw obj;
        obj;
        i = 0;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static int a(int i)
    {
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new FileReader(String.format("/proc/%d/oom_adj", new Object[] {
                Integer.valueOf(i)
            })));
            String s = bufferedreader.readLine();
            bufferedreader.close();
            i = Integer.parseInt(s);
        }
        catch (Exception exception)
        {
            return 0x7fffffff;
        }
        return i;
    }

}
