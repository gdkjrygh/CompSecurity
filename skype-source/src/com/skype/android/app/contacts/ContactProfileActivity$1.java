// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.DialogInterface;
import com.skype.Contact;
import com.skype.android.app.Navigation;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileActivity

final class this._cls0
    implements android.content.Listener
{

    final ContactProfileActivity this$0;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (ContactProfileActivity.access$000(ContactProfileActivity.this).isMemberOfHardwiredGroup(com.skype.S_BLOCKED_BY_ME))
        {
            navigation.home();
        }
    }

    ()
    {
        this$0 = ContactProfileActivity.this;
        super();
    }
}
