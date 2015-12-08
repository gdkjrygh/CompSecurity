// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.userfeedback.android.api:
//            g, h, m, i, 
//            z, y

public class ShowTextActivity extends Activity
{

    public ShowTextActivity()
    {
    }

    private void a(String s)
    {
        if (s == null)
        {
            findViewById(g.gf_text_view).setVisibility(8);
            findViewById(g.gf_empty_view).setVisibility(0);
            return;
        } else
        {
            ((TextView)findViewById(g.gf_text)).setText(s);
            findViewById(g.gf_empty_view).setVisibility(8);
            findViewById(g.gf_text_view).setVisibility(0);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(h.gf_show_text_activity);
        bundle = getIntent().getStringExtra("feedback.FIELD_NAME");
        z z1 = m.c.g;
        if (z1 == null)
        {
            finish();
            return;
        }
        if ("systemLog".equals(bundle))
        {
            setTitle(i.gf_error_report_system_log);
            a(z1.q);
            return;
        }
        if ("serviceDetails".equals(bundle))
        {
            setTitle(i.gf_error_report_running_service_details);
            return;
        }
        if ("stackTrace".equals(bundle))
        {
            setTitle(i.gf_stack_trace);
            a(z1.I.f);
            return;
        } else
        {
            throw new IllegalArgumentException("ShowTextActivity unknown EXTRA_FIELD_NAME");
        }
    }
}
