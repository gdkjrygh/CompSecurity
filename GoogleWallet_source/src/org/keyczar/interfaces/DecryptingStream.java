// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import java.nio.ByteBuffer;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package org.keyczar.interfaces:
//            Stream, VerifyingStream

public interface DecryptingStream
    extends Stream
{

    public abstract int doFinalDecrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException;

    public abstract VerifyingStream getVerifyingStream();

    public abstract void initDecrypt(ByteBuffer bytebuffer)
        throws KeyczarException;

    public abstract int updateDecrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException;
}
