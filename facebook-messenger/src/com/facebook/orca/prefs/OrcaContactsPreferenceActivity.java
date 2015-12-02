// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.app.AlertDialog;
import android.content.IntentFilter;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.support.v4.a.e;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.a.g;
import com.facebook.base.activity.p;
import com.facebook.common.h.a;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.contacts.upload.c;
import com.facebook.contacts.upload.k;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.o;
import java.text.NumberFormat;
import java.util.UUID;

// Referenced classes of package com.facebook.orca.prefs:
//            y, s, x, v, 
//            u, t, w, r

public class OrcaContactsPreferenceActivity extends p
    implements d
{

    private y a;
    private com.facebook.widget.titlebar.a b;
    private e c;
    private Preference d;
    private Preference e;
    private c f;
    private com.facebook.fbservice.ops.c g;
    private av h;
    private com.facebook.prefs.shared.d i;

    public OrcaContactsPreferenceActivity()
    {
        a = y.NOT_STARTED;
    }

    static com.facebook.fbservice.ops.c a(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        return orcacontactspreferenceactivity.g;
    }

    private void a(PreferenceGroup preferencegroup)
    {
        d = new Preference(this);
        a(y.NOT_STARTED);
        d.setOnPreferenceClickListener(new s(this));
        preferencegroup.addPreference(d);
    }

    private void a(ContactsUploadState contactsuploadstate)
    {
        NumberFormat numberformat = NumberFormat.getPercentInstance();
        numberformat.setMaximumFractionDigits(0);
        switch (x.b[contactsuploadstate.a().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            e.setTitle(getString(o.preference_contacts_sync_contacts_title));
            e.setEnabled(true);
            return;

        case 2: // '\002'
            e.setTitle(getString(o.preference_contacts_sync_contacts_syncing, new Object[] {
                numberformat.format(0L)
            }));
            e.setEnabled(false);
            return;

        case 3: // '\003'
            float f1 = 0.0F;
            if (contactsuploadstate.d() > 0)
            {
                f1 = (float)contactsuploadstate.c() / (float)contactsuploadstate.d();
            }
            e.setTitle(getString(o.preference_contacts_sync_contacts_syncing, new Object[] {
                numberformat.format(f1)
            }));
            e.setEnabled(false);
            return;

        case 4: // '\004'
            e.setTitle(getString(o.preference_contacts_sync_contacts_synced));
            e.setEnabled(true);
            return;

        case 5: // '\005'
            e.setTitle(getString(o.preference_contacts_sync_contacts_error));
            e.setEnabled(false);
            return;
        }
    }

    static void a(OrcaContactsPreferenceActivity orcacontactspreferenceactivity, ContactsUploadState contactsuploadstate)
    {
        orcacontactspreferenceactivity.a(contactsuploadstate);
    }

    static void a(OrcaContactsPreferenceActivity orcacontactspreferenceactivity, y y1)
    {
        orcacontactspreferenceactivity.a(y1);
    }

    private void a(y y1)
    {
        a = y1;
        switch (com.facebook.orca.prefs.x.a[a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            d.setTitle(o.preference_contacts_delete_contacts_title);
            d.setEnabled(true);
            return;

        case 2: // '\002'
            d.setTitle(o.preference_contacts_delete_contacts_deleting);
            d.setEnabled(false);
            return;

        case 3: // '\003'
            d.setTitle(o.preference_contacts_delete_contacts_deleted);
            d.setEnabled(true);
            return;

        case 4: // '\004'
            d.setTitle(o.preference_contacts_delete_contacts_error);
            break;
        }
        d.setEnabled(false);
    }

    private void b(PreferenceGroup preferencegroup)
    {
        e = new Preference(this);
        a(ContactsUploadState.e());
        e.setOnPreferenceClickListener(new v(this));
        preferencegroup.addPreference(e);
    }

    static void b(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        orcacontactspreferenceactivity.c();
    }

    static av c(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        return orcacontactspreferenceactivity.h;
    }

    private void c()
    {
        String s1 = com.facebook.common.h.a.a().toString();
        h.a((new cb("click")).a(g_()).f("button").h(s1).g("orca_preferences_delete_synced_contacts_preference"));
        (new android.app.AlertDialog.Builder(this)).setTitle(o.preference_contacts_delete_contacts_title).setMessage(o.preference_contacts_delete_contacts_dialog_message).setPositiveButton(o.dialog_delete, new u(this, s1)).setNegativeButton(o.dialog_cancel, new com.facebook.orca.prefs.t(this, s1)).create().show();
    }

    static y d(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        return orcacontactspreferenceactivity.a;
    }

    private void d()
    {
        w w1 = new w(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        c.a(w1, intentfilter);
    }

    static void e(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        orcacontactspreferenceactivity.d();
    }

    static c f(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        return orcacontactspreferenceactivity.f;
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        com.facebook.base.a.g.a(this);
        bundle = t.a(this);
        c = (e)bundle.a(android/support/v4/a/e);
        f = (c)bundle.a(com/facebook/contacts/upload/c);
        g = (com.facebook.fbservice.ops.c)bundle.a(com/facebook/fbservice/ops/c);
        h = (av)bundle.a(com/facebook/analytics/av);
        i = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        setContentView(com.facebook.k.orca_preferences);
        com.facebook.widget.titlebar.c.a(this);
        b = (com.facebook.widget.titlebar.a)a(i.titlebar);
        b.setTitle(getString(o.preference_contacts_title));
        bundle = getPreferenceManager().createPreferenceScreen(this);
        a(bundle);
        b(((PreferenceGroup) (bundle)));
        setPreferenceScreen(bundle);
        g.a(new r(this));
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_CONTACTS_PREFERENCE_ACTIVITY_NAME;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        g.b(bundle);
    }

    protected void onResume()
    {
        super.onResume();
        if (i.a(com.facebook.contacts.upload.a.b, false))
        {
            a(f.b());
            d();
        }
        if (g.b())
        {
            a(y.IN_PROGRESS);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        g.a(bundle);
    }
}
