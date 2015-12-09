// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata.auth;

import com.fitbit.FitBitApplication;
import com.fitbit.util.crypt.SecureDataCoder;
import com.fitbit.util.e.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.livedata.auth:
//            TrackerAuthCredentials

public class a
{

    private static final String a = "TrackerAuthCredentialsUtils";
    private static final String b = "trackerAuthCredentials.json";
    private static final String c = "authSubKey";
    private static final String d = "btleClientAuthCredentials";
    private static final String e = "nonce";

    public a()
    {
    }

    public static TrackerAuthCredentials a(TrackerAuthCredentials.Cipher cipher)
    {
        String s;
        SecureDataCoder securedatacoder;
        s = com.fitbit.util.e.c.a(FitBitApplication.a(), "trackerAuthCredentials.json");
        securedatacoder = new SecureDataCoder();
        securedatacoder.a(FitBitApplication.a());
        String s1;
        try
        {
            s1 = SecureDataCoder.b(securedatacoder, s);
        }
        catch (com.fitbit.util.crypt.SecureDataCoder.InvalidDataException invaliddataexception)
        {
            try
            {
                com.fitbit.e.a.a("TrackerAuthCredentialsUtils", "Unable to decode credentials. Possibly they are not encoded. Try to encode it and decode again", new Object[0]);
                s = SecureDataCoder.a(securedatacoder, s);
                com.fitbit.util.e.c.a(FitBitApplication.a(), "trackerAuthCredentials.json", s);
                cipher = a(cipher);
            }
            // Misplaced declaration of an exception variable
            catch (TrackerAuthCredentials.Cipher cipher)
            {
                com.fitbit.e.a.a("TrackerAuthCredentialsUtils", "Unable to load tracker auth credentials from file", new Object[0]);
                return null;
            }
            return cipher;
        }
        return b(cipher, new JSONObject(s1));
    }

    public static void a()
    {
        try
        {
            com.fitbit.util.e.c.a(FitBitApplication.a(), "trackerAuthCredentials.json", "");
            return;
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.a("TrackerAuthCredentialsUtils", "Unable to save tracker auth credentials to file", new Object[0]);
        }
    }

    public static void a(TrackerAuthCredentials.Cipher cipher, JSONObject jsonobject)
    {
        try
        {
            cipher = new SecureDataCoder();
            cipher.a(FitBitApplication.a());
            cipher = SecureDataCoder.a(cipher, jsonobject.toString());
            com.fitbit.util.e.c.a(FitBitApplication.a(), "trackerAuthCredentials.json", cipher);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrackerAuthCredentials.Cipher cipher)
        {
            com.fitbit.e.a.a("TrackerAuthCredentialsUtils", "Unable to save tracker auth credentials to file", new Object[0]);
        }
    }

    public static TrackerAuthCredentials b(TrackerAuthCredentials.Cipher cipher, JSONObject jsonobject)
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((jsonobject = jsonobject.getJSONObject("btleClientAuthCredentials")) == null) goto _L1; else goto _L3
_L3:
        try
        {
            cipher = new TrackerAuthCredentials(cipher, jsonobject.getString("authSubKey"), jsonobject.getString("nonce"));
        }
        // Misplaced declaration of an exception variable
        catch (TrackerAuthCredentials.Cipher cipher)
        {
            com.fitbit.e.a.a("TrackerAuthCredentialsUtils", "Unable to parse credentials from json object", cipher, new Object[0]);
            cipher = null;
        }
        return cipher;
    }
}
