// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ar, am, aj, ao

final class aq
    implements ar
{

    final ao a;

    aq(ao ao)
    {
        a = ao;
        super();
    }

    public final void a(am am1, Set set, Set set1, aj aj1)
    {
        set.addAll(am1.c());
        set1.addAll(am1.d());
        aj1.e();
        am1.c();
        am1.e();
        aj1.f();
        am1.d();
        am1.f();
    }
}
