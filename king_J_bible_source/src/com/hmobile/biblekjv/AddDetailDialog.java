// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AddDetailDialog extends Dialog
    implements android.view.View.OnClickListener
{

    private static final int BUTTON_NEGATIVE = 2;
    private static final int BUTTON_NEUTRAL = 1;
    private static final int BUTTON_POSITIVE = 0;
    private Activity activity;
    private Button btnCancel;
    private Button btnNever;
    private Button btnNotNow;
    private Button btnOkay;
    private Button btnRate;
    android.content.SharedPreferences.Editor editor;
    private RelativeLayout rlContent;
    private RelativeLayout rlRate;
    SharedPreferences settings;

    public AddDetailDialog(Activity activity1)
    {
        super(activity1);
        activity = activity1;
        requestWindowFeature(1);
        setContentView(0x7f03001a);
        settings = PreferenceManager.getDefaultSharedPreferences(activity1.getApplicationContext());
        editor = settings.edit();
        setTitle(activity1.getResources().getString(0x7f07009a));
        TextView textview = (TextView)findViewById(0x7f0e008f);
        TextView textview1 = (TextView)findViewById(0x7f0e0094);
        textview.setText(activity1.getResources().getString(0x7f0700a3));
        textview1.setText(activity1.getResources().getString(0x7f07009d));
        btnOkay = (Button)findViewById(0x7f0e0091);
        btnCancel = (Button)findViewById(0x7f0e0092);
        btnRate = (Button)findViewById(0x7f0e0095);
        btnNotNow = (Button)findViewById(0x7f0e0096);
        btnNever = (Button)findViewById(0x7f0e0097);
        rlRate = (RelativeLayout)findViewById(0x7f0e0093);
        rlContent = (RelativeLayout)findViewById(0x7f0e0090);
    }

    public void onClick(View view)
    {
        if (view == btnOkay)
        {
            rlRate.setVisibility(0);
        } else
        {
            if (view == btnCancel)
            {
                dismiss();
                return;
            }
            if (view != btnNever)
            {
                if (view == btnNotNow)
                {
                    editor.putInt("exit_alert", 1);
                    editor.commit();
                    activity.finish();
                    return;
                }
                if (view == btnRate)
                {
                    editor.putInt("exit_alert", 0);
                    editor.commit();
                    activity.finish();
                    view = new Intent("android.intent.action.VIEW");
                    view.setData(Uri.parse((new StringBuilder("market://details?id=")).append(activity.getPackageName()).toString()));
                    activity.startActivity(view);
                    activity.finish();
                    return;
                }
            }
        }
    }
}
