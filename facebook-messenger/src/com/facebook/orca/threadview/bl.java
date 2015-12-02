// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;
import android.widget.EditText;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bl extends ac
{

    final ThreadViewFragment a;

    bl(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ThreadViewFragment.a(a, null);
        ThreadViewFragment.a(a, operationresult);
        ThreadViewFragment.f(a).setVisibility(8);
        ThreadViewFragment.g(a).setText("");
        a.P();
    }

    protected void a(ServiceException serviceexception)
    {
        ThreadViewFragment.a(a, null);
        ThreadViewFragment.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
