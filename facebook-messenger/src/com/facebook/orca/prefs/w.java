// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.contacts.upload.ContactsUploadState;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaContactsPreferenceActivity

class w extends BroadcastReceiver
{

    final OrcaContactsPreferenceActivity a;

    w(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        a = orcacontactspreferenceactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = (ContactsUploadState)intent.getParcelableExtra("state");
        OrcaContactsPreferenceActivity.a(a, context);
    }
}
