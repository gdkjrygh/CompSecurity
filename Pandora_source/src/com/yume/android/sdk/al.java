// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;

// Referenced classes of package com.yume.android.sdk:
//            ak, am, YuMeAdEvent, M, 
//            YuMeSDKInterfaceImpl, YuMeAppInterface

final class al
    implements Runnable
{

    private ak a;

    al(ak ak1)
    {
        a = ak1;
        super();
    }

    public final void run()
    {
        int i = 0;
_L8:
        Object obj;
        try
        {
            if (i >= a.b.size())
            {
                a.b = null;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            a.b = null;
            a.a.c("Exception notifying Ad Event.");
            return;
        }
        obj = (am)a.b.get(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        if (((am) (obj)).b == YuMeAdEvent.NONE) goto _L2; else goto _L1
_L1:
        if (((am) (obj)).d == null) goto _L4; else goto _L3
_L3:
        a.a.b((new StringBuilder("Notifying Ad Event(")).append(((am) (obj)).a).append("): adEvent: ").append(((am) (obj)).b).append(", eventInfo: ").append(((am) (obj)).d).toString());
_L5:
        YuMeSDKInterfaceImpl.c.YuMeApp_EventListener(((am) (obj)).a, ((am) (obj)).b, ((am) (obj)).d);
_L2:
        if (((am) (obj)).c == YuMeAdEvent.NONE)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        if (((am) (obj)).d == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        a.a.b((new StringBuilder("Notifying Ad Event(")).append(((am) (obj)).a).append("): adEvent: ").append(((am) (obj)).c).append(", eventInfo: ").append(((am) (obj)).d).toString());
_L6:
        YuMeSDKInterfaceImpl.c.YuMeApp_EventListener(((am) (obj)).a, ((am) (obj)).c, null);
        break MISSING_BLOCK_LABEL_338;
_L4:
        a.a.b((new StringBuilder("Notifying Ad Event(")).append(((am) (obj)).a).append("): adEvent: ").append(((am) (obj)).b).toString());
          goto _L5
        a.a.b((new StringBuilder("Notifying Ad Event(")).append(((am) (obj)).a).append("): adEvent: ").append(((am) (obj)).c).toString());
          goto _L6
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
