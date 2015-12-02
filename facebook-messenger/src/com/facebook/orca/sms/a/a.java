// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms.a;

import android.os.Bundle;
import com.facebook.auth.b.b;
import com.facebook.fbservice.ops.k;
import com.facebook.orca.app.dt;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.m;
import java.util.Iterator;
import java.util.Set;

public class a
{

    private final b a;
    private final k b;
    private final javax.inject.a c;

    public a(b b1, k k1, javax.inject.a a1)
    {
        a = b1;
        b = k1;
        c = a1;
    }

    public void a(Set set)
    {
        Bundle bundle;
        for (set = set.iterator(); set.hasNext(); b.a(aq.g, bundle).a())
        {
            DeleteThreadParams deletethreadparams = new DeleteThreadParams(m.a(((Long)set.next()).longValue()));
            bundle = new Bundle();
            bundle.putParcelable("deleteThreadParams", deletethreadparams);
        }

        if (a.b())
        {
            ((dt)c.b()).b();
        }
    }
}
