// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class cks extends ckq
{

    private final cix e = new cix();
    private boolean f;
    private boolean g;
    private boolean h;

    private cks(clb clb1, Executor executor)
    {
        super(clb1, executor);
        f = false;
        g = false;
        h = false;
    }

    public static cks a(clb clb1, Executor executor)
    {
        return new cks(clb1, executor);
    }

    protected final ciw a(ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, boolean flag)
    {
        if (f)
        {
            return null;
        }
        if (g && h)
        {
            g = false;
            h = false;
            super.d = -255;
            return null;
        }
        if (bytebuffer.isDirect())
        {
            e.f = bytebuffer;
            e.h = bufferinfo.size;
            e.g = bufferinfo.offset;
            g = true;
        } else
        {
            if (e.f == null || e.f.capacity() < bufferinfo.size)
            {
                e.f = ByteBuffer.allocateDirect(bufferinfo.size);
            }
            bytebuffer.position(bufferinfo.offset);
            bytebuffer.limit(bufferinfo.offset + bufferinfo.size);
            e.f.clear();
            e.f.position(0);
            e.f.limit(bufferinfo.size);
            e.f.put(bytebuffer);
            a(false);
            super.d = -255;
            e.f.clear();
            bytebuffer.clear();
            e.h = bufferinfo.size;
            e.g = 0;
        }
        e.b = flag;
        e.a = bufferinfo.presentationTimeUs;
        e.c = 2;
        e.e = c.getInteger("channel-count");
        e.d = c.getInteger("sample-rate");
        f = true;
        return e;
    }

    public final void a(civ civ1)
    {
        if (b == null)
        {
            a.a(civ1.b());
        }
        super.a(civ1);
    }

    public final void a(Object obj)
    {
        obj = (cix)obj;
        c.a(f, "releasePolled without buffer ownership");
        b.a(obj, "samples", e, null);
        f = false;
        if (g)
        {
            h = true;
            a(false);
            obj.f = null;
        }
    }

    public final void d()
    {
        super.d();
        f = false;
        g = false;
        h = false;
    }
}
