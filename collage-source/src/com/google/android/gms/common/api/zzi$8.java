// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.google.android.gms.common.api:
//            n, zzp

class 
    implements Runnable
{

    final FragmentActivity a;
    final n b;

    public void run()
    {
        if (a.isFinishing() || a.getSupportFragmentManager().isDestroyed())
        {
            return;
        } else
        {
            zzp.b(a).a(n.e(b));
            return;
        }
    }
}
