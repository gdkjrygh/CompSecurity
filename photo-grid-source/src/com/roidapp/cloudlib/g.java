// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.content.Intent;
import android.preference.Preference;
import com.roidapp.cloudlib.twitter.TwitterVerifyActivity;

// Referenced classes of package com.roidapp.cloudlib:
//            IconCheckBoxPreference, at, h, i, 
//            AccountMgrActivity

final class g
    implements android.preference.Preference.OnPreferenceClickListener
{

    final IconCheckBoxPreference a;
    final AccountMgrActivity b;

    g(AccountMgrActivity accountmgractivity, IconCheckBoxPreference iconcheckboxpreference)
    {
        b = accountmgractivity;
        a = iconcheckboxpreference;
        super();
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        if (!a.isChecked())
        {
            preference = new android.app.AlertDialog.Builder(b);
            preference.setPositiveButton(at.bo, new h(this));
            preference.setNegativeButton(at.ab, new i(this));
            preference.setCancelable(false).setMessage(at.aE);
            preference.create().show();
            return false;
        } else
        {
            AccountMgrActivity.e(b);
            a.setSummaryOn(null);
            b.startActivityForResult(new Intent(b, com/roidapp/cloudlib/twitter/TwitterVerifyActivity), 2);
            return false;
        }
    }
}
