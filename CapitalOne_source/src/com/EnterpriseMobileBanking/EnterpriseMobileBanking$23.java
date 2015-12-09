// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Plugins.Components.SwipeCover;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class this._cls0
    implements android.view.bileBanking._cls23
{

    final EnterpriseMobileBanking this$0;

    public void onClick(View view)
    {
        Log.d(EnterpriseMobileBanking.access$100(), (new StringBuilder()).append("Clicked a quick nav: ").append(view.getId()).toString());
        ((SwipeCover)findViewById(0x7f080097)).resetLast();
        ((SwipeCover)findViewById(0x7f080097)).resetScroll();
        findViewById(0x7f08009d).setVisibility(8);
        ((TextView)findViewById(0x7f08001f)).setText("");
        findViewById(0x7f0800a2).setVisibility(8);
        switch (view.getId())
        {
        default:
            return;

        case 2131230843: 
            findViewById(0x7f08009d).setVisibility(0);
            switchATM(findViewById(0x7f08009e), true, true, null);
            return;

        case 2131230844: 
            switchProducts(true);
            return;

        case 2131230845: 
            EnterpriseMobileBanking.access$1500(EnterpriseMobileBanking.this);
            break;
        }
    }

    er()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
