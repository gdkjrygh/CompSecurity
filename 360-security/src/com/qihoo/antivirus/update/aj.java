// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;

public class aj
{

    private static int a(Context context, String s, int i)
    {
        boolean flag;
        if (s.startsWith("/"))
        {
            flag = (new File(s)).exists();
        } else
        {
            flag = (new File(context.getFilesDir(), s)).exists();
        }
        return (i != 2 ? flag : !flag) ? 1 : -3;
    }

    private static int a(Context context, String s, String s1, int i)
    {
        PackageManager packagemanager;
        boolean flag;
        flag = false;
        packagemanager = context.getPackageManager();
        if (packagemanager != null) goto _L2; else goto _L1
_L1:
        return -3;
_L2:
        context = null;
        s = packagemanager.getPackageInfo(s, 0).versionName;
        flag = true;
        context = s;
_L5:
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return 1;
        if (!flag) goto _L1; else goto _L4
_L4:
        if (i == 1)
        {
            return 1;
        }
        int j = s1.compareTo(context);
        if (j == 0 && (i == 10 || i == 13 || i == 14))
        {
            return 1;
        }
        if (j > 0 && (i == 12 || i == 14 || i == 15))
        {
            return 1;
        }
        if (j < 0 && (i == 11 || i == 13 || i == 15))
        {
            return 1;
        }
          goto _L1
        context;
        return -3;
        s;
          goto _L5
    }

    public static int a(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        int i;
        int j;
        i = -1;
        j = a(s, s3);
        if (j >= 0) goto _L2; else goto _L1
_L1:
        int k;
        return i;
_L2:
        if ((k = a(s1, s4, s2, s5)) < 0) goto _L1; else goto _L3
_L3:
        if (j == 0 && k == 0)
        {
            return 0;
        }
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = a(context, s, j);
        i = j;
        if (j < 0) goto _L1; else goto _L4
_L4:
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = a(context, s1, s2, k);
        i = j;
        if (j < 0) goto _L1; else goto _L5
_L5:
        return 1;
    }

    private static int a(String s)
    {
        int i;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i != 0 ? 1 : 2;
    }

    private static int a(String s, String s1)
    {
        if (s == null && s1 == null)
        {
            return 0;
        }
        if (s != null && s1 != null)
        {
            return a(s1);
        } else
        {
            return -1;
        }
    }

    private static int a(String s, String s1, String s2, String s3)
    {
        byte byte0 = -1;
        if (s != null || s1 != null || s2 != null || s3 != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return i;
_L2:
        if (s == null || s1 == null || s2 == null || s3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = byte0;
        if (a(s1) == 1)
        {
            return b(s3);
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = byte0;
        if (s != null)
        {
            i = byte0;
            if (s1 != null)
            {
                i = byte0;
                if (s2 == null)
                {
                    i = byte0;
                    if (s3 == null)
                    {
                        return a(s1);
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static int b(String s)
    {
        if ("==".equals(s))
        {
            return 10;
        }
        if ("<".equals(s))
        {
            return 11;
        }
        if (">".equals(s))
        {
            return 12;
        }
        if ("<=".equals(s))
        {
            return 13;
        }
        if (">=".equals(s))
        {
            return 14;
        }
        return !"!=".equals(s) ? -1 : 15;
    }
}
