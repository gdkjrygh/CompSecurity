// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.os.Bundle;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.app.g;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.ai;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadSummary;
import com.google.common.a.kl;
import com.google.common.d.a.i;
import java.util.Set;

// Referenced classes of package com.facebook.orca.f:
//            y

public class x
{

    private final g a;
    private final k b;
    private final Set c = kl.a();

    public x(g g1, k k1)
    {
        a = g1;
        b = k1;
    }

    private void a(OperationResult operationresult, String s)
    {
        c.remove(s);
    }

    private void a(ServiceException serviceexception, String s)
    {
        c.remove(s);
        a.a(s);
    }

    static void a(x x1, OperationResult operationresult, String s)
    {
        x1.a(operationresult, s);
    }

    static void a(x x1, ServiceException serviceexception, String s)
    {
        x1.a(serviceexception, s);
    }

    public void a(ThreadSummary threadsummary)
    {
        String s = threadsummary.a();
        MarkThreadParams markthreadparams = new MarkThreadParams(s, ai.SPAM, true, threadsummary.c());
        Bundle bundle = new Bundle();
        bundle.putParcelable("markThreadParams", markthreadparams);
        i.a(b.a(aq.p, bundle).a(), new y(this, s));
        c.add(threadsummary.a());
    }

    public boolean a()
    {
        return !c.isEmpty();
    }

    public boolean a(String s)
    {
        return c.contains(s);
    }
}
