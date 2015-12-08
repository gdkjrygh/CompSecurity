// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Map;

public interface HttpUrlRequest
{

    public abstract long a();

    public abstract void a(long l1);

    public abstract void a(long l1, boolean flag);

    public abstract void a(String s);

    public abstract void a(String s, ReadableByteChannel readablebytechannel, long l1);

    public abstract void a(String s, byte abyte0[]);

    public abstract int b();

    public abstract String b(String s);

    public abstract String c();

    public abstract IOException d();

    public abstract ByteBuffer e();

    public abstract byte[] f();

    public abstract void g();

    public abstract void h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract Map l();

    public abstract String m();
}
