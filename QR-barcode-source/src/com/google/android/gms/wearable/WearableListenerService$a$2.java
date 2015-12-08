// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ah;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class avi
    implements Runnable
{

    final avi avh;
    final ah avi;

    public void run()
    {
        avh.f.onMessageReceived(avi);
    }

    A(A a1, ah ah)
    {
        avh = a1;
        avi = ah;
        super();
    }
}
