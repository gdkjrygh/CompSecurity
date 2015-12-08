// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.DialogInterface;
import android.preference.Preference;

// Referenced classes of package com.google.android.apps.translate.pref:
//            g

final class f
    implements android.content.DialogInterface.OnClickListener
{

    private final Preference a;
    private final String b[];
    private final g c;

    public f(Preference preference, String as[], g g1)
    {
        a = preference;
        b = as;
        c = g1;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        c.a(b[i]);
        a.setSummary(b[i]);
        dialoginterface.dismiss();
    }
}
