// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.measurement;


// Referenced classes of package com.comscore.measurement:
//            MeasurementDispatcher, Measurement

class a
    implements Runnable
{

    final Measurement a;
    final MeasurementDispatcher b;

    a(MeasurementDispatcher measurementdispatcher, Measurement measurement)
    {
        b = measurementdispatcher;
        a = measurement;
        super();
    }

    public void run()
    {
        MeasurementDispatcher.a(b, a);
    }
}
