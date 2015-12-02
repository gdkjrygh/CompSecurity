// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.os.Bundle;
import android.widget.Button;
import com.facebook.base.activity.i;
import com.facebook.contacts.upload.ContactsUploadProgressMode;
import com.facebook.contacts.upload.c;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.prefs.n;
import com.facebook.orca.prefs.o;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            k, l

public class DivebarContactsUploaderLearnMoreActivity extends i
{

    private d p;
    private c q;

    public DivebarContactsUploaderLearnMoreActivity()
    {
    }

    static void a(DivebarContactsUploaderLearnMoreActivity divebarcontactsuploaderlearnmoreactivity)
    {
        divebarcontactsuploaderlearnmoreactivity.k();
    }

    private void k()
    {
        p.b().a(o.q, true).a();
        finish();
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = i();
        p = (d)bundle.a(com/facebook/prefs/shared/d);
        q = (c)bundle.a(com/facebook/contacts/upload/c);
        setContentView(k.orca_divebar_contacts_uploader_learn_more_activity);
        ((Button)b(com.facebook.i.divebar_contacts_uploader_learn_more_not_now_button)).setOnClickListener(new com.facebook.orca.contacts.divebar.k(this));
        ((Button)b(com.facebook.i.divebar_contacts_uploader_learn_more_sync_contacts_button)).setOnClickListener(new l(this));
    }

    public void j()
    {
        p.b().a(n.N, true).a();
        q.a(ContactsUploadProgressMode.SHOW_IN_DIVE_BAR_ONLY);
    }
}
