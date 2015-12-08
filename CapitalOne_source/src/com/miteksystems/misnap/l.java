// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;
import org.apache.sanselan.formats.tiff.constants.ExifTagConstants;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffFieldTypeConstants;
import org.apache.sanselan.formats.tiff.write.TiffOutputDirectory;
import org.apache.sanselan.formats.tiff.write.TiffOutputField;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.miteksystems.misnap:
//            m, n, o, MiSnap, 
//            MiSnapAPI, q, u, MitekAnalyzer, 
//            r, am, p

public final class l extends SurfaceView
    implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.ErrorCallback, android.hardware.Camera.PictureCallback, android.hardware.Camera.PreviewCallback, android.view.SurfaceHolder.Callback
{

    private static final Uri l = Uri.parse("file:///system/media/audio/ui/camera_click.ogg");
    private static final ArrayList m = new ArrayList(Arrays.asList(new String[] {
        "DROID BIONIC", "DROID RAZR MAXX HD", "GT-I9300", "GT-N7100", "HTC Desire HD A9191", "PantechP9070"
    }));
    private static MediaPlayer n;
    private static boolean o = false;
    private Handler A;
    Camera a;
    int b;
    int c;
    boolean d;
    Runnable e;
    Runnable f;
    Runnable g;
    private MiSnap h;
    private MitekAnalyzer i;
    private u j;
    private Handler k;
    private byte p[];
    private Camera q;
    private android.hardware.Camera.Parameters r;
    private android.hardware.Camera.Size s;
    private boolean t;
    private byte u[];
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    l(Context context, Camera camera, Handler handler)
    {
        super(context);
        p = null;
        t = false;
        a = null;
        x = false;
        y = false;
        d = false;
        e = new m(this);
        f = new n(this);
        g = new o(this);
        h = (MiSnap)context;
        getHolder().addCallback(this);
        getHolder().setType(3);
        k = new Handler();
        o = false;
        A = handler;
        q = camera;
    }

    private android.hardware.Camera.Size a(android.hardware.Camera.Size size)
    {
        if (!h.l) goto _L2; else goto _L1
_L1:
        size = q;
        size.getClass();
        size = new android.hardware.Camera.Size(size, 1920, 1080);
_L10:
        return size;
_L2:
        double d1;
        double d3;
        List list;
        Iterator iterator;
        int i1;
        int k1;
        int l1;
        if (h.m)
        {
            size = q;
            size.getClass();
            return new android.hardware.Camera.Size(size, 1280, 720);
        }
        list = m().getSupportedPreviewSizes();
        if (list == null || list.size() == 0)
        {
            return null;
        }
        if (list.contains(size))
        {
            return size;
        }
        k1 = size.width;
        l1 = size.height;
        d3 = (double)l1 / (double)k1;
        iterator = list.iterator();
        size = null;
        d1 = 1.7976931348623157E+308D;
        i1 = 0x4b000;
_L7:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        android.hardware.Camera.Size size1 = size;
        if (size != null) goto _L6; else goto _L5
_L5:
        iterator = list.iterator();
_L8:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_379;
        }
        size1 = size;
_L6:
        size = size1;
        double d2;
        int j1;
        if (size != null)
        {
            if (600 > size.height && h.a.b())
            {
                Log.w("MiSnap", (new StringBuilder("warning: previewFrame size (")).append(size.width).append("x").append(size.height).append(") insufficient for AllowVideoFrames").toString());
                return null;
            } else
            {
                (new StringBuilder("preview size ")).append(size.width).append("x").append(size.height).toString();
                return size;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        size1 = (android.hardware.Camera.Size)iterator.next();
        d2 = (double)size1.height / (double)size1.width;
        j1 = size1.width * size1.height;
        if (d3 == d2 && (d3 == d1 && j1 >= i1 || d3 != d1 && j1 >= 0x4b000) || Math.abs(d3 - d2) < Math.abs(d3 - d1) && j1 >= i1)
        {
            d1 = d2;
            i1 = j1;
            size = size1;
        }
          goto _L7
        size1 = (android.hardware.Camera.Size)iterator.next();
        if (size1.width <= k1 && size1.height <= l1)
        {
            j1 = size1.width * size1.height;
            if (size == null || (size1.width > size.width || size1.height > size.height) && j1 > i1)
            {
                i1 = j1;
                size = size1;
            }
        }
          goto _L8
        if (list.size() != 1) goto _L10; else goto _L9
_L9:
        return (android.hardware.Camera.Size)list.get(0);
    }

    private static android.hardware.Camera.Size a(List list, int i1)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((android.hardware.Camera.Size) (obj));
_L2:
        Iterator iterator = list.iterator();
        list = null;
        double d1 = 1.7976931348623157E+308D;
        do
        {
            obj = list;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (android.hardware.Camera.Size)iterator.next();
            double d2 = Math.abs(((android.hardware.Camera.Size) (obj)).width - i1);
            if (d2 < d1 && ((android.hardware.Camera.Size) (obj)).width >= i1 && (double)((android.hardware.Camera.Size) (obj)).height > 0.5625D * (double)i1)
            {
                d1 = d2;
                list = ((List) (obj));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Camera a(l l1)
    {
        return l1.q;
    }

    private static void a(Context context)
    {
        int i1 = ((AudioManager)context.getSystemService("audio")).getStreamVolume(5);
        if (i1 != 0)
        {
            if (n == null)
            {
                MediaPlayer mediaplayer = MediaPlayer.create(context, l);
                n = mediaplayer;
                long al[];
                if (mediaplayer != null)
                {
                    n.setOnPreparedListener(new q(i1));
                } else
                {
                    Log.w("MiSnapCamera", (new StringBuilder()).append(l).append(" still null after create()").toString());
                }
            } else
            {
                n.setVolume(i1, i1);
                n.start();
            }
        }
        context = (Vibrator)context.getSystemService("vibrator");
        al = new long[4];
        al[1] = 100L;
        al[2] = 100L;
        al[3] = 200L;
        context.vibrate(al, -1);
    }

    static void a(l l1, SurfaceHolder surfaceholder)
    {
        boolean flag2 = false;
        Object obj = l1.m();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = ((android.hardware.Camera.Parameters) (obj)).getSupportedFocusModes();
        (new StringBuilder("focusModes=")).append(obj1).toString();
        l1.h.k = ((List) (obj1)).contains("auto");
        if (!l1.h.k)
        {
            l1.h.k = l1.getContext().getPackageManager().hasSystemFeature("android.hardware.camera.autofocus");
        }
        if (l1.h.j)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (!l1.h.k)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        obj1 = ((android.hardware.Camera.Parameters) (obj)).getSupportedPreviewSizes();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (((List) (obj1)).size() != 0)
        {
            Object obj2 = l1.q;
            obj2.getClass();
            obj2 = new android.hardware.Camera.Size(((Camera) (obj2)), 1920, 1080);
            Object obj3 = l1.q;
            obj3.getClass();
            obj3 = new android.hardware.Camera.Size(((Camera) (obj3)), 1280, 720);
            boolean flag = ((List) (obj1)).contains(obj2);
            boolean flag3 = ((List) (obj1)).contains(obj3);
            l1.h.a(flag, flag3);
        }
_L3:
        (new StringBuilder("focusMode=")).append(((android.hardware.Camera.Parameters) (obj)).getFocusMode()).append("; hasAutoFocus=").append(l1.n()).append("; sendingVideoFrames=").append(l1.h.a.b()).toString();
        obj1 = a(((android.hardware.Camera.Parameters) (obj)).getSupportedPictureSizes(), l1.h.a.e());
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        try
        {
            l1.h.a(0, new Intent(), "CameraNotSufficient");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            Log.e("MiSnapCamera", (new StringBuilder("Error starting camera preview: ")).append(l1.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_341;
        l1.h.j = true;
          goto _L3
        return;
        ((android.hardware.Camera.Parameters) (obj)).setPictureSize(((android.hardware.Camera.Size) (obj1)).width, ((android.hardware.Camera.Size) (obj1)).height);
        obj1 = l1.a(((android.hardware.Camera.Size) (obj1)));
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        ((android.hardware.Camera.Parameters) (obj)).setPreviewSize(((android.hardware.Camera.Size) (obj1)).width, ((android.hardware.Camera.Size) (obj1)).height);
_L21:
        if (!l1.h.l && !l1.h.m) goto _L7; else goto _L6
_L6:
        if (!l1.h.w) goto _L9; else goto _L8
_L8:
        l1.a(true);
_L22:
        ((android.hardware.Camera.Parameters) (obj)).setPictureFormat(256);
        ((android.hardware.Camera.Parameters) (obj)).setPreviewFormat(17);
        ((android.hardware.Camera.Parameters) (obj)).setJpegQuality(l1.h.a.f());
        obj1 = Build.MODEL;
        (new StringBuilder("Build.MODEL: ")).append(((String) (obj1))).toString();
        if (!m.contains(obj1) && l1.e()) goto _L11; else goto _L10
_L10:
        obj1 = ((android.hardware.Camera.Parameters) (obj)).getSupportedSceneModes();
        (new StringBuilder("Scene modes=")).append(obj1).toString();
        if (obj1 == null) goto _L11; else goto _L12
_L12:
        if (((List) (obj1)).size() != 0 && ((List) (obj1)).contains("steadyphoto"))
        {
            ((android.hardware.Camera.Parameters) (obj)).setSceneMode("steadyphoto");
        }
_L11:
        l1.q.setParameters(((android.hardware.Camera.Parameters) (obj)));
        if (l1.m() != null)
        {
            obj = l1.m().getPictureSize();
            obj1 = l1.m().getPreviewSize();
            (new StringBuilder("Photo size=")).append(((android.hardware.Camera.Size) (obj)).width).append("x").append(((android.hardware.Camera.Size) (obj)).height).append("; Preview size=").append(((android.hardware.Camera.Size) (obj1)).width).append("x").append(((android.hardware.Camera.Size) (obj1)).height).toString();
        }
        obj = l1.h;
        if (MiSnap.d() && l1.h.a.aj() != 0) goto _L14; else goto _L13
_L13:
        if (l1.j == null) goto _L16; else goto _L15
_L15:
        l1.b(l1.j);
        if (!l1.h.a.b()) goto _L18; else goto _L17
_L17:
        l1.j.j();
_L16:
        l1.q.setPreviewDisplay(surfaceholder);
        l1.q.startPreview();
        if (!l1.h.a.b()) goto _L20; else goto _L19
_L19:
        o = false;
        l1.q.setPreviewCallback(l1);
        surfaceholder = l1.h;
        if (!MiSnap.d())
        {
            l1.A.sendEmptyMessage(15);
            return;
        }
          goto _L14
_L5:
        l1.h.a.a();
          goto _L21
_L7:
        l1.h.a.a();
          goto _L6
_L9:
        boolean flag1;
        boolean flag4;
        flag1 = l1.h.a.b();
        flag4 = l1.h.a.n().contains("LICENSE");
        l1.h.e();
        JVM INSTR tableswitch 0 3: default 1017
    //                   0 836
    //                   1 860
    //                   2 1020
    //                   3 946;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        l1.a(false);
        l1.h.w = false;
        l1.h.p = true;
          goto _L22
_L24:
        if (!flag4) goto _L28; else goto _L27
_L27:
        l1.a(false);
        l1.h.w = false;
        l1.h.p = true;
          goto _L22
_L28:
        if (!flag1) goto _L30; else goto _L29
_L29:
        l1.a(false);
          goto _L22
_L30:
        l1.p();
          goto _L22
_L33:
        l1.a(flag1);
        obj1 = l1.h;
        if (flag4)
        {
            flag1 = flag2;
        } else
        {
            flag1 = true;
        }
        obj1.w = flag1;
        l1.h.p = true;
          goto _L22
_L26:
        if (!flag1) goto _L32; else goto _L31
_L31:
        l1.a(false);
          goto _L22
_L32:
        l1.p();
          goto _L22
_L2:
        l1.h.a(0, new Intent(), "CameraNotSufficient");
        return;
_L18:
        l1.j.l();
          goto _L16
_L20:
        surfaceholder = l1.h;
        if (!MiSnap.d())
        {
            l1.A.sendEmptyMessage(12);
        }
_L14:
        return;
_L25:
        if (flag4)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
          goto _L33
    }

    static void a(l l1, boolean flag)
    {
        l1.t = flag;
    }

    private byte[] a(int i1)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int j1;
        bytearrayoutputstream = new ByteArrayOutputStream();
        j1 = m().getPreviewFormat();
        if (17 != j1) goto _L2; else goto _L1
_L1:
        (new YuvImage(u, 17, b, c, null)).compressToJpeg(new Rect(0, 0, b, c), i1, bytearrayoutputstream);
_L4:
        u = null;
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        try
        {
            bytearrayoutputstream.close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return abyte0;
        }
        return abyte0;
_L2:
        if (256 == j1 || 4 == j1)
        {
            abyte0 = BitmapFactory.decodeByteArray(u, 0, u.length);
            abyte0.compress(android.graphics.Bitmap.CompressFormat.JPEG, i1, bytearrayoutputstream);
            abyte0.recycle();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static byte[] a(byte abyte0[], String s1)
    {
        TiffOutputSet tiffoutputset = new TiffOutputSet(77);
        s1 = ExifTagConstants.dk.a(TiffFieldTypeConstants.g_, s1, tiffoutputset.a);
        s1 = new TiffOutputField(ExifTagConstants.dk, ExifTagConstants.dk.c[0], s1.length, s1);
        tiffoutputset.c().a(s1);
        s1 = new ByteArrayOutputStream(100);
        (new ExifRewriter()).a(abyte0, s1, tiffoutputset);
_L1:
        return s1.toByteArray();
        abyte0;
        s1 = null;
_L4:
        abyte0.printStackTrace();
          goto _L1
        abyte0;
        s1 = null;
_L3:
        abyte0.printStackTrace();
          goto _L1
        abyte0;
        s1 = null;
_L2:
        abyte0.printStackTrace();
          goto _L1
        abyte0;
          goto _L2
        abyte0;
          goto _L3
        abyte0;
          goto _L4
    }

    private void b(u u1)
    {
        if (m() != null && u1 != null)
        {
            android.hardware.Camera.Size size = m().getPreviewSize();
            u1.a(size.width, size.height);
            u1.a(e());
        }
    }

    static boolean b(l l1)
    {
        return l1.x;
    }

    private byte[] b(int i1)
    {
        double d1 = (float)s.height / (float)s.width;
        Object obj;
        int j1;
        int k1;
        if (0.5625D == d1)
        {
            j1 = 1920;
        } else
        {
            j1 = 1600;
        }
        k1 = (int)(d1 * (double)(float)j1);
        obj = new android.graphics.BitmapFactory.Options();
        obj.inScaled = false;
        obj.inPurgeable = false;
        obj = BitmapFactory.decodeByteArray(p, 0, p.length, ((android.graphics.BitmapFactory.Options) (obj)));
        p = null;
        if (obj == null)
        {
            return null;
        }
        if (s.width > j1)
        {
            byte abyte0[];
            Object obj1;
            IOException ioexception;
            try
            {
                obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), j1, k1, true);
                ((Bitmap) (obj)).recycle();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return null;
            }
            obj = obj1;
        }
        obj1 = new ByteArrayOutputStream();
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, i1, ((java.io.OutputStream) (obj1)));
        ((Bitmap) (obj)).recycle();
        abyte0 = ((ByteArrayOutputStream) (obj1)).toByteArray();
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return abyte0;
        }
        return abyte0;
    }

    static boolean c(l l1)
    {
        return l1.w;
    }

    static Handler d(l l1)
    {
        return l1.k;
    }

    static MitekAnalyzer e(l l1)
    {
        return l1.i;
    }

    static u f(l l1)
    {
        return l1.j;
    }

    static MiSnap g(l l1)
    {
        return l1.h;
    }

    static byte[] h(l l1)
    {
        return l1.u;
    }

    static void i(l l1)
    {
        boolean flag2 = true;
        StringBuilder stringbuilder;
        boolean flag;
        boolean flag1;
        boolean flag3;
        if (!l1.w && !l1.x)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = new StringBuilder("HardwareIsReady == (!pictureInProgress=");
        if (l1.w)
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        stringbuilder = stringbuilder.append(flag3).append(", !focusing=");
        if (l1.x)
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        stringbuilder.append(flag3).append(")").toString();
        flag1 = flag;
        if (flag)
        {
            flag1 = flag;
            if (l1.h.a.b())
            {
                if (l1.h.c != null && l1.r())
                {
                    flag = flag2;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
            }
        }
        if (flag1)
        {
            l1.t();
        }
    }

    private android.hardware.Camera.Parameters m()
    {
        try
        {
            if (r == null && q != null)
            {
                r = q.getParameters();
            }
        }
        catch (Exception exception)
        {
            r = null;
            return null;
        }
        return r;
    }

    private boolean n()
    {
        return h != null && h.k;
    }

    private void o()
    {
        this;
        JVM INSTR monitorenter ;
        u = null;
        Exception exception;
        try
        {
            if (q != null)
            {
                if (n())
                {
                    q.cancelAutoFocus();
                }
                q.setPreviewCallback(null);
                q.stopPreview();
                q.release();
                q = null;
                d = false;
            }
        }
        catch (Exception exception1) { }
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    private void p()
    {
        android.hardware.Camera.Parameters parameters;
        try
        {
            parameters = m();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (parameters == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (q())
        {
            parameters.setFlashMode("auto");
            if (q != null)
            {
                q.setParameters(parameters);
            }
        }
    }

    private boolean q()
    {
        if (q == null)
        {
            return false;
        }
        Object obj = q.getParameters();
        if (obj == null || ((android.hardware.Camera.Parameters) (obj)).getFlashMode() == null)
        {
            return false;
        }
        obj = ((android.hardware.Camera.Parameters) (obj)).getSupportedFlashModes();
        return obj != null && !((List) (obj)).isEmpty() && (((List) (obj)).size() != 1 || !((String)((List) (obj)).get(0)).equals("off"));
    }

    private boolean r()
    {
        boolean flag2;
label0:
        {
            flag2 = false;
            synchronized (h.g)
            {
                if (!h.f())
                {
                    break label0;
                }
            }
            return false;
        }
        if (h.c != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        exception;
        throw exception;
        boolean flag;
        boolean flag1;
        if (h.c.a() && h.c.d() && (h.c.b() || h.c.c()) && h.c.l() != null && 5 == h.c.l().size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        z = 0;
        flag1 = flag2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        flag1 = flag2;
        if (!h.f())
        {
            flag1 = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag1;
    }

    private void s()
    {
        k.removeCallbacks(e);
        i.r();
        v = System.currentTimeMillis();
        w = true;
        try
        {
            q.takePicture(null, null, null, this);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        h.a(0, null, "VideoCaptureFailed");
    }

    private void t()
    {
        boolean flag = false;
        int i1;
        if (!y && r())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (y || i1 != 0 && z + 1 >= h.a.d())
        {
            k.removeCallbacks(e);
            q.setPreviewCallback(null);
        }
        if (y)
        {
            i1 = 1;
        } else
        if (i1 != 0)
        {
            boolean flag1;
            if (h.a.b())
            {
                Rect rect = i.o();
                i1 = i.a(u, b, rect.left, rect.top, rect.right - rect.left, rect.bottom - rect.top, h.a.n());
                (new StringBuilder("Preview oof [")).append(i1).append("] vs threshold [").append(h.a.h()).append("], cropRect = ").append(rect).toString();
                if (r.a)
                {
                    j.a(Integer.valueOf(i1));
                }
                if (i1 >= h.a.h())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                (new StringBuilder("useThisVideoFrame: ")).append(flag).toString();
                flag1 = flag;
                if (!flag)
                {
                    z = 0;
                    flag1 = flag;
                }
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                z = z + 1;
                h.a(R.string.uxp_measured_videoframe);
            }
            i1 = 0;
            flag = flag1;
        } else
        {
            i1 = 0;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (z < h.a.d()) goto _L4; else goto _L3
_L3:
        w = true;
        k.removeCallbacks(e);
        a();
        if (h.a.b())
        {
            h.a(R.string.uxp_capture_time);
        }
        a(h);
        j.a();
_L6:
        return;
_L4:
        h.a(R.string.uxp_consecutive_frame_count, z);
        return;
_L2:
        if (!h.f())
        {
            if (i1 != 0)
            {
                s();
                return;
            }
            if (!h.f())
            {
                q.setPreviewCallback(this);
                k.postDelayed(e, 1500L);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void a()
    {
        try
        {
            t = true;
            w = true;
            if (i != null)
            {
                i.p();
            }
            if (q != null)
            {
                if (n())
                {
                    q.cancelAutoFocus();
                }
                q.setPreviewCallback(null);
                q.stopPreview();
            }
            k.removeCallbacks(e);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    final void a(MitekAnalyzer mitekanalyzer)
    {
        i = mitekanalyzer;
    }

    public final void a(u u1)
    {
        j = u1;
    }

    final void a(boolean flag)
    {
        Object obj;
        android.hardware.Camera.Parameters parameters;
        try
        {
            parameters = m();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        if (parameters == null) goto _L2; else goto _L1
_L1:
        if (parameters.getFlashMode() == null)
        {
            return;
        }
        if (!e()) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        obj = "torch";
_L10:
        parameters.setFlashMode(((String) (obj)));
        q.setParameters(parameters);
        return;
_L5:
        if (!Build.MODEL.contains("Behold II")) goto _L7; else goto _L6
_L6:
        parameters.set("flash-value", 1);
          goto _L8
_L7:
        parameters.set("flash-value", 2);
          goto _L8
_L2:
        return;
_L8:
        obj = "off";
        if (true) goto _L10; else goto _L9
_L9:
    }

    final void b()
    {
        w = false;
        x = false;
        if (h.a.b())
        {
            t = false;
        }
        if (i != null)
        {
            i.q();
        }
        if (!h.a.b())
        {
            k.removeCallbacks(e);
            t = true;
        }
    }

    final void b(boolean flag)
    {
        if (h != null)
        {
            if (h.c != null)
            {
                h.c.i = true;
            }
            a(flag);
            h.w = flag;
            if (k != null && j != null && h.a != null && h.a.b())
            {
                k.postDelayed(j.o, h.a.H());
            }
        }
    }

    final void c()
    {
        try
        {
            if (n() && q != null)
            {
                q.autoFocus(this);
                x = true;
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        Log.e("MiSnapCamera", "auto focus failed");
    }

    final void d()
    {
        if (j != null)
        {
            b(j);
            if (!h.a.b())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            j.j();
        }
_L1:
        if (q != null)
        {
            q.setPreviewDisplay(getHolder());
            q.startPreview();
            if (h.a.b())
            {
                o = false;
                q.setPreviewCallback(this);
            }
        }
        A.sendEmptyMessage(18);
        return;
        try
        {
            j.l();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return;
        }
          goto _L1
    }

    final boolean e()
    {
        Object obj;
        obj = m();
        if (obj != null)
        {
            obj = ((android.hardware.Camera.Parameters) (obj)).getSupportedFlashModes();
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L4:
        if (((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return false;
        if (!"torch".equals((String)((Iterator) (obj)).next())) goto _L4; else goto _L3
_L3:
        return true;
    }

    public final void f()
    {
        if (k != null)
        {
            k.postDelayed(f, 1500L);
            if (A != null && !j.f())
            {
                A.sendEmptyMessageDelayed(16, 2000L);
            } else
            if (A != null && j.f())
            {
                A.sendEmptyMessage(16);
                return;
            }
        }
    }

    public final void g()
    {
        if (j != null && h.a.b())
        {
            d = true;
            if (A != null && j.c() == 0)
            {
                A.sendEmptyMessageDelayed(16, 2000L);
            } else
            if (A != null && j.c() != 0)
            {
                A.sendEmptyMessage(16);
                return;
            }
        }
    }

    final String h()
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("MiSnapVersion", h.getString(R.string.misnap_versionName));
        jsonobject.put("BarcodeLibVersion", "MiSnap231_with_no_bar_no_card");
        if ("".equals(h.a.e)) goto _L2; else goto _L1
_L1:
        jsonobject.put("ServerVersion", h.a.e);
_L16:
        jsonobject.put("Platform", "Android");
        jsonobject.put("OS", android.os.Build.VERSION.RELEASE);
        jsonobject.put("Manufacturer", Build.MANUFACTURER);
        jsonobject.put("Model", Build.MODEL);
        jsonobject.put("Device", Build.DEVICE);
        jsonobject.put("MibiVersion", "1.2");
        if (q == null || m() == null) goto _L4; else goto _L3
_L3:
        if (q()) goto _L6; else goto _L5
_L5:
        jsonobject.put("Flash", "NA");
_L4:
        Object obj = h.getWindowManager().getDefaultDisplay();
        if (((Display) (obj)).getWidth() < ((Display) (obj)).getHeight())
        {
            obj = "Portrait";
        } else
        {
            obj = "Landscape";
        }
        jsonobject.put("Orientation", obj);
        if (h.a.b())
        {
            obj = "2";
        } else
        {
            obj = "1";
        }
        jsonobject.put("CaptureMode", obj);
        jsonobject.put("Document", h.a.n());
        if (h.a.aB() != null)
        {
            obj = new JSONObject(h.a.aB().toString());
            ((JSONObject) (obj)).remove("RequiredMaxImageSize");
            ((JSONObject) (obj)).remove("CameraViewFinderMinVericalFill");
            ((JSONObject) (obj)).remove("TutorialBrandNewUserDuration");
            ((JSONObject) (obj)).remove("SecurityResult");
            jsonobject.put("Parameters", obj);
        }
        if (h.d != null)
        {
            jsonobject.put("UXP", h.d.a());
        }
        return jsonobject.toString();
_L2:
        if (!"".equals(h.a.c))
        {
            jsonobject.put("ServerVersion", h.a.c);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = m().getFlashMode();
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!"torch".equals(obj)) goto _L10; else goto _L9
_L9:
        jsonobject.put("Flash", "ON");
_L8:
        if (!h.a.b())
        {
            break MISSING_BLOCK_LABEL_536;
        }
        obj = m().getPreviewSize();
_L14:
        jsonobject.put("OriginalWidth", String.valueOf(((android.hardware.Camera.Size) (obj)).width));
        jsonobject.put("OriginalHeight", String.valueOf(((android.hardware.Camera.Size) (obj)).height));
          goto _L4
_L10:
        if (!"off".equals(obj)) goto _L12; else goto _L11
_L11:
        jsonobject.put("Flash", "OFF");
          goto _L8
_L12:
        if (!"auto".equals(obj)) goto _L8; else goto _L13
_L13:
        jsonobject.put("Flash", "AUTO");
          goto _L8
        obj = m().getPictureSize();
          goto _L14
        obj;
        return "";
        if (true) goto _L16; else goto _L15
_L15:
    }

    final void i()
    {
        int i1 = h.a.f();
        byte abyte0[];
        Intent intent;
        if (h.a.b())
        {
            abyte0 = a(i1);
        } else
        {
            abyte0 = b(i1);
        }
        abyte0 = a(abyte0, h());
        intent = new Intent();
        intent.putExtra("com.miteksystems.misnap.PICTURE", abyte0);
        intent.putExtra("com.miteksystems.misnap.MIBI_DATA", h());
        if (h.a.b())
        {
            intent.putExtra("com.miteksystems.misnap.HEIGHT", c);
            intent.putExtra("com.miteksystems.misnap.WIDTH", b);
        } else
        {
            intent.putExtra("com.miteksystems.misnap.HEIGHT", s.height);
            intent.putExtra("com.miteksystems.misnap.WIDTH", s.width);
        }
        intent.putExtra("com.miteksystems.misnap.QUALITY", h.a.f());
        if (h.a.b())
        {
            h.a(-1, intent, "SuccessVideo");
            return;
        } else
        {
            h.a(-1, intent, "SuccessStillCamera");
            return;
        }
    }

    public final void j()
    {
        if (h.a.b())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        y = true;
        if (!n())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        q.cancelAutoFocus();
        q.autoFocus(this);
        x = true;
_L2:
        h.a(R.string.uxp_capture_manual);
        return;
        s();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
    }

    final void k()
    {
        k.removeCallbacks(g);
        k.removeCallbacks(e);
        o();
        j = null;
        i = null;
    }

    public final void l()
    {
        z = 0;
    }

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        if (h.a.b() && d)
        {
            d = false;
            A.sendEmptyMessage(14);
        }
        x = false;
        (new StringBuilder("Done focusing...pictureInProgress:")).append(w).append("mSnapPressed:").append(y).toString();
        if (!w && (y || h.a.b()))
        {
            t();
        }
    }

    public final void onError(int i1, Camera camera)
    {
        if (i1 == 100)
        {
            Log.e("MiSnapCamera", "Camera Server died");
            return;
        } else
        {
            Log.e("MiSnapCamera", "Camera unknown error");
            return;
        }
    }

    public final void onPictureTaken(byte abyte0[], Camera camera)
    {
        (new StringBuilder("Picture taken: format = ")).append(m().getPictureFormat()).toString();
        s = m().getPictureSize();
        p = abyte0;
        a();
        h.a(R.string.uxp_capture_time);
        v = System.currentTimeMillis() - v;
        (new StringBuilder("takePicture time:")).append(v).toString();
        a(h);
        j.a();
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        if (!t && h.a.b())
        {
            t = true;
            if (!o && h.a.b() && n())
            {
                k.postDelayed(e, 1500L);
                o = true;
            }
            if (a == null)
            {
                android.hardware.Camera.Size size = m().getPreviewSize();
                b = size.width;
                c = size.height;
            }
            a = camera;
            u = (byte[])abyte0.clone();
            k.post(g);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            h.a(R.string.uxp_touch_screen);
            break;
        }
        return true;
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        if (q == null)
        {
            return;
        } else
        {
            k.post(new p(this, surfaceholder));
            return;
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (j != null)
        {
            j.i();
        }
        o();
    }

}
