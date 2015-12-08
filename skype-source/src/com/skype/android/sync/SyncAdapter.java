// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.content.SyncStats;
import android.os.Bundle;
import com.skype.Account;
import com.skype.ContactGroup;
import com.skype.ContactGroupImpl;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.SkypeApplication;
import com.skype.android.inject.AccountProvider;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.util.MethodTrace;
import com.skype.android.util.TimeUtil;
import java.util.ArrayList;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.sync:
//            DaggerSyncAdapterComponent, b, SyncAdapterComponent, ContactOperationUtils

public class SyncAdapter extends AbstractThreadedSyncAdapter
{

    static Logger log = Logger.getLogger("SyncAdapter");
    AccountProvider accountProvider;
    private boolean canceled;
    private SyncAdapterComponent component;
    TimeUtil timeUtil;

    public SyncAdapter(Context context)
    {
        super(context, true);
    }

    private boolean apply(ArrayList arraylist, SyncResult syncresult)
    {
        try
        {
            getContext().getContentResolver().applyBatch("com.android.contacts", arraylist);
            arraylist = syncresult.stats;
            arraylist.numUpdates = ((SyncStats) (arraylist)).numUpdates + 1L;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            syncresult.databaseError = true;
            log.severe(arraylist.toString());
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            log.severe(arraylist.toString());
            return false;
        }
        return true;
    }

    private SyncAdapterComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerSyncAdapterComponent.builder().skypeApplicationComponent(((SkypeApplication)getContext().getApplicationContext()).a()).build();
        }
        return component;
    }

    private boolean isAccountOffline(Account account)
    {
        if (account != null)
        {
            com.skype.Contact.AVAILABILITY availability = account.getAvailabilityProp();
            account = account.getStatusProp();
            if (availability != com.skype.Contact.AVAILABILITY.OFFLINE && availability != com.skype.Contact.AVAILABILITY.OFFLINE_BUT_CF_ABLE && account != com.skype.Account.STATUS.LOGGED_OUT && account != com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
            {
                return false;
            }
        }
        return true;
    }

    private boolean isXmpp(b b1)
    {
        return b1.getType() == com.skype.Contact.TYPE.XMPP;
    }

    public void onPerformSync(android.accounts.Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
    {
        getComponent().inject(this);
        contentproviderclient = new MethodTrace("SyncAdapter", "onPerformSync");
        if (!"com.android.contacts".equals(s)) goto _L2; else goto _L1
_L1:
        SkyLib skylib;
        bundle = null;
        skylib = SkyLibInitializer.a().c();
        if (skylib != null)
        {
            bundle = accountProvider.get();
        } else
        {
            log.info("Sync called when skype not running, setting account offline.");
        }
        s = new ContactOperationUtils(getContext(), timeUtil);
        if (!isAccountOffline(bundle)) goto _L4; else goto _L3
_L3:
        s.setAllContactsOffline(account.name);
_L2:
        contentproviderclient.b();
_L8:
        return;
_L4:
        ProptableImpl proptableimpl;
        int i;
        bundle = bundle.getCblSyncStatusProp();
        if (bundle != com.skype.Account.CBLSYNCSTATUS.CBL_IN_SYNC)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        i = skylib.getHardwiredContactGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES);
        bundle = new ContactGroupImpl();
        skylib.getContactGroup(i, bundle);
        bundle = bundle.getContacts();
        proptableimpl = new ProptableImpl();
        skylib.getPropertyTable(((com.skype.ContactGroup.GetContacts_Result) (bundle)).m_contactObjectIDList, b.PROPKEYS, proptableimpl);
        i = 0;
_L9:
        if (i >= proptableimpl.getCount()) goto _L6; else goto _L5
_L5:
        if (canceled) goto _L8; else goto _L7
_L7:
        b b1 = new b(proptableimpl, i);
        if (!b1.isBlocked() && !b1.getIdentity().equals("echo123") && !isXmpp(b1))
        {
            int k = s.createGroup(account.name);
            if (k == -1)
            {
                log.info("Error creating a group for skype. We have to ignore this request and leave sync as is.");
            } else
            {
                ArrayList arraylist = s.updateContact(b1, account.name, k, true);
                Logger logger = log;
                StringBuilder stringbuilder = new StringBuilder();
                if (arraylist.size() > 0)
                {
                    bundle = "Wrote";
                } else
                {
                    bundle = "skipped";
                }
                logger.info(stringbuilder.append(bundle).append(" info for ").append(b1.getIdentity()).toString());
                if (apply(arraylist, syncresult))
                {
                    ArrayList arraylist1 = s.insertStatusAndMood(b1, account.name, true);
                    Logger logger1 = log;
                    StringBuilder stringbuilder1 = new StringBuilder();
                    if (arraylist1 != null && arraylist1.size() > 0)
                    {
                        bundle = "Wrote";
                    } else
                    {
                        bundle = "skipped";
                    }
                    logger1.info(stringbuilder1.append(bundle).append(" status for ").append(b1.getIdentity()).toString());
                    if (arraylist1 != null)
                    {
                        apply(arraylist1, syncresult);
                    }
                } else
                {
                    log.info("Some contact details could not be sync'd properly");
                }
            }
        }
        i++;
          goto _L9
_L6:
        account = new StringBuffer();
        for (int j = 0; j < proptableimpl.getCount() && !canceled; j++)
        {
            bundle = new b(proptableimpl, j);
            if (account.length() > 0)
            {
                account.append(",");
            }
            account.append("'");
            account.append(bundle.getIdentity());
            account.append("'");
        }

        apply(s.cleanUpOrphanRecords(account.toString()), syncresult);
        continue; /* Loop/switch isn't completed */
        log.info((new StringBuilder("CBL not in sync: ")).append(bundle).append(", ignoring contact sync request.").toString());
        if (true) goto _L2; else goto _L10
_L10:
    }

    public void onSyncCanceled()
    {
        log.info("sync canceled");
        canceled = true;
    }

}
