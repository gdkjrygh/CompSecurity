// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.SharedPreferences;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            ac, v

final class w
    implements af.b
{

    final v a;

    w(v v1)
    {
        a = v1;
        super();
    }

    public final void a(SharedPreferences sharedpreferences)
    {
        sharedpreferences = ac.a(sharedpreferences);
        if (sharedpreferences != null)
        {
            v.a(a, sharedpreferences);
        }
    }
}
