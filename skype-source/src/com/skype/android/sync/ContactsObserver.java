// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.sync:
//            ContactsIngestManager

public class ContactsObserver extends ContentObserver
{

    private static final Logger log = Logger.getLogger("ContactsObserver");
    private ContactsIngestManager contactsIngestManager;

    public ContactsObserver(ContactsIngestManager contactsingestmanager)
    {
        super(new Handler());
        contactsIngestManager = contactsingestmanager;
    }

    public boolean deliverSelfNotifications()
    {
        return super.deliverSelfNotifications();
    }

    public void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public void onChange(boolean flag, Uri uri)
    {
        log.warning("Native address book changes detected, scheduling Contacts ingest.");
        contactsIngestManager.runDelayed();
    }

}
