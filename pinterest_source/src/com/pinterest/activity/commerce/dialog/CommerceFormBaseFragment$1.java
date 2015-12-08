// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.activity.commerce.event.CloseCommerceFormDialogEvent;
import com.pinterest.activity.commerce.event.SecureDialogActivityEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceFormBaseFragment

class this._cls0
    implements com.pinterest.base.eFormBaseFragment._cls1
{

    final CommerceFormBaseFragment this$0;

    public void onEventMainThread(CloseCommerceFormDialogEvent closecommerceformdialogevent)
    {
        Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.ype.Close));
    }

    ()
    {
        this$0 = CommerceFormBaseFragment.this;
        super();
    }
}
