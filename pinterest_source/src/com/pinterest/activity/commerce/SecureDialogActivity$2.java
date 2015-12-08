// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.activity.commerce.event.SecureDialogActivityEvent;

// Referenced classes of package com.pinterest.activity.commerce:
//            SecureDialogActivity

class this._cls0
    implements com.pinterest.base.
{

    final SecureDialogActivity this$0;

    public void onEventMainThread(SecureDialogActivityEvent securedialogactivityevent)
    {
        if (securedialogactivityevent.getType() == com.pinterest.activity.commerce.event.nt.Type.Close)
        {
            finish();
        }
    }

    ityEvent()
    {
        this$0 = SecureDialogActivity.this;
        super();
    }
}
