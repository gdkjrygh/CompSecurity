// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

public interface clb
    extends ded
{

    public abstract int a(android.media.MediaCodec.BufferInfo bufferinfo);

    public abstract void a(int i1, int j1, int k1, long l1, int i2);

    public abstract void a(int i1, boolean flag);

    public abstract void a(MediaFormat mediaformat);

    public abstract void a(MediaFormat mediaformat, Surface surface);

    public abstract void b(MediaFormat mediaformat);

    public abstract boolean b();

    public abstract boolean c();

    public abstract Surface d();

    public abstract void e();

    public abstract int f();

    public abstract ByteBuffer[] g();

    public abstract ByteBuffer[] h();

    public abstract MediaFormat i();

    public abstract void j();

    public abstract void k();

    public abstract void l();
}
