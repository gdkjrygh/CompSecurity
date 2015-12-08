// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.SkyLib;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.util.AccountLifetimeObject;
import com.skype.android.util.ContactUtil;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            PromotedSCDContactsInfo, OnPromotedSCDContactsSearchCompleted

public class PromotedSCDContactsManager extends AccountLifetimeObject
{

    private EcsConfiguration configuration;
    private ContactUtil contactUtil;
    private EventBus eventBus;
    private AtomicBoolean initialized;
    private SkyLib lib;
    private final BlockingQueue requestQueue = new LinkedBlockingQueue();
    private Map requests;
    private UserPreferences userPrefs;
    private Provider userPrefsProvider;

    public PromotedSCDContactsManager(SkyLib skylib, ContactUtil contactutil, Provider provider, EcsConfiguration ecsconfiguration, EventBus eventbus)
    {
        requests = new ConcurrentHashMap();
        initialized = new AtomicBoolean(false);
        lib = skylib;
        contactUtil = contactutil;
        userPrefsProvider = provider;
        configuration = ecsconfiguration;
        eventBus = eventbus;
        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    private Set getContactIdentities(List list)
    {
        HashSet hashset = new HashSet(list.size());
        for (list = list.iterator(); list.hasNext(); hashset.add(((ContactItem)list.next()).getIdentity())) { }
        return hashset;
    }

    private PromotedSCDContactsInfo getPromotedSCDContactsInfo()
    {
        return getUserPreferences().getPromotedSCDContactsInfo();
    }

    private UserPreferences getUserPreferences()
    {
        if (userPrefs == null)
        {
            userPrefs = (UserPreferences)userPrefsProvider.get();
        }
        return userPrefs;
    }

    private boolean hasPendingRequests(boolean flag)
    {
        for (Iterator iterator = requests.values().iterator(); iterator.hasNext();)
        {
            if (((Boolean)iterator.next()).booleanValue() == flag)
            {
                return true;
            }
        }

        return false;
    }

    private void persistPromotedSCDContacts(Set set)
    {
        set = new PromotedSCDContactsInfo(System.currentTimeMillis() / 1000L, set);
        if (!getUserPreferences().hasPromotedSCDContacts())
        {
            set.markContactsAsUnseen();
        }
        updatePromotedSCDContactsInfo(set);
    }

    private boolean shouldPersist(Set set)
    {
        if (getUserPreferences().hasPromotedSCDContacts()) goto _L2; else goto _L1
_L1:
        if (set.size() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        Object obj = getPromotedSCDContactsInfo();
        if (((PromotedSCDContactsInfo) (obj)).getContactIdentities().size() == set.size())
        {
            for (obj = ((PromotedSCDContactsInfo) (obj)).getContactIdentities().iterator(); ((Iterator) (obj)).hasNext();)
            {
                if (!set.contains((String)((Iterator) (obj)).next()))
                {
                    return true;
                }
            }

            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void updatePromotedSCDContactsInfo(PromotedSCDContactsInfo promotedscdcontactsinfo)
    {
        getUserPreferences().setPromotedSCDContactsInfo(promotedscdcontactsinfo);
    }

    public boolean areContactsSeen()
    {
        PromotedSCDContactsInfo promotedscdcontactsinfo = getPromotedSCDContactsInfo();
        return promotedscdcontactsinfo != null && promotedscdcontactsinfo.areContactsSeen();
    }

    public void findAllPromotedSCDContacts()
    {
        findPromotedSCDContacts(false);
    }

    public void findPromotedSCDContacts(boolean flag)
    {
        if (!initialized.get())
        {
            requestQueue.add(Boolean.valueOf(flag));
        } else
        if (!hasPendingRequests(flag))
        {
            int i = lib.findPromotedSCDContacts(flag);
            if (i > 0)
            {
                requests.put(Integer.valueOf(i), Boolean.valueOf(flag));
                return;
            }
            if (flag)
            {
                findAllPromotedSCDContacts();
                return;
            }
        }
    }

    public void markContactsAsSeen()
    {
        if (getUserPreferences().hasPromotedSCDContacts())
        {
            PromotedSCDContactsInfo promotedscdcontactsinfo = getPromotedSCDContactsInfo();
            if (!promotedscdcontactsinfo.areContactsSeen())
            {
                promotedscdcontactsinfo.markContactsAsSeen();
                updatePromotedSCDContactsInfo(promotedscdcontactsinfo);
            }
        }
    }

    boolean onAcceptEvent(com.skype.android.gen.SkyLibListener.OnInitialEasSyncDone oninitialeassyncdone)
    {
        return oninitialeassyncdone.getType() == com.skype.SkyLib.CONTACT_SYNC_TYPE.CONTACT_SCD;
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnInitialEasSyncDone oninitialeassyncdone)
    {
        if (initialized.compareAndSet(false, true))
        {
            for (; !requestQueue.isEmpty(); findPromotedSCDContacts(((Boolean)requestQueue.poll()).booleanValue())) { }
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnPromotedSCDContactsFound onpromotedscdcontactsfound)
    {
        Object obj = Integer.valueOf(onpromotedscdcontactsfound.getRequestId());
        if (requests.containsKey(obj))
        {
            boolean flag = ((Boolean)requests.get(obj)).booleanValue();
            requests.remove(obj);
            int ai[] = onpromotedscdcontactsfound.getResultObjectIDList();
            ai = getContactIdentities(contactUtil.a(ai));
            if (!flag && shouldPersist(ai))
            {
                persistPromotedSCDContacts(ai);
            }
            onpromotedscdcontactsfound = new OnPromotedSCDContactsSearchCompleted(contactUtil, onpromotedscdcontactsfound, flag);
            eventBus.a(onpromotedscdcontactsfound);
            if (flag)
            {
                findAllPromotedSCDContacts();
            }
        }
    }

    public void onLogin()
    {
    }

    public void onLogout()
    {
        userPrefs = null;
        requests.clear();
        initialized.set(false);
    }

    public boolean shouldDisplayPromotedSCDContacts()
    {
        return configuration.isShortCircuitEnabled() && getUserPreferences().hasPromotedSCDContacts() && getPromotedSCDContactsInfo().shouldDisplayPromotedSCDContacts();
    }
}
