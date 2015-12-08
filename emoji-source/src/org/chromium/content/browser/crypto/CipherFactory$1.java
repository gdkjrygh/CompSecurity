// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.crypto;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import javax.crypto.KeyGenerator;

// Referenced classes of package org.chromium.content.browser.crypto:
//            CipherFactory, ByteArrayGenerator

class this._cls0
    implements Callable
{

    final CipherFactory this$0;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public pherData call()
    {
        byte abyte0[];
        pherData pherdata;
        byte abyte1[];
        try
        {
            abyte1 = CipherFactory.access$200(CipherFactory.this).getBytes(16);
            abyte0 = CipherFactory.access$200(CipherFactory.this).getBytes(16);
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
            pherdata = new pherData(keygenerator.generateKey(), abyte0);
        }
        catch (GeneralSecurityException generalsecurityexception1)
        {
            Log.e("CipherFactory", "Couldn't get generator instances.");
            return null;
        }
        return pherdata;
    }

    pherData()
    {
        this$0 = CipherFactory.this;
        super();
    }
}
