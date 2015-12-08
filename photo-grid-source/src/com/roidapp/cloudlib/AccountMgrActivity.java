// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.android.AndroidAuthSession;
import com.dropbox.client2.session.AccessTokenPair;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.dropbox.DropBoxPhotoFragment;
import com.roidapp.cloudlib.facebook.al;

// Referenced classes of package com.roidapp.cloudlib:
//            b, IconCheckBoxPreference, al, aw, 
//            as, aq, d, g, 
//            j, m, p, ar, 
//            at, s, a

public class AccountMgrActivity extends PreferenceActivity
{

    private final String a = "facebook";
    private final String b = "twitter";
    private final String c = "flickr";
    private final String d = "dropbox";
    private final String e = "instagram";
    private DropboxAPI f;
    private boolean g;
    private Runnable h;

    public AccountMgrActivity()
    {
        h = new b(this);
    }

    static DropboxAPI a(AccountMgrActivity accountmgractivity)
    {
        return accountmgractivity.f;
    }

    private void a()
    {
        IconCheckBoxPreference iconcheckboxpreference = (IconCheckBoxPreference)findPreference("facebook");
        iconcheckboxpreference.setChecked(al.c());
        if (iconcheckboxpreference.isChecked())
        {
            iconcheckboxpreference.setSummaryOn(com.roidapp.cloudlib.common.a.k(this));
        }
    }

    private void b()
    {
        IconCheckBoxPreference iconcheckboxpreference = (IconCheckBoxPreference)findPreference("twitter");
        iconcheckboxpreference.setChecked(com.roidapp.cloudlib.common.a.p(this));
        if (iconcheckboxpreference.isChecked())
        {
            iconcheckboxpreference.setSummaryOn(com.roidapp.cloudlib.common.a.s(this));
        }
    }

    static void b(AccountMgrActivity accountmgractivity)
    {
        accountmgractivity.d();
    }

    private void c()
    {
        IconCheckBoxPreference iconcheckboxpreference = (IconCheckBoxPreference)findPreference("flickr");
        OAuth oauth = com.roidapp.cloudlib.common.a.h(this);
        boolean flag;
        if (oauth != null && oauth.getUser() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iconcheckboxpreference.setChecked(flag);
        if (iconcheckboxpreference.isChecked())
        {
            iconcheckboxpreference.setSummaryOn(com.roidapp.cloudlib.common.a.g(this));
        }
    }

    static void c(AccountMgrActivity accountmgractivity)
    {
        accountmgractivity.a();
    }

    private void d()
    {
        IconCheckBoxPreference iconcheckboxpreference = (IconCheckBoxPreference)findPreference("dropbox");
        boolean flag;
        if (com.roidapp.cloudlib.common.a.w(this) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iconcheckboxpreference.setChecked(flag);
        if (iconcheckboxpreference.isChecked())
        {
            iconcheckboxpreference.setSummaryOn(com.roidapp.cloudlib.common.a.x(this));
        }
    }

    static void d(AccountMgrActivity accountmgractivity)
    {
        accountmgractivity.b();
    }

    private void e()
    {
        IconCheckBoxPreference iconcheckboxpreference = (IconCheckBoxPreference)findPreference("instagram");
        String s1 = com.roidapp.cloudlib.common.a.b(this);
        if (!TextUtils.isEmpty(s1))
        {
            iconcheckboxpreference.setSummaryOn(s1);
            iconcheckboxpreference.setChecked(true);
            return;
        } else
        {
            iconcheckboxpreference.setSummaryOn("");
            iconcheckboxpreference.setChecked(false);
            return;
        }
    }

    static void e(AccountMgrActivity accountmgractivity)
    {
        accountmgractivity.c();
    }

    static boolean f(AccountMgrActivity accountmgractivity)
    {
        accountmgractivity.g = true;
        return true;
    }

    static void g(AccountMgrActivity accountmgractivity)
    {
        accountmgractivity.e();
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        super.onActivityResult(i, k, intent);
        if (1 == i)
        {
            a();
            if (al.c())
            {
                al.g().a(this);
            }
        } else
        {
            if (2 == i)
            {
                b();
                return;
            }
            if (3 == i)
            {
                c();
                return;
            }
            if (4 == i)
            {
                e();
                if (com.roidapp.cloudlib.common.a.d(getApplicationContext()) != null)
                {
                    al.g().a(this, null);
                    return;
                }
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(com.roidapp.cloudlib.aw.a);
        setContentView(as.c);
        f = new DropboxAPI(DropBoxPhotoFragment.a(this));
        ((IconCheckBoxPreference)findPreference("facebook")).a(getResources().getDrawable(aq.g));
        ((IconCheckBoxPreference)findPreference("instagram")).a(getResources().getDrawable(aq.y));
        ((IconCheckBoxPreference)findPreference("flickr")).a(getResources().getDrawable(aq.i));
        ((IconCheckBoxPreference)findPreference("dropbox")).a(getResources().getDrawable(aq.d));
        ((IconCheckBoxPreference)findPreference("twitter")).a(getResources().getDrawable(aq.J));
        if (al.d())
        {
            a();
            bundle = (IconCheckBoxPreference)findPreference("facebook");
            bundle.setOnPreferenceClickListener(new d(this, bundle));
        } else
        {
            getPreferenceScreen().removePreference(findPreference("facebook"));
        }
        b();
        bundle = (IconCheckBoxPreference)findPreference("twitter");
        bundle.setOnPreferenceClickListener(new g(this, bundle));
        c();
        bundle = (IconCheckBoxPreference)findPreference("flickr");
        bundle.setOnPreferenceClickListener(new j(this, bundle));
        d();
        bundle = (IconCheckBoxPreference)findPreference("dropbox");
        bundle.setOnPreferenceClickListener(new m(this, bundle));
        e();
        bundle = (IconCheckBoxPreference)findPreference("instagram");
        bundle.setOnPreferenceClickListener(new p(this, bundle));
        bundle = (TextView)findViewById(ar.cL);
        bundle.setText(Html.fromHtml((new StringBuilder("<u>")).append(getString(at.am)).append("</u>").toString()));
        bundle.setOnClickListener(new s(this));
        bundle = (TextView)findViewById(ar.aO);
        bundle.setText(getString(at.g));
        bundle.setOnClickListener(new com.roidapp.cloudlib.a(this));
        findViewById(ar.bb).setVisibility(8);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            setResult(-1);
            finish();
        }
        return super.onKeyDown(i, keyevent);
    }

    protected void onResume()
    {
        super.onResume();
        if (!g || !((AndroidAuthSession)f.getSession()).authenticationSuccessful())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        g = false;
        ((AndroidAuthSession)f.getSession()).finishAuthentication();
        AccessTokenPair accesstokenpair = ((AndroidAuthSession)f.getSession()).getAccessTokenPair();
        if (((AndroidAuthSession)f.getSession()).isLinked())
        {
            com.roidapp.cloudlib.common.a.b(this, accesstokenpair.key, accesstokenpair.secret);
            (new Thread(h)).start();
        }
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        illegalstateexception.printStackTrace();
        return;
    }
}
