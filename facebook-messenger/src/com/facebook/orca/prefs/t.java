// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.DialogInterface;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaContactsPreferenceActivity

class t
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final OrcaContactsPreferenceActivity b;

    t(OrcaContactsPreferenceActivity orcacontactspreferenceactivity, String s)
    {
        b = orcacontactspreferenceactivity;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        OrcaContactsPreferenceActivity.c(b).a((new cb("click")).a(b.g_()).f("button").h(a).g("orca_preferences_delete_synced_contacts_preference_cancel"));
        dialoginterface.dismiss();
    }
}
