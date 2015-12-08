// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.accountswitcher.AccountSwitcherView;
import com.google.android.apps.photos.drawermenu.DrawerMenuFragment;

public final class ffp
    implements dfs
{

    private DrawerMenuFragment a;

    public ffp(DrawerMenuFragment drawermenufragment)
    {
        a = drawermenufragment;
        super();
    }

    public final void a(AccountSwitcherView accountswitcherview)
    {
        DrawerMenuFragment.a(a, accountswitcherview.j, ((am) (a)).U);
    }
}
