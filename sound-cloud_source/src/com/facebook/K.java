// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.U;
import com.facebook.internal.Y;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            s, J, Profile

final class K
{

    private static volatile K c;
    final J a;
    Profile b;
    private final LocalBroadcastManager d;

    private K(LocalBroadcastManager localbroadcastmanager, J j)
    {
        Y.a(localbroadcastmanager, "localBroadcastManager");
        Y.a(j, "profileCache");
        d = localbroadcastmanager;
        a = j;
    }

    static K a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/facebook/K;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new K(LocalBroadcastManager.getInstance(s.f()), new J());
        }
        com/facebook/K;
        JVM INSTR monitorexit ;
_L2:
        return c;
        Exception exception;
        exception;
        com/facebook/K;
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
                J j = a;
                Y.a(profile, "profile");
                JSONObject jsonobject = profile.c();
                if (jsonobject != null)
                {
                    j.a.edit().putString("com.facebook.ProfileManager.CachedProfile", jsonobject.toString()).apply();
                }
            } else
            {
                a.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!U.a(profile1, profile))
        {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile1);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            d.sendBroadcast(intent);
        }
    }
}
