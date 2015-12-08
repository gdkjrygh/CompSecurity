// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import java.nio.ByteBuffer;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package org.keyczar.interfaces:
//            Stream, SigningStream

public interface EncryptingStream
    extends Stream
{

    public abstract int doFinalEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException;

    public abstract SigningStream getSigningStream()
        throws KeyczarException;

    public abstract int initEncrypt(ByteBuffer bytebuffer)
        throws KeyczarException;

    public abstract int maxOutputSize(int i);

    public abstract int updateEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException;
}
