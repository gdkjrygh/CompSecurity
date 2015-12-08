// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import bolts.h;
import bolts.j;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            c, j, g

public class t extends c
{

    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private FloatBuffer g;
    private FloatBuffer h;
    private int i[];
    private final String j = "attribute vec4 vPosition;attribute vec2 inTexCoord;uniform mat4 modelViewMatrix;varying vec2 texCoord;void main() {  texCoord = inTexCoord;  gl_Position = modelViewMatrix * vPosition;}";
    private final String k = "precision mediump float;uniform sampler2D tex;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(tex, texCoord);}";

    public t(g g1)
    {
        super(g1);
        i = new int[1];
    }

    public static int a(int l, String s)
    {
        l = GLES20.glCreateShader(l);
        com.cardinalblue.android.piccollage.controller.j.a("glCreateShader");
        GLES20.glShaderSource(l, s);
        GLES20.glCompileShader(l);
        return l;
    }

    private static MediaCodecInfo a(String s)
    {
        int j1 = MediaCodecList.getCodecCount();
        int l = 0;
        while (l < j1) 
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(l);
            if (mediacodecinfo.isEncoder())
            {
                String as[] = mediacodecinfo.getSupportedTypes();
                int k1 = as.length;
                int i1 = 0;
                while (i1 < k1) 
                {
                    if (as[i1].equalsIgnoreCase(s))
                    {
                        return mediacodecinfo;
                    }
                    i1++;
                }
            }
            l++;
        }
        return null;
    }

    private void c()
    {
        float af[] = new float[12];
        float[] _tmp = af;
        af[0] = -1F;
        af[1] = -1F;
        af[2] = 0.0F;
        af[3] = -1F;
        af[4] = 1.0F;
        af[5] = 0.0F;
        af[6] = 1.0F;
        af[7] = -1F;
        af[8] = 0.0F;
        af[9] = 1.0F;
        af[10] = 1.0F;
        af[11] = 0.0F;
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(af.length * 4);
        bytebuffer.order(ByteOrder.nativeOrder());
        g = bytebuffer.asFloatBuffer();
        g.put(af);
        g.position(0);
        af = new float[8];
        float[] _tmp1 = af;
        af[0] = 0.0F;
        af[1] = 0.0F;
        af[2] = 0.0F;
        af[3] = 1.0F;
        af[4] = 1.0F;
        af[5] = 0.0F;
        af[6] = 1.0F;
        af[7] = 1.0F;
        bytebuffer = ByteBuffer.allocateDirect(af.length * 4);
        bytebuffer.order(ByteOrder.nativeOrder());
        h = bytebuffer.asFloatBuffer();
        h.put(af);
        h.position(0);
    }

    private void d()
    {
        GLES20.glDeleteTextures(1, i, 0);
        GLES20.glDeleteProgram(b);
    }

    public File a()
        throws c.a, InterruptedException
    {
        Object obj;
        Object obj1;
        int i3;
        int j3;
        int k3;
        i3 = (int)Math.min(a.f, 12F);
        obj1 = a("video/avc");
        if (obj1 == null)
        {
            throw new c.a(this, new Throwable("no avc codec"));
        }
        j3 = a.b & 0xfffffff0;
        k3 = a.c & 0xfffffff0;
        obj = MediaFormat.createVideoFormat("video/avc", j3, k3);
        ((MediaFormat) (obj)).setInteger("color-format", 0x7f000789);
        ((MediaFormat) (obj)).setInteger("bitrate", 0xf4240);
        ((MediaFormat) (obj)).setInteger("frame-rate", i3);
        ((MediaFormat) (obj)).setInteger("i-frame-interval", 10);
        com.cardinalblue.android.piccollage.controller.j j1;
        MediaMuxer mediamuxer;
        obj1 = MediaCodec.createByCodecName(((MediaCodecInfo) (obj1)).getName());
        ((MediaCodec) (obj1)).configure(((MediaFormat) (obj)), null, null, 1);
        obj = ((MediaCodec) (obj1)).createInputSurface();
        ((MediaCodec) (obj1)).start();
        j1 = new com.cardinalblue.android.piccollage.controller.j(((android.view.Surface) (obj)));
        j1.b();
        b();
        mediamuxer = new MediaMuxer(a.a.getAbsolutePath(), 0);
        int l;
        int i1;
        l = -1;
        obj = null;
        i1 = 0;
        float f1;
        android.media.MediaCodec.BufferInfo bufferinfo;
        int l3;
        l3 = (int)(a.g * (float)i3);
        f1 = 1.0F / (float)i3;
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        a.h.e();
        a.h.d();
        boolean flag1 = false;
        h h1;
        int i4;
        i4 = Math.round(100F / (float)l3);
        h1 = new h(Integer.valueOf(0));
        boolean flag;
        int k1;
        k1 = 0;
        flag = false;
_L14:
        if (flag1) goto _L2; else goto _L1
_L1:
        if (flag) goto _L4; else goto _L3
_L3:
        if (k1 != l3) goto _L6; else goto _L5
_L5:
        ((MediaCodec) (obj1)).signalEndOfInputStream();
        flag = true;
_L8:
        bolts.j.a(new Callable(h1, i4) {

            final h a;
            final int b;
            final t c;

            public Void a()
                throws Exception
            {
                a.a(Integer.valueOf(((Integer)a.a()).intValue() + b));
                if (c.a.l != null)
                {
                    c.a.l.a(((Integer)a.a()).intValue());
                }
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                c = t.this;
                a = h1;
                b = l;
                super();
            }
        }, j.b);
        k1++;
_L4:
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j4 = ((MediaCodec) (obj1)).dequeueOutputBuffer(bufferinfo, 10000);
        if (j4 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = l;
        l = i1;
        i1 = l1;
        break MISSING_BLOCK_LABEL_811;
_L6:
        float f2 = k1;
        h h2 = new h();
        bolts.j.a(new Callable(f2 * (f1 * 1000F), j3, k3, h2) {

            final float a;
            final int b;
            final int c;
            final h d;
            final t e;

            public Object call()
                throws Exception
            {
                e.a.h.a((long)a);
                Bitmap bitmap1 = e.a.h.a(b, c);
                Bitmap bitmap = bitmap1;
                if (e.a.i)
                {
                    bitmap = e.a(bitmap1);
                }
                d.a(bitmap);
                return null;
            }

            
            {
                e = t.this;
                a = f1;
                b = l;
                c = i1;
                d = h1;
                super();
            }
        }, j.b).g();
        j1.b();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i[0]);
        GLUtils.texImage2D(3553, 0, (Bitmap)h2.a(), 0);
        float af[] = new float[16];
        Matrix.setIdentityM(af, 0);
        Matrix.rotateM(af, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        Matrix.rotateM(af, 0, 180F, 1.0F, 0.0F, 0.0F);
        a(af);
        j1.a((long)((0xf4240 * k1) / i3 + 132) * 1000L);
        j1.c();
        if (true) goto _L8; else goto _L7
_L7:
        if (j4 != -2)
        {
            break MISSING_BLOCK_LABEL_544;
        }
        obj = ((MediaCodec) (obj1)).getOutputFormat();
        int i2 = l;
        l = i1;
        i1 = i2;
        break MISSING_BLOCK_LABEL_811;
        if (j4 >= 0) goto _L10; else goto _L9
_L9:
        try
        {
            throw new c.a(this, new Throwable((new StringBuilder()).append("unexpected result from encoder.dequeueOutputBuffer: ").append(j4).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
_L11:
        return a.a;
_L10:
        ByteBuffer abytebuffer[] = ((MediaCodec) (obj1)).getOutputBuffers();
        if (abytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_619;
        }
        if (abytebuffer.length >= j4)
        {
            break MISSING_BLOCK_LABEL_662;
        }
        throw new c.a(this, new Throwable((new StringBuilder()).append("encoderOutputBuffer ").append(j4).append(" was null").toString()));
        if ((bufferinfo.flags & 4) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MediaCodec) (obj1)).releaseOutputBuffer(j4, false);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_790;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_775;
        }
        i1 = mediamuxer.addTrack(((MediaFormat) (obj)));
        mediamuxer.start();
        l = 1;
_L12:
        mediamuxer.writeSampleData(i1, abytebuffer[j4], bufferinfo);
        break MISSING_BLOCK_LABEL_811;
_L2:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_741;
        }
        mediamuxer.stop();
        mediamuxer.release();
        d();
        j1.a();
        a.h.f();
        ((MediaCodec) (obj1)).stop();
        ((MediaCodec) (obj1)).release();
          goto _L11
        int j2 = l;
        l = i1;
        i1 = j2;
          goto _L12
        int k2 = l;
        l = i1;
        i1 = k2;
        int l2 = i1;
        i1 = l;
        l = l2;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void a(float af[])
    {
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        GLES20.glClear(16384);
        GLES20.glUseProgram(b);
        GLES20.glVertexAttribPointer(c, 3, 5126, false, 12, g);
        GLES20.glEnableVertexAttribArray(c);
        GLES20.glVertexAttribPointer(d, 2, 5126, false, 8, h);
        GLES20.glEnableVertexAttribArray(d);
        GLES20.glUniformMatrix4fv(f, 1, false, af, 0);
        GLES20.glUniform1i(e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(c);
        GLES20.glDisableVertexAttribArray(d);
    }

    public void b()
    {
        int l = a(35633, "attribute vec4 vPosition;attribute vec2 inTexCoord;uniform mat4 modelViewMatrix;varying vec2 texCoord;void main() {  texCoord = inTexCoord;  gl_Position = modelViewMatrix * vPosition;}");
        if (l == 0)
        {
            throw new RuntimeException("EGL error encountered (see log)");
        }
        int i1 = a(35632, "precision mediump float;uniform sampler2D tex;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(tex, texCoord);}");
        if (i1 == 0)
        {
            throw new RuntimeException("EGL error encountered (see log)");
        }
        b = GLES20.glCreateProgram();
        if (b == 0)
        {
            throw new RuntimeException("EGL error encountered (see log)");
        } else
        {
            GLES20.glAttachShader(b, l);
            GLES20.glAttachShader(b, i1);
            GLES20.glLinkProgram(b);
            c = GLES20.glGetAttribLocation(b, "vPosition");
            d = GLES20.glGetAttribLocation(b, "inTexCoord");
            f = GLES20.glGetUniformLocation(b, "modelViewMatrix");
            e = GLES20.glGetUniformLocation(b, "tex");
            c();
            GLES20.glGenTextures(1, i, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            return;
        }
    }
}
