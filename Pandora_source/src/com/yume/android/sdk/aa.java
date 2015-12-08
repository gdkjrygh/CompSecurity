// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.TimerTask;

// Referenced classes of package com.yume.android.sdk:
//            Z

final class aa extends TimerTask
{

    private Z a;

    aa(Z z)
    {
        a = z;
        super();
    }

    public final void run()
    {
        a.h();
        if (a.f)
        {
            a.a(false, false, false);
            return;
        } else
        {
            a.k();
            return;
        }
    }
}
