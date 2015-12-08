// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

final class ajn
{

    int a;
    boolean b;
    int c;
    int d;
    int e;
    FloatBuffer f;
    private String g;
    private boolean h;
    private int i;
    private int j;

    public ajn(String s, int k)
    {
        g = s;
        a = k;
        j = -1;
    }

    public final void a(boolean flag, int k, int l, int i1, float af[])
    {
        h = false;
        b = false;
        c = k;
        d = l;
        e = 5126;
        i = 0;
        if (j != af.length)
        {
            f = ByteBuffer.allocateDirect(af.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
            j = af.length;
        }
        f.put(af).position(0);
    }

    public final String toString()
    {
        return g;
    }
}
