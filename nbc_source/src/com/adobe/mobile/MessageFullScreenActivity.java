// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

// Referenced classes of package com.adobe.mobile:
//            AdobeMarketingActivity, MessageFullScreen, Messages, StaticMethods

public class MessageFullScreenActivity extends AdobeMarketingActivity
{

    protected MessageFullScreen message;

    public MessageFullScreenActivity()
    {
    }

    public void onBackPressed()
    {
        message.isVisible = false;
        message.viewed();
        finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(new LinearLayout(this));
        message = Messages.getCurrentFullscreenMessage();
        message.messageFullScreenActivity = this;
    }

    public void onResume()
    {
        super.onResume();
        final ViewGroup rootViewGroup = (ViewGroup)findViewById(0x1020002);
        if (rootViewGroup == null)
        {
            try
            {
                StaticMethods.logErrorFormat("Messages - unable to get root view group from os", new Object[0]);
                finish();
                overridePendingTransition(0, 0);
                return;
            }
            catch (NullPointerException nullpointerexception)
            {
                StaticMethods.logWarningFormat("Messages - content view is in undefined state (%s)", new Object[] {
                    nullpointerexception.getMessage()
                });
            }
            break MISSING_BLOCK_LABEL_70;
        }
        rootViewGroup.post(new Runnable() {

            final MessageFullScreenActivity this$0;
            final ViewGroup val$rootViewGroup;

            public void run()
            {
                message.rootViewGroup = rootViewGroup;
                message.showInRootViewGroup();
            }

            
            {
                this$0 = MessageFullScreenActivity.this;
                rootViewGroup = viewgroup;
                super();
            }
        });
        return;
        finish();
        overridePendingTransition(0, 0);
        return;
    }
}
