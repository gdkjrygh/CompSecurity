// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.bmwgroup.connected.car.internal.SdkManager;

final class ang.Object
    implements Runnable
{

    private String a;

    public final void run()
    {
        SdkManager sdkmanager = SdkManager.a;
        String s = a;
        SdkManager.b.a("onScreenExit(%s)-> %s", new Object[] {
            s, sdkmanager.mApplicationName
        });
        adm adm1 = (adm)sdkmanager.b(s);
        SdkManager.b.a("onScreenExit(%s) l=%s", new Object[] {
            s, adm1
        });
        if (adm1 != null)
        {
            sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.ager._cls3(adm1));
        }
    }

    (String s)
    {
        a = s;
        super();
    }
}
