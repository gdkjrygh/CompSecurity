// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.securitydetect;

import java.util.ArrayList;

// Referenced classes of package com.taobao.wireless.security.sdk.securitydetect:
//            ISecurityDetect

public class SecurityDetect
    implements ISecurityDetect
{

    private static ArrayList a = new ArrayList();
    private static int b = 0;

    public SecurityDetect()
    {
    }

    public static void OnInjectionJNI(int i)
    {
        com/taobao/wireless/security/sdk/securitydetect/SecurityDetect;
        JVM INSTR monitorenter ;
        b = i;
        i = 0;
_L2:
        if (i >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((ISecurityDetect.IInjectionCB)a.get(i)).onInjection(b);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void registerInjectionCB(ISecurityDetect.IInjectionCB iinjectioncb)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(iinjectioncb);
        if (b != 0)
        {
            iinjectioncb.onInjection(b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        iinjectioncb;
        throw iinjectioncb;
    }

}
