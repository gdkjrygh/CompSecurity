// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.bmwgroup.connected.car.app.ApplicationManager;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.util.HashMap;

final class ang.Object
    implements Runnable
{

    private String a[];
    private String b[];

    public final void run()
    {
        int i = 0;
        adp adp1 = SdkManager.a.c();
        ado ado = ApplicationManager.a.mApplication;
        afb afb1 = (afb)ado;
        String as[] = a;
        String as1[] = b;
        afb.a.b("Feature availability set ", new Object[0]);
        if (as != null && as1 != null)
        {
            if (as.length != as1.length)
            {
                throw new RuntimeException("Feature availability map containes invalid values ( feature.length != availability.length)");
            }
            afb1.d = new HashMap();
            for (; i < as.length; i++)
            {
                afb1.d.put(as[i], Boolean.valueOf(as1[i]));
            }

        }
        adp1.a(ado);
    }

    (String as[], String as1[])
    {
        a = as;
        b = as1;
        super();
    }
}
