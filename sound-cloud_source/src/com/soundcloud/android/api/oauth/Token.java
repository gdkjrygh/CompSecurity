// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.oauth;

import android.support.v4.util.ArrayMap;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class Token
    implements Serializable
{

    private static final String ACCESS_TOKEN = "access_token";
    public static final Token EMPTY = new Token(null, null);
    private static final String EXPIRES_IN = "expires_in";
    private static final String REFRESH_TOKEN = "refresh_token";
    private static final String SCOPE = "scope";
    public static final String SCOPE_DEFAULT = "*";
    public static final String SCOPE_NON_EXPIRING = "non-expiring";
    public static final String SCOPE_PLAYCOUNT = "playcount";
    public static final String SCOPE_SIGNUP = "signup";
    private static final long serialVersionUID = 0xaa1fa314116bbc6L;
    private String access;
    private final Map customParameters;
    private long expiresAt;
    private String refresh;
    private String scope;

    public Token(String s, String s1)
    {
        this(s, s1, null);
    }

    public Token(String s, String s1, String s2)
    {
        customParameters = new ArrayMap();
        access = s;
        refresh = s1;
        scope = s2;
    }

    public Token(String s, String s1, String s2, long l)
    {
        this(s, s1, s2);
        expiresAt = l;
    }

    public Token(JSONObject jsonobject)
        throws IOException
    {
        customParameters = new ArrayMap();
        Iterator iterator = jsonobject.keys();
_L3:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s = iterator.next().toString();
        if (!"access_token".equals(s)) goto _L2; else goto _L1
_L1:
        access = jsonobject.getString(s);
          goto _L3
_L2:
label0:
        {
            if (!"refresh_token".equals(s))
            {
                break label0;
            }
            refresh = jsonobject.getString(s);
        }
          goto _L3
label1:
        {
            if (!"expires_in".equals(s))
            {
                break label1;
            }
            expiresAt = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(jsonobject.getLong(s));
        }
          goto _L3
label2:
        {
            if (!"scope".equals(s))
            {
                break label2;
            }
            scope = jsonobject.getString(s);
        }
          goto _L3
        try
        {
            customParameters.put(s, jsonobject.get(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new IOException(jsonobject.getMessage());
        }
          goto _L3
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj instanceof Token)
            {
                obj = (Token)obj;
                if (access == null ? ((Token) (obj)).access != null : !access.equals(((Token) (obj)).access))
                {
                    return false;
                }
                if (refresh == null ? ((Token) (obj)).refresh != null : !refresh.equals(((Token) (obj)).refresh))
                {
                    return false;
                }
                if (scope == null ? ((Token) (obj)).scope != null : !scope.equals(((Token) (obj)).scope))
                {
                    return false;
                }
            } else
            {
                return super.equals(obj);
            }
        }
        return true;
    }

    public String getAccessToken()
    {
        return access;
    }

    public long getExpiresAt()
    {
        return expiresAt;
    }

    public String getParameter(String s)
    {
        return (String)customParameters.get(s);
    }

    public String getRefreshToken()
    {
        return refresh;
    }

    public String getScope()
    {
        return scope;
    }

    public String getSignup()
    {
        return (String)customParameters.get("soundcloud:user:sign-up");
    }

    public boolean hasDefaultScope()
    {
        return hasScope("*");
    }

    public boolean hasRefreshToken()
    {
        return refresh != null;
    }

    public boolean hasScope(String s)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (scope == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        int j;
        as = scope.split(" ");
        j = as.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (!s.equals(as[i])) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (access != null)
        {
            i = access.hashCode();
        } else
        {
            i = 0;
        }
        if (refresh != null)
        {
            j = refresh.hashCode();
        } else
        {
            j = 0;
        }
        if (scope != null)
        {
            k = scope.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public void invalidate()
    {
        access = null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Token{access='")).append(access).append('\'').append(", refresh='").append(refresh).append('\'').append(", scope='").append(scope).append('\'').append(", expires=");
        Object obj;
        if (expiresAt == 0L)
        {
            obj = "never";
        } else
        {
            obj = new Date(expiresAt);
        }
        return stringbuilder.append(obj).append('}').toString();
    }

    public boolean valid()
    {
        return access != null && (hasScope("non-expiring") || refresh != null);
    }

}
