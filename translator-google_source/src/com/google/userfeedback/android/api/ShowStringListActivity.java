// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

// Referenced classes of package com.google.userfeedback.android.api:
//            m, z, i

public class ShowStringListActivity extends ListActivity
{

    public ShowStringListActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        String s = getIntent().getStringExtra("feedback.FIELD_NAME");
        z z1 = m.c.g;
        if (z1 == null)
        {
            finish();
            return;
        }
        bundle = null;
        if ("runningApplications".equals(s))
        {
            bundle = z1.p;
            setTitle(i.gf_error_report_running_apps);
        }
        setListAdapter(new ArrayAdapter(this, 0x1090003, bundle));
    }
}
