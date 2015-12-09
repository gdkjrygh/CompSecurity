// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;

final class ang.Object
    implements Runnable
{

    private File a;
    private aly b;

    public final void run()
    {
        if (CommonUtils.l(((gyh) (aly.f(b))).k))
        {
            gya.a().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
            Object obj = hbw.a().a();
            obj = aly.f(b).a(((hbz) (obj)));
            if (obj != null)
            {
                (new anb(((amd) (obj)))).a(new ane(a, aly.b()));
            }
        }
    }

    (aly aly1, File file)
    {
        b = aly1;
        a = file;
        super();
    }
}
