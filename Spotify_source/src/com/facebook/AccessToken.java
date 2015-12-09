// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import android.text.TextUtils;
import aph;
import apj;
import arp;
import ars;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook:
//            AccessTokenSource, FacebookException, LoggingBehavior

public final class AccessToken
    implements Serializable
{

    private static final Date a;
    private static final Date b = new Date();
    private static final Date c;
    private static final long serialVersionUID = 1L;
    private final List declinedPermissions;
    final Date expires;
    final Date lastRefresh;
    final List permissions;
    final AccessTokenSource source;
    public final String token;

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

    static AccessToken a()
    {
        return new AccessToken("", c, null, null, AccessTokenSource.a, b);
    }

    static AccessToken a(Bundle bundle)
    {
        List list = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List list1 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String s = bundle.getString("com.facebook.TokenCachingStrategy.Token");
        Date date = apj.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        ars.a(bundle, "bundle");
        AccessTokenSource accesstokensource;
        if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource"))
        {
            accesstokensource = (AccessTokenSource)bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        } else
        if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO"))
        {
            accesstokensource = AccessTokenSource.b;
        } else
        {
            accesstokensource = AccessTokenSource.e;
        }
        return new AccessToken(s, date, list, list1, accesstokensource, apj.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }

    static AccessToken a(Bundle bundle, AccessTokenSource accesstokensource)
    {
        Date date = a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        return a(((List) (bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS"))), null, bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), date, accesstokensource);
    }

    public static AccessToken a(AccessToken accesstoken, Bundle bundle)
    {
        if (accesstoken.source != AccessTokenSource.b && accesstoken.source != AccessTokenSource.c && accesstoken.source != AccessTokenSource.d)
        {
            throw new FacebookException((new StringBuilder("Invalid token source: ")).append(accesstoken.source).toString());
        } else
        {
            Date date = a(bundle, "expires_in", new Date(0L));
            bundle = bundle.getString("access_token");
            return a(accesstoken.permissions, accesstoken.declinedPermissions, ((String) (bundle)), date, accesstoken.source);
        }
    }

    static AccessToken a(AccessToken accesstoken, List list, List list1)
    {
        return new AccessToken(accesstoken.token, accesstoken.expires, list, list1, accesstoken.source, accesstoken.lastRefresh);
    }

    static AccessToken a(List list, Bundle bundle, AccessTokenSource accesstokensource)
    {
        Date date = a(bundle, "expires_in", new Date());
        String s = bundle.getString("access_token");
        String s1 = bundle.getString("granted_scopes");
        if (!arp.a(s1))
        {
            list = new ArrayList(Arrays.asList(s1.split(",")));
        }
        s1 = bundle.getString("denied_scopes");
        bundle = null;
        if (!arp.a(s1))
        {
            bundle = new ArrayList(Arrays.asList(s1.split(",")));
        }
        return a(list, ((List) (bundle)), s, date, accesstokensource);
    }

    private static AccessToken a(List list, List list1, String s, Date date, AccessTokenSource accesstokensource)
    {
        if (arp.a(s) || date == null)
        {
            return a();
        } else
        {
            return new AccessToken(s, date, list, list1, accesstokensource, new Date());
        }
    }

    private static Date a(Bundle bundle, String s, Date date)
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

    private static List a(Bundle bundle, String s)
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

    private Object writeReplace()
    {
        return new SerializationProxyV2(token, expires, permissions, declinedPermissions, source, lastRefresh, (byte)0);
    }

    public final Bundle b()
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.TokenCachingStrategy.Token", token);
        apj.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate", expires);
        bundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(permissions));
        bundle.putStringArrayList("com.facebook.TokenCachingStrategy.DeclinedPermissions", new ArrayList(declinedPermissions));
        bundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", source);
        apj.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", lastRefresh);
        return bundle;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{AccessToken");
        StringBuilder stringbuilder1 = stringbuilder.append(" token:");
        Object obj;
        if (token == null)
        {
            obj = "null";
        } else
        {
            obj = LoggingBehavior.b;
            aph.a();
            obj = "ACCESS_TOKEN_REMOVED";
        }
        stringbuilder1.append(((String) (obj)));
        stringbuilder.append(" permissions:");
        if (permissions == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append("[");
            stringbuilder.append(TextUtils.join(", ", permissions));
            stringbuilder.append("]");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        a = new Date(0x8000000000000000L);
        new Date(0x7fffffffffffffffL);
        AccessTokenSource accesstokensource = AccessTokenSource.b;
        c = a;
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

        SerializationProxyV2(String s, Date date, List list, List list1, AccessTokenSource accesstokensource, Date date1, byte byte0)
        {
            this(s, date, list, list1, accesstokensource, date1);
        }
    }

}
