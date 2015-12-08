// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.android.view.c;
import com.pandora.radio.util.k;
import p.cm.ai;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, p, PandoraIntent, PandoraIntentFilter

public class PrivacyNoticeActivity extends BaseFragmentActivity
    implements p
{

    public PrivacyNoticeActivity()
    {
    }

    protected String Y()
    {
        return getResources().getString(0x7f080285);
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (s1.equals(PandoraIntent.a("user_aware_of_profile_success")))
        {
            U();
            s.s();
        }
    }

    protected boolean a(Context context, Intent intent)
    {
        if (intent.getAction().equals(PandoraIntent.a("api_error")))
        {
            s.a(this, intent.getStringExtra("intent_message"), s.r());
            return true;
        } else
        {
            return false;
        }
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("user_aware_of_profile_success");
        pandoraintentfilter.a("show_privacy_notice");
        return pandoraintentfilter;
    }

    public void m()
    {
        boolean flag;
        if (!((CheckBox)findViewById(0x7f10021f)).isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        (new ai()).execute(new Object[] {
            Boolean.valueOf(flag)
        });
        S();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040086);
        b.a.C().a(new PandoraIntent("user_signed_up"));
        ((Button)findViewById(0x7f100220)).setOnClickListener(new android.view.View.OnClickListener() {

            final PrivacyNoticeActivity a;

            public void onClick(View view)
            {
                a.m();
            }

            
            {
                a = PrivacyNoticeActivity.this;
                super();
            }
        });
        if (bundle != null)
        {
            ((CheckBox)findViewById(0x7f10021f)).setChecked(bundle.getBoolean("STATE_CHK_MAKE_PRIVATE"));
        }
        getWindow().setBackgroundDrawable(new c());
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_CHK_MAKE_PRIVATE", ((CheckBox)findViewById(0x7f10021f)).isChecked());
    }

    protected void onStop()
    {
        super.onStop();
        if (isFinishing())
        {
            b.a.b().o().a(com.pandora.radio.util.k.k.n);
        }
    }
}
