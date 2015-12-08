// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.SharedPreferences;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            ac

final class ad
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    final ac a;

    ad(ac ac1)
    {
        a = ac1;
        super();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        synchronized (ac.f())
        {
            ac.a(a);
            ac.g();
        }
        return;
        s;
        sharedpreferences;
        JVM INSTR monitorexit ;
        throw s;
    }
}
