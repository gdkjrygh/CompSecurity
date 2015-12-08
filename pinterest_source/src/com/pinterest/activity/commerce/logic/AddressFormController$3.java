// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.widget.Toast;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            AddressFormController

class this._cls0
    implements com.pinterest.activity.commerce.ontactPermissionChangedListener
{

    final AddressFormController this$0;

    public void onContactPermissionChanged(boolean flag)
    {
        if (flag)
        {
            AddressFormController.access$100(AddressFormController.this);
            return;
        } else
        {
            Toast.makeText(_context, 0x7f07011e, 0).show();
            return;
        }
    }

    PermissionChangedListener()
    {
        this$0 = AddressFormController.this;
        super();
    }
}
