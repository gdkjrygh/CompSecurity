// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

final class a
    implements Runnable
{

    final MessageEventParcelable a;
    final ble b;

    public final void run()
    {
        b.b.onMessageReceived(a);
    }

    ble(ble ble, MessageEventParcelable messageeventparcelable)
    {
        b = ble;
        a = messageeventparcelable;
        super();
    }
}
