// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import com.arist.model.equize.a;

// Referenced classes of package com.arist.activity:
//            EqualizerActivity

final class g
    implements Runnable
{

    final EqualizerActivity a;

    g(EqualizerActivity equalizeractivity)
    {
        a = equalizeractivity;
        super();
    }

    public final void run()
    {
        a.a(com.arist.activity.EqualizerActivity.a(a).a());
    }
}
