// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.view.View;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.activity.user.view.FollowUserButton;

// Referenced classes of package com.pinterest.activity.task.toast:
//            FollowModuleToast

class val.toastView
    implements android.view.
{

    final FollowModuleToast this$0;
    final ToastContainer val$container;
    final View val$toastView;

    public void onClick(View view)
    {
        _button.onClick(view);
        val$container.extendToast(val$toastView, 5000);
    }

    ()
    {
        this$0 = final_followmoduletoast;
        val$container = toastcontainer;
        val$toastView = View.this;
        super();
    }
}
