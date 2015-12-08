// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook:
//            AccessTokenSource

public abstract class TokenCachingStrategy
{

    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
    private static final long INVALID_BUNDLE_MILLISECONDS = 0x8000000000000000L;
    private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    public static final String USER_FBID_KEY = "com.facebook.TokenCachingStrategy.UserFBID";

    public TokenCachingStrategy()
    {
    }

    static Date getDate(Bundle bundle, String s)
    {
        long l;
        if (bundle != null)
        {
            if ((l = bundle.getLong(s, 0x8000000000000000L)) != 0x8000000000000000L)
            {
                return new Date(l);
            }
        }
        return null;
    }

    public static Date getExpirationDate(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
    }

    public static long getExpirationMilliseconds(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate");
    }

    public static Date getLastRefreshDate(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
    }

    public static long getLastRefreshMilliseconds(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getLong("com.facebook.TokenCachingStrategy.LastRefreshDate");
    }

    public static List getPermissions(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
    }

    public static AccessTokenSource getSource(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource"))
        {
            return (AccessTokenSource)bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        }
        if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO"))
        {
            return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        } else
        {
            return AccessTokenSource.WEB_VIEW;
        }
    }

    public static String getToken(Bundle bundle)
    {
        Validate.notNull(bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    public static boolean hasTokenInformation(Bundle bundle)
    {
        String s;
        if (bundle != null)
        {
            if ((s = bundle.getString("com.facebook.TokenCachingStrategy.Token")) != null && s.length() != 0 && bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L)
            {
                return true;
            }
        }
        return false;
    }

    static void putDate(Bundle bundle, String s, Date date)
    {
        bundle.putLong(s, date.getTime());
    }

    public static void putExpirationDate(Bundle bundle, Date date)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(date, "value");
        putDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate", date);
    }

    public static void putExpirationMilliseconds(Bundle bundle, long l)
    {
        Validate.notNull(bundle, "bundle");
        bundle.putLong("com.facebook.TokenCachingStrategy.ExpirationDate", l);
    }

    public static void putLastRefreshDate(Bundle bundle, Date date)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(date, "value");
        putDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", date);
    }

    public static void putLastRefreshMilliseconds(Bundle bundle, long l)
    {
        Validate.notNull(bundle, "bundle");
        bundle.putLong("com.facebook.TokenCachingStrategy.LastRefreshDate", l);
    }

    public static void putPermissions(Bundle bundle, List list)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(list, "value");
        if (list instanceof ArrayList)
        {
            list = (ArrayList)list;
        } else
        {
            list = new ArrayList(list);
        }
        bundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", list);
    }

    public static void putSource(Bundle bundle, AccessTokenSource accesstokensource)
    {
        Validate.notNull(bundle, "bundle");
        bundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", accesstokensource);
    }

    public static void putToken(Bundle bundle, String s)
    {
        Validate.notNull(bundle, "bundle");
        Validate.notNull(s, "value");
        bundle.putString("com.facebook.TokenCachingStrategy.Token", s);
    }

    public abstract void clear();

    public abstract Bundle load();

    public abstract void save(Bundle bundle);
}
