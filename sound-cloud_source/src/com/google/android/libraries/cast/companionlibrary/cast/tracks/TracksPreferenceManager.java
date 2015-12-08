// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.tracks;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.b.aa;
import com.google.android.gms.cast.Q;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import java.util.HashMap;
import java.util.Map;

public class TracksPreferenceManager
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private static final String EDGE_TYPE_DEFAULT = "EDGE_TYPE_NONE";
    private static final Map EDGE_TYPE_MAPPING;
    private static final Map FONT_FAMILY_MAPPING;
    private static final String FONT_FAMILY_SANS_SERIF = "FONT_FAMILY_SANS_SERIF";
    private static final Map OPACITY_MAPPING;
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/tracks/TracksPreferenceManager);
    private boolean isInitialized;
    private CheckBoxPreference mCaptionAvailability;
    private ListPreference mCaptionBackgroundColorListPreference;
    private ListPreference mCaptionBackgroundOpacityListPreference;
    private ListPreference mCaptionEdgeTypeListPreference;
    private ListPreference mCaptionFontFamilyListPreference;
    private ListPreference mCaptionFontScaleListPreference;
    private ListPreference mCaptionTextColorListPreference;
    private ListPreference mCaptionTextOpacityListPreference;
    private final Context mContext;
    private final PreferenceAccessor mPreferenceAccessor = VideoCastManager.getInstance().getPreferenceAccessor();
    private final SharedPreferences mSharedPreferences;

    public TracksPreferenceManager(Context context)
    {
        isInitialized = false;
        mContext = context;
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        mSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    private static int combineColorAndOpacity(String s, String s1)
    {
        s = s.replace("#", "");
        return Color.parseColor((new StringBuilder("#")).append(s1).append(s).toString());
    }

    private String getCaptionSummaryForList(SharedPreferences sharedpreferences, int i, int j, int k, int l)
    {
        Resources resources = mContext.getResources();
        sharedpreferences = sharedpreferences.getString(resources.getString(i), resources.getString(j));
        String as1[] = resources.getStringArray(k);
        String as[] = resources.getStringArray(l);
        for (i = 0; i < as.length; i++)
        {
            if (as[i].equals(sharedpreferences))
            {
                return as1[i];
            }
        }

        return "";
    }

    private void setCaptionAvailability(boolean flag)
    {
        mCaptionFontScaleListPreference.setEnabled(flag);
        mCaptionFontFamilyListPreference.setEnabled(flag);
        mCaptionTextColorListPreference.setEnabled(flag);
        mCaptionTextOpacityListPreference.setEnabled(flag);
        mCaptionEdgeTypeListPreference.setEnabled(flag);
        mCaptionBackgroundColorListPreference.setEnabled(flag);
        mCaptionBackgroundOpacityListPreference.setEnabled(flag);
    }

    public String getBackgroundColor()
    {
        return mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_color), mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_background_color_value_default));
    }

    public String getBackgroundOpacity()
    {
        return mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_opacity), mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_background_opacity_value_default));
    }

    public String getEdgeType()
    {
        return mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_edge_type), "EDGE_TYPE_NONE");
    }

    public String getFontFamily()
    {
        return mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_family), "FONT_FAMILY_SANS_SERIF");
    }

    public float getFontScale()
    {
        return Float.parseFloat(mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_scale), "1.0"));
    }

    public String getTextColor()
    {
        return mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_color), mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_text_color_value_default));
    }

    public String getTextOpacity()
    {
        return mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_opacity), mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_text_opacity_value_default));
    }

    public Q getTextTrackStyle()
    {
        Q q;
        Object obj;
        obj = mContext;
        q = new Q();
        if (!aa.a(19)) goto _L2; else goto _L1
_L1:
        obj = (CaptioningManager)((Context) (obj)).getSystemService("captioning");
        q.a = ((CaptioningManager) (obj)).getFontScale();
        obj = ((CaptioningManager) (obj)).getUserStyle();
        q.c = ((android.view.accessibility.CaptioningManager.CaptionStyle) (obj)).backgroundColor;
        q.b = ((android.view.accessibility.CaptioningManager.CaptionStyle) (obj)).foregroundColor;
        ((android.view.accessibility.CaptioningManager.CaptionStyle) (obj)).edgeType;
        JVM INSTR tableswitch 1 2: default 88
    //                   1 160
    //                   2 168;
           goto _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_168;
_L3:
        q.a(0);
_L6:
        q.e = ((android.view.accessibility.CaptioningManager.CaptionStyle) (obj)).edgeColor;
        obj = ((android.view.accessibility.CaptioningManager.CaptionStyle) (obj)).getTypeface();
        if (obj != null)
        {
            boolean flag;
            boolean flag2;
            if (Typeface.MONOSPACE.equals(obj))
            {
                q.b(1);
            } else
            if (!Typeface.SANS_SERIF.equals(obj) && Typeface.SERIF.equals(obj))
            {
                q.b(2);
            } else
            {
                q.b(0);
            }
            flag = ((Typeface) (obj)).isBold();
            flag2 = ((Typeface) (obj)).isItalic();
            if (flag && flag2)
            {
                q.c(3);
            } else
            if (flag)
            {
                q.c(1);
            } else
            if (flag2)
            {
                q.c(2);
            } else
            {
                q.c(0);
            }
        }
_L2:
        if (Utils.IS_KITKAT_OR_ABOVE)
        {
            return q;
        }
        break MISSING_BLOCK_LABEL_246;
_L4:
        q.a(1);
          goto _L6
        q.a(2);
          goto _L6
        q.b(((Integer)FONT_FAMILY_MAPPING.get(getFontFamily())).intValue());
        q.c = Color.parseColor(getBackgroundColor());
        q.a(((Integer)EDGE_TYPE_MAPPING.get(getEdgeType())).intValue());
        q.a = getFontScale();
        boolean flag1 = Typeface.DEFAULT.isBold();
        boolean flag3 = Typeface.DEFAULT.isItalic();
        byte byte0;
        if (flag1 && flag3)
        {
            byte0 = 3;
        } else
        if (!flag1 && !flag3)
        {
            byte0 = 0;
        } else
        if (flag1)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        q.c(byte0);
        q.b = combineColorAndOpacity(getTextColor(), getTextOpacity());
        LogUtils.LOGD(TAG, (new StringBuilder("Edge is: ")).append(getEdgeType()).toString());
        q.c = combineColorAndOpacity(getBackgroundColor(), getBackgroundOpacity());
        return q;
    }

    public boolean isCaptionEnabled()
    {
        if (Utils.IS_KITKAT_OR_ABOVE)
        {
            return ((CaptioningManager)mContext.getSystemService("captioning")).isEnabled();
        } else
        {
            return mPreferenceAccessor.getBooleanFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_enabled), false);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        onSharedPreferenceChanged(sharedpreferences, s, true);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s, boolean flag)
    {
        if (isInitialized) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_enabled).equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        sharedpreferences = mCaptionAvailability;
        int i;
        if (mCaptionAvailability.isChecked())
        {
            i = com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_enabled;
        } else
        {
            i = com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_disabled;
        }
        sharedpreferences.setSummary(i);
        setCaptionAvailability(mCaptionAvailability.isChecked());
        if (flag)
        {
            VideoCastManager.getInstance().onTextTrackEnabledChanged(mCaptionAvailability.isChecked());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_scale).equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        mCaptionFontScaleListPreference.setSummary(getCaptionSummaryForList(sharedpreferences, com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_scale, com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_font_scale_value_default, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_font_scale_names, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_font_scale_values));
_L5:
        if (flag)
        {
            VideoCastManager.getInstance().onTextTrackStyleChanged(getTextTrackStyle());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_family).equals(s))
        {
            mCaptionFontFamilyListPreference.setSummary(getCaptionSummaryForList(sharedpreferences, com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_family, com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_font_family_value_default, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_font_family_names, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_font_family_values));
        } else
        if (mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_color).equals(s))
        {
            mCaptionTextColorListPreference.setSummary(getCaptionSummaryForList(sharedpreferences, com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_color, com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_text_color_value_default, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_color_names, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_color_values));
        } else
        if (mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_opacity).equals(s))
        {
            sharedpreferences = mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_opacity), mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_text_opacity_value_default));
            mCaptionTextOpacityListPreference.setSummary((new StringBuilder()).append((String)OPACITY_MAPPING.get(sharedpreferences)).append("%%").toString());
        } else
        if (mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_edge_type).equals(s))
        {
            mCaptionEdgeTypeListPreference.setSummary(getCaptionSummaryForList(sharedpreferences, com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_edge_type, com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_edge_type_value_default, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_edge_type_names, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_edge_type_values));
        } else
        if (mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_color).equals(s))
        {
            mCaptionBackgroundColorListPreference.setSummary(getCaptionSummaryForList(sharedpreferences, com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_color, com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_background_color_value_default, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_color_names, com.google.android.libraries.cast.companionlibrary.R.array.ccl_prefs_caption_color_values));
        } else
        if (mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_opacity).equals(s))
        {
            sharedpreferences = mPreferenceAccessor.getStringFromPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_opacity), mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_prefs_caption_background_opacity_value_default));
            mCaptionBackgroundOpacityListPreference.setSummary((new StringBuilder()).append((String)OPACITY_MAPPING.get(sharedpreferences)).append("%%").toString());
        }
          goto _L5
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setBackgroundColor(Context context, String s)
    {
        mPreferenceAccessor.saveStringToPreference(context.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_color), s);
    }

    public void setBackgroundOpacity(String s)
    {
        mPreferenceAccessor.saveStringToPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_opacity), s);
    }

    public void setEdgeType(String s)
    {
        mPreferenceAccessor.saveStringToPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_edge_type), s);
    }

    public void setFontFamily(String s)
    {
        mPreferenceAccessor.saveStringToPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_family), s);
    }

    public void setFontScale(String s)
    {
        mPreferenceAccessor.saveStringToPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_scale), s);
    }

    public void setTextColor(String s)
    {
        mPreferenceAccessor.saveStringToPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_color), s);
    }

    public void setTextOpacity(String s)
    {
        mPreferenceAccessor.saveStringToPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_opacity), s);
    }

    public void setUpPreferences(PreferenceScreen preferencescreen)
    {
        mCaptionAvailability = (CheckBoxPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_enabled));
        mCaptionFontScaleListPreference = (ListPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_scale));
        mCaptionFontFamilyListPreference = (ListPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_family));
        mCaptionTextColorListPreference = (ListPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_color));
        mCaptionTextOpacityListPreference = (ListPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_opacity));
        mCaptionEdgeTypeListPreference = (ListPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_edge_type));
        mCaptionBackgroundColorListPreference = (ListPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_color));
        mCaptionBackgroundOpacityListPreference = (ListPreference)preferencescreen.findPreference(mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_opacity));
        isInitialized = true;
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_enabled), false);
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_family), false);
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_font_scale), false);
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_color), false);
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_text_opacity), false);
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_edge_type), false);
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_color), false);
        onSharedPreferenceChanged(mSharedPreferences, mContext.getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_key_caption_background_opacity), false);
    }

    static 
    {
        OPACITY_MAPPING = new HashMap();
        FONT_FAMILY_MAPPING = new HashMap();
        EDGE_TYPE_MAPPING = new HashMap();
        OPACITY_MAPPING.put("FF", "100");
        OPACITY_MAPPING.put("BF", "75");
        OPACITY_MAPPING.put("80", "50");
        OPACITY_MAPPING.put("3F", "25");
        FONT_FAMILY_MAPPING.put("FONT_FAMILY_SANS_SERIF", Integer.valueOf(0));
        FONT_FAMILY_MAPPING.put("FONT_FAMILY_SERIF", Integer.valueOf(2));
        FONT_FAMILY_MAPPING.put("FONT_FAMILY_MONOSPACED_SANS_SERIF", Integer.valueOf(1));
        EDGE_TYPE_MAPPING.put("EDGE_TYPE_NONE", Integer.valueOf(0));
        EDGE_TYPE_MAPPING.put("EDGE_TYPE_OUTLINE", Integer.valueOf(1));
        EDGE_TYPE_MAPPING.put("EDGE_TYPE_DROP_SHADOW", Integer.valueOf(2));
    }
}
