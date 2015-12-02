// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.Context;
import android.os.Process;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.d;
import com.qihoo360.mobilesafe.b.j;
import com.qihoo360.mobilesafe.b.o;
import java.util.List;

// Referenced classes of package com.qihoo.security.service:
//            d

class a
    implements Runnable
{

    final com.qihoo.security.service.d a;

    public void run()
    {
        try
        {
            Thread.sleep(10000L);
            if (d.a(a).size() == 0)
            {
                String s = o.a();
                if (!s.equals(SecurityApplication.a().getPackageName()))
                {
                    d.a().b();
                    if (s.equals((new StringBuilder()).append(SecurityApplication.a().getPackageName()).append(":ui").toString()))
                    {
                        j.a();
                    }
                    Process.killProcess(Process.myPid());
                }
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    ication(com.qihoo.security.service.d d1)
    {
        a = d1;
        super();
    }
}
