// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.soundcloud.android.properties.ApplicationProperties;

// Referenced classes of package com.soundcloud.android.utils:
//            BugReporter, DeviceHelper

class val.context
    implements android.content.e.OnClickListener
{

    final BugReporter this$0;
    final Context val$context;
    final String val$feedbackOptions[];

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$feedbackOptions[i];
        String s = BugReporter.access$000(BugReporter.this).getString(0x7f0702ac, new Object[] {
            dialoginterface
        });
        String s1 = BugReporter.access$000(BugReporter.this).getString(0x7f0702ab);
        if (dialoginterface.equals(BugReporter.access$000(BugReporter.this).getString(0x7f0702ae)))
        {
            dialoginterface = BugReporter.access$100(BugReporter.this).getPlaybackFeedbackEmail();
        } else
        {
            dialoginterface = BugReporter.access$100(BugReporter.this).getFeedbackEmail();
        }
        BugReporter.access$300(BugReporter.this, val$context, dialoginterface, s, BugReporter.access$200(BugReporter.this).getUserAgent(), s1);
    }

    onProperties()
    {
        this$0 = final_bugreporter;
        val$feedbackOptions = as;
        val$context = Context.this;
        super();
    }
}
