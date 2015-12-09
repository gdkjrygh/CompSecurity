// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import android.widget.AdapterView;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Utils.Log;
import java.util.List;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking, AppHelper

class this._cls0
    implements android.widget.ener
{

    final EnterpriseMobileBanking this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (MenuItem)EnterpriseMobileBanking.access$800().get(i);
        Log.v(EnterpriseMobileBanking.access$100(), (new StringBuilder()).append("MenuList - Found: ").append(adapterview.getText()).append(" -- with Action: ").append(adapterview.getAction()).toString());
        if (adapterview.getAction().length() > 0)
        {
            findViewById(0x7f0800a2).setVisibility(8);
            if (!AppHelper.handleNative(adapterview.getAction()))
            {
                Log.v(EnterpriseMobileBanking.access$100(), "MORE AFTER handleNative");
                handleNavigation(EnterpriseMobileBanking.access$300(EnterpriseMobileBanking.this).getNavButton());
                setLastItem(adapterview);
                view = adapterview.getAction().replace("javascript:", "");
                Log.v(EnterpriseMobileBanking.access$100(), (new StringBuilder()).append("sending: ").append(view).toString());
                sendJavascript(view);
            }
            if (adapterview.getAction().startsWith(getString(0x7f090102)))
            {
                setLastItem(adapterview);
            }
        }
    }

    r()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
