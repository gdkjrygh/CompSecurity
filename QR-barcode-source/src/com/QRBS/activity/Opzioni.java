// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.webkit.URLUtil;
import android.widget.ListView;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.MenuItem;
import com.scannerfire.utils.Utils;

public class Opzioni extends SherlockPreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private SharedPreferences prefs;

    public Opzioni()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800d7);
        bundle.setHomeButtonEnabled(true);
        addPreferencesFromResource(0x7f050000);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        prefs.registerOnSharedPreferenceChangeListener(this);
        getListView().setSelector(0x7f0200e7);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
label0:
        {
            if (s.contentEquals("preference_custom_url"))
            {
                sharedpreferences = prefs.getString(s, "");
                if (!URLUtil.isValidUrl(sharedpreferences) || !sharedpreferences.contains("%s"))
                {
                    break label0;
                }
            }
            return;
        }
        Toast.makeText(getApplicationContext(), getString(0x7f08015b), 0).show();
        sharedpreferences = prefs.edit();
        sharedpreferences.putString(s, "");
        sharedpreferences.commit();
        Log.d("", (new StringBuilder("VALUE IS -> ")).append(Utils.getCustomUrlPref(getApplicationContext())).toString());
    }
}
