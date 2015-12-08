// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.b.d;
import com.facebook.internal.n;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            g, l, Profile

final class m
{

    private static volatile m c;
    final l a;
    Profile b;
    private final d d;

    private m(d d1, l l1)
    {
        n.a(d1, "localBroadcastManager");
        n.a(l1, "profileCache");
        d = d1;
        a = l1;
    }

    static m a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/facebook/m;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new m(android.support.v4.b.d.a(g.g()), new l());
        }
        com/facebook/m;
        JVM INSTR monitorexit ;
_L2:
        return c;
        Exception exception;
        exception;
        com/facebook/m;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(Profile profile, boolean flag)
    {
        Profile profile1 = b;
        b = profile;
        if (flag)
        {
            if (profile != null)
            {
                l l1 = a;
                n.a(profile, "profile");
                JSONObject jsonobject = profile.c();
                if (jsonobject != null)
                {
                    l1.a.edit().putString("com.facebook.ProfileManager.CachedProfile", jsonobject.toString()).apply();
                }
            } else
            {
                a.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!com.facebook.internal.m.a(profile1, profile))
        {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile1);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            d.a(intent);
        }
    }
}
