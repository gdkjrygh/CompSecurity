// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import com.urbanairship.Logger;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.util.UAStringUtil;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushUserPreferences, RichPushManager

public class RichPushUser
{

    RichPushUserPreferences preferences;

    RichPushUser(PreferenceDataStore preferencedatastore)
    {
        preferences = new RichPushUserPreferences(preferencedatastore);
    }

    public static boolean isCreated()
    {
        Object obj = UAirship.shared();
        String s = ((UAirship) (obj)).getRichPushManager().getRichPushUser().getId();
        obj = ((UAirship) (obj)).getRichPushManager().getRichPushUser().getPassword();
        return !UAStringUtil.isEmpty(s) && !UAStringUtil.isEmpty(((String) (obj)));
    }

    public String getId()
    {
        return preferences.getUserId();
    }

    long getLastMessageRefreshTime()
    {
        return preferences.getLastMessageRefreshTime();
    }

    long getLastUpdateTime()
    {
        return preferences.getLastUpdateTime();
    }

    public String getPassword()
    {
        return preferences.getUserToken();
    }

    void setLastMessageRefreshTime(long l)
    {
        preferences.setLastMessageRefreshTime(l);
    }

    void setLastUpdateTime(long l)
    {
        preferences.setLastUpdateTime(l);
    }

    boolean setUser(String s, String s1)
    {
        if (!UAStringUtil.isEmpty(s) && !UAStringUtil.isEmpty(s1))
        {
            Logger.debug((new StringBuilder()).append("Setting Rich Push user: ").append(s).toString());
            preferences.setUserCredentials(s, s1);
            setLastMessageRefreshTime(0L);
            return true;
        } else
        {
            Logger.error("Unable to update user. Missing user ID or token.");
            return false;
        }
    }
}
