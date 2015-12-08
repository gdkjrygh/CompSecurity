// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.j;
import com.google.android.apps.unveil.env.t;
import com.google.android.apps.unveil.k;
import com.google.android.apps.unveil.nonstop.DebugView;
import com.google.android.apps.unveil.nonstop.c;
import com.google.android.apps.unveil.nonstop.f;
import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.apps.unveil.sensors.aa;
import com.google.android.apps.unveil.sensors.l;
import com.google.android.apps.unveil.sensors.n;
import com.google.android.apps.unveil.sensors.proxies.camera.RealCamera;
import com.google.android.goggles.b.e;
import com.google.g.a.a.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ae, j, x, e, 
//            h, i, g, f, 
//            ZoomableContainer, BoundingBoxView, SmudgeView, aa, 
//            ai, z, w, l, 
//            o, y, ac, s, 
//            t, p, q, a, 
//            k, r, u, v, 
//            n

public class TextInput extends FrameLayout
    implements l, ae, com.google.android.apps.unveil.textinput.j
{

    public static final af a = new af();
    private e A;
    private m B;
    private Rect C;
    private boolean D;
    private boolean E;
    private final String F[];
    private final Paint G;
    private volatile boolean H;
    private volatile boolean I;
    public final CameraManager b;
    public final z c;
    public Set d;
    public SnapMode e;
    public f f;
    public boolean g;
    public CountDownLatch h;
    public String i;
    public j j;
    public final x k;
    private final Context l;
    private final boolean m;
    private final ZoomableContainer n;
    private final SmudgeView o;
    private final BoundingBoxView p;
    private final DebugView q;
    private final com.google.android.apps.unveil.textinput.aa r;
    private final Handler s;
    private final w t;
    private ac u;
    private final AtomicReference v;
    private final AtomicReference w;
    private y x;
    private String y;
    private long z;

    public TextInput(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = SnapMode.TAKE_PICTURE;
        v = new AtomicReference();
        w = new AtomicReference();
        z = -1L;
        C = new Rect();
        D = true;
        E = false;
        g = false;
        h = new CountDownLatch(0);
        k = new x(this);
        l = context;
        F = context.getResources().getStringArray(e.text_input_languages);
        y = context.getResources().getString(h.text_input_default_user_agent);
        ColorMatrix colormatrix = new ColorMatrix();
        colormatrix.setSaturation(0.0F);
        G = new Paint();
        G.setColorFilter(new ColorMatrixColorFilter(colormatrix));
        attributeset = context.obtainStyledAttributes(attributeset, i.TextInput);
        int i1 = attributeset.getResourceId(i.TextInput_custom_layout, 0);
        attributeset.recycle();
        int j1 = i1;
        if (i1 == 0)
        {
            j1 = g.text_input_layout;
        }
        LayoutInflater.from(context).inflate(j1, this);
        b = (CameraManager)findViewById(f.camera_manager);
        attributeset = new Size(1280, 720);
        b.setFullScreenDisplaySize(attributeset);
        b.setAcquireCameraOnVisibilityChange(false);
        b.a(this);
        b.a(n.b);
        n = (ZoomableContainer)findViewById(f.zoomable_container);
        p = (BoundingBoxView)findViewById(f.bounding_box_view);
        o = (SmudgeView)findViewById(f.smudge_view);
        boolean flag;
        if (n != null && p != null && o != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if (m)
        {
            r = new com.google.android.apps.unveil.textinput.aa(context);
            p.setTextMasker(r);
            o.setListener(this);
            o.setAcceptSmudges(false);
            u = new ai(p, r, this);
            o();
        } else
        {
            r = null;
        }
        q = null;
        s = new Handler();
        c = new z(this);
        t = new w(this, b);
        if (!(context.getApplicationContext() instanceof k))
        {
            attributeset = b;
            context = com.google.android.apps.unveil.env.t.a(new aa(context));
            com.google.android.apps.unveil.env.s s1 = com.google.android.apps.unveil.env.t.a(Boolean.valueOf(false));
            com.google.android.apps.unveil.env.s s2 = com.google.android.apps.unveil.env.t.a(com/google/android/apps/unveil/sensors/proxies/camera/RealCamera.getSimpleName());
            com.google.android.apps.unveil.textinput.l l1 = new com.google.android.apps.unveil.textinput.l(this);
            attributeset.b = context;
            attributeset.c = s1;
            attributeset.d = s2;
            attributeset.e = l1;
            attributeset.a();
        }
        setOnClickListener(new o(this));
        setVisibility(8);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    private Bitmap a(Bitmap bitmap)
    {
        Rect rect = x.a(bitmap);
        if (rect == null)
        {
            return null;
        }
        Bitmap bitmap1;
        Matrix matrix;
        try
        {
            bitmap1 = Bitmap.createBitmap((int)((float)rect.width() * 1.0F), (int)((float)rect.height() * 1.0F), bitmap.getConfig());
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            a.f("Unable to optimize image for OCR", new Object[0]);
            return null;
        }
        matrix = new Matrix();
        matrix.postTranslate(-rect.left, -rect.top);
        matrix.postScale(1.0F, 1.0F);
        (new Canvas(bitmap1)).drawBitmap(bitmap, matrix, G);
        u.a(z, new Point(rect.left, rect.top));
        return bitmap1;
    }

    static void a(TextInput textinput)
    {
        textinput.r();
    }

    static void a(TextInput textinput, boolean flag)
    {
        Object obj;
        Object obj1;
label0:
        {
            obj = new AtomicReference();
            textinput.b.a(new s(textinput, ((AtomicReference) (obj))));
            float f1;
            float f2;
            Size size;
            Size size1;
            int i1;
            int k1;
            int l1;
            int i2;
            int j2;
            try
            {
                textinput.h.await();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((InterruptedException) (obj1)).printStackTrace();
            }
            obj1 = new Size(textinput.o.getWidth(), textinput.o.getHeight());
            size = textinput.b.getPictureSize();
            size1 = textinput.b.getPreviewSize();
            a.a("allocateBitmapsForCapture:displayedSize(%s), capturedImageSize(%s), cameraPreviewSize(%s), cameraManager(%dx%d)", new Object[] {
                obj1, size, size1, Integer.valueOf(textinput.b.getWidth()), Integer.valueOf(textinput.b.getHeight())
            });
            f1 = (float)size.height / (float)size1.height;
            f2 = (float)size.width / (float)size1.width;
            a.a("vertical ratio %.2f, horizontal ratio %.2f", new Object[] {
                Float.valueOf(f1), Float.valueOf(f2)
            });
            f1 = Math.min(f1, f2);
            i1 = (int)((float)size1.width * f1);
            l1 = (int)(f1 * (float)size1.height);
            a.a("cropped size %dx%d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l1)
            });
            textinput.C.left = (size.width - i1) / 2;
            textinput.C.right = textinput.C.left + i1;
            textinput.C.top = (size.height - l1) / 2;
            textinput.C.bottom = textinput.C.top + l1;
            a.a("cropped rect %s", new Object[] {
                textinput.C
            });
            j2 = CameraManager.a(textinput.getContext());
            if (j2 != 90)
            {
                i2 = l1;
                k1 = i1;
                if (j2 != 270)
                {
                    break label0;
                }
            }
            k1 = l1;
            i2 = i1;
        }
        obj1 = Bitmap.createBitmap(k1, i2, android.graphics.Bitmap.Config.RGB_565);
        if (obj1 == null || ((AtomicReference) (obj)).get() == null)
        {
            return;
        }
        Canvas canvas = new Canvas(((Bitmap) (obj1)));
        int j1 = CameraManager.a(textinput.getContext());
        if (j1 == 270 || j1 == 180)
        {
            canvas.scale(-1F, -1F, ((Bitmap) (obj1)).getWidth() / 2, ((Bitmap) (obj1)).getHeight() / 2);
        }
        if (j1 == 90 || j1 == 270)
        {
            Matrix matrix = new Matrix();
            matrix.postRotate(90F, ((Bitmap) (obj1)).getWidth() / 2, ((Bitmap) (obj1)).getWidth() / 2);
            canvas.concat(matrix);
            canvas.drawBitmap(((j)((AtomicReference) (obj)).get()).c(), textinput.C, new Rect(0, 0, ((Bitmap) (obj1)).getHeight(), ((Bitmap) (obj1)).getWidth()), null);
        } else
        {
            canvas.drawBitmap(((j)((AtomicReference) (obj)).get()).c(), textinput.C, new Rect(0, 0, ((Bitmap) (obj1)).getWidth(), ((Bitmap) (obj1)).getHeight()), null);
        }
        obj = com.google.android.apps.unveil.env.k.a(((Bitmap) (obj1)), 90);
        textinput.v.set(obj);
        textinput.s.post(new com.google.android.apps.unveil.textinput.t(textinput, ((j) (obj)), flag));
        textinput.b.e();
    }

    public static final boolean a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            if ((context = context.getPackageManager()) != null && context.hasSystemFeature("android.hardware.camera") && Camera.getNumberOfCameras() != 0)
            {
                try
                {
                    Camera.getCameraInfo(0, new android.hardware.Camera.CameraInfo());
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    a.f("This device claims it has a camera, but attempted getCameraInfo failed", new Object[0]);
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean a(Context context, String s1, Collection collection)
    {
        if (!a(context))
        {
            return false;
        } else
        {
            return collection.contains(s1);
        }
    }

    static SmudgeView b(TextInput textinput)
    {
        return textinput.o;
    }

    private void b(j j1)
    {
        u.a(z, j1.b());
        u.a(z, new Point(0, 0));
        Bitmap bitmap = a(j1.c());
        if (bitmap == null)
        {
            A.a(j1.c(), E, i);
        } else
        {
            A.a(bitmap, E, i);
            bitmap.recycle();
        }
        if (m)
        {
            o.setImageToDisplay(j1.c(), null);
        }
        j = j1;
    }

    static void b(TextInput textinput, boolean flag)
    {
        textinput.h = new CountDownLatch(1);
        textinput.k.b = flag;
        textinput.k.a(textinput.b.getExecutor(), textinput.s);
    }

    static y c(TextInput textinput)
    {
        return textinput.x;
    }

    static CountDownLatch d(TextInput textinput)
    {
        return textinput.h;
    }

    static f e(TextInput textinput)
    {
        return textinput.f;
    }

    static void f(TextInput textinput)
    {
        textinput.q();
    }

    static ZoomableContainer g(TextInput textinput)
    {
        return textinput.n;
    }

    private m getLogServer()
    {
        if (B == null)
        {
            String s1 = "https://www.google.com/m/voice-search/";
            if (!"https://www.google.com/m/voice-search/".endsWith("/"))
            {
                s1 = String.valueOf("https://www.google.com/m/voice-search/").concat("/");
            }
            B = (new m()).a(String.valueOf(s1).concat("fallback")).b("c548_232a_f5c8_05ff").a().b().a(true);
        }
        return B;
    }

    static Context h(TextInput textinput)
    {
        return textinput.l;
    }

    static m i(TextInput textinput)
    {
        return textinput.getLogServer();
    }

    static CameraManager j(TextInput textinput)
    {
        return textinput.b;
    }

    static boolean k(TextInput textinput)
    {
        return textinput.D;
    }

    static void m()
    {
    }

    static af n()
    {
        return a;
    }

    private void o()
    {
        b();
        A = new e(u, getContext(), y, "translate");
    }

    private boolean p()
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (f != null && f.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f != null && !f.a)
        {
            s.post(new p(this));
        }
        u.b();
        o();
        j = null;
        if (m)
        {
            o.setAcceptSmudges(false);
            com.google.android.apps.unveil.textinput.a.a(o, o.getAlphaValue(), 0.0F, 400L, null, new q(this));
            r.a();
            r.a(k.b);
            p.setVisibility(8);
            n.a();
        }
        H = false;
        x.h();
        if (flag)
        {
            flag1 = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag1;
        Exception exception;
        exception;
        throw exception;
    }

    private void q()
    {
        if (m)
        {
            Matrix matrix = new Matrix();
            int ai1[] = c;
            j j1;
            int i1;
            if (((z) (ai1)).a == null)
            {
                j1 = null;
            } else
            {
                a.a("get recent frame: %dx%d", new Object[] {
                    Integer.valueOf(((z) (ai1)).a.c), Integer.valueOf(((z) (ai1)).a.d)
                });
                j1 = com.google.android.apps.unveil.env.k.a(((z) (ai1)).a.e(), ((z) (ai1)).a.c, ((z) (ai1)).a.d);
                ((z) (ai1)).a.h();
                ai1.a = null;
            }
            i1 = CameraManager.a(getContext());
            if (j1 != null)
            {
                if (i1 == 90 || i1 == 270)
                {
                    float f1 = Math.min(j1.b().width / 2, j1.b().height / 2);
                    matrix.postRotate(i1, f1, f1);
                    if (i1 == 270)
                    {
                        matrix.postTranslate(0.0F, j1.b().width - j1.b().height);
                    }
                    matrix.postScale((float)b.getWidth() / (float)j1.b().height, (float)b.getHeight() / (float)j1.b().width);
                } else
                {
                    matrix.postRotate(i1, j1.b().width / 2, j1.b().height / 2);
                    matrix.postScale((float)b.getWidth() / (float)j1.b().width, (float)b.getHeight() / (float)j1.b().height);
                }
                ai1 = new int[2];
                b.getLocationInWindow(ai1);
                i1 = ai1[1];
                o.getLocationInWindow(ai1);
                matrix.postTranslate(0.0F, -(ai1[1] - i1));
                o.setImageToDisplay(j1.c(), matrix);
                j1.e();
            } else
            {
                o.setImageToDisplay(null, null);
            }
            com.google.android.apps.unveil.textinput.a.a(o, 1.0F, 1.0F, 600L, new DecelerateInterpolator(), null);
        }
    }

    private void r()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = I;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!g || !b.i()) goto _L1; else goto _L3
_L3:
        I = false;
        b.c();
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        f = new f(b, CameraManager.a(getContext()));
        if (d != null)
        {
            c c1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); f.a(c1, 2))
            {
                c1 = (c)iterator.next();
            }

        }
        break MISSING_BLOCK_LABEL_127;
        Exception exception;
        exception;
        throw exception;
        f.a(c, 0);
        f.a(t, 1);
_L4:
        Size size1;
        int i1;
        size1 = b.getPreviewSize();
        i1 = CameraManager.a(getContext());
        Size size;
        if (i1 != 90)
        {
            size = size1;
            if (i1 != 270)
            {
                break MISSING_BLOCK_LABEL_201;
            }
        }
        size = new Size(size1.height, size1.width);
        af af1 = a;
        String s1 = String.valueOf(size);
        af1.a((new StringBuilder(String.valueOf(s1).length() + 16)).append("preview size is ").append(s1).toString(), new Object[0]);
        f.a(size);
        x.e();
          goto _L1
        f.b();
          goto _L4
    }

    public final void a()
    {
        a.a("on smudge started.", new Object[0]);
        o.a();
    }

    public final void a(j j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (m)
        {
            o.a();
            com.google.android.apps.unveil.textinput.a.a(o, 1.0F, 1.0F, 600L, new DecelerateInterpolator(), null);
        }
        z = u.c();
        if (f != null)
        {
            f.b();
        }
        if (m)
        {
            r.a();
            r.a(k.b);
            p.setVisibility(8);
            n.a();
        }
        b(j1);
        if (m)
        {
            o.setAcceptSmudges(true);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        j1;
        throw j1;
    }

    public final void a(com.google.android.apps.unveil.textinput.k k1)
    {
        a.a("on smudge complete.", new Object[0]);
        if (u.f() == z && !u.a())
        {
            r.a(k1);
            if (u.d())
            {
                p.setVisibility(0);
                p.invalidate();
                x.d(r.c());
                return;
            }
        }
    }

    public final void a(com.google.android.apps.unveil.textinput.k k1, Rect rect)
    {
        a.a("on smudge progress.", new Object[0]);
        if (u.f() != z || !u.d())
        {
            return;
        } else
        {
            r.a(k1);
            p.setVisibility(0);
            p.invalidate(rect);
            return;
        }
    }

    public final void a(String s1)
    {
        a.e("Failed to acquire camera.", new Object[0]);
        y y1 = x;
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "".concat(s1);
        } else
        {
            s1 = new String("");
        }
        y1.c(s1);
    }

    public final void a(boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (!H) goto _L2; else goto _L1
_L1:
        a.a("You already snapped, ignoring duplicate snap request.", new Object[0]);
_L11:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        H = true;
        if (m)
        {
            o.a();
        }
        z = u.c();
        k.b();
        if (e != SnapMode.DEBUG_BOTH_HIGHRES && e != SnapMode.DEBUG_BOTH_LOWRES && e != SnapMode.RECENT_FRAME) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        int k1;
        obj = c.h();
        k1 = CameraManager.a(getContext());
        obj1 = ((j) (obj)).b();
        if (90 != k1 && 270 != k1) goto _L6; else goto _L5
_L5:
        int i1;
        int j1;
        i1 = ((Size) (obj1)).height;
        j1 = ((Size) (obj1)).width;
_L12:
        Canvas canvas;
        obj1 = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(((Bitmap) (obj1)));
        if (270 != k1 && 180 != k1) goto _L8; else goto _L7
_L7:
        canvas.scale(-1F, -1F, ((Bitmap) (obj1)).getWidth() / 2, ((Bitmap) (obj1)).getHeight() / 2);
          goto _L8
_L18:
        Matrix matrix = new Matrix();
        matrix.postRotate(90F, ((Bitmap) (obj1)).getWidth() / 2, ((Bitmap) (obj1)).getWidth() / 2);
        canvas.concat(matrix);
        canvas.drawBitmap(((j) (obj)).c(), null, new Rect(0, 0, ((Bitmap) (obj1)).getHeight(), ((Bitmap) (obj1)).getWidth()), null);
_L13:
        obj = com.google.android.apps.unveil.env.k.a(((Bitmap) (obj1)), 90);
        w.set(obj);
        s.post(new r(this, ((j) (obj))));
_L4:
        if (e != SnapMode.EXTERNAL) goto _L10; else goto _L9
_L9:
        q();
        f.b();
        x.f();
        b.e();
_L14:
        if (m)
        {
            o.setAcceptSmudges(true);
        }
          goto _L11
        obj;
        throw obj;
_L6:
        i1 = ((Size) (obj1)).width;
        j1 = ((Size) (obj1)).height;
          goto _L12
_L19:
        canvas.drawBitmap(((j) (obj)).c(), null, new Rect(0, 0, ((Bitmap) (obj1)).getWidth(), ((Bitmap) (obj1)).getHeight()), null);
          goto _L13
_L10:
        if (e != SnapMode.RECENT_FRAME)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        q();
        f.b();
        x.f();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        b(getStashedFrame());
        b.e();
          goto _L14
        obj = new u(this, flag);
        if (t == null)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        obj1 = t;
        if (((w) (obj1)).j.b.f()) goto _L16; else goto _L15
_L15:
        flag = flag1;
_L17:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        a.a("Trigger focus before taking picture.", new Object[0]);
        b.a(((com.google.android.apps.unveil.sensors.k) (obj)));
          goto _L14
_L16:
        if (!((w) (obj1)).j.b.g())
        {
            break MISSING_BLOCK_LABEL_550;
        }
        flag = true;
          goto _L17
        if (((w) (obj1)).j.D)
        {
            break MISSING_BLOCK_LABEL_565;
        }
        flag = true;
          goto _L17
        flag = ((com.google.android.apps.unveil.nonstop.e) (obj1)).a;
          goto _L17
        a.a("Already in focus, no focus necessary.", new Object[0]);
        ((com.google.android.apps.unveil.sensors.k) (obj)).a(true);
          goto _L14
_L8:
        if (k1 != 90 && k1 != 270) goto _L19; else goto _L18
    }

    public final void b()
    {
        if (A != null)
        {
            A.a();
        }
    }

    public final boolean b(String s1)
    {
        af af1 = a;
        String s2;
        if (TextUtils.isEmpty(s1))
        {
            s2 = "auto-detect";
        } else
        {
            s2 = s1;
        }
        af1.a("start input explicitly, language %s", new Object[] {
            s2
        });
        b.setVisibility(0);
        I = true;
        b.b();
        i = s1;
        com.google.android.goggles.c.a().b();
        return p();
    }

    public final void c()
    {
        a.b("Camera connected", new Object[0]);
        setVisibility(0);
        r();
    }

    public final boolean c(String s1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = s1.equals(i);
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        flag = flag1;
        if (s1.equals(i))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = s1;
        flag = flag1;
        if (u.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        com.google.android.goggles.c.a().b();
        a(j);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public final void d()
    {
        a.e("Failed to apply camera flash setting.", new Object[0]);
    }

    public final void e()
    {
        a.e("Failed to apply camera quality settings.", new Object[0]);
    }

    public final void f()
    {
        this;
        JVM INSTR monitorenter ;
        a.b("Camera preview size changed.", new Object[0]);
        setAutoFocus(D);
        if (f != null)
        {
            f.a(null);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void g()
    {
        a.b("Camera layout completed.", new Object[0]);
        g = true;
        r();
        if (m)
        {
            android.view.ViewGroup.LayoutParams layoutparams = n.getLayoutParams();
            layoutparams.width = b.getWidth();
            n.setLayoutParams(layoutparams);
            n.post(new v(this));
        }
    }

    public SnapMode getSnapMode()
    {
        return e;
    }

    public j getStashedFrame()
    {
        if (e == SnapMode.TAKE_PICTURE)
        {
            throw new UnsupportedOperationException("Cannot get low-res frame in SnapMode.TAKE_PICTURE");
        } else
        {
            return (j)w.get();
        }
    }

    public j getStashedPicture()
    {
        if (e == SnapMode.RECENT_FRAME)
        {
            throw new UnsupportedOperationException("Cannot get high-res picture in SnapMode.RECENT_FRAME");
        } else
        {
            return (j)v.get();
        }
    }

    public String[] getSupportedLanguages()
    {
        return F;
    }

    public final void h()
    {
        switch (n.a[e.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            a((j)v.get());
            return;

        case 3: // '\003'
        case 4: // '\004'
            a((j)w.get());
            break;
        }
    }

    public final boolean i()
    {
        return f != null && f.a;
    }

    public final void j()
    {
        a.a("no results.", new Object[0]);
        x.a();
    }

    public final void k()
    {
        a.a("on result.", new Object[0]);
        y y1 = x;
        String s1;
        if (r == null)
        {
            s1 = null;
        } else
        {
            s1 = r.c();
        }
        y1.d(s1);
    }

    public final void l()
    {
        a.a("on network error: %d", new Object[] {
            Integer.valueOf(0)
        });
        x.b();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    public void setAutoFocus(boolean flag)
    {
        D = flag;
        b.setFocusable(true);
        if (!b.f())
        {
            a.a("camera does not support focus.", new Object[0]);
            return;
        }
        if (b.g())
        {
            b.a(flag);
            a.a("camera supports continuous focus.", new Object[0]);
            return;
        } else
        {
            a.a("use image blurriness based auto focus.", new Object[0]);
            return;
        }
    }

    public void setImageLogging(boolean flag)
    {
        E = flag;
    }

    public void setListener(y y1)
    {
        x = y1;
    }

    public void setSnapMode(SnapMode snapmode)
    {
        e = snapmode;
    }

    public void setTextQueryListener(ac ac1)
    {
        u = ac1;
        o();
    }

    public void setUserAgent(String s1)
    {
        if (!TextUtils.equals(y, s1))
        {
            y = s1;
            o();
        }
    }


    private class SnapMode extends Enum
    {

        public static final SnapMode DEBUG_BOTH_HIGHRES;
        public static final SnapMode DEBUG_BOTH_LOWRES;
        public static final SnapMode EXTERNAL;
        public static final SnapMode RECENT_FRAME;
        public static final SnapMode TAKE_PICTURE;
        private static final SnapMode a[];

        public static SnapMode valueOf(String s1)
        {
            return (SnapMode)Enum.valueOf(com/google/android/apps/unveil/textinput/TextInput$SnapMode, s1);
        }

        public static SnapMode[] values()
        {
            return (SnapMode[])a.clone();
        }

        static 
        {
            EXTERNAL = new SnapMode("EXTERNAL", 0);
            TAKE_PICTURE = new SnapMode("TAKE_PICTURE", 1);
            RECENT_FRAME = new SnapMode("RECENT_FRAME", 2);
            DEBUG_BOTH_LOWRES = new SnapMode("DEBUG_BOTH_LOWRES", 3);
            DEBUG_BOTH_HIGHRES = new SnapMode("DEBUG_BOTH_HIGHRES", 4);
            a = (new SnapMode[] {
                EXTERNAL, TAKE_PICTURE, RECENT_FRAME, DEBUG_BOTH_LOWRES, DEBUG_BOTH_HIGHRES
            });
        }

        private SnapMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
