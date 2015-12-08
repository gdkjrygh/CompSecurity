// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.NotificationManager;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment, ContactRequestDeclineDialog

final class this._cls0
    implements android.view.ProfileFragment._cls9
{

    final ContactProfileFragment this$0;

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f100274)
        {
            view = contactUtil;
            ContactUtil.o(ContactProfileFragment.access$100(ContactProfileFragment.this));
            requestMessage.setVisibility(8);
            contactRequestButtonContainer.setVisibility(8);
            notificationManager.cancel(ContactProfileFragment.access$100(ContactProfileFragment.this).getObjectID());
            return;
        } else
        {
            SkypeDialogFragment.create(ContactProfileFragment.access$100(ContactProfileFragment.this), com/skype/android/app/contacts/ContactRequestDeclineDialog).show(getActivity().getSupportFragmentManager());
            return;
        }
    }

    og()
    {
        this$0 = ContactProfileFragment.this;
        super();
    }
}
