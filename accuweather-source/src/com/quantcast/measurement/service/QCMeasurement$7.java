// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;


// Referenced classes of package com.quantcast.measurement.service:
//            QCMeasurement, QCOptOutUtility

class val.optOut
    implements Runnable
{

    final QCMeasurement this$0;
    final boolean val$optOut;

    public void run()
    {
        QCOptOutUtility.saveOptOutStatus(QCMeasurement.access$200(QCMeasurement.this), val$optOut);
    }

    ()
    {
        this$0 = final_qcmeasurement;
        val$optOut = Z.this;
        super();
    }
}
