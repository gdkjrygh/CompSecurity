// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame;

import java.io.IOException;

// Referenced classes of package net.jarlehansen.protobuf.javame:
//            d

public abstract class a
    implements d
{

    public a()
    {
    }

    public byte[] N()
        throws IOException
    {
        byte abyte0[] = O();
        b(abyte0);
        return abyte0;
    }

    public byte[] O()
    {
        return new byte[b()];
    }

    public abstract void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException;

    public abstract int b();

    public void b(byte abyte0[])
        throws IOException
    {
        a(new net.jarlehansen.protobuf.javame.b.a(abyte0));
    }
}
