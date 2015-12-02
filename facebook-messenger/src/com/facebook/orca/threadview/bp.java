// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.app.Activity;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.threadlist.s;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bp extends ac
{

    final ThreadViewFragment a;

    bp(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ThreadViewFragment.b(a, null);
        if (a.l() instanceof s)
        {
            ThreadViewFragment.c(a);
            return;
        } else
        {
            ((Activity)a.n()).finish();
            return;
        }
    }

    protected void a(ServiceException serviceexception)
    {
        ThreadViewFragment.b(a, null);
        ThreadViewFragment.b(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
