// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.View;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MenuFragment

class this._cls0
    implements android.view.tener
{

    final MenuFragment this$0;

    public void onClick(View view)
    {
        MainNavigationActivity.setMapTypeTours();
        MenuFragment.access$200(MenuFragment.this).showTourHomeList();
        hasNotSelectedPlaces = true;
        view = new HashMap();
        view.put("Button Tapped", "Tours");
        MenuFragment.access$200(MenuFragment.this).tagLocalyticsEvent("Home Screen Button Taps", view);
        MenuFragment.access$200(MenuFragment.this).localyticsTagTourViewedEvent();
    }

    ()
    {
        this$0 = MenuFragment.this;
        super();
    }
}
