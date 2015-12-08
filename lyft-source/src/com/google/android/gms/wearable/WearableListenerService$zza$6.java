// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class a
    implements Runnable
{

    final CapabilityInfoParcelable a;
    final ble b;

    public void run()
    {
        b.b.onCapabilityChanged(a);
    }

    ble(ble ble, CapabilityInfoParcelable capabilityinfoparcelable)
    {
        b = ble;
        a = capabilityinfoparcelable;
        super();
    }
}
