// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.facebook.login.d;
import com.tinder.d.a;
import com.tinder.e.e;
import com.tinder.utils.DateUtils;
import java.text.DateFormat;

// Referenced classes of package com.tinder.managers:
//            d, ManagerApp

final class a
    implements com.android.volley.
{

    final e a;
    final com.tinder.managers.d b;

    public final void a(Object obj)
    {
        obj = DateUtils.b().format(Long.valueOf(System.currentTimeMillis()));
        d.b(b).c(((String) (obj)));
        d.b(true);
        d.a();
        d.b();
        b.a(false);
        com.tinder.managers.ManagerApp.d().j();
        if (a != null)
        {
            a.c();
        }
        d.b(false);
    }

    erApp(com.tinder.managers.d d1, e e1)
    {
        b = d1;
        a = e1;
        super();
    }
}
