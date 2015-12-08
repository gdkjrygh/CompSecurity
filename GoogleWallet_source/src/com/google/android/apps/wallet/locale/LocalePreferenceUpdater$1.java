// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.preferences.PreferenceClient;
import com.google.android.apps.wallet.rpc.RpcException;
import dagger.Lazy;

// Referenced classes of package com.google.android.apps.wallet.locale:
//            LocalePreferenceUpdater

final class this._cls0
    implements Runnable
{

    final LocalePreferenceUpdater this$0;

    public final void run()
    {
        try
        {
            ((PreferenceClient)LocalePreferenceUpdater.access$000(LocalePreferenceUpdater.this).get()).updateDeviceInfo();
            return;
        }
        catch (RpcException rpcexception)
        {
            WLog.e(LocalePreferenceUpdater.access$100(), "Error calling updateDeviceInfo", rpcexception);
        }
    }

    ()
    {
        this$0 = LocalePreferenceUpdater.this;
        super();
    }
}
