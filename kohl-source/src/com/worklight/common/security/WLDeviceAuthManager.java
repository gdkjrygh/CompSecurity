// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.worklight.common.WLConfig;
import com.worklight.utils.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common.security:
//            WLCertManager

public class WLDeviceAuthManager extends WLCertManager
{

    private static String KEYSTORE_FILENAME = ".keystore";
    private static WLDeviceAuthManager instance;
    private static char keyStorePassword[] = null;
    private String deviceUuid;

    protected WLDeviceAuthManager()
    {
        super(KEYSTORE_FILENAME, keyStorePassword);
    }

    public static WLDeviceAuthManager getInstance()
    {
        com/worklight/common/security/WLDeviceAuthManager;
        JVM INSTR monitorenter ;
        WLDeviceAuthManager wldeviceauthmanager;
        if (instance == null)
        {
            instance = new WLDeviceAuthManager();
        }
        wldeviceauthmanager = instance;
        com/worklight/common/security/WLDeviceAuthManager;
        JVM INSTR monitorexit ;
        return wldeviceauthmanager;
        Exception exception;
        exception;
        throw exception;
    }

    protected String getAlias(String s)
    {
        String s1 = s;
        if (s.equals("application"))
        {
            s1 = (new StringBuilder()).append("app:").append(WLConfig.getInstance().getAppId()).toString();
        }
        return s1;
    }

    public String getDeviceUUID(Context context)
    {
        if (deviceUuid == null)
        {
            String s = null;
            if (context.getPackageManager().hasSystemFeature("android.hardware.wifi"))
            {
                s = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            }
            String s1 = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            context = s1;
            if (s != null)
            {
                context = (new StringBuilder()).append(s1).append(s).toString();
            }
            deviceUuid = UUID.nameUUIDFromBytes(context.getBytes()).toString();
        }
        return deviceUuid;
    }

    public String signDeviceAuth(String s, String s1, boolean flag)
        throws Exception
    {
        if (flag && isCertificateExists(s1))
        {
            Object obj = new JSONObject();
            ((JSONObject) (obj)).put("alg", "RS256");
            s1 = getPrivateKeyEntry(s1);
            ((JSONObject) (obj)).put("x5c", Base64.encodeUrlSafe(s1.getCertificate().getEncoded(), "UTF-8"));
            obj = ((JSONObject) (obj)).toString();
            s = (new StringBuilder()).append(Base64.encodeUrlSafe(((String) (obj)).getBytes(), "UTF-8")).append(".").append(Base64.encodeUrlSafe(s.getBytes(), "UTF-8")).toString();
            s1 = Base64.encodeUrlSafe(signData(s, s1.getPrivateKey()), "UTF-8");
            return (new StringBuilder()).append(s).append(".").append(s1).toString();
        } else
        {
            return s;
        }
    }

    public String signJWS(JSONObject jsonobject, KeyPair keypair)
        throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, SignatureException, JSONException
    {
        return signJWS(jsonobject, (RSAPublicKey)keypair.getPublic(), keypair.getPrivate());
    }

}
