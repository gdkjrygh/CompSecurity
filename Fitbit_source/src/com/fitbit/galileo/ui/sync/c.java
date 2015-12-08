// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui.sync;

import android.content.Context;
import com.fitbit.galileo.service.b;

// Referenced classes of package com.fitbit.galileo.ui.sync:
//            b

public final class c extends com.fitbit.galileo.ui.sync.b
{

    private static c e;
    private Context d;

    private c(Context context)
    {
        d = context;
    }

    public static c b(Context context)
    {
        if (e == null)
        {
            org.androidannotations.a.c.c c1 = org.androidannotations.a.c.c.a(null);
            e = new c(context.getApplicationContext());
            e.h();
            org.androidannotations.a.c.c.a(c1);
        }
        return e;
    }

    private void h()
    {
        b = d;
        c = com.fitbit.galileo.service.b.b(d);
        b();
    }
}
