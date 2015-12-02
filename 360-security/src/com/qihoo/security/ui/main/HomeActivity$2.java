// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import com.qihoo.security.appbox.core.a;
import com.qihoo.security.locale.language.b;
import com.qihoo360.mobilesafe.b.o;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a
    implements Runnable
{

    final HomeActivity a;

    public void run()
    {
        while (!b.a(a.p) || !o.g(a.p) || !com.qihoo.security.appbox.core.a.a().b()) 
        {
            return;
        }
        com.qihoo.security.appbox.core.a.a().a(com.qihoo.security.appbox.core.a.a().a("3"), "3", null);
    }

    (HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
