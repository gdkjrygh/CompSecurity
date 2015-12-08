// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

public class this._cls0 extends BroadcastReceiver
{

    final InCallFragment this$0;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (getActivity() != null && intent.getExtras() != null)
            {
                context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (context == null || !context.isConnected())
                {
                    break label0;
                }
                InCallFragment.access$500(InCallFragment.this);
            }
            return;
        }
        setStatusLabel(getString(0x7f080377), 0x7f0f0135);
    }

    public ()
    {
        this$0 = InCallFragment.this;
        super();
    }
}
