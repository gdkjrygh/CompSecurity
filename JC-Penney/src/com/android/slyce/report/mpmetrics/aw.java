// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.SharedPreferences;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            av

class aw
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    final av a;

    aw(av av1)
    {
        a = av1;
        super();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        synchronized (av.f())
        {
            av.a(a);
            av.a(false);
        }
        return;
        s;
        sharedpreferences;
        JVM INSTR monitorexit ;
        throw s;
    }
}
