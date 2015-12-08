// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import java.nio.ByteBuffer;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package org.keyczar.interfaces:
//            Stream

public interface VerifyingStream
    extends Stream
{

    public abstract int digestSize();

    public abstract void initVerify()
        throws KeyczarException;

    public abstract void updateVerify(ByteBuffer bytebuffer)
        throws KeyczarException;

    public abstract boolean verify(ByteBuffer bytebuffer)
        throws KeyczarException;
}
