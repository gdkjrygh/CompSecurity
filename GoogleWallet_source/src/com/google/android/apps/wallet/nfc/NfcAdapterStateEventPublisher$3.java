// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.nfc;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.nfc:
//            NfcAdapterStateEventPublisher, NfcAdapterStateEvent

final class this._cls0
    implements AsyncCallback
{

    final NfcAdapterStateEventPublisher this$0;

    private void onSuccess(Boolean boolean1)
    {
        EventBus eventbus = NfcAdapterStateEventPublisher.access$100(NfcAdapterStateEventPublisher.this);
        if (boolean1.booleanValue())
        {
            boolean1 = NfcAdapterStateEvent.on();
        } else
        {
            boolean1 = NfcAdapterStateEvent.off();
        }
        eventbus.post(boolean1);
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(NfcAdapterStateEventPublisher.access$200(), "Unexpected error retrieving NFC status", exception);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Boolean)obj);
    }

    ()
    {
        this$0 = NfcAdapterStateEventPublisher.this;
        super();
    }
}
