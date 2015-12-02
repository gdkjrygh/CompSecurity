// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.process;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.b.c;
import com.google.common.b.f;
import com.google.common.base.Charsets;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.common.process:
//            d, c

public class a
    implements d
{

    private static final Class a = com/facebook/common/process/a;
    private final Context b;
    private final ActivityManager c;
    private final javax.inject.a d;
    private volatile Optional e;

    public a(Context context, ActivityManager activitymanager, javax.inject.a a1)
    {
        b = context;
        c = activitymanager;
        d = a1;
    }

    private List d()
    {
        List list = c.getRunningAppProcesses();
        Object obj = list;
        if (list == null)
        {
            obj = es.d();
        }
        return ((List) (obj));
    }

    public com.facebook.common.process.c a()
    {
        BufferedReader bufferedreader;
        Object obj;
        obj = new File("/proc/self/cmdline");
        bufferedreader = null;
        BufferedReader bufferedreader1 = f.a(((File) (obj)), Charsets.UTF_8);
        bufferedreader = bufferedreader1;
        String s = bufferedreader1.readLine();
        obj = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        bufferedreader = bufferedreader1;
        obj = s.trim();
        bufferedreader = bufferedreader1;
        obj = com.facebook.common.process.c.a(((String) (obj)));
        com.google.common.b.c.a(bufferedreader1);
        return ((com.facebook.common.process.c) (obj));
        Exception exception;
        exception;
        com.google.common.b.c.a(bufferedreader);
        throw exception;
    }

    public com.facebook.common.process.c a(int i)
    {
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
            if (runningappprocessinfo.pid == i)
            {
                return com.facebook.common.process.c.a(runningappprocessinfo.processName);
            }
        }

        return c.a;
    }

    public boolean a(String s)
    {
        com.facebook.common.process.c c1 = b();
        if (c1 == null)
        {
            com.facebook.debug.log.b.d(a, "Couldn't find own process name");
            return false;
        } else
        {
            return Objects.equal(c1.b(), s);
        }
    }

    public com.facebook.common.process.c b()
    {
        if (e != null)
        {
            return (com.facebook.common.process.c)e.get();
        }
        com.facebook.common.process.c c2 = a(((Integer)d.b()).intValue());
        com.facebook.common.process.c c1 = c2;
        if (c2.a())
        {
            try
            {
                c1 = a();
            }
            catch (IOException ioexception)
            {
                com.facebook.debug.log.b.e(a, "Couldn't read process name from cmdline.", ioexception);
                ioexception = c2;
            }
        }
        if (c1.a())
        {
            com.facebook.debug.log.b.d(a, "Couldn't find own process name");
        }
        e = Optional.of(c1);
        return c1;
    }

    public com.facebook.common.process.c c()
    {
        return com.facebook.common.process.c.a(b.getPackageName(), "");
    }

}
