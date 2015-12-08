// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.a.a;
import android.support.v4.content.g;
import android.support.v7.a.b;
import android.support.v7.a.f;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.internal.widget:
//            am, ak, ah

public final class al
{

    public static final boolean a;
    private static final android.graphics.PorterDuff.Mode b;
    private static final WeakHashMap c = new WeakHashMap();
    private static final am d = new am();
    private static final int e[];
    private static final int f[];
    private static final int g[];
    private static final int h[];
    private static final int i[];
    private static final int j[];
    private final WeakReference k;
    private SparseArray l;
    private ColorStateList m;

    private al(Context context)
    {
        k = new WeakReference(context);
    }

    private static PorterDuffColorFilter a(int i1, android.graphics.PorterDuff.Mode mode)
    {
        PorterDuffColorFilter porterduffcolorfilter1 = (PorterDuffColorFilter)d.a(Integer.valueOf(android.support.v7.internal.widget.am.a(i1, mode)));
        PorterDuffColorFilter porterduffcolorfilter = porterduffcolorfilter1;
        if (porterduffcolorfilter1 == null)
        {
            porterduffcolorfilter = new PorterDuffColorFilter(i1, mode);
            d.a(Integer.valueOf(android.support.v7.internal.widget.am.a(i1, mode)), porterduffcolorfilter);
        }
        return porterduffcolorfilter;
    }

    public static Drawable a(Context context, int i1)
    {
        boolean flag;
        if (a(f, i1) || a(e, i1) || a(g, i1) || a(i, i1) || a(h, i1) || a(j, i1) || i1 == f.abc_cab_background_top_material)
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
            return android.support.v4.content.g.a(context, i1);
        }
    }

    public static al a(Context context)
    {
        al al2 = (al)c.get(context);
        al al1 = al2;
        if (al2 == null)
        {
            al1 = new al(context);
            c.put(context, al1);
        }
        return al1;
    }

    public static void a(View view, ak ak1)
    {
        Object obj1 = null;
        Drawable drawable = view.getBackground();
        if (ak1.d || ak1.c)
        {
            ColorStateList colorstatelist;
            Object obj;
            int ai[];
            if (ak1.d)
            {
                colorstatelist = ak1.a;
            } else
            {
                colorstatelist = null;
            }
            if (ak1.c)
            {
                ak1 = ak1.b;
            } else
            {
                ak1 = b;
            }
            ai = view.getDrawableState();
            obj = obj1;
            if (colorstatelist != null)
            {
                if (ak1 == null)
                {
                    obj = obj1;
                } else
                {
                    obj = a(colorstatelist.getColorForState(ai, 0), ((android.graphics.PorterDuff.Mode) (ak1)));
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
        i1 = android.support.v7.internal.widget.ah.a(context, i1);
        int l1 = android.support.v7.internal.widget.ah.a(context, b.colorControlHighlight);
        int ai[] = android.support.v7.internal.widget.ah.a;
        int j1 = ah.c(context, b.colorButtonNormal);
        context = ah.d;
        int k1 = android.support.v4.a.a.a(l1, i1);
        int ai1[] = android.support.v7.internal.widget.ah.b;
        l1 = android.support.v4.a.a.a(l1, i1);
        return new ColorStateList(new int[][] {
            ai, context, ai1, ah.h
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
                if (i1 == f.abc_edit_text_material)
                {
                    obj = android.support.v7.internal.widget.ah.a;
                    int j1 = ah.c(((Context) (obj1)), b.colorControlNormal);
                    int ai[] = android.support.v7.internal.widget.ah.g;
                    int k2 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlNormal);
                    int ai5[] = ah.h;
                    int l3 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlActivated);
                    obj = new ColorStateList(new int[][] {
                        obj, ai, ai5
                    }, new int[] {
                        j1, k2, l3
                    });
                } else
                if (i1 == f.abc_switch_track_mtrl_alpha)
                {
                    obj = android.support.v7.internal.widget.ah.a;
                    int k1 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), 0x1010030, 0.1F);
                    int ai1[] = ah.e;
                    int l2 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlActivated, 0.3F);
                    int ai6[] = ah.h;
                    int i4 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), 0x1010030, 0.3F);
                    obj = new ColorStateList(new int[][] {
                        obj, ai1, ai6
                    }, new int[] {
                        k1, l2, i4
                    });
                } else
                if (i1 == f.abc_switch_thumb_material)
                {
                    obj = new int[3][];
                    int ai2[] = new int[3];
                    ColorStateList colorstatelist = android.support.v7.internal.widget.ah.b(((Context) (obj1)), b.colorSwitchThumbNormal);
                    if (colorstatelist != null && colorstatelist.isStateful())
                    {
                        obj[0] = android.support.v7.internal.widget.ah.a;
                        ai2[0] = colorstatelist.getColorForState(obj[0], 0);
                        obj[1] = ah.e;
                        ai2[1] = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlActivated);
                        obj[2] = ah.h;
                        ai2[2] = colorstatelist.getDefaultColor();
                    } else
                    {
                        obj[0] = android.support.v7.internal.widget.ah.a;
                        ai2[0] = ah.c(((Context) (obj1)), b.colorSwitchThumbNormal);
                        obj[1] = ah.e;
                        ai2[1] = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlActivated);
                        obj[2] = ah.h;
                        ai2[2] = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorSwitchThumbNormal);
                    }
                    obj = new ColorStateList(((int [][]) (obj)), ai2);
                } else
                if (i1 == f.abc_btn_default_mtrl_shape || i1 == f.abc_btn_borderless_material)
                {
                    obj = b(((Context) (obj1)), b.colorButtonNormal);
                } else
                if (i1 == f.abc_btn_colored_material)
                {
                    obj = b(((Context) (obj1)), b.colorAccent);
                } else
                if (i1 == f.abc_spinner_mtrl_am_alpha || i1 == f.abc_spinner_textfield_background_material)
                {
                    obj = android.support.v7.internal.widget.ah.a;
                    int l1 = ah.c(((Context) (obj1)), b.colorControlNormal);
                    int ai3[] = android.support.v7.internal.widget.ah.g;
                    int i3 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlNormal);
                    int ai7[] = ah.h;
                    int j4 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlActivated);
                    obj = new ColorStateList(new int[][] {
                        obj, ai3, ai7
                    }, new int[] {
                        l1, i3, j4
                    });
                } else
                if (a(f, i1))
                {
                    obj = android.support.v7.internal.widget.ah.b(((Context) (obj1)), b.colorControlNormal);
                } else
                if (a(i, i1))
                {
                    if (m == null)
                    {
                        int i2 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlNormal);
                        int j3 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlActivated);
                        obj = android.support.v7.internal.widget.ah.a;
                        int k4 = ah.c(((Context) (obj1)), b.colorControlNormal);
                        m = new ColorStateList(new int[][] {
                            obj, android.support.v7.internal.widget.ah.b, ah.c, ah.d, ah.e, android.support.v7.internal.widget.ah.f, ah.h
                        }, new int[] {
                            k4, j3, j3, j3, j3, j3, i2
                        });
                    }
                    obj = m;
                } else
                if (a(j, i1))
                {
                    obj = android.support.v7.internal.widget.ah.a;
                    int j2 = ah.c(((Context) (obj1)), b.colorControlNormal);
                    int ai4[] = ah.e;
                    int k3 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlActivated);
                    int ai8[] = ah.h;
                    int l4 = android.support.v7.internal.widget.ah.a(((Context) (obj1)), b.colorControlNormal);
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
        drawable = android.support.v4.content.g.a(((Context) (obj)), i1);
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
        Drawable drawable1 = android.support.v4.a.a.a.c(((Drawable) (obj1)));
        android.support.v4.a.a.a.a(drawable1, ((ColorStateList) (obj)));
        obj1 = obj2;
        if (i1 == f.abc_switch_thumb_material)
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
        if (i1 == f.abc_cab_background_top_material)
        {
            return new LayerDrawable(new Drawable[] {
                a(f.abc_cab_background_internal_bg, false), a(f.abc_cab_background_top_mtrl_alpha, false)
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
            j1 = b.colorControlNormal;
            flag = true;
            i1 = -1;
        } else
        if (a(g, i1))
        {
            j1 = b.colorControlActivated;
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
        if (i1 == f.abc_list_divider_mtrl_alpha)
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
            drawable.setColorFilter(a(android.support.v7.internal.widget.ah.a(context, j1), mode));
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
            f.abc_textfield_search_default_mtrl_alpha, f.abc_textfield_default_mtrl_alpha, f.abc_ab_share_pack_mtrl_alpha
        });
        f = (new int[] {
            f.abc_ic_ab_back_mtrl_am_alpha, f.abc_ic_go_search_api_mtrl_alpha, f.abc_ic_search_api_mtrl_alpha, f.abc_ic_commit_search_api_mtrl_alpha, f.abc_ic_clear_mtrl_alpha, f.abc_ic_menu_share_mtrl_alpha, f.abc_ic_menu_copy_mtrl_am_alpha, f.abc_ic_menu_cut_mtrl_alpha, f.abc_ic_menu_selectall_mtrl_alpha, f.abc_ic_menu_paste_mtrl_am_alpha, 
            f.abc_ic_menu_moreoverflow_mtrl_alpha, f.abc_ic_voice_search_api_mtrl_alpha
        });
        g = (new int[] {
            f.abc_textfield_activated_mtrl_alpha, f.abc_textfield_search_activated_mtrl_alpha, f.abc_cab_background_top_mtrl_alpha, f.abc_text_cursor_material
        });
        h = (new int[] {
            f.abc_popup_background_mtrl_mult, f.abc_cab_background_internal_bg, f.abc_menu_hardkey_panel_mtrl_mult
        });
        i = (new int[] {
            f.abc_edit_text_material, f.abc_tab_indicator_material, f.abc_textfield_search_material, f.abc_spinner_mtrl_am_alpha, f.abc_spinner_textfield_background_material, f.abc_ratingbar_full_material, f.abc_switch_track_mtrl_alpha, f.abc_switch_thumb_material, f.abc_btn_default_mtrl_shape, f.abc_btn_borderless_material
        });
        j = (new int[] {
            f.abc_btn_check_material, f.abc_btn_radio_material
        });
    }
}
