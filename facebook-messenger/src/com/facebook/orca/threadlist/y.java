// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.contacts.upload.ContactsUploadState;

// Referenced classes of package com.facebook.orca.threadlist:
//            t

class y extends BroadcastReceiver
{

    final t a;

    y(t t1)
    {
        a = t1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = (ContactsUploadState)intent.getParcelableExtra("state");
        t.a(a, context);
    }
}
