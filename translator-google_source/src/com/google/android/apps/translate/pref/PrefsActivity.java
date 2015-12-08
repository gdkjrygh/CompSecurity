// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.app.ActionBar;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import com.google.android.apps.translate.TranslateActivity;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.u;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.wordlens.WordLensSystem;
import java.util.Iterator;
import java.util.List;

public class PrefsActivity extends PreferenceActivity
{

    public PrefsActivity()
    {
    }

    protected boolean isValidFragment(String s)
    {
        return true;
    }

    public void onBuildHeaders(List list)
    {
        boolean flag;
        boolean flag1;
        loadHeadersFromResource(u.settings_headers, list);
        flag = TranslateActivity.a(this);
        flag1 = WordLensSystem.a(this);
        if (flag && flag1) goto _L2; else goto _L1
_L1:
        Iterator iterator = list.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        android.preference.PreferenceActivity.Header header;
        String s;
        header = (android.preference.PreferenceActivity.Header)iterator.next();
        s = getString(r.label_manage_wordlens_pkg);
        if (s == null || !s.equals(header.getTitle(getResources()))) goto _L6; else goto _L5
_L5:
        if (header != null)
        {
            list.remove(header);
        }
_L2:
        return;
_L4:
        header = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (o.f)
        {
            getWindow().addFlags(0x80000000);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onStart()
    {
        super.onStart();
        Singleton.b().c("settings");
    }
}
