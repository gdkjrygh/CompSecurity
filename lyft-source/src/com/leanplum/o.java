// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;

// Referenced classes of package com.leanplum:
//            Leanplum, n

final class o extends VariablesChangedCallback
{

    private final String a;

    o(n n, String s)
    {
        a = s;
        super();
    }

    public final void variablesChanged()
    {
        Leanplum.a("Open action", a);
    }
}
