// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.LruCache;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
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
    private static final boolean DEBUG = false;
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
    private static final WeakHashMap INSTANCE_CACHE = new WeakHashMap();
    public static final boolean SHOULD_BE_USED;
    private static final String TAG = "TintManager";
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
        boolean flag1 = false;
        int k = ai.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < k)
                {
                    if (ai[j] != i)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    private ColorStateList createButtonColorStateList(Context context, int i)
    {
        i = ThemeUtils.getThemeAttrColor(context, i);
        int l = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlHighlight);
        int ai[] = ThemeUtils.DISABLED_STATE_SET;
        int j = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal);
        context = ThemeUtils.PRESSED_STATE_SET;
        int k = ColorUtils.compositeColors(l, i);
        int ai1[] = ThemeUtils.FOCUSED_STATE_SET;
        l = ColorUtils.compositeColors(l, i);
        return new ColorStateList(new int[][] {
            ai, context, ai1, ThemeUtils.EMPTY_STATE_SET
        }, new int[] {
            j, k, l, i
        });
    }

    private ColorStateList createCheckableButtonColorStateList(Context context)
    {
        int ai[] = ThemeUtils.DISABLED_STATE_SET;
        int i = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int ai1[] = ThemeUtils.CHECKED_STATE_SET;
        int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        int ai2[] = ThemeUtils.EMPTY_STATE_SET;
        int k = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        return new ColorStateList(new int[][] {
            ai, ai1, ai2
        }, new int[] {
            i, j, k
        });
    }

    private ColorStateList createColoredButtonColorStateList(Context context)
    {
        return createButtonColorStateList(context, android.support.v7.appcompat.R.attr.colorAccent);
    }

    private ColorStateList createDefaultButtonColorStateList(Context context)
    {
        return createButtonColorStateList(context, android.support.v7.appcompat.R.attr.colorButtonNormal);
    }

    private ColorStateList createEditTextColorStateList(Context context)
    {
        int ai[] = ThemeUtils.DISABLED_STATE_SET;
        int i = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int ai1[] = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
        int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int ai2[] = ThemeUtils.EMPTY_STATE_SET;
        int k = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        return new ColorStateList(new int[][] {
            ai, ai1, ai2
        }, new int[] {
            i, j, k
        });
    }

    private ColorStateList createSeekbarThumbColorStateList(Context context)
    {
        int ai[] = ThemeUtils.DISABLED_STATE_SET;
        int i = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        int ai1[] = ThemeUtils.EMPTY_STATE_SET;
        int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        return new ColorStateList(new int[][] {
            ai, ai1
        }, new int[] {
            i, j
        });
    }

    private ColorStateList createSpinnerColorStateList(Context context)
    {
        int ai[] = ThemeUtils.DISABLED_STATE_SET;
        int i = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int ai1[] = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
        int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int ai2[] = ThemeUtils.EMPTY_STATE_SET;
        int k = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        return new ColorStateList(new int[][] {
            ai, ai1, ai2
        }, new int[] {
            i, j, k
        });
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
            ai[1] = ThemeUtils.CHECKED_STATE_SET;
            ai1[1] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
            ai[2] = ThemeUtils.EMPTY_STATE_SET;
            ai1[2] = colorstatelist.getDefaultColor();
        } else
        {
            ai[0] = ThemeUtils.DISABLED_STATE_SET;
            ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
            ai[1] = ThemeUtils.CHECKED_STATE_SET;
            ai1[1] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
            ai[2] = ThemeUtils.EMPTY_STATE_SET;
            ai1[2] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
        }
        return new ColorStateList(ai, ai1);
    }

    private ColorStateList createSwitchTrackColorStateList(Context context)
    {
        int ai[] = ThemeUtils.DISABLED_STATE_SET;
        int i = ThemeUtils.getThemeAttrColor(context, 0x1010030, 0.1F);
        int ai1[] = ThemeUtils.CHECKED_STATE_SET;
        int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated, 0.3F);
        int ai2[] = ThemeUtils.EMPTY_STATE_SET;
        int k = ThemeUtils.getThemeAttrColor(context, 0x1010030, 0.3F);
        return new ColorStateList(new int[][] {
            ai, ai1, ai2
        }, new int[] {
            i, j, k
        });
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int ai[])
    {
        if (colorstatelist == null || mode == null)
        {
            return null;
        } else
        {
            return getPorterDuffColorFilter(colorstatelist.getColorForState(ai, 0), mode);
        }
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
            int ai[] = ThemeUtils.DISABLED_STATE_SET;
            int k = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
            mDefaultColorStateList = new ColorStateList(new int[][] {
                ai, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.ACTIVATED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.CHECKED_STATE_SET, ThemeUtils.SELECTED_STATE_SET, ThemeUtils.EMPTY_STATE_SET
            }, new int[] {
                k, j, j, j, j, j, i
            });
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

    private static PorterDuffColorFilter getPorterDuffColorFilter(int i, android.graphics.PorterDuff.Mode mode)
    {
        PorterDuffColorFilter porterduffcolorfilter1 = COLOR_FILTER_CACHE.get(i, mode);
        PorterDuffColorFilter porterduffcolorfilter = porterduffcolorfilter1;
        if (porterduffcolorfilter1 == null)
        {
            porterduffcolorfilter = new PorterDuffColorFilter(i, mode);
            COLOR_FILTER_CACHE.put(i, mode, porterduffcolorfilter);
        }
        return porterduffcolorfilter;
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
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode1));
    }

    private static boolean shouldMutateBackground(Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (drawable instanceof LayerDrawable)
        {
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }
        if (!(drawable instanceof InsetDrawable))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        if (!(drawable instanceof DrawableContainer)) goto _L1; else goto _L3
_L3:
        drawable = drawable.getConstantState();
        if (drawable instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)
        {
            drawable = ((android.graphics.drawable.DrawableContainer.DrawableContainerState)drawable).getChildren();
            int j = drawable.length;
            int i = 0;
            while (i < j) 
            {
                if (!shouldMutateBackground(drawable[i]))
                {
                    return false;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintinfo, int ai[])
    {
        if (shouldMutateBackground(drawable) && drawable.mutate() != drawable)
        {
            Log.d("TintManager", "Mutated drawable is not the same instance as the input.");
        } else
        {
            if (tintinfo.mHasTintList || tintinfo.mHasTintMode)
            {
                ColorStateList colorstatelist;
                if (tintinfo.mHasTintList)
                {
                    colorstatelist = tintinfo.mTintList;
                } else
                {
                    colorstatelist = null;
                }
                if (tintinfo.mHasTintMode)
                {
                    tintinfo = tintinfo.mTintMode;
                } else
                {
                    tintinfo = DEFAULT_MODE;
                }
                drawable.setColorFilter(createTintFilter(colorstatelist, tintinfo, ai));
            } else
            {
                drawable.clearColorFilter();
            }
            if (android.os.Build.VERSION.SDK_INT <= 10)
            {
                drawable.invalidateSelf();
                return;
            }
        }
    }

    public Drawable getDrawable(int i)
    {
        return getDrawable(i, false);
    }

    public Drawable getDrawable(int i, boolean flag)
    {
        Object obj;
        Drawable drawable1;
        Context context;
        context = (Context)mContextRef.get();
        if (context == null)
        {
            return null;
        }
        drawable1 = ContextCompat.getDrawable(context, i);
        obj = drawable1;
        if (drawable1 == null) goto _L2; else goto _L1
_L1:
        Drawable drawable;
        drawable = drawable1;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            drawable = drawable1.mutate();
        }
        obj = getTintList(i);
        if (obj == null) goto _L4; else goto _L3
_L3:
        drawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(drawable, ((ColorStateList) (obj)));
        android.graphics.PorterDuff.Mode mode = getTintMode(i);
        obj = drawable;
        if (mode != null)
        {
            DrawableCompat.setTintMode(drawable, mode);
            obj = drawable;
        }
_L2:
        return ((Drawable) (obj));
_L4:
        if (i == android.support.v7.appcompat.R.drawable.abc_cab_background_top_material)
        {
            return new LayerDrawable(new Drawable[] {
                getDrawable(android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg), getDrawable(android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha)
            });
        }
        if (i == android.support.v7.appcompat.R.drawable.abc_seekbar_track_material)
        {
            obj = (LayerDrawable)drawable;
            setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
            obj = drawable;
        } else
        {
            obj = drawable;
            if (!tintDrawableUsingColorFilter(i, drawable))
            {
                obj = drawable;
                if (flag)
                {
                    obj = null;
                }
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final ColorStateList getTintList(int i)
    {
        ColorStateList colorstatelist = null;
        Object obj = (Context)mContextRef.get();
        if (obj == null)
        {
            obj = null;
        } else
        {
            if (mTintLists != null)
            {
                colorstatelist = (ColorStateList)mTintLists.get(i);
            }
            if (colorstatelist == null)
            {
                if (i == android.support.v7.appcompat.R.drawable.abc_edit_text_material)
                {
                    colorstatelist = createEditTextColorStateList(((Context) (obj)));
                } else
                if (i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
                {
                    colorstatelist = createSwitchTrackColorStateList(((Context) (obj)));
                } else
                if (i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
                {
                    colorstatelist = createSwitchThumbColorStateList(((Context) (obj)));
                } else
                if (i == android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape || i == android.support.v7.appcompat.R.drawable.abc_btn_borderless_material)
                {
                    colorstatelist = createDefaultButtonColorStateList(((Context) (obj)));
                } else
                if (i == android.support.v7.appcompat.R.drawable.abc_btn_colored_material)
                {
                    colorstatelist = createColoredButtonColorStateList(((Context) (obj)));
                } else
                if (i == android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha || i == android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material)
                {
                    colorstatelist = createSpinnerColorStateList(((Context) (obj)));
                } else
                if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
                {
                    colorstatelist = ThemeUtils.getThemeAttrColorStateList(((Context) (obj)), android.support.v7.appcompat.R.attr.colorControlNormal);
                } else
                if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
                {
                    colorstatelist = getDefaultColorStateList(((Context) (obj)));
                } else
                if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
                {
                    colorstatelist = createCheckableButtonColorStateList(((Context) (obj)));
                } else
                if (i == android.support.v7.appcompat.R.drawable.abc_seekbar_thumb_material)
                {
                    colorstatelist = createSeekbarThumbColorStateList(((Context) (obj)));
                }
                obj = colorstatelist;
                if (colorstatelist != null)
                {
                    if (mTintLists == null)
                    {
                        mTintLists = new SparseArray();
                    }
                    mTintLists.append(i, colorstatelist);
                    return colorstatelist;
                }
            } else
            {
                return colorstatelist;
            }
        }
        return ((ColorStateList) (obj));
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
        if (context == null)
        {
            return false;
        }
        android.graphics.PorterDuff.Mode mode = DEFAULT_MODE;
        int j;
        boolean flag;
        if (arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i))
        {
            j = android.support.v7.appcompat.R.attr.colorControlNormal;
            flag = true;
            i = -1;
        } else
        if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i))
        {
            j = android.support.v7.appcompat.R.attr.colorControlActivated;
            flag = true;
            i = -1;
        } else
        if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i))
        {
            mode = android.graphics.PorterDuff.Mode.MULTIPLY;
            flag = true;
            j = 0x1010031;
            i = -1;
        } else
        if (i == android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
        {
            j = 0x1010030;
            i = Math.round(40.8F);
            flag = true;
        } else
        {
            i = -1;
            j = 0;
            flag = false;
        }
        if (flag)
        {
            drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, j), mode));
            if (i != -1)
            {
                drawable.setAlpha(i);
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
            android.support.v7.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_text_cursor_material
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
