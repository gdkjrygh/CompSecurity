// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.kik.b.b;
import com.kik.g.p;
import kik.a.d.k;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.f.f.g;
import kik.a.f.f.z;
import kik.android.chat.KikApplication;
import kik.android.chat.a;
import kik.android.f.a.f;

// Referenced classes of package kik.android.chat.activity:
//            KikIqActivityBase, p, t, u, 
//            v, w, x, y, 
//            z, k, IntroActivity, q, 
//            aa

public class KikApiLandingActivity extends KikIqActivityBase
{

    protected com.kik.android.a a;
    protected l e;
    protected r f;
    protected v g;
    private Toast k;
    private b l;
    private p m;
    private com.kik.b.a n;
    private com.kik.b.a o;
    private com.kik.b.a p;
    private com.kik.b.a q;
    private com.kik.b.a r;
    private com.kik.b.a s;
    private com.kik.b.a t;
    private com.kik.b.a u;

    public KikApiLandingActivity()
    {
        n = new kik.android.chat.activity.p(this, "default");
        o = new t(this, "kik://api.kik.com/users/{username}/profile");
        p = new u(this, "(?:http(?:s)?://)?(?:www.)?kik.com/u/open/{username}");
        q = new kik.android.chat.activity.v(this, "kik://users/{username}/profile");
        r = new w(this, "kik-share://kik.com/u/{username}");
        s = new x(this, "kik-share://kik.com/g/{tag}");
        t = new y(this, "kik-share://kik.com/back");
        u = new kik.android.chat.activity.z(this, "kik-share://kik.com/send/{parameters}");
    }

    private void a(Intent intent)
    {
        ((KikApplication)getApplication()).n();
        b();
        intent = intent.getData();
        if (intent == null)
        {
            return;
        }
        if ("cards".equals(intent.getScheme()) || "card".equals(intent.getScheme()))
        {
            kik.android.chat.fragment.KikConversationsFragment.a a1 = new kik.android.chat.fragment.KikConversationsFragment.a();
            a1.a(intent.toString());
            kik.android.chat.activity.k.a(a1, this).a().f();
            return;
        } else
        {
            l.a(intent.toString());
            return;
        }
    }

    private void a(k k1)
    {
        kik.android.chat.fragment.KikChatInfoFragment.a a1 = new kik.android.chat.fragment.KikChatInfoFragment.a();
        a1.a(k1).b(6);
        kik.android.chat.activity.k.a(a1, this).c().f();
        finish();
    }

    static void a(KikApiLandingActivity kikapilandingactivity)
    {
        kikapilandingactivity.startActivity(new Intent(kikapilandingactivity, kik/android/chat/activity/IntroActivity));
    }

    static void a(KikApiLandingActivity kikapilandingactivity, String s1)
    {
        if (!s1.matches(kikapilandingactivity.getString(0x7f0901ee)))
        {
            if (s1.length() < 2)
            {
                kikapilandingactivity.k.setText(0x7f090356);
                kikapilandingactivity.k.show();
                kikapilandingactivity.finish();
                return;
            }
            if (s1.length() > 20)
            {
                kikapilandingactivity.k.setText(0x7f090355);
                kikapilandingactivity.k.show();
                kikapilandingactivity.finish();
                return;
            } else
            {
                kikapilandingactivity.k.setText(0x7f090351);
                kikapilandingactivity.k.show();
                kikapilandingactivity.finish();
                return;
            }
        }
        k k1 = kikapilandingactivity.f.b(s1);
        if (k1 != null && !k1.g())
        {
            kikapilandingactivity.a(k1);
            return;
        } else
        {
            kikapilandingactivity.a(kikapilandingactivity.getString(0x7f0900ff));
            kikapilandingactivity.m = kikapilandingactivity.f.d(s1);
            kikapilandingactivity.m.a(new q(kikapilandingactivity, s1));
            return;
        }
    }

    static void a(KikApiLandingActivity kikapilandingactivity, kik.a.d.a.a a1)
    {
        kik.android.f.a.f.a().a(a1, true, null);
        a1 = new kik.android.chat.fragment.KikConversationsFragment.a();
        a1.a();
        kik.android.chat.activity.k.a(a1, kikapilandingactivity).f();
    }

    static void a(KikApiLandingActivity kikapilandingactivity, k k1)
    {
        kikapilandingactivity.a(k1);
    }

    static void b(KikApiLandingActivity kikapilandingactivity)
    {
        kik.android.chat.fragment.KikConversationsFragment.a a1 = new kik.android.chat.fragment.KikConversationsFragment.a();
        a1.a(true);
        kik.android.chat.activity.k.a(a1, kikapilandingactivity).c().f();
    }

    static void b(KikApiLandingActivity kikapilandingactivity, String s1)
    {
        kikapilandingactivity.runOnUiThread(new aa(kikapilandingactivity, s1));
        kikapilandingactivity.finish();
    }

    static Toast c(KikApiLandingActivity kikapilandingactivity)
    {
        return kikapilandingactivity.k;
    }

    protected final void a(z z1)
    {
        super.a(z1);
        z1 = ((g)z1).d();
        if (z1 != null)
        {
            k k1 = f.a(z1.b(), false);
            if (k1 != null)
            {
                z1.b(k1);
            }
            f.a(z1);
            if (m != null)
            {
                m.a(z1);
            }
        }
    }

    protected final boolean b(z z1)
    {
        if (z1.l() == 201)
        {
            i = getString(0x7f0900a2, new Object[] {
                (String)z1.m()
            });
        } else
        {
            i = getString(0x7f090383);
        }
        if (m != null)
        {
            m.a(new Throwable());
        }
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((a)getApplication()).a().a(this);
        if (!kik.a.z.a(g))
        {
            Toast.makeText(this, 0x7f09014f, 1).show();
            startActivity(new Intent(this, kik/android/chat/activity/IntroActivity));
            finish();
            return;
        } else
        {
            l = new b(n);
            l.a(o);
            l.a(r);
            l.a(p);
            l.a(q);
            l.a(s);
            l.a(t);
            l.a(u);
            k = Toast.makeText(this, "", 1);
            a(getIntent());
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
    }
}
