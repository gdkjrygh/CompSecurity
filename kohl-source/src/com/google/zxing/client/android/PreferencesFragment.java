// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collection;

public final class PreferencesFragment extends PreferenceFragment
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private CheckBoxPreference decode1D;
    private CheckBoxPreference decodeDataMatrix;
    private CheckBoxPreference decodeQR;

    public PreferencesFragment()
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
        while (i < j) 
        {
            CheckBoxPreference checkboxpreference = acheckboxpreference[i];
            boolean flag1;
            if (!flag || !arraylist.contains(checkboxpreference))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            checkboxpreference.setEnabled(flag1);
            i++;
        }
    }

    public void onCreate(Bundle bundle)
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
