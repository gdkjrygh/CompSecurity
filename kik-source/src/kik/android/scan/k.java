// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.SystemClock;
import android.widget.ImageView;
import com.kik.g.e;
import com.kik.scan.KikCode;
import com.kik.scan.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kik.android.c.b;
import kik.android.util.bx;
import kik.android.util.u;
import org.c.c;

// Referenced classes of package kik.android.scan:
//            l, m, c, a

public final class k
{
    public static final class a
    {

        public final byte a[];
        public final KikCode b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        private a(byte abyte0[], KikCode kikcode, int i1, int j1, int k1, int l1)
        {
            a = abyte0;
            b = kikcode;
            c = i1;
            d = j1;
            e = k1;
            f = l1;
        }

        a(byte abyte0[], KikCode kikcode, int i1, int j1, int k1, int l1, byte byte0)
        {
            this(abyte0, kikcode, i1, j1, k1, l1);
        }
    }


    private static final org.c.b a = org.c.c.a("Scan");
    private static final ExecutorService n = Executors.newSingleThreadExecutor();
    private File b;
    private int c;
    private int d;
    private byte e[];
    private int f;
    private android.hardware.Camera.Size g;
    private com.kik.scan.Scanner.ScanResult h;
    private Camera i;
    private volatile boolean j;
    private final b k;
    private final ImageView l;
    private android.hardware.Camera.Parameters m;
    private kik.android.scan.a o;
    private kik.android.c.b.a p;
    private android.hardware.Camera.PreviewCallback q;
    private com.kik.g.k r;
    private com.kik.g.k s;

    public k(b b1, ImageView imageview)
    {
        f = 0;
        h = null;
        p = new l(this);
        q = new m(this);
        r = new com.kik.g.k(this);
        s = new com.kik.g.k(this);
        k = b1;
        k.a(p);
        l = imageview;
    }

    static ImageView a(k k1)
    {
        return k1.l;
    }

    static void a(k k1, Camera camera)
    {
        if (camera != null)
        {
            k1.i = camera;
            k1.j = false;
            k1.m = camera.getParameters();
            android.hardware.Camera.Parameters parameters = k1.m;
            if (k1.e != null && parameters.getPreviewSize() != null && parameters.getPreviewSize().equals(k1.g))
            {
                k1 = k1.e;
            } else
            {
                k1.g = parameters.getPreviewSize();
                k1.e = u.a(parameters);
                k1 = k1.e;
            }
            camera.addCallbackBuffer(k1);
        }
    }

    static void a(k k1, byte abyte0[], Camera camera)
    {
label0:
        {
            if (camera == k1.k.c())
            {
                long l1 = SystemClock.uptimeMillis();
                android.hardware.Camera.Size size = k1.m.getPreviewSize();
                camera = new kik.android.scan.c(abyte0, size.width, size.height, size.width, size.height);
                long l2 = SystemClock.uptimeMillis();
                try
                {
                    camera = Scanner.scan(camera.a(), size.width, size.height, 3);
                }
                // Misplaced declaration of an exception variable
                catch (Camera camera)
                {
                    bx.b(camera);
                    camera = null;
                }
                if (camera != null)
                {
                    byte abyte1[] = ((com.kik.scan.Scanner.ScanResult) (camera)).data;
                    a.a("Scan took {}ms", Long.valueOf(SystemClock.uptimeMillis() - l2));
                    if (abyte1 != null)
                    {
                        k1.h = camera;
                        l2 = SystemClock.uptimeMillis();
                        camera = KikCode.parse(abyte1);
                        if (camera != null)
                        {
                            a.a("Code took {}ms", Long.valueOf(SystemClock.uptimeMillis() - l2));
                            k1.r.a(new a(abyte0, camera, size.width, size.height, k1.f, k1.m.getPreviewFormat(), (byte)0));
                        }
                    }
                }
                l2 = SystemClock.uptimeMillis();
                a.a("Decode took {}ms", Long.valueOf(l2 - l1));
                camera = k1.m;
                if (abyte0 != null && k1.b != null && k1.c >= 0 && k1.d <= k1.c)
                {
                    break label0;
                }
            }
            return;
        }
        camera = camera.getPreviewSize();
        abyte0 = new YuvImage(abyte0, 17, ((android.hardware.Camera.Size) (camera)).width, ((android.hardware.Camera.Size) (camera)).height, null);
        camera = new File(k1.b, String.format("snap_%03d.jpg", new Object[] {
            Integer.valueOf(k1.d)
        }));
        try
        {
            camera = new FileOutputStream(camera);
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            bx.c(k1);
            return;
        }
        abyte0.compressToJpeg(new Rect(0, 0, abyte0.getWidth(), abyte0.getHeight()), 100, camera);
        k1.d = k1.d + 1;
    }

    static boolean b(k k1)
    {
        return k1.j;
    }

    static org.c.b f()
    {
        return a;
    }

    static ExecutorService g()
    {
        return n;
    }

    public final com.kik.scan.Scanner.ScanResult a()
    {
        return h;
    }

    public final void a(int i1)
    {
        f = i1;
    }

    public final e b()
    {
        return r.a();
    }

    public final void c()
    {
        d();
        i = null;
    }

    public final void d()
    {
        try
        {
            if (i != null)
            {
                j = true;
                i.setPreviewCallbackWithBuffer(null);
            }
            if (o != null)
            {
                o.b();
                o = null;
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            bx.f(runtimeexception);
        }
    }

    public final void e()
    {
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        j = false;
        i.setPreviewCallbackWithBuffer(q);
        if ("auto".equals(m.getFocusMode()) || "macro".equals(m.getFocusMode()))
        {
            o = new kik.android.scan.a(i);
            o.a();
        }
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        bx.f(runtimeexception);
        return;
    }

}
