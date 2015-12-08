// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEventBuffer, WearableListenerService

class a
    implements Runnable
{

    final DataHolder a;
    final Changed b;

    public void run()
    {
        DataEventBuffer dataeventbuffer = new DataEventBuffer(a);
        b.b.onDataChanged(dataeventbuffer);
        dataeventbuffer.f_();
        return;
        Exception exception;
        exception;
        dataeventbuffer.f_();
        throw exception;
    }

    ( , DataHolder dataholder)
    {
        b = ;
        a = dataholder;
        super();
    }
}
