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
import android.support.v4.util.e;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.internal.widget:
//            n, l

public final class o
{
    private static final class a extends e
    {

        private static int b(int i1, android.graphics.PorterDuff.Mode mode)
        {
            return (i1 + 31) * 31 + mode.hashCode();
        }

        final PorterDuffColorFilter a(int i1, android.graphics.PorterDuff.Mode mode)
        {
            return (PorterDuffColorFilter)a(Integer.valueOf(b(i1, mode)));
        }

        final PorterDuffColorFilter a(int i1, android.graphics.PorterDuff.Mode mode, PorterDuffColorFilter porterduffcolorfilter)
        {
            return (PorterDuffColorFilter)a(Integer.valueOf(b(i1, mode)), porterduffcolorfilter);
        }

        public a()
        {
            super(6);
        }
    }


    public static final boolean a;
    private static final android.graphics.PorterDuff.Mode b;
    private static final WeakHashMap c = new WeakHashMap();
    private static final a d = new a();
    private static final int e[];
    private static final int f[];
    private static final int g[];
    private static final int h[];
    private static final int i[];
    private static final int j[];
    private final WeakReference k;
    private SparseArray l;
    private ColorStateList m;

    private o(Context context)
    {
        k = new WeakReference(context);
    }

    private static PorterDuffColorFilter a(int i1, android.graphics.PorterDuff.Mode mode)
    {
        PorterDuffColorFilter porterduffcolorfilter1 = d.a(i1, mode);
        PorterDuffColorFilter porterduffcolorfilter = porterduffcolorfilter1;
        if (porterduffcolorfilter1 == null)
        {
            porterduffcolorfilter = new PorterDuffColorFilter(i1, mode);
            d.a(i1, mode, porterduffcolorfilter);
        }
        return porterduffcolorfilter;
    }

    public static Drawable a(Context context, int i1)
    {
        boolean flag;
        if (a(f, i1) || a(e, i1) || a(g, i1) || a(i, i1) || a(h, i1) || a(j, i1) || i1 == android.support.v7.appcompat.a.e.abc_cab_background_top_material)
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

    public static o a(Context context)
    {
        o o2 = (o)c.get(context);
        o o1 = o2;
        if (o2 == null)
        {
            o1 = new o(context);
            c.put(context, o1);
        }
        return o1;
    }

    public static void a(View view, n n1)
    {
        Object obj1 = null;
        Drawable drawable = view.getBackground();
        if (n1.d || n1.c)
        {
            ColorStateList colorstatelist;
            Object obj;
            int ai[];
            if (n1.d)
            {
                colorstatelist = n1.a;
            } else
            {
                colorstatelist = null;
            }
            if (n1.c)
            {
                n1 = n1.b;
            } else
            {
                n1 = b;
            }
            ai = view.getDrawableState();
            obj = obj1;
            if (colorstatelist != null)
            {
                if (n1 == null)
                {
                    obj = obj1;
                } else
                {
                    obj = a(colorstatelist.getColorForState(ai, 0), ((android.graphics.PorterDuff.Mode) (n1)));
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
        int k1 = ai.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (ai[j1] == i1)
            {
                return true;
            }
        }

        return false;
    }

    private static ColorStateList b(Context context, int i1)
    {
        i1 = android.support.v7.internal.widget.l.a(context, i1);
        int l1 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlHighlight);
        int ai[] = android.support.v7.internal.widget.l.a;
        int j1 = android.support.v7.internal.widget.l.c(context, android.support.v7.appcompat.a.a.colorButtonNormal);
        context = l.d;
        int k1 = android.support.v4.graphics.a.a(l1, i1);
        int ai1[] = l.b;
        l1 = android.support.v4.graphics.a.a(l1, i1);
        return new ColorStateList(new int[][] {
            ai, context, ai1, l.h
        }, new int[] {
            j1, k1, l1, i1
        });
    }

    public final Drawable a(int i1)
    {
        return a(i1, false);
    }

    public final Drawable a(int i1, boolean flag)
    {
        Object obj = (Context)k.get();
        if (obj == null)
        {
            obj = null;
        } else
        {
            Drawable drawable = android.support.v4.content.a.a(((Context) (obj)), i1);
            obj = drawable;
            if (drawable != null)
            {
                Object obj1 = drawable;
                if (android.os.Build.VERSION.SDK_INT >= 8)
                {
                    obj1 = drawable.mutate();
                }
                obj = b(i1);
                if (obj != null)
                {
                    Drawable drawable1 = android.support.v4.graphics.drawable.a.c(((Drawable) (obj1)));
                    android.support.v4.graphics.drawable.a.a(drawable1, ((ColorStateList) (obj)));
                    if (i1 == android.support.v7.appcompat.a.e.abc_switch_thumb_material)
                    {
                        obj1 = android.graphics.PorterDuff.Mode.MULTIPLY;
                    } else
                    {
                        obj1 = null;
                    }
                    obj = drawable1;
                    if (obj1 != null)
                    {
                        android.support.v4.graphics.drawable.a.a(drawable1, ((android.graphics.PorterDuff.Mode) (obj1)));
                        return drawable1;
                    }
                }
            }
            while (false) 
            {
                if (i1 == android.support.v7.appcompat.a.e.abc_cab_background_top_material)
                {
                    return new LayerDrawable(new Drawable[] {
                        a(android.support.v7.appcompat.a.e.abc_cab_background_internal_bg, false), a(android.support.v7.appcompat.a.e.abc_cab_background_top_mtrl_alpha, false)
                    });
                }
                obj = obj1;
                if (a(i1, ((Drawable) (obj1))))
                {
                    continue;
                }
                obj = obj1;
                if (flag)
                {
                    return null;
                }
            }
        }
        return ((Drawable) (obj));
    }

    public final boolean a(int i1, Drawable drawable)
    {
        Context context = (Context)k.get();
        if (context != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        android.graphics.PorterDuff.Mode mode;
        android.graphics.PorterDuff.Mode mode1;
        int j1;
        boolean flag;
        int k1;
        mode1 = b;
        flag = false;
        j1 = 0;
        k1 = -1;
        if (!a(e, i1))
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = android.support.v7.appcompat.a.a.colorControlNormal;
        flag = true;
        mode = mode1;
_L4:
        if (flag)
        {
            drawable.setColorFilter(a(android.support.v7.internal.widget.l.a(context, j1), mode));
            if (k1 != -1)
            {
                drawable.setAlpha(k1);
            }
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (a(g, i1))
        {
            j1 = android.support.v7.appcompat.a.a.colorControlActivated;
            flag = true;
            mode = mode1;
        } else
        if (a(h, i1))
        {
            j1 = 0x1010031;
            flag = true;
            mode = android.graphics.PorterDuff.Mode.MULTIPLY;
        } else
        {
            mode = mode1;
            if (i1 == android.support.v7.appcompat.a.e.abc_list_divider_mtrl_alpha)
            {
                j1 = 0x1010030;
                flag = true;
                k1 = Math.round(40.8F);
                mode = mode1;
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final ColorStateList b(int i1)
    {
        Context context = (Context)k.get();
        if (context != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return ((ColorStateList) (obj1));
_L2:
        Object obj;
        int ai4[];
        int j1;
        int k2;
        int l3;
        if (l != null)
        {
            obj = (ColorStateList)l.get(i1);
        } else
        {
            obj = null;
        }
        obj1 = obj;
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 != android.support.v7.appcompat.a.e.abc_edit_text_material)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = android.support.v7.internal.widget.l.a;
        j1 = android.support.v7.internal.widget.l.c(context, android.support.v7.appcompat.a.a.colorControlNormal);
        obj1 = l.g;
        k2 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlNormal);
        ai4 = l.h;
        l3 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlActivated);
        obj = new ColorStateList(new int[][] {
            obj, obj1, ai4
        }, new int[] {
            j1, k2, l3
        });
_L5:
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
        if (true) goto _L4; else goto _L3
_L3:
        if (i1 == android.support.v7.appcompat.a.e.abc_switch_track_mtrl_alpha)
        {
            obj = android.support.v7.internal.widget.l.a;
            int k1 = android.support.v7.internal.widget.l.a(context, 0x1010030, 0.1F);
            int ai[] = android.support.v7.internal.widget.l.e;
            int l2 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlActivated, 0.3F);
            int ai5[] = l.h;
            int i4 = android.support.v7.internal.widget.l.a(context, 0x1010030, 0.3F);
            obj = new ColorStateList(new int[][] {
                obj, ai, ai5
            }, new int[] {
                k1, l2, i4
            });
        } else
        if (i1 == android.support.v7.appcompat.a.e.abc_switch_thumb_material)
        {
            obj = new int[3][];
            int ai1[] = new int[3];
            ColorStateList colorstatelist = android.support.v7.internal.widget.l.b(context, android.support.v7.appcompat.a.a.colorSwitchThumbNormal);
            if (colorstatelist != null && colorstatelist.isStateful())
            {
                obj[0] = android.support.v7.internal.widget.l.a;
                ai1[0] = colorstatelist.getColorForState(obj[0], 0);
                obj[1] = android.support.v7.internal.widget.l.e;
                ai1[1] = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlActivated);
                obj[2] = l.h;
                ai1[2] = colorstatelist.getDefaultColor();
            } else
            {
                obj[0] = android.support.v7.internal.widget.l.a;
                ai1[0] = android.support.v7.internal.widget.l.c(context, android.support.v7.appcompat.a.a.colorSwitchThumbNormal);
                obj[1] = android.support.v7.internal.widget.l.e;
                ai1[1] = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlActivated);
                obj[2] = l.h;
                ai1[2] = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorSwitchThumbNormal);
            }
            obj = new ColorStateList(((int [][]) (obj)), ai1);
        } else
        if (i1 == android.support.v7.appcompat.a.e.abc_btn_default_mtrl_shape || i1 == android.support.v7.appcompat.a.e.abc_btn_borderless_material)
        {
            obj = b(context, android.support.v7.appcompat.a.a.colorButtonNormal);
        } else
        if (i1 == android.support.v7.appcompat.a.e.abc_btn_colored_material)
        {
            obj = b(context, android.support.v7.appcompat.a.a.colorAccent);
        } else
        if (i1 == android.support.v7.appcompat.a.e.abc_spinner_mtrl_am_alpha || i1 == android.support.v7.appcompat.a.e.abc_spinner_textfield_background_material)
        {
            obj = android.support.v7.internal.widget.l.a;
            int l1 = android.support.v7.internal.widget.l.c(context, android.support.v7.appcompat.a.a.colorControlNormal);
            int ai2[] = l.g;
            int i3 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlNormal);
            int ai6[] = l.h;
            int j4 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlActivated);
            obj = new ColorStateList(new int[][] {
                obj, ai2, ai6
            }, new int[] {
                l1, i3, j4
            });
        } else
        if (a(f, i1))
        {
            obj = android.support.v7.internal.widget.l.b(context, android.support.v7.appcompat.a.a.colorControlNormal);
        } else
        if (a(i, i1))
        {
            if (m == null)
            {
                int i2 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlNormal);
                int j3 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlActivated);
                obj = android.support.v7.internal.widget.l.a;
                int k4 = android.support.v7.internal.widget.l.c(context, android.support.v7.appcompat.a.a.colorControlNormal);
                m = new ColorStateList(new int[][] {
                    obj, l.b, l.c, l.d, android.support.v7.internal.widget.l.e, l.f, l.h
                }, new int[] {
                    k4, j3, j3, j3, j3, j3, i2
                });
            }
            obj = m;
        } else
        if (a(j, i1))
        {
            obj = android.support.v7.internal.widget.l.a;
            int j2 = android.support.v7.internal.widget.l.c(context, android.support.v7.appcompat.a.a.colorControlNormal);
            int ai3[] = android.support.v7.internal.widget.l.e;
            int k3 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlActivated);
            int ai7[] = l.h;
            int l4 = android.support.v7.internal.widget.l.a(context, android.support.v7.appcompat.a.a.colorControlNormal);
            obj = new ColorStateList(new int[][] {
                obj, ai3, ai7
            }, new int[] {
                j2, k3, l4
            });
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
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
            android.support.v7.appcompat.a.e.abc_textfield_search_default_mtrl_alpha, android.support.v7.appcompat.a.e.abc_textfield_default_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ab_share_pack_mtrl_alpha
        });
        f = (new int[] {
            android.support.v7.appcompat.a.e.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.appcompat.a.e.abc_ic_go_search_api_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_search_api_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_clear_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_menu_share_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.appcompat.a.e.abc_ic_menu_cut_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_menu_paste_mtrl_am_alpha, 
            android.support.v7.appcompat.a.e.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.appcompat.a.e.abc_ic_voice_search_api_mtrl_alpha
        });
        g = (new int[] {
            android.support.v7.appcompat.a.e.abc_textfield_activated_mtrl_alpha, android.support.v7.appcompat.a.e.abc_textfield_search_activated_mtrl_alpha, android.support.v7.appcompat.a.e.abc_cab_background_top_mtrl_alpha, android.support.v7.appcompat.a.e.abc_text_cursor_material
        });
        h = (new int[] {
            android.support.v7.appcompat.a.e.abc_popup_background_mtrl_mult, android.support.v7.appcompat.a.e.abc_cab_background_internal_bg, android.support.v7.appcompat.a.e.abc_menu_hardkey_panel_mtrl_mult
        });
        i = (new int[] {
            android.support.v7.appcompat.a.e.abc_edit_text_material, android.support.v7.appcompat.a.e.abc_tab_indicator_material, android.support.v7.appcompat.a.e.abc_textfield_search_material, android.support.v7.appcompat.a.e.abc_spinner_mtrl_am_alpha, android.support.v7.appcompat.a.e.abc_spinner_textfield_background_material, android.support.v7.appcompat.a.e.abc_ratingbar_full_material, android.support.v7.appcompat.a.e.abc_switch_track_mtrl_alpha, android.support.v7.appcompat.a.e.abc_switch_thumb_material, android.support.v7.appcompat.a.e.abc_btn_default_mtrl_shape, android.support.v7.appcompat.a.e.abc_btn_borderless_material
        });
        j = (new int[] {
            android.support.v7.appcompat.a.e.abc_btn_check_material, android.support.v7.appcompat.a.e.abc_btn_radio_material
        });
    }
}
