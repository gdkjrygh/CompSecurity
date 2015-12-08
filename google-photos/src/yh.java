// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class yh
{

    public static final boolean a;
    private static final android.graphics.PorterDuff.Mode b;
    private static final WeakHashMap c = new WeakHashMap();
    private static final yi d = new yi(6);
    private static final int e[];
    private static final int f[];
    private static final int g[];
    private static final int h[];
    private static final int i[];
    private static final int j[];
    private final WeakReference k;
    private SparseArray l;
    private ColorStateList m;

    private yh(Context context)
    {
        k = new WeakReference(context);
    }

    private static PorterDuffColorFilter a(int i1, android.graphics.PorterDuff.Mode mode)
    {
        PorterDuffColorFilter porterduffcolorfilter1 = (PorterDuffColorFilter)d.a(Integer.valueOf(yi.a(i1, mode)));
        PorterDuffColorFilter porterduffcolorfilter = porterduffcolorfilter1;
        if (porterduffcolorfilter1 == null)
        {
            porterduffcolorfilter = new PorterDuffColorFilter(i1, mode);
            mode = (PorterDuffColorFilter)d.a(Integer.valueOf(yi.a(i1, mode)), porterduffcolorfilter);
        }
        return porterduffcolorfilter;
    }

    public static Drawable a(Context context, int i1)
    {
        boolean flag;
        if (a(f, i1) || a(e, i1) || a(g, i1) || a(i, i1) || a(h, i1) || a(j, i1) || i1 == b.al)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return a(context).a(i1, false);
        } else
        {
            return ed.a(context, i1);
        }
    }

    public static yh a(Context context)
    {
        yh yh2 = (yh)c.get(context);
        yh yh1 = yh2;
        if (yh2 == null)
        {
            yh1 = new yh(context);
            c.put(context, yh1);
        }
        return yh1;
    }

    public static void a(View view, yg yg1)
    {
        Object obj1 = null;
        Drawable drawable = view.getBackground();
        if (yg1.d || yg1.c)
        {
            ColorStateList colorstatelist;
            Object obj;
            int ai[];
            if (yg1.d)
            {
                colorstatelist = yg1.a;
            } else
            {
                colorstatelist = null;
            }
            if (yg1.c)
            {
                yg1 = yg1.b;
            } else
            {
                yg1 = b;
            }
            ai = view.getDrawableState();
            obj = obj1;
            if (colorstatelist != null)
            {
                if (yg1 == null)
                {
                    obj = obj1;
                } else
                {
                    obj = a(colorstatelist.getColorForState(ai, 0), ((android.graphics.PorterDuff.Mode) (yg1)));
                }
            }
            drawable.setColorFilter(((android.graphics.ColorFilter) (obj)));
        } else
        {
            drawable.clearColorFilter();
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            view.invalidate();
        }
    }

    private static boolean a(int ai[], int i1)
    {
        boolean flag1 = false;
        int k1 = ai.length;
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < k1)
                {
                    if (ai[j1] != i1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    private static ColorStateList b(Context context, int i1)
    {
        i1 = yd.a(context, i1);
        int l1 = yd.a(context, b.D);
        int ai[] = yd.a;
        int j1 = yd.c(context, b.B);
        context = yd.d;
        int k1 = b.a(l1, i1);
        int ai1[] = yd.b;
        l1 = b.a(l1, i1);
        return new ColorStateList(new int[][] {
            ai, context, ai1, yd.h
        }, new int[] {
            j1, k1, l1, i1
        });
    }

    public final ColorStateList a(int i1)
    {
        Object obj1 = (Context)k.get();
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            Object obj;
            if (l != null)
            {
                obj = (ColorStateList)l.get(i1);
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                if (i1 == b.an)
                {
                    obj = yd.a;
                    int j1 = yd.c(((Context) (obj1)), b.E);
                    int ai[] = yd.g;
                    int k2 = yd.a(((Context) (obj1)), b.E);
                    int ai5[] = yd.h;
                    int l3 = yd.a(((Context) (obj1)), b.C);
                    obj = new ColorStateList(new int[][] {
                        obj, ai, ai5
                    }, new int[] {
                        j1, k2, l3
                    });
                } else
                if (i1 == b.aH)
                {
                    obj = yd.a;
                    int k1 = yd.a(((Context) (obj1)), 0x1010030, 0.1F);
                    int ai1[] = yd.e;
                    int l2 = yd.a(((Context) (obj1)), b.C, 0.3F);
                    int ai6[] = yd.h;
                    int i4 = yd.a(((Context) (obj1)), 0x1010030, 0.3F);
                    obj = new ColorStateList(new int[][] {
                        obj, ai1, ai6
                    }, new int[] {
                        k1, l2, i4
                    });
                } else
                if (i1 == b.aG)
                {
                    obj = new int[3][];
                    int ai2[] = new int[3];
                    ColorStateList colorstatelist = yd.b(((Context) (obj1)), b.F);
                    if (colorstatelist != null && colorstatelist.isStateful())
                    {
                        obj[0] = yd.a;
                        ai2[0] = colorstatelist.getColorForState(obj[0], 0);
                        obj[1] = yd.e;
                        ai2[1] = yd.a(((Context) (obj1)), b.C);
                        obj[2] = yd.h;
                        ai2[2] = colorstatelist.getDefaultColor();
                    } else
                    {
                        obj[0] = yd.a;
                        ai2[0] = yd.c(((Context) (obj1)), b.F);
                        obj[1] = yd.e;
                        ai2[1] = yd.a(((Context) (obj1)), b.C);
                        obj[2] = yd.h;
                        ai2[2] = yd.a(((Context) (obj1)), b.F);
                    }
                    obj = new ColorStateList(((int [][]) (obj)), ai2);
                } else
                if (i1 == b.ai || i1 == b.af)
                {
                    obj = b(((Context) (obj1)), b.B);
                } else
                if (i1 == b.ah)
                {
                    obj = b(((Context) (obj1)), b.A);
                } else
                if (i1 == b.aE || i1 == b.aF)
                {
                    obj = yd.a;
                    int l1 = yd.c(((Context) (obj1)), b.E);
                    int ai3[] = yd.g;
                    int i3 = yd.a(((Context) (obj1)), b.E);
                    int ai7[] = yd.h;
                    int j4 = yd.a(((Context) (obj1)), b.C);
                    obj = new ColorStateList(new int[][] {
                        obj, ai3, ai7
                    }, new int[] {
                        l1, i3, j4
                    });
                } else
                if (a(f, i1))
                {
                    obj = yd.b(((Context) (obj1)), b.E);
                } else
                if (a(i, i1))
                {
                    if (m == null)
                    {
                        int i2 = yd.a(((Context) (obj1)), b.E);
                        int j3 = yd.a(((Context) (obj1)), b.C);
                        obj = yd.a;
                        int k4 = yd.c(((Context) (obj1)), b.E);
                        m = new ColorStateList(new int[][] {
                            obj, yd.b, yd.c, yd.d, yd.e, yd.f, yd.h
                        }, new int[] {
                            k4, j3, j3, j3, j3, j3, i2
                        });
                    }
                    obj = m;
                } else
                if (a(j, i1))
                {
                    obj = yd.a;
                    int j2 = yd.c(((Context) (obj1)), b.E);
                    int ai4[] = yd.e;
                    int k3 = yd.a(((Context) (obj1)), b.C);
                    int ai8[] = yd.h;
                    int l4 = yd.a(((Context) (obj1)), b.E);
                    obj = new ColorStateList(new int[][] {
                        obj, ai4, ai8
                    }, new int[] {
                        j2, k3, l4
                    });
                }
                obj1 = obj;
                if (obj != null)
                {
                    if (l == null)
                    {
                        l = new SparseArray();
                    }
                    l.append(i1, obj);
                    return ((ColorStateList) (obj));
                }
            } else
            {
                return ((ColorStateList) (obj));
            }
        }
        return ((ColorStateList) (obj1));
    }

    public final Drawable a(int i1, boolean flag)
    {
        Object obj;
        Drawable drawable;
        Object obj2;
        obj2 = null;
        obj = (Context)k.get();
        if (obj == null)
        {
            return null;
        }
        drawable = ed.a(((Context) (obj)), i1);
        obj = drawable;
        if (drawable == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = drawable;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj1 = drawable.mutate();
        }
        obj = a(i1);
        if (obj == null) goto _L4; else goto _L3
_L3:
        Drawable drawable1 = fa.c(((Drawable) (obj1)));
        fa.a(drawable1, ((ColorStateList) (obj)));
        obj1 = obj2;
        if (i1 == b.aG)
        {
            obj1 = android.graphics.PorterDuff.Mode.MULTIPLY;
        }
        obj = drawable1;
        if (obj1 != null)
        {
            fa.a(drawable1, ((android.graphics.PorterDuff.Mode) (obj1)));
            obj = drawable1;
        }
_L2:
        return ((Drawable) (obj));
_L4:
        if (i1 == b.al)
        {
            return new LayerDrawable(new Drawable[] {
                a(b.ak, false), a(b.am, false)
            });
        }
        obj = obj1;
        if (!a(i1, ((Drawable) (obj1))))
        {
            obj = obj1;
            if (flag)
            {
                obj = null;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final boolean a(int i1, Drawable drawable)
    {
        Context context = (Context)k.get();
        if (context == null)
        {
            return false;
        }
        android.graphics.PorterDuff.Mode mode = b;
        int j1;
        boolean flag;
        if (a(e, i1))
        {
            j1 = b.E;
            flag = true;
            i1 = -1;
        } else
        if (a(g, i1))
        {
            j1 = b.C;
            flag = true;
            i1 = -1;
        } else
        if (a(h, i1))
        {
            mode = android.graphics.PorterDuff.Mode.MULTIPLY;
            flag = true;
            j1 = 0x1010031;
            i1 = -1;
        } else
        if (i1 == b.aA)
        {
            j1 = 0x1010030;
            i1 = Math.round(40.8F);
            flag = true;
        } else
        {
            i1 = -1;
            j1 = 0;
            flag = false;
        }
        if (flag)
        {
            drawable.setColorFilter(a(yd.a(context, j1), mode));
            if (i1 != -1)
            {
                drawable.setAlpha(i1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b = android.graphics.PorterDuff.Mode.SRC_IN;
        e = (new int[] {
            b.aN, b.aL, b.ae
        });
        f = (new int[] {
            b.ao, b.ar, b.ay, b.aq, b.ap, b.ax, b.as, b.at, b.aw, b.av, 
            b.au, b.az
        });
        g = (new int[] {
            b.aK, b.aM, b.am, b.aJ
        });
        h = (new int[] {
            b.aC, b.ak, b.aB
        });
        i = (new int[] {
            b.an, b.aI, b.aO, b.aE, b.aF, b.aD, b.aH, b.aG, b.ai, b.af
        });
        j = (new int[] {
            b.ag, b.aj
        });
    }
}
