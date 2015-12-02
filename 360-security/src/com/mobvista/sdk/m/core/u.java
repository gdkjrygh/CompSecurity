// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.util.Log;

// Referenced classes of package com.mobvista.sdk.m.core:
//            MobvistaAdNative

final class u
    implements Runnable
{

    final MobvistaAdNative a;

    u(MobvistaAdNative mobvistaadnative)
    {
        a = mobvistaadnative;
        super();
    }

    public final void run()
    {
        Log.i("MobvistaAdNative", "load FB ad timeout... start to load MV ad...");
        MobvistaAdNative.h(a);
    }
}
