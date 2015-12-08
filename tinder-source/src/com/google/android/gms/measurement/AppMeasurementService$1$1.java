// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement;

import android.os.Handler;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.w;

// Referenced classes of package com.google.android.gms.measurement:
//            AppMeasurementService

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
label0:
        {
            if (a.a.stopSelfResult(a.a))
            {
                if (!j.z())
                {
                    break label0;
                }
                a.a.g.t("Device AppMeasurementService processed last upload request");
            }
            return;
        }
        a.a.g.t("Local AppMeasurementService processed last upload request");
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/measurement/AppMeasurementService$1

/* anonymous class */
    final class AppMeasurementService._cls1
        implements Runnable
    {

        final ac a;
        final int b;
        final w c;
        final AppMeasurementService d;

        public final void run()
        {
            a.k();
            AppMeasurementService.a(d).post(new AppMeasurementService._cls1._cls1(this));
        }

            
            {
                d = appmeasurementservice;
                a = ac1;
                b = i;
                c = w1;
                super();
            }
    }

}
