// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.view.View;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class g
    implements android.view.View.OnClickListener
{

    final AdMobvistaAct a;

    g(AdMobvistaAct admobvistaact)
    {
        a = admobvistaact;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
