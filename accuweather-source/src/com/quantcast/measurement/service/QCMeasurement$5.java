// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;


// Referenced classes of package com.quantcast.measurement.service:
//            QCMeasurement

class val.networkLabels
    implements Runnable
{

    final QCMeasurement this$0;
    final String val$appLabels[];
    final String val$hashedId;
    final String val$networkLabels[];

    public void run()
    {
        if (!isMeasurementActive())
        {
            QCMeasurement.access$602(QCMeasurement.this, val$hashedId);
        } else
        {
            String s = QCMeasurement.access$600(QCMeasurement.this);
            QCMeasurement.access$602(QCMeasurement.this, val$hashedId);
            if (QCMeasurement.access$600(QCMeasurement.this) == null && s != null || QCMeasurement.access$600(QCMeasurement.this) != null && !QCMeasurement.access$600(QCMeasurement.this).equals(s))
            {
                logBeginSessionEvent("userhash", val$appLabels, val$networkLabels);
                return;
            }
        }
    }

    ()
    {
        this$0 = final_qcmeasurement;
        val$hashedId = s;
        val$appLabels = as;
        val$networkLabels = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
