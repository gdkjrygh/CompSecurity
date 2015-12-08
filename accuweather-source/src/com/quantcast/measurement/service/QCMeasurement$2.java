// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;


// Referenced classes of package com.quantcast.measurement.service:
//            QCMeasurement, QCUtility, QCEvent, QCDataManager, 
//            QCLog

class val.name
    implements Runnable
{

    final QCMeasurement this$0;
    final String val$appLabels[];
    final String val$name;
    final String val$networkLabel[];

    public void run()
    {
        if (isMeasurementActive())
        {
            String as[] = QCUtility.combineLabels(QCMeasurement.access$1000(QCMeasurement.this), val$appLabels);
            String as1[] = QCUtility.combineLabels(QCMeasurement.access$1100(QCMeasurement.this), val$networkLabel);
            QCMeasurement.access$700(QCMeasurement.this).postEvent(QCEvent.logEvent(QCMeasurement.access$200(QCMeasurement.this), QCMeasurement.access$1200(QCMeasurement.this), val$name, as, as1), QCMeasurement.access$900(QCMeasurement.this));
            return;
        } else
        {
            QCLog.e(QCMeasurement.access$300(), "Log event called without first calling startActivity");
            return;
        }
    }

    ()
    {
        this$0 = final_qcmeasurement;
        val$appLabels = as;
        val$networkLabel = as1;
        val$name = String.this;
        super();
    }
}
