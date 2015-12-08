// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class avu
{

    public final ByteBuffer a;

    public avu(byte abyte0[], int i)
    {
        a = (ByteBuffer)ByteBuffer.wrap(abyte0).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    public final int a(int i)
    {
        return a.getInt(i);
    }

    public final short b(int i)
    {
        return a.getShort(i);
    }
}
