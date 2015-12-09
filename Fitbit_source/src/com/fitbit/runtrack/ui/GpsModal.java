// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.ap;

// Referenced classes of package com.fitbit.runtrack.ui:
//            GpsStatus

public class GpsModal extends FitbitActivity
    implements android.view.View.OnClickListener
{

    private TextView a;
    private TextView b;

    public GpsModal()
    {
    }

    public static Intent a(Context context, GpsStatus gpsstatus)
    {
        context = new Intent(context, com/fitbit/runtrack/ui/GpsModal);
        if (gpsstatus != null)
        {
            context.putExtra("accuracy", gpsstatus.accuracy);
        }
        return context;
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131820829 2131820830: default 28
    //                   2131820829 43
    //                   2131820830 29;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        setResult(-1, getIntent());
_L5:
        finish();
        return;
_L2:
        setResult(0, getIntent());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040027);
    }

    public void onSupportContentChanged()
    {
        super.onSupportContentChanged();
        TextView textview = (TextView)findViewById(0x7f110120);
        if (getIntent().getFloatExtra("accuracy", 3.402823E+38F) < 3.402823E+38F)
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020220, 0, 0);
            textview.setText(getResources().getString(0x7f08023c));
            textview.setTextColor(getResources().getColor(0x7f0f0029));
            textview.setPadding(0, Math.round(ap.b(10F)), 0, Math.round(ap.b(7F)));
            textview.setBackgroundResource(0x7f02021b);
        }
        a = (TextView)findViewById(0x7f11011d);
        b = (TextView)findViewById(0x7f11011e);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
    }
}
