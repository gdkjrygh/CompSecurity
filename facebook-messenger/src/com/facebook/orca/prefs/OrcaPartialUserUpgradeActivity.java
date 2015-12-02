// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.analytics.d;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.activity.i;
import com.facebook.c.s;
import com.facebook.c.u;
import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.annotations.IsPartialAccount;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;
import java.util.Locale;

// Referenced classes of package com.facebook.orca.prefs:
//            am, al, ak

public class OrcaPartialUserUpgradeActivity extends i
    implements d
{

    private a p;
    private com.facebook.prefs.shared.d q;
    private s r;
    private com.facebook.config.a.a s;
    private javax.inject.a t;
    private ComponentName u;

    public OrcaPartialUserUpgradeActivity()
    {
    }

    static com.facebook.prefs.shared.d a(OrcaPartialUserUpgradeActivity orcapartialuserupgradeactivity)
    {
        return orcapartialuserupgradeactivity.q;
    }

    static void b(OrcaPartialUserUpgradeActivity orcapartialuserupgradeactivity)
    {
        orcapartialuserupgradeactivity.k();
    }

    static void c(OrcaPartialUserUpgradeActivity orcapartialuserupgradeactivity)
    {
        orcapartialuserupgradeactivity.j();
    }

    static s d(OrcaPartialUserUpgradeActivity orcapartialuserupgradeactivity)
    {
        return orcapartialuserupgradeactivity.r;
    }

    private void j()
    {
        Intent intent = new Intent();
        intent.setComponent(u);
        intent.addFlags(0x4000000);
        r.a(intent, this);
    }

    private void k()
    {
        LayoutInflater layoutinflater = getLayoutInflater();
        (new android.app.AlertDialog.Builder(this)).setTitle(o.preference_dialog_install_fb4a_title).setView(layoutinflater.inflate(k.orca_preferences_download_fb4a, null)).setInverseBackgroundForced(true).setIcon(h.download_arrow_orca).setPositiveButton(o.preference_dialog_install_fb4a_confirm, new am(this)).setNegativeButton(o.dialog_not_now, new al(this)).create().show();
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = i();
        t = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsPartialAccount);
        u = (ComponentName)bundle.a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity);
        setContentView(k.orca_preferences_upgrade_partial_user);
        com.facebook.widget.titlebar.c.a(this);
        p = (a)b(com.facebook.i.titlebar);
        p.setTitle(getString(o.preference_partial_user_upgrade_title));
        WebView webview = (WebView)b(com.facebook.i.upgrade_webview);
        webview.getSettings().setJavaScriptEnabled(true);
        q = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        r = (s)bundle.a(com/facebook/c/s);
        s = (com.facebook.config.a.a)bundle.a(com/facebook/config/a/a);
        String s2 = ((com.facebook.auth.b.a)bundle.a(com/facebook/auth/b/a)).a().b();
        String s3 = Locale.getDefault().getLanguage();
        webview.setWebViewClient(new ak(this));
        String s4 = q.a(com.facebook.http.f.c.j, "");
        String s1 = q.a(com.facebook.http.f.c.k, null);
        bundle = "http";
        if (n.a(s1) || !s4.equals("sandbox"))
        {
            s1 = "facebook.com";
            bundle = "https";
        }
        bundle = (new android.net.Uri.Builder()).scheme(bundle).authority((new StringBuilder()).append("m.").append(s1).toString()).path("/messenger/upgrade_account").appendQueryParameter("access_token", s2).appendQueryParameter("return_url", "fb://upgrade_complete").appendQueryParameter("locale", s3).appendQueryParameter("cid", s.b()).build();
        ((u)i().a(com/facebook/c/u)).a(webview, bundle.toString());
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_ROOT_PREFERENCE_ACTIVITY_NAME;
    }

    public void onResume()
    {
        super.onResume();
        if (!((Boolean)t.b()).booleanValue())
        {
            j();
        }
    }
}
