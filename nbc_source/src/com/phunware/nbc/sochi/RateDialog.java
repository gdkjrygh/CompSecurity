// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import timber.log.Timber;

public class RateDialog extends DialogFragment
{

    private static String APP_PNAME;
    private static final int LAUNCHES_UNTIL_PROMPT = 4;
    private static android.content.SharedPreferences.Editor mPreferencesEditor;

    public RateDialog()
    {
    }

    public static void appLaunched(Context context, FragmentManager fragmentmanager)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("apprater", 0);
        if (PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getBoolean("HAS_CRASHED", false))
        {
            sharedpreferences.edit().putBoolean("HAS_CRASHED", true).commit();
            Timber.d("Prevented rating dialog after crash", new Object[0]);
        } else
        if (!sharedpreferences.getBoolean("dontshowagain", false) && !sharedpreferences.getBoolean("HAS_CRASHED", false))
        {
            mPreferencesEditor = sharedpreferences.edit();
            long l = sharedpreferences.getLong("launch_count", 0L) + 1L;
            if (l >= 4L)
            {
                getInstance().show(fragmentmanager, "RateDialog");
                mPreferencesEditor.putLong("launch_count", 0L);
            } else
            {
                mPreferencesEditor.putLong("launch_count", l);
            }
            mPreferencesEditor.apply();
            return;
        }
    }

    public static RateDialog getInstance()
    {
        return new RateDialog();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().setTitle((new StringBuilder()).append(getString(0x7f07016a)).append(" ").append(getString(0x7f070059)).toString());
        layoutinflater = layoutinflater.inflate(0x7f040028, viewgroup);
        ((TextView)layoutinflater.findViewById(0x7f0f0084)).setText(String.format(getResources().getString(0x7f07005a), new Object[] {
            getString(0x7f070059)
        }));
        ((Button)layoutinflater.findViewById(0x7f0f0087)).setOnClickListener(new android.view.View.OnClickListener() {

            final RateDialog this$0;

            public void onClick(View view)
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=air.com.nbcuni.com.nbcsports.liveextra")));
                dismiss();
            }

            
            {
                this$0 = RateDialog.this;
                super();
            }
        });
        ((Button)layoutinflater.findViewById(0x7f0f0086)).setOnClickListener(new android.view.View.OnClickListener() {

            final RateDialog this$0;

            public void onClick(View view)
            {
                dismiss();
            }

            
            {
                this$0 = RateDialog.this;
                super();
            }
        });
        ((Button)layoutinflater.findViewById(0x7f0f0085)).setOnClickListener(new android.view.View.OnClickListener() {

            final RateDialog this$0;

            public void onClick(View view)
            {
                if (RateDialog.mPreferencesEditor != null)
                {
                    RateDialog.mPreferencesEditor.putBoolean("dontshowagain", true);
                    RateDialog.mPreferencesEditor.commit();
                }
                dismiss();
            }

            
            {
                this$0 = RateDialog.this;
                super();
            }
        });
        return layoutinflater;
    }

}
