// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;

// Referenced classes of package com.leanplum:
//            Z, N

final class D
    implements Z
{

    private final VariablesChangedCallback a;

    D(VariablesChangedCallback variableschangedcallback)
    {
        a = variableschangedcallback;
        super();
    }

    public final void a()
    {
        if (a != null)
        {
            N.a().a(a);
        }
    }
}
