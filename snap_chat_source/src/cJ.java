// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public final class cJ
{

    private static final FileFilter a = new FileFilter() {

        public final boolean accept(File file)
        {
            file = file.getName();
            if (file.startsWith("cpu"))
            {
                for (int i = 3; i < file.length(); i++)
                {
                    if (file.charAt(i) < '0' || file.charAt(i) > '9')
                    {
                        return false;
                    }
                }

                return true;
            } else
            {
                return false;
            }
        }

    };

    public static int a()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            return 1;
        }
        int i;
        try
        {
            i = (new File("/sys/devices/system/cpu/")).listFiles(a).length;
        }
        catch (SecurityException securityexception)
        {
            return -1;
        }
        catch (NullPointerException nullpointerexception)
        {
            return -1;
        }
        return i;
    }

    private static int a(String s, FileInputStream fileinputstream)
    {
        byte abyte0[];
        int j;
        j = 0;
        abyte0 = new byte[1024];
        int l = fileinputstream.read(abyte0);
          goto _L1
_L7:
        int i;
        int k = i;
        if (j >= l) goto _L3; else goto _L2
_L2:
        int i1;
        i1 = j - i;
        k = i;
        if (abyte0[j] != s.charAt(i1)) goto _L3; else goto _L4
_L4:
        if (i1 != s.length() - 1) goto _L6; else goto _L5
_L15:
        i = Integer.parseInt(new String(abyte0, 0, j, i - j));
        return i;
_L14:
        j++;
          goto _L5
_L12:
        return -1;
_L6:
        j++;
          goto _L7
_L3:
        j = k + 1;
          goto _L1
        s;
_L8:
        return -1;
        s;
        if (true) goto _L8; else goto _L1
_L1:
        if (j >= l) goto _L8; else goto _L9
_L9:
        if (abyte0[j] == 10)
        {
            break; /* Loop/switch isn't completed */
        }
        k = j;
        if (j != 0) goto _L3; else goto _L10
_L10:
        i = j;
        if (abyte0[j] == 10)
        {
            i = j + 1;
        }
        j = i;
          goto _L7
_L5:
        if (j >= 1024 || abyte0[j] == 10) goto _L12; else goto _L11
_L11:
        if (abyte0[j] < 48 || abyte0[j] > 57) goto _L14; else goto _L13
_L13:
        i = j + 1;
        while (i < 1024 && abyte0[i] >= 48 && abyte0[i] <= 57) 
        {
            i++;
        }
          goto _L15
    }

    public static long a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
            return memoryinfo.totalMem;
        }
        Exception exception;
        int i;
        long l;
        try
        {
            context = new FileInputStream("/proc/meminfo");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1L;
        }
        i = a("MemTotal", ((FileInputStream) (context)));
        l = (long)i << 10;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return l;
        }
        return l;
        exception;
        context.close();
        throw exception;
    }

    public static int b()
    {
        int i;
        int k;
        k = 0;
        i = -1;
_L8:
        if (k >= a()) goto _L2; else goto _L1
_L1:
        Object obj = new File((new StringBuilder("/sys/devices/system/cpu/cpu")).append(k).append("/cpufreq/cpuinfo_max_freq").toString());
        int j = i;
        if (!((File) (obj)).exists()) goto _L4; else goto _L3
_L3:
        Object obj1;
        obj1 = new byte[128];
        obj = new FileInputStream(((File) (obj)));
        ((FileInputStream) (obj)).read(((byte []) (obj1)));
        j = 0;
        while (obj1[j] >= 48 && obj1[j] <= 57 && j < 128) 
        {
            j++;
        }
          goto _L5
_L6:
        obj1 = Integer.valueOf(Integer.parseInt(new String(((byte []) (obj1)), 0, j)));
        j = i;
        if (((Integer) (obj1)).intValue() > i)
        {
            j = ((Integer) (obj1)).intValue();
        }
        ((FileInputStream) (obj)).close();
        break; /* Loop/switch isn't completed */
        obj1;
        ((FileInputStream) (obj)).close();
        j = i;
        break; /* Loop/switch isn't completed */
        obj1;
        try
        {
            ((FileInputStream) (obj)).close();
            throw obj1;
        }
        catch (IOException ioexception)
        {
            j = -1;
        }
        break; /* Loop/switch isn't completed */
_L2:
        j = i;
        if (i != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new FileInputStream("/proc/cpuinfo");
        j = a("cpu MHz", ((FileInputStream) (obj)));
        k = j * 1000;
        j = i;
        if (k > i)
        {
            j = k;
        }
        ((FileInputStream) (obj)).close();
        return j;
        obj1;
        ((FileInputStream) (obj)).close();
        throw obj1;
_L5:
        if (true) goto _L6; else goto _L4
_L4:
        k++;
        i = j;
        if (true) goto _L8; else goto _L7
_L7:
        return j;
    }

}
