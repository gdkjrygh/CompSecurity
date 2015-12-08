// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import org.json.JSONObject;

// Referenced classes of package com.leanplum:
//            ab

final class h
    implements ab
{

    private final Runnable a;

    h(Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final void a(JSONObject jsonobject)
    {
        if (a != null)
        {
            a.run();
        }
    }
}
