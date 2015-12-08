// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import com.skype.android.app.Navigation;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment, ContactSendAuthRequestActivity

final class this._cls0
    implements android.view.rofileFragment._cls10
{

    final ContactProfileFragment this$0;

    public final void onClick(View view)
    {
        view = navigation.intentFor(ContactProfileFragment.access$100(ContactProfileFragment.this), com/skype/android/app/contacts/ContactSendAuthRequestActivity);
        startActivityForResult(view, 1);
        ContactProfileFragment.access$202(ContactProfileFragment.this, false);
    }

    vity()
    {
        this$0 = ContactProfileFragment.this;
        super();
    }
}
