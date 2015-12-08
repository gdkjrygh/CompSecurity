// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.activity.ui:
//            f

class a
    implements Runnable
{

    final f a;

    public void run()
    {
        boolean flag = a.h();
        if (flag)
        {
            if (a.h())
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
            }
            f.f(a);
            com.fitbit.activity.ui.f.a(a, true);
            return;
        }
        f.e(a);
        if (a.h())
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
        }
        f.f(a);
        com.fitbit.activity.ui.f.a(a, true);
        return;
        Exception exception;
        exception;
        if (a.h())
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
        }
        f.f(a);
        com.fitbit.activity.ui.f.a(a, true);
        throw exception;
    }

    (f f1)
    {
        a = f1;
        super();
    }
}
