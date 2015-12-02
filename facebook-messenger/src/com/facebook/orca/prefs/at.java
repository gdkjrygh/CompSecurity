// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.DialogInterface;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.inject.t;
import com.facebook.orca.auth.c;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaRootPreferenceActivity

class at
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final OrcaRootPreferenceActivity b;

    at(OrcaRootPreferenceActivity orcarootpreferenceactivity, String s)
    {
        b = orcarootpreferenceactivity;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        com.facebook.orca.prefs.OrcaRootPreferenceActivity.c(b).a((new cb("click")).a(b.g_()).f("button").h(a).g("orca_preferences_delete_account_dialog_confirm"));
        ((c)b.b().a(com/facebook/orca/auth/c)).b();
        dialoginterface.dismiss();
    }
}
