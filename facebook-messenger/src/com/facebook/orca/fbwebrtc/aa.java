// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity

class aa extends ac
{

    final WebrtcIncallActivity a;

    aa(WebrtcIncallActivity webrtcincallactivity)
    {
        a = webrtcincallactivity;
        super();
    }

    public void a(OperationResult operationresult)
    {
        WebrtcIncallActivity.a(a, null);
        WebrtcIncallActivity.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        WebrtcIncallActivity.a(a, null);
        com.facebook.debug.log.b.d(WebrtcIncallActivity.j(), "Failed to fetch contact %d", new Object[] {
            Long.valueOf(WebrtcIncallActivity.k(a))
        });
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
