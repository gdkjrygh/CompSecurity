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
import p.cm.d;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, p

public class AndroidLinkInterceptorActivity extends BaseFragmentActivity
    implements p
{

    private Button o;
    private TextView p;

    public AndroidLinkInterceptorActivity()
    {
    }

    static TextView a(AndroidLinkInterceptorActivity androidlinkinterceptoractivity)
    {
        return androidlinkinterceptoractivity.p;
    }

    public static void m()
    {
        f f1 = b.a.b().x();
        String s = f1.b("ACCESSORY_INTERCEPTOR_PREFERENCE");
        if (s != null && s.length() > 0)
        {
            (new d()).execute(new Object[] {
                f1.b("ACCESSORY_INTERCEPTOR_PREFERENCE")
            });
        }
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
        setContentView(0x7f040041);
        o = (Button)findViewById(0x7f100117);
        p = (TextView)findViewById(0x7f100116);
        bundle = b.a.b().x();
        String s = bundle.b("ACCESSORY_INTERCEPTOR_PREFERENCE");
        p.df.a.c("AndroidLinkInterceptorActivity", (new StringBuilder()).append("interceptorHost = ").append(s).toString());
        p.setText(s);
        o.setOnClickListener(new android.view.View.OnClickListener(bundle) {

            final f a;
            final AndroidLinkInterceptorActivity b;

            public void onClick(View view)
            {
                view = com.pandora.android.util.s.a(com.pandora.android.activity.AndroidLinkInterceptorActivity.a(b).getText());
                a.a("ACCESSORY_INTERCEPTOR_PREFERENCE", view);
                b.finish();
                AndroidLinkInterceptorActivity.m();
            }

            
            {
                b = AndroidLinkInterceptorActivity.this;
                a = f1;
                super();
            }
        });
    }
}
