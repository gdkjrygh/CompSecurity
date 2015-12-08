// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.app.Agent;
import com.skype.android.app.AgentComponent;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.config.ecs.OnEcsDone;
import com.skype.android.sync.ContactsObserver;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.service:
//            ContactsAlarmManager

public class ContactsScrapeAgent extends Agent
{

    private static final int PING = 1;
    private static final int POLL = -1;
    private static final int UNCHANGED = 0;
    private static final Logger log = Logger.getLogger("ContactsScrapeAgent");
    private EcsConfiguration configuration;
    private ContactsObserver contactObserver;
    private ContactsAlarmManager contactsAlarmManager;
    private Context context;
    private SkyLib lib;

    public ContactsScrapeAgent(Application application, ContactsObserver contactsobserver, EcsConfiguration ecsconfiguration, SkyLib skylib)
    {
        super(application);
        getComponent().inject(this);
        lib = skylib;
        contactsAlarmManager = new ContactsAlarmManager();
        contactObserver = contactsobserver;
        configuration = ecsconfiguration;
        context = application;
    }

    public void onEvent(OnEcsDone onecsdone)
    {
        if (onecsdone.getResult() == null) goto _L2; else goto _L1
_L1:
        int j = configuration.getEasSyncTypeValue();
        if (j == 0) goto _L4; else goto _L3
_L3:
        onecsdone = lib.getSetup();
        Logger logger;
        StringBuilder stringbuilder;
        int i;
        if (onecsdone.isDefined("*Lib/EAS/NotificationType"))
        {
            i = 1;
        } else
        {
            i = -1;
        }
        if (i == j) goto _L4; else goto _L5
_L5:
        j;
        JVM INSTR tableswitch -1 1: default 80
    //                   -1 152
    //                   0 80
    //                   1 139;
           goto _L6 _L7 _L6 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_152;
_L9:
        logger = log;
        stringbuilder = new StringBuilder("Changed EAS type to ");
        if (j == 1)
        {
            onecsdone = "PING";
        } else
        {
            onecsdone = "POLL";
        }
        logger.info(stringbuilder.append(onecsdone).append(" on next launch").toString());
_L4:
        log.info("ECS successfully initialized");
        start();
_L2:
        return;
_L8:
        onecsdone.setStr("*Lib/EAS/NotificationType", "Ping");
          goto _L9
        onecsdone.delete("*Lib/EAS/NotificationType");
          goto _L9
    }

    public void start()
    {
        if (configuration.isShortCircuitEnabled())
        {
            contactsAlarmManager.setAlarm(context);
            context.getContentResolver().registerContentObserver(android.provider.ContactsContract.Contacts.CONTENT_URI, true, contactObserver);
            return;
        } else
        {
            log.info("Short circuit not enabled, will not ingest contacts.");
            return;
        }
    }

    public void stop()
    {
        contactsAlarmManager.cancelAlarm(context);
        context.getContentResolver().unregisterContentObserver(contactObserver);
    }

}
