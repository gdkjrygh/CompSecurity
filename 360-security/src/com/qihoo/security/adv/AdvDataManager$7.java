// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Map;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager, f

class a extends Handler
{

    final AdvDataManager a;

    public void handleMessage(Message message)
    {
        Object obj;
        super.handleMessage(message);
        obj = message.obj;
        message.what;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 41
    //                   1 100
    //                   2 129;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        message = (vType)obj;
        if (vType.a(((vType) (message)).c))
        {
            AdvDataManager.a(a, ((vType) (message)).c, ((c) (message)).d);
        }
        if (vType.b(((vType) (message)).c) && ((c) (message)).e != null)
        {
            AdvDataManager.a(a, ((a) (message)).e);
            return;
        }
          goto _L1
_L3:
        try
        {
            message = f.a(AdvDataManager.a(a));
            a.a = message.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message.printStackTrace();
        }
        return;
_L4:
        obj = (a)obj;
        long l = ((a) (obj)).b;
        message = ((b) (obj)).c;
        obj = ((c) (obj)).a;
        a a1 = AdvDataManager.a(a, message);
        if (a1 != null)
        {
            AdvDataManager.b(a).put(message, a1);
            if (!AdvDataManager.b(a, a1))
            {
                a.a(((a) (obj)), new <init>(a1, 3), message, l);
                return;
            } else
            {
                AdvDataManager.a(a, l, message, ((vType) (obj)));
                return;
            }
        } else
        {
            AdvDataManager.a(a, l, message, ((vType) (obj)));
            return;
        }
    }

    vType(AdvDataManager advdatamanager, Looper looper)
    {
        a = advdatamanager;
        super(looper);
    }
}
