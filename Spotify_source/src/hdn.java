// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class hdn
{

    public hdn(ByteBuffer bytebuffer)
    {
        if (!bytebuffer.isReadOnly())
        {
            bytebuffer.asReadOnlyBuffer();
        }
    }
}
