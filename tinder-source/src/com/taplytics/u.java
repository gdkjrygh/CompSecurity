// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.SharedPreferences;
import android.os.Handler;

// Referenced classes of package com.taplytics:
//            t, v, gs

final class u
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    final t a;

    u(t t1)
    {
        a = t1;
        super();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s == null || !s.equals("com.amplitude.api.lastEventId"))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        a.e.postAtFrontOfQueue(new v(this));
        return;
        sharedpreferences;
        gs.c((new StringBuilder("error while getting amplitude event: ")).append(sharedpreferences.getMessage()).toString());
        return;
    }
}
