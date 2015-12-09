// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            ChangeOrSetPinActivity, UserPin

final class this._cls0
    implements OnActionListener
{

    final ChangeOrSetPinActivity this$0;

    private void onAction(UserPin userpin)
    {
        ChangeOrSetPinActivity.access$000(ChangeOrSetPinActivity.this, userpin);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((UserPin)obj);
    }

    A()
    {
        this$0 = ChangeOrSetPinActivity.this;
        super();
    }
}
