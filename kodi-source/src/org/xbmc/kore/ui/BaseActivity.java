// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import org.xbmc.kore.utils.UIUtils;

public class BaseActivity extends ActionBarActivity
{

    public BaseActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        setTheme(UIUtils.getThemeResourceId(PreferenceManager.getDefaultSharedPreferences(this).getString("pref_theme", "0")));
        super.onCreate(bundle);
    }

    public void onPause()
    {
        super.onPause();
    }
}
