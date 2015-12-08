// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.security.SCPluginWrapper;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class mA
{

    private static final String ARXAN_TEST = "ARXAN";
    private static final String ENABLE_ARXAN = "ENABLE_ARXAN";
    private static final String PATTERN = "0001110111101110001111010101111011010001001110011000110001000110";
    private static final String SECRET = "iEk21fuwZApXlz93750dmW22pw389dPwOk";
    private static final String STATIC_TOKEN = "m198sOkJEn37DjqZ32lpRu76xmw288xSQ9";
    private static final String TAG = "RequestAuthorization";

    public static String a(String s)
    {
        String s1 = a(Bt.R(), s);
        s = s1;
        if (Bm.a().a("ARXAN", "ENABLE_ARXAN", true))
        {
            s = SCPluginWrapper.generateNewToken(s1);
        }
        return s;
        s;
_L2:
        Timber.a("RequestAuthorization", s);
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String a(String s, String s1)
    {
        s = (new StringBuilder("iEk21fuwZApXlz93750dmW22pw389dPwOk")).append(s).toString();
        String s2 = (new StringBuilder()).append(s1).append("iEk21fuwZApXlz93750dmW22pw389dPwOk").toString();
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
        messagedigest.update(s.getBytes("UTF-8"));
        s1 = a(messagedigest.digest());
        messagedigest.update(s2.getBytes("UTF-8"));
        s2 = a(messagedigest.digest());
        s = "";
        int i = 0;
        while (i < 64) 
        {
            char c1 = "0001110111101110001111010101111011010001001110011000110001000110".charAt(i);
            s = (new StringBuilder()).append(s);
            char c;
            if (c1 == '0')
            {
                c = s1.charAt(i);
            } else
            {
                c = s2.charAt(i);
            }
            s = s.append(c).toString();
            i++;
        }
        return s;
    }

    private static String a(byte abyte0[])
    {
        return String.format("%064x", new Object[] {
            new BigInteger(1, abyte0)
        });
    }

    public static String b(String s)
    {
        s = a("m198sOkJEn37DjqZ32lpRu76xmw288xSQ9", s);
        return s;
        s;
_L2:
        Timber.a("RequestAuthorization", s);
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
