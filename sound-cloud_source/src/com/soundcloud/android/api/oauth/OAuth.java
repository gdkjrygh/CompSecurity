// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.oauth;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.soundcloud.android.accounts.AccountOperations;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.soundcloud.android.api.oauth:
//            Token

public class OAuth
{

    private static final String CLIENT_ID = "40ccfee680a844780a41fbe23ea89934";
    private static final long CLIENT_SECRET[] = {
        0xcfdbf8ab10dcada3L, 0x6c580a13a4b7801L, 0x607547ec749ebfb4L, 0x300c455e649b39a7L, 0x20a6bac9576286cbL
    };
    public static final String DEFAULT_SCOPES[] = {
        "non-expiring"
    };
    public static final String GRANT_TYPE_CLIENT_CREDENTIALS = "client_credentials";
    public static final String GRANT_TYPE_FACEBOOK = "urn:soundcloud:oauth2:grant-type:facebook&access_token=";
    public static final String GRANT_TYPE_GOOGLE_PLUS = "urn:soundcloud:oauth2:grant-type:google_plus&access_token=";
    public static final String GRANT_TYPE_PASSWORD = "password";
    public static final String GRANT_TYPE_REFRESH_TOKEN = "refresh_token";
    public static final String PARAM_CLIENT_ID = "client_id";
    public static final String PARAM_CLIENT_SECRET = "client_secret";
    public static final String PARAM_GRANT_TYPE = "grant_type";
    public static final String PARAM_PASSWORD = "password";
    public static final String PARAM_REFRESH_TOKEN = "refresh_token";
    public static final String PARAM_SCOPE = "scope";
    public static final String PARAM_USERNAME = "username";
    private final AccountOperations accountOperations;
    private final String clientId;
    private final String clientSecret;

    public OAuth(AccountOperations accountoperations)
    {
        this("40ccfee680a844780a41fbe23ea89934", deobfuscate(CLIENT_SECRET), accountoperations);
    }

    public OAuth(String s, String s1, AccountOperations accountoperations)
    {
        clientId = s;
        clientSecret = s1;
        accountOperations = accountoperations;
    }

    public static Header createOAuthHeader(Token token)
    {
        return new BasicHeader("Authorization", createOAuthHeaderValue(token));
    }

    public static String createOAuthHeaderValue(Token token)
    {
        StringBuilder stringbuilder = new StringBuilder("OAuth ");
        if (token == null || !token.valid())
        {
            token = "invalidated";
        } else
        {
            token = token.getAccessToken();
        }
        return stringbuilder.append(token).toString();
    }

    private static String deobfuscate(long al[])
    {
        int l = al.length;
        byte abyte0[] = new byte[(l - 1) * 8];
        Random random = new Random(al[0]);
        for (int i = 1; i < l; i++)
        {
            long l1 = random.nextLong() ^ al[i];
            int i1 = Math.min(abyte0.length, (i - 1) * 8 + 8);
            for (int k = (i - 1) * 8; k < i1; k++)
            {
                abyte0[k] = (byte)(int)l1;
                l1 >>= 8;
            }

        }

        int j;
        try
        {
            al = new String(abyte0, new String(new char[] {
                'U', 'T', 'F', '8'
            }));
        }
        // Misplaced declaration of an exception variable
        catch (long al[])
        {
            throw new AssertionError(al);
        }
        j = al.indexOf('\0');
        if (-1 == j)
        {
            return al;
        } else
        {
            return al.substring(0, j);
        }
    }

    private transient String getScopeParam(String as[])
    {
        return TextUtils.join(" ", as);
    }

    public String getAuthorizationHeaderValue()
    {
        return createOAuthHeaderValue(accountOperations.getSoundCloudToken());
    }

    public String getClientId()
    {
        return clientId;
    }

    public String getClientSecret()
    {
        return clientSecret;
    }

    public Map getTokenRequestParamsForRefreshToken(String s)
    {
        ArrayMap arraymap = new ArrayMap(4);
        arraymap.put("grant_type", "refresh_token");
        arraymap.put("client_id", clientId);
        arraymap.put("client_secret", clientSecret);
        arraymap.put("refresh_token", s);
        return arraymap;
    }

    public transient Map getTokenRequestParamsFromClientCredentials(String as[])
    {
        ArrayMap arraymap = new ArrayMap(4);
        arraymap.put("grant_type", "client_credentials");
        arraymap.put("client_id", clientId);
        arraymap.put("client_secret", clientSecret);
        if (as.length > 0)
        {
            arraymap.put("scope", getScopeParam(as));
        }
        return arraymap;
    }

    public Map getTokenRequestParamsFromExtensionGrant(String s)
    {
        ArrayMap arraymap = new ArrayMap(4);
        arraymap.put("grant_type", s);
        arraymap.put("client_id", clientId);
        arraymap.put("client_secret", clientSecret);
        arraymap.put("scope", getScopeParam(DEFAULT_SCOPES));
        return arraymap;
    }

    public Map getTokenRequestParamsFromUserCredentials(String s, String s1)
    {
        ArrayMap arraymap = new ArrayMap(6);
        arraymap.put("grant_type", "password");
        arraymap.put("client_id", clientId);
        arraymap.put("client_secret", clientSecret);
        arraymap.put("username", s);
        arraymap.put("password", s1);
        arraymap.put("scope", getScopeParam(DEFAULT_SCOPES));
        return arraymap;
    }

}
