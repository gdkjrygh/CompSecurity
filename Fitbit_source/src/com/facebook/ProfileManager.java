// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook:
//            FacebookSdk, ProfileCache, Profile

final class ProfileManager
{

    static final String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
    static final String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";
    static final String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
    private static volatile ProfileManager instance;
    private Profile currentProfile;
    private final LocalBroadcastManager localBroadcastManager;
    private final ProfileCache profileCache;

    ProfileManager(LocalBroadcastManager localbroadcastmanager, ProfileCache profilecache)
    {
        Validate.notNull(localbroadcastmanager, "localBroadcastManager");
        Validate.notNull(profilecache, "profileCache");
        localBroadcastManager = localbroadcastmanager;
        profileCache = profilecache;
    }

    static ProfileManager getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/facebook/ProfileManager;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new ProfileManager(LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()), new ProfileCache());
        }
        com/facebook/ProfileManager;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Exception exception;
        exception;
        com/facebook/ProfileManager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void sendCurrentProfileChangedBroadcast(Profile profile, Profile profile1)
    {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile1);
        localBroadcastManager.sendBroadcast(intent);
    }

    private void setCurrentProfile(Profile profile, boolean flag)
    {
        Profile profile1 = currentProfile;
        currentProfile = profile;
        if (flag)
        {
            if (profile != null)
            {
                profileCache.save(profile);
            } else
            {
                profileCache.clear();
            }
        }
        if (!Utility.areObjectsEqual(profile1, profile))
        {
            sendCurrentProfileChangedBroadcast(profile1, profile);
        }
    }

    Profile getCurrentProfile()
    {
        return currentProfile;
    }

    boolean loadCurrentProfile()
    {
        boolean flag = false;
        Profile profile = profileCache.load();
        if (profile != null)
        {
            setCurrentProfile(profile, false);
            flag = true;
        }
        return flag;
    }

    void setCurrentProfile(Profile profile)
    {
        setCurrentProfile(profile, true);
    }
}
