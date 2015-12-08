// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.mtp.MtpDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class ndi
{

    public final Context a;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    public final BroadcastReceiver f = new ndj(this);
    private final UsbManager g;
    private final PendingIntent h;

    public ndi(Context context)
    {
        a = context;
        g = (UsbManager)context.getSystemService("usb");
        h = PendingIntent.getBroadcast(a, 0, new Intent("com.google.android.libraries.social.ingest.action.USB_PERMISSION"), 0);
        IntentFilter intentfilter = new IntentFilter("com.google.android.libraries.social.ingest.action.USB_PERMISSION");
        intentfilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentfilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        intentfilter.addAction("com.google.android.libraries.social.ingest.action.USB_PERMISSION");
        context.registerReceiver(f, intentfilter);
    }

    static MtpDevice a(ndi ndi1, UsbDevice usbdevice)
    {
        return ndi1.a(usbdevice);
    }

    MtpDevice a(UsbDevice usbdevice)
    {
        String s;
        int i;
        boolean flag;
        int j;
        flag = true;
        s = usbdevice.getDeviceName();
        j = usbdevice.getInterfaceCount();
        i = 0;
_L3:
        UsbInterface usbinterface;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        usbinterface = usbdevice.getInterface(i);
        if (usbinterface.getInterfaceClass() != 6 || usbinterface.getInterfaceSubclass() != 1 || usbinterface.getInterfaceProtocol() != 1) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L4:
        if (i != 0 && !e.contains(s) && !d.contains(s))
        {
            if (!g.hasPermission(usbdevice))
            {
                g.requestPermission(usbdevice, h);
                d.add(s);
            } else
            {
                android.hardware.usb.UsbDeviceConnection usbdeviceconnection = g.openDevice(usbdevice);
                if (usbdeviceconnection != null)
                {
                    MtpDevice mtpdevice = new MtpDevice(usbdevice);
                    if (mtpdevice.open(usbdeviceconnection))
                    {
                        c.put(usbdevice.getDeviceName(), mtpdevice);
                        return mtpdevice;
                    }
                    e.add(s);
                } else
                {
                    e.add(s);
                }
            }
        }
        return null;
_L2:
        i++;
          goto _L3
        i = 0;
          goto _L4
    }

    public final List a()
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        Iterator iterator = g.getDeviceList().values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UsbDevice usbdevice = (UsbDevice)iterator.next();
            if (c.get(usbdevice.getDeviceName()) == null)
            {
                a(usbdevice);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_70;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        ArrayList arraylist = new ArrayList(c.values());
        hashmap;
        JVM INSTR monitorexit ;
        return arraylist;
    }
}
