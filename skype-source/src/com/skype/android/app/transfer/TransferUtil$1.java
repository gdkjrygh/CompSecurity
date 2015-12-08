// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferUtil

final class val.activityContext
    implements android.content..OnClickListener
{

    final TransferUtil this$0;
    final Activity val$activityContext;
    final boolean val$finishactivitynndismiss;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (val$finishactivitynndismiss)
        {
            val$activityContext.finish();
        }
    }

    r()
    {
        this$0 = final_transferutil;
        val$finishactivitynndismiss = flag;
        val$activityContext = Activity.this;
        super();
    }
}
