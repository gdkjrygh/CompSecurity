// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.appboy.Appboy;
import com.tinder.events.EventLoggedOut;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.d;
import com.tinder.model.SparksEvent;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.activities:
//            ActivityLogin

public class ActivityBanned extends Activity
{

    d a;
    c b;
    com.tinder.d.a c;

    public ActivityBanned()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        ManagerApp.h().a(this);
        ((TextView)findViewById(0x7f0e015b)).setText(0x7f0601ae);
        ((TextView)findViewById(0x7f0e015f)).setText(0x7f0601ad);
        findViewById(0x7f0e0168).setVisibility(0);
        bundle = (Button)findViewById(0x7f0e0169);
        bundle.setText(getString(0x7f060102));
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final ActivityBanned a;

            public final void onClick(View view)
            {
                view = new SparksEvent("Warning.Logout");
                view.put("version", Integer.valueOf(1));
                view.put("banned", Boolean.valueOf(true));
                com.tinder.managers.a.a(view);
                a.a.d();
            }

            
            {
                a = ActivityBanned.this;
                super();
            }
        });
        bundle.setVisibility(0);
        findViewById(0x7f0e0164).setVisibility(8);
        findViewById(0x7f0e0165).setVisibility(8);
        findViewById(0x7f0e0166).setVisibility(8);
        findViewById(0x7f0e0163).setVisibility(8);
        findViewById(0x7f0e0161).setVisibility(8);
        findViewById(0x7f0e0162).setVisibility(8);
        findViewById(0x7f0e0160).setVisibility(8);
        findViewById(0x7f0e0167).setVisibility(8);
        findViewById(0x7f0e015c).setVisibility(8);
        findViewById(0x7f0e015d).setVisibility(8);
        findViewById(0x7f0e015e).setVisibility(8);
        bundle = new SparksEvent("Warning.View");
        bundle.put("version", Integer.valueOf(1));
        bundle.put("banned", Boolean.valueOf(true));
        com.tinder.managers.a.a(bundle);
    }

    public void onEventMainThread(EventLoggedOut eventloggedout)
    {
        eventloggedout = new Intent(this, com/tinder/activities/ActivityLogin);
        eventloggedout.setFlags(0x10000000);
        eventloggedout.putExtra("extra_show_intro", "");
        startActivity(eventloggedout);
        finish();
    }

    protected void onPause()
    {
        super.onPause();
        b.b(this);
    }

    protected void onResume()
    {
        super.onResume();
        b.a(this, false);
    }

    protected void onStart()
    {
        super.onStart();
        Appboy.getInstance(this).openSession(this);
    }

    protected void onStop()
    {
        super.onStop();
        Appboy.getInstance(this).closeSession(this);
    }
}
