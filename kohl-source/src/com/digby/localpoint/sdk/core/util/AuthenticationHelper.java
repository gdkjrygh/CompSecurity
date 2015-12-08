// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;

// Referenced classes of package com.digby.localpoint.sdk.core.util:
//            CommonsHex

public class AuthenticationHelper
{

    public static final String AUTHENTICATION_VERSION = "1.0";
    public static final String ENCODED_FORMAT = "LocalpointAuth %s";
    public static final String UNENCODED_FORMAT = "lpauth_user_id=%s,lpauth_user_type=%s,lpauth_signature=%s,lpauth_timestamp=%d,lpauth_version=%s";
    public static final String USER_TYPE = "SDK";
    private String appId;
    private String brandCode;

    public AuthenticationHelper(String s, String s1)
    {
        appId = "";
        brandCode = "";
        appId = s;
        brandCode = s1;
    }

    private String encodeBase64String(byte abyte0[])
    {
        return StringUtils.newStringUtf8(Base64.encodeBase64(abyte0, false));
    }

    static String generateSignature(String s, long l, String s1, String s2, String s3, String s4, String s5)
        throws UnsupportedEncodingException
    {
        if (s4 == null)
        {
            s4 = "";
        }
        if (s5 == null)
        {
            s5 = "";
        }
        return CommonsHex.encodeHexString(DigestUtils.sha256(URLEncoder.encode(String.format("%s%d%s%s%s%s%s", new Object[] {
            s, Long.valueOf(l), s1, s2, s3, s4, s5
        }), "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~")));
    }

    public String generateAuthHeaderValue(String s, String s1, String s2)
    {
        long l = (new Date()).getTime();
        try
        {
            s = generateSignature(appId, l, brandCode, "SDK", s, s1, s2);
            s = String.format("LocalpointAuth %s", new Object[] {
                encodeBase64String(String.format("lpauth_user_id=%s,lpauth_user_type=%s,lpauth_signature=%s,lpauth_timestamp=%d,lpauth_version=%s", new Object[] {
                    brandCode, "SDK", s, Long.valueOf(l), "1.0"
                }).getBytes("UTF-8"))
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("DigbyLibrary", Arrays.toString(s.getStackTrace()));
            return null;
        }
        return s;
    }
}
