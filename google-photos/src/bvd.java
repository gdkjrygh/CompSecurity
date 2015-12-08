// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.GLES20;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public class bvd
{

    private static final String d = bvd.getSimpleName();
    private final boolean A;
    public final dfl a;
    public final Object b = new Object();
    public Thread c;
    private final Object e = new Object();
    private volatile boolean f;
    private volatile boolean g;
    private volatile long h;
    private final buy i = new bvj(this);
    private final Runnable j = new bve(this);
    private final Runnable k = new bvh(this);
    private final Context l;
    private final noj m;
    private final int n;
    private final ckx o;
    private final ckx p;
    private final chq q;
    private final cuu r;
    private final buf s;
    private final bld t;
    private final bmm u;
    private final Executor v;
    private final Executor w;
    private final cko x;
    private final cjs y;
    private final bus z;

    public bvd(Context context, noj noj1, int i1, ckx ckx1, ckx ckx2, chq chq1, cuu cuu1, 
            buf buf1, bld bld1, bmm bmm1, dfl dfl1, Executor executor, Executor executor1, cko cko1, 
            cjs cjs1, bus bus1, boolean flag)
    {
        f = false;
        g = false;
        l = (Context)b.a(context, "context", null);
        m = (noj)b.a(noj1, "movieMakerProvider", null);
        n = i1;
        o = (ckx)b.a(ckx1, "audioDecoderPool", null);
        p = (ckx)b.a(ckx2, "videoDecoderPool", null);
        q = (chq)b.a(chq1, "renderContext", null);
        r = (cuu)b.a(cuu1, "renderer", null);
        s = (buf)b.a(buf1, "stateTracker", null);
        t = (bld)b.a(bld1, "appInfo", null);
        u = (bmm)b.a(bmm1, "deviceInfo", null);
        a = (dfl)b.a(dfl1, "threadFactory", null);
        v = (Executor)b.a(executor, "decoderExecutor", null);
        w = (Executor)b.a(executor1, "mainThreadExecutor", null);
        x = (cko)b.a(cko1, "bitmapFactory", null);
        y = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
        z = (bus)b.a(bus1, "callbacks", null);
        A = flag;
    }

    static long a(bvd bvd1, long l1)
    {
        bvd1.h = l1;
        return l1;
    }

    private long a(bvk bvk1)
    {
        Object obj5;
        Object obj7;
        boolean flag1;
        obj5 = null;
        obj7 = null;
        flag1 = a(bvk1.a);
        int i1;
        long l4;
        i1 = buo.a(flag1);
        l4 = bvk1.a.h;
        long l2;
        l2 = l4;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        l2 = l4 + bvk1.a.i;
        Object obj;
        Object obj9;
        obj9 = new buq(w, z, i1, l2);
        bvk1.d.getParentFile().mkdirs();
        obj = new but(new MediaMuxer(bvk1.d.getAbsolutePath(), buo.a()), i1);
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj6;
        Object obj8;
        boolean flag;
        if (bvk1.c != 0 && bvk1.c != 90)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        b.a(flag, "params.playbackRotation");
        i1 = bvk1.c;
        ((but) (obj)).a.setOrientationHint(i1);
        if (bvk1.f == null)
        {
            break MISSING_BLOCK_LABEL_1517;
        }
        flag = bvk1.f.exists();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1517;
        }
        obj5 = a(bvk1.f, ((but) (obj)), ((buz) (obj9)), flag1);
        bvk1.f.delete();
_L6:
        obj1 = buo.a(bvk1.b, A);
        obj3 = obj1;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj2 = ((bvl) (obj5)).d;
        b.a(obj1, "mediaFormatA", null);
        b.a(obj2, "mediaFormatB", null);
        Exception exception;
        int j1;
        int k1;
        int l1;
        int i2;
        if (((MediaFormat) (obj1)).getInteger("width") == ((MediaFormat) (obj2)).getInteger("width") && ((MediaFormat) (obj1)).getInteger("height") == ((MediaFormat) (obj2)).getInteger("height"))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        obj3 = obj1;
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        Log.w(d, "overriding output format to match resume file");
        obj3 = buo.a(((bvl) (obj5)).d);
        obj1 = clc.d().a(((MediaFormat) (obj3)));
        ((clb) (obj1)).b(((MediaFormat) (obj3)));
        obj2 = ((clb) (obj1)).d();
        r.a();
        p.a();
        obj4 = bvk1.a.g;
        obj6 = q;
        j1 = ((MediaFormat) (obj3)).getInteger("width");
        k1 = ((MediaFormat) (obj3)).getInteger("height");
        l1 = ((cok) (obj4)).a;
        i2 = ((cok) (obj4)).b;
        if (bvk1.c == 90)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((chq) (obj6)).e();
        ((chq) (obj6)).a(true);
        obj6.h = new chv(((chq) (obj6)), obj2, true, l1, i2, j1, k1, true, flag, (byte)0);
        ((chq) (obj6)).h.g();
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        obj3 = ((chq) (obj6)).h;
        r.b();
        ((clb) (obj1)).e();
        obj4 = new bux(((but) (obj)), ((clb) (obj1)), i, a);
        obj4.b = ((buz) (obj9));
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_547;
        }
        ((bux) (obj4)).a(((bvl) (obj5)).c, ((bvl) (obj5)).d);
        obj4.a = ((bvl) (obj5)).e;
        obj4 = ((bux) (obj4)).a();
        ((buv) (obj4)).a();
        if (!flag1) goto _L2; else goto _L1
_L1:
        obj7 = buo.b(bvk1.h);
        obj6 = clc.a(bvk1.g).a(((MediaFormat) (obj7)));
        ((clb) (obj6)).b(((MediaFormat) (obj7)));
        ((clb) (obj6)).e();
        obj8 = new bun(((clb) (obj6)));
        ((ctp) (obj8)).a(2, 44100, 2);
        obj7 = new bux(((but) (obj)), ((clb) (obj6)), i, a);
        obj7.b = ((buz) (obj9));
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_686;
        }
        ((bux) (obj7)).a(((bvl) (obj5)).a, ((bvl) (obj5)).b);
        obj7.a = ((bvl) (obj5)).e;
        obj7 = ((bux) (obj7)).a();
        ((buv) (obj7)).a();
        obj9 = obj7;
        obj7 = obj6;
        obj6 = obj8;
        obj8 = obj9;
_L8:
        obj9 = new cue(l, m, y, o, p, q, r, s, x, bvk1.a, true, v, null, null, null);
        if (obj5 != null) goto _L4; else goto _L3
_L3:
        bvk1 = cuc.a();
_L9:
        ((cue) (obj9)).a(bvk1, ((ctp) (obj6)), ((chp) (obj3)), n);
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L5
        exception;
        bvk1 = ((bvk) (obj4));
        obj4 = obj1;
        obj1 = obj7;
        obj5 = obj;
        obj7 = obj4;
        obj4 = obj3;
        obj3 = obj2;
        obj2 = bvk1;
        obj = obj8;
        bvk1 = exception;
_L7:
        ((but) (obj5)).b();
        dee.a(((ded) (obj6)));
        dej.a(((dei) (obj)));
        dee.a(((ded) (obj1)));
        dej.a(((dei) (obj2)));
        dee.a(p);
        dee.a(r);
        long l3;
        try
        {
            q.b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(d, "exception while disabling recording", ((Throwable) (obj)));
        }
        dee.a(((ded) (obj7)));
        dee.a(((ded) (obj4)));
        dee.a(((android.view.Surface) (obj3)));
        dee.a(((ded) (obj5)));
        r.b();
        throw bvk1;
        obj1;
        bvk1.f.delete();
        obj5 = null;
          goto _L6
        obj1;
        bvk1.f.delete();
        obj5 = null;
          goto _L6
        obj1;
        bvk1.f.delete();
        throw obj1;
        bvk1;
        obj8 = null;
        obj6 = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj5 = obj;
        obj4 = null;
        obj = obj8;
          goto _L7
_L2:
        obj6 = new bum();
        obj8 = null;
        obj7 = null;
          goto _L8
_L4:
        bvk1 = cuc.a(((bvl) (obj5)).e);
          goto _L9
_L5:
        ((clb) (obj1)).j();
        ((buv) (obj4)).c();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1055;
        }
        ((buv) (obj8)).c();
        if (obj5 != null)
        {
            break MISSING_BLOCK_LABEL_1138;
        }
        l3 = 0L;
_L10:
        ((but) (obj)).b();
        dee.a(((ded) (obj6)));
        dej.a(((dei) (obj8)));
        dee.a(((ded) (obj7)));
        dej.a(((dei) (obj4)));
        dee.a(p);
        dee.a(r);
        try
        {
            q.b();
        }
        // Misplaced declaration of an exception variable
        catch (bvk bvk1)
        {
            Log.w(d, "exception while disabling recording", bvk1);
        }
        dee.a(((ded) (obj1)));
        dee.a(((ded) (obj3)));
        dee.a(((android.view.Surface) (obj2)));
        dee.a(((ded) (obj)));
        r.b();
        return l3;
        l3 = ((bvl) (obj5)).e;
          goto _L10
        bvk1;
        obj = null;
        obj6 = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
          goto _L7
        bvk1;
        Object obj10 = null;
        obj6 = null;
        obj8 = null;
        obj2 = null;
        obj3 = null;
        obj7 = obj1;
        obj5 = obj;
        obj4 = null;
        obj = obj10;
        obj1 = obj8;
          goto _L7
        bvk1;
        Object obj11 = null;
        obj6 = null;
        obj8 = null;
        obj3 = obj2;
        obj4 = null;
        obj7 = obj1;
        obj5 = obj;
        obj1 = null;
        obj = obj11;
        obj2 = obj8;
          goto _L7
        bvk1;
        Object obj17 = null;
        obj6 = null;
        Object obj12 = null;
        obj4 = obj2;
        obj5 = obj3;
        obj7 = obj1;
        obj8 = obj;
        obj1 = null;
        obj = obj17;
        obj2 = obj12;
        obj3 = obj4;
        obj4 = obj5;
        obj5 = obj8;
          goto _L7
        bvk1;
        Object obj18 = null;
        obj6 = null;
        obj5 = obj2;
        obj7 = obj3;
        obj8 = obj1;
        Object obj13 = obj;
        obj1 = null;
        obj = obj18;
        obj2 = obj4;
        obj3 = obj5;
        obj4 = obj7;
        obj7 = obj8;
        obj5 = obj13;
          goto _L7
        bvk1;
        Object obj22 = null;
        Object obj19 = null;
        obj5 = obj2;
        obj7 = obj3;
        obj8 = obj1;
        Object obj14 = obj;
        obj1 = obj6;
        obj2 = obj4;
        obj = obj22;
        obj6 = obj19;
        obj3 = obj5;
        obj4 = obj7;
        obj7 = obj8;
        obj5 = obj14;
          goto _L7
        bvk1;
        Object obj23 = null;
        obj5 = obj2;
        obj7 = obj3;
        Object obj15 = obj1;
        Object obj20 = obj;
        obj1 = obj6;
        obj2 = obj4;
        obj = obj23;
        obj6 = obj8;
        obj3 = obj5;
        obj4 = obj7;
        obj7 = obj15;
        obj5 = obj20;
          goto _L7
        bvk1;
        obj5 = obj2;
        Object obj16 = obj3;
        Object obj21 = obj1;
        Object obj24 = obj;
        obj1 = obj6;
        obj2 = obj4;
        obj = obj7;
        obj6 = obj8;
        obj3 = obj5;
        obj4 = obj16;
        obj7 = obj21;
        obj5 = obj24;
          goto _L7
        obj5 = null;
          goto _L6
    }

    private bvl a(File file, but but1, buz buz1, boolean flag)
    {
        MediaFormat mediaformat = null;
        cjt cjt1 = y.a(file.getAbsolutePath());
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        l1 = -1;
        i2 = -1;
        k1 = -1;
        mediaformat = null;
        j1 = -1;
        file = null;
        i1 = 0;
_L22:
        if (i1 >= cjt1.f()) goto _L2; else goto _L1
_L1:
        Object obj = cjt1.a(i1);
        if (!c.a(((MediaFormat) (obj)))) goto _L4; else goto _L3
_L3:
        if (i2 == -1) goto _L6; else goto _L5
_L5:
        throw new bvi("there should only be one audio track");
        file;
        but1 = cjt1;
_L21:
        dee.a(but1);
        throw file;
        file;
        throw c.a("Resume file unexpectedly missing.");
        file;
        throw new bvi(file);
_L6:
        k1 = but1.a(((MediaFormat) (obj)));
        mediaformat = cjt1.a(i1);
        i2 = i1;
        int j2 = l1;
        l1 = j1;
        j1 = j2;
          goto _L7
_L4:
        if (!c.b(((MediaFormat) (obj)))) goto _L9; else goto _L8
_L8:
        if (l1 == -1)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        throw new bvi("there should only be one video track");
        l1 = but1.a(((MediaFormat) (obj)));
        file = cjt1.a(i1);
        j1 = i1;
          goto _L7
_L9:
        file = String.valueOf(obj);
        throw new bvi((new StringBuilder(String.valueOf(file).length() + 25)).append("unexpected track format: ").append(file).toString());
_L2:
        if (!flag || i2 != -1)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        throw new bvi("there should be an audio track");
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        throw new bvi("there should be a video track");
        long l3;
        long l4;
        l3 = 0L;
        l4 = 0L;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        cjt1.b(i2);
        cjt1.b(l1);
_L14:
        i1 = cjt1.e();
        if (i1 == -1) goto _L11; else goto _L10
_L10:
        long l5 = cjt1.d();
        if (i1 != i2) goto _L13; else goto _L12
_L12:
        l3 = l5;
_L25:
        cjt1.b();
          goto _L14
_L24:
        throw new bvi((new StringBuilder(41)).append("invalid track from extractor: ").append(i1).toString());
_L11:
        cjt1.a(0L, 0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        cjt1.b(i2);
        cjt1.b(l1);
        if (!flag)
        {
            l3 = 0x7fffffffffffffffL;
        }
        l3 = Math.min(l3, l4);
        if (l3 == 0L)
        {
            dee.a(cjt1);
            return null;
        }
        ByteBuffer bytebuffer;
        obj = new android.media.MediaCodec.BufferInfo();
        bytebuffer = ByteBuffer.allocateDirect(buo.c());
_L17:
        int k2;
        if (cjt1.e() == -1)
        {
            break MISSING_BLOCK_LABEL_691;
        }
        obj.size = cjt1.a(bytebuffer, 0);
        if (((android.media.MediaCodec.BufferInfo) (obj)).size < 0)
        {
            throw new bvi("failed to read sample");
        }
        obj.presentationTimeUs = cjt1.d();
        obj.flags = cjt1.c();
        obj.offset = 0;
        k2 = cjt1.e();
        i1 = -1;
        if (k2 != i2) goto _L16; else goto _L15
_L15:
        if (((android.media.MediaCodec.BufferInfo) (obj)).presentationTimeUs < l3)
        {
            i1 = k1;
        }
_L19:
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_679;
        }
        but1.a(i1, bytebuffer, ((android.media.MediaCodec.BufferInfo) (obj)));
        buz1.a(i1, ((android.media.MediaCodec.BufferInfo) (obj)).presentationTimeUs);
_L20:
        cjt1.b();
          goto _L17
_L16:
        if (k2 != l1)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        if (((android.media.MediaCodec.BufferInfo) (obj)).presentationTimeUs >= l3) goto _L19; else goto _L18
_L18:
        i1 = j1;
          goto _L19
        throw new bvi((new StringBuilder(41)).append("invalid track from extractor: ").append(k2).toString());
        cjt1.c(k2);
          goto _L20
        file = new bvl(k1, mediaformat, j1, file, l3);
        dee.a(cjt1);
        return file;
        file;
        but1 = mediaformat;
          goto _L21
_L7:
        i1++;
        int l2 = j1;
        j1 = l1;
        l1 = l2;
          goto _L22
_L13:
        if (i1 != l1) goto _L24; else goto _L23
_L23:
        l4 = l5;
          goto _L25
    }

    static Object a(bvd bvd1)
    {
        return bvd1.b;
    }

    static String a()
    {
        return d;
    }

    static Thread a(bvd bvd1, Thread thread)
    {
        bvd1.c = null;
        return null;
    }

    static void a(bvd bvd1, bvk bvk1)
    {
        MediaFormat mediaformat;
        MediaFormat mediaformat1;
        mediaformat = buo.a(bvk1.b, bvd1.A);
        mediaformat1 = buo.b(bvk1.h);
        bvk1.e.getParentFile().mkdirs();
        FileWriter filewriter = new FileWriter(bvk1.e);
        Object obj = filewriter;
        filewriter.write("Storyboard: ");
        obj = filewriter;
        filewriter.write(bvk1.a.toString());
        obj = filewriter;
        filewriter.write(10);
        obj = filewriter;
        filewriter.write("Resolution: ");
        obj = filewriter;
        filewriter.write(bvk1.b.toString());
        obj = filewriter;
        filewriter.write(10);
        obj = filewriter;
        filewriter.write("VideoFormat: ");
        obj = filewriter;
        filewriter.write(mediaformat.toString());
        obj = filewriter;
        filewriter.write(10);
        obj = filewriter;
        filewriter.write("AudioFormat: ");
        obj = filewriter;
        filewriter.write(mediaformat1.toString());
        obj = filewriter;
        filewriter.write(10);
        obj = filewriter;
        filewriter.write(10);
        obj = filewriter;
        filewriter.write("hasAudio: ");
        obj = filewriter;
        if (a(bvk1.a))
        {
            bvk1 = "true";
        } else
        {
            bvk1 = "false";
        }
        obj = filewriter;
        filewriter.write(bvk1);
        obj = filewriter;
        filewriter.write("AppInfo: ");
        obj = filewriter;
        filewriter.write(bvd1.t.toString());
        obj = filewriter;
        filewriter.write(10);
        obj = filewriter;
        filewriter.write("DeviceInfo");
        obj = filewriter;
        filewriter.write(bvd1.u.toString());
        obj = filewriter;
        filewriter.write(10);
        b.a(filewriter);
        return;
        bvk1;
        bvd1 = null;
_L4:
        obj = bvd1;
        Log.e(d, "failed to write metadata", bvk1);
        b.a(bvd1);
        return;
        bvd1;
        obj = null;
_L2:
        b.a(((java.io.Closeable) (obj)));
        throw bvd1;
        bvd1;
        if (true) goto _L2; else goto _L1
_L1:
        bvk1;
        bvd1 = filewriter;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(bvd bvd1, boolean flag)
    {
        bvd1.f = flag;
        return flag;
    }

    private static boolean a(cqf cqf1)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < cqf1.b())
                {
                    if (cqf1.a(i1).a() <= 0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    static long b(bvd bvd1, bvk bvk1)
    {
        return bvd1.a(bvk1);
    }

    static Thread b(bvd bvd1)
    {
        return bvd1.c;
    }

    static boolean b(bvd bvd1, boolean flag)
    {
        bvd1.g = flag;
        return flag;
    }

    static Object c(bvd bvd1)
    {
        return bvd1.e;
    }

    static chq d(bvd bvd1)
    {
        return bvd1.q;
    }

    static Runnable e(bvd bvd1)
    {
        return bvd1.j;
    }

    static Executor f(bvd bvd1)
    {
        return bvd1.w;
    }

    static Runnable g(bvd bvd1)
    {
        return bvd1.k;
    }

    static boolean h(bvd bvd1)
    {
        return bvd1.f;
    }

    static boolean i(bvd bvd1)
    {
        return bvd1.g;
    }

    static bus j(bvd bvd1)
    {
        return bvd1.z;
    }

    static long k(bvd bvd1)
    {
        return bvd1.h;
    }

}
