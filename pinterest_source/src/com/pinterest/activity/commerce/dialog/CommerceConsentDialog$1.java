// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.view.View;
import com.pinterest.activity.commerce.event.CheckoutClickEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceConsentDialog

class this._cls0
    implements android.view.g.CommerceConsentDialog._cls1
{

    final CommerceConsentDialog this$0;

    public void onClick(View view)
    {
        Events.post(new CheckoutClickEvent(com.pinterest.activity.commerce.event..EnrollInIncentive));
        dismiss();
    }

    ()
    {
        this$0 = CommerceConsentDialog.this;
        super();
    }
}
