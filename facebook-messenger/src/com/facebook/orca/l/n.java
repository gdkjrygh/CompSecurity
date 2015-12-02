// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.debug.d.e;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.orca.threads.FolderName;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.orca.l:
//            a, v

class n
    implements Callable
{

    final FolderName a;
    final ViewerContext b;
    final v c;
    final a d;

    n(a a1, FolderName foldername, ViewerContext viewercontext, v v1)
    {
        d = a1;
        a = foldername;
        b = viewercontext;
        c = v1;
        super();
    }

    public OperationResult a()
    {
        e e1;
        e.b(5L);
        e1 = e.a((new StringBuilder()).append("For ").append(a).toString());
        if (b != null)
        {
            com.facebook.orca.l.a.a(d).b(b);
        }
        OperationResult operationresult = c.a(a);
        if (b != null)
        {
            com.facebook.orca.l.a.a(d).d();
        }
        e1.a();
        e.a(com.facebook.orca.l.a.a());
        return operationresult;
        Exception exception;
        exception;
        if (b != null)
        {
            com.facebook.orca.l.a.a(d).d();
        }
        throw exception;
        exception;
        e1.a();
        e.a(com.facebook.orca.l.a.a());
        throw exception;
    }

    public Object call()
    {
        return a();
    }
}
