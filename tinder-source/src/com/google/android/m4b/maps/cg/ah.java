// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.y.j;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            q

public class ah
{

    private static final String a = com/google/android/m4b/maps/cg/ah.getSimpleName();
    private final Executor b;
    private final q c;
    private final m d;

    public ah(Executor executor, q q1, m m1)
    {
        b = (Executor)j.a(executor, "Executor is null");
        c = (q)j.a(q1, "Toolbar is null");
        d = (m)j.a(m1, "DRD is null");
    }

}
