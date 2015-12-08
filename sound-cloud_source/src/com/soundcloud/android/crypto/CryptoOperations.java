// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import com.soundcloud.android.events.EncryptionEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.rx.eventbus.EventBus;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.crypto:
//            DeviceSecret, KeyGeneratorWrapper, KeyStorage, Encryptor, 
//            EncryptionException

public class CryptoOperations
{

    protected static final String DEVICE_KEY = "device_key";
    private static final String TAG = "CryptoOps";
    private final Encryptor encryptor;
    private final EventBus eventBus;
    private final KeyGeneratorWrapper keyGenerator;
    private final SecureRandom secureRandom = new SecureRandom();
    private final KeyStorage storage;
    private final R storageScheduler;

    public CryptoOperations(KeyStorage keystorage, KeyGeneratorWrapper keygeneratorwrapper, Encryptor encryptor1, EventBus eventbus, R r)
    {
        keyGenerator = keygeneratorwrapper;
        eventBus = eventbus;
        encryptor = encryptor1;
        storage = keystorage;
        storageScheduler = r;
    }

    private void generateAndStoreDeviceKey()
    {
        try
        {
            byte abyte0[] = new byte[16];
            secureRandom.nextBytes(abyte0);
            DeviceSecret devicesecret = new DeviceSecret("device_key", keyGenerator.generateKey(secureRandom), abyte0);
            storage.put(devicesecret);
            return;
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            ErrorUtils.handleSilentException("Key generation error", nosuchalgorithmexception);
        }
        eventBus.publish(EventQueue.TRACKING, EncryptionEvent.fromKeyGenerationError());
    }

    private DeviceSecret generateKey(String s)
    {
        byte abyte0[] = new byte[16];
        secureRandom.nextBytes(abyte0);
        return new DeviceSecret(s, abyte0);
    }

    public void cancelEncryption()
    {
        encryptor.tryToCancelRequest();
    }

    public DeviceSecret checkAndGetDeviceKey()
    {
        this;
        JVM INSTR monitorenter ;
        DeviceSecret devicesecret;
        if (!storage.contains("device_key"))
        {
            generateAndStoreDeviceKey();
        }
        devicesecret = storage.get("device_key");
        this;
        JVM INSTR monitorexit ;
        return devicesecret;
        Exception exception;
        exception;
        throw exception;
    }

    public void encryptStream(InputStream inputstream, OutputStream outputstream, Encryptor.EncryptionProgressListener encryptionprogresslistener)
        throws IOException, EncryptionException
    {
        try
        {
            DeviceSecret devicesecret = checkAndGetDeviceKey();
            encryptor.encrypt(inputstream, outputstream, devicesecret, encryptionprogresslistener);
            eventBus.publish(EventQueue.TRACKING, EncryptionEvent.fromEncryptionSuccess());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            ErrorUtils.handleSilentException("Encryption error", inputstream);
        }
        eventBus.publish(EventQueue.TRACKING, EncryptionEvent.fromEncryptionError());
        throw inputstream;
    }

    public void generateAndStoreDeviceKeyIfNeeded()
    {
        DefaultSubscriber.fireAndForget(b.create(new _cls1()).subscribeOn(storageScheduler));
    }

    public String generateHashForUrn(Urn urn)
        throws EncryptionException
    {
        return encryptor.hash(urn);
    }

    public byte[] getKeyOrGenerateAndStore(String s)
    {
        if (storage.contains(s))
        {
            return storage.get(s).getKey();
        } else
        {
            s = generateKey(s);
            storage.put(s);
            return s.getKey();
        }
    }

    private class _cls1
        implements rx.b.f
    {

        final CryptoOperations this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            checkAndGetDeviceKey();
        }

        _cls1()
        {
            this$0 = CryptoOperations.this;
            super();
        }
    }

}
