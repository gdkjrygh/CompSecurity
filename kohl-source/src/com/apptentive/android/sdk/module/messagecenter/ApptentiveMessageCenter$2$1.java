// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter;

import android.content.Context;
import com.apptentive.android.sdk.module.messagecenter.view.MessageCenterView;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter:
//            MessageManager, ApptentiveMessageCenter

class this._cls0
    implements Runnable
{

    final llToBottom this$0;

    public void run()
    {
        java.util.List list = MessageManager.getMessages(context);
        ApptentiveMessageCenter.messageCenterView.setMessages(list);
        ApptentiveMessageCenter.scrollToBottom();
    }

    l.context()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/apptentive/android/sdk/module/messagecenter/ApptentiveMessageCenter$2

/* anonymous class */
    static final class ApptentiveMessageCenter._cls2
        implements MessageManager.OnNewMessagesListener
    {

        final Context val$context;

        public void onMessagesUpdated()
        {
            ApptentiveMessageCenter.messageCenterView.post(new ApptentiveMessageCenter._cls2._cls1());
        }

            
            {
                context = context1;
                super();
            }
    }

}
