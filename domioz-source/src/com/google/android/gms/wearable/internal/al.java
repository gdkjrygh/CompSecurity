// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ai, ax, zzas, ae

final class al extends ai
{

    private final List a;

    al(z z, List list)
    {
        super(z);
        a = list;
    }

    public final void a(zzas zzas1)
    {
        a(new ax(ae.a(zzas1.b), zzas1.c));
        if (zzas1.b != 0)
        {
            for (zzas1 = a.iterator(); zzas1.hasNext(); ((FutureTask)zzas1.next()).cancel(true)) { }
        }
    }
}
