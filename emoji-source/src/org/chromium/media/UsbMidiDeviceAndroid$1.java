// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import java.nio.ByteBuffer;
import java.util.Map;

// Referenced classes of package org.chromium.media:
//            UsbMidiDeviceAndroid

class val.bufferForEndpoints extends Thread
{

    final UsbMidiDeviceAndroid this$0;
    final Map val$bufferForEndpoints;

    public void run()
    {
        do
        {
            UsbRequest usbrequest;
            UsbEndpoint usbendpoint;
            do
            {
                usbrequest = UsbMidiDeviceAndroid.access$000(UsbMidiDeviceAndroid.this).requestWait();
                if (usbrequest == null)
                {
                    return;
                }
                usbendpoint = usbrequest.getEndpoint();
            } while (usbendpoint.getDirection() != 128);
            ByteBuffer bytebuffer = (ByteBuffer)val$bufferForEndpoints.get(usbendpoint);
            int i = UsbMidiDeviceAndroid.access$100(bytebuffer);
            if (i > 0)
            {
                bytebuffer.rewind();
                byte abyte0[] = new byte[i];
                bytebuffer.get(abyte0, 0, i);
                UsbMidiDeviceAndroid.access$200(UsbMidiDeviceAndroid.this, usbendpoint.getEndpointNumber(), abyte0);
            }
            bytebuffer.rewind();
            usbrequest.queue(bytebuffer, bytebuffer.capacity());
        } while (true);
    }

    ()
    {
        this$0 = final_usbmidideviceandroid;
        val$bufferForEndpoints = Map.this;
        super();
    }
}
