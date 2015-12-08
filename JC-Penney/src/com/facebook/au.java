// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.support.v4.a.f;
import com.facebook.b.al;
import com.facebook.b.ar;

// Referenced classes of package com.facebook:
//            s, at, Profile

final class au
{

    private static volatile au a;
    private final f b;
    private final at c;
    private Profile d;

    au(f f1, at at1)
    {
        ar.a(f1, "localBroadcastManager");
        ar.a(at1, "profileCache");
        b = f1;
        c = at1;
    }

    static au a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/facebook/au;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new au(f.a(com.facebook.s.f()), new at());
        }
        com/facebook/au;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/facebook/au;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Profile profile, Profile profile1)
    {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile1);
        b.a(intent);
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
        if (!al.a(profile1, profile))
        {
            a(profile1, profile);
        }
    }

    void a(Profile profile)
    {
        a(profile, true);
    }

    Profile b()
    {
        return d;
    }

    boolean c()
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
