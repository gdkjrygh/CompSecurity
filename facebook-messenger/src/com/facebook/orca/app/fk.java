// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.facebook.base.c;
import com.facebook.h;
import com.facebook.o;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

public class fk
    implements c
{

    private final Context a;
    private final d b;

    public fk(Context context, d d1)
    {
        a = context;
        b = d1;
    }

    private void c()
    {
        String s = a.getResources().getString(o.app_name);
        android.content.Intent.ShortcutIconResource shortcuticonresource = android.content.Intent.ShortcutIconResource.fromContext(a, h.launcher_icon);
        Intent intent = new Intent();
        intent.setClassName("com.facebook.orca", "com.facebook.orca.auth.StartScreenActivity");
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        Intent intent1 = new Intent();
        intent1.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent1.putExtra("android.intent.extra.shortcut.NAME", s);
        intent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", shortcuticonresource);
        intent1.putExtra("duplicate", false);
        intent1.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        a.sendBroadcast(intent1);
    }

    private void d()
    {
        e e1 = b.b();
        e1.a(com.facebook.orca.prefs.o.d, false);
        e1.a();
    }

    public void a()
    {
        if (b())
        {
            if (android.os.Build.VERSION.SDK_INT < 14)
            {
                c();
            }
            d();
        }
    }

    public boolean b()
    {
        if (b.a(com.facebook.orca.prefs.o.c, -1L) == -1L)
        {
            e e1 = b.b();
            e1.a(com.facebook.orca.prefs.o.c, System.currentTimeMillis());
            e1.a();
            return true;
        } else
        {
            return false;
        }
    }
}
