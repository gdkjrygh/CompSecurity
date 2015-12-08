// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.view.ToastContainer;

// Referenced classes of package com.pinterest.activity.commerce:
//            SecureDialogActivity

class this._cls0
    implements com.pinterest.base.
{

    final SecureDialogActivity this$0;

    public void onEventMainThread(ToastEvent toastevent)
    {
        if (SecureDialogActivity.access$000(SecureDialogActivity.this) != null)
        {
            SecureDialogActivity.access$000(SecureDialogActivity.this).addToast(toastevent.getToast());
        }
    }

    ()
    {
        this$0 = SecureDialogActivity.this;
        super();
    }
}
