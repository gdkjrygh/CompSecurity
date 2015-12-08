// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import java.util.TimerTask;

// Referenced classes of package com.pandora.android.eureka:
//            c

class a extends TimerTask
{

    final a a;

    public void run()
    {
        if (!c.e(a.a))
        {
            c.c("session didn't connect - disconnect");
            a.a.d(false);
            a.a.j();
        }
    }

    ( )
    {
        a = ;
        super();
    }
}
