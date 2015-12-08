// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit:
//            ApplicationForegroundController

class a
    implements Runnable
{

    final ApplicationForegroundController a;

    public void run()
    {
        if (com.fitbit.ApplicationForegroundController.a(a) == 0)
        {
            com.fitbit.e.a.a("ApplicationForegroundController", "application probably switched to background", new Object[0]);
            ApplicationForegroundController.b(a);
        }
    }

    (ApplicationForegroundController applicationforegroundcontroller)
    {
        a = applicationforegroundcontroller;
        super();
    }
}
