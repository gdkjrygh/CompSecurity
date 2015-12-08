// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.translate.h;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.p;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.a;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.logging.e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translate.help:
//            a, b, LicensesActivity

public class HelpActivity extends Activity
{

    private WebView a;
    private View b;

    public HelpActivity()
    {
    }

    static View a(HelpActivity helpactivity)
    {
        return helpactivity.b;
    }

    private transient boolean a(String as[])
    {
        int i;
        int j;
        boolean flag1;
        flag1 = false;
        j = as.length;
        i = 0;
_L2:
        String s;
        boolean flag;
        flag = flag1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = as[i];
        startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse(s)));
        flag = true;
        return flag;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onBackPressed()
    {
        if (a.canGoBack())
        {
            a.goBack();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(o.activity_help);
        bundle = getActionBar();
        bundle.setDisplayHomeAsUpEnabled(true);
        bundle.setDisplayShowTitleEnabled(true);
        bundle.setTitle(r.label_help);
        Pair pair = d.d();
        bundle.setSubtitle(String.format(Locale.getDefault(), "%s v%s (%d)", new Object[] {
            getString(r.app_name), pair.first, pair.second
        }));
        b = findViewById(0x102000d);
        a = (WebView)findViewById(m.webView);
        a.setWebViewClient(new com.google.android.apps.translate.help.a(this));
        a.getSettings().setJavaScriptEnabled(true);
        a.getSettings().setUserAgentString(d.c());
        a.loadUrl(Uri.parse("https://support.google.com/translate/topic/6142482").toString());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(p.help_menu, menu);
        if (!com.google.android.libraries.translate.e.o.f)
        {
            MenuItem menuitem = menu.findItem(m.menu_feedback);
            menuitem.getActionView().setOnClickListener(new b(this, menuitem));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == 0x102002c)
        {
            finish();
            return true;
        }
        if (i == m.menu_licenses)
        {
            startActivity(new Intent(this, com/google/android/apps/translate/help/LicensesActivity));
            return true;
        }
        if (i == m.menu_content_licenses)
        {
            i = r.path_content_licenses;
            HashSet hashset = new HashSet();
            hashset.addAll(Arrays.asList(getResources().getStringArray(h.content_licenses_locales)));
            Locale locale = Locale.getDefault();
            menuitem = String.valueOf(locale.getLanguage());
            String s2 = String.valueOf(locale.getCountry());
            menuitem = (new StringBuilder(String.valueOf(menuitem).length() + 1 + String.valueOf(s2).length())).append(menuitem).append("-").append(s2).toString();
            if (!hashset.contains(menuitem))
            {
                if (hashset.contains(locale.getLanguage()))
                {
                    menuitem = locale.getLanguage();
                } else
                {
                    menuitem = "en";
                }
            }
            return a(new String[] {
                getString(i, new Object[] {
                    menuitem
                })
            });
        }
        if (i == m.menu_privacy_policy)
        {
            return a(new String[] {
                getString(r.path_privacy)
            });
        }
        if (i == m.menu_terms)
        {
            return a(new String[] {
                getString(r.path_perms_of_services)
            });
        }
        if (i == m.menu_play_store)
        {
            String s = getPackageName();
            menuitem = String.valueOf(getString(r.path_play_store_app));
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                menuitem = menuitem.concat(s1);
            } else
            {
                menuitem = new String(menuitem);
            }
            s1 = String.valueOf(getString(r.path_play_store_web));
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = s1.concat(s);
            } else
            {
                s = new String(s1);
            }
            return a(new String[] {
                menuitem, s
            });
        }
        if (i == m.menu_feedback)
        {
            com.google.android.libraries.translate.e.a.a(this, (Bitmap)getIntent().getParcelableExtra("extra_screenshot"));
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onStart()
    {
        super.onStart();
        Singleton.b().c("help_feedback");
    }
}
