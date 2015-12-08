// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.zzaa;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            aa

final class am extends al
{

    private WeakReference a;

    am(aa aa1)
    {
        a = new WeakReference(aa1);
    }

    public final void a(zzaa zzaa)
    {
        aa aa1 = (aa)a.get();
        if (aa1 != null)
        {
            aa.a(aa1, zzaa);
        }
    }
}
