// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.os.Bundle;
import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.images:
//            ImageSearchActivity

class c extends h
{

    final ImageSearchActivity a;

    c(ImageSearchActivity imagesearchactivity)
    {
        a = imagesearchactivity;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ImageSearchActivity.a(a, (Bundle)operationresult.i());
    }

    public void a(ServiceException serviceexception)
    {
        ImageSearchActivity.d(a);
    }
}
