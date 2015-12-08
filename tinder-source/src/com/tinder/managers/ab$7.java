// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;


// Referenced classes of package com.tinder.managers:
//            ab, ManagerApp

final class a
    implements Runnable
{

    final ab a;

    public final void run()
    {
        a.f = false;
        if (ManagerApp.f())
        {
            a.c();
            return;
        } else
        {
            a.b(false);
            return;
        }
    }

    erApp(ab ab1)
    {
        a = ab1;
        super();
    }
}
