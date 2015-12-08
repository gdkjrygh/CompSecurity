// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            HmacKey

final class xception
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
            hmac.init(HmacKey.access$000(HmacKey.this));
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

    public xception()
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
