// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.content.Intent;
import android.preference.Preference;
import com.roidapp.cloudlib.flickr.FlickrAuthenActivity;

// Referenced classes of package com.roidapp.cloudlib:
//            IconCheckBoxPreference, at, k, l, 
//            AccountMgrActivity

final class j
    implements android.preference.Preference.OnPreferenceClickListener
{

    final IconCheckBoxPreference a;
    final AccountMgrActivity b;

    j(AccountMgrActivity accountmgractivity, IconCheckBoxPreference iconcheckboxpreference)
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
            preference.setPositiveButton(at.bo, new k(this));
            preference.setNegativeButton(at.ab, new l(this));
            preference.setCancelable(false).setMessage(at.aE);
            preference.create().show();
            return false;
        } else
        {
            AccountMgrActivity.e(b);
            a.setSummaryOn(null);
            b.startActivityForResult(new Intent(b, com/roidapp/cloudlib/flickr/FlickrAuthenActivity), 3);
            return false;
        }
    }
}
