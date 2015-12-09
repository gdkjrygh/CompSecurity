// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dx;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import javax.net.ssl.SSLException;

public interface f
    extends ByteChannel
{

    public abstract int a(ByteBuffer bytebuffer)
        throws SSLException;

    public abstract boolean a();

    public abstract void b()
        throws IOException;

    public abstract boolean c();
}
