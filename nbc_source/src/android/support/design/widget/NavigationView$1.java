// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.MenuItem;

// Referenced classes of package android.support.design.widget:
//            NavigationView

class this._cls0
    implements android.support.v7.internal.view.menu.ack
{

    final NavigationView this$0;

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return NavigationView.access$000(NavigationView.this) != null && NavigationView.access$000(NavigationView.this).onNavigationItemSelected(menuitem);
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
    }

    er()
    {
        this$0 = NavigationView.this;
        super();
    }
}
