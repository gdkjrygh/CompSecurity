// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.DialogInterface;
import com.skype.Message;
import com.skype.android.analytics.AnalyticsEvent;

// Referenced classes of package com.skype.android.app.chat:
//            RemoveMessageDialog

final class this._cls0
    implements android.content.kListener
{

    final RemoveMessageDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        RemoveMessageDialog.access$000(RemoveMessageDialog.this).edit("", false, false, "");
        reportEvents(AnalyticsEvent.cY);
    }

    ()
    {
        this$0 = RemoveMessageDialog.this;
        super();
    }
}
