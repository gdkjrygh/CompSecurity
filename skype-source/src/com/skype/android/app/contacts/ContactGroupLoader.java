// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Application;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.ContactGroup;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.contacts:
//            ExternalContactQueryHelper, ContactItem, ContactNameComparator

public class ContactGroupLoader
    implements Callable
{

    private static final Logger log = Logger.getLogger("ContactGroupLoader");
    private Account account;
    private int contactGroupObjId;
    private int contactObjectIds[];
    private String customGroupName;
    private boolean excludeBlocked;
    private boolean excludeContactRequest;
    private boolean excludeNotAuthorized;
    private final ExternalContactQueryHelper externalContactQueryHelper;
    private SkyLib lib;
    private ObjectIdMap map;
    private Set types;

    public ContactGroupLoader(SkyLib skylib, ObjectIdMap objectidmap, Account account1, com.skype.ContactGroup.TYPE type, boolean flag, boolean flag1, boolean flag2, 
            Application application, EcsConfiguration ecsconfiguration)
    {
        this(skylib, objectidmap, account1, ((Set) (EnumSet.of(type))), flag, flag1, flag2, application, ecsconfiguration);
    }

    public ContactGroupLoader(SkyLib skylib, ObjectIdMap objectidmap, Account account1, Set set, boolean flag, boolean flag1, boolean flag2, 
            Application application, EcsConfiguration ecsconfiguration)
    {
        this(skylib, objectidmap, account1, flag, flag1, flag2, application, ecsconfiguration);
        types = set;
    }

    private ContactGroupLoader(SkyLib skylib, ObjectIdMap objectidmap, Account account1, boolean flag, boolean flag1, boolean flag2, Application application, 
            EcsConfiguration ecsconfiguration)
    {
        lib = skylib;
        map = objectidmap;
        account = account1;
        excludeBlocked = flag;
        excludeNotAuthorized = flag1;
        excludeContactRequest = flag2;
        externalContactQueryHelper = new ExternalContactQueryHelper(application, ecsconfiguration);
    }

    public ContactGroupLoader(SkyLib skylib, ObjectIdMap objectidmap, Account account1, int ai[], boolean flag, boolean flag1, boolean flag2, 
            Application application, EcsConfiguration ecsconfiguration)
    {
        this(skylib, objectidmap, account1, flag, flag1, flag2, application, ecsconfiguration);
        contactObjectIds = ai;
    }

    private int[] getContactObjectIds(com.skype.ContactGroup.TYPE type)
    {
        int ai[] = new int[0];
        if (account != null && account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            if (type == com.skype.ContactGroup.TYPE.CUSTOM_GROUP)
            {
                type = getCustomGroup();
            } else
            {
                contactGroupObjId = lib.getHardwiredContactGroup(type);
                type = (ContactGroup)map.a(contactGroupObjId, com/skype/ContactGroup);
            }
            if (type != null)
            {
                ai = type.getContacts().m_contactObjectIDList;
            }
            return ai;
        } else
        {
            log.info("Account is signed out, can't load contacts");
            return ai;
        }
    }

    private ContactGroup getCustomGroup()
    {
        int ai[] = lib.getCustomContactGroups().m_groupObjectIDList;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            ContactGroup contactgroup = (ContactGroup)map.a(k, com/skype/ContactGroup);
            String s = contactgroup.getGivenDisplaynameProp();
            if (!TextUtils.isEmpty(s) && s.equals(customGroupName))
            {
                return contactgroup;
            }
        }

        return null;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
    {
        if (types != null)
        {
            Object obj = new HashSet();
            for (Iterator iterator = types.iterator(); iterator.hasNext();)
            {
                int ai[] = getContactObjectIds((com.skype.ContactGroup.TYPE)iterator.next());
                int l = ai.length;
                int i = 0;
                while (i < l) 
                {
                    ((HashSet) (obj)).add(Integer.valueOf(ai[i]));
                    i++;
                }
            }

            contactObjectIds = new int[((HashSet) (obj)).size()];
            int j = 0;
            for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                int i1 = ((Integer)((Iterator) (obj)).next()).intValue();
                contactObjectIds[j] = i1;
                j++;
            }

        }
        ProptableImpl proptableimpl = new ProptableImpl();
        lib.getPropertyTable(contactObjectIds, ContactItem.CONTACT_PROPKEYS, proptableimpl);
        ArrayList arraylist = new ArrayList(proptableimpl.getCount());
        int k = 0;
        while (k < proptableimpl.getCount()) 
        {
            ContactItem contactitem = new ContactItem(proptableimpl, k);
            boolean flag;
            boolean flag1;
            if (contactitem.getType() != com.skype.Contact.TYPE.XMPP)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1;
            if (flag1)
            {
                flag = flag1;
                if (excludeBlocked)
                {
                    if (!contactitem.isBlocked())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            flag1 = flag;
            if (flag)
            {
                flag1 = flag;
                if (excludeNotAuthorized)
                {
                    flag1 = contactitem.isAuthorized();
                }
            }
            flag = flag1;
            if (flag1)
            {
                flag = flag1;
                if (excludeContactRequest)
                {
                    if (contactitem.getAuthRequestCount() == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            if (flag)
            {
                arraylist.add(contactitem);
            }
            k++;
        }
        if (types != null && types.contains(com.skype.ContactGroup.TYPE.EXTERNAL_CONTACTS))
        {
            arraylist.addAll(externalContactQueryHelper.queryExternalResults());
        }
        Collections.sort(arraylist, new ContactNameComparator());
        return arraylist;
    }

    public void setCustomContactGroupName(String s)
    {
        customGroupName = s;
    }

}
