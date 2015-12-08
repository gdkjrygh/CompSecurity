// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.provider.f;
import p.cw.c;
import p.dd.ad;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, p

public class AndroidLinkConnectActivity extends BaseFragmentActivity
    implements p
{

    private Button o;
    private TextView p;

    public AndroidLinkConnectActivity()
    {
    }

    static TextView a(AndroidLinkConnectActivity androidlinkconnectactivity)
    {
        return androidlinkconnectactivity.p;
    }

    protected void a(Context context, Intent intent, String s)
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040040);
        o = (Button)findViewById(0x7f100117);
        p = (TextView)findViewById(0x7f100116);
        bundle = b.a.b().x();
        String s = bundle.b("ACCESSORY_HOST_PREFERENCE");
        p.df.a.c("AndroidLinkConnectActivity", (new StringBuilder()).append("accessoryHost = ").append(s).toString());
        p.setText(s);
        o.setOnClickListener(new android.view.View.OnClickListener(bundle) {

            final f a;
            final AndroidLinkConnectActivity b;

            public void onClick(View view)
            {
                view = com.pandora.android.util.s.a(com.pandora.android.activity.AndroidLinkConnectActivity.a(b).getText());
                a.a("ACCESSORY_HOST_PREFERENCE", view);
                p.cx.c c1 = p.cx.c.a();
                if (!c1.G())
                {
                    c1.a(false);
                    c1.a(view);
                    b.d("Connecting...");
                }
            }

            
            {
                b = AndroidLinkConnectActivity.this;
                a = f1;
                super();
            }
        });
    }

    public void onPandoraLinkConnectionSuccess(ad ad)
    {
        U();
        finish();
    }
}
