// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.support.v4.util.SimpleArrayMap;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl

private static abstract class <init>
{

    final SimpleArrayMap mMap;

    protected abstract IBinder createWrapper(Object obj);

    final IBinder getWrapper(Object obj)
    {
        IBinder ibinder;
        if (obj == null)
        {
            ibinder = null;
        } else
        {
            IBinder ibinder2 = (IBinder)mMap.get(obj);
            ibinder = ibinder2;
            if (ibinder2 == null)
            {
                IBinder ibinder1 = createWrapper(obj);
                mMap.put(obj, ibinder1);
                return ibinder1;
            }
        }
        return ibinder;
    }

    private ()
    {
        mMap = new SimpleArrayMap(1);
    }

    mMap(byte byte0)
    {
        this();
    }
}
