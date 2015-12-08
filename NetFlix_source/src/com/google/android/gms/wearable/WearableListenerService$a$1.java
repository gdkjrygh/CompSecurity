// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, b

class ady
    implements Runnable
{

    final DataHolder ady;
    final taChanged adz;

    public void run()
    {
        b b1 = new b(ady);
        adz.x.onDataChanged(b1);
        b1.close();
        return;
        Exception exception;
        exception;
        b1.close();
        throw exception;
    }

    A(A a1, DataHolder dataholder)
    {
        adz = a1;
        ady = dataholder;
        super();
    }
}
