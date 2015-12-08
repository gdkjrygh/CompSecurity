// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.Context;
import android.os.SystemClock;
import com.skype.SkyLib;
import com.skype.android.addressbook.ContactList;
import com.skype.android.addressbook.IngestionCallback;
import com.skype.android.addressbook.PropertySet;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.util.permission.PermissionUtil;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.sync:
//            ContactsIngestTask, AddressBookReader

public class SkyLibContactsIngest
    implements ContactsIngestTask
{

    private static final int NUM_EMAILS_ARGS = 3;
    private static final int NUM_PHONES_ARGS = 3;
    private static final Logger log = Logger.getLogger("SkyLibContactsIngest");
    private final Context context;
    private long ingestStartTime;
    private IngestionCallback ingestionCallback;
    private volatile boolean killed;
    private final SkyLib lib;
    private MnvAnalytics mnvAnalytics;
    private final PermissionUtil permissionUtil;

    public SkyLibContactsIngest(Context context1, SkyLib skylib, MnvAnalytics mnvanalytics)
    {
        killed = false;
        ingestionCallback = null;
        context = context1;
        lib = skylib;
        mnvAnalytics = mnvanalytics;
        permissionUtil = new PermissionUtil(context1);
    }

    private void doIngest()
    {
        log.info("doIngest");
        mnvAnalytics.report(AnalyticsEvent.bA);
        ContactList contactlist = (new AddressBookReader(context, permissionUtil)).getAllContacts();
        int i;
        int j;
        int k;
        if (contactlist != null)
        {
            i = contactlist.size();
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            sendLookupDone(com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.LOOKUP_NOT_RECOMMENDED.toInt(), 0, 0);
        }
        k = 0;
        for (j = 0; j < i && !killed;)
        {
            PropertySet propertyset = contactlist.getContact(j);
            int l = k;
            if (propertyset.hasData())
            {
                l = k + 1;
                List list = propertyset.getPhones(3);
                List list1 = propertyset.getEmails(3);
                lib.ingestAddContactInfo(propertyset.getId(), (String)list.get(0), (String)list.get(1), (String)list.get(2), (String)list1.get(0), (String)list1.get(1), (String)list1.get(2));
            }
            j++;
            k = l;
        }

        if (killed)
        {
            log.info("doIngest killed");
            sendLookupDone(com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.ABORTED.toInt(), 0, 0);
        } else
        {
            lib.ingestLookup();
            sendLookupDone(com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.OK.toInt(), j, k);
        }
        log.info("doIngest finished");
    }

    private void sendLookupDone(int i, int j, int k)
    {
        if (ingestionCallback != null)
        {
            ingestionCallback.onLookupDone(i, j, k);
        }
    }

    public void cleanup()
    {
        killed = true;
    }

    public long getElapsedTime()
    {
        return SystemClock.elapsedRealtime() - ingestStartTime;
    }

    public void run()
    {
        ingestStartTime = SystemClock.elapsedRealtime();
        doIngest();
    }

    public void setExecutorService(ExecutorService executorservice)
    {
    }

    public void setIngestionCallback(IngestionCallback ingestioncallback)
    {
        ingestionCallback = ingestioncallback;
    }

}
