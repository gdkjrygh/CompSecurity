// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collection;

public final class PreferencesActivity extends PreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    public static final String KEY_AUTO_FOCUS = "preferences_auto_focus";
    public static final String KEY_BULK_MODE = "preferences_bulk_mode";
    public static final String KEY_COPY_TO_CLIPBOARD = "preferences_copy_to_clipboard";
    public static final String KEY_CUSTOM_PRODUCT_SEARCH = "preferences_custom_product_search";
    public static final String KEY_DECODE_1D = "preferences_decode_1D";
    public static final String KEY_DECODE_DATA_MATRIX = "preferences_decode_Data_Matrix";
    public static final String KEY_DECODE_QR = "preferences_decode_QR";
    public static final String KEY_DISABLE_CONTINUOUS_FOCUS = "preferences_disable_continuous_focus";
    public static final String KEY_FRONT_LIGHT_MODE = "preferences_front_light_mode";
    public static final String KEY_HELP_VERSION_SHOWN = "preferences_help_version_shown";
    public static final String KEY_INVERT_SCAN = "preferences_invert_scan";
    public static final String KEY_PLAY_BEEP = "preferences_play_beep";
    public static final String KEY_REMEMBER_DUPLICATES = "preferences_remember_duplicates";
    public static final String KEY_SEARCH_COUNTRY = "preferences_search_country";
    public static final String KEY_SUPPLEMENTAL = "preferences_supplemental";
    public static final String KEY_VIBRATE = "preferences_vibrate";
    private CheckBoxPreference decode1D;
    private CheckBoxPreference decodeDataMatrix;
    private CheckBoxPreference decodeQR;

    public PreferencesActivity()
    {
    }

    private void disableLastCheckedPref()
    {
        ArrayList arraylist = new ArrayList(3);
        if (decode1D.isChecked())
        {
            arraylist.add(decode1D);
        }
        if (decodeQR.isChecked())
        {
            arraylist.add(decodeQR);
        }
        if (decodeDataMatrix.isChecked())
        {
            arraylist.add(decodeDataMatrix);
        }
        CheckBoxPreference acheckboxpreference[];
        boolean flag;
        int i;
        int j;
        if (arraylist.size() < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        acheckboxpreference = new CheckBoxPreference[3];
        acheckboxpreference[0] = decode1D;
        acheckboxpreference[1] = decodeQR;
        acheckboxpreference[2] = decodeDataMatrix;
        j = acheckboxpreference.length;
        i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            CheckBoxPreference checkboxpreference = acheckboxpreference[i];
            boolean flag1;
            if (flag && arraylist.contains(checkboxpreference))
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            checkboxpreference.setEnabled(flag1);
            i++;
        } while (true);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences);
        bundle = getPreferenceScreen();
        bundle.getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        decode1D = (CheckBoxPreference)bundle.findPreference("preferences_decode_1D");
        decodeQR = (CheckBoxPreference)bundle.findPreference("preferences_decode_QR");
        decodeDataMatrix = (CheckBoxPreference)bundle.findPreference("preferences_decode_Data_Matrix");
        disableLastCheckedPref();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        disableLastCheckedPref();
    }
}
