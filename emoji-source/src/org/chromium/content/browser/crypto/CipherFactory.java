// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.crypto;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.chromium.content.browser.crypto:
//            ByteArrayGenerator

public class CipherFactory
{
    private static class CipherData
    {

        public final byte iv[];
        public final Key key;

        public CipherData(Key key1, byte abyte0[])
        {
            key = key1;
            iv = abyte0;
        }
    }

    private static class LazyHolder
    {

        private static CipherFactory sInstance = new CipherFactory();



        private LazyHolder()
        {
        }
    }


    static final String BUNDLE_IV = "org.chromium.content.browser.crypto.CipherFactory.IV";
    static final String BUNDLE_KEY = "org.chromium.content.browser.crypto.CipherFactory.KEY";
    static final int NUM_BYTES = 16;
    private static final String TAG = "CipherFactory";
    private CipherData mData;
    private FutureTask mDataGenerator;
    private final Object mDataLock;
    private ByteArrayGenerator mRandomNumberProvider;

    private CipherFactory()
    {
        mDataLock = new Object();
        mRandomNumberProvider = new ByteArrayGenerator();
    }


    private Callable createGeneratorCallable()
    {
        return new Callable() {

            final CipherFactory this$0;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public CipherData call()
            {
                byte abyte0[];
                CipherData cipherdata;
                byte abyte1[];
                try
                {
                    abyte1 = mRandomNumberProvider.getBytes(16);
                    abyte0 = mRandomNumberProvider.getBytes(16);
                }
                catch (IOException ioexception)
                {
                    Log.e("CipherFactory", "Couldn't get generator data.");
                    return null;
                }
                catch (GeneralSecurityException generalsecurityexception)
                {
                    Log.e("CipherFactory", "Couldn't get generator data.");
                    return null;
                }
                try
                {
                    SecureRandom securerandom = SecureRandom.getInstance("SHA1PRNG");
                    securerandom.setSeed(abyte1);
                    KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
                    keygenerator.init(128, securerandom);
                    cipherdata = new CipherData(keygenerator.generateKey(), abyte0);
                }
                catch (GeneralSecurityException generalsecurityexception1)
                {
                    Log.e("CipherFactory", "Couldn't get generator instances.");
                    return null;
                }
                return cipherdata;
            }

            
            {
                this$0 = CipherFactory.this;
                super();
            }
        };
    }

    public static CipherFactory getInstance()
    {
        return LazyHolder.sInstance;
    }

    public Cipher getCipher(int i)
    {
        CipherData cipherdata;
        cipherdata = getCipherData(true);
        if (cipherdata == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        Cipher cipher;
        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, cipherdata.key, new IvParameterSpec(cipherdata.iv));
        return cipher;
        GeneralSecurityException generalsecurityexception;
        generalsecurityexception;
        Log.e("CipherFactory", "Error in creating cipher instance.");
        return null;
    }

    CipherData getCipherData(boolean flag)
    {
        if (mData == null && flag)
        {
            triggerKeyGeneration();
            CipherData cipherdata;
            try
            {
                cipherdata = (CipherData)mDataGenerator.get();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
            synchronized (mDataLock)
            {
                if (mData == null)
                {
                    mData = cipherdata;
                }
            }
        }
        return mData;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean restoreFromBundle(Bundle bundle)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        byte abyte0[];
        abyte0 = bundle.getByteArray("org.chromium.content.browser.crypto.CipherFactory.KEY");
        bundle = bundle.getByteArray("org.chromium.content.browser.crypto.CipherFactory.IV");
        if (abyte0 == null || bundle == null) goto _L1; else goto _L3
_L3:
        SecretKeySpec secretkeyspec = new SecretKeySpec(abyte0, "AES");
label0:
        {
            synchronized (mDataLock)
            {
                if (mData != null)
                {
                    break label0;
                }
                mData = new CipherData(secretkeyspec, bundle);
            }
            return true;
        }
        if (!mData.key.equals(secretkeyspec) || !Arrays.equals(mData.iv, bundle))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        Log.e("CipherFactory", "Attempted to restore different cipher data.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.e("CipherFactory", "Error in restoring the key from the bundle.");
        }
        return false;
    }

    public void saveToBundle(Bundle bundle)
    {
        CipherData cipherdata = getCipherData(false);
        byte abyte0[];
        if (cipherdata != null)
        {
            if ((abyte0 = cipherdata.key.getEncoded()) != null && cipherdata.iv != null)
            {
                bundle.putByteArray("org.chromium.content.browser.crypto.CipherFactory.KEY", abyte0);
                bundle.putByteArray("org.chromium.content.browser.crypto.CipherFactory.IV", cipherdata.iv);
                return;
            }
        }
    }

    void setRandomNumberProviderForTests(ByteArrayGenerator bytearraygenerator)
    {
        mRandomNumberProvider = bytearraygenerator;
    }

    public void triggerKeyGeneration()
    {
        if (mData != null)
        {
            return;
        }
        synchronized (mDataLock)
        {
            if (mDataGenerator == null)
            {
                mDataGenerator = new FutureTask(createGeneratorCallable());
                AsyncTask.THREAD_POOL_EXECUTOR.execute(mDataGenerator);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
