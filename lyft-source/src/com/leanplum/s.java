// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.leanplum:
//            ActionContext

final class s
    implements Runnable
{

    private final ActionCallback a;
    private final ActionContext b;
    private final VariablesChangedCallback c;
    private final AtomicBoolean d;

    s(ActionCallback actioncallback, ActionContext actioncontext, VariablesChangedCallback variableschangedcallback, AtomicBoolean atomicboolean)
    {
        a = actioncallback;
        b = actioncontext;
        c = variableschangedcallback;
        d = atomicboolean;
        super();
    }

    public final void run()
    {
        if (a.onResponse(b) && c != null && !d.getAndSet(true))
        {
            c.variablesChanged();
        }
    }
}
