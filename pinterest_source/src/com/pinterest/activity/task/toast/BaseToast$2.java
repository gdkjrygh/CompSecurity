// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.view.View;
import com.pinterest.activity.task.toast.view.BaseToastView;
import com.pinterest.activity.task.toast.view.ToastContainer;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

class stView
    implements android.view.Listener
{

    final BaseToast this$0;
    final ToastContainer val$container;
    final BaseToastView val$toastVw;

    public void onClick(View view)
    {
        val$container.dismiss(val$toastVw);
        if (BaseToast.access$000(BaseToast.this) != null)
        {
            BaseToast.access$000(BaseToast.this).onClick(val$toastVw);
            return;
        } else
        {
            onToastCancelled(val$container.getContext());
            return;
        }
    }

    stView()
    {
        this$0 = final_basetoast;
        val$container = toastcontainer;
        val$toastVw = BaseToastView.this;
        super();
    }
}
