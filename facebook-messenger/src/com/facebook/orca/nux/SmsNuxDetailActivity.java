// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.os.Bundle;
import android.widget.Button;
import com.facebook.base.activity.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.prefs.shared.d;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.nux:
//            j

public class SmsNuxDetailActivity extends i
{

    private d p;

    public SmsNuxDetailActivity()
    {
    }

    static void a(SmsNuxDetailActivity smsnuxdetailactivity)
    {
        smsnuxdetailactivity.j();
    }

    private void j()
    {
        finish();
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_nux_sms_details);
        p = (d)i().a(com/facebook/prefs/shared/d);
        c.a(this);
        ((a)b(com.facebook.i.titlebar)).setTitle(o.app_name);
        ((Button)b(com.facebook.i.sms_nux_detail_okay_button)).setOnClickListener(new j(this));
    }
}
