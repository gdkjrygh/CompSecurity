// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class cir
{

    public final int a = 1;
    public final int b;
    public final int c;
    public final Buffer d;

    public cir(int i, float af[])
    {
        boolean flag;
        if (i > 0 && i <= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Invalid element count for VertexStream");
        if (af.length % i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Vertex data length is not a multiple of elementCount");
        b = i;
        c = af.length / i;
        d = ByteBuffer.allocateDirect(af.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(af).position(0);
    }
}
