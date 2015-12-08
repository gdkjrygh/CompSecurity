// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook:
//            AccessTokenSource, TokenCachingStrategy, FacebookException, LoggingBehavior, 
//            Settings

public final class AccessToken
    implements Serializable
{

    static final String ACCESS_TOKEN_KEY = "access_token";
    private static final Date ALREADY_EXPIRED_EXPIRATION_TIME;
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
    private static final Date DEFAULT_EXPIRATION_TIME;
    private static final Date DEFAULT_LAST_REFRESH_TIME = new Date();
    static final String EXPIRES_IN_KEY = "expires_in";
    private static final Date MAX_DATE;
    private static final Date MIN_DATE;
    private static final long serialVersionUID = 1L;
    private final List declinedPermissions;
    private final Date expires;
    private final Date lastRefresh;
    private final List permissions;
    private final AccessTokenSource source;
    private final String token;

    AccessToken(String s, Date date, List list, List list1, AccessTokenSource accesstokensource, Date date1)
    {
        List list2 = list;
        if (list == null)
        {
            list2 = Collections.emptyList();
        }
        list = list1;
        if (list1 == null)
        {
            list = Collections.emptyList();
        }
        expires = date;
        permissions = Collections.unmodifiableList(list2);
        declinedPermissions = Collections.unmodifiableList(list);
        token = s;
        source = accesstokensource;
        lastRefresh = date1;
    }

    private void appendPermissions(StringBuilder stringbuilder)
    {
        stringbuilder.append(" permissions:");
        if (permissions == null)
        {
            stringbuilder.append("null");
            return;
        } else
        {
            stringbuilder.append("[");
            stringbuilder.append(TextUtils.join(", ", permissions));
            stringbuilder.append("]");
            return;
        }
    }

    static AccessToken createEmptyToken()
    {
        return new AccessToken("", ALREADY_EXPIRED_EXPIRATION_TIME, null, null, AccessTokenSource.NONE, DEFAULT_LAST_REFRESH_TIME);
    }

    private static AccessToken createFromBundle(List list, Bundle bundle, AccessTokenSource accesstokensource, Date date)
    {
        String s = bundle.getString("access_token");
        bundle = getBundleLongAsDate(bundle, "expires_in", date);
        if (Utility.isNullOrEmpty(s) || bundle == null)
        {
            return null;
        } else
        {
            return new AccessToken(s, bundle, list, null, accesstokensource, new Date());
        }
    }

    static AccessToken createFromCache(Bundle bundle)
    {
        List list = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List list1 = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        return new AccessToken(bundle.getString("com.facebook.TokenCachingStrategy.Token"), TokenCachingStrategy.getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), list, list1, TokenCachingStrategy.getSource(bundle), TokenCachingStrategy.getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }

    public static AccessToken createFromExistingAccessToken(String s, Date date, Date date1, AccessTokenSource accesstokensource, List list)
    {
        if (date == null)
        {
            date = DEFAULT_EXPIRATION_TIME;
        }
        if (date1 == null)
        {
            date1 = DEFAULT_LAST_REFRESH_TIME;
        }
        if (accesstokensource == null)
        {
            accesstokensource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        return new AccessToken(s, date, list, null, accesstokensource, date1);
    }

    public static AccessToken createFromNativeLinkingIntent(Intent intent)
    {
        Validate.notNull(intent, "intent");
        if (intent.getExtras() == null)
        {
            return null;
        } else
        {
            return createFromBundle(null, intent.getExtras(), AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date());
        }
    }

    static AccessToken createFromNativeLogin(Bundle bundle, AccessTokenSource accesstokensource)
    {
        Date date = getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        return createNew(bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS"), null, bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), date, accesstokensource);
    }

    static AccessToken createFromRefresh(AccessToken accesstoken, Bundle bundle)
    {
        if (accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_WEB && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE)
        {
            throw new FacebookException((new StringBuilder("Invalid token source: ")).append(accesstoken.source).toString());
        } else
        {
            Date date = getBundleLongAsDate(bundle, "expires_in", new Date(0L));
            bundle = bundle.getString("access_token");
            return createNew(accesstoken.getPermissions(), accesstoken.getDeclinedPermissions(), bundle, date, accesstoken.source);
        }
    }

    static AccessToken createFromString(String s, List list, AccessTokenSource accesstokensource)
    {
        return new AccessToken(s, DEFAULT_EXPIRATION_TIME, list, null, accesstokensource, DEFAULT_LAST_REFRESH_TIME);
    }

    static AccessToken createFromTokenWithRefreshedPermissions(AccessToken accesstoken, List list, List list1)
    {
        return new AccessToken(accesstoken.token, accesstoken.expires, list, list1, accesstoken.source, accesstoken.lastRefresh);
    }

    static AccessToken createFromWebBundle(List list, Bundle bundle, AccessTokenSource accesstokensource)
    {
        Date date = getBundleLongAsDate(bundle, "expires_in", new Date());
        String s = bundle.getString("access_token");
        String s1 = bundle.getString("granted_scopes");
        if (!Utility.isNullOrEmpty(s1))
        {
            list = new ArrayList(Arrays.asList(s1.split(",")));
        }
        s1 = bundle.getString("denied_scopes");
        bundle = null;
        if (!Utility.isNullOrEmpty(s1))
        {
            bundle = new ArrayList(Arrays.asList(s1.split(",")));
        }
        return createNew(list, bundle, s, date, accesstokensource);
    }

    private static AccessToken createNew(List list, List list1, String s, Date date, AccessTokenSource accesstokensource)
    {
        if (Utility.isNullOrEmpty(s) || date == null)
        {
            return createEmptyToken();
        } else
        {
            return new AccessToken(s, date, list, list1, accesstokensource, new Date());
        }
    }

    private static Date getBundleLongAsDate(Bundle bundle, String s, Date date)
    {
        if (bundle == null)
        {
            return null;
        }
        bundle = ((Bundle) (bundle.get(s)));
        long l;
        if (bundle instanceof Long)
        {
            l = ((Long)bundle).longValue();
        } else
        if (bundle instanceof String)
        {
            try
            {
                l = Long.parseLong((String)bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return null;
            }
        } else
        {
            return null;
        }
        if (l == 0L)
        {
            return new Date(0x7fffffffffffffffL);
        } else
        {
            return new Date(l * 1000L + date.getTime());
        }
    }

    static List getPermissionsFromBundle(Bundle bundle, String s)
    {
        bundle = bundle.getStringArrayList(s);
        if (bundle == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(new ArrayList(bundle));
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Cannot readObject, serialization proxy required");
    }

    private String tokenToString()
    {
        if (token == null)
        {
            return "null";
        }
        if (Settings.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS))
        {
            return token;
        } else
        {
            return "ACCESS_TOKEN_REMOVED";
        }
    }

    private Object writeReplace()
    {
        return new SerializationProxyV2(token, expires, permissions, declinedPermissions, source, lastRefresh, null);
    }

    public final List getDeclinedPermissions()
    {
        return declinedPermissions;
    }

    public final Date getExpires()
    {
        return expires;
    }

    public final Date getLastRefresh()
    {
        return lastRefresh;
    }

    public final List getPermissions()
    {
        return permissions;
    }

    public final AccessTokenSource getSource()
    {
        return source;
    }

    public final String getToken()
    {
        return token;
    }

    final boolean isInvalid()
    {
        return Utility.isNullOrEmpty(token) || (new Date()).after(expires);
    }

    final Bundle toCacheBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.TokenCachingStrategy.Token", token);
        TokenCachingStrategy.putDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate", expires);
        bundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(permissions));
        bundle.putStringArrayList("com.facebook.TokenCachingStrategy.DeclinedPermissions", new ArrayList(declinedPermissions));
        bundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", source);
        TokenCachingStrategy.putDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", lastRefresh);
        return bundle;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{AccessToken");
        stringbuilder.append(" token:").append(tokenToString());
        appendPermissions(stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        MIN_DATE = new Date(0x8000000000000000L);
        Date date = new Date(0x7fffffffffffffffL);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        ALREADY_EXPIRED_EXPIRATION_TIME = MIN_DATE;
    }

    private class SerializationProxyV2
        implements Serializable
    {

        private static final long serialVersionUID = 0xdd772aee317ab614L;
        private final List declinedPermissions;
        private final Date expires;
        private final Date lastRefresh;
        private final List permissions;
        private final AccessTokenSource source;
        private final String token;

        private Object readResolve()
        {
            return new AccessToken(token, expires, permissions, declinedPermissions, source, lastRefresh);
        }

        private SerializationProxyV2(String s, Date date, List list, List list1, AccessTokenSource accesstokensource, Date date1)
        {
            expires = date;
            permissions = list;
            declinedPermissions = list1;
            token = s;
            source = accesstokensource;
            lastRefresh = date1;
        }

        SerializationProxyV2(String s, Date date, List list, List list1, AccessTokenSource accesstokensource, Date date1, _cls1 _pcls1)
        {
            this(s, date, list, list1, accesstokensource, date1);
        }
    }

}
