// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import android.app.ActivityManager;
import android.content.pm.PackageManager;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.qihoo360.mobilesafe.core.d:
//            g

public class com.qihoo360.mobilesafe.core.d.a
{
    static final class a
    {

        int a;
        int b;
        String c[];
        String d;
        android.os.Debug.MemoryInfo e;
        int f;

        public String toString()
        {
            return String.format(Locale.US, "%s[pid=%d,uid=%d,processName=%s,oom_adj=%d,pss=%dKB", new Object[] {
                c[0], Integer.valueOf(a), Integer.valueOf(b), d, Integer.valueOf(f), Integer.valueOf(e.getTotalPss())
            });
        }

        a()
        {
        }
    }


    private static int a = -1;
    private static int b = 0;
    private static int c = 1;
    private static int d = 2;

    private static final int a()
    {
        Object obj;
        if (a > 0)
        {
            return a;
        }
        obj = new File(String.format("/proc/%d/stat", new Object[] {
            Integer.valueOf(Process.myPid())
        }));
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        String s;
        obj = new BufferedReader(new FileReader(((File) (obj))));
        s = ((BufferedReader) (obj)).readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        a = Integer.parseInt(s.split("\\s+")[3]);
        ((BufferedReader) (obj)).close();
_L2:
        return a;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(String s)
    {
        BufferedReader bufferedreader = new BufferedReader(new FileReader(s));
        int i = Integer.parseInt(bufferedreader.readLine());
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return -1;
            }
            return i;
        } else
        {
            return i;
        }
_L2:
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        bufferedreader.close();
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        bufferedreader = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static android.app.ActivityManager.RunningAppProcessInfo a(a a1)
    {
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = null;
        if (a1 != null)
        {
            runningappprocessinfo = new android.app.ActivityManager.RunningAppProcessInfo();
            runningappprocessinfo.pid = a1.a;
            runningappprocessinfo.uid = a1.b;
            runningappprocessinfo.processName = a1.d;
            runningappprocessinfo.pkgList = a1.c;
            runningappprocessinfo.importance = g.a(a1.f);
        }
        return runningappprocessinfo;
    }

    public static List a(ActivityManager activitymanager, PackageManager packagemanager)
    {
        Object obj;
        ArrayList arraylist;
        int i;
        i = 0;
        obj = null;
        System.currentTimeMillis();
        arraylist = new ArrayList();
        int j;
        j = a();
        activitymanager = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ps").getInputStream()));
        activitymanager.readLine();
_L2:
        String s = activitymanager.readLine();
        if (s == null)
        {
label0:
            {
                {
                    activitymanager = obj;
                    if (arraylist == null)
                    {
                        break label0;
                    }
                    activitymanager = obj;
                    String as[];
                    a a1;
                    try
                    {
                        if (arraylist.isEmpty())
                        {
                            break label0;
                        }
                        activitymanager = new ArrayList();
                    }
                    // Misplaced declaration of an exception variable
                    catch (ActivityManager activitymanager)
                    {
                        return null;
                    }
                    try
                    {
                        j = arraylist.size();
                    }
                    // Misplaced declaration of an exception variable
                    catch (PackageManager packagemanager)
                    {
                        return activitymanager;
                    }
                }
                if (i < j)
                {
                    break MISSING_BLOCK_LABEL_266;
                }
            }
            return activitymanager;
        }
        if (s.charAt(0) != 'u') goto _L2; else goto _L1
_L1:
        as = s.split("\\s+");
        if (as[b].matches("u\\d*_a\\d+"))
        {
            a1 = new a();
            if (Integer.parseInt(as[d]) == j)
            {
                a1.a = Integer.parseInt(as[c]);
                a1.b = b(as[b]);
                a1.d = as[as.length - 1];
                a1.c = packagemanager.getPackagesForUid(a1.b);
                a1.f = a((new StringBuilder("/proc/")).append(a1.a).append("/oom_adj").toString());
                arraylist.add(a1);
            }
        }
          goto _L2
        packagemanager = (a)arraylist.get(i);
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        activitymanager.add(a(((a) (packagemanager))));
        i++;
        break MISSING_BLOCK_LABEL_97;
    }

    private static final int b(String s)
    {
        return Integer.parseInt(s.substring(s.indexOf('_') + 2)) + 10000;
    }

}
