// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.a;
import android.support.v7.a.b;
import android.support.v7.a.f;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.internal.widget:
//            ay, aw, at

public final class ax
{

    public static final boolean a;
    private static final android.graphics.PorterDuff.Mode b;
    private static final WeakHashMap c = new WeakHashMap();
    private static final ay d = new ay();
    private static final int e[];
    private static final int f[];
    private static final int g[];
    private static final int h[];
    private static final int i[];
    private static final int j[];
    private final WeakReference k;
    private SparseArray l;
    private ColorStateList m;

    private ax(Context context)
    {
        k = new WeakReference(context);
    }

    public static Drawable a(Context context, int i1)
    {
        boolean flag;
        if (a(f, i1) || a(e, i1) || a(g, i1) || a(i, i1) || a(h, i1) || a(j, i1) || i1 == f.g)
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
            return android.support.v4.content.a.a(context, i1);
        }
    }

    public static ax a(Context context)
    {
        ax ax2 = (ax)c.get(context);
        ax ax1 = ax2;
        if (ax2 == null)
        {
            ax1 = new ax(context);
            c.put(context, ax1);
        }
        return ax1;
    }

    private static void a(Drawable drawable, int i1, android.graphics.PorterDuff.Mode mode)
    {
        android.graphics.PorterDuff.Mode mode1 = mode;
        if (mode == null)
        {
            mode1 = b;
        }
        PorterDuffColorFilter porterduffcolorfilter = d.a(i1, mode1);
        mode = porterduffcolorfilter;
        if (porterduffcolorfilter == null)
        {
            mode = new PorterDuffColorFilter(i1, mode1);
            d.a(i1, mode1, mode);
        }
        drawable.setColorFilter(mode);
    }

    public static void a(View view, aw aw1)
    {
        Drawable drawable = view.getBackground();
        if (aw1.d)
        {
            int i1 = aw1.a.getColorForState(view.getDrawableState(), aw1.a.getDefaultColor());
            if (aw1.c)
            {
                aw1 = aw1.b;
            } else
            {
                aw1 = null;
            }
            a(drawable, i1, ((android.graphics.PorterDuff.Mode) (aw1)));
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

    public final Drawable a(int i1)
    {
        return a(i1, false);
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
        drawable = android.support.v4.content.a.a(((Context) (obj)), i1);
        obj = drawable;
        if (drawable == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = drawable;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj1 = drawable.mutate();
        }
        obj = b(i1);
        if (obj == null) goto _L4; else goto _L3
_L3:
        Drawable drawable1 = android.support.v4.a.a.a.c(((Drawable) (obj1)));
        android.support.v4.a.a.a.a(drawable1, ((ColorStateList) (obj)));
        obj1 = obj2;
        if (i1 == f.B)
        {
            obj1 = android.graphics.PorterDuff.Mode.MULTIPLY;
        }
        obj = drawable1;
        if (obj1 != null)
        {
            android.support.v4.a.a.a.a(drawable1, ((android.graphics.PorterDuff.Mode) (obj1)));
            obj = drawable1;
        }
_L2:
        return ((Drawable) (obj));
_L4:
        if (i1 == f.g)
        {
            return new LayerDrawable(new Drawable[] {
                a(f.f, false), a(f.h, false)
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
        android.graphics.PorterDuff.Mode mode;
        int j1;
        boolean flag;
        if (a(e, i1))
        {
            j1 = b.v;
            mode = null;
            flag = true;
            i1 = -1;
        } else
        if (a(g, i1))
        {
            j1 = b.t;
            mode = null;
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
        if (i1 == f.v)
        {
            j1 = 0x1010030;
            i1 = Math.round(40.8F);
            mode = null;
            flag = true;
        } else
        {
            i1 = -1;
            j1 = 0;
            mode = null;
            flag = false;
        }
        if (flag)
        {
            a(drawable, android.support.v7.internal.widget.at.a(context, j1), mode);
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

    public final ColorStateList b(int i1)
    {
        Context context = (Context)k.get();
        if (context == null)
        {
            context = null;
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
                if (i1 == f.i)
                {
                    obj = android.support.v7.internal.widget.at.a;
                    int j1 = at.c(context, b.v);
                    int ai[] = at.g;
                    int l2 = android.support.v7.internal.widget.at.a(context, b.v);
                    int ai6[] = at.h;
                    int j4 = android.support.v7.internal.widget.at.a(context, b.t);
                    obj = new ColorStateList(new int[][] {
                        obj, ai, ai6
                    }, new int[] {
                        j1, l2, j4
                    });
                } else
                if (i1 == f.C)
                {
                    obj = android.support.v7.internal.widget.at.a;
                    int k1 = android.support.v7.internal.widget.at.a(context, 0x1010030, 0.1F);
                    int ai1[] = at.e;
                    int i3 = android.support.v7.internal.widget.at.a(context, b.t, 0.3F);
                    int ai7[] = at.h;
                    int k4 = android.support.v7.internal.widget.at.a(context, 0x1010030, 0.3F);
                    obj = new ColorStateList(new int[][] {
                        obj, ai1, ai7
                    }, new int[] {
                        k1, i3, k4
                    });
                } else
                if (i1 == f.B)
                {
                    obj = new int[3][];
                    int ai2[] = new int[3];
                    ColorStateList colorstatelist = android.support.v7.internal.widget.at.b(context, b.w);
                    if (colorstatelist != null && colorstatelist.isStateful())
                    {
                        obj[0] = android.support.v7.internal.widget.at.a;
                        ai2[0] = colorstatelist.getColorForState(obj[0], 0);
                        obj[1] = at.e;
                        ai2[1] = android.support.v7.internal.widget.at.a(context, b.t);
                        obj[2] = at.h;
                        ai2[2] = colorstatelist.getDefaultColor();
                    } else
                    {
                        obj[0] = android.support.v7.internal.widget.at.a;
                        ai2[0] = at.c(context, b.w);
                        obj[1] = at.e;
                        ai2[1] = android.support.v7.internal.widget.at.a(context, b.t);
                        obj[2] = at.h;
                        ai2[2] = android.support.v7.internal.widget.at.a(context, b.w);
                    }
                    obj = new ColorStateList(((int [][]) (obj)), ai2);
                } else
                if (i1 == f.d || i1 == f.b)
                {
                    int l1 = android.support.v7.internal.widget.at.a(context, b.s);
                    int l5 = android.support.v7.internal.widget.at.a(context, b.u);
                    obj = android.support.v7.internal.widget.at.a;
                    int j3 = at.c(context, b.s);
                    context = at.d;
                    int l4 = android.support.v4.a.a.a(l5, l1);
                    int ai3[] = android.support.v7.internal.widget.at.b;
                    l5 = android.support.v4.a.a.a(l5, l1);
                    obj = new ColorStateList(new int[][] {
                        obj, context, ai3, at.h
                    }, new int[] {
                        j3, l4, l5, l1
                    });
                } else
                if (i1 == f.z || i1 == f.A)
                {
                    obj = android.support.v7.internal.widget.at.a;
                    int i2 = at.c(context, b.v);
                    int ai4[] = at.g;
                    int k3 = android.support.v7.internal.widget.at.a(context, b.v);
                    int ai8[] = at.h;
                    int i5 = android.support.v7.internal.widget.at.a(context, b.t);
                    obj = new ColorStateList(new int[][] {
                        obj, ai4, ai8
                    }, new int[] {
                        i2, k3, i5
                    });
                } else
                if (a(f, i1))
                {
                    obj = android.support.v7.internal.widget.at.b(context, b.v);
                } else
                if (a(i, i1))
                {
                    if (m == null)
                    {
                        int j2 = android.support.v7.internal.widget.at.a(context, b.v);
                        int l3 = android.support.v7.internal.widget.at.a(context, b.t);
                        obj = android.support.v7.internal.widget.at.a;
                        int j5 = at.c(context, b.v);
                        m = new ColorStateList(new int[][] {
                            obj, android.support.v7.internal.widget.at.b, at.c, at.d, at.e, android.support.v7.internal.widget.at.f, at.h
                        }, new int[] {
                            j5, l3, l3, l3, l3, l3, j2
                        });
                    }
                    obj = m;
                } else
                if (a(j, i1))
                {
                    obj = android.support.v7.internal.widget.at.a;
                    int k2 = at.c(context, b.v);
                    int ai5[] = at.e;
                    int i4 = android.support.v7.internal.widget.at.a(context, b.t);
                    int ai9[] = at.h;
                    int k5 = android.support.v7.internal.widget.at.a(context, b.v);
                    obj = new ColorStateList(new int[][] {
                        obj, ai5, ai9
                    }, new int[] {
                        k2, i4, k5
                    });
                }
                context = ((Context) (obj));
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
        return context;
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
            f.I, f.G, f.a
        });
        f = (new int[] {
            f.j, f.m, f.t, f.l, f.k, f.s, f.n, f.o, f.r, f.q, 
            f.p, f.u
        });
        g = (new int[] {
            f.F, f.H, f.h, f.E
        });
        h = (new int[] {
            f.x, f.f, f.w
        });
        i = (new int[] {
            f.i, f.D, f.J, f.z, f.A, f.y, f.C, f.B, f.d, f.b
        });
        j = (new int[] {
            f.c, f.e
        });
    }
}
