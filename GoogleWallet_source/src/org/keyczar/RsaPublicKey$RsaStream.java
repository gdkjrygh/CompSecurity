// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import org.keyczar.enums.RsaPadding;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.VerifyingStream;

// Referenced classes of package org.keyczar:
//            RsaPublicKey

final class tion
    implements EncryptingStream, VerifyingStream
{

    private Cipher cipher;
    private Signature signature;
    final RsaPublicKey this$0;

    public final int digestSize()
    {
        return keySizeInBytes();
    }

    public final int doFinalEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        int i;
        int j;
        ByteBuffer bytebuffer2;
        try
        {
            i = cipher.getOutputSize(bytebuffer.limit());
            j = bytebuffer1.limit() - bytebuffer1.position();
            bytebuffer2 = ByteBuffer.allocate(i);
            cipher.doFinal(bytebuffer, bytebuffer2);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
        if (i != j)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        bytebuffer1.put(bytebuffer2.array());
        return j;
        if (i != j + 1)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (bytebuffer2.array()[i - 1] != 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        bytebuffer1.put(bytebuffer2.array(), 0, j);
        return j;
        throw new KeyczarException((new StringBuilder(72)).append("Expected ").append(j).append(" bytes from encryption operation but got ").append(i).toString());
    }

    public final SigningStream getSigningStream()
    {
        return new SigningStream() {

            final RsaPublicKey.RsaStream this$1;

            public final int digestSize()
            {
                return 0;
            }

            public final void initSign()
            {
            }

            public final void sign(ByteBuffer bytebuffer)
            {
            }

            public final void updateSign(ByteBuffer bytebuffer)
            {
            }

            
            {
                this$1 = RsaPublicKey.RsaStream.this;
                super();
            }
        };
    }

    public final int initEncrypt(ByteBuffer bytebuffer)
        throws KeyczarException
    {
        try
        {
            cipher.init(1, RsaPublicKey.access$000(RsaPublicKey.this));
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
        return 0;
    }

    public final void initVerify()
        throws KeyczarException
    {
        try
        {
            signature.initVerify(RsaPublicKey.access$000(RsaPublicKey.this));
            return;
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            throw new KeyczarException(generalsecurityexception);
        }
    }

    public final int maxOutputSize(int i)
    {
        return keySizeInBytes();
    }

    public final int updateEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        int i;
        try
        {
            i = cipher.update(bytebuffer, bytebuffer1);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
        return i;
    }

    public final void updateVerify(ByteBuffer bytebuffer)
        throws KeyczarException
    {
        try
        {
            signature.update(bytebuffer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
    }

    public final boolean verify(ByteBuffer bytebuffer)
        throws KeyczarException
    {
        boolean flag;
        try
        {
            flag = signature.verify(bytebuffer.array(), bytebuffer.position(), bytebuffer.limit() - bytebuffer.position());
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
        return flag;
    }

    _cls1.this._cls1()
        throws KeyczarException
    {
        this$0 = RsaPublicKey.this;
        super();
        try
        {
            signature = Signature.getInstance("SHA1withRSA");
            cipher = Cipher.getInstance(getPadding().getCryptAlgorithm());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RsaPublicKey rsapublickey)
        {
            throw new KeyczarException(RsaPublicKey.this);
        }
    }
}
