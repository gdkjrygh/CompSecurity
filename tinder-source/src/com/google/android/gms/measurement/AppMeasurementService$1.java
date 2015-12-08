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

final class c
    implements Runnable
{

    final ac a;
    final int b;
    final w c;
    final AppMeasurementService d;

    public final void run()
    {
        a.k();
        AppMeasurementService.a(d).post(new Runnable() {

            final AppMeasurementService._cls1 a;

            public final void run()
            {
label0:
                {
                    if (a.d.stopSelfResult(a.b))
                    {
                        if (!j.z())
                        {
                            break label0;
                        }
                        a.c.g.a("Device AppMeasurementService processed last upload request");
                    }
                    return;
                }
                a.c.g.a("Local AppMeasurementService processed last upload request");
            }

            
            {
                a = AppMeasurementService._cls1.this;
                super();
            }
        });
    }

    _cls1.a(AppMeasurementService appmeasurementservice, ac ac1, int i, w w)
    {
        d = appmeasurementservice;
        a = ac1;
        b = i;
        c = w;
        super();
    }
}
