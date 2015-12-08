// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.view.BaseToastView;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentData;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ToastType;

// Referenced classes of package com.pinterest.activity.task.toast:
//            CsrPinnedToast

class w
    implements android.view.ner
{

    final CsrPinnedToast this$0;
    final ToastContainer val$container;
    final BaseToastView val$toastView;

    public void onClick(View view)
    {
        val$container.dismiss(val$toastView);
        Pinalytics.a(ComponentType.TOAST, (new ComponentData()).setToastType(ToastType.CSR));
        view = new Navigation(Location.CSR_PICKER);
        view.putExtra("com.pinterest.EXTRA_DOMAIN", CsrPinnedToast.access$000(CsrPinnedToast.this).getDomain());
        Events.post(view);
    }

    w()
    {
        this$0 = final_csrpinnedtoast;
        val$container = toastcontainer;
        val$toastView = BaseToastView.this;
        super();
    }
}
