// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.k;
import com.aviary.android.feather.headless.moa.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.aviary.android.feather.headless.filters:
//            NativeFilter, MoaJavaToolStrokeResult

public final class NativeToolFilter extends NativeFilter
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/headless/filters/NativeToolFilter$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("None", 0);
            b = new a("Free", 1);
            c = new a("Erase", 2);
            d = new a("Smart", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        private static final b h[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/aviary/android/feather/headless/filters/NativeToolFilter$b, s);
        }

        public static b[] values()
        {
            return (b[])h.clone();
        }

        static 
        {
            a = new b("ColorSplash", 0);
            b = new b("TiltShift", 1);
            c = new b("Blemish", 2);
            d = new b("RedEye", 3);
            e = new b("Whiten", 4);
            f = new b("Blur", 5);
            g = new b("None", 6);
            h = (new b[] {
                a, b, c, d, e, f, g
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/aviary/android/feather/headless/filters/NativeToolFilter$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("Radial", 0);
            b = new c("Linear", 1);
            c = new c("None", 2);
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int i)
        {
            super(s, i);
        }
    }


    protected List d;
    private long e;
    private Rect f;
    private final b g;
    private final com.aviary.android.feather.headless.moa.b h;

    public NativeToolFilter(String s, b b1)
    {
        super("tools");
        e = 0L;
        d = Collections.synchronizedList(new ArrayList());
        g = b1;
        e = nativeCtor(g.name().toLowerCase(Locale.US));
        f = new Rect();
        h = b.a(0);
        h.a("toolname", s);
        if (b1 == com.aviary.android.feather.headless.filters.b.b)
        {
            a(c.c);
            return;
        } else
        {
            a(a.a);
            b.a(0).a("strokes", d);
            return;
        }
    }

    public int a(Bitmap bitmap, Bitmap bitmap1)
    {
        int i;
        byte byte0;
        byte0 = -1;
        i = byte0;
        if (!b()) goto _L2; else goto _L1
_L1:
        if (bitmap != null) goto _L4; else goto _L3
_L3:
        i = byte0;
_L2:
        return i;
_L4:
        if (bitmap1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = byte0;
        if (bitmap.getWidth() != bitmap1.getWidth())
        {
            continue; /* Loop/switch isn't completed */
        }
        i = byte0;
        if (bitmap.getHeight() != bitmap1.getHeight()) goto _L2; else goto _L5
_L5:
        int j = nativeInit(e, bitmap, bitmap1);
        i = j;
        if (j == 0)
        {
            h.a("previewsize", new k(bitmap.getWidth(), bitmap.getHeight()));
            f.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            return j;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void a(l l)
    {
        d.add(l);
    }

    public boolean a(double d1, double d2, double d3, double d4, MoaJavaToolStrokeResult moajavatoolstrokeresult)
    {
        if (b())
        {
            long l1 = e;
            long l;
            if (moajavatoolstrokeresult != null)
            {
                l = moajavatoolstrokeresult.a();
            } else
            {
                l = 0L;
            }
            return nativeDrawStart(l1, d1, d2, d3, d4, l) == 0;
        } else
        {
            return false;
        }
    }

    public boolean a(int i, int j, int l, int i1)
    {
        return b() && nativeRenderPreview(e, i, j, l, i1) == 0;
    }

    public boolean a(Rect rect)
    {
        return a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean a(RectF rectf)
    {
        return a((int)rectf.left, (int)rectf.top, (int)rectf.right, (int)rectf.bottom);
    }

    public boolean a(a a1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b())
        {
            flag = flag1;
            if (nativeSetBrushMode(e, a1.name().toLowerCase(Locale.US)) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean a(c c1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b())
        {
            h.a("tiltshiftmode", c1.name().toLowerCase(Locale.US));
            flag = flag1;
            if (nativeSetTiltShiftMode(e, c1.name().toLowerCase(Locale.US)) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public transient float[] a(double d1, double d2, int i, boolean flag, MoaJavaToolStrokeResult moajavatoolstrokeresult, 
            float af[])
    {
        if (b())
        {
            if (g == com.aviary.android.feather.headless.filters.b.b)
            {
                h.a("x", af[0]);
                h.a("y", af[1]);
                h.a("radius", d1);
                h.a("angle", d2);
            }
            long l1 = e;
            long l;
            if (moajavatoolstrokeresult != null)
            {
                l = moajavatoolstrokeresult.a();
            } else
            {
                l = 0L;
            }
            return nativeDraw(l1, d1, d2, i, flag, af, l);
        } else
        {
            return null;
        }
    }

    public transient float[] a(double d1, double d2, int i, boolean flag, float af[])
    {
        return a(d1, d2, i, flag, null, af);
    }

    public boolean b()
    {
        return e != 0L;
    }

    public boolean d()
    {
        return a(0, 0, f.right, f.bottom);
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (b())
        {
            nativeDispose(e);
            e = 0L;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void finalize()
        throws Throwable
    {
        e();
        super.finalize();
    }

    native long nativeCtor(String s);

    native void nativeDispose(long l);

    native float[] nativeDraw(long l, double d1, double d2, int i, 
            boolean flag, float af[], long l1);

    native int nativeDrawStart(long l, double d1, double d2, double d3, double d4, long l1);

    native int nativeInit(long l, Bitmap bitmap, Bitmap bitmap1);

    native int nativeRenderPreview(long l, int i, int j, int i1, int j1);

    native int nativeSetBrushMode(long l, String s);

    native int nativeSetTiltShiftMode(long l, String s);
}
