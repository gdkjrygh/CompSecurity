// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.DialogInterface;
import android.preference.Preference;
import com.google.android.libraries.translate.core.b;

final class aa
    implements android.content.DialogInterface.OnClickListener
{

    private final Preference a;
    private final String b[];
    private final String c[];

    public aa(Preference preference, String as[], String as1[])
    {
        a = preference;
        b = as;
        c = as1;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        com.google.android.libraries.translate.core.b.c(a.getContext(), a.getKey(), c[i]);
        a.setSummary(b[i]);
        dialoginterface.dismiss();
    }
}
