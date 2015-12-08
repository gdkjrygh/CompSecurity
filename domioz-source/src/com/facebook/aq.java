// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.support.v4.content.k;
import com.facebook.internal.aw;
import com.facebook.internal.bc;

// Referenced classes of package com.facebook:
//            q, ap, Profile

final class aq
{

    private static volatile aq a;
    private final k b;
    private final ap c;
    private Profile d;

    private aq(k k1, ap ap1)
    {
        bc.a(k1, "localBroadcastManager");
        bc.a(ap1, "profileCache");
        b = k1;
        c = ap1;
    }

    static aq a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/facebook/aq;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new aq(k.a(q.f()), new ap());
        }
        com/facebook/aq;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/facebook/aq;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Profile profile, boolean flag)
    {
        Profile profile1 = d;
        d = profile;
        if (flag)
        {
            if (profile != null)
            {
                c.a(profile);
            } else
            {
                c.b();
            }
        }
        if (!aw.a(profile1, profile))
        {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile1);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            b.a(intent);
        }
    }

    final void a(Profile profile)
    {
        a(profile, true);
    }

    final Profile b()
    {
        return d;
    }

    final boolean c()
    {
        boolean flag = false;
        Profile profile = c.a();
        if (profile != null)
        {
            a(profile, false);
            flag = true;
        }
        return flag;
    }
}
