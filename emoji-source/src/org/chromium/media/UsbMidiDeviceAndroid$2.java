// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;


// Referenced classes of package org.chromium.media:
//            UsbMidiDeviceAndroid

class val.bs
    implements Runnable
{

    final UsbMidiDeviceAndroid this$0;
    final byte val$bs[];
    final int val$endpointNumber;

    public void run()
    {
        if (UsbMidiDeviceAndroid.access$300(UsbMidiDeviceAndroid.this))
        {
            return;
        } else
        {
            UsbMidiDeviceAndroid.access$500(UsbMidiDeviceAndroid.access$400(UsbMidiDeviceAndroid.this), val$endpointNumber, val$bs);
            return;
        }
    }

    ()
    {
        this$0 = final_usbmidideviceandroid;
        val$endpointNumber = i;
        val$bs = _5B_B.this;
        super();
    }
}
