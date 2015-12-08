// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

class ay
{

    public static MenuItem a(MenuItem menuitem, View view)
    {
        return menuitem.setActionView(view);
    }

    public static void a(MenuItem menuitem, int i)
    {
        menuitem.setShowAsAction(i);
    }

    public static MenuItem b(MenuItem menuitem, int i)
    {
        return menuitem.setActionView(i);
    }
}
