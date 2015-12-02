// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.view.View;
import com.mobvista.sdk.m.b.d;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class h
    implements android.view.View.OnClickListener
{

    final int a;
    final AdMobvistaAct b;

    h(AdMobvistaAct admobvistaact, int i)
    {
        b = admobvistaact;
        a = i;
        super();
    }

    public final void onClick(View view)
    {
        if (AdMobvistaAct.b(b) != null)
        {
            AdMobvistaAct.b(b).a(a);
        }
    }
}
