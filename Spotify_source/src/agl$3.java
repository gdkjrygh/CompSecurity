// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.util.Stack;

final class ang.Object
    implements Runnable
{

    private String a;

    public final void run()
    {
        SdkManager sdkmanager = SdkManager.a;
        String s = a;
        SdkManager.b.a("onScreenCreate(%s)-> %s", new Object[] {
            s, sdkmanager.mApplicationName
        });
        sdkmanager.mCurrentIdent = s;
        int i = s.lastIndexOf('/');
        Object obj;
        aez aez1;
        adm adm1;
        if (i != -1)
        {
            obj = s.substring(0, i);
        } else
        {
            obj = s;
        }
        SdkManager.b.a("onScreenCreate(%s) parentIdent=%s, i=%d", new Object[] {
            s, obj, Integer.valueOf(i)
        });
        aez1 = (aez)sdkmanager.a(s);
        adm1 = (adm)sdkmanager.b(((String) (obj)));
        obj = aez1;
        if (aez1 != null) goto _L2; else goto _L1
_L1:
        SdkManager.b.a("addScreen(%s)-> %s", new Object[] {
            adm1, sdkmanager.mApplicationName
        });
        obj = null;
        if (!(adm1 instanceof ahi)) goto _L4; else goto _L3
_L3:
        obj = new aga(sdkmanager.b(), adm1);
_L6:
        sdkmanager.mScreens.push(obj);
        sdkmanager.a(SdkManager.a.a(), obj);
_L2:
        SdkManager.b.a("onScreenCreate(%s) s=%s l=%s", new Object[] {
            s, obj, adm1
        });
        if (adm1 != null)
        {
            sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.ager._cls1(adm1, ((aez) (obj))));
        }
        return;
_L4:
        if (adm1 instanceof agy)
        {
            obj = new afv(sdkmanager.b(), adm1);
        } else
        if (adm1 instanceof aeo)
        {
            obj = new afq(sdkmanager.b(), adm1);
        } else
        if (adm1 instanceof aev)
        {
            obj = new aft(sdkmanager.b(), adm1);
        } else
        if (adm1 instanceof aey)
        {
            obj = new aft(sdkmanager.b(), adm1);
        } else
        if (adm1 instanceof aes)
        {
            obj = new afr(sdkmanager.b(), adm1);
        } else
        if (adm1 instanceof aem)
        {
            obj = new afo(sdkmanager.b(), adm1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    (String s)
    {
        a = s;
        super();
    }
}
