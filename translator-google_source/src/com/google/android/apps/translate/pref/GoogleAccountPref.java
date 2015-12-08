// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import com.google.android.libraries.translate.sync.k;
import com.google.android.libraries.translate.sync.q;

public class GoogleAccountPref extends CheckBoxPreference
    implements q
{

    Activity a;
    private final k b;

    public GoogleAccountPref(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setPersistent(false);
        b = new k(context);
        a(b.a());
    }

    public final void a(Account account)
    {
        boolean flag;
        if (account != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
        if (isChecked())
        {
            setSummary(account.name);
            return;
        } else
        {
            setSummary("");
            return;
        }
    }

    protected void onClick()
    {
        if (isChecked())
        {
            b.d();
            a(null);
        } else
        if (a != null)
        {
            b.a(a, this);
            return;
        }
    }
}
