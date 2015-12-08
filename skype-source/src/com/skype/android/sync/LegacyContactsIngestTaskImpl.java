// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.Context;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.android.addressbook.ContactIngestionJNI;
import com.skype.android.addressbook.IngestionCallback;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.token.TokenRequestCallback;
import com.skype.android.config.FileUtil;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.permission.PermissionUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.sync:
//            ContactsIngestTask, AddressBookReader, ContactIngestionTokenRequest

public class LegacyContactsIngestTaskImpl
    implements TokenRequestCallback, ContactsIngestTask
{
    private final class a extends Throwable
    {

        private com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE ingestStatus;
        final LegacyContactsIngestTaskImpl this$0;

        public final com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE getStatus()
        {
            return ingestStatus;
        }

        public a(int i)
        {
            this$0 = LegacyContactsIngestTaskImpl.this;
            super();
            ingestStatus = com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.fromInt(i);
        }
    }


    private static final int CONTACT_CHUNK_SIZE = 80;
    private static final String DB_SUFFIX = "_ingestion.db";
    private static final int INVALID_ID = -999;
    private static final Logger log = Logger.getLogger(com/skype/android/sync/LegacyContactsIngestTaskImpl.getSimpleName());
    private static IngestionCallback staticIngestionCallback = new IngestionCallback() {

        public final void onBatchDone(int i, int j, int k)
        {
        }

        public final void onLookupDone(int i, int j, int k)
        {
        }

    };
    private AccountProvider accountProvider;
    private com.skype.android.addressbook.ContactIngestionJNI.ContactList allContacts;
    private ContactIngestionTokenRequest contactIngestionTokenRequest;
    private ContactUtil contactUtil;
    private final Context context;
    private ExecutorService executorService;
    private ContactIngestionJNI ingest;
    private long ingestStartTime;
    private IngestionCallback ingestionCallback;
    private MnvAnalytics mnvAnalytics;
    private NetworkUtil networkUtil;
    private String token;
    private com.skype.android.addressbook.ContactIngestionJNI.AuthTicketType tokenType;

    public LegacyContactsIngestTaskImpl(Context context1, AccountProvider accountprovider, ContactIngestionTokenRequest contactingestiontokenrequest, NetworkUtil networkutil, MnvAnalytics mnvanalytics, ContactUtil contactutil)
    {
        ingestionCallback = staticIngestionCallback;
        context = context1;
        accountProvider = accountprovider;
        contactIngestionTokenRequest = contactingestiontokenrequest;
        networkUtil = networkutil;
        mnvAnalytics = mnvanalytics;
        contactUtil = contactutil;
        ingest = new ContactIngestionJNI();
    }

    private void cleanUpOldDbFiles()
    {
        File file = context.getExternalFilesDir(null);
        if (file != null)
        {
            File afile[] = file.listFiles(new FilenameFilter() {

                final LegacyContactsIngestTaskImpl this$0;

                public final boolean accept(File file1, String s)
                {
                    return s.endsWith("_ingestion.db");
                }

            
            {
                this$0 = LegacyContactsIngestTaskImpl.this;
                super();
            }
            });
            if (afile != null)
            {
                int j = afile.length;
                for (int i = 0; i < j; i++)
                {
                    cleanupOldDb(afile[i]);
                    log.info("Successful cleanup");
                }

            }
        }
    }

    private void cleanupOldDb(File file)
    {
        File file1 = new File(context.getFilesDir(), file.getName());
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = null;
        Object obj2 = null;
        Exception exception;
        int i;
        try
        {
            obj = new BufferedInputStream(new FileInputStream(file));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new BufferedOutputStream(new FileOutputStream(file1));
_L5:
        i = ((BufferedInputStream) (obj)).read();
        if (i == -1) goto _L4; else goto _L3
_L3:
        ((BufferedOutputStream) (obj1)).write(i);
          goto _L5
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L9:
        FileUtil.closeStream(((java.io.Closeable) (obj2)));
        FileUtil.closeStream(((java.io.Closeable) (obj1)));
        log.throwing("LegacyContactsIngestTaskImpl", "doIngest", ((Throwable) (obj)));
_L7:
        file.delete();
_L2:
        return;
_L4:
        ((BufferedOutputStream) (obj1)).close();
        ((BufferedInputStream) (obj)).close();
        if (true) goto _L7; else goto _L6
_L6:
        break MISSING_BLOCK_LABEL_48;
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void completeIngest()
    {
        executorService.submit(new Runnable() {

            final LegacyContactsIngestTaskImpl this$0;

            public final void run()
            {
                doIngest();
            }

            
            {
                this$0 = LegacyContactsIngestTaskImpl.this;
                super();
            }
        });
    }

    private int configureIngestLib()
    {
        Object obj1 = accountProvider.get();
        Object obj = ((Account) (obj1)).getLiveidMembernameProp();
        String s = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s = ((Account) (obj1)).getSkypenameProp();
        }
        if (TextUtils.isEmpty(s))
        {
            log.warning("Failed to get account member name. Ingestion processing aborted.");
            return com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.INVALID_CONFIG_ITEM.toInt();
        }
        obj = (new StringBuilder()).append(s).append("_ingestion.db").toString();
        obj = new File(context.getFilesDir(), ((String) (obj)));
        int i = getDeviceCountryCodePrefix();
        obj1 = new com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet();
        ((com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet) (obj1)).addConfiguration(com.skype.android.addressbook.ContactIngestionJNI.CONFIG_KEY.ACCOUNT_NAME, s);
        if (i > 0)
        {
            String s1 = Integer.toString(i);
            ((com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet) (obj1)).addConfiguration(com.skype.android.addressbook.ContactIngestionJNI.CONFIG_KEY.COUNTRY_PREFIX, s1);
        }
        ((com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet) (obj1)).addConfiguration(com.skype.android.addressbook.ContactIngestionJNI.CONFIG_KEY.DATABASE_PATH, ((File) (obj)).getAbsolutePath());
        ((com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet) (obj1)).addConfiguration(com.skype.android.addressbook.ContactIngestionJNI.CONFIG_KEY.DATABASE_TMP, ((File) (obj)).getParent());
        ((com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet) (obj1)).addConfiguration(com.skype.android.addressbook.ContactIngestionJNI.CONFIG_KEY.SERVICE_APP_ID, "D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A");
        ((com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet) (obj1)).addConfiguration(com.skype.android.addressbook.ContactIngestionJNI.CONFIG_KEY.SERVICE_BASE_URL, "https://people.directory.live.com/people/");
        return ingest.configure(((com.skype.android.addressbook.ContactIngestionJNI.ConfigurationSet) (obj1)));
    }

    private void doIngest()
    {
        if (TextUtils.isEmpty(token))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        allContacts = (new AddressBookReader(context, new PermissionUtil(context))).getAllContactsLegacy();
        log.info((new StringBuilder("Address book reading completed. Elapsed time:")).append(getElapsedTime()).toString());
        if (allContacts == null || allContacts.size() == 0)
        {
            throw new a(com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.LOOKUP_NOT_RECOMMENDED.toInt());
        }
        break MISSING_BLOCK_LABEL_117;
        Object obj;
        obj;
        ingestionCallback.onLookupDone(((a) (obj)).getStatus().toInt(), 0, 0);
        return;
        int i = configureIngestLib();
        if (i != com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.OK.toInt())
        {
            throw new a(i);
        }
        break MISSING_BLOCK_LABEL_157;
        obj;
        ((Exception) (obj)).printStackTrace();
_L1:
        log.info("address book reading complete");
        return;
        int j = updateIngestContacts();
        log.info((new StringBuilder("Ingestion library update completed. Elapsed time:")).append(getElapsedTime()).toString());
        if (j != com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.OK.toInt())
        {
            throw new a(j);
        }
        j = performIngestUpdate(token);
        if (isNotContinuing(j))
        {
            throw new a(j);
        }
          goto _L1
    }

    private boolean isNotContinuing(int i)
    {
        return i != com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.IN_PROGRESS.toInt() && i != com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.OK.toInt();
    }

    private int performIngestUpdate(String s)
    {
        return ingest.performLookup(tokenType, s, ingestionCallback).toInt();
    }

    private void requestToken()
    {
        log.info("Requesting token");
        contactIngestionTokenRequest.requestToken(this);
    }

    private int updateIngestContacts()
    {
        log.info((new StringBuilder("Updating contact ingest db. ")).append(allContacts.getStats()).toString());
        int j = 0;
        int i = 0;
        for (int k = allContacts.size(); i < k && j == 0; i += 80)
        {
            com.skype.android.addressbook.ContactIngestionJNI.ContactList contactlist = allContacts.getSubset(i, 80);
            j = ingest.addOrUpdateContacts("DCON", (com.skype.android.addressbook.ContactIngestionJNI.ContactList)contactlist);
        }

        return j;
    }

    public void cleanup()
    {
        this;
        JVM INSTR monitorenter ;
        log.info("Contacts ingest task cancelled.");
        ingest.cleanup();
        if (allContacts != null)
        {
            allContacts.clear();
        }
        ingestionCallback.onLookupDone(com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.ABORTED.toInt(), 0, 0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int getDeviceCountryCodePrefix()
    {
        CountryCode countrycode = networkUtil.a(contactUtil, accountProvider.get());
        if (countrycode == null)
        {
            return -1;
        } else
        {
            return countrycode.c();
        }
    }

    public long getElapsedTime()
    {
        return System.currentTimeMillis() - ingestStartTime;
    }

    public void onTokenRetrieved(com.skype.android.app.token.AbstractTokenRequest.TokenAccount tokenaccount, String s)
    {
        if (tokenaccount == com.skype.android.app.token.AbstractTokenRequest.TokenAccount.SKYPE)
        {
            tokenaccount = com.skype.android.addressbook.ContactIngestionJNI.AuthTicketType.AUTH_SkypeToken;
        } else
        {
            tokenaccount = com.skype.android.addressbook.ContactIngestionJNI.AuthTicketType.AUTH_LiveIDToken;
        }
        tokenType = tokenaccount;
        token = s;
        completeIngest();
    }

    public void run()
    {
        try
        {
            log.warning("Starting native address book scrape");
            log.warning((new StringBuilder("IngestionLib version: 0x")).append(Integer.toHexString((int)ingest.getVersion())).toString());
            mnvAnalytics.report(AnalyticsEvent.bA);
            ingestStartTime = System.currentTimeMillis();
            cleanUpOldDbFiles();
            requestToken();
            return;
        }
        catch (Exception exception)
        {
            log.throwing("LegacyContactsIngestTaskImpl", "run", exception);
        }
    }

    public void setExecutorService(ExecutorService executorservice)
    {
        executorService = executorservice;
    }

    public void setIngestionCallback(IngestionCallback ingestioncallback)
    {
        ingestionCallback = ingestioncallback;
    }


}
