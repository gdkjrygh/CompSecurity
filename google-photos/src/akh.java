// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class akh extends akn
{

    private final float d[] = new float[16];
    private final int e;
    private final int f;
    private ajl g;
    private SurfaceTexture h;
    private ajz i;
    private boolean j;
    private long k;

    public akh(int l, MediaFormat mediaformat, akl akl)
    {
        super(l, mediaformat, akl);
        e = mediaformat.getInteger("width");
        f = mediaformat.getInteger("height");
    }

    private boolean j()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            while (!c) 
            {
                a.wait();
            }
            break MISSING_BLOCK_LABEL_29;
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long a()
    {
        return k * 1000L;
    }

    protected final MediaCodec a(MediaFormat mediaformat)
    {
        i = ajz.b();
        h = new SurfaceTexture(i.a);
        h.setOnFrameAvailableListener(new aki(this));
        MediaCodec mediacodec;
        try
        {
            Surface surface = new Surface(h);
            mediacodec = MediaCodec.createDecoderByType(mediaformat.getString("mime"));
            mediacodec.configure(mediaformat, surface, null, 0);
            surface.release();
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            return null;
        }
        return mediacodec;
    }

    protected final void a(ahv ahv1, aig aig1, int l, int i1)
    {
        ajl ajl1;
        int j1;
        int k1;
        h.updateTexImage();
        h.getTransformMatrix(d);
        if (g == null)
        {
            g = new ajl("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
            g.b(0.0F, 1.0F, 1.0F, -1F);
        }
        ajl1 = g;
        ajl1.b(d);
        j1 = e;
        k1 = f;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        i1;
        JVM INSTR lookupswitch 4: default 128
    //                   0: 377
    //                   90: 138
    //                   180: 285
    //                   270: 331;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException("Unsupported rotation angle.");
_L3:
        float af[];
        af = new float[8];
        af;
        af[0] = 0.0F;
        af[1] = 0.0F;
        af[2] = 0.0F;
        af[3] = 1.0F;
        af[4] = 1.0F;
        af[5] = 0.0F;
        af[6] = 1.0F;
        af[7] = 1.0F;
_L6:
        ajl1.c(af);
        if (!a(i1))
        {
            break MISSING_BLOCK_LABEL_423;
        }
        j1 = f;
        i1 = e;
_L7:
        af = b.a(j1, i1, l);
        ahv1.a(af);
        ajl1.a(i, ahv1.p(), af[0], af[1]);
        ahv1.a(a());
        ahv1.k();
        if (aig1 != null)
        {
            aig1.a(new akm(j));
            aig1.a(a());
        }
        return;
_L4:
        af = new float[8];
        af;
        af[0] = 1.0F;
        af[1] = 0.0F;
        af[2] = 0.0F;
        af[3] = 0.0F;
        af[4] = 1.0F;
        af[5] = 1.0F;
        af[6] = 0.0F;
        af[7] = 1.0F;
          goto _L6
_L5:
        af = new float[8];
        af;
        af[0] = 1.0F;
        af[1] = 1.0F;
        af[2] = 1.0F;
        af[3] = 0.0F;
        af[4] = 0.0F;
        af[5] = 1.0F;
        af[6] = 0.0F;
        af[7] = 0.0F;
          goto _L6
_L2:
        af = new float[8];
        af;
        af[0] = 0.0F;
        af[1] = 1.0F;
        af[2] = 1.0F;
        af[3] = 1.0F;
        af[4] = 0.0F;
        af[5] = 0.0F;
        af[6] = 1.0F;
        af[7] = 0.0F;
          goto _L6
        i1 = k1;
          goto _L7
    }

    protected final boolean a(MediaCodec mediacodec, ByteBuffer abytebuffer[], int l, android.media.MediaCodec.BufferInfo bufferinfo, boolean flag)
    {
        boolean flag1 = h();
        k = bufferinfo.presentationTimeUs;
        j = flag;
        mediacodec.releaseOutputBuffer(l, flag1);
        if (flag1 && j())
        {
            f();
        }
        return false;
    }

    public final void c()
    {
        super.c();
        synchronized (a)
        {
            i.e();
            h.release();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
