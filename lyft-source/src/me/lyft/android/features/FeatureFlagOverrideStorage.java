// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package me.lyft.android.features:
//            IFeatureFlagOverrideStorage, FeatureFlag

class FeatureFlagOverrideStorage
    implements IFeatureFlagOverrideStorage
{

    private final SharedPreferences preferences;

    public FeatureFlagOverrideStorage(Context context)
    {
        preferences = context.getSharedPreferences("flags", 0);
    }

    public void clear()
    {
        preferences.edit().clear().apply();
    }

    public void removeFlag(String s)
    {
        preferences.edit().remove(s).apply();
    }

    public void restore(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            FeatureFlag featureflag = (FeatureFlag)list.next();
            if (preferences.contains(featureflag.name))
            {
                featureflag.override(preferences.getBoolean(featureflag.name, false));
            }
        } while (true);
    }

    public void saveFlag(String s, boolean flag)
    {
        preferences.edit().putBoolean(s, flag).apply();
    }
}
