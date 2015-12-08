// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.tealium.library:
//            d, u, s, t, 
//            w, H, a, D, 
//            r

final class ferences
    implements Runnable
{

    public final void run()
    {
        boolean flag1;
        flag1 = true;
        if (d.k())
        {
            u.e("Tealium.initialize(Builder) was called when the Library has already been initialized.");
            return;
        }
        if (d.l().a().contains("is_disabled"))
        {
            u.e("The Tealium Library has been disabled, only clearing the app data will allow the library to restart.");
            return;
        }
        boolean flag;
        if (d.l().f().checkCallingOrSelfPermission("android.permission.INTERNET") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d.l().f().checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
        {
            flag1 = false;
        }
          goto _L1
_L2:
        try
        {
            u.e("Unable to initialize the Tealium Library, android.permission.INTERNET and/or android.permission.ACCESS_NETWORK_STATE are absent from AndroidManifest.xml");
            return;
        }
        catch (Throwable throwable)
        {
            d.e();
            u.b(throwable);
            return;
        }
_L3:
        Object obj;
        d.a(true);
        obj = new s(d.l().a());
        d.m().add(t.a(d.l()));
        d.m().add(new w(d.l(), ((s) (obj))));
        d.m().add(new H(d.l(), ((s) (obj))));
        d.m().add(new a(d.l().f().getApplicationContext(), d.l().a(), ((s) (obj))));
        d.m().add(new u());
        d.m().add(new D());
        obj = r.a(d.l(), ((s) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        d.m().add(obj);
        u.c(String.format(Locale.ROOT, "Tealium has been initialized with %s", new Object[] {
            d.l().toString()
        }));
        return;
_L1:
        if (flag && flag1) goto _L3; else goto _L2
    }

    ferences()
    {
    }
}
