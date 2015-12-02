// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.i;
import com.facebook.contacts.a.b;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.models.EntrySection;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.facebook.widget.listview.BetterListView;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.contactcard:
//            aq, ap

public class HiddenEntryPickerActivity extends i
{

    private b p;
    private a q;
    private BetterListView r;
    private ContactDetails s;

    public HiddenEntryPickerActivity()
    {
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        p = (b)i().a(com/facebook/contacts/a/b);
        bundle = getIntent().getStringExtra("contact_id");
        bundle = new UserKey(n.FACEBOOK_CONTACT, bundle);
        s = p.b(bundle);
        if (s == null)
        {
            finish();
            return;
        } else
        {
            bundle = s.getContactInfoSection();
            setContentView(k.contacts_hidden_entry_picker_activity);
            c.a(this);
            q = (a)b(com.facebook.i.titlebar);
            r = (BetterListView)b(com.facebook.i.hidden_entry_list);
            q.setTitle(o.contact_pick_number_title);
            bundle = new aq(this, this, es.a(bundle.getHiddenEntries()));
            r.setAdapter(bundle);
            r.setOnItemClickListener(new ap(this));
            return;
        }
    }
}
