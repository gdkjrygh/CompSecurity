// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.os.Handler;

// Referenced classes of package com.leanplum:
//            aL, aJ, aW

final class aN
    implements Runnable
{

    private aL a;

    aN(aL al)
    {
        a = al;
        super();
    }

    public final void run()
    {
        a.a.f.postDelayed(this, a.a.d);
        a.a.e.a("2:::");
    }
}
