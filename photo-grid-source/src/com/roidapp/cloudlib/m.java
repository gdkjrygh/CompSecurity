// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.preference.Preference;
import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.android.AndroidAuthSession;

// Referenced classes of package com.roidapp.cloudlib:
//            IconCheckBoxPreference, at, n, o, 
//            AccountMgrActivity

final class m
    implements android.preference.Preference.OnPreferenceClickListener
{

    final IconCheckBoxPreference a;
    final AccountMgrActivity b;

    m(AccountMgrActivity accountmgractivity, IconCheckBoxPreference iconcheckboxpreference)
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
            preference.setPositiveButton(at.bo, new n(this));
            preference.setNegativeButton(at.ab, new o(this));
            preference.setCancelable(false).setMessage(at.aE);
            preference.create().show();
            return false;
        } else
        {
            AccountMgrActivity.b(b);
            a.setSummaryOn(null);
            ((AndroidAuthSession)AccountMgrActivity.a(b).getSession()).startAuthentication(b);
            AccountMgrActivity.f(b);
            return false;
        }
    }
}
