// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.error;

import android.app.Application;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.transport.NativeTransport;

// Referenced classes of package com.netflix.mediaclient.error:
//            CrashReportingService

public class NccpCrashService
    implements CrashReportingService
{

    private static final String TAG = "nf_crash";

    public NccpCrashService()
    {
    }

    public void init(Application application)
    {
        Log.d("nf_crash", "Init NCCP native crash handling...");
        NativeTransport.enableCrashHandler();
        Log.d("nf_crash", "Init NCCP native crash handling done");
    }
}
