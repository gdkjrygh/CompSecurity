// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.nineoldandroids.a.b;
import com.nineoldandroids.a.k;
import com.nineoldandroids.util.c;

public class MaterialMenuDrawable extends Drawable
    implements Animatable
{
    public static final class AnimationState extends Enum
    {

        public static final AnimationState ARROW_CHECK;
        public static final AnimationState ARROW_X;
        public static final AnimationState BURGER_ARROW;
        public static final AnimationState BURGER_CHECK;
        public static final AnimationState BURGER_X;
        public static final AnimationState X_CHECK;
        private static final AnimationState a[];

        public static AnimationState valueOf(String s1)
        {
            return (AnimationState)Enum.valueOf(com/qihoo/security/v7/MaterialMenuDrawable$AnimationState, s1);
        }

        public static AnimationState[] values()
        {
            return (AnimationState[])a.clone();
        }

        public IconState getFirstState()
        {
            static class _cls5
            {

                static final int a[];
                static final int b[];
                static final int c[];

                static 
                {
                    c = new int[IconState.values().length];
                    try
                    {
                        c[IconState.BURGER.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    try
                    {
                        c[IconState.ARROW.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        c[IconState.X.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        c[IconState.CHECK.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    b = new int[Stroke.values().length];
                    try
                    {
                        b[Stroke.REGULAR.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        b[Stroke.THIN.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        b[Stroke.EXTRA_THIN.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    a = new int[AnimationState.values().length];
                    try
                    {
                        a[AnimationState.BURGER_ARROW.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[AnimationState.BURGER_X.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[AnimationState.ARROW_X.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[AnimationState.ARROW_CHECK.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[AnimationState.BURGER_CHECK.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[AnimationState.X_CHECK.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls5.a[ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return IconState.BURGER;

            case 2: // '\002'
                return IconState.BURGER;

            case 3: // '\003'
                return IconState.ARROW;

            case 4: // '\004'
                return IconState.ARROW;

            case 5: // '\005'
                return IconState.BURGER;

            case 6: // '\006'
                return IconState.X;
            }
        }

        public IconState getSecondState()
        {
            switch (_cls5.a[ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return IconState.ARROW;

            case 2: // '\002'
                return IconState.X;

            case 3: // '\003'
                return IconState.X;

            case 4: // '\004'
                return IconState.CHECK;

            case 5: // '\005'
                return IconState.CHECK;

            case 6: // '\006'
                return IconState.CHECK;
            }
        }

        static 
        {
            BURGER_ARROW = new AnimationState("BURGER_ARROW", 0);
            BURGER_X = new AnimationState("BURGER_X", 1);
            ARROW_X = new AnimationState("ARROW_X", 2);
            ARROW_CHECK = new AnimationState("ARROW_CHECK", 3);
            BURGER_CHECK = new AnimationState("BURGER_CHECK", 4);
            X_CHECK = new AnimationState("X_CHECK", 5);
            a = (new AnimationState[] {
                BURGER_ARROW, BURGER_X, ARROW_X, ARROW_CHECK, BURGER_CHECK, X_CHECK
            });
        }

        private AnimationState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class IconState extends Enum
    {

        public static final IconState ARROW;
        public static final IconState BURGER;
        public static final IconState CHECK;
        public static final IconState X;
        private static final IconState a[];

        public static IconState valueOf(String s1)
        {
            return (IconState)Enum.valueOf(com/qihoo/security/v7/MaterialMenuDrawable$IconState, s1);
        }

        public static IconState[] values()
        {
            return (IconState[])a.clone();
        }

        static 
        {
            BURGER = new IconState("BURGER", 0);
            ARROW = new IconState("ARROW", 1);
            X = new IconState("X", 2);
            CHECK = new IconState("CHECK", 3);
            a = (new IconState[] {
                BURGER, ARROW, X, CHECK
            });
        }

        private IconState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class Stroke extends Enum
    {

        public static final Stroke EXTRA_THIN;
        public static final Stroke REGULAR;
        public static final Stroke THIN;
        private static final Stroke b[];
        private final int a;

        static int a(Stroke stroke)
        {
            return stroke.a;
        }

        protected static Stroke a(int i1)
        {
            switch (i1)
            {
            default:
                return THIN;

            case 3: // '\003'
                return REGULAR;

            case 2: // '\002'
                return THIN;

            case 1: // '\001'
                return EXTRA_THIN;
            }
        }

        public static Stroke valueOf(String s1)
        {
            return (Stroke)Enum.valueOf(com/qihoo/security/v7/MaterialMenuDrawable$Stroke, s1);
        }

        public static Stroke[] values()
        {
            return (Stroke[])b.clone();
        }

        static 
        {
            REGULAR = new Stroke("REGULAR", 0, 3);
            THIN = new Stroke("THIN", 1, 2);
            EXTRA_THIN = new Stroke("EXTRA_THIN", 2, 1);
            b = (new Stroke[] {
                REGULAR, THIN, EXTRA_THIN
            });
        }

        private Stroke(String s1, int i1, int j1)
        {
            super(s1, i1);
            a = j1;
        }
    }

    private final class a extends android.graphics.drawable.Drawable.ConstantState
    {

        final MaterialMenuDrawable a;
        private int b;

        static int a(a a1, int i1)
        {
            a1.b = i1;
            return i1;
        }

        public int getChangingConfigurations()
        {
            return b;
        }

        public Drawable newDrawable()
        {
            MaterialMenuDrawable materialmenudrawable = new MaterialMenuDrawable(com.qihoo.security.v7.MaterialMenuDrawable.b(a).getColor(), com.qihoo.security.v7.MaterialMenuDrawable.c(a), MaterialMenuDrawable.d(a).m(), MaterialMenuDrawable.e(a).m(), MaterialMenuDrawable.f(a), MaterialMenuDrawable.g(a), MaterialMenuDrawable.h(a), MaterialMenuDrawable.i(a), MaterialMenuDrawable.j(a), com.qihoo.security.v7.MaterialMenuDrawable.k(a));
            IconState iconstate;
            if (MaterialMenuDrawable.a(a) != null)
            {
                iconstate = MaterialMenuDrawable.a(a);
            } else
            {
                iconstate = MaterialMenuDrawable.l(a);
            }
            materialmenudrawable.a(iconstate);
            materialmenudrawable.a(MaterialMenuDrawable.m(a));
            return materialmenudrawable;
        }

        private a()
        {
            a = MaterialMenuDrawable.this;
            super();
        }

    }


    private boolean A;
    private boolean B;
    private k C;
    private k D;
    private a E;
    private c F = new c(java/lang/Float, "transformation") {

        final MaterialMenuDrawable a;

        public Float a(MaterialMenuDrawable materialmenudrawable)
        {
            return materialmenudrawable.b();
        }

        public volatile Object a(Object obj)
        {
            return a((MaterialMenuDrawable)obj);
        }

        public void a(MaterialMenuDrawable materialmenudrawable, Float float1)
        {
            materialmenudrawable.a(float1);
        }

        public volatile void a(Object obj, Object obj1)
        {
            a((MaterialMenuDrawable)obj, (Float)obj1);
        }

            
            {
                a = MaterialMenuDrawable.this;
                super(class1, s1);
            }
    };
    private c G = new c(java/lang/Float, "pressedProgress") {

        final MaterialMenuDrawable a;

        public Float a(MaterialMenuDrawable materialmenudrawable)
        {
            return materialmenudrawable.c();
        }

        public volatile Object a(Object obj)
        {
            return a((MaterialMenuDrawable)obj);
        }

        public void a(MaterialMenuDrawable materialmenudrawable, Float float1)
        {
            materialmenudrawable.b(float1);
        }

        public volatile void a(Object obj, Object obj1)
        {
            a((MaterialMenuDrawable)obj, (Float)obj1);
        }

            
            {
                a = MaterialMenuDrawable.this;
                super(class1, s1);
            }
    };
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final int h;
    private final int i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private final float n;
    private final Stroke o;
    private final Object p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private float t;
    private float u;
    private boolean v;
    private IconState w;
    private AnimationState x;
    private IconState y;
    private boolean z;

    private MaterialMenuDrawable(int i1, Stroke stroke, long l1, long l2, int j1, 
            int k1, float f1, float f2, float f3, float f4)
    {
        p = new Object();
        q = new Paint();
        r = new Paint();
        s = new Paint();
        t = 0.0F;
        u = 0.0F;
        v = false;
        w = IconState.BURGER;
        x = AnimationState.BURGER_ARROW;
        b = f4;
        c = 2.0F * f4;
        d = 3F * f4;
        e = 4F * f4;
        f = 6F * f4;
        g = 8F * f4;
        a = f4 / 2.0F;
        o = stroke;
        h = j1;
        i = k1;
        k = f1;
        n = f2;
        j = f3;
        m = ((float)j1 - f1) / 2.0F;
        l = ((float)k1 - 5F * d) / 2.0F;
        d(i1);
        a((int)l1, (int)l2);
        E = new a();
    }

    MaterialMenuDrawable(int i1, Stroke stroke, long l1, long l2, int j1, 
            int k1, float f1, float f2, float f3, float f4, _cls1 _pcls1)
    {
        this(i1, stroke, l1, l2, j1, k1, f1, f2, f3, f4);
    }

    public MaterialMenuDrawable(Context context, int i1, Stroke stroke, int j1, int k1, int l1)
    {
        p = new Object();
        q = new Paint();
        r = new Paint();
        s = new Paint();
        t = 0.0F;
        u = 0.0F;
        v = false;
        w = IconState.BURGER;
        x = AnimationState.BURGER_ARROW;
        context = context.getResources();
        b = a(context, 1.0F) * (float)j1;
        c = a(context, 2.0F) * (float)j1;
        d = a(context, 3F) * (float)j1;
        e = a(context, 4F) * (float)j1;
        f = a(context, 6F) * (float)j1;
        g = a(context, 8F) * (float)j1;
        a = b / 2.0F;
        o = stroke;
        h = (int)(a(context, 40F) * (float)j1);
        i = (int)(a(context, 40F) * (float)j1);
        k = a(context, 20F) * (float)j1;
        n = a(context, 18F) * (float)j1;
        j = a(context, Stroke.a(stroke)) * (float)j1;
        m = ((float)h - k) / 2.0F;
        l = ((float)i - 5F * d) / 2.0F;
        d(i1);
        a(k1, l1);
        E = new a();
    }

    private float a(float f1)
    {
        switch (com.qihoo.security.v7._cls5.b[o.ordinal()])
        {
        default:
            return 0.0F;

        case 1: // '\001'
            if (x == AnimationState.ARROW_X || x == AnimationState.X_CHECK)
            {
                return d - f * f1;
            } else
            {
                return d * f1;
            }

        case 2: // '\002'
            if (x == AnimationState.ARROW_X || x == AnimationState.X_CHECK)
            {
                return (d + a) - (f + a) * f1;
            } else
            {
                return (d + a) * f1;
            }

        case 3: // '\003'
            break;
        }
        if (x == AnimationState.ARROW_X || x == AnimationState.X_CHECK)
        {
            return e - (f + b) * f1;
        } else
        {
            return e * f1;
        }
    }

    static float a(Resources resources, float f1)
    {
        return TypedValue.applyDimension(1, f1, resources.getDisplayMetrics());
    }

    static float a(MaterialMenuDrawable materialmenudrawable, float f1)
    {
        materialmenudrawable.u = f1;
        return f1;
    }

    static IconState a(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.y;
    }

    private void a(int i1, int j1)
    {
        C = com.nineoldandroids.a.k.a(this, F, new float[] {
            0.0F
        });
        C.c(i1);
        C.a(new b() {

            final MaterialMenuDrawable a;

            public void b(com.nineoldandroids.a.a a1)
            {
                MaterialMenuDrawable.a(a, false);
                a.a(MaterialMenuDrawable.a(a));
            }

            
            {
                a = MaterialMenuDrawable.this;
                super();
            }
        });
        D = com.nineoldandroids.a.k.a(this, G, new float[] {
            0.0F, 0.0F
        });
        D.c(j1);
        D.a(new DecelerateInterpolator());
        D.a(new b() {

            final MaterialMenuDrawable a;

            public void b(com.nineoldandroids.a.a a1)
            {
                MaterialMenuDrawable.a(a, 0.0F);
            }

            public void c(com.nineoldandroids.a.a a1)
            {
                MaterialMenuDrawable.a(a, 0.0F);
            }

            
            {
                a = MaterialMenuDrawable.this;
                super();
            }
        });
    }

    private void a(Canvas canvas)
    {
        canvas.restore();
        canvas.drawCircle(h / 2, i / 2, u, s);
    }

    private void a(Canvas canvas, float f1)
    {
        float f2;
        float f3;
        float f5;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        canvas.restore();
        canvas.save();
        f2 = h / 2;
        f8 = h / 2;
        f5 = m;
        f9 = l;
        f10 = d / 2.0F;
        f3 = (float)h - m;
        f11 = l;
        f12 = d / 2.0F;
        _cls5.a[x.ordinal()];
        JVM INSTR tableswitch 1 6: default 120
    //                   1 195
    //                   2 254
    //                   3 281
    //                   4 317
    //                   5 460
    //                   6 537;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        float f4;
        int i1;
        i1 = 255;
        f4 = 0.0F;
        f1 = f3;
        f3 = f4;
        f4 = f5;
_L9:
        r.setAlpha(i1);
        canvas.rotate(f3, f2, f8);
        canvas.drawLine(f4, f10 * 5F + f9, f1, f12 * 5F + f11, r);
        r.setAlpha(255);
        return;
_L2:
        if (d())
        {
            f4 = 180F * f1;
        } else
        {
            f4 = 180F + (1.0F - f1) * 180F;
        }
        f1 = f3 - (a(f1) * f1) / 2.0F;
        f3 = f4;
        i1 = 255;
        f4 = f5;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = (int)((1.0F - f1) * 255F);
        float f6 = 0.0F;
        f1 = f3;
        f4 = f5;
        f3 = f6;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = (int)((1.0F - f1) * 255F);
        f4 = f5 + (1.0F - f1) * c;
        f5 = 0.0F;
        f1 = f3;
        f3 = f5;
        continue; /* Loop/switch isn't completed */
_L5:
        if (d())
        {
            f2 = f1 * 135F;
            f4 = f5 + (d / 2.0F + e * f1);
            f1 = (g + a) * f1 + f3;
        } else
        {
            f2 = 135F - 135F * (1.0F - f1);
            f4 = f5 + ((d / 2.0F + e) - (1.0F - f1) * (c + a));
            f1 = (g - (1.0F - f1) * (c + f)) + f3;
        }
        f5 = (float)(h / 2) + d * 2.0F;
        f3 = f2;
        i1 = 255;
        f2 = f5;
        continue; /* Loop/switch isn't completed */
_L6:
        f4 = f5 + (e + d / 2.0F) * f1;
        f2 = f3 + (g + a) * f1;
        f5 = h / 2;
        float f7 = d;
        f3 = f1 * 135F;
        i1 = 255;
        f5 += f7 * 2.0F;
        f1 = f2;
        f2 = f5;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = (int)(255F * f1);
        f4 = f5 + (e + d / 2.0F) * f1;
        f5 = (g + a) * f1 + f3;
        f2 = (float)(h / 2) + d * 2.0F;
        f3 = f1 * 135F;
        f1 = f5;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static boolean a(MaterialMenuDrawable materialmenudrawable, boolean flag)
    {
        materialmenudrawable.v = flag;
        return flag;
    }

    static Paint b(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.s;
    }

    private void b(Canvas canvas, float f1)
    {
        float f2;
        float f6;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        canvas.save();
        f11 = h / 2;
        f12 = d / 2.0F;
        f13 = l;
        f14 = c;
        f2 = m;
        f15 = l;
        f16 = c;
        f6 = (float)h - m;
        f17 = l;
        f18 = c;
        _cls5.a[x.ordinal()];
        JVM INSTR tableswitch 1 6: default 124
    //                   1 208
    //                   2 301
    //                   3 365
    //                   4 517
    //                   5 572
    //                   6 598;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        float f3;
        float f4;
        float f5;
        int i1;
        i1 = 255;
        f1 = f2;
        f2 = 0.0F;
        f3 = 0.0F;
        f4 = 0.0F;
        f5 = 0.0F;
_L9:
        r.setAlpha(i1);
        canvas.rotate(f5, f4, f3);
        canvas.rotate(f2, f11 + f12, f13 + f14);
        canvas.drawLine(f1, f15 + f16, f6, f17 + f18, r);
        r.setAlpha(255);
        return;
_L2:
        float f7;
        if (d())
        {
            f3 = 225F * f1;
        } else
        {
            f3 = 225F + (1.0F - f1) * 135F;
        }
        f5 = h / 2;
        f4 = i / 2;
        f6 -= a(f1);
        f1 = f2 + d * f1;
        f2 = 0.0F;
        f7 = f3;
        i1 = 255;
        f3 = f4;
        f4 = f5;
        f5 = f7;
        continue; /* Loop/switch isn't completed */
_L3:
        f5 = 44F * f1;
        f3 = m;
        f4 = e + f3;
        f3 = l + d;
        f6 += d * f1;
        float f8 = 90F * f1;
        i1 = 255;
        f1 = f2;
        f2 = f8;
        continue; /* Loop/switch isn't completed */
_L4:
        f5 = h / 2;
        float f9 = m;
        float f20 = e;
        float f21 = h / 2;
        f4 = i / 2;
        float f22 = l;
        float f23 = d;
        float f24 = i / 2;
        f6 -= a(f1);
        float f19 = d;
        f3 = 90F * f1;
        f4 = ((f22 + f23) - f24) * f1 + f4;
        f9 = f5 + ((f9 + f20) - f21) * f1;
        f5 = 225F + -181F * f1;
        f1 = f19 * (1.0F - f1) + f2;
        i1 = 255;
        f2 = f3;
        f3 = f4;
        f4 = f9;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = (int)((1.0F - f1) * 255F);
        f4 = h / 2;
        f3 = i / 2;
        f6 -= a(1.0F);
        f1 = d + f2;
        f2 = 0.0F;
        f5 = 225F;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = (int)((1.0F - f1) * 255F);
        f1 = f2;
        f2 = 0.0F;
        f3 = 0.0F;
        f4 = 0.0F;
        f5 = 0.0F;
        continue; /* Loop/switch isn't completed */
_L7:
        f5 = 44F;
        f4 = m + e;
        f3 = l;
        f3 = d + f3;
        f6 += d;
        i1 = (int)((1.0F - f1) * 255F);
        float f10 = 90F;
        f1 = f2;
        f2 = f10;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static Stroke c(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.o;
    }

    private void c(Canvas canvas, float f1)
    {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        canvas.restore();
        canvas.save();
        f5 = 0.0F;
        f4 = 0.0F;
        f8 = h / 2;
        f9 = d / 2.0F;
        f10 = i;
        f11 = l;
        f12 = c;
        f6 = m;
        f13 = i;
        f14 = l;
        f15 = c;
        f7 = (float)h - m;
        f16 = i;
        f17 = l;
        f18 = c;
        _cls5.a[x.ordinal()];
        JVM INSTR tableswitch 1 6: default 156
    //                   1 220
    //                   2 308
    //                   3 388
    //                   4 498
    //                   5 572
    //                   6 644;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        float f2;
        float f3;
        f3 = 0.0F;
        f1 = 0.0F;
        f2 = f7;
_L9:
        canvas.rotate(f5, f4, f3);
        canvas.rotate(f1, f8 + f9, f10 - f11 - f12);
        canvas.drawLine(f6, f13 - f14 - f15, f2, f16 - f17 - f18, r);
        return;
_L2:
        if (d())
        {
            f2 = 135F * f1;
        } else
        {
            f2 = 135F + (1.0F - f1) * 225F;
        }
        f4 = h / 2;
        f3 = i / 2;
        f7 = (float)h - m - a(f1);
        f6 = m + d * f1;
        f5 = f2;
        f1 = 0.0F;
        f2 = f7;
        continue; /* Loop/switch isn't completed */
_L3:
        if (d())
        {
            f2 = -90F * f1;
        } else
        {
            f2 = 90F * f1;
        }
        f5 = -44F * f1;
        f3 = m;
        f4 = e + f3;
        f3 = (float)i - l - d;
        f7 += d * f1;
        f1 = f2;
        f2 = f7;
        continue; /* Loop/switch isn't completed */
_L4:
        f5 = 135F + 181F * f1;
        f2 = -90F * f1;
        f3 = h / 2;
        f4 = ((m + e) - (float)(h / 2)) * f1 + f3;
        f3 = (float)(i / 2) + ((float)(i / 2) - l - d) * f1;
        f7 -= a(f1);
        f6 += d * (1.0F - f1);
        f1 = f2;
        f2 = f7;
        continue; /* Loop/switch isn't completed */
_L5:
        f5 = 135F + -90F * f1;
        f4 = (float)(h / 2) - d * f1;
        f3 = i / 2;
        float f19 = d;
        f2 = f7 - a(1.0F);
        f6 += d;
        f3 -= f19 * f1;
        f1 = 0.0F;
        continue; /* Loop/switch isn't completed */
_L6:
        f5 = f1 * 45F;
        f4 = (float)(h / 2) - d * f1;
        f3 = i / 2;
        float f20 = d;
        f6 += d * f1;
        f2 = f7 - a(f1);
        f3 -= f20 * f1;
        f1 = 0.0F;
        continue; /* Loop/switch isn't completed */
_L7:
        f2 = -90F * (1.0F - f1);
        f5 = -44F + 89F * f1;
        f3 = m;
        f4 = e;
        f4 = ((float)(h / 2) - m - d - e) * f1 + (f3 + f4);
        f3 = ((float)i - l - d) + ((l + (float)(i / 2)) - (float)i) * f1;
        f6 += d - d * (1.0F - f1);
        f7 -= a(1.0F - f1);
        f1 = f2;
        f2 = f7;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static k d(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.C;
    }

    private void d(int i1)
    {
        q.setAntiAlias(false);
        q.setColor(0xff00ff00);
        q.setStrokeWidth(1.0F);
        r.setAntiAlias(true);
        r.setStyle(android.graphics.Paint.Style.STROKE);
        r.setStrokeWidth(j);
        r.setColor(i1);
        s.setAntiAlias(true);
        s.setStyle(android.graphics.Paint.Style.FILL);
        s.setColor(i1);
        s.setAlpha(200);
        setBounds(0, 0, h, i);
    }

    private boolean d()
    {
        return t <= 1.0F;
    }

    static k e(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.D;
    }

    private boolean e()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        if (w == IconState.BURGER)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (w == IconState.ARROW)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        if (w == IconState.X)
        {
            flag7 = true;
        } else
        {
            flag7 = false;
        }
        if (w == IconState.CHECK)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (y == IconState.BURGER)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (y == IconState.ARROW)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (y == IconState.X)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (y == IconState.CHECK)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag5 && flag2 || flag6 && flag1)
        {
            x = AnimationState.BURGER_ARROW;
            return flag5;
        }
        if (flag6 && flag3 || flag7 && flag2)
        {
            x = AnimationState.ARROW_X;
            return flag6;
        }
        if (flag5 && flag3 || flag7 && flag1)
        {
            x = AnimationState.BURGER_X;
            return flag5;
        }
        if (flag6 && flag4 || flag && flag2)
        {
            x = AnimationState.ARROW_CHECK;
            return flag6;
        }
        if (flag5 && flag4 || flag && flag1)
        {
            x = AnimationState.BURGER_CHECK;
            return flag5;
        }
        if (flag7 && flag4 || flag && flag3)
        {
            x = AnimationState.X_CHECK;
            return flag7;
        } else
        {
            throw new IllegalStateException(String.format("Animating from %s to %s is not supported", new Object[] {
                w, y
            }));
        }
    }

    static int f(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.h;
    }

    static int g(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.i;
    }

    static float h(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.k;
    }

    static float i(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.n;
    }

    static float j(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.j;
    }

    static float k(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.b;
    }

    static IconState l(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.w;
    }

    static boolean m(MaterialMenuDrawable materialmenudrawable)
    {
        return materialmenudrawable.B;
    }

    public IconState a()
    {
        return w;
    }

    public void a(int i1)
    {
        r.setColor(i1);
        s.setColor(i1);
        invalidateSelf();
    }

    public void a(Interpolator interpolator)
    {
        C.a(interpolator);
    }

    public void a(IconState iconstate)
    {
label0:
        {
            synchronized (p)
            {
                if (v)
                {
                    C.b();
                    v = false;
                }
                if (w != iconstate)
                {
                    break label0;
                }
            }
            return;
        }
        com.qihoo.security.v7._cls5.c[iconstate.ordinal()];
        JVM INSTR tableswitch 1 4: default 153
    //                   1 93
    //                   2 108
    //                   3 123
    //                   4 138;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_138;
_L6:
        w = iconstate;
        invalidateSelf();
        obj;
        JVM INSTR monitorexit ;
        return;
        iconstate;
        obj;
        JVM INSTR monitorexit ;
        throw iconstate;
_L2:
        x = AnimationState.BURGER_ARROW;
        t = 0.0F;
          goto _L6
_L3:
        x = AnimationState.BURGER_ARROW;
        t = 1.0F;
          goto _L6
_L4:
        x = AnimationState.BURGER_X;
        t = 1.0F;
          goto _L6
        x = AnimationState.BURGER_CHECK;
        t = 1.0F;
          goto _L6
    }

    public void a(IconState iconstate, boolean flag)
    {
        synchronized (p)
        {
            if (v)
            {
                C.c();
                D.c();
            }
            z = flag;
            y = iconstate;
            start();
        }
        return;
        iconstate;
        obj;
        JVM INSTR monitorexit ;
        throw iconstate;
    }

    public void a(Float float1)
    {
        t = float1.floatValue();
        invalidateSelf();
    }

    public void a(boolean flag)
    {
        B = flag;
        invalidateSelf();
    }

    public Float b()
    {
        return Float.valueOf(t);
    }

    public void b(int i1)
    {
        C.c(i1);
    }

    public void b(Float float1)
    {
        u = float1.floatValue();
        s.setAlpha((int)(200F * (1.0F - float1.floatValue() / (n * 1.22F))));
        invalidateSelf();
    }

    public Float c()
    {
        return Float.valueOf(u);
    }

    public void c(int i1)
    {
        D.c(i1);
    }

    public void draw(Canvas canvas)
    {
        float f1;
        if (t <= 1.0F)
        {
            f1 = t;
        } else
        {
            f1 = 2.0F - t;
        }
        if (B)
        {
            canvas.save();
            canvas.scale(-1F, 1.0F, 0.0F, 0.0F);
            canvas.translate(-getIntrinsicWidth(), 0.0F);
        }
        b(canvas, f1);
        a(canvas, f1);
        c(canvas, f1);
        if (B)
        {
            canvas.restore();
        }
        if (z)
        {
            a(canvas);
        }
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        a.a(E, getChangingConfigurations());
        return E;
    }

    public int getIntrinsicHeight()
    {
        return i;
    }

    public int getIntrinsicWidth()
    {
        return h;
    }

    public int getOpacity()
    {
        return -2;
    }

    public boolean isRunning()
    {
        return v;
    }

    public Drawable mutate()
    {
        E = new a();
        return this;
    }

    public void setAlpha(int i1)
    {
        r.setAlpha(i1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        r.setColorFilter(colorfilter);
    }

    public void start()
    {
        float f2 = 1.0F;
        if (v || y == null || y == w)
        {
            return;
        }
        v = true;
        boolean flag = e();
        k k1 = C;
        float f1;
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        if (!flag)
        {
            f2 = 2.0F;
        }
        k1.a(new float[] {
            f1, f2
        });
        C.a();
        if (D.d())
        {
            D.b();
        }
        if (z && !A)
        {
            D.a(new float[] {
                0.0F, n * 1.22F
            });
            D.a();
        }
        invalidateSelf();
    }

    public void stop()
    {
        if (isRunning() && C.d())
        {
            C.c();
            return;
        } else
        {
            v = false;
            invalidateSelf();
            return;
        }
    }
}
