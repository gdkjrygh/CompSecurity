// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.profile:
//            g

class i
    implements g
{

    final Context a;
    final ActivityManager b;
    final List c = new ArrayList();

    i(Context context)
    {
        a = context;
        b = (ActivityManager)context.getSystemService("activity");
    }

    public int a()
    {
        return 2;
    }

    public String a(long l)
    {
        int i1 = 0;
        Object obj = b.getRunningAppProcesses();
        if (obj == null)
        {
            return "0";
        }
        c.clear();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
            if (runningappprocessinfo.pkgList != null && runningappprocessinfo.pkgList.length >= 1 && "com.qihoo.security.lite".equals(runningappprocessinfo.pkgList[0]))
            {
                c.add(Integer.valueOf(runningappprocessinfo.pid));
            }
        } while (true);
        int j1 = c.size();
        Object aobj[] = new int[j1];
        for (int j = 0; j < j1; j++)
        {
            aobj[j] = ((Integer)c.get(j)).intValue();
        }

        aobj = b.getProcessMemoryInfo(((int []) (aobj)));
        if (aobj != null)
        {
            int k1 = aobj.length;
            int k = 0;
            do
            {
                j1 = k;
                if (i1 >= k1)
                {
                    break;
                }
                k += aobj[i1].getTotalPss();
                i1++;
            } while (true);
        } else
        {
            j1 = 0;
        }
        return (new StringBuilder()).append("").append(j1).toString();
    }
}
