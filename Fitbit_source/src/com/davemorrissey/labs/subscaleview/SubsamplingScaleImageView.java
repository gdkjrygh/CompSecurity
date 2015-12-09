// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.davemorrissey.labs.subscaleview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.davemorrissey.labs.subscaleview.a.a;
import com.davemorrissey.labs.subscaleview.a.b;
import com.davemorrissey.labs.subscaleview.a.d;
import com.davemorrissey.labs.subscaleview.a.e;
import com.davemorrissey.labs.subscaleview.a.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.davemorrissey.labs.subscaleview:
//            c, ImageViewState

public class SubsamplingScaleImageView extends View
{

    public static final int a = -1;
    private static final int ax = 1;
    public static final int b = 0;
    public static final int c = 90;
    public static final int d = 180;
    public static final int e = 270;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    private static final String q = com/davemorrissey/labs/subscaleview/SubsamplingScaleImageView.getSimpleName();
    private static final List r = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(90), Integer.valueOf(180), Integer.valueOf(270), Integer.valueOf(-1)
    });
    private static final List s = Arrays.asList(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)
    });
    private static final List t = Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(1)
    });
    private static final List u = Arrays.asList(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)
    });
    private static final List v = Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(3)
    });
    private boolean A;
    private int B;
    private float C;
    private float D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    private float K;
    private int L;
    private float M;
    private float N;
    private PointF O;
    private PointF P;
    private Float Q;
    private PointF R;
    private PointF S;
    private int T;
    private int U;
    private int V;
    private Rect W;
    private Paint aA;
    private f aB;
    private Matrix aC;
    private RectF aD;
    private float aE[];
    private float aF[];
    private Rect aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private GestureDetector af;
    private d ag;
    private final Object ah;
    private b ai;
    private b aj;
    private PointF ak;
    private float al;
    private final float am;
    private PointF an;
    private float ao;
    private PointF ap;
    private boolean aq;
    private a ar;
    private boolean as;
    private boolean at;
    private e au;
    private android.view.View.OnLongClickListener av;
    private Handler aw;
    private Paint ay;
    private Paint az;
    private Bitmap w;
    private boolean x;
    private int y;
    private Map z;

    public SubsamplingScaleImageView(Context context)
    {
        this(context, null);
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        B = 0;
        C = 2.0F;
        D = D();
        E = -1;
        F = 1;
        G = 1;
        H = true;
        I = true;
        J = true;
        K = 1.0F;
        L = 1;
        ah = new Object();
        ai = new a(com/davemorrissey/labs/subscaleview/a/e);
        aj = new a(com/davemorrissey/labs/subscaleview/a/f);
        aE = new float[8];
        aF = new float[8];
        d(160);
        h(160);
        a(context);
        aw = new Handler(new _cls1());
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, R.styleable.SubsamplingScaleImageView);
            if (attributeset.hasValue(1))
            {
                String s1 = attributeset.getString(1);
                if (s1 != null && s1.length() > 0)
                {
                    a(com.davemorrissey.labs.subscaleview.c.a(s1).a());
                }
            }
            if (attributeset.hasValue(0))
            {
                int i1 = attributeset.getResourceId(0, 0);
                if (i1 > 0)
                {
                    a(com.davemorrissey.labs.subscaleview.c.a(i1).a());
                }
            }
            if (attributeset.hasValue(2))
            {
                c(attributeset.getBoolean(2, true));
            }
            if (attributeset.hasValue(3))
            {
                a(attributeset.getBoolean(3, true));
            }
            if (attributeset.hasValue(4))
            {
                b(attributeset.getBoolean(4, true));
            }
            if (attributeset.hasValue(5))
            {
                g(attributeset.getColor(5, Color.argb(0, 0, 0, 0)));
            }
            attributeset.recycle();
        }
        am = TypedValue.applyDimension(1, 20F, context.getResources().getDisplayMetrics());
    }

    private int A()
    {
        int i1 = C();
        if (i1 == 90 || i1 == 270)
        {
            return U;
        } else
        {
            return T;
        }
    }

    private int B()
    {
        int i1 = C();
        if (i1 == 90 || i1 == 270)
        {
            return T;
        } else
        {
            return U;
        }
    }

    private int C()
    {
        if (B == -1)
        {
            return V;
        } else
        {
            return B;
        }
    }

    private float D()
    {
        int i1 = getPaddingBottom() + getPaddingTop();
        int j1 = getPaddingLeft() + getPaddingRight();
        if (G == 2)
        {
            return Math.max((float)(getWidth() - j1) / (float)A(), (float)(getHeight() - i1) / (float)B());
        }
        if (G == 3 && D > 0.0F)
        {
            return D;
        } else
        {
            return Math.min((float)(getWidth() - j1) / (float)A(), (float)(getHeight() - i1) / (float)B());
        }
    }

    private float a(float f1, float f2, float f3, float f4)
    {
        f1 -= f2;
        f2 = f3 - f4;
        return FloatMath.sqrt(f1 * f1 + f2 * f2);
    }

    private float a(int i1, long l1, float f1, float f2, long l2)
    {
        switch (i1)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unexpected easing type: ").append(i1).toString());

        case 2: // '\002'
            return b(l1, f1, f2, l2);

        case 1: // '\001'
            return a(l1, f1, f2, l2);
        }
    }

    private float a(long l1, float f1, float f2, long l2)
    {
        float f3 = (float)l1 / (float)l2;
        return (f3 - 2.0F) * (-f2 * f3) + f1;
    }

    static float a(SubsamplingScaleImageView subsamplingscaleimageview, float f1)
    {
        subsamplingscaleimageview.N = f1;
        return f1;
    }

    static int a(SubsamplingScaleImageView subsamplingscaleimageview, int i1)
    {
        subsamplingscaleimageview.ae = i1;
        return i1;
    }

    static int a(SubsamplingScaleImageView subsamplingscaleimageview, String s1)
    {
        return subsamplingscaleimageview.a(s1);
    }

    private int a(String s1)
    {
        if (!s1.startsWith("file:///") || s1.startsWith("file:///android_asset/")) goto _L2; else goto _L1
_L1:
        int i1 = (new ExifInterface(s1.substring("file:///".length() - 1))).getAttributeInt("Orientation", 1);
        if (i1 == 1) goto _L2; else goto _L3
_L5:
        Log.w(q, (new StringBuilder()).append("Unsupported EXIF orientation: ").append(i1).toString());
        return 0;
        s1;
        Log.w(q, "Could not get EXIF orientation of image");
_L2:
        return 0;
_L3:
        if (i1 == 0)
        {
            return 0;
        }
        if (i1 == 6)
        {
            return 90;
        }
        if (i1 == 3)
        {
            return 180;
        }
        if (i1 == 8)
        {
            return 270;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Point a(Canvas canvas)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        canvas = new Point(((Integer)android/graphics/Canvas.getMethod("getMaximumBitmapWidth", new Class[0]).invoke(canvas, new Object[0])).intValue(), ((Integer)android/graphics/Canvas.getMethod("getMaximumBitmapHeight", new Class[0]).invoke(canvas, new Object[0])).intValue());
        return canvas;
        canvas;
        return new Point(2048, 2048);
    }

    private PointF a(float f1, float f2, float f3)
    {
        int i1 = getPaddingLeft();
        int j1 = (getWidth() - getPaddingRight() - getPaddingLeft()) / 2;
        int k1 = getPaddingTop();
        int l1 = (getHeight() - getPaddingBottom() - getPaddingTop()) / 2;
    /* block-local class not found */
    class f {}

        if (aB == null)
        {
            aB = new f(0.0F, new PointF(0.0F, 0.0F), null);
        }
        com.davemorrissey.labs.subscaleview.f.a(aB, f3);
        com.davemorrissey.labs.subscaleview.f.b(aB).set((float)(i1 + j1) - f1 * f3, (float)(k1 + l1) - f2 * f3);
        a(true, aB);
        return com.davemorrissey.labs.subscaleview.f.b(aB);
    }

    private PointF a(float f1, float f2, float f3, PointF pointf)
    {
        PointF pointf1 = a(f1, f2, f3);
        int i1 = getPaddingLeft();
        int j1 = (getWidth() - getPaddingRight() - getPaddingLeft()) / 2;
        int k1 = getPaddingTop();
        int l1 = (getHeight() - getPaddingBottom() - getPaddingTop()) / 2;
        pointf.set(((float)(i1 + j1) - pointf1.x) / f3, ((float)(k1 + l1) - pointf1.y) / f3);
        return pointf;
    }

    static PointF a(SubsamplingScaleImageView subsamplingscaleimageview, float f1, float f2, float f3, PointF pointf)
    {
        return subsamplingscaleimageview.a(f1, f2, f3, pointf);
    }

    static PointF a(SubsamplingScaleImageView subsamplingscaleimageview, PointF pointf)
    {
        subsamplingscaleimageview.ak = pointf;
        return pointf;
    }

    static android.view.View.OnLongClickListener a(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.av;
    }

    static a a(SubsamplingScaleImageView subsamplingscaleimageview, a a1)
    {
        subsamplingscaleimageview.ar = a1;
        return a1;
    }

    private void a(Context context)
    {
        af = new GestureDetector(context, new _cls2(context));
    }

    private void a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        if (w == null && !at) goto _L2; else goto _L1
_L1:
        bitmap.recycle();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (aa == null)
        {
            break; /* Loop/switch isn't completed */
        }
        w = Bitmap.createBitmap(bitmap, aa.left, aa.top, aa.width(), aa.height());
_L5:
        x = true;
        if (v())
        {
            invalidate();
            requestLayout();
        }
        if (true) goto _L4; else goto _L3
        bitmap;
        throw bitmap;
_L3:
        w = bitmap;
          goto _L5
    }

    private void a(Bitmap bitmap, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (T > 0 && U > 0 && (T != bitmap.getWidth() || U != bitmap.getHeight()))
        {
            e(false);
        }
        if (w != null)
        {
            w.recycle();
        }
        x = false;
        w = bitmap;
        T = bitmap.getWidth();
        U = bitmap.getHeight();
        V = i1;
        if (v() || w())
        {
            invalidate();
            requestLayout();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    private void a(Point point)
    {
        this;
        JVM INSTR monitorenter ;
        aB = new f(0.0F, new PointF(0.0F, 0.0F), null);
        a(true, aB);
        y = e(com.davemorrissey.labs.subscaleview.f.a(aB));
        if (y > 1)
        {
            y = y / 2;
        }
        b(point);
    /* block-local class not found */
    class h {}

        g g1;
        for (point = ((List)z.get(Integer.valueOf(y))).iterator(); point.hasNext(); (new h(ag, g1)).execute(new Void[0]))
        {
    /* block-local class not found */
    class g {}

            g1 = (g)point.next();
        }

        break MISSING_BLOCK_LABEL_144;
        point;
        throw point;
        f(true);
        this;
        JVM INSTR monitorexit ;
    }

    private void a(Rect rect, Rect rect1)
    {
        if (C() == 0)
        {
            rect1.set(rect);
            return;
        }
        if (C() == 90)
        {
            rect1.set(rect.top, U - rect.right, rect.bottom, U - rect.left);
            return;
        }
        if (C() == 180)
        {
            rect1.set(T - rect.right, U - rect.bottom, T - rect.left, U - rect.top);
            return;
        } else
        {
            rect1.set(T - rect.bottom, rect.left, T - rect.top, rect.right);
            return;
        }
    }

    private void a(ImageViewState imageviewstate)
    {
        if (imageviewstate != null && imageviewstate.b() != null && r.contains(Integer.valueOf(imageviewstate.c())))
        {
            B = imageviewstate.c();
            Q = Float.valueOf(imageviewstate.a());
            R = imageviewstate.b();
            invalidate();
        }
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, Context context)
    {
        subsamplingscaleimageview.a(context);
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, Bitmap bitmap)
    {
        subsamplingscaleimageview.a(bitmap);
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, Bitmap bitmap, int i1)
    {
        subsamplingscaleimageview.a(bitmap, i1);
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, PointF pointf, PointF pointf1)
    {
        subsamplingscaleimageview.c(pointf, pointf1);
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, Rect rect, Rect rect1)
    {
        subsamplingscaleimageview.a(rect, rect1);
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, android.view.View.OnLongClickListener onlongclicklistener)
    {
        subsamplingscaleimageview.View.setOnLongClickListener(onlongclicklistener);
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, d d1, int i1, int j1, int k1)
    {
        subsamplingscaleimageview.a(d1, i1, j1, k1);
    }

    static void a(SubsamplingScaleImageView subsamplingscaleimageview, boolean flag, f f1)
    {
        subsamplingscaleimageview.a(flag, f1);
    }

    private void a(d d1, int i1, int j1, int k1)
    {
        this;
        JVM INSTR monitorenter ;
        if (T > 0 && U > 0 && (T != i1 || U != j1))
        {
            e(false);
            if (w != null)
            {
                w.recycle();
                w = null;
                x = false;
            }
        }
        ag = d1;
        T = i1;
        U = j1;
        V = k1;
        v();
        w();
        invalidate();
        requestLayout();
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    private void a(boolean flag, f f1)
    {
        float f3 = 0.5F;
        boolean flag1 = flag;
        if (F == 2)
        {
            flag1 = flag;
            if (g())
            {
                flag1 = false;
            }
        }
        PointF pointf = com.davemorrissey.labs.subscaleview.f.b(f1);
        float f5 = j(com.davemorrissey.labs.subscaleview.f.a(f1));
        float f4 = f5 * (float)A();
        float f6 = f5 * (float)B();
        float f2;
        if (F == 3 && g())
        {
            pointf.x = Math.max(pointf.x, (float)(getWidth() / 2) - f4);
            pointf.y = Math.max(pointf.y, (float)(getHeight() / 2) - f6);
        } else
        if (flag1)
        {
            pointf.x = Math.max(pointf.x, (float)getWidth() - f4);
            pointf.y = Math.max(pointf.y, (float)getHeight() - f6);
        } else
        {
            pointf.x = Math.max(pointf.x, -f4);
            pointf.y = Math.max(pointf.y, -f6);
        }
        if (getPaddingLeft() > 0 || getPaddingRight() > 0)
        {
            f2 = (float)getPaddingLeft() / (float)(getPaddingLeft() + getPaddingRight());
        } else
        {
            f2 = 0.5F;
        }
        if (getPaddingTop() > 0 || getPaddingBottom() > 0)
        {
            f3 = (float)getPaddingTop() / (float)(getPaddingTop() + getPaddingBottom());
        }
        if (F == 3 && g())
        {
            f3 = Math.max(0, getWidth() / 2);
            f2 = Math.max(0, getHeight() / 2);
        } else
        if (flag1)
        {
            f4 = Math.max(0.0F, ((float)getWidth() - f4) * f2);
            f2 = Math.max(0.0F, ((float)getHeight() - f6) * f3);
            f3 = f4;
        } else
        {
            f3 = Math.max(0, getWidth());
            f2 = Math.max(0, getHeight());
        }
        pointf.x = Math.min(pointf.x, f3);
        pointf.y = Math.min(pointf.y, f2);
        com.davemorrissey.labs.subscaleview.f.a(f1, f5);
    }

    private void a(float af1[], float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7, float f8)
    {
        af1[0] = f1;
        af1[1] = f2;
        af1[2] = f3;
        af1[3] = f4;
        af1[4] = f5;
        af1[5] = f6;
        af1[6] = f7;
        af1[7] = f8;
    }

    private boolean a(g g1)
    {
        float f1 = f(0.0F);
        float f2 = f(getWidth());
        float f3 = g(0.0F);
        float f4 = g(getHeight());
        return f1 <= (float)com.davemorrissey.labs.subscaleview.g.d(g1).right && (float)com.davemorrissey.labs.subscaleview.g.d(g1).left <= f2 && f3 <= (float)com.davemorrissey.labs.subscaleview.g.d(g1).bottom && (float)com.davemorrissey.labs.subscaleview.g.d(g1).top <= f4;
    }

    static boolean a(SubsamplingScaleImageView subsamplingscaleimageview, boolean flag)
    {
        subsamplingscaleimageview.ad = flag;
        return flag;
    }

    private float b(long l1, float f1, float f2, long l2)
    {
        float f3 = (float)l1 / ((float)l2 / 2.0F);
        if (f3 < 1.0F)
        {
            return f3 * ((f2 / 2.0F) * f3) + f1;
        } else
        {
            f3--;
            return (f3 * (f3 - 2.0F) - 1.0F) * (-f2 / 2.0F) + f1;
        }
    }

    static float b(SubsamplingScaleImageView subsamplingscaleimageview, float f1)
    {
        subsamplingscaleimageview.ao = f1;
        return f1;
    }

    static PointF b(SubsamplingScaleImageView subsamplingscaleimageview, PointF pointf)
    {
        subsamplingscaleimageview.P = pointf;
        return pointf;
    }

    private Rect b(Rect rect, Rect rect1)
    {
        rect1.set((int)h(rect.left), (int)i(rect.top), (int)h(rect.right), (int)i(rect.bottom));
        return rect1;
    }

    private void b(Point point)
    {
        int i1;
        int j1;
        int l1;
        z = new LinkedHashMap();
        i1 = y;
        j1 = 1;
        l1 = 1;
_L2:
        int k1;
        int k2;
        int i3;
        k1 = A() / j1;
        i3 = B() / l1;
        int i2 = k1 / i1;
        k2 = i3 / i1;
        for (; i2 + j1 + 1 > point.x || (double)i2 > (double)getWidth() * 1.25D && i1 < y; i2 = k1 / i1)
        {
            j1++;
            k1 = A() / j1;
        }

        break;
        while (false) 
        {
            j2 = i3;
            for (; k2 + l1 + 1 > point.y || (double)k2 > (double)getHeight() * 1.25D && i1 < y; k2 = j2 / i1)
            {
                l1++;
                j2 = B() / l1;
            }

            arraylist = new ArrayList(j1 * l1);
            for (int l2 = 0; l2 < j1; l2++)
            {
                i3 = 0;
                while (i3 < l1) 
                {
                    g g1 = new g(null);
                    com.davemorrissey.labs.subscaleview.g.a(g1, i1);
                    int j3;
                    int k3;
                    boolean flag;
                    if (i1 == y)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    com.davemorrissey.labs.subscaleview.g.a(g1, flag);
                    if (l2 == j1 - 1)
                    {
                        j3 = A();
                    } else
                    {
                        j3 = (l2 + 1) * k1;
                    }
                    if (i3 == l1 - 1)
                    {
                        k3 = B();
                    } else
                    {
                        k3 = (i3 + 1) * j2;
                    }
                    com.davemorrissey.labs.subscaleview.g.a(g1, new Rect(l2 * k1, i3 * j2, j3, k3));
                    com.davemorrissey.labs.subscaleview.g.b(g1, new Rect(0, 0, 0, 0));
                    g.c(g1, new Rect(com.davemorrissey.labs.subscaleview.g.d(g1)));
                    arraylist.add(g1);
                    i3++;
                }
            }

            z.put(Integer.valueOf(i1), arraylist);
            if (i1 == 1)
            {
                return;
            }
            i1 /= 2;
        }
_L4:
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(SubsamplingScaleImageView subsamplingscaleimageview, android.view.View.OnLongClickListener onlongclicklistener)
    {
        subsamplingscaleimageview.View.setOnLongClickListener(onlongclicklistener);
    }

    static boolean b(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.H;
    }

    static boolean b(SubsamplingScaleImageView subsamplingscaleimageview, boolean flag)
    {
        subsamplingscaleimageview.ab = flag;
        return flag;
    }

    static float c(SubsamplingScaleImageView subsamplingscaleimageview, float f1)
    {
        return subsamplingscaleimageview.j(f1);
    }

    static PointF c(SubsamplingScaleImageView subsamplingscaleimageview, PointF pointf)
    {
        subsamplingscaleimageview.an = pointf;
        return pointf;
    }

    private void c(PointF pointf, PointF pointf1)
    {
        float f1;
        boolean flag;
        if (!H)
        {
            if (S != null)
            {
                pointf.x = S.x;
                pointf.y = S.y;
            } else
            {
                pointf.x = A() / 2;
                pointf.y = B() / 2;
            }
        }
        f1 = Math.min(C, K);
        if ((double)M <= (double)f1 * 0.90000000000000002D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            f1 = D();
        }
        if (L != 3) goto _L2; else goto _L1
_L1:
        a(f1, pointf);
_L4:
        invalidate();
        return;
_L2:
    /* block-local class not found */
    class b {}

        if (L == 2 || !flag || !H)
        {
            (new b(f1, pointf, null)).a(false).a();
        } else
        if (L == 1)
        {
            (new b(f1, pointf, pointf1, null)).a(false).a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean c(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.as;
    }

    static boolean c(SubsamplingScaleImageView subsamplingscaleimageview, boolean flag)
    {
        subsamplingscaleimageview.aq = flag;
        return flag;
    }

    static PointF d(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.O;
    }

    static PointF d(SubsamplingScaleImageView subsamplingscaleimageview, PointF pointf)
    {
        subsamplingscaleimageview.ap = pointf;
        return pointf;
    }

    private int e(float f1)
    {
        float f2 = f1;
        if (E > 0)
        {
            DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
            f2 = displaymetrics.xdpi;
            f2 = (displaymetrics.ydpi + f2) / 2.0F;
            f2 = f1 * ((float)E / f2);
        }
        int j1 = (int)((float)A() * f2);
        int i1 = (int)((float)B() * f2);
        if (j1 == 0 || i1 == 0)
        {
            return 32;
        }
        if (B() > i1 || A() > j1)
        {
            i1 = Math.round((float)B() / (float)i1);
            j1 = Math.round((float)A() / (float)j1);
            if (i1 >= j1)
            {
                i1 = j1;
            }
        } else
        {
            i1 = 1;
        }
        for (j1 = 1; j1 * 2 < i1; j1 *= 2) { }
        return j1;
    }

    private void e(boolean flag)
    {
        M = 0.0F;
        N = 0.0F;
        O = null;
        P = null;
        Q = Float.valueOf(0.0F);
        R = null;
        S = null;
        ab = false;
        ac = false;
        ad = false;
        ae = 0;
        y = 0;
        ak = null;
        al = 0.0F;
        an = null;
        ao = 0.0F;
        ap = null;
        aq = false;
        ar = null;
        aB = null;
        aC = null;
        aD = null;
        if (flag)
        {
            if (ag != null)
            {
                synchronized (ah)
                {
                    ag.b();
                    ag = null;
                }
            }
            if (w != null)
            {
                w.recycle();
            }
            T = 0;
            U = 0;
            V = 0;
            W = null;
            aa = null;
            as = false;
            at = false;
            w = null;
            x = false;
        }
        if (z == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        for (obj = z.entrySet().iterator(); ((Iterator) (obj)).hasNext();)
        {
            Iterator iterator = ((List)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()).iterator();
            while (iterator.hasNext()) 
            {
                g g1 = (g)iterator.next();
                com.davemorrissey.labs.subscaleview.g.a(g1, false);
                if (com.davemorrissey.labs.subscaleview.g.a(g1) != null)
                {
                    com.davemorrissey.labs.subscaleview.g.a(g1).recycle();
                    com.davemorrissey.labs.subscaleview.g.a(g1, null);
                }
            }
        }

        break MISSING_BLOCK_LABEL_318;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        z = null;
        a(getContext());
        return;
    }

    static boolean e(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.ab;
    }

    private float f(float f1)
    {
        if (O == null)
        {
            return (0.0F / 0.0F);
        } else
        {
            return (f1 - O.x) / M;
        }
    }

    static float f(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.M;
    }

    private void f(boolean flag)
    {
        if (ag != null && z != null)
        {
            int i1 = Math.min(y, e(M));
            Iterator iterator = z.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                Iterator iterator1 = ((List)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
                while (iterator1.hasNext()) 
                {
                    g g1 = (g)iterator1.next();
                    if (com.davemorrissey.labs.subscaleview.g.f(g1) < i1 || com.davemorrissey.labs.subscaleview.g.f(g1) > i1 && com.davemorrissey.labs.subscaleview.g.f(g1) != y)
                    {
                        com.davemorrissey.labs.subscaleview.g.a(g1, false);
                        if (com.davemorrissey.labs.subscaleview.g.a(g1) != null)
                        {
                            com.davemorrissey.labs.subscaleview.g.a(g1).recycle();
                            com.davemorrissey.labs.subscaleview.g.a(g1, null);
                        }
                    }
                    if (com.davemorrissey.labs.subscaleview.g.f(g1) == i1)
                    {
                        if (a(g1))
                        {
                            com.davemorrissey.labs.subscaleview.g.a(g1, true);
                            if (!g.c(g1) && com.davemorrissey.labs.subscaleview.g.a(g1) == null && flag)
                            {
                                (new h(ag, g1)).execute(new Void[0]);
                            }
                        } else
                        if (com.davemorrissey.labs.subscaleview.g.f(g1) != y)
                        {
                            com.davemorrissey.labs.subscaleview.g.a(g1, false);
                            if (com.davemorrissey.labs.subscaleview.g.a(g1) != null)
                            {
                                com.davemorrissey.labs.subscaleview.g.a(g1).recycle();
                                com.davemorrissey.labs.subscaleview.g.a(g1, null);
                            }
                        }
                    } else
                    if (com.davemorrissey.labs.subscaleview.g.f(g1) == y)
                    {
                        com.davemorrissey.labs.subscaleview.g.a(g1, true);
                    }
                }
            }
        }
    }

    private float g(float f1)
    {
        if (O == null)
        {
            return (0.0F / 0.0F);
        } else
        {
            return (f1 - O.y) / M;
        }
    }

    private void g(boolean flag)
    {
        boolean flag1 = false;
        if (O == null)
        {
            flag1 = true;
            O = new PointF(0.0F, 0.0F);
        }
        if (aB == null)
        {
            aB = new f(0.0F, new PointF(0.0F, 0.0F), null);
        }
        com.davemorrissey.labs.subscaleview.f.a(aB, M);
        com.davemorrissey.labs.subscaleview.f.b(aB).set(O);
        a(flag, aB);
        M = com.davemorrissey.labs.subscaleview.f.a(aB);
        O.set(com.davemorrissey.labs.subscaleview.f.b(aB));
        if (flag1)
        {
            O.set(a(A() / 2, B() / 2, M));
        }
    }

    static boolean g(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.I;
    }

    private float h(float f1)
    {
        if (O == null)
        {
            return (0.0F / 0.0F);
        } else
        {
            return M * f1 + O.x;
        }
    }

    static boolean h(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.J;
    }

    private float i(float f1)
    {
        if (O == null)
        {
            return (0.0F / 0.0F);
        } else
        {
            return M * f1 + O.y;
        }
    }

    static PointF i(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.ak;
    }

    private float j(float f1)
    {
        f1 = Math.max(D(), f1);
        return Math.min(C, f1);
    }

    static PointF j(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.an;
    }

    static Rect k(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.W;
    }

    static e l(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.au;
    }

    static Object m(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.ah;
    }

    static void n(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        subsamplingscaleimageview.z();
    }

    static a o(SubsamplingScaleImageView subsamplingscaleimageview)
    {
        return subsamplingscaleimageview.ar;
    }

    static String s()
    {
        return q;
    }

    static List t()
    {
        return t;
    }

    private boolean u()
    {
        if (w != null && !x)
        {
            return true;
        }
        if (z != null)
        {
            Iterator iterator = z.entrySet().iterator();
            boolean flag;
            boolean flag1;
label0:
            for (flag = true; iterator.hasNext(); flag = flag1)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                flag1 = flag;
                if (((Integer)((java.util.Map.Entry) (obj)).getKey()).intValue() != y)
                {
                    continue;
                }
                obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                do
                {
                    g g1;
                    do
                    {
                        flag1 = flag;
                        if (!((Iterator) (obj)).hasNext())
                        {
                            continue label0;
                        }
                        g1 = (g)((Iterator) (obj)).next();
                    } while (!g.c(g1) && com.davemorrissey.labs.subscaleview.g.a(g1) != null);
                    flag = false;
                } while (true);
            }

            return flag;
        } else
        {
            return false;
        }
    }

    private boolean v()
    {
        boolean flag;
        if (getWidth() > 0 && getHeight() > 0 && T > 0 && U > 0 && (w != null || u()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!as && flag)
        {
            y();
            as = true;
            h();
    /* block-local class not found */
    class e {}

            if (au != null)
            {
                au.a();
            }
        }
        return flag;
    }

    private boolean w()
    {
        boolean flag = u();
        if (!at && flag)
        {
            y();
            at = true;
            j();
            if (au != null)
            {
                au.b();
            }
        }
        return flag;
    }

    private void x()
    {
        if (ay == null)
        {
            ay = new Paint();
            ay.setAntiAlias(true);
            ay.setFilterBitmap(true);
            ay.setDither(true);
        }
        if (az == null && A)
        {
            az = new Paint();
            az.setTextSize(18F);
            az.setColor(-65281);
            az.setStyle(android.graphics.Paint.Style.STROKE);
        }
    }

    private void y()
    {
        if (getWidth() == 0 || getHeight() == 0 || T <= 0 || U <= 0)
        {
            return;
        }
        if (R != null && Q != null)
        {
            M = Q.floatValue();
            if (O == null)
            {
                O = new PointF();
            }
            O.x = (float)(getWidth() / 2) - M * R.x;
            O.y = (float)(getHeight() / 2) - M * R.y;
            R = null;
            Q = null;
            g(true);
            f(true);
        }
        g(false);
    }

    private void z()
    {
        this;
        JVM INSTR monitorenter ;
        v();
        w();
        if (u() && w != null)
        {
            w.recycle();
            w = null;
            x = false;
        }
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final PointF a(float f1, float f2)
    {
        return a(f1, f2, new PointF());
    }

    public final PointF a(float f1, float f2, PointF pointf)
    {
        if (O == null)
        {
            return null;
        } else
        {
            pointf.set(f(f1), g(f2));
            return pointf;
        }
    }

    public final PointF a(PointF pointf)
    {
        return a(pointf.x, pointf.y, new PointF());
    }

    public final PointF a(PointF pointf, PointF pointf1)
    {
        return a(pointf.x, pointf.y, pointf1);
    }

    public void a()
    {
        e(true);
        ay = null;
        az = null;
        aA = null;
    }

    public final void a(float f1)
    {
        C = f1;
    }

    public final void a(float f1, PointF pointf)
    {
        ar = null;
        Q = Float.valueOf(f1);
        R = pointf;
        S = pointf;
        invalidate();
    }

    public final void a(int i1)
    {
        if (!r.contains(Integer.valueOf(i1)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid orientation: ").append(i1).toString());
        } else
        {
            B = i1;
            e(false);
            invalidate();
            requestLayout();
            return;
        }
    }

    public void a(e e1)
    {
        au = e1;
    }

    public final void a(b b1)
    {
        if (b1 == null)
        {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        } else
        {
            aj = b1;
            return;
        }
    }

    public final void a(c c1)
    {
        a(c1, ((c) (null)), ((ImageViewState) (null)));
    }

    public final void a(c c1, ImageViewState imageviewstate)
    {
        a(c1, ((c) (null)), imageviewstate);
    }

    public final void a(c c1, c c2)
    {
        a(c1, c2, ((ImageViewState) (null)));
    }

    public final void a(c c1, c c2, ImageViewState imageviewstate)
    {
        if (c1 == null)
        {
            throw new NullPointerException("imageSource must not be null");
        }
        e(true);
        if (imageviewstate != null)
        {
            a(imageviewstate);
        }
    /* block-local class not found */
    class c {}

        if (c2 != null)
        {
            if (c1.d() != null)
            {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            }
            if (c1.g() <= 0 || c1.h() <= 0)
            {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            }
            T = c1.g();
            U = c1.h();
            aa = c2.i();
            if (c2.d() != null)
            {
                a(c2.d());
            } else
            {
                Uri uri = c2.c();
                imageviewstate = uri;
                if (uri == null)
                {
                    imageviewstate = uri;
                    if (c2.e() != null)
                    {
                        imageviewstate = Uri.parse((new StringBuilder()).append("android.resource://").append(getContext().getPackageName()).append("/").append(c2.e()).toString());
                    }
                }
                (new c(getContext(), ai, imageviewstate, true)).execute(new Void[0]);
            }
        }
        if (c1.d() != null && c1.i() != null)
        {
            a(Bitmap.createBitmap(c1.d(), c1.i().left, c1.i().top, c1.i().width(), c1.i().height()), 0);
            return;
        }
        if (c1.d() != null)
        {
            a(c1.d(), 0);
            return;
        }
        W = c1.i();
        imageviewstate = c1.c();
        c2 = imageviewstate;
        if (imageviewstate == null)
        {
            c2 = imageviewstate;
            if (c1.e() != null)
            {
                c2 = Uri.parse((new StringBuilder()).append("android.resource://").append(getContext().getPackageName()).append("/").append(c1.e()).toString());
            }
        }
        if (c1.f() || W != null)
        {
    /* block-local class not found */
    class i {}

            (new i(getContext(), aj, c2)).execute(new Void[0]);
            return;
        } else
        {
            (new c(getContext(), ai, c2, false)).execute(new Void[0]);
            return;
        }
    }

    public final void a(Class class1)
    {
        if (class1 == null)
        {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        } else
        {
            aj = new a(class1);
            return;
        }
    }

    public final void a(boolean flag)
    {
        I = flag;
    }

    public float b()
    {
        return C;
    }

    public final PointF b(float f1, float f2)
    {
        return b(f1, f2, new PointF());
    }

    public final PointF b(float f1, float f2, PointF pointf)
    {
        if (O == null)
        {
            return null;
        } else
        {
            pointf.set(h(f1), i(f2));
            return pointf;
        }
    }

    public final PointF b(PointF pointf)
    {
        return b(pointf.x, pointf.y, new PointF());
    }

    public final PointF b(PointF pointf, PointF pointf1)
    {
        return b(pointf.x, pointf.y, pointf1);
    }

    public b b(float f1, PointF pointf)
    {
        if (!g())
        {
            return null;
        } else
        {
            return new b(f1, pointf, null);
        }
    }

    public final void b(float f1)
    {
        D = f1;
    }

    public final void b(int i1)
    {
        if (!u.contains(Integer.valueOf(i1)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid pan limit: ").append(i1).toString());
        }
        F = i1;
        if (g())
        {
            g(true);
            invalidate();
        }
    }

    public final void b(b b1)
    {
        if (b1 == null)
        {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        } else
        {
            ai = b1;
            return;
        }
    }

    public final void b(Class class1)
    {
        if (class1 == null)
        {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        } else
        {
            ai = new a(class1);
            return;
        }
    }

    public final void b(boolean flag)
    {
        J = flag;
    }

    public final float c()
    {
        return D();
    }

    public b c(PointF pointf)
    {
        if (!g())
        {
            return null;
        } else
        {
            return new b(pointf, null);
        }
    }

    public final void c(float f1)
    {
        K = f1;
    }

    public final void c(int i1)
    {
        if (!v.contains(Integer.valueOf(i1)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid scale type: ").append(i1).toString());
        }
        G = i1;
        if (g())
        {
            g(true);
            invalidate();
        }
    }

    public final void c(boolean flag)
    {
        H = flag;
        if (!flag && O != null)
        {
            O.x = (float)(getWidth() / 2) - M * (float)(A() / 2);
            O.y = (float)(getHeight() / 2) - M * (float)(B() / 2);
            if (g())
            {
                f(true);
                invalidate();
            }
        }
    }

    public final PointF d()
    {
        int i1 = getWidth() / 2;
        int j1 = getHeight() / 2;
        return a(i1, j1);
    }

    public b d(float f1)
    {
        if (!g())
        {
            return null;
        } else
        {
            return new b(f1, null);
        }
    }

    public final void d(int i1)
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        float f1 = displaymetrics.xdpi;
        a((displaymetrics.ydpi + f1) / 2.0F / (float)i1);
    }

    public final void d(boolean flag)
    {
        A = flag;
    }

    public final float e()
    {
        return M;
    }

    public final void e(int i1)
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        float f1 = displaymetrics.xdpi;
        b((displaymetrics.ydpi + f1) / 2.0F / (float)i1);
    }

    public final void f()
    {
        ar = null;
        Q = Float.valueOf(j(0.0F));
        if (g())
        {
            R = new PointF(A() / 2, B() / 2);
        } else
        {
            R = new PointF(0.0F, 0.0F);
        }
        invalidate();
    }

    public void f(int i1)
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        float f1 = displaymetrics.xdpi;
        E = (int)Math.min((displaymetrics.ydpi + f1) / 2.0F, i1);
        if (g())
        {
            e(false);
            invalidate();
        }
    }

    public final void g(int i1)
    {
        if (Color.alpha(i1) == 0)
        {
            aA = null;
        } else
        {
            aA = new Paint();
            aA.setStyle(android.graphics.Paint.Style.FILL);
            aA.setColor(i1);
        }
        invalidate();
    }

    public final boolean g()
    {
        return as;
    }

    protected void h()
    {
    }

    public final void h(int i1)
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        float f1 = displaymetrics.xdpi;
        c((displaymetrics.ydpi + f1) / 2.0F / (float)i1);
    }

    public final void i(int i1)
    {
        if (!s.contains(Integer.valueOf(i1)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid zoom style: ").append(i1).toString());
        } else
        {
            L = i1;
            return;
        }
    }

    public final boolean i()
    {
        return at;
    }

    protected void j()
    {
    }

    public final int k()
    {
        return T;
    }

    public final int l()
    {
        return U;
    }

    public final int m()
    {
        return B;
    }

    public final int n()
    {
        return C();
    }

    public final ImageViewState o()
    {
        if (O != null && T > 0 && U > 0)
        {
            return new ImageViewState(e(), d(), m());
        } else
        {
            return null;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        x();
        if (T != 0 && U != 0 && getWidth() != 0 && getHeight() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (z == null && ag != null)
        {
            a(a(canvas));
        }
        if (!v()) goto _L1; else goto _L3
_L3:
    /* block-local class not found */
    class a {}

        y();
        boolean flag;
        int i1;
        if (ar != null)
        {
            long l1 = System.currentTimeMillis() - com.davemorrissey.labs.subscaleview.a.b(ar);
            float f1;
            float f3;
            Object obj;
            Object obj1;
            g g1;
            boolean flag2;
            boolean flag3;
            if (l1 > a.c(ar))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            l1 = Math.min(l1, a.c(ar));
            M = a(com.davemorrissey.labs.subscaleview.a.d(ar), l1, com.davemorrissey.labs.subscaleview.a.e(ar), com.davemorrissey.labs.subscaleview.a.f(ar) - com.davemorrissey.labs.subscaleview.a.e(ar), a.c(ar));
            f1 = a(com.davemorrissey.labs.subscaleview.a.d(ar), l1, a.g(ar).x, a.h(ar).x - a.g(ar).x, a.c(ar));
            f3 = a(com.davemorrissey.labs.subscaleview.a.d(ar), l1, a.g(ar).y, a.h(ar).y - a.g(ar).y, a.c(ar));
            obj = O;
            obj.x = ((PointF) (obj)).x - (h(a.i(ar).x) - f1);
            obj = O;
            obj.y = ((PointF) (obj)).y - (i(a.i(ar).y) - f3);
            if (flag2 || com.davemorrissey.labs.subscaleview.a.e(ar) == com.davemorrissey.labs.subscaleview.a.f(ar))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            g(flag3);
            f(flag2);
            if (flag2)
            {
                ar = null;
            }
            invalidate();
        }
        if (z == null || !u())
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = Math.min(y, e(M));
        obj = z.entrySet().iterator();
        boolean flag1;
label0:
        for (flag = false; ((Iterator) (obj)).hasNext(); flag = flag1)
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            flag1 = flag;
            if (((Integer)((java.util.Map.Entry) (obj1)).getKey()).intValue() != i1)
            {
                continue;
            }
            obj1 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
            do
            {
                do
                {
                    flag1 = flag;
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        continue label0;
                    }
                    g1 = (g)((Iterator) (obj1)).next();
                } while (!com.davemorrissey.labs.subscaleview.g.b(g1) || !g.c(g1) && com.davemorrissey.labs.subscaleview.g.a(g1) != null);
                flag = true;
            } while (true);
        }

        Iterator iterator = z.entrySet().iterator();
        do
        {
            Object obj2;
            do
            {
                if (!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj2 = (java.util.Map.Entry)iterator.next();
            } while (((Integer)((java.util.Map.Entry) (obj2)).getKey()).intValue() != i1 && !flag);
            obj2 = ((List)((java.util.Map.Entry) (obj2)).getValue()).iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                g g2 = (g)((Iterator) (obj2)).next();
                b(com.davemorrissey.labs.subscaleview.g.d(g2), com.davemorrissey.labs.subscaleview.g.e(g2));
                if (!g.c(g2) && com.davemorrissey.labs.subscaleview.g.a(g2) != null)
                {
                    if (aA != null)
                    {
                        canvas.drawRect(com.davemorrissey.labs.subscaleview.g.e(g2), aA);
                    }
                    if (aC == null)
                    {
                        aC = new Matrix();
                    }
                    aC.reset();
                    a(aE, 0.0F, 0.0F, com.davemorrissey.labs.subscaleview.g.a(g2).getWidth(), 0.0F, com.davemorrissey.labs.subscaleview.g.a(g2).getWidth(), com.davemorrissey.labs.subscaleview.g.a(g2).getHeight(), 0.0F, com.davemorrissey.labs.subscaleview.g.a(g2).getHeight());
                    if (C() == 0)
                    {
                        a(aF, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).top, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).top, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).bottom, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).bottom);
                    } else
                    if (C() == 90)
                    {
                        a(aF, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).top, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).bottom, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).bottom, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).top);
                    } else
                    if (C() == 180)
                    {
                        a(aF, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).bottom, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).bottom, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).top, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).top);
                    } else
                    if (C() == 270)
                    {
                        a(aF, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).bottom, com.davemorrissey.labs.subscaleview.g.e(g2).left, com.davemorrissey.labs.subscaleview.g.e(g2).top, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).top, com.davemorrissey.labs.subscaleview.g.e(g2).right, com.davemorrissey.labs.subscaleview.g.e(g2).bottom);
                    }
                    aC.setPolyToPoly(aE, 0, aF, 0, 4);
                    canvas.drawBitmap(com.davemorrissey.labs.subscaleview.g.a(g2), aC, ay);
                    if (A)
                    {
                        canvas.drawRect(com.davemorrissey.labs.subscaleview.g.e(g2), az);
                    }
                } else
                if (g.c(g2) && A)
                {
                    canvas.drawText("LOADING", com.davemorrissey.labs.subscaleview.g.e(g2).left + 5, com.davemorrissey.labs.subscaleview.g.e(g2).top + 35, az);
                }
                if (com.davemorrissey.labs.subscaleview.g.b(g2) && A)
                {
                    canvas.drawText((new StringBuilder()).append("ISS ").append(com.davemorrissey.labs.subscaleview.g.f(g2)).append(" RECT ").append(com.davemorrissey.labs.subscaleview.g.d(g2).top).append(",").append(com.davemorrissey.labs.subscaleview.g.d(g2).left).append(",").append(com.davemorrissey.labs.subscaleview.g.d(g2).bottom).append(",").append(com.davemorrissey.labs.subscaleview.g.d(g2).right).toString(), com.davemorrissey.labs.subscaleview.g.e(g2).left + 5, com.davemorrissey.labs.subscaleview.g.e(g2).top + 15, az);
                }
            }
        } while (true);
        if (!A) goto _L1; else goto _L4
_L4:
        canvas.drawText((new StringBuilder()).append("Scale: ").append(String.format("%.2f", new Object[] {
            Float.valueOf(M)
        })).toString(), 5F, 15F, az);
        canvas.drawText((new StringBuilder()).append("Translate: ").append(String.format("%.2f", new Object[] {
            Float.valueOf(O.x)
        })).append(":").append(String.format("%.2f", new Object[] {
            Float.valueOf(O.y)
        })).toString(), 5F, 35F, az);
        PointF pointf = d();
        canvas.drawText((new StringBuilder()).append("Source center: ").append(String.format("%.2f", new Object[] {
            Float.valueOf(pointf.x)
        })).append(":").append(String.format("%.2f", new Object[] {
            Float.valueOf(pointf.y)
        })).toString(), 5F, 55F, az);
        if (ar == null) goto _L1; else goto _L5
_L5:
        PointF pointf1 = b(a.j(ar));
        PointF pointf2 = b(a.k(ar));
        PointF pointf3 = b(a.i(ar));
        canvas.drawCircle(pointf1.x, pointf1.y, 10F, az);
        canvas.drawCircle(pointf2.x, pointf2.y, 20F, az);
        canvas.drawCircle(pointf3.x, pointf3.y, 25F, az);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 30F, az);
        return;
        if (w == null) goto _L1; else goto _L6
_L6:
        float f4 = M;
        float f2 = M;
        if (x)
        {
            f2 = M;
            f4 = ((float)T / (float)w.getWidth()) * f2;
            f2 = M * ((float)U / (float)w.getHeight());
        }
        if (aC == null)
        {
            aC = new Matrix();
        }
        aC.reset();
        aC.postScale(f4, f2);
        aC.postRotate(m());
        aC.postTranslate(O.x, O.y);
        if (m() != 180) goto _L8; else goto _L7
_L7:
        aC.postTranslate(M * (float)T, M * (float)U);
_L10:
        if (aA != null)
        {
            if (aD == null)
            {
                aD = new RectF();
            }
            aD.set(0.0F, 0.0F, T, U);
            aC.mapRect(aD);
            canvas.drawRect(aD, aA);
        }
        canvas.drawBitmap(w, aC, ay);
        return;
_L8:
        if (m() == 90)
        {
            aC.postTranslate(M * (float)U, 0.0F);
        } else
        if (m() == 270)
        {
            aC.postTranslate(0.0F, M * (float)T);
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        boolean flag;
        flag = true;
        k1 = android.view.View.MeasureSpec.getMode(i1);
        int j2 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (k1 != 0x40000000)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (j2 == 0x40000000)
        {
            flag = false;
        }
        if (T <= 0 || U <= 0) goto _L2; else goto _L1
_L1:
        if (k1 == 0 || !flag) goto _L4; else goto _L3
_L3:
        j1 = A();
        i1 = B();
_L6:
        setMeasuredDimension(Math.max(j1, getSuggestedMinimumWidth()), Math.max(i1, getSuggestedMinimumHeight()));
        return;
_L4:
        if (flag)
        {
            k1 = (int)(((double)B() / (double)A()) * (double)i1);
            j1 = i1;
            i1 = k1;
            continue; /* Loop/switch isn't completed */
        }
        if (k1 != 0)
        {
            int l1 = (int)(((double)A() / (double)B()) * (double)j1);
            i1 = j1;
            j1 = l1;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        int i2 = i1;
        i1 = j1;
        j1 = i2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        PointF pointf = d();
        if (as && pointf != null)
        {
            ar = null;
            Q = Float.valueOf(M);
            R = pointf;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        if (ar == null || com.davemorrissey.labs.subscaleview.a.a(ar)) goto _L2; else goto _L1
_L1:
        getParent().requestDisallowInterceptTouchEvent(true);
_L20:
        return true;
_L2:
        int i1;
        ar = null;
        if (O == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!ad && (af == null || af.onTouchEvent(motionevent)))
        {
            ab = false;
            ac = false;
            ae = 0;
            return true;
        }
        if (P == null)
        {
            P = new PointF(0.0F, 0.0F);
        }
        if (ak == null)
        {
            ak = new PointF(0.0F, 0.0F);
        }
        i1 = motionevent.getPointerCount();
        motionevent.getAction();
        JVM INSTR lookupswitch 7: default 204
    //                   0: 210
    //                   1: 1647
    //                   2: 418
    //                   5: 210
    //                   6: 1647
    //                   261: 210
    //                   262: 1647;
           goto _L3 _L4 _L5 _L6 _L4 _L5 _L4 _L5
_L3:
        return super.onTouchEvent(motionevent);
_L4:
        ar = null;
        getParent().requestDisallowInterceptTouchEvent(true);
        ae = Math.max(ae, i1);
        if (i1 >= 2)
        {
            if (I)
            {
                float f1 = a(motionevent.getX(0), motionevent.getX(1), motionevent.getY(0), motionevent.getY(1));
                N = M;
                al = f1;
                P.set(O.x, O.y);
                ak.set((motionevent.getX(0) + motionevent.getX(1)) / 2.0F, (motionevent.getY(0) + motionevent.getY(1)) / 2.0F);
            } else
            {
                ae = 0;
            }
            aw.removeMessages(1);
            return true;
        }
        if (!ad)
        {
            P.set(O.x, O.y);
            ak.set(motionevent.getX(), motionevent.getY());
            aw.sendEmptyMessageDelayed(1, 600L);
            return true;
        }
        break; /* Loop/switch isn't completed */
_L6:
        boolean flag = flag1;
        if (ae <= 0) goto _L8; else goto _L7
_L7:
        if (i1 < 2) goto _L10; else goto _L9
_L9:
        float f2;
        float f4;
        float f6;
        f6 = a(motionevent.getX(0), motionevent.getX(1), motionevent.getY(0), motionevent.getY(1));
        f2 = (motionevent.getX(0) + motionevent.getX(1)) / 2.0F;
        f4 = (motionevent.getY(0) + motionevent.getY(1)) / 2.0F;
        flag = flag1;
        if (!I) goto _L8; else goto _L11
_L11:
        if (a(ak.x, f2, ak.y, f4) > 5F || Math.abs(f6 - al) > 5F) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (!ac) goto _L8; else goto _L13
_L13:
        ab = true;
        ac = true;
        M = Math.min(C, (f6 / al) * N);
        if (M <= D())
        {
            al = f6;
            N = D();
            ak.set(f2, f4);
            P.set(O);
        } else
        if (H)
        {
            float f7 = ak.x;
            float f10 = P.x;
            float f13 = ak.y;
            float f15 = P.y;
            float f17 = M / N;
            float f19 = M / N;
            O.x = f2 - (f7 - f10) * f17;
            O.y = f4 - (f13 - f15) * f19;
        } else
        if (S != null)
        {
            O.x = (float)(getWidth() / 2) - M * S.x;
            O.y = (float)(getHeight() / 2) - M * S.y;
        } else
        {
            O.x = (float)(getWidth() / 2) - M * (float)(A() / 2);
            O.y = (float)(getHeight() / 2) - M * (float)(B() / 2);
        }
        g(true);
        f(false);
_L18:
        flag = true;
_L8:
        if (flag)
        {
            aw.removeMessages(1);
            invalidate();
            return true;
        }
          goto _L3
_L10:
        if (!ad) goto _L15; else goto _L14
_L14:
        float f5 = Math.abs(ak.y - motionevent.getY()) * 2.0F + am;
        if (ao == -1F)
        {
            ao = f5;
        }
        float f3;
        if (motionevent.getY() > ap.y)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.set(0.0F, motionevent.getY());
        f3 = 0.5F * Math.abs(1.0F - f5 / ao);
        if (f3 > 0.03F || aq)
        {
            aq = true;
            float f9;
            float f12;
            if (ao > 0.0F)
            {
                if (flag)
                {
                    f3 = 1.0F + f3;
                } else
                {
                    f3 = 1.0F - f3;
                }
            } else
            {
                f3 = 1.0F;
            }
            M = Math.max(D(), Math.min(C, f3 * M));
            if (H)
            {
                f3 = ak.x;
                float f8 = P.x;
                float f11 = ak.y;
                float f14 = P.y;
                float f16 = M / N;
                float f18 = M / N;
                O.x = ak.x - (f3 - f8) * f16;
                O.y = ak.y - (f11 - f14) * f18;
            } else
            if (S != null)
            {
                O.x = (float)(getWidth() / 2) - M * S.x;
                O.y = (float)(getHeight() / 2) - M * S.y;
            } else
            {
                O.x = (float)(getWidth() / 2) - M * (float)(A() / 2);
                O.y = (float)(getHeight() / 2) - M * (float)(B() / 2);
            }
        }
        ao = f5;
        g(true);
        f(false);
        flag = true;
          goto _L8
_L15:
        flag = flag1;
        if (ab) goto _L8; else goto _L16
_L16:
        f3 = Math.abs(motionevent.getX() - ak.x);
        f5 = Math.abs(motionevent.getY() - ak.y);
        if (f3 > 5F || f5 > 5F)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!ac) goto _L8; else goto _L17
_L17:
        O.x = P.x + (motionevent.getX() - ak.x);
        O.y = P.y + (motionevent.getY() - ak.y);
        f9 = O.x;
        f12 = O.y;
        g(true);
        if (f9 != O.x)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && f3 > f5 && !ac)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (f12 == O.y && f5 > 15F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!flag1 && (!flag || i1 != 0 || ac))
        {
            ac = true;
        } else
        if (f3 > 5F)
        {
            ae = 0;
            aw.removeMessages(1);
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        if (!H)
        {
            O.x = P.x;
            O.y = P.y;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        f(false);
          goto _L18
_L5:
        aw.removeMessages(1);
        if (ad)
        {
            ad = false;
            if (!aq)
            {
                c(an, ak);
            }
        }
        if (ae > 0 && (ab || ac))
        {
            if (ab && i1 == 2)
            {
                ac = true;
                P.set(O.x, O.y);
                if (motionevent.getActionIndex() == 1)
                {
                    ak.set(motionevent.getX(0), motionevent.getY(0));
                } else
                {
                    ak.set(motionevent.getX(1), motionevent.getY(1));
                }
            }
            if (i1 < 3)
            {
                ab = false;
            }
            if (i1 < 2)
            {
                ac = false;
                ae = 0;
            }
            f(true);
            return true;
        }
        if (i1 == 1)
        {
            ab = false;
            ac = false;
            ae = 0;
            return true;
        }
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final boolean p()
    {
        return I;
    }

    public final boolean q()
    {
        return J;
    }

    public final boolean r()
    {
        return H;
    }

    public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
    {
        av = onlongclicklistener;
    }


    // Unreferenced inner class com/davemorrissey/labs/subscaleview/SubsamplingScaleImageView$d
    /* block-local class not found */
    class d {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
