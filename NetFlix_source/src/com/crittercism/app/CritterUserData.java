// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.util.Log;
import java.util.Map;

public class CritterUserData
{

    private Map a;
    private final boolean b;

    CritterUserData(Map map, boolean flag)
    {
        a = map;
        b = flag;
    }

    public boolean crashedOnLastLoad()
    {
        if (!a.containsKey("didCrashOnLastAppLoad"))
        {
            if (b)
            {
                Log.w("Crittercism", "User has opted out of Crittercism.  Returning false.");
            } else
            {
                Log.w("Crittercism", "CritterUserData instance has no value for crashedOnLastLoad().  Defaulting to false.");
            }
            return false;
        } else
        {
            return ((Boolean)a.get("didCrashOnLastAppLoad")).booleanValue();
        }
    }

    public String getRateMyAppMessage()
    {
        if (!a.containsKey("message"))
        {
            if (b)
            {
                Log.w("Crittercism", "User has opted out of Crittercism.  Returning null.");
            } else
            {
                Log.w("Crittercism", "CritterUserData instance has no value for getRateMyAppMessage().  Returning null.");
            }
        }
        return (String)a.get("message");
    }

    public String getRateMyAppTitle()
    {
        if (!a.containsKey("title"))
        {
            if (b)
            {
                Log.w("Crittercism", "User has opted out of Crittercism.  Returning null.");
            } else
            {
                Log.w("Crittercism", "CritterUserData instance has no value for getRateMyAppTitle().  Returning null.");
            }
        }
        return (String)a.get("title");
    }

    public String getUserUUID()
    {
        if (!a.containsKey("userUUID"))
        {
            if (b)
            {
                Log.w("Crittercism", "User has opted out of Crittercism.  Returning null.");
            } else
            {
                Log.w("Crittercism", "CritterUserData instance has no value for getUserUUID().  Returning null.");
            }
        }
        return (String)a.get("userUUID");
    }

    public boolean isOptedOut()
    {
        if (!a.containsKey("optOutStatus"))
        {
            return b;
        } else
        {
            return ((Boolean)a.get("optOutStatus")).booleanValue();
        }
    }

    public boolean shouldShowRateMyAppAlert()
    {
        if (!a.containsKey("shouldShowRateAppAlert"))
        {
            if (b)
            {
                Log.w("Crittercism", "User has opted out of Crittercism.  Returning false.");
            } else
            {
                Log.w("Crittercism", "CritterUserData instance has no value for shouldShowMyRateAppAlert().  Defaulting to false.");
            }
            return false;
        } else
        {
            return ((Boolean)a.get("shouldShowRateAppAlert")).booleanValue();
        }
    }
}
