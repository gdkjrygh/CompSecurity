// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.DialogInterface;
import com.skype.Contact;
import com.skype.android.event.EventBus;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactRemoveConfirmDialog, OnContactRemoved

final class this._cls0
    implements android.content.er
{

    final ContactRemoveConfirmDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            ContactRemoveConfirmDialog.access$000(ContactRemoveConfirmDialog.this).setBuddyStatus(false, false);
            dialoginterface = contactUtil;
            ContactUtil.n(ContactRemoveConfirmDialog.access$000(ContactRemoveConfirmDialog.this));
            eventBus.a(new OnContactRemoved(ContactRemoveConfirmDialog.access$000(ContactRemoveConfirmDialog.this)));
        }
    }

    A()
    {
        this$0 = ContactRemoveConfirmDialog.this;
        super();
    }
}
