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
        SdkManager.b.a("onScreenEnter(%s)-> %s", new Object[] {
            s, sdkmanager.mApplicationName
        });
        sdkmanager.mCurrentIdent = s;
        int i = s.lastIndexOf('/');
        Object obj;
        if (i != -1)
        {
            obj = s.substring(0, i);
        } else
        {
            obj = s;
        }
        SdkManager.b.a("onScreenEnter(%s) actualIdent=%s, i=%d", new Object[] {
            s, obj, Integer.valueOf(i)
        });
        obj = (adm)sdkmanager.b(((String) (obj)));
        SdkManager.b.a("onScreenEnter(%s) l=%s", new Object[] {
            s, obj
        });
        if (obj != null)
        {
            sdkmanager.mHandler.post(new com.bmwgroup.connected.car.internal.ager._cls2(((adm) (obj))));
        }
    }

    (String s)
    {
        a = s;
        super();
    }
}
