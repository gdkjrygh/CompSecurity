// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ag, bb

static final class sageListener extends ag
{

    bb a(com.google.android.gms.wearable.geApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return bb.b(messagelistener, aintentfilter);
    }

    volatile bb a(Object obj, IntentFilter aintentfilter[])
    {
        return a((com.google.android.gms.wearable.geApi.MessageListener)obj, aintentfilter);
    }

    sageListener()
    {
    }
}
