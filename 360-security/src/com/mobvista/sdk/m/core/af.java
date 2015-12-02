// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.DialogInterface;
import com.mobvista.sdk.m.core.loader.JumpLoader;

// Referenced classes of package com.mobvista.sdk.m.core:
//            ac

final class af
    implements android.content.DialogInterface.OnDismissListener
{

    final ac a;

    af(ac ac1)
    {
        a = ac1;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (ac.h(a) != null && ac.h(a).a())
        {
            ac.h(a).b();
        }
    }
}
