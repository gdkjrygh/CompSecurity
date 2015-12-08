// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v7.internal.view.menu.f;
import android.view.MenuItem;

// Referenced classes of package android.support.design.widget:
//            NavigationView

final class a
    implements android.support.v7.internal.view.menu.
{

    final NavigationView a;

    public final boolean onMenuItemSelected(f f, MenuItem menuitem)
    {
        return NavigationView.a(a) != null && NavigationView.a(a).a();
    }

    public final void onMenuModeChange(f f)
    {
    }

    (NavigationView navigationview)
    {
        a = navigationview;
        super();
    }
}
