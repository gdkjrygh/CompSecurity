// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;

import android.util.Log;

// Referenced classes of package com.qihoo.security.enginehelper.clean:
//            a

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        if (com.qihoo.security.enginehelper.clean.a.h())
        {
            Log.i(com.qihoo.security.enginehelper.clean.a.i(), "scantest target start");
        }
        com.qihoo.security.enginehelper.clean.a.b(a);
        com.qihoo.security.enginehelper.clean.a.a(a, 21);
        if (com.qihoo.security.enginehelper.clean.a.a(a))
        {
            com.qihoo.security.enginehelper.clean.a.c(a);
            return;
        } else
        {
            com.qihoo.security.enginehelper.clean.a.a(a, 0);
            com.qihoo.security.enginehelper.clean.a.d(a);
            return;
        }
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
