// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.content.Intent;
import android.preference.Preference;
import com.roidapp.cloudlib.instagram.InstagramAuthActivity;

// Referenced classes of package com.roidapp.cloudlib:
//            IconCheckBoxPreference, at, q, r, 
//            AccountMgrActivity

final class p
    implements android.preference.Preference.OnPreferenceClickListener
{

    final IconCheckBoxPreference a;
    final AccountMgrActivity b;

    p(AccountMgrActivity accountmgractivity, IconCheckBoxPreference iconcheckboxpreference)
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
            preference.setPositiveButton(at.bo, new q(this));
            preference.setNegativeButton(at.ab, new r(this));
            preference.setCancelable(false).setMessage(at.aE);
            preference.create().show();
            return false;
        } else
        {
            AccountMgrActivity.g(b);
            b.startActivityForResult(new Intent(b, com/roidapp/cloudlib/instagram/InstagramAuthActivity), 4);
            return false;
        }
    }
}
