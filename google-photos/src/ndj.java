// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.mtp.MtpDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class ndj extends BroadcastReceiver
{

    private ndi a;

    ndj(ndi ndi1)
    {
        a = ndi1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        UsbDevice usbdevice;
        String s;
        String s1;
        s = intent.getAction();
        usbdevice = (UsbDevice)intent.getParcelableExtra("device");
        s1 = usbdevice.getDeviceName();
        HashMap hashmap = a.c;
        hashmap;
        JVM INSTR monitorenter ;
        context = (MtpDevice)a.c.get(s1);
        if (!"android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(s))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        intent = context;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        intent = a.a(usbdevice);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        for (context = a.b.iterator(); context.hasNext(); ((ndk)context.next()).a(intent)) { }
        break MISSING_BLOCK_LABEL_342;
        context;
        hashmap;
        JVM INSTR monitorexit ;
        throw context;
        if (!"android.hardware.usb.action.USB_DEVICE_DETACHED".equals(s))
        {
            break MISSING_BLOCK_LABEL_214;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        a.c.remove(s1);
        a.d.remove(s1);
        a.e.remove(s1);
        for (intent = a.b.iterator(); intent.hasNext(); ((ndk)intent.next()).b(context)) { }
        break MISSING_BLOCK_LABEL_342;
        boolean flag;
        if (!"com.google.android.libraries.social.ingest.action.USB_PERMISSION".equals(s))
        {
            break MISSING_BLOCK_LABEL_342;
        }
        a.d.remove(s1);
        flag = intent.getBooleanExtra("permission", false);
        (new StringBuilder(28)).append("ACTION_USB_PERMISSION: ").append(flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        intent = context;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        intent = ndi.a(a, usbdevice);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        for (context = a.b.iterator(); context.hasNext(); ((ndk)context.next()).a(intent)) { }
        break MISSING_BLOCK_LABEL_342;
        a.e.add(s1);
        hashmap;
        JVM INSTR monitorexit ;
    }
}
