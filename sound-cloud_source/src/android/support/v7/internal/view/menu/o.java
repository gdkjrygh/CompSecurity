// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            p, k, j

public final class o
{

    public static Menu a(Context context, SupportMenu supportmenu)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new p(context, supportmenu);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static MenuItem a(Context context, SupportMenuItem supportmenuitem)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new k(context, supportmenuitem);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new j(context, supportmenuitem);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
