// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ab

class aa
    implements android.content.DialogInterface.OnClickListener
{

    final ConversationSettingsView.NotificationsSettingsDialogFragment a;

    aa(ConversationSettingsView.NotificationsSettingsDialogFragment notificationssettingsdialogfragment)
    {
        a = notificationssettingsdialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (ConversationSettingsView.NotificationsSettingsDialogFragment.a(a) != null)
        {
            ConversationSettingsView.NotificationsSettingsDialogFragment.a(a).a(i);
        }
        dialoginterface.dismiss();
    }
}
