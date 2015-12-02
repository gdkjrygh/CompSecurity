// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.profile:
//            g, l

class b
    implements g
{

    final Context a;
    final ActivityManager b;

    b(Context context)
    {
        a = context;
        b = (ActivityManager)context.getSystemService("activity");
    }

    public int a()
    {
        return 1;
    }

    public String a(long l1)
    {
        Object obj;
        int i;
        obj = b.getRunningAppProcesses();
        if (obj == null)
        {
            return "0";
        }
        obj = ((List) (obj)).iterator();
        i = 0;
_L2:
        String as[];
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        if (((android.app.ActivityManager.RunningAppProcessInfo) (obj1)).pkgList == null || ((android.app.ActivityManager.RunningAppProcessInfo) (obj1)).pkgList.length <= 0 || !"com.qihoo.security.lite".equals(((android.app.ActivityManager.RunningAppProcessInfo) (obj1)).pkgList[0]))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = l.a(String.format("/proc/%d/stat", new Object[] {
            Integer.valueOf(((android.app.ActivityManager.RunningAppProcessInfo) (obj1)).pid)
        }));
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = ((String) (obj1)).split("\\s+");
        int j;
        int k;
        j = Integer.parseInt(as[13]);
        k = Integer.parseInt(as[14]);
        i += k + j;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        return (new StringBuilder()).append("").append(i).toString();
    }
}
