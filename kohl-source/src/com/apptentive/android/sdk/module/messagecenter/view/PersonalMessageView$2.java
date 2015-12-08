// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.module.metric.MetricModule;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            PersonalMessageView

class this._cls0
    implements onHandler
{

    final PersonalMessageView this$0;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Log.w("UncaughtException in PersonalMessageView.", throwable, new Object[0]);
        MetricModule.sendError(context.getApplicationContext(), throwable, null, null);
    }

    ()
    {
        this$0 = PersonalMessageView.this;
        super();
    }
}
