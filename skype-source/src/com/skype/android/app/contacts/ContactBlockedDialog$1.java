// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.DialogInterface;
import com.skype.Contact;
import com.skype.android.app.Navigation;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactBlockedDialog

final class this._cls0
    implements android.content.Listener
{

    final ContactBlockedDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            ContactBlockedDialog.access$000(ContactBlockedDialog.this).setBlocked(false, false);
            nav.chat(ContactBlockedDialog.access$000(ContactBlockedDialog.this));
        }
    }

    ()
    {
        this$0 = ContactBlockedDialog.this;
        super();
    }
}
