// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.security.MessageDigest;

// Referenced classes of package com.google.common.io:
//            ByteProcessor, ByteStreams

static final class val.md
    implements ByteProcessor
{

    final MessageDigest val$md;

    public volatile Object getResult()
    {
        return getResult();
    }

    public byte[] getResult()
    {
        return val$md.digest();
    }

    public boolean processBytes(byte abyte0[], int i, int j)
    {
        val$md.update(abyte0, i, j);
        return true;
    }

    (MessageDigest messagedigest)
    {
        val$md = messagedigest;
        super();
    }
}
