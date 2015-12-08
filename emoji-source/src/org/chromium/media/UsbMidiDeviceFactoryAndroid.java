// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.chromium.media:
//            UsbMidiDeviceAndroid

class UsbMidiDeviceFactoryAndroid
{

    private static final String ACTION_USB_PERMISSION = "org.chromium.media.USB_PERMISSION";
    private final List mDevices = new ArrayList();
    private long mNativePointer;
    private BroadcastReceiver mReceiver;
    private Set mRequestedDevices;
    private UsbManager mUsbManager;

    UsbMidiDeviceFactoryAndroid(long l)
    {
        mNativePointer = l;
    }

    static UsbMidiDeviceFactoryAndroid create(long l)
    {
        return new UsbMidiDeviceFactoryAndroid(l);
    }

    private static native void nativeOnUsbMidiDeviceRequestDone(long l, Object aobj[]);

    private void onRequestDone(Context context, Intent intent)
    {
        UsbDevice usbdevice = (UsbDevice)intent.getParcelableExtra("device");
        if (mRequestedDevices.contains(usbdevice))
        {
            mRequestedDevices.remove(usbdevice);
            if (!intent.getBooleanExtra("permission", false))
            {
                usbdevice = null;
            }
            if (usbdevice != null)
            {
                mDevices.add(new UsbMidiDeviceAndroid(mUsbManager, usbdevice));
            }
            if (mRequestedDevices.isEmpty())
            {
                context.unregisterReceiver(mReceiver);
                if (mNativePointer != 0L)
                {
                    nativeOnUsbMidiDeviceRequestDone(mNativePointer, mDevices.toArray());
                    return;
                }
            }
        }
    }

    void close()
    {
        mNativePointer = 0L;
    }

    boolean enumerateDevices(Context context)
    {
        mUsbManager = (UsbManager)context.getSystemService("usb");
        Object obj = mUsbManager.getDeviceList();
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, new Intent("org.chromium.media.USB_PERMISSION"), 0);
        mRequestedDevices = new HashSet();
        obj = ((Map) (obj)).values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            UsbDevice usbdevice = (UsbDevice)((Iterator) (obj)).next();
            boolean flag = false;
            boolean flag1;
            for (int i = 0; i < usbdevice.getInterfaceCount() && !flag; flag = flag1)
            {
                UsbInterface usbinterface = usbdevice.getInterface(i);
                flag1 = flag;
                if (usbinterface.getInterfaceClass() == 1)
                {
                    flag1 = flag;
                    if (usbinterface.getInterfaceSubclass() == 3)
                    {
                        flag1 = true;
                    }
                }
                i++;
            }

            if (flag)
            {
                mUsbManager.requestPermission(usbdevice, pendingintent);
                mRequestedDevices.add(usbdevice);
            }
        } while (true);
        if (mRequestedDevices.isEmpty())
        {
            return false;
        } else
        {
            IntentFilter intentfilter = new IntentFilter("org.chromium.media.USB_PERMISSION");
            mReceiver = new BroadcastReceiver() {

                final UsbMidiDeviceFactoryAndroid this$0;

                public void onReceive(Context context1, Intent intent)
                {
                    if ("org.chromium.media.USB_PERMISSION".equals(intent.getAction()))
                    {
                        onRequestDone(context1, intent);
                    }
                }

            
            {
                this$0 = UsbMidiDeviceFactoryAndroid.this;
                super();
            }
            };
            context.registerReceiver(mReceiver, intentfilter);
            return true;
        }
    }

}
