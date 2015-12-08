// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebView;
import com.worklight.androidgap.WLDroidGap;
import com.worklight.common.WLConfig;
import com.worklight.common.WLUtils;
import com.worklight.utils.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common.security:
//            WLProvisioningDelegate

public class WLDeviceAuthManager
{

    private static final String ALG = "alg";
    private static final String APPLICATION = "application";
    private static final String EXP = "exp";
    private static final String JPK = "jpk";
    private static final String KEYSTORE_FILENAME = ".keystore";
    private static final String MOD = "mod";
    private static final String RSA = "RSA";
    private static final String X5C = "x5c";
    private static WLDeviceAuthManager instance;
    private static char keyStorePassword[] = null;
    private Context context;
    private WLProvisioningDelegate provisioningDelegate;
    private WebView webView;

    private WLDeviceAuthManager()
    {
        provisioningDelegate = null;
    }

    private String addBasicDeviceProvisioningProperties(String s, String s1, String s2)
        throws JSONException
    {
        s = new JSONObject(s);
        s.put("realm", s2);
        s.put("deviceId", android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
        if (!s1.equals("application")) goto _L2; else goto _L1
_L1:
        s1 = (WLDroidGap)context;
        s.put("applicationId", WLDroidGap.getWLConfig().getAppId());
_L4:
        return s.toString();
_L2:
        if (s1.startsWith("group:"))
        {
            s.put("groupId", s1.substring(s1.indexOf(":") + 1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String getAlias(String s)
    {
        Object obj = s;
        if (s.equals("application"))
        {
            s = new StringBuilder("app:");
            obj = (WLDroidGap)context;
            obj = s.append(WLDroidGap.getWLConfig().getAppId()).toString();
        }
        return ((String) (obj));
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

    private byte[] signData(String s, PrivateKey privatekey)
        throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException
    {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privatekey);
        signature.update(s.getBytes());
        return signature.sign();
    }

    public String addDeviceIdAndAppId(WLConfig wlconfig, String s)
        throws JSONException
    {
        s = new JSONObject(s);
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject.put("id", wlconfig.getAppId());
        jsonobject.put("version", wlconfig.getApplicationVersion());
        jsonobject1.put("id", android.provider.Settings.Secure.getString(((WLDroidGap)context).getContentResolver(), "android_id"));
        jsonobject1.put("os", android.os.Build.VERSION.RELEASE);
        jsonobject1.put("model", Build.MODEL);
        jsonobject1.put("environment", "Android");
        s.put("app", jsonobject);
        s.put("device", jsonobject1);
        return s.toString();
    }

    public boolean createCSR(String s, String s1, String s2)
        throws JSONException
    {
        if (provisioningDelegate != null)
        {
            s = addBasicDeviceProvisioningProperties(s, s1, s2);
            provisioningDelegate.sendCSR(s, context);
            return true;
        } else
        {
            return false;
        }
    }

    public String createCsrHeader(KeyPair keypair, String s)
        throws Exception
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("alg", "RS256");
        JSONObject jsonobject1 = new JSONObject();
        RSAPublicKey rsapublickey = (RSAPublicKey)keypair.getPublic();
        jsonobject1.put("alg", "RSA");
        jsonobject1.put("mod", Base64.encodeUrlSafe(rsapublickey.getModulus().toByteArray(), "UTF-8"));
        jsonobject1.put("exp", Base64.encodeUrlSafe(rsapublickey.getPublicExponent().toByteArray(), "UTF-8"));
        jsonobject.put("jpk", jsonobject1);
        s = (new StringBuilder(String.valueOf(Base64.encodeUrlSafe(jsonobject.toString().getBytes(), "UTF-8")))).append(".").append(Base64.encodeUrlSafe(s.getBytes(), "UTF-8")).toString();
        keypair = Base64.encodeUrlSafe(signCSR(s, keypair.getPrivate()), "UTF-8");
        return (new StringBuilder(String.valueOf(s))).append(".").append(keypair).toString();
    }

    public String createDeviceAuthHeader(String s, String s1, boolean flag)
        throws Exception
    {
        if (flag && isCertificateExists(s1))
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("alg", "RS256");
            s1 = getPrivateKeyEntry(s1);
            jsonobject.put("x5c", Base64.encodeUrlSafe(s1.getCertificate().getEncoded(), "UTF-8"));
            s = (new StringBuilder(String.valueOf(Base64.encodeUrlSafe(jsonobject.toString().getBytes(), "UTF-8")))).append(".").append(Base64.encodeUrlSafe(s.getBytes(), "UTF-8")).toString();
            s1 = Base64.encodeUrlSafe(signData(s, s1.getPrivateKey()), "UTF-8");
            return (new StringBuilder(String.valueOf(s))).append(".").append(s1).toString();
        } else
        {
            return s;
        }
    }

    public void csrCertificateRecieveFailed(String s)
    {
        WLUtils.error(s);
        ((WLDroidGap)context).runOnUiThread(new Runnable() {

            final WLDeviceAuthManager this$0;

            public void run()
            {
                webView.loadUrl("javascript:WL.DiagnosticDialog.showDialog(WL.ClientMessages.wlclientInitFailure, WL.ClientMessages.deviceAuthenticationFail, false, false);");
            }

            
            {
                this$0 = WLDeviceAuthManager.this;
                super();
            }
        });
    }

    public KeyPair generateKeyPair()
        throws NoSuchAlgorithmException
    {
        KeyPairGenerator keypairgenerator = KeyPairGenerator.getInstance("RSA");
        keypairgenerator.initialize(512);
        return keypairgenerator.genKeyPair();
    }

    protected java.security.KeyStore.PrivateKeyEntry getPrivateKeyEntry(String s)
        throws IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, android.content.pm.PackageManager.NameNotFoundException, UnrecoverableEntryException
    {
        Object obj;
        Object obj2;
        KeyStore keystore;
        File file;
        String s1;
        keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        file = new File((new StringBuilder(String.valueOf(context.getFilesDir().getAbsolutePath()))).append("/").append(".keystore").toString());
        s1 = getAlias(s);
        obj = null;
        obj2 = null;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        Object obj1 = new FileInputStream(file);
        keystore.load(((java.io.InputStream) (obj1)), keyStorePassword);
        obj = (java.security.KeyStore.PrivateKeyEntry)keystore.getEntry(s1, new java.security.KeyStore.PasswordProtection(keyStorePassword));
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (obj1 != null)
        {
            ((FileInputStream) (obj1)).close();
        }
        s = ((String) (obj));
_L13:
        return s;
_L4:
        Object obj3;
        Exception exception;
        Object obj4;
        String as[];
        KeyStore keystore1;
        int i;
        boolean flag;
        try
        {
            flag = "application".equalsIgnoreCase(s);
            break MISSING_BLOCK_LABEL_135;
        }
        catch (IOException ioexception)
        {
            s = ((String) (obj1));
            obj1 = ioexception;
        }
        finally
        {
            obj = obj1;
        }
          goto _L5
        obj1;
        s = ((String) (obj2));
_L5:
        obj = s;
        WLUtils.error("failed getting any certificate from app local keystore", ((Throwable) (obj1)));
        if (s != null)
        {
            s.close();
        }
_L7:
        as = context.getPackageManager().getPackagesForUid(context.getApplicationInfo().uid);
        keystore1 = KeyStore.getInstance(KeyStore.getDefaultType());
        j = as.length;
        i = 0;
_L12:
        if (i >= j)
        {
            return null;
        }
        s = as[i];
        s = new File((new StringBuilder(String.valueOf(context.createPackageContext(s, 0).getFilesDir().getAbsolutePath()))).append("/").append(".keystore").toString());
        obj = null;
        obj4 = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
          goto _L6
        s;
        if (obj != null)
        {
            ((FileInputStream) (obj)).close();
        }
        throw s;
        int j;
        if (flag)
        {
            if (obj1 != null)
            {
                ((FileInputStream) (obj1)).close();
            }
            return null;
        }
        if (obj1 != null)
        {
            ((FileInputStream) (obj1)).close();
        }
          goto _L7
_L2:
        if ("application".equalsIgnoreCase(s))
        {
            return null;
        }
        keystore.load(null, keyStorePassword);
          goto _L7
_L6:
        if (!s.exists()) goto _L9; else goto _L8
_L8:
        s = new FileInputStream(s);
        keystore1.load(s, keyStorePassword);
        obj1 = (java.security.KeyStore.PrivateKeyEntry)keystore1.getEntry(s1, new java.security.KeyStore.PasswordProtection(keyStorePassword));
        if (obj1 != null) goto _L11; else goto _L10
_L10:
        s.close();
        if (s != null)
        {
            s.close();
        }
        if (false)
        {
            throw new NullPointerException();
        }
_L9:
        i++;
          goto _L12
_L11:
        obj = new FileOutputStream(file);
        keystore.setKeyEntry(s1, ((java.security.KeyStore.PrivateKeyEntry) (obj1)).getPrivateKey(), keyStorePassword, ((java.security.KeyStore.PrivateKeyEntry) (obj1)).getCertificateChain());
        keystore.store(((java.io.OutputStream) (obj)), keyStorePassword);
        ((FileOutputStream) (obj)).close();
        s.close();
        if (s != null)
        {
            s.close();
        }
        s = ((String) (obj1));
        if (obj != null)
        {
            ((FileOutputStream) (obj)).close();
            return ((java.security.KeyStore.PrivateKeyEntry) (obj1));
        }
          goto _L13
        obj2;
        s = obj4;
_L16:
        obj = s;
        obj1 = obj3;
        WLUtils.error("failed copying certificate to application keystore", ((Throwable) (obj2)));
        if (s != null)
        {
            s.close();
        }
        if (obj3 != null)
        {
            ((FileOutputStream) (obj3)).close();
        }
          goto _L9
        s;
_L15:
        if (obj != null)
        {
            ((FileInputStream) (obj)).close();
        }
        if (obj1 != null)
        {
            ((FileOutputStream) (obj1)).close();
        }
        throw s;
        exception;
        obj = s;
        obj1 = obj2;
        s = exception;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj1 = obj;
        obj = s;
        s = ((String) (obj2));
        if (true) goto _L15; else goto _L14
_L14:
        obj2;
          goto _L16
        obj2;
        exception = ((Exception) (obj));
          goto _L16
    }

    public void init(Activity activity, WebView webview)
    {
        webView = webview;
        context = activity;
    }

    public boolean isCertificateExists(String s)
    {
        boolean flag = false;
        if (context == null)
        {
            return false;
        }
        try
        {
            s = getPrivateKeyEntry(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLUtils.error("Error checking if certificate exists", s);
            return false;
        }
        if (s != null)
        {
            flag = true;
        }
        return flag;
    }

    public void saveCertificate(String s, KeyPair keypair, Certificate certificate)
        throws Exception
    {
        FileInputStream fileinputstream;
        FileInputStream fileinputstream1;
        Object obj;
        FileInputStream fileinputstream2;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        KeyStore keystore;
        File file;
        if (isCertificateExists(s))
        {
            throw new Exception("Error - Got a new Certificate, but an older one already exists, exiting process");
        }
        keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        file = new File((new StringBuilder(String.valueOf(context.getFilesDir().getAbsolutePath()))).append("/").append(".keystore").toString());
        obj4 = null;
        obj5 = null;
        fileinputstream = null;
        obj3 = null;
        obj2 = null;
        obj1 = null;
        fileinputstream2 = obj4;
        fileinputstream1 = obj5;
        obj = obj3;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        fileinputstream2 = obj4;
        fileinputstream1 = obj5;
        obj = obj3;
        fileinputstream = new FileInputStream(file);
        keystore.load(fileinputstream, keyStorePassword);
        fileinputstream.close();
_L3:
        fileinputstream2 = fileinputstream;
        fileinputstream1 = fileinputstream;
        obj = obj3;
        keystore.setKeyEntry(getAlias(s), keypair.getPrivate(), keyStorePassword, new Certificate[] {
            certificate
        });
        fileinputstream2 = fileinputstream;
        fileinputstream1 = fileinputstream;
        obj = obj3;
        s = new FileOutputStream(file);
        keystore.store(s, keyStorePassword);
        ((WLDroidGap)context).runOnUiThread(new Runnable() {

            final WLDeviceAuthManager this$0;

            public void run()
            {
                webView.loadUrl("javascript:WL.DeviceAuth.__sendDeviceAuthentication()");
            }

            
            {
                this$0 = WLDeviceAuthManager.this;
                super();
            }
        });
        if (s != null)
        {
            s.close();
        }
        if (fileinputstream != null)
        {
            fileinputstream.close();
        }
_L5:
        return;
_L2:
        fileinputstream2 = obj4;
        fileinputstream1 = obj5;
        obj = obj3;
        keystore.load(null, keyStorePassword);
          goto _L3
        s;
        keypair = obj1;
        fileinputstream = fileinputstream2;
_L8:
        fileinputstream1 = fileinputstream;
        obj = keypair;
        WLUtils.error("Error saving certificate", s);
        if (keypair != null)
        {
            keypair.close();
        }
        if (fileinputstream == null) goto _L5; else goto _L4
_L4:
        fileinputstream.close();
        return;
        s;
        fileinputstream = fileinputstream1;
_L7:
        if (obj != null)
        {
            ((FileOutputStream) (obj)).close();
        }
        if (fileinputstream != null)
        {
            fileinputstream.close();
        }
        throw s;
        s;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        keypair;
        obj = s;
        s = keypair;
        if (true) goto _L7; else goto _L6
_L6:
        s;
        keypair = obj1;
          goto _L8
        certificate;
        keypair = s;
        s = certificate;
          goto _L8
    }

    public void setProvisioningDelegate(WLProvisioningDelegate wlprovisioningdelegate)
    {
        provisioningDelegate = wlprovisioningdelegate;
    }

    public byte[] signCSR(String s, PrivateKey privatekey)
        throws NoSuchAlgorithmException, InvalidKeyException, SignatureException
    {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privatekey);
        signature.update(s.getBytes());
        return signature.sign();
    }


}
