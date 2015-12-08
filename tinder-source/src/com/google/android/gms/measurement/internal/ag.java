// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            b, c, e, ac

final class ag
{

    final Context a;

    ag(Context context)
    {
        u.a(context);
        context = context.getApplicationContext();
        u.a(context);
        a = context;
    }

    static b a(ac ac)
    {
        return new b(ac);
    }

    static c b(ac ac)
    {
        return new c(ac);
    }

    static e c(ac ac)
    {
        return new e(ac);
    }
}
