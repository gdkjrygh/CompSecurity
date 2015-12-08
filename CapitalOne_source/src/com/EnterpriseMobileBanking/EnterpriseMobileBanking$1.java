// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.SwipeCover;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking, AppHelper, AppHeaderTouchHandler

class this._cls0
    implements Runnable
{

    final EnterpriseMobileBanking this$0;

    public void run()
    {
        if (EnterpriseMobileBanking.access$000() == 0)
        {
            int _tmp = EnterpriseMobileBanking.access$002(findViewById(0x7f08007f).findViewById(0x7f080099).getLeft());
            Log.d(EnterpriseMobileBanking.access$100(), (new StringBuilder()).append("Cover: ").append(EnterpriseMobileBanking.access$000()).toString());
            int ai[] = EnterpriseMobileBanking.access$200();
            int j = ai.length;
            for (int i = 0; i < j; i++)
            {
                int k = ai[i];
                ((SwipeCover)findViewById(k).findViewById(0x7f080097)).setScrollStart(EnterpriseMobileBanking.access$000());
            }

        }
        ((android.widget.s)findViewById(0x7f080023).getLayoutParams()).width = (int)(240F * AppHelper.getDensity());
        findViewById(0x7f080023).requestLayout();
        final View relContainer = findViewById(0x7f080024);
        relContainer.post(new Runnable() {

            final EnterpriseMobileBanking._cls1 this$1;
            final View val$relContainer;

            public void run()
            {
                relContainer.setOnTouchListener(new AppHeaderTouchHandler(findViewById(0x7f080023).getWidth(), EnterpriseMobileBanking.access$300(this$0).getNavButton()));
            }

            
            {
                this$1 = EnterpriseMobileBanking._cls1.this;
                relContainer = view;
                super();
            }
        });
        AppHelper.removeSplash();
    }

    _cls1.val.relContainer()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
