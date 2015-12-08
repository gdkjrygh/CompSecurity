// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.bd;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            tu, tz, uj

final class ty extends bd
{

    private final WeakReference a;

    ty(tu tu1)
    {
        a = new WeakReference(tu1);
    }

    public final void a(ResolveAccountResponse resolveaccountresponse)
    {
        tu tu1 = (tu)a.get();
        if (tu1 == null)
        {
            return;
        } else
        {
            tu.c(tu1).a(new tz(this, tu1, tu1, resolveaccountresponse));
            return;
        }
    }
}
