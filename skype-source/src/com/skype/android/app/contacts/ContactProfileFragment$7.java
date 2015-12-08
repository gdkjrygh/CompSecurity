// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.View;
import com.skype.Contact;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment, ContactMoodMessageFragment

final class this._cls0
    implements android.view.ProfileFragment._cls7
{

    final ContactProfileFragment this$0;

    public final void onClick(View view)
    {
        view = getFragmentManager().a();
        ContactMoodMessageFragment contactmoodmessagefragment = new ContactMoodMessageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.skype.objId", ContactProfileFragment.access$100(ContactProfileFragment.this).getObjectID());
        contactmoodmessagefragment.setArguments(bundle);
        view.a(0x1020002, contactmoodmessagefragment);
        view.a(ContactProfileFragment.access$100(ContactProfileFragment.this).getIdentity());
        view.a();
    }

    t()
    {
        this$0 = ContactProfileFragment.this;
        super();
    }
}
