// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class avh
    implements anj
{

    private final avp a;

    public avh(avp avp1)
    {
        a = avp1;
    }

    public final aqa a(Object obj, int i, int j, ani ani)
    {
        obj = azx.b((ByteBuffer)obj);
        return a.a(((java.io.InputStream) (obj)), i, j, ani, avp.c);
    }

    public final boolean a(Object obj, ani ani)
    {
        obj = (ByteBuffer)obj;
        return avp.b();
    }
}
