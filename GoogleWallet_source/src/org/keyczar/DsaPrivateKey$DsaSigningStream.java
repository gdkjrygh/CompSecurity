// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.SignatureException;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.VerifyingStream;

// Referenced classes of package org.keyczar:
//            DsaPrivateKey, DsaPublicKey

final class it>
    implements SigningStream, VerifyingStream
{

    private Signature signature;
    final DsaPrivateKey this$0;
    private VerifyingStream verifyingStream;

    public final int digestSize()
    {
        return 48;
    }

    public final void initSign()
        throws KeyczarException
    {
        try
        {
            signature.initSign(DsaPrivateKey.access$100(DsaPrivateKey.this));
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
        verifyingStream.initVerify();
    }

    public final void sign(ByteBuffer bytebuffer)
        throws KeyczarException
    {
        try
        {
            bytebuffer.put(signature.sign());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
    }

    public final void updateSign(ByteBuffer bytebuffer)
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

    public final void updateVerify(ByteBuffer bytebuffer)
        throws KeyczarException
    {
        verifyingStream.updateVerify(bytebuffer);
    }

    public final boolean verify(ByteBuffer bytebuffer)
        throws KeyczarException
    {
        return verifyingStream.verify(bytebuffer);
    }

    public ()
        throws KeyczarException
    {
        this$0 = DsaPrivateKey.this;
        super();
        try
        {
            signature = Signature.getInstance("SHA1withDSA");
            verifyingStream = (VerifyingStream)DsaPrivateKey.access$000(DsaPrivateKey.this).getStream();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DsaPrivateKey dsaprivatekey)
        {
            throw new KeyczarException(DsaPrivateKey.this);
        }
    }
}
