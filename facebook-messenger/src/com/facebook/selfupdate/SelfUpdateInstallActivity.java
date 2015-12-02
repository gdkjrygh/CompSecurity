// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.base.activity.i;
import com.facebook.common.f.d;
import com.facebook.common.f.g;
import com.facebook.common.w.n;
import com.facebook.config.b.a;
import com.facebook.debug.log.f;
import com.facebook.inject.aq;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import java.io.File;
import java.net.URI;

// Referenced classes of package com.facebook.selfupdate:
//            af, p, o, aj, 
//            n, i, j, l, 
//            m

public class SelfUpdateInstallActivity extends i
{

    private boolean p;
    private View q;
    private com.facebook.selfupdate.o r;

    public SelfUpdateInstallActivity()
    {
    }

    static com.facebook.selfupdate.o a(SelfUpdateInstallActivity selfupdateinstallactivity)
    {
        return selfupdateinstallactivity.r;
    }

    private PackageInfo b(String s)
    {
        Object obj = (d)t.a(this).a(com/facebook/common/f/d);
        try
        {
            URI uri = new URI(s);
            if (uri.isAbsolute())
            {
                obj = ((d) (obj)).a(uri);
            } else
            {
                obj = ((d) (obj)).a(s);
            }
            return getPackageManager().getPackageArchiveInfo(((File) (obj)).getAbsolutePath(), 0);
        }
        catch (Exception exception)
        {
            f.b(getClass(), (new StringBuilder()).append("Invalid file: ").append(s).toString());
        }
        return null;
    }

    static void b(SelfUpdateInstallActivity selfupdateinstallactivity)
    {
        selfupdateinstallactivity.j();
    }

    private void j()
    {
        af af1 = (af)i().a(com/facebook/selfupdate/af);
        af1.e();
        af1.f();
    }

    private void k()
    {
        p = getIntent().getBooleanExtra("no_cancel", false);
        r.a(this, p.NO_CANCEL_FROM_INTENT, String.valueOf(p));
        if (p && (!m() || n()))
        {
            p = false;
            r.a(this, p.NO_CANCEL_CHANGED_TO_FALSE);
        }
        if (p)
        {
            q.setVisibility(8);
            return;
        } else
        {
            q.setVisibility(0);
            return;
        }
    }

    private void l()
    {
        t t1 = i();
        Object obj;
        try
        {
            obj = (aj)t1.a(com/facebook/selfupdate/aj);
        }
        catch (aq aq1)
        {
            r.a("UrlHelperInterface NOT implemented", aq1);
            return;
        }
        if (obj != null)
        {
            obj = ((aj) (obj)).a(getApplicationContext(), "help/122940794553357/?ref=lmupdate");
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = Uri.parse(((String) (obj)));
                View view = findViewById(com.facebook.i.help_center_link);
                view.setVisibility(0);
                view.setOnClickListener(new com.facebook.selfupdate.n(this, ((Uri) (obj)), t1));
            }
        }
    }

    private boolean m()
    {
        boolean flag = ((com.facebook.selfupdate.i)i().a(com/facebook/selfupdate/i)).b();
        if (!flag)
        {
            r.a(this, p.UNKNOWN_SOURCES_NOT_CHECKED);
        }
        return flag;
    }

    private boolean n()
    {
        a a1 = (a)i().a(com/facebook/config/b/a);
        return a1.b() == a1.c();
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = i();
        r = (com.facebook.selfupdate.o)bundle.a(com/facebook/selfupdate/o);
        r.a(this, p.ON_ACTIVITY_CREATE);
        Object obj = getIntent();
        String s = ((Intent) (obj)).getStringExtra("local_uri");
        Object obj1 = (af)bundle.a(com/facebook/selfupdate/af);
        if (!((af) (obj1)).a(s))
        {
            ((af) (obj1)).f();
            r.a("File doesn't exist for SelfUpdateInstallActivity");
            finish();
            return;
        }
        com.facebook.prefs.shared.d d1 = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        if (((com.facebook.common.f.f)bundle.a(com/facebook/common/f/f)).a(g.INTERNAL) < d1.a(j.q, 0x1e00000L))
        {
            ((af) (obj1)).f();
            r.a("Not enough free space in internal storage for installation");
            finish();
            return;
        }
        setContentView(k.install_new_build);
        ((TextView)findViewById(com.facebook.i.title)).setText(getString(o.install_new_build_title));
        obj = ((Intent) (obj)).getStringExtra("app_name");
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = "";
        }
        obj = "2.3";
        obj1 = b(s);
        if (obj1 != null)
        {
            obj = ((PackageInfo) (obj1)).versionName;
        }
        bundle = com.facebook.common.w.n.a(getString(o.install_new_build_app), new Object[] {
            bundle
        });
        ((TextView)findViewById(com.facebook.i.lbl_install_new_build_app)).setText(bundle);
        bundle = com.facebook.common.w.n.a(getString(o.install_new_build_version), new Object[] {
            obj
        });
        ((TextView)findViewById(com.facebook.i.lbl_install_new_build_version)).setText(bundle);
        obj = getIntent().getStringExtra("release_notes");
        bundle = ((Bundle) (obj));
        if (com.facebook.common.w.n.c(((CharSequence) (obj))))
        {
            bundle = getString(o.install_new_build_notes_default_text);
        }
        bundle = com.facebook.common.w.n.a(getString(o.install_new_build_notes_text), new Object[] {
            bundle
        });
        ((TextView)findViewById(com.facebook.i.lbl_install_new_build_notes_text)).setText(bundle);
        findViewById(com.facebook.i.btn_install_new_build).setOnClickListener(new l(this, s));
        q = findViewById(com.facebook.i.btn_install_new_build_remind);
        q.setOnClickListener(new m(this));
        l();
    }

    public void onBackPressed()
    {
        if (p)
        {
            return;
        } else
        {
            r.a(this, p.BACK_BUTTON_PRESS_CANCEL);
            j();
            super.onBackPressed();
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        k();
    }
}
