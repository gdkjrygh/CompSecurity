// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.preference.Preference;
import com.facebook.contacts.upload.ContactsUploadProgressMode;
import com.facebook.contacts.upload.c;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaInternalPreferenceActivity

class ag
    implements android.preference.Preference.OnPreferenceClickListener
{

    final OrcaInternalPreferenceActivity a;

    ag(OrcaInternalPreferenceActivity orcainternalpreferenceactivity)
    {
        a = orcainternalpreferenceactivity;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        OrcaInternalPreferenceActivity.i(a).a(ContactsUploadProgressMode.SHOW_IN_THREAD_LIST_AND_DIVE_BAR);
        return true;
    }
}
