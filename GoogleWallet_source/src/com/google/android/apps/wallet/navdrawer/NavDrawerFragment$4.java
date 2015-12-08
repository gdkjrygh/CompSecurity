// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls0
    implements android.view.setsListener
{

    final NavDrawerFragment this$0;

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        int i = windowinsets.getSystemWindowInsetTop();
        NavDrawerFragment.access$300(NavDrawerFragment.this).applyTopInset(i);
        return windowinsets;
    }

    ountNavigationView()
    {
        this$0 = NavDrawerFragment.this;
        super();
    }
}
