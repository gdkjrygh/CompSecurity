// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinSettingsActivity, ChangeOrSetPinActivity

final class this._cls0
    implements OnActionListener
{

    final PinSettingsActivity this$0;

    private void onAction(Void void1)
    {
        void1 = InternalIntents.forClass(PinSettingsActivity.this, com/google/android/apps/wallet/pin/ChangeOrSetPinActivity);
        startActivity(void1);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    ()
    {
        this$0 = PinSettingsActivity.this;
        super();
    }
}
