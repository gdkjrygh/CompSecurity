// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;

// Referenced classes of package me.lyft.android.notifications:
//            InAppNotificationDialogView

class this._cls0
    implements android.view.tionDialogView._cls2
{

    final InAppNotificationDialogView this$0;

    public void onClick(View view)
    {
        dialogFlow.dismiss();
        inAppNotificationService.markNotificationAsShown(InAppNotificationDialogView.access$000(InAppNotificationDialogView.this));
    }

    onService()
    {
        this$0 = InAppNotificationDialogView.this;
        super();
    }
}
