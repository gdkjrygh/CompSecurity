// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.util.Log;
import java.security.SignatureException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.aetn.history.android.historyhere.utils:
//            Base64, Utils

public class Signing
{

    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
    private static final String TAG = "Signing";

    public Signing()
    {
    }

    public static String EncodeBase64(byte abyte0[])
    {
        return Base64.encodeBytes(abyte0);
    }

    public static String calculateRFC2104HMAC(String s, String s1)
        throws SignatureException
    {
        try
        {
            s1 = new SecretKeySpec(s1.getBytes(), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(s1);
            s = EncodeBase64(mac.doFinal(s.getBytes()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SignatureException((new StringBuilder()).append("Failed to generate HMAC : ").append(s.getMessage()).toString());
        }
        return s;
    }

    public static String signRequestForPOIDataDump(String s, String s1, String s2, String s3, int i)
    {
        String s4;
        s4 = (new StringBuilder()).append(s1).append("timestamp=").append(i).append("&client=").append(s2).toString();
        s2 = (new StringBuilder()).append(s4).append(s3).toString();
        s1 = "";
        s2 = calculateRFC2104HMAC(s2, s3);
        s1 = s2;
        Utils.logger("Signing", (new StringBuilder()).append("-----Signature.calculateRFC2104HMAC(): ").append(s2).toString());
        s1 = s2;
_L2:
        s1 = s1.replace('+', '.').replace('/', '_').replace('=', '-');
        return (new StringBuilder()).append(s).append(s4).append("&signature=").append(s1).toString();
        s2;
        Log.d("Signing.signRequestForPOIWebService(): ", "could not get the signature");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String signRequestForPOIWebService(String s, String s1, String s2, String s3, int i)
    {
        String s4;
        s4 = (new StringBuilder()).append(s1).append("&timestamp=").append(i).append("&client=").append(s2).toString();
        s2 = (new StringBuilder()).append(s4).append(s3).toString();
        s1 = "";
        s2 = calculateRFC2104HMAC(s2, s3);
        s1 = s2;
        Utils.logger("Signing", (new StringBuilder()).append("-----Signature.calculateRFC2104HMAC(): ").append(s2).toString());
        s1 = s2;
_L2:
        s1 = s1.replace('+', '.').replace('/', '_').replace('=', '-');
        return (new StringBuilder()).append(s).append(s4).append("&signature=").append(s1).toString();
        s2;
        Log.d("Signing.signRequestForPOIWebService(): ", "could not get the signature");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String signRequestForSuggestAPlaceService(String s, String s1, String s2, String s3, int i)
    {
        String s4;
        s4 = (new StringBuilder()).append(s1).append("timestamp=").append(i).append("&client=").append(s2).toString();
        s2 = (new StringBuilder()).append(s4).append(s3).toString();
        s1 = "";
        s2 = calculateRFC2104HMAC(s2, s3);
        s1 = s2;
        Utils.logger("Signing", (new StringBuilder()).append("-----Signature.calculateRFC2104HMAC(): ").append(s2).toString());
        s1 = s2;
_L2:
        s1 = s1.replace('+', '.').replace('/', '_').replace('=', '-');
        return (new StringBuilder()).append(s).append(s4).append("&signature=").append(s1).toString();
        s2;
        Log.d("Signing.signRequestForPOIWebService(): ", "could not get the signature");
        if (true) goto _L2; else goto _L1
_L1:
    }
}
