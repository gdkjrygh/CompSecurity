// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

public interface ost
{

    public abstract int a(long l);

    public abstract int a(android.media.MediaCodec.BufferInfo bufferinfo, long l);

    public abstract void a();

    public abstract void a(int i, int j, int k, long l, int i1);

    public abstract void a(int i, boolean flag);

    public abstract void a(MediaFormat mediaformat, Surface surface, MediaCrypto mediacrypto, int i);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract ByteBuffer[] e();
}
