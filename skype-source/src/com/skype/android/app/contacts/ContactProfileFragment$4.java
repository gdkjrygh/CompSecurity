// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.view.View;
import com.skype.PROPKEY;
import com.skype.android.app.Navigation;
import com.skype.android.app.main.EditPropertyActivity;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment

final class this._cls0
    implements android.view.ProfileFragment._cls4
{

    final ContactProfileFragment this$0;

    public final void onClick(View view)
    {
        view = navigation.intentFor(ContactProfileFragment.access$100(ContactProfileFragment.this), com/skype/android/app/main/EditPropertyActivity);
        view.putExtra("com.skype.propkey", PROPKEY.CONTACT_GIVEN_DISPLAYNAME);
        startActivity(view);
    }

    ()
    {
        this$0 = ContactProfileFragment.this;
        super();
    }
}
