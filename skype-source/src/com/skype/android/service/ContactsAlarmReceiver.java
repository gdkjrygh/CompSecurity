// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.content.Context;
import android.content.Intent;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.sync.ContactsIngestManager;

public class ContactsAlarmReceiver extends SkypeBroadcastReceiver
{

    ContactsIngestManager contactsIngestManager;

    public ContactsAlarmReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        contactsIngestManager.runNow();
    }
}
