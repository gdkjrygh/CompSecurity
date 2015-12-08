// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessSignupDialogView

class this._cls0
    implements com.pinterest.base.ignupDialogView._cls1
{

    final BusinessSignupDialogView this$0;

    public void onEventMainThread(usinessTypeSelected usinesstypeselected)
    {
        BusinessSignupDialogView.lastSelectedType = usinesstypeselected.name;
        BusinessSignupDialogView.lastSelectedTypeKey = usinesstypeselected.key;
        ViewHelper.safeSetText(_businessType, BusinessSignupDialogView.lastSelectedType);
    }

    usinessTypeSelected()
    {
        this$0 = BusinessSignupDialogView.this;
        super();
    }
}
