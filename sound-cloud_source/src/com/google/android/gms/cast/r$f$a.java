// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.q;
import com.google.android.gms.cast.internal.t;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            r

private final class b
    implements ResultCallback
{

    final al.t.a a;
    private final long b;

    public final void onResult(Result result)
    {
        result = (Status)result;
        if (!result.isSuccess())
        {
            q q1 = a.a.b;
            long l = b;
            int i = result.getStatusCode();
            for (result = q1.k.iterator(); result.hasNext(); ((t)result.next()).a(l, i, null)) { }
        }
    }

    Result(Result result, long l)
    {
        a = result;
        super();
        b = l;
    }
}
