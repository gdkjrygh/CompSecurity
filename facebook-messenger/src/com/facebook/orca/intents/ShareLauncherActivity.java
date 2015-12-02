// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.analytics.d;
import com.facebook.analytics.f.a;
import com.facebook.base.activity.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.orca.threadlist.m;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.orca.threadview.do;
import com.facebook.widget.titlebar.c;
import com.google.common.a.hq;

// Referenced classes of package com.facebook.orca.intents:
//            g

public class ShareLauncherActivity extends i
    implements d
{

    private m p;
    private do q;
    private ComponentName r;

    public ShareLauncherActivity()
    {
    }

    static void a(ShareLauncherActivity sharelauncheractivity, String s)
    {
        sharelauncheractivity.b(s);
    }

    private String b(Intent intent)
    {
        return intent.getStringExtra("android.intent.extra.TEXT");
    }

    private void b(String s)
    {
        Intent intent1;
        String s1;
        intent1 = getIntent();
        s1 = intent1.getAction();
        String s2 = b(intent1);
        Uri uri;
        if (s == m.a)
        {
            s = new Intent(this, com/facebook/orca/creation/CreateThreadActivity);
        } else
        if (s == null)
        {
            s = new Intent();
            s.setComponent(r);
        } else
        {
            Intent intent = new Intent(this, com/facebook/orca/threadview/ThreadViewActivity);
            intent.putExtra("thread_id", s);
            s = intent;
        }
        s.putExtra("show_composer", true);
        if (s2 != null)
        {
            s.putExtra("composer_initial_text", s2);
        }
        if (!"android.intent.action.SEND".equals(s1)) goto _L2; else goto _L1
_L1:
        uri = (Uri)intent1.getParcelableExtra("android.intent.extra.STREAM");
        if (uri != null)
        {
            s.putExtra("composer_photo_uri_list", hq.a(new Uri[] {
                uri
            }));
        }
_L4:
        startActivity(s);
        finish();
        return;
_L2:
        if ("android.intent.action.SEND_MULTIPLE".equals(s1))
        {
            java.util.ArrayList arraylist = intent1.getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (arraylist != null)
            {
                s.putExtra("composer_photo_uri_list", arraylist);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_share_launcher);
        c.a(this);
        bundle = i();
        p = (m)bundle.a(com/facebook/orca/threadlist/m);
        q = (do)bundle.a(com/facebook/orca/threadview/do);
        r = (ComponentName)bundle.a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity);
        p.a(getString(o.sharing_dialog_title));
        p.b(getString(o.sharing_new_thread_list_item));
        p.a(new g(this));
        p.show();
    }

    public a g_()
    {
        return a.SHARE_LAUNCHER_ACTIVITY_NAME;
    }
}
