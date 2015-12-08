// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.contentprotection;

import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.contentprotection:
//            PlayReadyHeader

public static class  extends 
{

    ByteBuffer value;

    public ByteBuffer getValue()
    {
        return value;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        value = bytebuffer.duplicate();
    }

    public (int i)
    {
        super(i);
    }
}
