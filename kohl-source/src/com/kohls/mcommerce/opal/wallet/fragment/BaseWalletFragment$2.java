// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseWalletFragment

class this._cls0 extends BroadcastReceiver
{

    final BaseWalletFragment this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            loadModifiedData();
            return;
        }
    }

    ()
    {
        this$0 = BaseWalletFragment.this;
        super();
    }
}
