// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.widget.ListView;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageCenterView, MessageAdapter

class this._cls0
    implements Runnable
{

    final MessageCenterView this$0;

    public void run()
    {
        messageListView.setSelection(messageAdapter.getCount() - 1);
    }

    ()
    {
        this$0 = MessageCenterView.this;
        super();
    }
}
