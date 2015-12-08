// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class clk extends ckq
{

    private final ciy e;
    private final Queue f = new LinkedList();
    private final SurfaceTexture g;
    private volatile boolean h;
    private boolean i;

    private clk(clb clb1, cin cin1, Executor executor)
    {
        super(clb1, executor);
        b.a(cin1, "outputTexture", null);
        e = new ciy(cin1);
        g = new SurfaceTexture(cin1.c());
        g.setOnFrameAvailableListener(new cll(this));
    }

    public static clk a(clb clb1, cin cin1, MediaFormat mediaformat, Executor executor)
    {
        Surface surface;
        Object obj;
        obj = null;
        surface = null;
        b.a(clb1, "codec", null);
        b.a(mediaformat, "inputFormat", null);
        if (clb1.b())
        {
            int j;
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "adaptive codec requires SDK >= 19");
            if (CamcorderProfile.hasProfile(6))
            {
                CamcorderProfile camcorderprofile = CamcorderProfile.get(6);
                j = Math.max(camcorderprofile.videoFrameWidth, camcorderprofile.videoFrameHeight);
            } else
            {
                j = 1920;
            }
            mediaformat.setInteger("max-width", j);
            mediaformat.setInteger("max-height", j);
        }
        executor = new clk(clb1, cin1, executor);
        try
        {
            surface = new Surface(((clk) (executor)).g);
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            clb1 = null;
            continue; /* Loop/switch isn't completed */
        }
_L1:
        cin1 = surface;
        clb1.a(mediaformat, surface);
        dee.a(surface);
        return executor;
        mediaformat;
        clb1 = null;
        executor = surface;
_L4:
        cin1 = clb1;
        dee.a(executor);
        cin1 = clb1;
        throw mediaformat;
        clb1;
_L2:
        dee.a(cin1);
        throw clb1;
        clb1;
        cin1 = obj;
        if (true) goto _L2; else goto _L1
        mediaformat;
        clb1 = surface;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(clk clk1, boolean flag)
    {
        clk1.h = true;
        return true;
    }

    private ciy e()
    {
        while (!f.isEmpty()) 
        {
            int j = a.f();
            if (j != -1)
            {
                byte abyte0[] = (byte[])f.poll();
                a.g()[j].put(abyte0);
                a.a(j, 0, abyte0.length, 0L, 0);
            } else
            {
                return null;
            }
        }
        return (ciy)super.c();
    }

    protected final ciw a(ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, boolean flag)
    {
        if (i)
        {
            if (h)
            {
                i = false;
                g.updateTexImage();
                e.a = bufferinfo.presentationTimeUs;
                e.b = flag;
                csc.b(e.d);
                super.d = -255;
                return e;
            }
        } else
        if (!h)
        {
            a(true);
            i = true;
        }
        return null;
    }

    public final void a()
    {
        super.a();
        dee.a(g);
        dee.a(e.c);
    }

    public final void a(civ civ1)
    {
        b.a(civ1, "source", null);
        boolean flag;
        if (b == null || c.a(b, civ1.b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super.a(civ1);
        if (!flag)
        {
            c.a(a.b(), "non-adaptive format change");
            civ1 = civ1.b();
            f.clear();
            int j = 0;
            while (civ1.containsKey((new StringBuilder(15)).append("csd-").append(j).toString())) 
            {
                ByteBuffer bytebuffer = civ1.getByteBuffer((new StringBuilder(15)).append("csd-").append(j).toString());
                byte abyte0[] = new byte[bytebuffer.limit()];
                bytebuffer.position(0);
                bytebuffer.get(abyte0);
                f.add(abyte0);
                j++;
            }
        }
    }

    public final void a(Object obj)
    {
        b.a((ciy)obj, "videoFrame", e, null);
        h = false;
    }

    public final Object b()
    {
        return e();
    }

    public final ciw c()
    {
        return e();
    }

    public final void d()
    {
        super.d();
        if (h)
        {
            i = false;
            h = false;
            g.updateTexImage();
        }
    }
}
