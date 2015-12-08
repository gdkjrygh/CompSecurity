// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.util.Map;
import java.util.Stack;

final class ang.Object
    implements Runnable
{

    private String a;

    public final void run()
    {
        SdkManager sdkmanager;
        aez aez1;
        boolean flag;
        sdkmanager = SdkManager.a;
        String s = a;
        SdkManager.b.a("onScreenDestroy(%s)-> %s", new Object[] {
            s, sdkmanager.mApplicationName
        });
        adm adm1 = (adm)sdkmanager.b(s);
        aez1 = (aez)sdkmanager.a(s);
        SdkManager.b.a("onScreenDestroy(%s) s=%s l=%s", new Object[] {
            s, aez1, adm1
        });
        if (adm1 != null)
        {
            sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.ager._cls4(adm1, aez1));
        } else
        {
            SdkManager.b.d("onScreenDestroy(%s) - NO listener found for this id.", new Object[] {
                s
            });
        }
        SdkManager.b.a("removeScreen(%s)-> %s", new Object[] {
            aez1, sdkmanager.mApplicationName
        });
        if (aez1 == sdkmanager.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aez1 == null || !flag) goto _L2; else goto _L1
_L1:
        sdkmanager.mScreens.pop();
_L4:
        if (sdkmanager.mIdentObjectMap.containsKey(s))
        {
            sdkmanager.mIdentObjectMap.remove(s);
        }
        return;
_L2:
        if (!flag)
        {
            SdkManager.b.d("removeScreen(%s) - NOT Active screen. ActiveScreen = %s", new Object[] {
                aez1, sdkmanager.b()
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (String s)
    {
        a = s;
        super();
    }
}
