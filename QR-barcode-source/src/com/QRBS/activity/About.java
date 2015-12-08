// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package com.QRBS.activity:
//            Licenza

public class About extends SherlockPreferenceActivity
{

    public About()
    {
    }

    public Preference createPreferences(Context context, String s, String s1, Intent intent)
    {
        context = new Preference(context);
        context.setTitle(s);
        s = new SpannableString(s1);
        s.setSpan(new ForegroundColorSpan(Color.parseColor("#094291")), 0, s.length(), 0);
        context.setSummary(s);
        if (intent != null)
        {
            context.setIntent(intent);
        }
        return context;
    }

    public void fillPreferences(Context context, PreferenceScreen preferencescreen, String s, ArrayList arraylist)
    {
        context = new PreferenceCategory(context);
        context.setTitle(s);
        preferencescreen.addPreference(context);
        int i = 0;
        do
        {
            if (i >= arraylist.size())
            {
                return;
            }
            context.addPreference((Preference)arraylist.get(i));
            i++;
        } while (true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.d("", "On create About");
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800c6);
        bundle.setHomeButtonEnabled(true);
        bundle = new LinearLayout(this);
        bundle.setOrientation(1);
        Object obj = new ListView(this);
        ((ListView) (obj)).setId(0x102000a);
        ((ListView) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F));
        ((ListView) (obj)).setCacheColorHint(Color.parseColor("#00000000"));
        ((ListView) (obj)).setSelector(0x7f0200e7);
        bundle.addView(((android.view.View) (obj)));
        setContentView(bundle);
        setTheme(0x7f070077);
        bundle = getPreferenceManager().createPreferenceScreen(this);
        obj = createPreferences(this, getString(0x7f0800f1), "WB Development Team", null);
        Preference preference = createPreferences(this, getString(0x7f0800f2), "2.5.7", null);
        Preference preference1 = createPreferences(this, getString(0x7f0800f3), "02/04/2015", null);
        Object obj1 = new Intent(this, com/QRBS/activity/Licenza);
        obj1 = createPreferences(this, getString(0x7f0800f4), "", ((Intent) (obj1)));
        ArrayList arraylist = new ArrayList();
        arraylist.add(obj);
        arraylist.add(preference);
        arraylist.add(preference1);
        arraylist.add(obj1);
        fillPreferences(this, bundle, getString(0x7f080145), arraylist);
        setPreferenceScreen(bundle);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }
}
