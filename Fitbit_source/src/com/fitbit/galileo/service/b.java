// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.Context;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoServicesStateListener

public final class b extends GalileoServicesStateListener
{

    private static b c;
    private Context b;

    private b(Context context)
    {
        b = context;
    }

    public static b b(Context context)
    {
        if (c == null)
        {
            c c1 = org.androidannotations.a.c.c.a(null);
            c = new b(context.getApplicationContext());
            c.k();
            org.androidannotations.a.c.c.a(c1);
        }
        return c;
    }

    private void k()
    {
        a = b;
    }
}
