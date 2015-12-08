// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.k;
import android.view.View;
import android.view.Window;
import com.pandora.android.provider.b;
import com.pandora.android.util.d;
import com.pandora.android.util.s;
import com.pandora.android.view.c;
import p.bz.a;
import p.ca.f;
import p.ca.h;
import p.dd.z;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntent, a

public class AlarmRingerActivity extends BaseFragmentActivity
{

    private f o;
    private int p;
    private int q;
    private boolean z;

    public AlarmRingerActivity()
    {
    }

    private void m()
    {
        Window window = getWindow();
        window.clearFlags(0x480000);
        window.clearFlags(0x480000);
        window.addFlags(0x480000);
        window.addFlags(0x200080);
        getWindow().getDecorView().setSystemUiVisibility(1);
    }

    private void n()
    {
        if (o != null)
        {
            o.b();
        }
        U();
        z = true;
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected boolean a(Context context, Intent intent)
    {
        String s1;
        s1 = intent.getAction();
        f((new StringBuilder()).append("action: ").append(s1).toString());
        if (!s1.equals(com.pandora.android.activity.PandoraIntent.a("show_now_playing")) && !s1.equals(com.pandora.android.activity.PandoraIntent.a("show_no_station_selected")) && !s1.equals(com.pandora.android.activity.PandoraIntent.a("show_tablet_home")) && !s1.equals(com.pandora.android.activity.PandoraIntent.a("show_listening_timeout"))) goto _L2; else goto _L1
_L1:
        if (o != null)
        {
            o.a();
        }
_L4:
        return true;
_L2:
        if (s1.equals(com.pandora.android.activity.PandoraIntent.a("api_error")))
        {
            n();
            return true;
        }
        if (!s1.equals(com.pandora.android.activity.PandoraIntent.a("handle_one_playlist_ended")))
        {
            break; /* Loop/switch isn't completed */
        }
        n();
        if (!s.u())
        {
            b.a.a(intent);
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_waiting")))
        {
            if (!z)
            {
                context = intent.getStringExtra("intent_waiting_msg");
                if (getString(0x7f080288).equals(context))
                {
                    return false;
                }
            }
        } else
        {
            return super.a(context, intent);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    protected void k()
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void onAlarmSnoozed(a a1)
    {
        a1 = h.a(p, a1.a);
        f().a().a(0x7f050007, 0x7f050008).a(null).b(0x7f1000c9, a1, "alarmSnoozeFrag").b();
    }

    public void onBackPressed()
    {
        h h1 = (h)f().a("alarmSnoozeFrag");
        if (h1 != null)
        {
            h1.a();
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
        setContentView(0x7f040022);
        getWindow().setBackgroundDrawable(new c());
        p = getIntent().getIntExtra("intent_alarm_id", -1);
        if (p == -1)
        {
            p.df.a.a("AlarmRingerActivity", "Failed to receive alarm id!");
            finish();
            return;
        }
        m();
        bundle = f();
        o = (f)bundle.a("alarmRingerFrag");
        if (o == null)
        {
            o = f.a(p);
            bundle.a().a(0x7f1000c9, o, "alarmRingerFrag").b();
        }
        d.a();
        d.a(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        d.a();
    }

    public void onNetworkWaiting(z z1)
    {
        z1 = (new StringBuilder()).append("Got Network waiting event! Count: ");
        int i = q;
        q = i + 1;
        f(z1.append(i).toString());
        if (q >= 10)
        {
            n();
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        m();
        f().c();
        com.pandora.android.activity.a.g(this);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        q = bundle.getInt("errorCount", 0);
        z = bundle.getBoolean("suppressDialog", false);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("errorCount", q);
        bundle.putBoolean("suppressDialog", z);
    }

    protected void onUserLeaveHint()
    {
        super.onUserLeaveHint();
        d.a();
    }
}
