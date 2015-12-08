// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.task.toast:
//            PinFromClipboardToast

class val.container
    implements android.view.FromClipboardToast._cls1
{

    final PinFromClipboardToast this$0;
    final ToastContainer val$container;

    public void onClick(View view)
    {
        Context context = val$container.getContext();
        Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.TOAST);
        Intent intent = new Intent(context, com/pinterest/activity/create/PinItActivity);
        intent.putExtra("android.intent.extra.TEXT", PinFromClipboardToast.access$000(PinFromClipboardToast.this));
        intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070733));
        context.startActivity(intent);
        onToastCompleted(view.getContext());
    }

    ()
    {
        this$0 = final_pinfromclipboardtoast;
        val$container = ToastContainer.this;
        super();
    }
}
