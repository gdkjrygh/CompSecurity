// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.DialogInterface;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class i
    implements android.content.DialogInterface.OnDismissListener
{

    final AdMobvistaAct a;

    i(AdMobvistaAct admobvistaact)
    {
        a = admobvistaact;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        a.a();
    }
}
