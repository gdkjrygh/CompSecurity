// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class nag extends qwf
{

    public nag(ByteBuffer bytebuffer)
    {
        super(bytebuffer);
    }

    public static boolean a(ByteBuffer bytebuffer)
    {
        if (bytebuffer.limit() >= 6)
        {
            bytebuffer.rewind();
            if (bytebuffer.get(0) == 71 && bytebuffer.get(1) == 73 && bytebuffer.get(2) == 70)
            {
                return true;
            }
        }
        return false;
    }
}
