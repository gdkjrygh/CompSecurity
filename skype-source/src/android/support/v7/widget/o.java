// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v4.view.d;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class o extends d
{
    private final class a
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final o a;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = android.support.v7.internal.widget.d.a(o.a(a), o.b(a)).b(menuitem.getItemId());
            if (menuitem != null)
            {
                String s = menuitem.getAction();
                if ("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s))
                {
                    o.b(menuitem);
                }
                o.a(a).startActivity(menuitem);
            }
            return true;
        }

        private a()
        {
            a = o.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private int a;
    private final a b = new a((byte)0);
    private final Context c;
    private String d;

    public o(Context context)
    {
        super(context);
        a = 4;
        d = "share_history.xml";
        c = context;
    }

    static Context a(o o1)
    {
        return o1.c;
    }

    static String b(o o1)
    {
        return o1.d;
    }

    static void b(Intent intent)
    {
        c(intent);
    }

    private static void c(Intent intent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            intent.addFlags(0x8080000);
            return;
        } else
        {
            intent.addFlags(0x80000);
            return;
        }
    }

    public final View a()
    {
        ActivityChooserView activitychooserview = new ActivityChooserView(c);
        if (!activitychooserview.isInEditMode())
        {
            activitychooserview.setActivityChooserModel(android.support.v7.internal.widget.d.a(c, d));
        }
        TypedValue typedvalue = new TypedValue();
        c.getTheme().resolveAttribute(android.support.v7.appcompat.a.a.actionModeShareDrawable, typedvalue, true);
        activitychooserview.setExpandActivityOverflowButtonDrawable(android.support.v7.internal.widget.o.a(c, typedvalue.resourceId));
        activitychooserview.setProvider(this);
        activitychooserview.setDefaultActionButtonContentDescription(android.support.v7.appcompat.a.i.abc_shareactionprovider_share_with_application);
        activitychooserview.setExpandActivityOverflowButtonContentDescription(android.support.v7.appcompat.a.i.abc_shareactionprovider_share_with);
        return activitychooserview;
    }

    public final void a(Intent intent)
    {
        if (intent != null)
        {
            String s = intent.getAction();
            if ("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s))
            {
                c(intent);
            }
        }
        android.support.v7.internal.widget.d.a(c, d).a(intent);
    }

    public final void a(SubMenu submenu)
    {
        submenu.clear();
        android.support.v7.internal.widget.d d1 = android.support.v7.internal.widget.d.a(c, d);
        android.content.pm.PackageManager packagemanager = c.getPackageManager();
        int k = d1.a();
        int l = Math.min(k, a);
        for (int i = 0; i < l; i++)
        {
            ResolveInfo resolveinfo = d1.a(i);
            submenu.add(0, i, i, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setOnMenuItemClickListener(b);
        }

        if (l < k)
        {
            submenu = submenu.addSubMenu(0, l, l, c.getString(android.support.v7.appcompat.a.i.abc_activity_chooser_view_see_all));
            for (int j = 0; j < k; j++)
            {
                ResolveInfo resolveinfo1 = d1.a(j);
                submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(b);
            }

        }
    }

    public final boolean e()
    {
        return true;
    }
}
