// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import java.util.concurrent.Callable;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            af

private static final class c
    implements Callable
{

    private final Context a;
    private final String b;
    private final a c;

    public final Object call()
    {
        android.content.SharedPreferences sharedpreferences = a.getSharedPreferences(b, 0);
        if (c != null)
        {
            c.a(sharedpreferences);
        }
        return sharedpreferences;
    }

    public (Context context, String s,  )
    {
        a = context;
        b = s;
        c = ;
    }
}
