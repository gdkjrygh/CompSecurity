// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.TimerTask;

// Referenced classes of package com.yume.android.sdk:
//            U

final class X extends TimerTask
{

    private U a;

    X(U u)
    {
        a = u;
        super();
    }

    public final void run()
    {
        a.e();
    }
}
