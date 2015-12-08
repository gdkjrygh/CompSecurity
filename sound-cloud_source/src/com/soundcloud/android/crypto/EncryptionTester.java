// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import com.soundcloud.android.offline.OfflineSettingsStorage;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.strings.Charsets;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.crypto:
//            CryptoOperations

public class EncryptionTester
{

    private static final String TAG = com/soundcloud/android/crypto/EncryptionTester.getSimpleName();
    private final CryptoOperations cryptoOperations;
    private final OfflineSettingsStorage offlineSettings;
    private final R scheduler;

    public EncryptionTester(OfflineSettingsStorage offlinesettingsstorage, CryptoOperations cryptooperations, R r)
    {
        offlineSettings = offlinesettingsstorage;
        cryptoOperations = cryptooperations;
        scheduler = r;
    }

    private void encryptSampleData()
    {
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream("Plain Test".getBytes(Charsets.UTF_8));
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            cryptoOperations.encryptStream(bytearrayinputstream, bytearrayoutputstream, null);
            return;
        }
        catch (Exception exception)
        {
            (new StringBuilder("Test encryption failed: ")).append(exception.getMessage());
        }
    }

    public void runEncryptionTest()
    {
        if (!offlineSettings.hasRunEncryptionTest())
        {
            offlineSettings.setEncryptionTestRun();
            DefaultSubscriber.fireAndForget(b.create(new _cls1()).subscribeOn(scheduler));
        }
    }



    private class _cls1
        implements rx.b.f
    {

        final EncryptionTester this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            encryptSampleData();
        }

        _cls1()
        {
            this$0 = EncryptionTester.this;
            super();
        }
    }

}
