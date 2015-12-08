// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Log;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.ECParameterSpec;

// Referenced classes of package org.chromium.net:
//            AndroidKeyStore, AndroidPrivateKey

public class DefaultAndroidKeyStore
    implements AndroidKeyStore
{
    private static class DefaultAndroidPrivateKey
        implements AndroidPrivateKey
    {

        final PrivateKey mKey;
        final DefaultAndroidKeyStore mStore;

        PrivateKey getJavaKey()
        {
            return mKey;
        }

        public AndroidKeyStore getKeyStore()
        {
            return mStore;
        }

        DefaultAndroidPrivateKey(PrivateKey privatekey, DefaultAndroidKeyStore defaultandroidkeystore)
        {
            mKey = privatekey;
            mStore = defaultandroidkeystore;
        }
    }


    private static final String TAG = "AndroidKeyStoreInProcessImpl";

    public DefaultAndroidKeyStore()
    {
    }

    private Object getOpenSSLKeyForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((DefaultAndroidPrivateKey)androidprivatekey).getJavaKey();
        if (androidprivatekey != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Log.e("AndroidKeyStoreInProcessImpl", "key == null");
        obj = null;
_L4:
        return obj;
_L2:
        if (!(androidprivatekey instanceof RSAPrivateKey))
        {
            Log.e("AndroidKeyStoreInProcessImpl", "does not implement RSAPrivateKey");
            return null;
        }
        try
        {
            obj = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Cannot find system OpenSSLRSAPrivateKey class: ").append(androidprivatekey).toString());
            return null;
        }
        if (!((Class) (obj)).isInstance(androidprivatekey))
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Private key is not an OpenSSLRSAPrivateKey instance, its class name is:").append(androidprivatekey.getClass().getCanonicalName()).toString());
            return null;
        }
        obj = ((Class) (obj)).getDeclaredMethod("getOpenSSLKey", new Class[0]);
        ((Method) (obj)).setAccessible(true);
        androidprivatekey = ((AndroidPrivateKey) (((Method) (obj)).invoke(androidprivatekey, new Object[0])));
        ((Method) (obj)).setAccessible(false);
        obj = androidprivatekey;
        if (androidprivatekey != null) goto _L4; else goto _L3
_L3:
        Log.e("AndroidKeyStoreInProcessImpl", "getOpenSSLKey() returned null");
        return null;
        androidprivatekey;
        try
        {
            ((Method) (obj)).setAccessible(false);
            throw androidprivatekey;
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Exception while trying to retrieve system EVP_PKEY handle: ").append(androidprivatekey).toString());
        }
        return null;
    }

    public AndroidPrivateKey createKey(PrivateKey privatekey)
    {
        return new DefaultAndroidPrivateKey(privatekey, this);
    }

    public byte[] getDSAKeyParamQ(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((DefaultAndroidPrivateKey)androidprivatekey).getJavaKey();
        if (androidprivatekey instanceof DSAKey)
        {
            return ((DSAKey)androidprivatekey).getParams().getQ().toByteArray();
        } else
        {
            Log.w("AndroidKeyStoreInProcessImpl", "Not a DSAKey instance!");
            return null;
        }
    }

    public byte[] getECKeyOrder(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((DefaultAndroidPrivateKey)androidprivatekey).getJavaKey();
        if (androidprivatekey instanceof ECKey)
        {
            return ((ECKey)androidprivatekey).getParams().getOrder().toByteArray();
        } else
        {
            Log.w("AndroidKeyStoreInProcessImpl", "Not an ECKey instance!");
            return null;
        }
    }

    public Object getOpenSSLEngineForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        Object obj;
        Class class1;
        try
        {
            class1 = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Cannot find system OpenSSLEngine class: ").append(androidprivatekey).toString());
            return null;
        }
        androidprivatekey = ((AndroidPrivateKey) (getOpenSSLKeyForPrivateKey(androidprivatekey)));
        if (androidprivatekey != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return obj;
_L2:
        obj = androidprivatekey.getClass().getDeclaredMethod("getEngine", new Class[0]);
        ((Method) (obj)).setAccessible(true);
        androidprivatekey = ((AndroidPrivateKey) (((Method) (obj)).invoke(androidprivatekey, new Object[0])));
        ((Method) (obj)).setAccessible(false);
        if (androidprivatekey != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Log.e("AndroidKeyStoreInProcessImpl", "getEngine() returned null");
        obj = androidprivatekey;
        if (class1.isInstance(androidprivatekey)) goto _L4; else goto _L3
_L3:
        Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Engine is not an OpenSSLEngine instance, its class name is:").append(androidprivatekey.getClass().getCanonicalName()).toString());
        return null;
        androidprivatekey;
        Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("No getEngine() method on OpenSSLKey member:").append(androidprivatekey).toString());
        return null;
        androidprivatekey;
        try
        {
            ((Method) (obj)).setAccessible(false);
            throw androidprivatekey;
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Exception while trying to retrieve OpenSSLEngine object: ").append(androidprivatekey).toString());
        }
        return null;
    }

    public long getOpenSSLHandleForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        Object obj = getOpenSSLKeyForPrivateKey(androidprivatekey);
        if (obj != null) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L4:
        return l;
_L2:
        androidprivatekey = obj.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
        long l1;
        try
        {
            androidprivatekey.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Exception while trying to retrieve system EVP_PKEY handle: ").append(androidprivatekey).toString());
            return 0L;
        }
        l1 = ((Number)androidprivatekey.invoke(obj, new Object[0])).longValue();
        androidprivatekey.setAccessible(false);
        l = l1;
        if (l1 != 0L) goto _L4; else goto _L3
_L3:
        Log.e("AndroidKeyStoreInProcessImpl", "getPkeyContext() returned null");
        return l1;
        androidprivatekey;
        Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("No getPkeyContext() method on OpenSSLKey member:").append(androidprivatekey).toString());
        return 0L;
        Exception exception;
        exception;
        androidprivatekey.setAccessible(false);
        throw exception;
    }

    public byte[] getPrivateKeyEncodedBytes(AndroidPrivateKey androidprivatekey)
    {
        return ((DefaultAndroidPrivateKey)androidprivatekey).getJavaKey().getEncoded();
    }

    public int getPrivateKeyType(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((DefaultAndroidPrivateKey)androidprivatekey).getJavaKey();
        if (androidprivatekey instanceof RSAPrivateKey)
        {
            return 0;
        }
        if (androidprivatekey instanceof DSAPrivateKey)
        {
            return 1;
        }
        return !(androidprivatekey instanceof ECPrivateKey) ? 255 : 2;
    }

    public byte[] getRSAKeyModulus(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((DefaultAndroidPrivateKey)androidprivatekey).getJavaKey();
        if (androidprivatekey instanceof RSAKey)
        {
            return ((RSAKey)androidprivatekey).getModulus().toByteArray();
        } else
        {
            Log.w("AndroidKeyStoreInProcessImpl", "Not a RSAKey instance!");
            return null;
        }
    }

    public byte[] rawSignDigestWithPrivateKey(AndroidPrivateKey androidprivatekey, byte abyte0[])
    {
        Object obj;
        PrivateKey privatekey;
        privatekey = ((DefaultAndroidPrivateKey)androidprivatekey).getJavaKey();
        obj = null;
        if (privatekey instanceof RSAPrivateKey)
        {
            androidprivatekey = Signature.getInstance("NONEwithRSA");
            break MISSING_BLOCK_LABEL_25;
        }
        if (privatekey instanceof DSAPrivateKey)
        {
            androidprivatekey = Signature.getInstance("NONEwithDSA");
            continue;
        }
        androidprivatekey = obj;
        try
        {
            if (privatekey instanceof ECPrivateKey)
            {
                androidprivatekey = Signature.getInstance("NONEwithECDSA");
            }
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey = obj;
        }
        continue;
        do
        {
            if (androidprivatekey == null)
            {
                Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Unsupported private key algorithm: ").append(privatekey.getAlgorithm()).toString());
                return null;
            }
            try
            {
                androidprivatekey.initSign(privatekey);
                androidprivatekey.update(abyte0);
                androidprivatekey = androidprivatekey.sign();
            }
            // Misplaced declaration of an exception variable
            catch (AndroidPrivateKey androidprivatekey)
            {
                Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder()).append("Exception while signing message with ").append(privatekey.getAlgorithm()).append(" private key: ").append(androidprivatekey).toString());
                return null;
            }
            return androidprivatekey;
        } while (true);
    }

    public void releaseKey(AndroidPrivateKey androidprivatekey)
    {
    }
}
