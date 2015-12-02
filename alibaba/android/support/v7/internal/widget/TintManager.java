// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ar;
import cf;

// Referenced classes of package android.support.v7.internal.widget:
//            TintResources, TintDrawableWrapper

public class TintManager
{
    static class ColorFilterLruCache extends cf
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


    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final int CONTAINERS_WITH_TINT_CHILDREN[];
    private static final boolean DEBUG = false;
    static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
    private static final String TAG = android/support/v7/internal/widget/TintManager.getSimpleName();
    private static final int TINT_COLOR_BACKGROUND_MULTIPLY[];
    private static final int TINT_COLOR_CONTROL_ACTIVATED[];
    private static final int TINT_COLOR_CONTROL_NORMAL[];
    private static final int TINT_COLOR_CONTROL_STATE_LIST[];
    private final Context mContext;
    private ColorStateList mDefaultColorStateList;
    private final Resources mResources;
    private ColorStateList mSwitchThumbStateList;
    private ColorStateList mSwitchTrackStateList;
    private final TypedValue mTypedValue = new TypedValue();

    public TintManager(Context context)
    {
        mContext = context;
        mResources = new TintResources(context.getResources(), this);
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

    private ColorStateList getDefaultColorStateList()
    {
        if (mDefaultColorStateList == null)
        {
            int i = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlNormal);
            int j = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlActivated);
            int ai[] = {
                0xfefeff62
            };
            int k = getDisabledThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlNormal);
            int ai1[] = {
                0x10102fe
            };
            int ai2[] = {
                0x10100a7
            };
            int ai3[] = {
                0x10100a0
            };
            int ai4[] = {
                0x10100a1
            };
            int ai5[] = new int[0];
            mDefaultColorStateList = new ColorStateList(new int[][] {
                ai, new int[] {
                    0x101009c
                }, ai1, ai2, ai3, ai4, ai5
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
            return (new TintManager(context)).getDrawable(i);
        } else
        {
            return ar.a(context, i);
        }
    }

    private ColorStateList getSwitchThumbColorStateList()
    {
        if (mSwitchThumbStateList == null)
        {
            int i = getDisabledThemeAttrColor(android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
            int ai[] = {
                0x10100a0
            };
            int j = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlActivated);
            int k = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
            mSwitchThumbStateList = new ColorStateList(new int[][] {
                new int[] {
                    0xfefeff62
                }, ai, new int[0]
            }, new int[] {
                i, j, k
            });
        }
        return mSwitchThumbStateList;
    }

    private ColorStateList getSwitchTrackColorStateList()
    {
        if (mSwitchTrackStateList == null)
        {
            int ai[] = {
                0xfefeff62
            };
            int i = getThemeAttrColor(0x1010030, 0.1F);
            int ai1[] = {
                0x10100a0
            };
            int j = getThemeAttrColor(android.support.v7.appcompat.R.attr.colorControlActivated, 0.3F);
            int ai2[] = new int[0];
            int k = getThemeAttrColor(0x1010030, 0.3F);
            mSwitchTrackStateList = new ColorStateList(new int[][] {
                ai, ai1, ai2
            }, new int[] {
                i, j, k
            });
        }
        return mSwitchTrackStateList;
    }

    private static boolean isInTintList(int i)
    {
        return arrayContains(TINT_COLOR_BACKGROUND_MULTIPLY, i) || arrayContains(TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(TINT_COLOR_CONTROL_ACTIVATED, i) || arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i) || arrayContains(CONTAINERS_WITH_TINT_CHILDREN, i);
    }

    int getDisabledThemeAttrColor(int i)
    {
        mContext.getTheme().resolveAttribute(0x1010033, mTypedValue, true);
        return getThemeAttrColor(i, mTypedValue.getFloat());
    }

    public Drawable getDrawable(int i)
    {
        Drawable drawable = ar.a(mContext, i);
        if (drawable != null)
        {
            if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
            {
                return new TintDrawableWrapper(drawable, getDefaultColorStateList());
            }
            if (i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
            {
                return new TintDrawableWrapper(drawable, getSwitchTrackColorStateList());
            }
            if (i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
            {
                return new TintDrawableWrapper(drawable, getSwitchThumbColorStateList(), android.graphics.PorterDuff.Mode.MULTIPLY);
            }
            if (arrayContains(CONTAINERS_WITH_TINT_CHILDREN, i))
            {
                return mResources.getDrawable(i);
            }
            tintDrawable(i, drawable);
        }
        return drawable;
    }

    int getThemeAttrColor(int i)
    {
        if (mContext.getTheme().resolveAttribute(i, mTypedValue, true))
        {
            if (mTypedValue.type >= 16 && mTypedValue.type <= 31)
            {
                return mTypedValue.data;
            }
            if (mTypedValue.type == 3)
            {
                return mResources.getColor(mTypedValue.resourceId);
            }
        }
        return 0;
    }

    int getThemeAttrColor(int i, float f)
    {
        i = getThemeAttrColor(i);
        return i & 0xffffff | Math.round((float)Color.alpha(i) * f) << 24;
    }

    void tintDrawable(int i, Drawable drawable)
    {
        Object obj;
        int j;
        boolean flag;
        if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
        {
            i = android.support.v7.appcompat.R.attr.colorControlNormal;
            obj = null;
            flag = true;
            j = -1;
        } else
        if (arrayContains(TINT_COLOR_CONTROL_ACTIVATED, i))
        {
            i = android.support.v7.appcompat.R.attr.colorControlActivated;
            obj = null;
            flag = true;
            j = -1;
        } else
        if (arrayContains(TINT_COLOR_BACKGROUND_MULTIPLY, i))
        {
            obj = android.graphics.PorterDuff.Mode.MULTIPLY;
            flag = true;
            j = -1;
            i = 0x1010031;
        } else
        if (i == android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
        {
            i = 0x1010030;
            j = Math.round(40.8F);
            obj = null;
            flag = true;
        } else
        {
            j = -1;
            i = 0;
            obj = null;
            flag = false;
        }
        if (flag)
        {
            android.graphics.PorterDuff.Mode mode = ((android.graphics.PorterDuff.Mode) (obj));
            if (obj == null)
            {
                mode = DEFAULT_MODE;
            }
            i = getThemeAttrColor(i);
            obj = COLOR_FILTER_CACHE.get(i, mode);
            if (obj == null)
            {
                obj = new PorterDuffColorFilter(i, mode);
                COLOR_FILTER_CACHE.put(i, mode, ((PorterDuffColorFilter) (obj)));
            }
            drawable.setColorFilter(((android.graphics.ColorFilter) (obj)));
            if (j != -1)
            {
                drawable.setAlpha(j);
            }
        }
    }

    static 
    {
        DEFAULT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
        TINT_COLOR_CONTROL_NORMAL = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_go_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_clear_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_cut_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_paste_mtrl_am_alpha, 
            android.support.v7.appcompat.R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_voice_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_default_mtrl_alpha
        });
        TINT_COLOR_CONTROL_ACTIVATED = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha
        });
        TINT_COLOR_BACKGROUND_MULTIPLY = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_popup_background_mtrl_mult, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg, android.support.v7.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult
        });
        TINT_COLOR_CONTROL_STATE_LIST = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_edit_text_material, android.support.v7.appcompat.R.drawable.abc_tab_indicator_material, android.support.v7.appcompat.R.drawable.abc_textfield_search_material, android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_btn_check_material, android.support.v7.appcompat.R.drawable.abc_btn_radio_material
        });
        CONTAINERS_WITH_TINT_CHILDREN = (new int[] {
            android.support.v7.appcompat.R.drawable.abc_cab_background_top_material
        });
    }
}
