// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package org.chromium.media:
//            UsbMidiDeviceFactoryAndroid

class this._cls0 extends BroadcastReceiver
{

    final UsbMidiDeviceFactoryAndroid this$0;

    public void onReceive(Context context, Intent intent)
    {
        if ("org.chromium.media.USB_PERMISSION".equals(intent.getAction()))
        {
            UsbMidiDeviceFactoryAndroid.access$000(UsbMidiDeviceFactoryAndroid.this, context, intent);
        }
    }

    ()
    {
        this$0 = UsbMidiDeviceFactoryAndroid.this;
        super();
    }
}
