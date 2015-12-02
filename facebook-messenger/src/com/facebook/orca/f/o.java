// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.os.Bundle;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.orca.app.g;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.ai;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadSummary;

// Referenced classes of package com.facebook.orca.f:
//            ad

public class o
{

    private final g a;
    private final k b;
    private final ad c;

    public o(g g1, k k1, ad ad1)
    {
        a = g1;
        b = k1;
        c = ad1;
    }

    public void a(ThreadSummary threadsummary)
    {
        String s = threadsummary.a();
        c.a(s, threadsummary.c());
        threadsummary = new MarkThreadParams(s, ai.READ, true, threadsummary.c());
        Bundle bundle = new Bundle();
        bundle.putParcelable("markThreadParams", threadsummary);
        b.a(aq.p, bundle).a();
        a.b(s);
    }

    public void a(String s, long l)
    {
        c.a(s, l);
        MarkThreadParams markthreadparams = new MarkThreadParams(s, ai.READ, false, l);
        Bundle bundle = new Bundle();
        bundle.putParcelable("markThreadParams", markthreadparams);
        b.a(aq.p, bundle).a();
        a.b(s);
    }
}
