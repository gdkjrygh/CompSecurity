// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

// Referenced classes of package com.google.zxing.client.android:
//            PreferencesFragment

public final class PreferencesActivity extends Activity
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
    public static final String KEY_INVERT_SCAN = "preferences_invert_scan";
    public static final String KEY_PLAY_BEEP = "preferences_play_beep";
    public static final String KEY_REMEMBER_DUPLICATES = "preferences_remember_duplicates";
    public static final String KEY_SEARCH_COUNTRY = "preferences_search_country";
    public static final String KEY_SUPPLEMENTAL = "preferences_supplemental";
    public static final String KEY_VIBRATE = "preferences_vibrate";

    public PreferencesActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getFragmentManager().beginTransaction().replace(0x1020002, new PreferencesFragment()).commit();
    }
}
