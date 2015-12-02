// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.f.r;
import com.facebook.ui.media.attachments.MediaResource;
import java.util.Map;

// Referenced classes of package com.facebook.orca.photos.b:
//            k, m, n

class l extends ac
{

    final MediaResource a;
    final k b;

    l(k k1, MediaResource mediaresource)
    {
        b = k1;
        a = mediaresource;
        super();
    }

    public void a(OperationResult operationresult)
    {
        k.a(b).put(a.j(), new m(b, n.SUCCESS, operationresult.f()));
        k.b(b).a();
    }

    protected void a(ServiceException serviceexception)
    {
        k.a(b).put(a.j(), new m(b, n.FAIL));
        k.b(b).a();
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
