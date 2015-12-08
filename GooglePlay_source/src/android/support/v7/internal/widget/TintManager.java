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
//            TintInfo, ThemeUtils

public final class TintManager
{
    private static final class ColorFilterLruCache extends LruCache
    {

        static int generateCacheKey(int i, android.graphics.PorterDuff.Mode mode)
        {
            return (i + 31) * 31 + mode.hashCode();
        }

        public ColorFilterLruCache()
        {
            super(6);
        }
    }


    private static final int COLORFILTER_COLOR_BACKGROUND_MULTIPLY[] = {
        0x7f02002e, 0x7f02000e, 0x7f02002d
    };
    private static final int COLORFILTER_COLOR_CONTROL_ACTIVATED[] = {
        0x7f020037, 0x7f020039, 0x7f020010, 0x7f020036
    };
    private static final int COLORFILTER_TINT_COLOR_CONTROL_NORMAL[] = {
        0x7f02003a, 0x7f020038, 0x7f020001
    };
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache();
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
    private static final WeakHashMap INSTANCE_CACHE = new WeakHashMap();
    public static final boolean SHOULD_BE_USED;
    private static final int TINT_CHECKABLE_BUTTON_LIST[] = {
        0x7f020003, 0x7f020007
    };
    private static final int TINT_COLOR_CONTROL_NORMAL[] = {
        0x7f020014, 0x7f020017, 0x7f02001e, 0x7f020016, 0x7f020015, 0x7f02001d, 0x7f020018, 0x7f020019, 0x7f02001c, 0x7f02001b, 
        0x7f02001a, 0x7f02001f
    };
    private static final int TINT_COLOR_CONTROL_STATE_LIST[] = {
        0x7f020013, 0x7f020034, 0x7f02003b, 0x7f020030, 0x7f020031, 0x7f02002f, 0x7f020033, 0x7f020032, 0x7f020006, 0x7f020002
    };
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

    public static Drawable getDrawable(Context context, int i)
    {
        boolean flag;
        if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i) || arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i) || arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i) || arrayContains(TINT_CHECKABLE_BUTTON_LIST, i) || i == 0x7f02000f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return get(context).getDrawable(i, false);
        } else
        {
            return ContextCompat.getDrawable(context, i);
        }
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, android.graphics.PorterDuff.Mode mode)
    {
        android.graphics.PorterDuff.Mode mode1 = mode;
        if (mode == null)
        {
            mode1 = DEFAULT_MODE;
        }
        PorterDuffColorFilter porterduffcolorfilter = (PorterDuffColorFilter)COLOR_FILTER_CACHE.get(Integer.valueOf(ColorFilterLruCache.generateCacheKey(i, mode1)));
        mode = porterduffcolorfilter;
        if (porterduffcolorfilter == null)
        {
            mode = new PorterDuffColorFilter(i, mode1);
            COLOR_FILTER_CACHE.put(Integer.valueOf(ColorFilterLruCache.generateCacheKey(i, mode1)), mode);
        }
        drawable.setColorFilter(mode);
    }

    public static void tintViewBackground(View view, TintInfo tintinfo)
    {
        Drawable drawable = view.getBackground();
        if (tintinfo.mHasTintList)
        {
            setPorterDuffColorFilter(drawable, tintinfo.mTintList.getColorForState(view.getDrawableState(), tintinfo.mTintList.getDefaultColor()), null);
        } else
        {
            drawable.clearColorFilter();
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            view.invalidate();
        }
    }

    public final Drawable getDrawable(int i, boolean flag)
    {
        Object obj = (Context)mContextRef.get();
        if (obj == null)
        {
            obj = null;
        } else
        {
            Drawable drawable = ContextCompat.getDrawable(((Context) (obj)), i);
            obj = drawable;
            if (drawable != null)
            {
                Object obj1 = drawable;
                if (android.os.Build.VERSION.SDK_INT >= 8)
                {
                    obj1 = drawable.mutate();
                }
                obj = getTintList(i);
                if (obj != null)
                {
                    Drawable drawable1 = DrawableCompat.wrap(((Drawable) (obj1)));
                    DrawableCompat.setTintList(drawable1, ((ColorStateList) (obj)));
                    if (i == 0x7f020032)
                    {
                        obj1 = android.graphics.PorterDuff.Mode.MULTIPLY;
                    } else
                    {
                        obj1 = null;
                    }
                    obj = drawable1;
                    if (obj1 != null)
                    {
                        DrawableCompat.setTintMode(drawable1, ((android.graphics.PorterDuff.Mode) (obj1)));
                        return drawable1;
                    }
                }
            }
            while (false) 
            {
                if (i == 0x7f02000f)
                {
                    return new LayerDrawable(new Drawable[] {
                        getDrawable(0x7f02000e, false), getDrawable(0x7f020010, false)
                    });
                }
                obj = obj1;
                if (tintDrawableUsingColorFilter(i, ((Drawable) (obj1))))
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

    public final ColorStateList getTintList(int i)
    {
        Context context = (Context)mContextRef.get();
        if (context != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return ((ColorStateList) (obj1));
_L2:
        Object obj;
        int ai5[];
        int j;
        int l1;
        int j3;
        if (mTintLists != null)
        {
            obj = (ColorStateList)mTintLists.get(i);
        } else
        {
            obj = null;
        }
        obj1 = obj;
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0x7f020013)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ThemeUtils.DISABLED_STATE_SET;
        j = ThemeUtils.getDisabledThemeAttrColor(context, 0x7f01013f);
        obj1 = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
        l1 = ThemeUtils.getThemeAttrColor(context, 0x7f01013f);
        ai5 = ThemeUtils.EMPTY_STATE_SET;
        j3 = ThemeUtils.getThemeAttrColor(context, 0x7f010140);
        obj = new ColorStateList(new int[][] {
            obj, obj1, ai5
        }, new int[] {
            j, l1, j3
        });
_L5:
        obj1 = obj;
        if (obj != null)
        {
            if (mTintLists == null)
            {
                mTintLists = new SparseArray();
            }
            mTintLists.append(i, obj);
            return ((ColorStateList) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i == 0x7f020033)
        {
            obj = ThemeUtils.DISABLED_STATE_SET;
            int k = ThemeUtils.getThemeAttrColor(context, 0x1010030, 0.1F);
            int ai[] = ThemeUtils.CHECKED_STATE_SET;
            int i2 = ThemeUtils.getThemeAttrColor(context, 0x7f010140, 0.3F);
            int ai6[] = ThemeUtils.EMPTY_STATE_SET;
            int k3 = ThemeUtils.getThemeAttrColor(context, 0x1010030, 0.3F);
            obj = new ColorStateList(new int[][] {
                obj, ai, ai6
            }, new int[] {
                k, i2, k3
            });
        } else
        if (i == 0x7f020032)
        {
            obj = new int[3][];
            int ai1[] = new int[3];
            ColorStateList colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, 0x7f010143);
            if (colorstatelist != null && colorstatelist.isStateful())
            {
                obj[0] = ThemeUtils.DISABLED_STATE_SET;
                ai1[0] = colorstatelist.getColorForState(obj[0], 0);
                obj[1] = ThemeUtils.CHECKED_STATE_SET;
                ai1[1] = ThemeUtils.getThemeAttrColor(context, 0x7f010140);
                obj[2] = ThemeUtils.EMPTY_STATE_SET;
                ai1[2] = colorstatelist.getDefaultColor();
            } else
            {
                obj[0] = ThemeUtils.DISABLED_STATE_SET;
                ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, 0x7f010143);
                obj[1] = ThemeUtils.CHECKED_STATE_SET;
                ai1[1] = ThemeUtils.getThemeAttrColor(context, 0x7f010140);
                obj[2] = ThemeUtils.EMPTY_STATE_SET;
                ai1[2] = ThemeUtils.getThemeAttrColor(context, 0x7f010143);
            }
            obj = new ColorStateList(((int [][]) (obj)), ai1);
        } else
        if (i == 0x7f020006 || i == 0x7f020002)
        {
            int l = ThemeUtils.getThemeAttrColor(context, 0x7f010142);
            int l4 = ThemeUtils.getThemeAttrColor(context, 0x7f010141);
            obj = ThemeUtils.DISABLED_STATE_SET;
            int j2 = ThemeUtils.getDisabledThemeAttrColor(context, 0x7f010142);
            int ai2[] = ThemeUtils.PRESSED_STATE_SET;
            int l3 = ColorUtils.compositeColors(l4, l);
            context = ThemeUtils.FOCUSED_STATE_SET;
            l4 = ColorUtils.compositeColors(l4, l);
            obj = new ColorStateList(new int[][] {
                obj, ai2, context, ThemeUtils.EMPTY_STATE_SET
            }, new int[] {
                j2, l3, l4, l
            });
        } else
        if (i == 0x7f020030 || i == 0x7f020031)
        {
            obj = ThemeUtils.DISABLED_STATE_SET;
            int i1 = ThemeUtils.getDisabledThemeAttrColor(context, 0x7f01013f);
            int ai3[] = ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET;
            int k2 = ThemeUtils.getThemeAttrColor(context, 0x7f01013f);
            int ai7[] = ThemeUtils.EMPTY_STATE_SET;
            int i4 = ThemeUtils.getThemeAttrColor(context, 0x7f010140);
            obj = new ColorStateList(new int[][] {
                obj, ai3, ai7
            }, new int[] {
                i1, k2, i4
            });
        } else
        if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
        {
            obj = ThemeUtils.getThemeAttrColorStateList(context, 0x7f01013f);
        } else
        if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
        {
            if (mDefaultColorStateList == null)
            {
                int j1 = ThemeUtils.getThemeAttrColor(context, 0x7f01013f);
                int l2 = ThemeUtils.getThemeAttrColor(context, 0x7f010140);
                obj = ThemeUtils.DISABLED_STATE_SET;
                int j4 = ThemeUtils.getDisabledThemeAttrColor(context, 0x7f01013f);
                mDefaultColorStateList = new ColorStateList(new int[][] {
                    obj, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.ACTIVATED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.CHECKED_STATE_SET, ThemeUtils.SELECTED_STATE_SET, ThemeUtils.EMPTY_STATE_SET
                }, new int[] {
                    j4, l2, l2, l2, l2, l2, j1
                });
            }
            obj = mDefaultColorStateList;
        } else
        if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
        {
            obj = ThemeUtils.DISABLED_STATE_SET;
            int k1 = ThemeUtils.getDisabledThemeAttrColor(context, 0x7f01013f);
            int ai4[] = ThemeUtils.CHECKED_STATE_SET;
            int i3 = ThemeUtils.getThemeAttrColor(context, 0x7f010140);
            int ai8[] = ThemeUtils.EMPTY_STATE_SET;
            int k4 = ThemeUtils.getThemeAttrColor(context, 0x7f01013f);
            obj = new ColorStateList(new int[][] {
                obj, ai4, ai8
            }, new int[] {
                k1, i3, k4
            });
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
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
        j = 0x7f01013f;
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
            j = 0x7f010140;
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
            if (i == 0x7f020022)
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
    }
}
