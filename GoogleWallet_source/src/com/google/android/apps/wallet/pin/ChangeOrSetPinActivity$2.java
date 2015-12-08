// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            ChangeOrSetPinActivity, ResetPinDialog

final class this._cls0
    implements android.view.ngeOrSetPinActivity._cls2
{

    final ChangeOrSetPinActivity this$0;

    public final void onClick(View view)
    {
        resetPinDialog.showForgotPin(getSupportFragmentManager());
    }

    A()
    {
        this$0 = ChangeOrSetPinActivity.this;
        super();
    }
}
