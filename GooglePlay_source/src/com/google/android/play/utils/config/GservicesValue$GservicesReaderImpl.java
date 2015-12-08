// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils.config;

import android.content.ContentResolver;
import com.google.android.gsf.Gservices;

// Referenced classes of package com.google.android.play.utils.config:
//            GservicesValue

private static final class mContentResolver
    implements mContentResolver
{

    private final ContentResolver mContentResolver;

    public final Boolean getBoolean(String s, Boolean boolean1)
    {
        return Boolean.valueOf(Gservices.getBoolean(mContentResolver, s, boolean1.booleanValue()));
    }

    public final Float getFloat(String s, Float float1)
    {
        String s1 = Gservices.getString(mContentResolver, s, null);
        s = float1;
        if (s1 != null)
        {
            float f;
            try
            {
                f = Float.parseFloat(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return float1;
            }
            s = Float.valueOf(f);
        }
        return s;
    }

    public final Integer getInt(String s, Integer integer)
    {
        return Integer.valueOf(Gservices.getInt(mContentResolver, s, integer.intValue()));
    }

    public final Long getLong(String s, Long long1)
    {
        return Long.valueOf(Gservices.getLong(mContentResolver, s, long1.longValue()));
    }

    public final String getPartnerString(String s, String s1)
    {
        return com.google.android.gsf.tring(mContentResolver, s, s1);
    }

    public final String getString(String s, String s1)
    {
        return Gservices.getString(mContentResolver, s, s1);
    }

    public (ContentResolver contentresolver, String as[])
    {
        mContentResolver = contentresolver;
        Gservices.bulkCacheByPrefix(mContentResolver, as);
    }
}
