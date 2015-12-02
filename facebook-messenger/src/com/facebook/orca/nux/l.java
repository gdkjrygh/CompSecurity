// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.contacts.upload.ContactsUploadProgressMode;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.debug.log.b;
import com.facebook.orca.common.ui.titlebar.m;

// Referenced classes of package com.facebook.orca.nux:
//            k

class l extends BroadcastReceiver
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        b.b(k.e(), (new StringBuilder()).append("Updating state for action: ").append(context).toString());
        if (context.equals("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"))
        {
            context = (ContactsUploadState)intent.getParcelableExtra("state");
            intent = (ContactsUploadProgressMode)intent.getParcelableExtra("progress_mode");
            k.a(a, context, intent);
        } else
        if (context.equals("com.facebook.orca.common.ui.titlebar.DIVEBAR_STATE_CHANGED"))
        {
            context = (m)intent.getSerializableExtra("state");
            k.a(a, context);
            return;
        }
    }
}
