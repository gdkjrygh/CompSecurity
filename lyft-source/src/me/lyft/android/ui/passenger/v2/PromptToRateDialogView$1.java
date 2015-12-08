// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import android.view.View;
import me.lyft.android.utils.PlayStore;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PromptToRateDialogView

class this._cls0
    implements android.view.ToRateDialogView._cls1
{

    final PromptToRateDialogView this$0;

    public void onClick(View view)
    {
        PlayStore.openGooglePlay(getContext());
        setRateAppPromptTimestampAndDismiss(0x7fffffffffffffffL);
    }

    ()
    {
        this$0 = PromptToRateDialogView.this;
        super();
    }
}
