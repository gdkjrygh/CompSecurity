// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.q;
import com.facebook.base.activity.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

public class ContactCardActivity extends i
{

    private ContactCardFragment p;
    private q q;

    public ContactCardActivity()
    {
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.contacts_card);
        q = (q)i().a(android/support/v4/app/q);
        p = (ContactCardFragment)q.a(com.facebook.i.contact_card_fragment);
        try
        {
            bundle = UserKey.a(getIntent().getStringExtra("userKey"));
            p.a(bundle, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            finish();
        }
    }
}
