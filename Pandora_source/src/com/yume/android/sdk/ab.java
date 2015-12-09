// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.TimerTask;

// Referenced classes of package com.yume.android.sdk:
//            Z

final class ab extends TimerTask
{

    private Z a;
    private final String b;

    ab(Z z, String s)
    {
        a = z;
        b = s;
        super();
    }

    public final void run()
    {
        a.i();
        a.b(b);
    }
}
