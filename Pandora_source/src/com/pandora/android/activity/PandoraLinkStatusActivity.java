// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.pandora.android.fordsync.a;
import com.pandora.android.provider.b;
import p.cx.c;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, p, c, AndroidLinkConnectActivity, 
//            AndroidLinkInterceptorActivity, PandoraLinkInterceptorActivity

public class PandoraLinkStatusActivity extends BaseFragmentActivity
    implements p
{

    private TextView A;
    private Button B;
    private Button o;
    private TextView p;
    private Button q;
    private TextView z;

    public PandoraLinkStatusActivity()
    {
    }

    static Button a(PandoraLinkStatusActivity pandoralinkstatusactivity)
    {
        return pandoralinkstatusactivity.o;
    }

    static Button b(PandoraLinkStatusActivity pandoralinkstatusactivity)
    {
        return pandoralinkstatusactivity.q;
    }

    protected void a(Context context, Intent intent, String s)
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    protected void m()
    {
        String s;
        String s2;
        String s4;
        String s5;
        c c1;
        s4 = getApplicationContext().getResources().getString(0x7f08006a);
        s5 = getApplicationContext().getResources().getString(0x7f080070);
        c1 = c.a();
        boolean flag;
        if (com.pandora.android.fordsync.a.a().G() || c1.J() && c1.i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        s = getApplicationContext().getResources().getString(0x7f08006f);
        s2 = getApplicationContext().getResources().getString(0x7f08006c);
_L4:
        p.setText(s);
        o.setText(s2);
        if (com.pandora.android.fordsync.a.a().G())
        {
            A.setVisibility(4);
            z.setVisibility(4);
            q.setVisibility(4);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        s = s5;
        s2 = s4;
        if (c1.J())
        {
            s = s5;
            s2 = s4;
            if (!c1.i())
            {
                s = getApplicationContext().getResources().getString(0x7f080071);
                s2 = getApplicationContext().getResources().getString(0x7f08006c);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s3 = getApplicationContext().getResources().getString(0x7f08006a);
        String s1 = getApplicationContext().getResources().getString(0x7f0801aa);
        if (c1.ad())
        {
            s1 = getApplicationContext().getResources().getString(0x7f0801ab);
            s3 = getApplicationContext().getResources().getString(0x7f08006c);
        }
        z.setText(s1);
        q.setText(s3);
        A.setVisibility(0);
        z.setVisibility(0);
        q.setVisibility(0);
        return;
    }

    protected boolean n()
    {
        if (c.z())
        {
            return true;
        }
        WifiManager wifimanager = (WifiManager)b.a.h().getSystemService("wifi");
        if (wifimanager != null)
        {
            return wifimanager.isWifiEnabled();
        } else
        {
            return false;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040076);
        o = (Button)findViewById(0x7f100117);
        p = (TextView)findViewById(0x7f1001dd);
        q = (Button)findViewById(0x7f1001e1);
        z = (TextView)findViewById(0x7f1001e0);
        A = (TextView)findViewById(0x7f1001df);
        B = (Button)findViewById(0x7f1001e4);
        m();
        o.setOnClickListener(new android.view.View.OnClickListener() {

            final PandoraLinkStatusActivity a;

            public void onClick(View view)
            {
                view = a.getApplicationContext().getResources().getString(0x7f08006a);
                if (com.pandora.android.activity.PandoraLinkStatusActivity.a(a).getText().equals(view))
                {
                    com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/AndroidLinkConnectActivity);
                    return;
                }
                if (com.pandora.android.fordsync.a.a().G())
                {
                    com.pandora.android.fordsync.a.a().i();
                } else
                {
                    c.a().l();
                }
                a.m();
            }

            
            {
                a = PandoraLinkStatusActivity.this;
                super();
            }
        });
        q.setOnClickListener(new android.view.View.OnClickListener() {

            final PandoraLinkStatusActivity a;

            public void onClick(View view)
            {
                view = a.getApplicationContext().getResources().getString(0x7f08006a);
                if (com.pandora.android.activity.PandoraLinkStatusActivity.b(a).getText().equals(view))
                {
                    if (a.n())
                    {
                        com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/AndroidLinkInterceptorActivity);
                        return;
                    } else
                    {
                        ((TextView)a.findViewById(0x7f1001e2)).setText(a.getApplicationContext().getResources().getString(0x7f080292));
                        return;
                    }
                } else
                {
                    c.a().ae();
                    a.m();
                    return;
                }
            }

            
            {
                a = PandoraLinkStatusActivity.this;
                super();
            }
        });
        B.setOnClickListener(new android.view.View.OnClickListener() {

            final PandoraLinkStatusActivity a;

            public void onClick(View view)
            {
                com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/PandoraLinkInterceptorActivity, 0x4000000, null);
            }

            
            {
                a = PandoraLinkStatusActivity.this;
                super();
            }
        });
    }
}
