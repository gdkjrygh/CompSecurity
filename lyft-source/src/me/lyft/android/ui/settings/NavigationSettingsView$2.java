// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import me.lyft.android.ILyftPreferences;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.settings:
//            NavigationSettingsView

class this._cls0
    implements Action1
{

    final NavigationSettingsView this$0;

    public void call(Boolean boolean1)
    {
        lyftPreferences.setAutoNavigationEnabled(boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = NavigationSettingsView.this;
        super();
    }
}
