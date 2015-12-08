// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.util.zip.Checksum;

// Referenced classes of package com.google.common.io:
//            ByteProcessor, ByteStreams

static final class val.checksum
    implements ByteProcessor
{

    final Checksum val$checksum;

    public Long getResult()
    {
        long l = val$checksum.getValue();
        val$checksum.reset();
        return Long.valueOf(l);
    }

    public volatile Object getResult()
    {
        return getResult();
    }

    public boolean processBytes(byte abyte0[], int i, int j)
    {
        val$checksum.update(abyte0, i, j);
        return true;
    }

    (Checksum checksum1)
    {
        val$checksum = checksum1;
        super();
    }
}
