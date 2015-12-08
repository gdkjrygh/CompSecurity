// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            u, ei, fy, gu, 
//            dp

class lI
    implements Runnable
{

    final u lG;
    final Intent lI;

    public void run()
    {
        if (ei.d(lI) == 0 && u.a(lG).lT != null && u.a(lG).lT.se != null && u.a(lG).lT.se.dC() != null)
        {
            u.a(lG).lT.se.dC().close();
        }
        u.a(lG).mh = false;
    }

    (u u1, Intent intent)
    {
        lG = u1;
        lI = intent;
        super();
    }
}
