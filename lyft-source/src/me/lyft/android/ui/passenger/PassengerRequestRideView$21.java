// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.utils.PlayStore;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((DialogResult)obj);
    }

    public void call(DialogResult dialogresult)
    {
        if (dialogresult.getButtonId() == 0x7f0d000b)
        {
            PlayStore.openGooglePlay(getContext());
            preferences.setRateAppPromptTimestamp(0x7fffffffffffffffL);
        } else
        {
            if (dialogresult.isCancelled() || dialogresult.getButtonId() == 0x7f0d000a)
            {
                preferences.setRateAppPromptTimestamp(System.currentTimeMillis());
                return;
            }
            if (dialogresult.getButtonId() == 0x7f0d0009)
            {
                preferences.setRateAppPromptTimestamp(0x7fffffffffffffffL);
                return;
            }
        }
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
