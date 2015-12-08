// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ag, bb

static final class stener extends ag
{

    bb a(com.google.android.gms.wearable.pi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return bb.b(datalistener, aintentfilter);
    }

    volatile bb a(Object obj, IntentFilter aintentfilter[])
    {
        return a((com.google.android.gms.wearable.pi.DataListener)obj, aintentfilter);
    }

    stener()
    {
    }
}
