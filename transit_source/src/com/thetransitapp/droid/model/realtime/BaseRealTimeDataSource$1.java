// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            BaseRealTimeDataSource, Prediction

class this._cls0
    implements Comparator
{

    final BaseRealTimeDataSource this$0;

    public int compare(Prediction prediction, Prediction prediction1)
    {
        return prediction.getStopTime().compareTo(prediction1.getStopTime());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Prediction)obj, (Prediction)obj1);
    }

    ()
    {
        this$0 = BaseRealTimeDataSource.this;
        super();
    }
}
