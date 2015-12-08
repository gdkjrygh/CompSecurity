// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, DataEventBuffer

class avg
    implements Runnable
{

    final DataHolder avg;
    final taChanged avh;

    public void run()
    {
        DataEventBuffer dataeventbuffer = new DataEventBuffer(avg);
        avh.f.onDataChanged(dataeventbuffer);
        dataeventbuffer.release();
        return;
        Exception exception;
        exception;
        dataeventbuffer.release();
        throw exception;
    }

    A(A a1, DataHolder dataholder)
    {
        avh = a1;
        avg = dataholder;
        super();
    }
}
