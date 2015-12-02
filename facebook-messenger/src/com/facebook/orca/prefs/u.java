// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.contacts.server.d;
import com.facebook.fbservice.ops.c;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaContactsPreferenceActivity, y

class u
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final OrcaContactsPreferenceActivity b;

    u(OrcaContactsPreferenceActivity orcacontactspreferenceactivity, String s)
    {
        b = orcacontactspreferenceactivity;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        com.facebook.orca.prefs.OrcaContactsPreferenceActivity.c(b).a((new cb("click")).a(b.g_()).f("button").h(a).g("orca_preferences_delete_synced_contacts_preference_confirm"));
        if (com.facebook.orca.prefs.OrcaContactsPreferenceActivity.d(b) != y.NOT_STARTED)
        {
            dialoginterface.dismiss();
        }
        OrcaContactsPreferenceActivity.a(b, y.IN_PROGRESS);
        OrcaContactsPreferenceActivity.a(b).a(d.f, new Bundle());
        dialoginterface.dismiss();
    }
}
