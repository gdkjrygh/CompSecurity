// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.upsell;

import android.content.pm.PackageManager;
import com.facebook.config.a.d;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class c
    implements a
{

    private static final ae a = n.a("fbandroid_install_messenger_chat_head_promo");
    private final com.facebook.prefs.shared.d b;
    private final PackageManager c;
    private final com.facebook.config.a.a d;

    public c(com.facebook.prefs.shared.d d1, PackageManager packagemanager, com.facebook.config.a.a a1)
    {
        b = d1;
        c = packagemanager;
        d = a1;
    }

    private boolean c()
    {
        try
        {
            c.getApplicationInfo("com.facebook.orca", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return true;
    }

    public Boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d.i() == d.FB4A)
        {
            flag = flag1;
            if (!c())
            {
                flag = flag1;
                if (b.a(a, false))
                {
                    flag = true;
                }
            }
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
