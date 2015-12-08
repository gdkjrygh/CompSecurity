// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.worklight.common.Logger;
import com.worklight.utils.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
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
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class WLCertManager
{

    protected static final String ALG = "alg";
    private static final String APPLICATION = "application";
    protected static final String EXP = "exp";
    protected static final String JPK = "jpk";
    protected static final String MOD = "mod";
    protected static final String RSA = "RSA";
    protected static final String X5C = "x5c";
    protected static Logger logger = Logger.getInstance("wl.certManager");
    private String KEYSTORE_FILENAME;
    protected Context context;
    protected HashMap keyPairHash;
    private char keyStorePassword[];

    protected WLCertManager(String s, char ac[])
    {
        keyPairHash = new HashMap();
        KEYSTORE_FILENAME = s;
        keyStorePassword = ac;
    }

    private KeyStore loadKeystore()
        throws KeyStoreException
    {
        KeyStore keystore;
        Object obj1;
        keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        obj1 = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        if (!((File) (obj1)).exists())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj1 = new FileInputStream(((File) (obj1)));
        keystore.load(((InputStream) (obj1)), keyStorePassword);
        return keystore;
        Object obj;
        obj;
_L6:
        throw new Error(((Throwable) (obj)));
        obj;
_L4:
        throw new Error(((Throwable) (obj)));
        obj;
_L2:
        throw new Error(((Throwable) (obj)));
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private byte[] signCsrData(String s, PrivateKey privatekey)
        throws NoSuchAlgorithmException, InvalidKeyException, SignatureException
    {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privatekey);
        signature.update(s.getBytes());
        return signature.sign();
    }

    public void clearKeystore(String s)
        throws KeyStoreException
    {
        Object obj;
        Object obj1;
        String s1;
        Object obj2;
        String s2;
        Object obj3;
        String s3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        KeyStore keystore;
        File file;
        keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        file = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        obj7 = null;
        obj8 = null;
        obj = null;
        obj3 = null;
        s3 = null;
        obj4 = null;
        obj6 = null;
        obj5 = null;
        obj2 = obj7;
        s2 = obj3;
        obj1 = obj8;
        s1 = obj4;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        obj2 = obj7;
        s2 = obj3;
        obj1 = obj8;
        s1 = obj4;
        obj = new FileInputStream(file);
        keystore.load(((InputStream) (obj)), keyStorePassword);
        ((FileInputStream) (obj)).close();
_L3:
        obj2 = obj;
        s2 = obj3;
        obj1 = obj;
        s1 = obj4;
        s3 = getAlias(s);
        s = obj5;
        obj2 = obj;
        s2 = obj3;
        obj1 = obj;
        s1 = obj4;
        if (!keystore.containsAlias(s3))
        {
            break MISSING_BLOCK_LABEL_236;
        }
        obj2 = obj;
        s2 = obj3;
        obj1 = obj;
        s1 = obj4;
        keystore.deleteEntry(s3);
        obj2 = obj;
        s2 = obj3;
        obj1 = obj;
        s1 = obj4;
        s = new FileOutputStream(file);
        keystore.store(s, keyStorePassword);
        obj2 = obj;
        s2 = s;
        obj1 = obj;
        s1 = s;
        logger.debug("Key store cleared.");
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                logger.error((new StringBuilder()).append(s.getClass()).append(": ").append(s.getMessage()).toString(), s);
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        ((FileInputStream) (obj)).close();
_L4:
        return;
_L2:
        obj2 = obj7;
        s2 = obj3;
        obj1 = obj8;
        s1 = obj4;
        keystore.load(null, keyStorePassword);
          goto _L3
        obj1;
        s = s2;
        obj = obj2;
        obj2 = obj1;
_L7:
        obj1 = obj;
        s1 = s;
        logger.error((new StringBuilder()).append("Error deleting the keystore containing the certificate ").append(((Exception) (obj2)).getMessage()).toString(), ((Throwable) (obj2)));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                logger.error((new StringBuilder()).append(s.getClass()).append(": ").append(s.getMessage()).toString(), s);
            }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                logger.error((new StringBuilder()).append(s.getClass()).append(": ").append(s.getMessage()).toString(), s);
            }
            return;
        }
          goto _L4
        s;
        logger.error((new StringBuilder()).append(s.getClass()).append(": ").append(s.getMessage()).toString(), s);
        return;
        s;
        obj = obj1;
_L6:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            catch (IOException ioexception1)
            {
                logger.error((new StringBuilder()).append(ioexception1.getClass()).append(": ").append(ioexception1.getMessage()).toString(), ioexception1);
            }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                logger.error((new StringBuilder()).append(ioexception.getClass()).append(": ").append(ioexception.getMessage()).toString(), ioexception);
            }
        }
        throw s;
        s;
        s1 = obj6;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        s1 = s;
        s = exception;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        s = s3;
          goto _L7
        obj2;
          goto _L7
    }

    public KeyPair generateKeyPair(String s, int i)
        throws NoSuchAlgorithmException
    {
        Object obj = KeyPairGenerator.getInstance("RSA");
        ((KeyPairGenerator) (obj)).initialize(i);
        obj = ((KeyPairGenerator) (obj)).genKeyPair();
        keyPairHash.put(getAlias(s), obj);
        return ((KeyPair) (obj));
    }

    protected abstract String getAlias(String s);

    public KeyPair getKeyPair(String s)
        throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException
    {
        s = getAlias(s);
        if ((KeyPair)keyPairHash.get(s) == null)
        {
            Object obj = loadKeystore();
            java.security.KeyStore.PrivateKeyEntry privatekeyentry = (java.security.KeyStore.PrivateKeyEntry)((KeyStore) (obj)).getEntry(s, new java.security.KeyStore.PasswordProtection(keyStorePassword));
            if (privatekeyentry == null)
            {
                return null;
            }
            obj = new KeyPair(((KeyStore) (obj)).getCertificate(s).getPublicKey(), privatekeyentry.getPrivateKey());
            keyPairHash.put(s, obj);
        }
        return (KeyPair)keyPairHash.get(s);
    }

    protected java.security.KeyStore.PrivateKeyEntry getPrivateKeyEntry(String s)
        throws IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, android.content.pm.PackageManager.NameNotFoundException, UnrecoverableEntryException
    {
        Object obj;
        Object obj2;
        File file;
        String s1;
        KeyStore keystore;
        keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        file = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        s1 = getAlias(s);
        obj = null;
        obj2 = null;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        Object obj1 = new FileInputStream(file);
        keystore.load(((InputStream) (obj1)), keyStorePassword);
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
        boolean flag = "application".equalsIgnoreCase(s);
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
_L12:
        String as[];
        KeyStore keystore1;
        int i;
        int j;
        as = context.getPackageManager().getPackagesForUid(context.getApplicationInfo().uid);
        keystore1 = KeyStore.getInstance(KeyStore.getDefaultType());
        j = as.length;
        i = 0;
_L11:
        if (i >= j) goto _L6; else goto _L5
_L5:
        Object obj3;
        Object obj4;
        s = as[i];
        s = new File((new StringBuilder()).append(context.createPackageContext(s, 0).getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        obj = null;
        obj4 = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        if (!s.exists()) goto _L8; else goto _L7
_L7:
        s = new FileInputStream(s);
        keystore1.load(s, keyStorePassword);
        obj1 = (java.security.KeyStore.PrivateKeyEntry)keystore1.getEntry(s1, new java.security.KeyStore.PasswordProtection(keyStorePassword));
        if (obj1 != null) goto _L10; else goto _L9
_L9:
        s.close();
        if (s != null)
        {
            s.close();
        }
        if (false)
        {
            throw new NullPointerException();
        }
_L8:
        i++;
          goto _L11
        obj1;
        s = ((String) (obj2));
_L18:
        obj = s;
        logger.error((new StringBuilder()).append("Failed to determine the existence of certificate for device authentication with ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        if (s != null)
        {
            s.close();
        }
          goto _L12
        s;
_L17:
        if (obj != null)
        {
            ((FileInputStream) (obj)).close();
        }
        throw s;
_L2:
        if ("application".equalsIgnoreCase(s))
        {
            return null;
        }
        keystore.load(null, keyStorePassword);
          goto _L12
_L10:
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
        logger.error((new StringBuilder()).append("Failed copying certificate for device authentication with ").append(((IOException) (obj2)).getMessage()).append(" , device authentication certificate will recreate.").toString(), ((Throwable) (obj2)));
        if (s != null)
        {
            s.close();
        }
        if (obj3 != null)
        {
            ((FileOutputStream) (obj3)).close();
        }
          goto _L8
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
_L6:
        return null;
        Exception exception;
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
        s;
        obj = obj1;
          goto _L17
        IOException ioexception;
        ioexception;
        s = ((String) (obj1));
        obj1 = ioexception;
          goto _L18
    }

    public void init(Context context1)
    {
        context = context1;
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
            logger.error((new StringBuilder()).append("Failed to determine the existence of certificate for device authentication with ").append(s.getMessage()).toString(), s);
            return false;
        }
        if (s != null)
        {
            flag = true;
        }
        return flag;
    }

    public void removeEntityKeyStoreValues(String s)
        throws KeyStoreException
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        File file;
        Object obj7;
        Object obj8;
        Object obj9;
        String as[];
        Object obj10;
        Object obj11;
        KeyStore keystore;
        keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        file = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        obj9 = null;
        as = null;
        obj4 = null;
        obj5 = null;
        obj10 = null;
        obj11 = null;
        obj6 = null;
        obj7 = null;
        obj8 = null;
        obj2 = obj9;
        obj3 = obj10;
        obj = as;
        obj1 = obj11;
        String s1 = getAlias(s);
        obj2 = obj9;
        obj3 = obj10;
        obj = as;
        obj1 = obj11;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj2 = obj9;
        obj3 = obj10;
        obj = as;
        obj1 = obj11;
        obj4 = new FileInputStream(file);
        obj1 = obj6;
        obj3 = obj7;
        keystore.load(((InputStream) (obj4)), keyStorePassword);
        obj5 = obj8;
        obj1 = obj6;
        obj3 = obj7;
        if (!keystore.containsAlias(s1))
        {
            break MISSING_BLOCK_LABEL_244;
        }
        obj1 = obj6;
        obj3 = obj7;
        keystore.deleteEntry(s1);
        obj1 = obj6;
        obj3 = obj7;
        obj = new FileOutputStream(file);
        obj2 = obj4;
        obj5 = obj;
        obj3 = obj4;
        obj6 = obj;
        keystore.store(((java.io.OutputStream) (obj)), keyStorePassword);
        obj5 = obj;
        obj1 = obj5;
        obj3 = obj5;
        ((FileInputStream) (obj4)).close();
        obj2 = obj4;
        obj3 = obj5;
        obj = obj4;
        obj1 = obj5;
        boolean flag = s.equals("application");
        if (!flag) goto _L2; else goto _L1
_L1:
        if (obj5 != null)
        {
            try
            {
                ((FileOutputStream) (obj5)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                logger.error(s.getMessage(), s);
            }
        }
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        ((FileInputStream) (obj4)).close();
_L8:
        return;
        s;
        logger.error(s.getMessage(), s);
        return;
_L2:
        obj2 = obj4;
        obj3 = obj5;
        obj = obj4;
        obj1 = obj5;
        as = context.getPackageManager().getPackagesForUid(context.getApplicationInfo().uid);
        obj2 = obj4;
        obj3 = obj5;
        obj = obj4;
        obj1 = obj5;
        int j = as.length;
        int i;
        i = 0;
        obj2 = file;
        obj1 = obj5;
        obj = obj4;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = as[i];
        file = new File((new StringBuilder()).append(context.createPackageContext(((String) (obj2)), 0).getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
        obj7 = null;
        obj2 = null;
        obj6 = null;
        obj = null;
        obj9 = null;
        obj5 = null;
        obj3 = null;
        obj4 = null;
        obj1 = null;
        obj8 = null;
        flag = file.exists();
        obj = obj9;
        obj1 = obj8;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_605;
        }
        obj = new FileInputStream(file);
        keystore.load(((InputStream) (obj)), keyStorePassword);
        keystore.deleteEntry(s1);
        obj1 = new FileOutputStream(file);
        keystore.store(((java.io.OutputStream) (obj1)), keyStorePassword);
        ((FileOutputStream) (obj1)).close();
        ((FileInputStream) (obj)).close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        obj2 = obj;
        obj5 = obj1;
        obj3 = obj;
        obj6 = obj1;
        ((FileInputStream) (obj)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_605;
        }
        obj2 = obj;
        obj5 = obj1;
        obj3 = obj;
        obj6 = obj1;
        ((FileOutputStream) (obj1)).close();
_L6:
        i++;
        obj2 = file;
        if (true) goto _L4; else goto _L3
        obj;
        obj4 = obj7;
_L13:
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_647;
        }
        obj2 = obj4;
        obj3 = obj5;
        obj = obj4;
        obj1 = obj5;
        ((FileInputStream) (obj4)).close();
        obj = obj4;
        obj1 = obj5;
        if (obj5 == null) goto _L6; else goto _L5
_L5:
        obj2 = obj4;
        obj3 = obj5;
        obj = obj4;
        obj1 = obj5;
        ((FileOutputStream) (obj5)).close();
        obj = obj4;
        obj1 = obj5;
          goto _L6
_L9:
        obj = obj2;
        obj1 = obj3;
        logger.error((new StringBuilder()).append("Error deleting the keystore containing the certificate ").append(s.getMessage()).toString(), s);
        if (obj3 != null)
        {
            try
            {
                ((FileOutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                logger.error(s.getMessage(), s);
            }
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        try
        {
            ((FileInputStream) (obj2)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger.error(s.getMessage(), s);
        }
        return;
        obj5;
        s = ((String) (obj6));
_L12:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_781;
        }
        obj2 = s;
        obj3 = obj4;
        obj = s;
        obj1 = obj4;
        s.close();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        obj2 = s;
        obj3 = obj4;
        obj = s;
        obj1 = obj4;
        ((FileOutputStream) (obj4)).close();
        obj2 = s;
        obj3 = obj4;
        obj = s;
        obj1 = obj4;
        try
        {
            throw obj5;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally { }
          goto _L9
_L11:
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                logger.error(((IOException) (obj1)).getMessage(), ((Throwable) (obj1)));
            }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                logger.error(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
            }
        }
        throw s;
_L3:
        logger.debug((new StringBuilder()).append("certificate cleared for entity: ").append(s).toString());
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                logger.error(s.getMessage(), s);
            }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                logger.error(s.getMessage(), s);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
        s;
        obj = obj4;
        continue; /* Loop/switch isn't completed */
        s;
        obj1 = obj5;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L11; else goto _L10
        s;
        obj2 = obj4;
          goto _L9
        s;
        obj2 = obj3;
        obj3 = obj6;
          goto _L9
        s;
        obj2 = obj;
        obj3 = obj1;
          goto _L9
        obj5;
        s = ((String) (obj));
          goto _L12
        obj5;
        s = ((String) (obj));
        obj4 = obj1;
          goto _L12
        obj1;
        obj4 = obj;
          goto _L13
        IOException ioexception;
        ioexception;
        obj4 = obj;
        obj5 = obj1;
          goto _L13
_L10:
          goto _L6
    }

    public void saveCertificate(String s, String s1)
        throws Exception
    {
        saveCertificate(s, s1, null);
    }

    public void saveCertificate(String s, String s1, String s2)
        throws Exception
    {
        if (s1 == null)
        {
            throw new Exception("cannot save null certificate");
        } else
        {
            s1 = new ByteArrayInputStream(Base64.decode(s1.getBytes()));
            X509Certificate x509certificate = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(s1);
            s1.close();
            saveCertificate(s, ((Certificate) (x509certificate)), s2);
            return;
        }
    }

    public void saveCertificate(String s, Certificate certificate, String s1)
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
        file = new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(KEYSTORE_FILENAME).toString());
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
_L11:
        fileinputstream2 = fileinputstream;
        fileinputstream1 = fileinputstream;
        obj = obj3;
        keystore.setKeyEntry(getAlias(s), ((KeyPair)keyPairHash.get(getAlias(s))).getPrivate(), keyStorePassword, new Certificate[] {
            certificate
        });
        fileinputstream2 = fileinputstream;
        fileinputstream1 = fileinputstream;
        obj = obj3;
        s = new FileOutputStream(file);
        keystore.store(s, keyStorePassword);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        keyPairHash.remove(s1);
        logger.debug("Certificate saved.");
        if (s != null)
        {
            s.close();
        }
        if (fileinputstream == null) goto _L4; else goto _L3
_L3:
        fileinputstream.close();
_L6:
        return;
_L2:
        fileinputstream2 = obj4;
        fileinputstream1 = obj5;
        obj = obj3;
        try
        {
            keystore.load(null, keyStorePassword);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            certificate = obj1;
            fileinputstream = fileinputstream2;
        }
        finally
        {
            fileinputstream = fileinputstream1;
        }
_L9:
        fileinputstream1 = fileinputstream;
        obj = certificate;
        logger.error((new StringBuilder()).append("Certificate for device authentication could not be saved with ").append(s.getMessage()).toString(), s);
        if (certificate != null)
        {
            certificate.close();
        }
        if (fileinputstream == null) goto _L6; else goto _L5
_L5:
        fileinputstream.close();
        return;
_L8:
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
        certificate;
        obj = s;
        s = certificate;
        if (true) goto _L8; else goto _L7
_L7:
        s;
        certificate = obj1;
          goto _L9
        s1;
        certificate = s;
        s = s1;
          goto _L9
_L4:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public String signCsr(JSONObject jsonobject, String s)
        throws Exception
    {
        s = getAlias(s);
        s = (KeyPair)keyPairHash.get(s);
        return signJWS(jsonobject, (RSAPublicKey)s.getPublic(), s.getPrivate());
    }

    protected byte[] signData(String s, PrivateKey privatekey)
        throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException
    {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privatekey);
        signature.update(s.getBytes());
        return signature.sign();
    }

    public String signJWS(JSONObject jsonobject, RSAPublicKey rsapublickey, PrivateKey privatekey)
        throws JSONException, UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, SignatureException
    {
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("alg", "RS256");
        JSONObject jsonobject2 = new JSONObject();
        jsonobject2.put("alg", "RSA");
        jsonobject2.put("mod", Base64.encodeUrlSafe(rsapublickey.getModulus().toByteArray(), "UTF-8"));
        jsonobject2.put("exp", Base64.encodeUrlSafe(rsapublickey.getPublicExponent().toByteArray(), "UTF-8"));
        jsonobject1.put("jpk", jsonobject2);
        rsapublickey = jsonobject1.toString();
        jsonobject = jsonobject.toString();
        jsonobject = (new StringBuilder()).append(Base64.encodeUrlSafe(rsapublickey.getBytes(), "UTF-8")).append(".").append(Base64.encodeUrlSafe(jsonobject.getBytes(), "UTF-8")).toString();
        rsapublickey = Base64.encodeUrlSafe(signCsrData(jsonobject, privatekey), "UTF-8");
        return (new StringBuilder()).append(jsonobject).append(".").append(rsapublickey).toString();
    }

}
