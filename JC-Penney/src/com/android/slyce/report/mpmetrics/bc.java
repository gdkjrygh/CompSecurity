// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            bd

class bc
    implements Callable
{

    private final Context a;
    private final String b;
    private final bd c;

    public bc(Context context, String s, bd bd1)
    {
        a = context;
        b = s;
        c = bd1;
    }

    public SharedPreferences a()
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences(b, 0);
        if (c != null)
        {
            c.a(sharedpreferences);
        }
        return sharedpreferences;
    }

    public Object call()
    {
        return a();
    }
}
