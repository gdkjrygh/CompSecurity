// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.keyparams.KeyParameters;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            KeyczarKey

public class HmacKey extends KeyczarKey
{
    final class HmacStream
        implements SigningStream, VerifyingStream
    {

        private final Mac hmac;
        final HmacKey this$0;

        public final int digestSize()
        {
            return 20;
        }

        public final void initSign()
            throws KeyczarException
        {
            try
            {
                hmac.init(hmacKey);
                return;
            }
            catch (GeneralSecurityException generalsecurityexception)
            {
                throw new KeyczarException(generalsecurityexception);
            }
        }

        public final void initVerify()
            throws KeyczarException
        {
            initSign();
        }

        public final void sign(ByteBuffer bytebuffer)
        {
            bytebuffer.put(hmac.doFinal());
        }

        public final void updateSign(ByteBuffer bytebuffer)
        {
            hmac.update(bytebuffer);
        }

        public final void updateVerify(ByteBuffer bytebuffer)
        {
            updateSign(bytebuffer);
        }

        public final boolean verify(ByteBuffer bytebuffer)
        {
            byte abyte0[] = new byte[bytebuffer.remaining()];
            bytebuffer.get(abyte0);
            return Util.safeArrayEquals(hmac.doFinal(), abyte0);
        }

        public HmacStream()
            throws KeyczarException
        {
            this$0 = HmacKey.this;
            super();
            try
            {
                hmac = Mac.getInstance("HMACSHA1");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (HmacKey hmackey)
            {
                throw new KeyczarException(HmacKey.this);
            }
        }
    }


    private final byte hash[];
    private SecretKey hmacKey;
    private final String hmacKeyString;

    private HmacKey()
    {
        super(0);
        hash = new byte[4];
        hmacKeyString = null;
    }

    private HmacKey(byte abyte0[])
        throws KeyczarException
    {
        super(abyte0.length << 3);
        hash = new byte[4];
        hmacKeyString = Base64Coder.encodeWebSafe(abyte0);
        initJceKey(abyte0);
    }

    static HmacKey generate(KeyParameters keyparameters)
        throws KeyczarException
    {
        return new HmacKey(Util.rand(keyparameters.getKeySize() / 8));
    }

    private void initJceKey(byte abyte0[])
        throws KeyczarException
    {
        hmacKey = new SecretKeySpec(abyte0, "HMACSHA1");
        System.arraycopy(Util.hash(new byte[][] {
            abyte0
        }), 0, hash, 0, hash.length);
    }

    static HmacKey read(String s)
        throws KeyczarException
    {
        s = (HmacKey)Util.gson().fromJson(s, org/keyczar/HmacKey);
        s.initFromJson();
        return s;
    }

    final byte[] getEncoded()
    {
        return hmacKey.getEncoded();
    }

    protected final Stream getStream()
        throws KeyczarException
    {
        return new HmacStream();
    }

    protected final byte[] hash()
    {
        return hash;
    }

    final void initFromJson()
        throws KeyczarException
    {
        initJceKey(Base64Coder.decodeWebSafe(hmacKeyString));
    }

}
