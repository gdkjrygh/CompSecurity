// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.preferences.PreferenceClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinTimeoutFragment, CloudPinManager

final class val.pinTimeoutMinutes
    implements Callable
{

    final PinTimeoutFragment this$0;
    final int val$pinTimeoutMinutes;

    private Void call()
        throws Exception
    {
        preferenceClient.updatePinTimeoutMinutesSetting(val$pinTimeoutMinutes);
        cloudPinManager.changePinTimeout(val$pinTimeoutMinutes);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ent()
    {
        this$0 = final_pintimeoutfragment;
        val$pinTimeoutMinutes = I.this;
        super();
    }
}
