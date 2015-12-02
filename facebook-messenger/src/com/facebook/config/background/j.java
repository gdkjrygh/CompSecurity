// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.background;

import com.facebook.common.time.a;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.config.background:
//            i, h

class j extends ac
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    protected void a(OperationResult operationresult)
    {
        i.b(a).b().a(h.b, com.facebook.config.background.i.a(a).a()).a();
    }

    protected void a(ServiceException serviceexception)
    {
    }

    protected void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
