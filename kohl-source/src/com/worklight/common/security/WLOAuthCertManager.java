// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.content.Context;
import com.worklight.common.Logger;
import com.worklight.wlclient.api.WLClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common.security:
//            WLCertManager

public class WLOAuthCertManager extends WLCertManager
{

    private static String KEYSTORE_FILENAME = ".oauthkeystore";
    private static final String PROVISIONING_ENTITY_FOR_KEYS = "WLAuthorizationManagerProvisioningEntity";
    private static final int RSA_KEY_SIZE = 512;
    private static WLOAuthCertManager instance;
    private static char keyStorePassword[] = null;

    protected WLOAuthCertManager()
    {
        super(KEYSTORE_FILENAME, keyStorePassword);
    }

    public static WLOAuthCertManager getInstance()
    {
        com/worklight/common/security/WLOAuthCertManager;
        JVM INSTR monitorenter ;
        WLOAuthCertManager wloauthcertmanager;
        if (instance == null)
        {
            instance = new WLOAuthCertManager();
            instance.init(WLClient.getInstance().getContext());
        }
        wloauthcertmanager = instance;
        com/worklight/common/security/WLOAuthCertManager;
        JVM INSTR monitorexit ;
        return wloauthcertmanager;
        Exception exception;
        exception;
        throw exception;
    }

    public String extractClientIdFromCertificate(X509Certificate x509certificate)
    {
        Object obj = null;
        String as[] = x509certificate.getSubjectDN().getName().split(Pattern.quote(","));
        int j = as.length;
        int i = 0;
        x509certificate = obj;
        for (; i < j; i++)
        {
            String s = as[i];
            if (s.contains("UID="))
            {
                x509certificate = s.substring(s.indexOf("UID=")).split(Pattern.quote("="))[1];
            }
        }

        return x509certificate;
    }

    public void generateKeyPair()
        throws NoSuchAlgorithmException
    {
        generateKeyPair(null, 512);
    }

    protected String getAlias(String s)
    {
        return "WLAuthorizationManagerProvisioningEntity";
    }

    public String getClientIdFromCertificate()
        throws Exception
    {
        Object obj;
        Object obj1;
        String s;
        java.security.cert.Certificate acertificate[];
        s = null;
        acertificate = null;
        obj1 = null;
        obj = acertificate;
        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        obj = acertificate;
        File file = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        obj = acertificate;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        obj = acertificate;
        obj1 = new FileInputStream(file);
        keystore.load(((java.io.InputStream) (obj1)), keyStorePassword);
        ((FileInputStream) (obj1)).close();
_L6:
        obj = obj1;
        acertificate = keystore.getCertificateChain(getAlias("WLAuthorizationManagerProvisioningEntity"));
        if (acertificate == null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        int i = acertificate.length;
        if (i != 0) goto _L5; else goto _L4
_L4:
        obj = s;
        if (obj1 != null)
        {
            ((FileInputStream) (obj1)).close();
            obj = s;
        }
_L8:
        return ((String) (obj));
_L2:
        obj = acertificate;
        keystore.load(null, keyStorePassword);
          goto _L6
        obj1;
_L9:
        if (obj != null)
        {
            ((FileInputStream) (obj)).close();
        }
        throw obj1;
_L5:
        obj = obj1;
        s = extractClientIdFromCertificate((X509Certificate)acertificate[0]);
        obj = s;
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        ((FileInputStream) (obj1)).close();
        return s;
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
          goto _L9
    }

    public KeyPair getKeyPair()
        throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException
    {
        return getKeyPair("WLAuthorizationManagerProvisioningEntity");
    }

    protected java.security.KeyStore.PrivateKeyEntry getPrivateKeyEntry(String s)
        throws IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, android.content.pm.PackageManager.NameNotFoundException, UnrecoverableEntryException
    {
        Object obj2;
        Object obj3;
        KeyStore keystore;
        File file;
        String s1;
        keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        file = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        s1 = getAlias(s);
        Object obj = null;
        obj2 = null;
        obj3 = null;
        s = obj3;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = obj;
        Object obj1 = new FileInputStream(file);
        keystore.load(((java.io.InputStream) (obj1)), keyStorePassword);
        s = (java.security.KeyStore.PrivateKeyEntry)keystore.getEntry(s1, new java.security.KeyStore.PasswordProtection(keyStorePassword));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        ((FileInputStream) (obj1)).close();
_L2:
        return s;
        s;
        obj1 = obj2;
        obj2 = s;
_L5:
        s = ((String) (obj1));
        logger.error((new StringBuilder()).append("Failed to determine the existence of certificate for client registration with ").append(((IOException) (obj2)).getMessage()).toString(), ((Throwable) (obj2)));
        s = obj3;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((FileInputStream) (obj1)).close();
        return null;
        obj1;
_L4:
        if (s != null)
        {
            s.close();
        }
        throw obj1;
        obj2;
        s = ((String) (obj1));
        obj1 = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
          goto _L5
        return s;
    }

    public void saveCertificate(String s)
        throws Exception
    {
        saveCertificate("WLAuthorizationManagerProvisioningEntity", s);
    }

    public String signCsr(JSONObject jsonobject)
        throws Exception
    {
        return signCsr(jsonobject, null);
    }

    public String signJWS(JSONObject jsonobject)
        throws Exception
    {
        KeyPair keypair = getKeyPair();
        if (keypair == null)
        {
            throw new Exception("Not found keypair in the keystore");
        } else
        {
            return signJWS(jsonobject, keypair);
        }
    }

    public String signJWS(JSONObject jsonobject, KeyPair keypair)
        throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, SignatureException, JSONException
    {
        return signJWS(jsonobject, (RSAPublicKey)keypair.getPublic(), keypair.getPrivate());
    }

}
