// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.preference.Preference;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.h;

public final class a
    implements android.preference.Preference.OnPreferenceClickListener
{

    private Preference a;

    public a(Preference preference)
    {
        a = preference;
        a.setOnPreferenceClickListener(this);
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        if (TextUtils.equals(preference.getKey(), "key_copydrop_enable"))
        {
            if (b.l(preference.getContext()))
            {
                h.a(201);
            } else
            {
                h.a(202);
            }
            return true;
        } else
        {
            return false;
        }
    }
}
