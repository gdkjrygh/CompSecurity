// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.view.View;
import com.apptentive.android.sdk.AboutModule;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageCenterView

class this._cls0
    implements android.view.
{

    final MessageCenterView this$0;

    public void onClick(View view)
    {
        AboutModule.getInstance().show(context);
    }

    ()
    {
        this$0 = MessageCenterView.this;
        super();
    }
}
