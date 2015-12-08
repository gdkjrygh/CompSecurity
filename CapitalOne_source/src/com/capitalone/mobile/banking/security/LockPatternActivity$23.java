// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Utils.Log;
import com.EnterpriseMobileBanking.Utils.MenuItemSingleton;
import java.util.List;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            LockPatternActivity

class this._cls0
    implements android.widget.Listener
{

    final LockPatternActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
label1:
            {
                adapterview = (MenuItem)MenuItemSingleton.getInstance().getItems().get(i);
                Log.d(LockPatternActivity.access$500(), (new StringBuilder()).append("Option chosen was: '").append(adapterview.getText()).append("'  '").append(adapterview.getAction()).append("'").toString());
                if (adapterview.getAction().length() > 0)
                {
                    if (AppHelper.handleNative(adapterview.getAction()))
                    {
                        break label0;
                    }
                    AppHelper.getApplicationLink().setLastItem(adapterview);
                    view = adapterview.getAction().replace("javascript:", "");
                    if (!view.contains(getString(0x7f090106)))
                    {
                        break label1;
                    }
                    i = view.indexOf("'") + 1;
                    String s = view.substring(i, view.indexOf("'", i));
                    Log.v(LockPatternActivity.access$500(), (new StringBuilder()).append("Hash: ").append(s).toString());
                    if (!AppHelper.getApplicationLink().getAppView().getUrl().contains(s))
                    {
                        break label1;
                    }
                    LockPatternActivity.access$200(LockPatternActivity.this, null);
                }
                return;
            }
            AppHelper.getApplicationLink().sendJavascript(view);
            finish();
        }
        if (adapterview.getAction().startsWith(getString(0x7f090102)))
        {
            AppHelper.getApplicationLink().setLastItem(adapterview);
        }
        finish();
    }

    ()
    {
        this$0 = LockPatternActivity.this;
        super();
    }
}
