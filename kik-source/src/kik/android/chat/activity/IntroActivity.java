// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.kik.g.f;
import com.kik.g.i;
import java.util.Timer;
import java.util.TimerTask;
import kik.a.ab;
import kik.a.e.v;
import kik.a.z;
import kik.android.chat.a;

// Referenced classes of package kik.android.chat.activity:
//            g, h, k, KikWelcomeFragmentActivity

public class IntroActivity extends Activity
{

    protected ab a;
    protected v b;
    private ProgressDialog c;
    private Timer d;
    private f e;
    private TimerTask f;
    private i g;

    public IntroActivity()
    {
        d = new Timer("TeardownFail");
        f = new g(this);
        g = new h(this);
    }

    static f a(IntroActivity introactivity)
    {
        return introactivity.e;
    }

    private void a()
    {
        if (z.a(b))
        {
            kik.android.chat.activity.k.a(new kik.android.chat.fragment.KikConversationsFragment.a(), this).f();
        } else
        {
            Intent intent = new Intent(this, kik/android/chat/activity/KikWelcomeFragmentActivity);
            intent.addFlags(0x4000000);
            startActivity(intent);
        }
        finish();
    }

    static TimerTask b(IntroActivity introactivity)
    {
        return introactivity.f;
    }

    static Timer c(IntroActivity introactivity)
    {
        return introactivity.d;
    }

    static ProgressDialog d(IntroActivity introactivity)
    {
        return introactivity.c;
    }

    static void e(IntroActivity introactivity)
    {
        introactivity.a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((a)getApplication()).a().a(this);
        bundle = getIntent();
        boolean flag;
        if (bundle != null && !isTaskRoot() && bundle.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(bundle.getAction()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            finish();
            return;
        } else
        {
            e = new f();
            c = new ProgressDialog(this);
            c.setMessage(getString(0x7f09027d));
            c.setCancelable(false);
            a();
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }
}
