// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import java.io.InputStream;

// Referenced classes of package org.apache.commons.codec.binary:
//            BaseNCodecInputStream, Base64

public class Base64InputStream extends BaseNCodecInputStream
{

    public Base64InputStream(InputStream inputstream)
    {
        this(inputstream, false);
    }

    public Base64InputStream(InputStream inputstream, boolean flag)
    {
        super(inputstream, new Base64(false), flag);
    }

    public Base64InputStream(InputStream inputstream, boolean flag, int i, byte abyte0[])
    {
        super(inputstream, new Base64(i, abyte0), flag);
    }
}
