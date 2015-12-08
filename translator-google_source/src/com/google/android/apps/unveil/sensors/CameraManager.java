// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Camera;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.Viewport;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.r;
import com.google.android.apps.unveil.env.s;
import com.google.android.apps.unveil.k;
import com.google.android.apps.unveil.sensors.proxies.camera.CameraProxy;
import com.google.android.apps.unveil.sensors.proxies.camera.FelixCamera;
import com.google.android.apps.unveil.sensors.proxies.camera.ParametersProxy;
import com.google.android.apps.unveil.sensors.proxies.camera.RealCamera;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            r, n, c, g, 
//            h, i, l, j, 
//            o, u, e, k, 
//            d, f, aa, m

public class CameraManager extends SurfaceView
    implements android.hardware.Camera.PictureCallback, android.view.SurfaceHolder.Callback, com.google.android.apps.unveil.sensors.r
{

    public static final af a = new af();
    private static HashMap k;
    private final List A;
    private final List B;
    private volatile boolean C;
    private volatile ParametersProxy D;
    private volatile boolean E;
    private boolean F;
    private ExecutorService G;
    private o H;
    private volatile int I;
    private volatile int J;
    private volatile int K;
    private int L;
    private boolean M;
    private Size N;
    private Size O;
    private int P;
    private int Q;
    private boolean R;
    public s b;
    public s c;
    public s d;
    public s e;
    public Boolean f;
    public Boolean g;
    public volatile boolean h;
    public u i;
    public final Object j;
    private final Set l;
    private final List m;
    private CameraProxy n;
    private ParametersProxy o;
    private n p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private r u;
    private volatile int v;
    private volatile boolean w;
    private volatile boolean x;
    private volatile String y;
    private String z;

    public CameraManager(Context context)
    {
        super(context);
        l = new HashSet();
        m = new ArrayList();
        p = n.a;
        v = 0;
        y = null;
        z = "off";
        A = new ArrayList();
        B = new ArrayList();
        C = false;
        D = null;
        h = false;
        E = true;
        F = false;
        j = new Object();
        O = null;
        b(context);
    }

    public CameraManager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = new HashSet();
        m = new ArrayList();
        p = n.a;
        v = 0;
        y = null;
        z = "off";
        A = new ArrayList();
        B = new ArrayList();
        C = false;
        D = null;
        h = false;
        E = true;
        F = false;
        j = new Object();
        O = null;
        b(context);
    }

    public CameraManager(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        l = new HashSet();
        m = new ArrayList();
        p = n.a;
        v = 0;
        y = null;
        z = "off";
        A = new ArrayList();
        B = new ArrayList();
        C = false;
        D = null;
        h = false;
        E = true;
        F = false;
        j = new Object();
        O = null;
        b(context);
    }

    public CameraManager(Context context, k k1)
    {
        super(context);
        l = new HashSet();
        m = new ArrayList();
        p = n.a;
        v = 0;
        y = null;
        z = "off";
        A = new ArrayList();
        B = new ArrayList();
        C = false;
        D = null;
        h = false;
        E = true;
        F = false;
        j = new Object();
        O = null;
        a(((Context) (null)), k1);
    }

    public static int a(Context context)
    {
        android.hardware.Camera.CameraInfo camerainfo;
        int j1;
        int k1;
        j1 = 90;
        if (android.os.Build.VERSION.SDK_INT <= 8)
        {
            a.c("getCameraToDisplayRotation() called on API <= 8!", new Object[0]);
            return 0;
        }
        k1 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(0, camerainfo);
        k1;
        JVM INSTR tableswitch 0 3: default 88
    //                   0 146
    //                   1 151
    //                   2 157
    //                   3 164;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_164;
_L1:
        int i1 = 0;
_L6:
        if (camerainfo.facing == 1)
        {
            i1 = (360 - (i1 + camerainfo.orientation) % 360) % 360;
        } else
        {
            if (android.os.Build.VERSION.SDK_INT > 10)
            {
                j1 = camerainfo.orientation;
            } else
            if (Viewport.a(context) == 2)
            {
                j1 = 0;
            }
            i1 = ((j1 - i1) + 360) % 360;
        }
        a.a("getDisplayRotation() %d, %d", new Object[] {
            Integer.valueOf(k1), Integer.valueOf(i1)
        });
        return i1;
_L2:
        i1 = 0;
          goto _L6
_L3:
        i1 = 90;
          goto _L6
_L4:
        i1 = 180;
          goto _L6
        i1 = 270;
          goto _L6
    }

    static int a(CameraManager cameramanager, int i1)
    {
        cameramanager.v = i1;
        return i1;
    }

    private static Size a(List list, int i1, int j1, boolean flag, int k1)
    {
        Size size;
        do
        {
            af.a();
            float f1 = (float)i1 / (float)j1;
            float f2 = f1 * 0.1F;
            if (!flag);
            int l1 = 0x7fffffff;
            size = null;
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Size size1 = (Size)iterator.next();
                if (k1 <= 0 || size1.width * size1.height <= k1)
                {
                    float f3 = Math.abs(f1 - (float)size1.width / (float)size1.height);
                    if (!flag || f3 <= f2)
                    {
                        int i2 = Math.abs(size1.width * size1.height - i1 * j1);
                        if (i2 < l1)
                        {
                            l1 = i2;
                            size = size1;
                        }
                    }
                }
            } while (true);
            if (size != null || !flag)
            {
                break;
            }
            a.c("Couldn't find size that meets aspect ratio requirement, trying without.", new Object[0]);
            flag = false;
        } while (true);
        if (size == null)
        {
            a.e("No optimal size!", new Object[0]);
        }
        size.toString();
        return size;
    }

    static List a(CameraManager cameramanager)
    {
        return cameramanager.A;
    }

    private void a(Context context, k k1)
    {
        if (k1 != null)
        {
            b = new c(this, k1);
            c = new g(this, k1);
            d = new h(this, k1);
            e = new i(this, k1);
        }
        k1 = getHolder();
        k1.setSizeFromLayout();
        k1.addCallback(this);
        a();
        if (context != null)
        {
            a(context.getResources().getConfiguration().orientation);
        }
    }

    private void a(ParametersProxy parametersproxy)
    {
        this;
        JVM INSTR monitorenter ;
        D = parametersproxy;
        o = null;
        if (!F)
        {
            p();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        parametersproxy;
        throw parametersproxy;
    }

    private boolean a(int i1)
    {
        K = Viewport.a(getContext());
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        if (I != display.getRotation() || J != i1)
        {
            I = display.getRotation();
            J = i1;
            return true;
        } else
        {
            return false;
        }
    }

    private void b(int i1, int j1)
    {
        c(true);
        Object obj;
        ParametersProxy parametersproxy;
        parametersproxy = getCameraParameters();
        obj = n;
        if (obj != null && parametersproxy != null) goto _L2; else goto _L1
_L1:
        b(true);
        b(p);
        n();
        String s1;
        if (u != null)
        {
            n.setPreviewTexture(u);
        } else
        {
            n.setPreviewDisplay(getHolder());
        }
        l();
        setFlashMode(z);
        o();
        k();
        for (obj = l.iterator(); ((Iterator) (obj)).hasNext(); ((l)((Iterator) (obj)).next()).f()) { }
        break MISSING_BLOCK_LABEL_260;
_L2:
        if (O == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj = O;
_L3:
        if (obj == null)
        {
            try
            {
                throw new RuntimeException("Could not find a suitable preview size.");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a.f("Failed to set optimal preview size.", new Object[0]);
            }
            c(false);
            return;
        }
        break MISSING_BLOCK_LABEL_175;
        obj = a(i1, j1);
          goto _L3
        i1 = ((Size) (obj)).width;
        i1 = ((Size) (obj)).height;
        if (O == null)
        {
            s1 = "";
        } else
        {
            s1 = "based on forced preview size";
        }
        parametersproxy.setPreviewSize(((Size) (obj)).width, ((Size) (obj)).height);
        a(parametersproxy);
        obj = getPreviewSize();
        i1 = ((Size) (obj)).width;
        i1 = ((Size) (obj)).height;
          goto _L1
        c(false);
        a.b("Starting preview!", new Object[0]);
        h = true;
        n.startPreview();
        obj = getCameraParameters();
        if (obj != null) goto _L5; else goto _L4
_L4:
        a.e("Cannot get camera parameters. Unable to query zoom support.", new Object[0]);
_L7:
        P = 0;
        return;
_L5:
        R = ((ParametersProxy) (obj)).isSmoothZoomSupported();
        if (R)
        {
            Q = ((ParametersProxy) (obj)).getMaxZoom();
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void b(Context context)
    {
        if (context.getApplicationContext() instanceof k)
        {
            a(context, (k)context.getApplicationContext());
            return;
        } else
        {
            a(context, ((k) (null)));
            return;
        }
    }

    static void b(CameraManager cameramanager)
    {
        cameramanager.p();
    }

    private void b(n n1)
    {
        if (n != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = getCameraParameters();
        if (obj == null)
        {
            a.e("Cannot get camera parameters. Unable to set picture quality.", new Object[0]);
            return;
        }
        ((ParametersProxy) (obj)).set("jpeg-quality", n1.g);
        Object obj1;
        int i1;
        int j1;
        a(((ParametersProxy) (obj)));
        i1 = n1.d;
        j1 = n1.e;
        obj = getCameraParameters();
        obj1 = n;
        if (obj1 == null || obj == null) goto _L1; else goto _L3
_L3:
        obj1 = ((ParametersProxy) (obj)).getSupportedPictureSizes();
        if (obj1 != null) goto _L5; else goto _L4
_L4:
        try
        {
            throw new RuntimeException("Failed to find picture sizes in camera parameters.");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        a.f("No suitable picture size available, forcing %dx%d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        ((ParametersProxy) (obj)).setPictureSize(i1, j1);
_L6:
        a(((ParametersProxy) (obj)));
        obj = getPictureSize();
        i1 = ((Size) (obj)).width;
        i1 = ((Size) (obj)).height;
        return;
        obj;
        a.f("Unable to set quality to: %s", new Object[] {
            n1
        });
        n1 = l.iterator();
        while (n1.hasNext()) 
        {
            ((l)n1.next()).e();
        }
          goto _L1
_L5:
        obj1 = a(((List) (obj1)), i1, j1, false, 0);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        throw new RuntimeException("Could not find a suitable picture size.");
        int k1 = ((Size) (obj1)).width;
        k1 = ((Size) (obj1)).height;
        ((ParametersProxy) (obj)).setPictureSize(((Size) (obj1)).width, ((Size) (obj1)).height);
          goto _L6
    }

    private void b(boolean flag)
    {
        if (n == null)
        {
            return;
        }
        ParametersProxy parametersproxy = getCameraParameters();
        if (parametersproxy == null)
        {
            a.e("Cannot get camera parameters. Unable to set recording hint.", new Object[0]);
            return;
        }
        parametersproxy.setRecordingHint(flag);
        try
        {
            a(parametersproxy);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a.f("Unable to set recording hint", new Object[0]);
        }
    }

    private boolean b(String s1)
    {
        while ("auto".equals(s1) && q != null && q.booleanValue() || "off".equals(s1) && f != null && f.booleanValue() || "on".equals(s1) && r != null && r.booleanValue() || "torch".equals(s1) && g != null && g.booleanValue()) 
        {
            return true;
        }
        return false;
    }

    static List c(CameraManager cameramanager)
    {
        return cameramanager.m;
    }

    private void c(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        F = flag;
        if (!F)
        {
            p();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static boolean d(CameraManager cameramanager)
    {
        return cameramanager.x;
    }

    static boolean e(CameraManager cameramanager)
    {
        cameramanager.x = false;
        return false;
    }

    static void f(CameraManager cameramanager)
    {
        cameramanager.m();
    }

    static boolean g(CameraManager cameramanager)
    {
        return cameramanager.w;
    }

    private o getCameraAcquirer()
    {
        this;
        JVM INSTR monitorenter ;
        o o1;
        if (H == null)
        {
            G = Executors.newSingleThreadExecutor(new j(this));
            H = new o(G, this);
        }
        o1 = H;
        this;
        JVM INSTR monitorexit ;
        return o1;
        Exception exception;
        exception;
        throw exception;
    }

    private ParametersProxy getCameraParameters()
    {
        this;
        JVM INSTR monitorenter ;
        if (o == null && n != null)
        {
            if (D == null)
            {
                break MISSING_BLOCK_LABEL_53;
            }
            a.c("getParameters returning deferred value set while taking a picture!", new Object[0]);
            o = D;
        }
_L1:
        ParametersProxy parametersproxy = o;
        this;
        JVM INSTR monitorexit ;
        return parametersproxy;
        o = n.getParameters();
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private Size getSpecialCasePreviewSize()
    {
        if (k == null)
        {
            HashMap hashmap = new HashMap();
            k = hashmap;
            hashmap.put("SPH-M900", new Size(640, 480));
            k.put("DROIDX", new Size(800, 448));
            k.put("XT720", new Size(848, 480));
            k.put("Nexus S", new Size(640, 480));
            k.put("Droid", new Size(640, 480));
            k.put("SGH-T999", new Size(640, 480));
            k.put("Nexus 4", new Size(640, 480));
            k.put("Nexus 7", new Size(640, 480));
        }
        if (k.containsKey(Build.MODEL))
        {
            Size size = (Size)k.get(Build.MODEL);
            a.c("Special case: using %s for preview size on %s.", new Object[] {
                size, Build.MODEL
            });
            return size;
        } else
        {
            return null;
        }
    }

    static boolean h(CameraManager cameramanager)
    {
        cameramanager.w = false;
        return false;
    }

    static String i(CameraManager cameramanager)
    {
        return cameramanager.y;
    }

    static String j(CameraManager cameramanager)
    {
        cameramanager.y = null;
        return null;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        o o1 = H;
        if (o1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        G.shutdown();
        H = null;
        G = null;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static ParametersProxy k(CameraManager cameramanager)
    {
        return cameramanager.getCameraParameters();
    }

    private void k()
    {
        while (n == null || s == null || !s.booleanValue()) 
        {
            return;
        }
        ParametersProxy parametersproxy = getCameraParameters();
        if (parametersproxy == null)
        {
            a.e("Cannot get camera parameters. Unable to enable auto focus.", new Object[0]);
            return;
        }
        parametersproxy.set("focus-mode", "auto");
        try
        {
            a(parametersproxy);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a.f("Unable to set focus mode to: %s", new Object[] {
                "auto"
            });
        }
    }

    static s l(CameraManager cameramanager)
    {
        return cameramanager.d;
    }

    private void l()
    {
        if (android.os.Build.VERSION.SDK_INT > 8) goto _L2; else goto _L1
_L1:
        L = 0;
        I;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 119
    //                   1 127
    //                   2 137
    //                   3 147;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if (K == 1)
        {
            L = L + 90;
            if (L == 360)
            {
                L = 0;
            }
        }
        a.b("Rotating camera %d degrees", new Object[] {
            Integer.valueOf(L)
        });
        n.setDisplayOrientation(L);
        return;
_L4:
        L = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        L = 270;
        continue; /* Loop/switch isn't completed */
_L6:
        L = 180;
        continue; /* Loop/switch isn't completed */
_L7:
        L = 90;
        if (true) goto _L3; else goto _L2
_L2:
        n.setDisplayOrientation(a(getContext()));
        return;
    }

    static s m(CameraManager cameramanager)
    {
        return cameramanager.e;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        if (v != 1) goto _L2; else goto _L1
_L1:
        a.c("Deferring camera release until after focus", new Object[0]);
        x = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static o n(CameraManager cameramanager)
    {
        return cameramanager.getCameraAcquirer();
    }

    private void n()
    {
        int i1 = 0;
        if (n != null && q == null && f == null && r == null && g == null)
        {
            Object obj = getCameraParameters();
            if (obj == null)
            {
                a.e("Cannot get camera parameters. Unable to query flash support.", new Object[0]);
                return;
            }
            obj = ((ParametersProxy) (obj)).get("flash-mode-values");
            if (obj != null)
            {
                q = Boolean.valueOf(false);
                f = Boolean.valueOf(false);
                r = Boolean.valueOf(false);
                g = Boolean.valueOf(false);
                String as[] = ((String) (obj)).split(",");
                int j1 = as.length;
                while (i1 < j1) 
                {
                    String s1 = as[i1];
                    if ("auto".equals(s1))
                    {
                        q = Boolean.valueOf(true);
                    } else
                    if ("off".equals(s1))
                    {
                        f = Boolean.valueOf(true);
                    } else
                    if ("on".equals(s1))
                    {
                        r = Boolean.valueOf(true);
                    } else
                    if ("torch".equals(s1))
                    {
                        g = Boolean.valueOf(true);
                    }
                    i1++;
                }
            }
        }
    }

    private void o()
    {
        int i1 = 0;
        if (n != null && s == null && t == null)
        {
            Object obj = getCameraParameters();
            if (obj == null)
            {
                a.e("Cannot get camera parameters. Unable to query focus support.", new Object[0]);
                return;
            }
            obj = ((ParametersProxy) (obj)).get("focus-mode-values");
            if (obj != null)
            {
                String as[] = ((String) (obj)).split(",");
                int j1 = as.length;
                while (i1 < j1) 
                {
                    String s1 = as[i1];
                    if (s1.equals("auto"))
                    {
                        s = Boolean.valueOf(true);
                    } else
                    if (s1.equals("continuous-picture"))
                    {
                        t = Boolean.valueOf(true);
                    }
                    i1++;
                }
            }
        }
    }

    private void p()
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null) goto _L2; else goto _L1
_L1:
        a.c("No camera yet to set parameters on.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (D == null) goto _L4; else goto _L3
_L3:
        if (F)
        {
            a.e("maybeSetPendingCameraParameters() directly called while cache is active.", new Object[0]);
        }
        o = null;
        if (!q())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        a.c("Taking picture, aborting setParameters.", new Object[0]);
          goto _L4
        Exception exception;
        exception;
        throw exception;
label0:
        {
            if (!h())
            {
                break label0;
            }
            a.c("Focusing, aborting setParameters.", new Object[0]);
        }
          goto _L4
        a.b("Setting camera parameters.", new Object[0]);
        n.setParameters(D);
        D = null;
        getCameraParameters();
          goto _L4
    }

    private boolean q()
    {
        return v == 3 || v == 4;
    }

    public final Size a(int i1, int j1)
    {
        ParametersProxy parametersproxy;
        b();
        parametersproxy = getCameraParameters();
        if (n != null && parametersproxy != null) goto _L2; else goto _L1
_L1:
        Size size = null;
_L4:
        return size;
_L2:
        Size size1;
        if (n.getClass() != com/google/android/apps/unveil/sensors/proxies/camera/RealCamera)
        {
            break; /* Loop/switch isn't completed */
        }
        size1 = getSpecialCasePreviewSize();
        size = size1;
        if (size1 != null) goto _L4; else goto _L3
_L3:
        List list = parametersproxy.getSupportedPreviewSizes();
        if (list == null)
        {
            throw new RuntimeException("Failed to find preview sizes in camera parameters.");
        }
        int k1;
        if (((Boolean)c.a()).booleanValue())
        {
            k1 = 0x63d80;
        } else
        {
            k1 = 0;
        }
        return a(list, i1, j1, true, k1);
    }

    public final void a()
    {
        if (d != null && (((String)d.a()).startsWith(com/google/android/apps/unveil/sensors/proxies/camera/RealCamera.getSimpleName()) || ((String)d.a()).startsWith(com/google/android/apps/unveil/sensors/proxies/camera/FelixCamera.getSimpleName())))
        {
            getHolder().setType(3);
        }
    }

    public final void a(android.hardware.Camera.PreviewCallback previewcallback)
    {
        if (n == null)
        {
            a.c("No camera, can't comply with frame request.", new Object[0]);
            return;
        }
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        if (i == null || previewcallback == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (i.b == previewcallback)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (i != null)
        {
            u u1 = i;
            u1.c = null;
            u1.a.setPreviewCallback(null);
            i = null;
        }
        if (previewcallback != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        previewcallback;
        obj;
        JVM INSTR monitorexit ;
        throw previewcallback;
        i = new u(n, previewcallback, getPreviewSize());
        previewcallback = i;
        previewcallback.c = new ArrayList();
        ((u) (previewcallback)).a.setPreviewCallbackWithBuffer(previewcallback);
        obj;
        JVM INSTR monitorexit ;
        u u2 = i;
        obj = u2.c;
        obj;
        JVM INSTR monitorenter ;
        if (!u2.c.isEmpty())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        previewcallback = u2.d;
        previewcallback = new byte[ImageUtils.b(((Size) (previewcallback)).width, ((Size) (previewcallback)).height)];
_L2:
        u2.a.addCallbackBuffer(previewcallback);
        return;
        previewcallback = (byte[])u2.c.remove(0);
        if (true) goto _L2; else goto _L1
_L1:
        previewcallback;
        obj;
        JVM INSTR monitorexit ;
        throw previewcallback;
    }

    public final void a(com.google.android.apps.unveil.sensors.k k1)
    {
        this;
        JVM INSTR monitorenter ;
        CameraProxy cameraproxy = n;
        if (cameraproxy != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (v != 2)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        a.b("Focus just finished and callbacks are being invoked, ignoring focus request!", new Object[0]);
          goto _L1
        k1;
        throw k1;
label0:
        {
            if (!q())
            {
                break label0;
            }
            a.b("A picture is being taken now, ignoring focus request!", new Object[0]);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (k1 == null) goto _L5; else goto _L4
_L4:
        m.add(k1);
_L5:
        if (v == 1) goto _L1; else goto _L6
_L6:
        v = 1;
        k1 = new e(this);
        n.autoFocus(k1);
          goto _L1
        k1;
        v = 0;
        for (k1 = m.iterator(); k1.hasNext(); ((com.google.android.apps.unveil.sensors.k)k1.next()).a(false)) { }
        m.clear();
          goto _L1
    }

    public final void a(l l1)
    {
        l.add(l1);
    }

    public final void a(m m1)
    {
        this;
        JVM INSTR monitorenter ;
        CameraProxy cameraproxy = n;
        if (cameraproxy != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (q()) goto _L1; else goto _L3
_L3:
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        B.add(m1);
        if (v != 3)
        {
            if (v != 1 && v != 2)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            w = true;
        }
          goto _L1
        m1;
        throw m1;
        v = 3;
        h = false;
        m1 = new d(this);
        b(false);
        n.takePicture(m1, null, this);
          goto _L1
    }

    public final void a(n n1)
    {
        p = n1;
        b(n1);
    }

    public final void a(CameraProxy cameraproxy)
    {
        this;
        JVM INSTR monitorenter ;
        a.b("onCameraAcquired", new Object[0]);
        M = false;
        n = cameraproxy;
        for (cameraproxy = l.iterator(); cameraproxy.hasNext(); ((l)cameraproxy.next()).c()) { }
        break MISSING_BLOCK_LABEL_66;
        cameraproxy;
        throw cameraproxy;
        p();
        if (C)
        {
            a.b("Starting preview!", new Object[0]);
            c();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        M = false;
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((l)iterator.next()).a(s1)) { }
        break MISSING_BLOCK_LABEL_49;
        s1;
        throw s1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag)
    {
        if (n != null)
        {
            if (!flag)
            {
                k();
                return;
            }
            if (t != null && t.booleanValue())
            {
                ParametersProxy parametersproxy = getCameraParameters();
                if (parametersproxy == null)
                {
                    a.e("Cannot get camera parameters. Unable to set focus mode.", new Object[0]);
                    return;
                }
                parametersproxy.set("focus-mode", "continuous-picture");
                try
                {
                    a(parametersproxy);
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    a.f("Unable to set focus mode to: %s", new Object[] {
                        "continuous-picture"
                    });
                }
                return;
            }
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.b("acquireCamera", new Object[0]);
        if (n != null || M) goto _L2; else goto _L1
_L1:
        M = true;
        if (Looper.myLooper() != Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        getCameraAcquirer().a((String)d.a(), (Map)e.a(), getResources());
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        post(new f(this));
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L2:
        if (n == null) goto _L5; else goto _L6
_L6:
        a.b("CameraManager already has a camera, ignoring call to acquireCamera.", new Object[0]);
          goto _L5
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        a.b("Starting preview!", new Object[0]);
        b();
        if (n != null) goto _L2; else goto _L1
_L1:
        if (!M) goto _L4; else goto _L3
_L3:
        a.c("Deferring startPreview due to acquisitionPending.", new Object[0]);
        C = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        a.e("Failed to acquire camera, can't start preview", new Object[0]);
          goto _L5
        Object obj;
        obj;
        throw obj;
_L2:
label0:
        {
            if (!q())
            {
                break label0;
            }
            a.c("Deferring startPreview due to picture taking.", new Object[0]);
            C = true;
        }
          goto _L5
label1:
        {
            if (!h())
            {
                break label1;
            }
            a.c("Deferring startPreview due to focusing.", new Object[0]);
            C = true;
        }
          goto _L5
label2:
        {
            if (!h)
            {
                break label2;
            }
            a.b("Already previewing.", new Object[0]);
            C = false;
        }
          goto _L5
        if (N != null) goto _L7; else goto _L6
_L6:
        int i1;
        int j1;
        j1 = getWidth();
        i1 = getHeight();
        a.e("Full display size is null, falling back to CameraManager view size of %dx%d.", new Object[] {
            Integer.valueOf(j1), Integer.valueOf(i1)
        });
          goto _L8
_L9:
        a.c("Too early to preview, no device size or CameraManager View size known yet.", new Object[0]);
        C = true;
          goto _L5
_L7:
        j1 = N.width;
        i1 = N.height;
        a.b("Using full display size of %dx%d to pick preview size.", new Object[] {
            Integer.valueOf(j1), Integer.valueOf(i1)
        });
          goto _L8
_L10:
        if (J != 1)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        b(i1, j1);
          goto _L5
        obj;
        a.f("Unable to acquire/configure camera hardware.", new Object[0]);
        m();
        Iterator iterator = l.iterator();
        while (iterator.hasNext()) 
        {
            ((l)iterator.next()).a(((RuntimeException) (obj)).getLocalizedMessage());
        }
          goto _L5
        b(j1, i1);
          goto _L5
        obj;
        a.f("Unable to acquire/configure camera hardware.", new Object[0]);
        m();
        Iterator iterator1 = l.iterator();
        while (iterator1.hasNext()) 
        {
            ((l)iterator1.next()).a(((IOException) (obj)).getLocalizedMessage());
        }
          goto _L5
_L8:
        if (j1 != 0 && i1 != 0) goto _L10; else goto _L9
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null) goto _L2; else goto _L1
_L1:
        a.e("Can't stop preview on a null camera.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        n.stopPreview();
        C = false;
        h = false;
        x = false;
        w = false;
        y = null;
        v = 0;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null)
        {
            if (v == 1)
            {
                a.a("Attempting cancelAutoFocus call.", new Object[0]);
                n.cancelAutoFocus();
            }
            a(((android.hardware.Camera.PreviewCallback) (null)));
            if (h)
            {
                n.stopPreview();
            }
            getCameraAcquirer().a(n);
            j();
            n = null;
            o = null;
        }
        C = false;
        h = false;
        x = false;
        w = false;
        y = null;
        v = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean f()
    {
        if (s == null)
        {
            return false;
        } else
        {
            return s.booleanValue();
        }
    }

    public final boolean g()
    {
        if (t == null)
        {
            return false;
        } else
        {
            return t.booleanValue();
        }
    }

    public int getCameraRotation()
    {
        return L;
    }

    public Executor getExecutor()
    {
        return G;
    }

    public String getExpectedFlashMode()
    {
        if (y != null)
        {
            if (b(y))
            {
                return y;
            }
        } else
        if (b(z))
        {
            return z;
        }
        return "unsupported";
    }

    public boolean getMirrored()
    {
        if (android.os.Build.VERSION.SDK_INT <= 8)
        {
            a.c("getMirrored() called on API <= 8!", new Object[0]);
            return false;
        }
        if (d != null && !((String)d.a()).startsWith(com/google/android/apps/unveil/sensors/proxies/camera/RealCamera.getSimpleName()) && !((String)d.a()).startsWith(com/google/android/apps/unveil/sensors/proxies/camera/FelixCamera.getSimpleName()))
        {
            return false;
        }
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(0, camerainfo);
        return camerainfo.facing == 1;
    }

    public n getPictureQuality()
    {
        return p;
    }

    public Size getPictureSize()
    {
        ParametersProxy parametersproxy = getCameraParameters();
        if (parametersproxy == null)
        {
            return null;
        } else
        {
            return parametersproxy.getPictureSize();
        }
    }

    public Size getPreviewSize()
    {
        if (O != null)
        {
            return O;
        }
        ParametersProxy parametersproxy = getCameraParameters();
        if (parametersproxy == null)
        {
            return null;
        } else
        {
            return parametersproxy.getPreviewSize();
        }
    }

    public String getStateName()
    {
        switch (v)
        {
        default:
            return "unknown";

        case 2: // '\002'
            return "FOCUSED";

        case 1: // '\001'
            return "FOCUSING";

        case 0: // '\0'
            return "IDLE";

        case 4: // '\004'
            return "SNAPPED";

        case 3: // '\003'
            return "SNAPPING";
        }
    }

    public final boolean h()
    {
        return v == 1;
    }

    public final boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        CameraProxy cameraproxy = n;
        boolean flag;
        if (cameraproxy != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (a(configuration.orientation) && h)
        {
            d();
            l();
            c();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((l)iterator.next()).g()) { }
    }

    public void onPictureTaken(byte abyte0[], Camera camera)
    {
        this;
        JVM INSTR monitorenter ;
        p();
        if (camera != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i1;
        if (B.isEmpty())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i1 = ((aa)b.a()).a();
        if (i1 != -1)
        {
            i1 += 90;
        } else
        {
            i1 = 0;
        }
        abyte0 = com.google.android.apps.unveil.env.k.a(abyte0, i1);
        for (camera = B.iterator(); camera.hasNext(); ((m)camera.next()).a(abyte0)) { }
        break MISSING_BLOCK_LABEL_104;
        abyte0;
        throw abyte0;
        B.clear();
        v = 0;
        if (C)
        {
            c();
        }
          goto _L1
    }

    protected void onWindowVisibilityChanged(int i1)
    {
label0:
        {
            super.onWindowVisibilityChanged(i1);
            a.b("onWindowVisibilityChanged: %d", new Object[] {
                Integer.valueOf(i1)
            });
            if (E)
            {
                if (i1 != 0)
                {
                    break label0;
                }
                b();
            }
            return;
        }
        m();
    }

    public void setAcquireCameraOnVisibilityChange(boolean flag)
    {
        E = flag;
    }

    public void setCameraProxy(CameraProxy cameraproxy)
    {
        n = cameraproxy;
        o = null;
        try
        {
            b(640, 480);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraProxy cameraproxy)
        {
            return;
        }
    }

    public void setFlashMode(String s1)
    {
        if (n != null && s1 != null && b(s1))
        {
            if (v == 1)
            {
                a.c("Deferring flash setting until focus complete.", new Object[0]);
                y = s1;
                return;
            }
            z = s1;
            ParametersProxy parametersproxy = getCameraParameters();
            if (parametersproxy == null)
            {
                a.e("Cannot get camera parameters. Unable to set flash mode.", new Object[0]);
                return;
            }
            parametersproxy.set("flash-mode", s1);
            try
            {
                a(parametersproxy);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                a.f("Unable to set flash mode to: %s", new Object[] {
                    s1
                });
            }
            s1 = l.iterator();
            while (s1.hasNext()) 
            {
                ((l)s1.next()).d();
            }
        }
    }

    public void setForcedPreviewSize(Size size)
    {
        O = size;
    }

    public void setFullScreenDisplaySize(Size size)
    {
        this;
        JVM INSTR monitorenter ;
        N = size;
        this;
        JVM INSTR monitorexit ;
        return;
        size;
        throw size;
    }

    public void setZoomLevel(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null && h) goto _L2; else goto _L1
_L1:
        a.e("Too early to zoom!", new Object[0]);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (R)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        a.c("Zooming not supported!", new Object[0]);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        if (i1 <= Q) goto _L5; else goto _L4
_L4:
        a.e("Zoom is too great! %d requested, max is %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(Q)
        });
          goto _L3
_L5:
        if (i1 == P) goto _L3; else goto _L6
_L6:
        n.startSmoothZoom(i1);
        P = i1;
          goto _L3
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        a.b("surfaceChanged: %s", new Object[] {
            Size.dimensionsAsString(j1, k1)
        });
        if (getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        b();
        if (n == null)
        {
            a.e("Failed to acquire camera before setting preview display", new Object[0]);
            return;
        }
        try
        {
            if (u != null)
            {
                n.setPreviewTexture(u);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            a.f("Failed to set preview display", new Object[0]);
            return;
        }
        n.setPreviewDisplay(getHolder());
        return;
        m();
        return;
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        m();
    }

}
