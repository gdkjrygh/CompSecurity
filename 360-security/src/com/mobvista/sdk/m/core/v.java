// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.view.View;

// Referenced classes of package com.mobvista.sdk.m.core:
//            MobvistaAdNative, ac

final class v
    implements android.view.View.OnClickListener
{

    final MobvistaAdNative a;

    v(MobvistaAdNative mobvistaadnative)
    {
        a = mobvistaadnative;
        super();
    }

    public final void onClick(View view)
    {
        MobvistaAdNative.j(a).a(MobvistaAdNative.i(a), MobvistaAdNative.g(a));
    }
}
