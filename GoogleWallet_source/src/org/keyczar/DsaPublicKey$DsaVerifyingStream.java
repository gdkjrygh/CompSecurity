// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.SignatureException;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.VerifyingStream;

// Referenced classes of package org.keyczar:
//            DsaPublicKey

final class t>
    implements VerifyingStream
{

    private Signature signature;
    final DsaPublicKey this$0;

    public final int digestSize()
    {
        return 48;
    }

    public final void initVerify()
        throws KeyczarException
    {
        try
        {
            signature.initVerify(DsaPublicKey.access$000(DsaPublicKey.this));
            return;
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            throw new KeyczarException(generalsecurityexception);
        }
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

    public ()
        throws KeyczarException
    {
        this$0 = DsaPublicKey.this;
        super();
        try
        {
            signature = Signature.getInstance("SHA1withDSA");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DsaPublicKey dsapublickey)
        {
            throw new KeyczarException(DsaPublicKey.this);
        }
    }
}
