// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//            d, u, WearableListenerService

final class v
    implements Runnable
{

    final DataHolder a;
    final u b;

    v(u u1, DataHolder dataholder)
    {
        b = u1;
        a = dataholder;
        super();
    }

    public final void run()
    {
        d d1 = new d(a);
        b.a.onDataChanged(d1);
        d1.a();
        return;
        Exception exception;
        exception;
        d1.a();
        throw exception;
    }
}
