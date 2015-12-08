// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.libraries.velour.a.a;
import com.google.android.libraries.velour.a.c;

// Referenced classes of package com.google.android.libraries.velour:
//            c, b, a, f, 
//            DynamicActivityLoader

public final class d
    implements com.google.android.libraries.velour.c
{

    String a;
    String b;
    String c;
    a d;
    final com.google.android.libraries.velour.c e;
    ClassLoader f;
    com.google.android.libraries.velour.a g;
    f h;
    f i;
    c j;
    android.content.res.Resources.Theme k;
    Intent l;

    public d(com.google.android.libraries.velour.c c1)
    {
        e = c1;
    }

    public final Activity a()
    {
        return e.a();
    }

    public final SharedPreferences a(String s, int i1)
    {
        return e.a(s, i1);
    }

    public final DynamicActivityLoader a(String s)
    {
        return e.a(s);
    }

    public final void a(Intent intent)
    {
        Intent intent1;
        com.google.android.libraries.velour.c c1;
        if (l != null)
        {
            intent1 = l;
        } else
        {
            intent1 = b();
        }
        c1 = e;
        if (intent1 != null && intent != null)
        {
            intent = com.google.android.libraries.velour.b.a(intent1, intent);
        } else
        {
            intent = null;
        }
        c1.a(intent);
        l = null;
    }

    public final boolean a(Menu menu)
    {
        return e.a(menu);
    }

    public final boolean a(MenuItem menuitem)
    {
        return e.a(menuitem);
    }

    public final Intent b()
    {
        Intent intent = e.b();
        if (intent == null)
        {
            return null;
        } else
        {
            return com.google.android.libraries.velour.b.a(intent, f);
        }
    }

    public final void b(Intent intent)
    {
        Intent intent1;
        com.google.android.libraries.velour.c c1;
        if (l != null)
        {
            intent1 = l;
        } else
        {
            intent1 = b();
        }
        c1 = e;
        if (intent1 != null && intent != null)
        {
            intent = com.google.android.libraries.velour.b.a(intent1, intent);
        } else
        {
            intent = null;
        }
        c1.b(intent);
    }

    public final boolean b(Menu menu)
    {
        return e.b(menu);
    }

    public final android.content.res.Resources.Theme c()
    {
        return e.c();
    }

    public final void startActivity(Intent intent)
    {
        e.startActivity(intent);
    }
}
