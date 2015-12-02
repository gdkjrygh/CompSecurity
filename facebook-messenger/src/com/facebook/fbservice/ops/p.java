// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.viewercontext.e;
import com.facebook.common.d.c;
import com.facebook.common.executors.a;
import com.facebook.common.process.d;
import com.facebook.fbservice.service.OperationType;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.fbservice.ops:
//            k, r, m

public class p
    implements k
{

    private final Context a;
    private final com.facebook.fbservice.service.p b;
    private final a c;
    private final e d;
    private final d e;

    public p(Context context, com.facebook.fbservice.service.p p1, a a1, e e1, d d1)
    {
        a = context;
        b = p1;
        c = a1;
        d = e1;
        e = d1;
    }

    public m a(OperationType operationtype, Bundle bundle)
    {
        return b(operationtype, bundle);
    }

    public r b(OperationType operationtype, Bundle bundle)
    {
        Preconditions.checkNotNull(operationtype);
        Preconditions.checkNotNull(bundle);
        operationtype = new r(operationtype, bundle, a, b, c, d, e);
        if (a instanceof c)
        {
            ((c)a).a(com.facebook.fbservice.ops.r.a(operationtype));
        }
        return operationtype;
    }
}
