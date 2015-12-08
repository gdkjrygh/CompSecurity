// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import java.io.OutputStream;

// Referenced classes of package org.apache.commons.codec.binary:
//            BaseNCodecOutputStream, Base64

public class Base64OutputStream extends BaseNCodecOutputStream
{

    public Base64OutputStream(OutputStream outputstream)
    {
        this(outputstream, true);
    }

    public Base64OutputStream(OutputStream outputstream, boolean flag)
    {
        super(outputstream, new Base64(false), flag);
    }

    public Base64OutputStream(OutputStream outputstream, boolean flag, int i, byte abyte0[])
    {
        super(outputstream, new Base64(i, abyte0), flag);
    }
}
