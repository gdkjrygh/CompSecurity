// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.service;

import egv;
import ehp;
import ehr;
import eht;
import ehu;
import ehy;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executors;

// Referenced classes of package com.spotify.mobile.android.spotlets.appprotocol.service:
//            AppProtocolBluetoothService

final class 
    implements ehy
{

    public final egv a(InputStream inputstream, OutputStream outputstream)
    {
        java.util.concurrent.ExecutorService executorservice = Executors.newSingleThreadExecutor();
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor();
        new ehp();
        inputstream = new ehr(inputstream, executorservice);
        new ehp();
        return new ehu(inputstream, new eht(outputstream, scheduledexecutorservice));
    }

    ()
    {
    }
}
