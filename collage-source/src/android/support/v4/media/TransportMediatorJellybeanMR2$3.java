// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media:
//            TransportMediatorJellybeanMR2, TransportMediatorCallback

class this._cls0 extends BroadcastReceiver
{

    final TransportMediatorJellybeanMR2 this$0;

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            context = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mTransportCallback.handleKey(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("TransportController", context);
        }
    }

    ()
    {
        this$0 = TransportMediatorJellybeanMR2.this;
        super();
    }
}
