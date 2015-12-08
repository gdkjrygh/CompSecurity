// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.u;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            us, uj, ut

final class uk
    implements us
{

    final uj a;

    uk(uj uj1)
    {
        a = uj1;
        super();
    }

    public final void a(ut ut1)
    {
        a.j.remove(ut1);
        if (ut1.a() != null && uj.a(a) != null)
        {
            u u1 = uj.a(a);
            ut1.a().intValue();
            u1.a();
        }
    }
}
