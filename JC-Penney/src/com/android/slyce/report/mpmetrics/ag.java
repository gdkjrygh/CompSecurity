// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.SharedPreferences;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            bd, av, af

class ag
    implements bd
{

    final af a;

    ag(af af1)
    {
        a = af1;
        super();
    }

    public void a(SharedPreferences sharedpreferences)
    {
        sharedpreferences = av.a(sharedpreferences);
        if (sharedpreferences != null)
        {
            af.a(a, sharedpreferences);
        }
    }
}
