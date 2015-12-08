// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            SettingsFragment

public class SettingsActivity extends ActionBarActivity
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/SettingsActivity);
    private SettingsFragment settingsFragment;

    public SettingsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        setTheme(UIUtils.getThemeResourceId(PreferenceManager.getDefaultSharedPreferences(this).getString("pref_theme", "0")));
        super.onCreate(bundle);
        setContentView(0x7f03001e);
        setSupportActionBar((Toolbar)findViewById(0x7f0e00d8));
        bundle = getSupportActionBar();
        bundle.setDisplayHomeAsUpEnabled(true);
        bundle.setTitle(0x7f070088);
        settingsFragment = new SettingsFragment();
        getFragmentManager().beginTransaction().replace(0x7f0e0053, settingsFragment).commit();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

}
