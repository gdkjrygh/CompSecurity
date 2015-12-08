// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.internal.widget:
//            ThemeUtils, TintInfo

public final class TintManager
{
    private static class ColorFilterLruCache extends LruCache
    {

        private static int generateCacheKey(int i, android.graphics.PorterDuff.Mode mode)
        {
            return (i + 31) * 31 + mode.hashCode();
        }

        PorterDuffColorFilter get(int i, android.graphics.PorterDuff.Mode mode)
        {
            return (PorterDuffColorFilter)get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        PorterDuffColorFilter put(int i, android.graphics.PorterDuff.Mode mode, PorterDuffColorFilter porterduffcolorfilter)
        {
            return (PorterDuffColorFilter)put(Integer.valueOf(generateCacheKey(i, mode)), porterduffcolorfilter);
        }

        public ColorFilterLruCache(int i)
        {
            super(i);
        }
    }


    private static final int COLORFILTER_COLOR_BACKGROUND_MULTIPLY[];
    private static final int COLORFILTER_COLOR_CONTROL_ACTIVATED[];
    private static final int COLORFILTER_TINT_COLOR_CONTROL_NORMAL[];
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
    private static final WeakHashMap INSTANCE_CACHE = new WeakHashMap();
    public static final boolean SHOULD_BE_USED;
    private static final int TINT_CHECKABLE_BUTTON_LIST[];
    private static final int TINT_COLOR_CONTROL_NORMAL[];
    private static final int TINT_COLOR_CONTROL_STATE_LIST[];
    private final WeakReference mContextRef;
    private ColorStateList mDefaultColorStateList;
    private SparseArray mTintLists;

    private TintManager(Context context)
    {
        mContextRef = new WeakReference(context);
    }

    private static boolean arrayContains(int ai[], int i)
    {
        int k = ai.length;
        for (int j = 0; j < k; j++)
        {
            if (ai[j] == i)
            {
                return true;
            }
        }

        return false;
    }

    private ColorStateList createButtonColorStateList(Context context)
    {
        int ai[][] = new int[4][];
        int ai1[] = new int[4];
        int i = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal);
        int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlHighlight);
        ai[0] = ThemeUtils.DISABLED_STATE_SET;
        ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal);
        int k = 0 + 1;
        ai[k] = ThemeUtils.PRESSED_STATE_SET;
        ai1[k] = ColorUtils.compositeColors(j, i);
        k++;
        ai[k] = ThemeUtils.FOCUSED_STATE_SET;
        ai1[k] = ColorUtils.compositeColors(j, i);
        j = k + 1;
        ai[j] = ThemeUtils.EMPTY_STATE_SET;
        ai1[j] = i;
        return new ColorStateList(ai, ai1);
    }

    private ColorStateList createCheckableButtonColorStateList(Context context)
    {
        int ai[][] = new int[3][];
        int ai1[] = new int[3];
        ai[0] = ThemeUtils.DISABLED_STATE_SET;
        ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int i = 0 + 1;
        ai[i] = ThemeUtils.CHECKED_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        i++;
        ai[i] = ThemeUtils.EMPTY_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        return new ColorStateList(ai, ai1);
    }

    private ColorStateList createEditTextColorStateList(Context context)
    {
        int ai[][] = new int[3][];
        int ai1[] = new int[3];
        ai[0] = ThemeUtils.DISABLED_STATE_SET;
        ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int i = 0 + 1;
        ai[i] = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        i++;
        ai[i] = ThemeUtils.EMPTY_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        return new ColorStateList(ai, ai1);
    }

    private ColorStateList createSpinnerColorStateList(Context context)
    {
        int ai[][] = new int[3][];
        int ai1[] = new int[3];
        ai[0] = ThemeUtils.DISABLED_STATE_SET;
        ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int i = 0 + 1;
        ai[i] = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        i++;
        ai[i] = ThemeUtils.EMPTY_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        return new ColorStateList(ai, ai1);
    }

    private ColorStateList createSwitchThumbColorStateList(Context context)
    {
        int ai[][] = new int[3][];
        int ai1[] = new int[3];
        ColorStateList colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
        if (colorstatelist != null && colorstatelist.isStateful())
        {
            ai[0] = ThemeUtils.DISABLED_STATE_SET;
            ai1[0] = colorstatelist.getColorForState(ai[0], 0);
            int i = 0 + 1;
            ai[i] = ThemeUtils.CHECKED_STATE_SET;
            ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
            i++;
            ai[i] = ThemeUtils.EMPTY_STATE_SET;
            ai1[i] = colorstatelist.getDefaultColor();
        } else
        {
            ai[0] = ThemeUtils.DISABLED_STATE_SET;
            ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
            int j = 0 + 1;
            ai[j] = ThemeUtils.CHECKED_STATE_SET;
            ai1[j] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
            j++;
            ai[j] = ThemeUtils.EMPTY_STATE_SET;
            ai1[j] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
        }
        return new ColorStateList(ai, ai1);
    }

    private ColorStateList createSwitchTrackColorStateList(Context context)
    {
        int ai[][] = new int[3][];
        int ai1[] = new int[3];
        ai[0] = ThemeUtils.DISABLED_STATE_SET;
        ai1[0] = ThemeUtils.getThemeAttrColor(context, 0x1010030, 0.1F);
        int i = 0 + 1;
        ai[i] = ThemeUtils.CHECKED_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated, 0.3F);
        i++;
        ai[i] = ThemeUtils.EMPTY_STATE_SET;
        ai1[i] = ThemeUtils.getThemeAttrColor(context, 0x1010030, 0.3F);
        return new ColorStateList(ai, ai1);
    }

    public static TintManager get(Context context)
    {
        TintManager tintmanager1 = (TintManager)INSTANCE_CACHE.get(context);
        TintManager tintmanager = tintmanager1;
        if (tintmanager1 == null)
        {
            tintmanager = new TintManager(context);
            INSTANCE_CACHE.put(context, tintmanager);
        }
        return tintmanager;
    }

    private ColorStateList getDefaultColorStateList(Context context)
    {
        if (mDefaultColorStateList == null)
        {
            int i = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
            int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
            int ai[][] = new int[7][];
            int ai1[] = new int[7];
            ai[0] = ThemeUtils.DISABLED_STATE_SET;
            ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
            int k = 0 + 1;
            ai[k] = ThemeUtils.FOCUSED_STATE_SET;
            ai1[k] = j;
            k++;
            ai[k] = ThemeUtils.ACTIVATED_STATE_SET;
            ai1[k] = j;
            k++;
            ai[k] = ThemeUtils.PRESSED_STATE_SET;
            ai1[k] = j;
            k++;
            ai[k] = ThemeUtils.CHECKED_STATE_SET;
            ai1[k] = j;
            k++;
            ai[k] = ThemeUtils.SELECTED_STATE_SET;
            ai1[k] = j;
            j = k + 1;
            ai[j] = ThemeUtils.EMPTY_STATE_SET;
            ai1[j] = i;
            mDefaultColorStateList = new ColorStateList(ai, ai1);
        }
        return mDefaultColorStateList;
    }

    public static Drawable getDrawable(Context context, int i)
    {
        if (isInTintList(i))
        {
            return get(context).getDrawable(i);
        } else
        {
            return ContextCompat.getDrawable(context, i);
        }
    }

    private static boolean isInTintList(int i)
    {
        return arrayContains(TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i) || arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i) || arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i) || arrayContains(TINT_CHECKABLE_BUTTON_LIST, i) || i == android.support.v7.appcompat.R.drawable.abc_cab_background_top_material;
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, android.graphics.PorterDuff.Mode mode)
    {
        android.graphics.PorterDuff.Mode mode1 = mode;
        if (mode == null)
        {
            mode1 = DEFAULT_MODE;
        }
        PorterDuffColorFilter porterduffcolorfilter = COLOR_FILTER_CACHE.get(i, mode1);
        mode = porterduffcolorfilter;
        if (porterduffcolorfilter == null)
        {
            mode = new PorterDuffColorFilter(i, mode1);
            COLOR_FILTER_CACHE.put(i, mode1, mode);
        }
        drawable.setColorFilter(mode);
    }

    public static void tintViewBackground(View view, TintInfo tintinfo)
    {
        Drawable drawable = view.getBackground();
        if (tintinfo.mHasTintList)
        {
            int i = tintinfo.mTintList.getColorForState(view.getDrawableState(), tintinfo.mTintList.getDefaultColor());
            if (tintinfo.mHasTintMode)
            {
                tintinfo = tintinfo.mTintMode;
            } else
            {
                tintinfo = null;
            }
            setPorterDuffColorFilter(drawable, i, tintinfo);
        } else
        {
            drawable.clearColorFilter();
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            view.invalidate();
        }
    }

    public Drawable getDrawable(int i)
    {
        return getDrawable(i, false);
    }

    public Drawable getDrawable(int i, boolean flag)
    {
        Object obj = (Context)mContextRef.get();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((Drawable) (obj));
_L2:
        Drawable drawable;
        Object obj1 = ContextCompat.getDrawable(((Context) (obj)), i);
        obj = obj1;
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        drawable = ((Drawable) (obj1));
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            drawable = ((Drawable) (obj1)).mutate();
        }
        obj = getTintList(i);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        drawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(drawable, ((ColorStateList) (obj)));
        obj1 = getTintMode(i);
        obj = drawable;
        if (obj1 != null)
        {
            DrawableCompat.setTintMode(drawable, ((android.graphics.PorterDuff.Mode) (obj1)));
            return drawable;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i == android.support.v7.appcompat.R.drawable.abc_cab_background_top_material)
        {
            return new LayerDrawable(new Drawable[] {
                getDrawable(android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg), getDrawable(android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha)
            });
        }
        obj = drawable;
        if (!tintDrawableUsingColorFilter(i, drawable))
        {
            obj = drawable;
            if (flag)
            {
                return null;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final ColorStateList getTintList(int i)
    {
        ColorStateList colorstatelist;
        ColorStateList colorstatelist1;
        Context context;
        colorstatelist = null;
        colorstatelist1 = null;
        context = (Context)mContextRef.get();
        if (context != null) goto _L2; else goto _L1
_L1:
        return colorstatelist1;
_L2:
        if (mTintLists != null)
        {
            colorstatelist = (ColorStateList)mTintLists.get(i);
        }
        colorstatelist1 = colorstatelist;
        if (colorstatelist != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i != android.support.v7.appcompat.R.drawable.abc_edit_text_material)
        {
            break; /* Loop/switch isn't completed */
        }
        colorstatelist = createEditTextColorStateList(context);
_L4:
        colorstatelist1 = colorstatelist;
        if (colorstatelist != null)
        {
            if (mTintLists == null)
            {
                mTintLists = new SparseArray();
            }
            mTintLists.append(i, colorstatelist);
            return colorstatelist;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
        {
            colorstatelist = createSwitchTrackColorStateList(context);
        } else
        if (i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
        {
            colorstatelist = createSwitchThumbColorStateList(context);
        } else
        if (i == android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape || i == android.support.v7.appcompat.R.drawable.abc_btn_borderless_material)
        {
            colorstatelist = createButtonColorStateList(context);
        } else
        if (i == android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha || i == android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material)
        {
            colorstatelist = createSpinnerColorStateList(context);
        } else
        if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
        {
            colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        } else
        if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
        {
            colorstatelist = getDefaultColorStateList(context);
        } else
        if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
        {
            colorstatelist = createCheckableButtonColorStateList(context);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    final android.graphics.PorterDuff.Mode getTintMode(int i)
    {
        android.graphics.PorterDuff.Mode mode = null;
        if (i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
        {
            mode = android.graphics.PorterDuff.Mode.MULTIPLY;
        }
        return mode;
    }

    public final boolean tintDrawableUsingColorFilter(int i, Drawable drawable)
    {
        Context context = (Context)mContextRef.get();
        if (context != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        android.graphics.PorterDuff.Mode mode;
        Object obj;
        int j;
        boolean flag;
        int k;
        obj = null;
        flag = false;
        j = 0;
        k = -1;
        if (!arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i))
        {
            break; /* Loop/switch isn't completed */
        }
        j = android.support.v7.appcompat.R.attr.colorControlNormal;
        flag = true;
        mode = obj;
_L4:
        if (flag)
        {
            setPorterDuffColorFilter(drawable, ThemeUtils.getThemeAttrColor(context, j), mode);
            if (k != -1)
            {
                drawable.setAlpha(k);
            }
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i))
        {
            j = android.support.v7.appcompat.R.attr.colorControlActivated;
            flag = true;
            mode = obj;
        } else
        if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i))
        {
            j = 0x1010031;
            flag = true;
            mode = android.graphics.PorterDuff.Mode.MULTIPLY;
        } else
        {
            mode = obj;
            if (i == android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
            {
                j = 0x1010030;
                flag = true;
                k = Math.round(40.8F);
                mode = obj;
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
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
        SHOULD_BE_USED = flag;
        DEFAULT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
        COLORFILTER_TINT_COLOR_CONTROL_NORMAL = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_textfield_search_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha
        });
        TINT_COLOR_CONTROL_NORMAL = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_go_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_clear_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_cut_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_paste_mtrl_am_alpha, 
            android.support.v7.appcompat.R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_voice_search_api_mtrl_alpha
        });
        COLORFILTER_COLOR_CONTROL_ACTIVATED = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_text_cursor_mtrl_alpha
        });
        COLORFILTER_COLOR_BACKGROUND_MULTIPLY = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_popup_background_mtrl_mult, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg, android.support.v7.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult
        });
        TINT_COLOR_CONTROL_STATE_LIST = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_edit_text_material, android.support.v7.appcompat.R.drawable.abc_tab_indicator_material, android.support.v7.appcompat.R.drawable.abc_textfield_search_material, android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material, android.support.v7.appcompat.R.drawable.abc_ratingbar_full_material, android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_switch_thumb_material, android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape, android.support.v7.appcompat.R.drawable.abc_btn_borderless_material
        });
        TINT_CHECKABLE_BUTTON_LIST = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_btn_check_material, android.support.v7.appcompat.R.drawable.abc_btn_radio_material
        });
    }
}
