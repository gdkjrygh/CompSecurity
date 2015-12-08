// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            rq, bs, at

final class bc
    implements rq
{

    final JSONObject a;
    final at b;

    bc(at at, JSONObject jsonobject)
    {
        b = at;
        a = jsonobject;
        super();
    }

    public final void a(Object obj)
    {
        ((bs)obj).a("AFMA_updateActiveView", a);
    }
}
