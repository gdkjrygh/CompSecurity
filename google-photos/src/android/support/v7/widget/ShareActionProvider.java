// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import adq;
import afu;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import b;
import km;
import xa;
import xk;
import yh;

public class ShareActionProvider extends km
{

    private int d;
    private final afu e = new afu(this);
    private final Context f;
    private String g;

    public ShareActionProvider(Context context)
    {
        super(context);
        d = 4;
        g = "share_history.xml";
        f = context;
    }

    public static Context a(ShareActionProvider shareactionprovider)
    {
        return shareactionprovider.f;
    }

    public static void a(ShareActionProvider shareactionprovider, Intent intent)
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

    public static String b(ShareActionProvider shareactionprovider)
    {
        return shareactionprovider.g;
    }

    public final View a()
    {
        ActivityChooserView activitychooserview = new ActivityChooserView(f);
        if (!activitychooserview.isInEditMode())
        {
            xa xa1 = xa.a(f, g);
            xk xk1 = activitychooserview.a;
            xa xa2 = xk1.c.a.a;
            if (xa2 != null && xk1.c.isShown())
            {
                xa2.unregisterObserver(xk1.c.d);
            }
            xk1.a = xa1;
            if (xa1 != null && xk1.c.isShown())
            {
                xa1.registerObserver(xk1.c.d);
            }
            xk1.notifyDataSetChanged();
            if (activitychooserview.d().c.isShowing())
            {
                activitychooserview.b();
                activitychooserview.a();
            }
        }
        Object obj = new TypedValue();
        f.getTheme().resolveAttribute(b.q, ((TypedValue) (obj)), true);
        obj = yh.a(f, ((TypedValue) (obj)).resourceId);
        activitychooserview.b.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        activitychooserview.c = this;
        activitychooserview.e = b.bL;
        int i = b.bK;
        obj = activitychooserview.getContext().getString(i);
        activitychooserview.b.setContentDescription(((CharSequence) (obj)));
        return activitychooserview;
    }

    public final void a(SubMenu submenu)
    {
        submenu.clear();
        xa xa1 = xa.a(f, g);
        android.content.pm.PackageManager packagemanager = f.getPackageManager();
        int k = xa1.a();
        int l = Math.min(k, d);
        for (int i = 0; i < l; i++)
        {
            ResolveInfo resolveinfo = xa1.a(i);
            submenu.add(0, i, i, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setOnMenuItemClickListener(e);
        }

        if (l < k)
        {
            submenu = submenu.addSubMenu(0, l, l, f.getString(b.bI));
            for (int j = 0; j < k; j++)
            {
                ResolveInfo resolveinfo1 = xa1.a(j);
                submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(e);
            }

        }
    }

    public final boolean f()
    {
        return true;
    }
}
