// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import com.mobvista.sdk.m.a.a.c.d;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class c
    implements d
{

    final String a;
    final AdMobvistaAct b;

    c(AdMobvistaAct admobvistaact, String s)
    {
        b = admobvistaact;
        a = s;
        super();
    }

    public final void OnLoadCanceled(int i)
    {
    }

    public final void OnLoadError(int i, String s)
    {
        AdMobvistaAct.a(b, a);
    }

    public final void OnLoadFinish(int i, Object obj)
    {
    }

    public final void OnLoadStart(int i)
    {
    }
}
