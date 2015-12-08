// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.utils.Base64;
import com.worklight.wlclient.HttpClientManager;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common.security:
//            WLCertManager

public class WLUserAuthManager extends WLCertManager
{

    private static final String CERTIFICATE_ALIAS = "com.worklight.userenrollment.certificate";
    public static final int DEFAULT_RSA_KEY_SIZE = 2048;
    private static String KEYSTORE_FILENAME = ".x509Keystore";
    private static final String PROVISIONING_ENTITY = "";
    private static WLUserAuthManager instance;
    private static char keyStorePassword[] = "worklight".toCharArray();
    private static Logger logger = Logger.getInstance("wl.userAuthManager");

    private WLUserAuthManager()
    {
        super(KEYSTORE_FILENAME, keyStorePassword);
    }

    private Map getCSRAttributesOIDMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("challengepassword", PKCSObjectIdentifiers.pkcs_9_at_challengePassword);
        hashmap.put("contenttype", PKCSObjectIdentifiers.pkcs_9_at_contentType);
        hashmap.put("countersignature", PKCSObjectIdentifiers.pkcs_9_at_counterSignature);
        hashmap.put("emailaddress", PKCSObjectIdentifiers.pkcs_9_at_emailAddress);
        hashmap.put("extendedcertificateattributes", PKCSObjectIdentifiers.pkcs_9_at_extendedCertificateAttributes);
        hashmap.put("extensionrequest", PKCSObjectIdentifiers.pkcs_9_at_extensionRequest);
        hashmap.put("friendlyname", PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
        hashmap.put("localkeyid", PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
        hashmap.put("messagedigest", PKCSObjectIdentifiers.pkcs_9_at_messageDigest);
        hashmap.put("signingdescription", PKCSObjectIdentifiers.pkcs_9_at_signingDescription);
        hashmap.put("signingdime", PKCSObjectIdentifiers.pkcs_9_at_signingTime);
        hashmap.put("smimecapabilities", PKCSObjectIdentifiers.pkcs_9_at_smimeCapabilities);
        hashmap.put("unstructuredaddress", PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress);
        hashmap.put("unstructuredname", PKCSObjectIdentifiers.pkcs_9_at_unstructuredName);
        return hashmap;
    }

    private KeyStore getCertificateKeyStore()
        throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException
    {
        KeyStore keystore = loadKeyStore();
        KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm()).init(keystore, keyStorePassword);
        return keystore;
    }

    public static WLUserAuthManager getInstance()
    {
        com/worklight/common/security/WLUserAuthManager;
        JVM INSTR monitorenter ;
        WLUserAuthManager wluserauthmanager;
        if (instance == null)
        {
            instance = new WLUserAuthManager();
        }
        wluserauthmanager = instance;
        com/worklight/common/security/WLUserAuthManager;
        JVM INSTR monitorexit ;
        return wluserauthmanager;
        Exception exception;
        exception;
        throw exception;
    }

    private KeyStore loadKeyStore()
        throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException
    {
        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        File file = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        if (file.exists())
        {
            keystore.load(new FileInputStream(file), keyStorePassword);
            return keystore;
        } else
        {
            return null;
        }
    }

    public JSONObject authenticateToTheServerWithCertificate()
        throws Throwable
    {
        return authenticateToTheServerWithCertificate(null, null);
    }

    public JSONObject authenticateToTheServerWithCertificate(WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions)
        throws Throwable
    {
        logger.debug("Establishing SSL connection with the server using the user certificate from the user certificate realm.");
        JSONObject jsonobject = new JSONObject();
        Object obj;
        try
        {
            HttpClientManager.setSSLSocketFactory(getCertificateKeyStore(), keyStorePassword);
            obj = WLConfig.getInstance().readWLPref("WL-Instance-Id");
            if (!WLUtils.isStringEmpty(((String) (obj))))
            {
                WLClient.getInstance().addGlobalHeader("WL-Instance-Id", ((String) (obj)));
            }
            obj = new WLRequestOptions();
        }
        // Misplaced declaration of an exception variable
        catch (WLRequestListener wlrequestlistener)
        {
            logger.warn((new StringBuilder()).append(wlrequestlistener.getClass()).append(" : ").append(wlrequestlistener.getMessage()).toString());
            return jsonobject;
        }
        // Misplaced declaration of an exception variable
        catch (WLRequestListener wlrequestlistener)
        {
            logger.error("Exception while authenticating with user certificate.", wlrequestlistener);
            throw wlrequestlistener;
        }
        if (wlrequestoptions != null)
        {
            obj = wlrequestoptions;
        }
        if (wlrequestlistener != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        wlrequestlistener = new WLRequestListener() {

            final WLUserAuthManager this$0;

            public void onFailure(WLFailResponse wlfailresponse)
            {
            }

            public void onSuccess(WLResponse wlresponse)
            {
            }

            
            {
                this$0 = WLUserAuthManager.this;
                super();
            }
        };
        (new WLRequest(wlrequestlistener, ((WLRequestOptions) (obj)), WLConfig.getInstance(), context)).makeRequest("sslclientauth");
        return jsonobject;
    }

    public void clearKeystore()
        throws KeyStoreException
    {
        clearKeystore("");
    }

    public String createSignedCSR(JSONObject jsonobject)
        throws Exception
    {
        return createSignedCSR(jsonobject, "");
    }

    public String createSignedCSR(JSONObject jsonobject, String s)
        throws Exception
    {
        JSONObject jsonobject2 = jsonobject.getJSONObject("subject");
        JSONObject jsonobject1 = jsonobject.optJSONObject("attributes");
        Iterator iterator1 = jsonobject2.keys();
        jsonobject = "";
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            String s1 = (String)iterator1.next();
            s1 = (new StringBuilder()).append(jsonobject).append(s1).append("=").append(jsonobject2.getString(s1)).toString();
            jsonobject = s1;
            if (iterator1.hasNext())
            {
                jsonobject = (new StringBuilder()).append(s1).append(",").toString();
            }
        } while (true);
        Object obj = null;
        if (jsonobject1 != null)
        {
            obj = getCSRAttributesOIDMap();
            Iterator iterator = jsonobject1.keys();
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                if (s2 != null)
                {
                    Object obj1 = jsonobject1.getString(s2);
                    try
                    {
                        DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)((Map) (obj)).get(s2.toLowerCase());
                        obj1 = new DERPrintableString(((String) (obj1)));
                        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
                        ASN1EncodableVector asn1encodablevector2 = new ASN1EncodableVector();
                        asn1encodablevector1.add(derobjectidentifier);
                        asn1encodablevector2.add(((org.bouncycastle.asn1.ASN1Encodable) (obj1)));
                        asn1encodablevector1.add(new DERSet(asn1encodablevector2));
                        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
                    }
                    catch (Throwable throwable)
                    {
                        logger.error((new StringBuilder()).append("There was a problem adding attribute ").append(s2).append("to the CSR.").toString(), throwable);
                    }
                }
            } while (true);
            obj = new DERSet(asn1encodablevector);
        }
        s = getAlias(s);
        s = (KeyPair)keyPairHash.get(s);
        return Base64.encode((new PKCS10CertificationRequest("SHA1withRSA", new X500Principal(jsonobject), s.getPublic(), ((org.bouncycastle.asn1.ASN1Set) (obj)), s.getPrivate())).getEncoded(), "UTF-8");
    }

    public boolean doesValidCertificateExist()
    {
        java.security.KeyStore.PrivateKeyEntry privatekeyentry;
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        try
        {
            privatekeyentry = getPrivateKeyEntry("");
        }
        catch (Exception exception)
        {
            logger.error((new StringBuilder()).append("Failed to determine the existence of certificate for device authentication with ").append(exception.getMessage()).toString(), exception);
            return false;
        }
        if (privatekeyentry != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag1 = true;
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        ((X509Certificate)privatekeyentry.getCertificate()).checkValidity();
        flag = flag1;
_L2:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        removeEntityKeyStoreValues("");
        logger.trace("doesValidCertificateExists = false (Certificate not yet valid or expired)");
        return false;
        obj;
        logger.error((new StringBuilder()).append("Certificate is not yet valid: ").append(((CertificateNotYetValidException) (obj)).getMessage()).toString());
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        logger.error((new StringBuilder()).append("Certificate has expired: ").append(((CertificateExpiredException) (obj)).getMessage()).toString());
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        logger.trace((new StringBuilder()).append("doesValidCertificateExists = ").append(flag2).toString());
        return flag2;
    }

    public KeyPair generateKeyPair(int i)
        throws NoSuchAlgorithmException
    {
        return generateKeyPair("", i);
    }

    protected String getAlias(String s)
    {
        WLConfig.createInstance(context);
        if (WLConfig.getInstance().isShareUserCert())
        {
            logger.debug("Using group support alias for user certificate authentication realm.");
            return (new StringBuilder()).append("com.worklight.userenrollment.certificate:").append(context.getApplicationInfo().uid).toString();
        } else
        {
            return (new StringBuilder()).append("com.worklight.userenrollment.certificate:").append(context.getPackageName()).toString();
        }
    }

    public void saveCertificate(String s, String s1)
        throws Exception
    {
        logger.debug("Saving certificate for user certificate authentication realm...");
        saveCertificate("", s, s1);
        logger.debug("Certificate saved for user certificate authentication realm.");
    }

}
