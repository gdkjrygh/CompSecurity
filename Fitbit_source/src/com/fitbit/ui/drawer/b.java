// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.drawer;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ListView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.ui.drawer:
//            a, NavigationDrawerActivity

public final class b extends com.fitbit.ui.drawer.a
    implements org.androidannotations.a.c.b
{

    private Context f;

    private b(Context context)
    {
        f = context;
        g();
    }

    public static b a(Context context)
    {
        return new b(context);
    }

    private void g()
    {
        c.a(this);
        if (f instanceof NavigationDrawerActivity)
        {
            c = (NavigationDrawerActivity)f;
            return;
        } else
        {
            Log.w("NavigationDrawerController_", (new StringBuilder()).append("Due to Context class ").append(f.getClass().getSimpleName()).append(", the @RootContext NavigationDrawerActivity won't be populated").toString());
            return;
        }
    }

    public void a(a a1)
    {
        e = (DrawerLayout)a1.findViewById(0x7f11017e);
        d = (ListView)a1.findViewById(0x7f110180);
        a1 = (AdapterView)a1.findViewById(0x7f110180);
        if (a1 != null)
        {
            a1.setOnItemClickListener(new _cls1());
        }
        a();
    }

    public void b(Context context)
    {
        f = context;
        g();
    }

    /* member class not found */
    class _cls1 {}

}
