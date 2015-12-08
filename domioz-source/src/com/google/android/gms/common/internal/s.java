// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.r;

// Referenced classes of package com.google.android.gms.common.internal:
//            l, k, ap

public final class s extends l
{

    final k e;

    public s(k k1, int i, Bundle bundle)
    {
        e = k1;
        super(k1, i, bundle);
    }

    protected final boolean a()
    {
        boolean flag;
        if (k.c(e) && k.d(e) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, "PostValidationCallback should not happen when mReportProgress is false ormConnectionProgressReportCallbacks is null");
        k.d(e).b();
        return true;
    }
}
