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
import java.util.ArrayList;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            ThemeUtils, TintInfo

public final class AppCompatDrawableManager
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

    public static interface InflateDelegate
    {

        public abstract Drawable onInflateDrawable(Context context, int i);
    }


    private static final int COLORFILTER_COLOR_BACKGROUND_MULTIPLY[];
    private static final int COLORFILTER_COLOR_CONTROL_ACTIVATED[];
    private static final int COLORFILTER_TINT_COLOR_CONTROL_NORMAL[];
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final boolean DEBUG = false;
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
    private static AppCompatDrawableManager INSTANCE;
    private static final String TAG = "TintManager";
    private static final int TINT_CHECKABLE_BUTTON_LIST[];
    private static final int TINT_COLOR_CONTROL_NORMAL[];
    private static final int TINT_COLOR_CONTROL_STATE_LIST[];
    private ArrayList mDelegates;
    private WeakHashMap mTintLists;

    public AppCompatDrawableManager()
    {
    }

    private void addTintListToCache(Context context, int i, ColorStateList colorstatelist)
    {
        if (mTintLists == null)
        {
            mTintLists = new WeakHashMap();
        }
        SparseArray sparsearray1 = (SparseArray)mTintLists.get(context);
        SparseArray sparsearray = sparsearray1;
        if (sparsearray1 == null)
        {
            sparsearray = new SparseArray();
            mTintLists.put(context, sparsearray);
        }
        sparsearray.append(i, colorstatelist);
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

    private ColorStateList createDefaultColorStateList(Context context)
    {
        int i = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
        int ai[] = ThemeUtils.DISABLED_STATE_SET;
        int k = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal);
        return new ColorStateList(new int[][] {
            ai, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.ACTIVATED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.CHECKED_STATE_SET, ThemeUtils.SELECTED_STATE_SET, ThemeUtils.EMPTY_STATE_SET
        }, new int[] {
            k, j, j, j, j, j, i
        });
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

    public static AppCompatDrawableManager get()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new AppCompatDrawableManager();
        }
        return INSTANCE;
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

    private ColorStateList getTintListFromCache(Context context, int i)
    {
        if (mTintLists != null)
        {
            context = (SparseArray)mTintLists.get(context);
            if (context != null)
            {
                return (ColorStateList)context.get(i);
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
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

    public void addDelegate(InflateDelegate inflatedelegate)
    {
        if (mDelegates == null)
        {
            mDelegates = new ArrayList();
        }
        if (!mDelegates.contains(inflatedelegate))
        {
            mDelegates.add(inflatedelegate);
        }
    }

    public Drawable getDrawable(Context context, int i)
    {
        return getDrawable(context, i, false);
    }

    public Drawable getDrawable(Context context, int i, boolean flag)
    {
        if (mDelegates == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = mDelegates.size();
        j = 0;
_L10:
        if (j >= k) goto _L2; else goto _L3
_L3:
        Object obj = ((InflateDelegate)mDelegates.get(j)).onInflateDrawable(context, i);
        if (obj == null) goto _L5; else goto _L4
_L4:
        return ((Drawable) (obj));
_L5:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        Object obj1;
        Drawable drawable = ContextCompat.getDrawable(context, i);
        obj = drawable;
        if (drawable == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = drawable;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj1 = drawable.mutate();
        }
        obj = getTintList(context, i);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = DrawableCompat.wrap(((Drawable) (obj1)));
        DrawableCompat.setTintList(context, ((ColorStateList) (obj)));
        obj1 = getTintMode(i);
        obj = context;
        if (obj1 != null)
        {
            DrawableCompat.setTintMode(context, ((android.graphics.PorterDuff.Mode) (obj1)));
            return context;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (i == android.support.v7.appcompat.R.drawable.abc_cab_background_top_material)
        {
            return new LayerDrawable(new Drawable[] {
                getDrawable(context, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg), getDrawable(context, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha)
            });
        }
        if (i == android.support.v7.appcompat.R.drawable.abc_seekbar_track_material)
        {
            obj = (LayerDrawable)obj1;
            setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
            return ((Drawable) (obj1));
        }
        obj = obj1;
        if (tintDrawableUsingColorFilter(context, i, ((Drawable) (obj1)))) goto _L4; else goto _L7
_L7:
        obj = obj1;
        if (!flag) goto _L4; else goto _L8
_L8:
        return null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final ColorStateList getTintList(Context context, int i)
    {
        ColorStateList colorstatelist;
        ColorStateList colorstatelist1;
        colorstatelist = getTintListFromCache(context, i);
        colorstatelist1 = colorstatelist;
        if (colorstatelist != null) goto _L2; else goto _L1
_L1:
        if (i != android.support.v7.appcompat.R.drawable.abc_edit_text_material) goto _L4; else goto _L3
_L3:
        colorstatelist = createEditTextColorStateList(context);
_L6:
        colorstatelist1 = colorstatelist;
        if (colorstatelist != null)
        {
            addTintListToCache(context, i, colorstatelist);
            colorstatelist1 = colorstatelist;
        }
_L2:
        return colorstatelist1;
_L4:
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
            colorstatelist = createDefaultButtonColorStateList(context);
        } else
        if (i == android.support.v7.appcompat.R.drawable.abc_btn_colored_material)
        {
            colorstatelist = createColoredButtonColorStateList(context);
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
            colorstatelist = createDefaultColorStateList(context);
        } else
        if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
        {
            colorstatelist = createCheckableButtonColorStateList(context);
        } else
        if (i == android.support.v7.appcompat.R.drawable.abc_seekbar_thumb_material)
        {
            colorstatelist = createSeekbarThumbColorStateList(context);
        }
        if (true) goto _L6; else goto _L5
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

    public void removeDelegate(InflateDelegate inflatedelegate)
    {
        if (mDelegates != null)
        {
            mDelegates.remove(inflatedelegate);
        }
    }

    public final boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable)
    {
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
