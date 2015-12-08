// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.landing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.settings.ui.GoalsActivity;
import com.fitbit.ui.FitbitActivity;

public class WhatsNew extends FitbitActivity
    implements android.view.View.OnClickListener
{

    protected GalileoServicesStateListener a;
    private boolean b;

    public WhatsNew()
    {
    }

    public void onClick(View view)
    {
        view = new Intent(this, com/fitbit/settings/ui/GoalsActivity);
        view.putExtra("GOALS_GROUP", "sleep");
        startActivity(view);
        b = true;
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040055);
        findViewById(0x7f1101e4).setOnClickListener(this);
        bundle = (Toolbar)findViewById(0x7f11012c);
        setSupportActionBar(bundle);
        bundle.setNavigationIcon(0x7f02025f);
    }
}
