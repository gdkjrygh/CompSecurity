// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.cw.c;
import p.l.d;
import p.l.g;
import p.l.j;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, a

public class CustomStationAlertActivity extends BaseFragmentActivity
{

    private y o;
    private ImageView p;

    public CustomStationAlertActivity()
    {
    }

    static void a(CustomStationAlertActivity customstationalertactivity)
    {
        customstationalertactivity.m();
    }

    static y b(CustomStationAlertActivity customstationalertactivity)
    {
        return customstationalertactivity.o;
    }

    private void c(boolean flag)
    {
        boolean flag1 = false;
        View view = findViewById(0x7f100128);
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        view = findViewById(0x7f10012b);
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void m()
    {
        com.pandora.android.activity.a.a(o, null, true, false, p.cw.b.b.b, null);
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void onBackPressed()
    {
        setResult(-1);
        if (!com.pandora.android.activity.a.c(this))
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        if (!s.u())
        {
            setTheme(0x7f0d0078);
        }
        super.onCreate(bundle);
        setContentView(0x7f040047);
        bundle = getIntent();
        if (bundle.hasExtra("intent_station_data"))
        {
            o = (y)bundle.getSerializableExtra("intent_station_data");
        }
        if (o == null)
        {
            finish();
        } else
        {
            if (bundle.hasExtra("intent_action"))
            {
                bundle = bundle.getStringExtra("intent_action");
            } else
            {
                bundle = "alert_replay";
            }
            setTitle(o.d());
            p = (ImageView)findViewById(0x7f10012f);
            g.a(this).a(o.o()).a(p);
            if ("alert_replay".equals(bundle))
            {
                c(false);
                ((ImageButton)findViewById(0x7f10012a)).setOnClickListener(new android.view.View.OnClickListener() {

                    final CustomStationAlertActivity a;

                    public void onClick(View view)
                    {
                        CustomStationAlertActivity.a(a);
                        b.a.b().o().a("replay_click", com.pandora.android.activity.CustomStationAlertActivity.b(a).c());
                    }

            
            {
                a = CustomStationAlertActivity.this;
                super();
            }
                });
                b.a.b().o().a("replay_message_shown", o.c());
                return;
            }
            if ("alert_expire".equals(bundle))
            {
                ((TextView)findViewById(0x7f10012d)).setText(String.format(getString(0x7f080255), new Object[] {
                    o.y()
                }));
                c(true);
                ((ImageButton)findViewById(0x7f10012e)).setOnClickListener(new android.view.View.OnClickListener() {

                    final CustomStationAlertActivity a;

                    public void onClick(View view)
                    {
                        com.pandora.android.activity.a.a();
                    }

            
            {
                a = CustomStationAlertActivity.this;
                super();
            }
                });
                b.a.b().o().a("expired_message_shown", o.c());
                return;
            }
        }
    }
}
