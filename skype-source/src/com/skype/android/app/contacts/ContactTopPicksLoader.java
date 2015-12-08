// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.ContactGroup;
import com.skype.PROPKEY;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem, ContactPopularityComparator, ContactNameComparator

public class ContactTopPicksLoader
    implements Callable
{

    private static final int TOP_PICKS_MAX_COUNT = 9;
    private SkyLib lib;
    private ObjectIdMap map;

    public ContactTopPicksLoader(SkyLib skylib, ObjectIdMap objectidmap)
    {
        lib = skylib;
        map = objectidmap;
    }

    private int[] getContactGroupObjectIds(com.skype.ContactGroup.TYPE type)
    {
        int i = lib.getHardwiredContactGroup(type);
        return ((ContactGroup)map.a(i, com/skype/ContactGroup)).getContacts().m_contactObjectIDList;
    }

    private boolean isFavorite(ContactItem contactitem, Proptable proptable)
    {
        for (int i = 0; i < proptable.getCount(); i++)
        {
            if (proptable.getStr(i, PROPKEY.CONVERSATION_IDENTITY.toInt()).equalsIgnoreCase(contactitem.getIdentity()))
            {
                return true;
            }
        }

        return false;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        TreeSet treeset = new TreeSet(new ContactPopularityComparator());
        ProptableImpl proptableimpl = new ProptableImpl();
        lib.getConversationTable(com.skype.Conversation.LIST_TYPE.PINNED_CONVERSATIONS, new PROPKEY[] {
            PROPKEY.CONVERSATION_IDENTITY
        }, proptableimpl);
        int ai[] = getContactGroupObjectIds(com.skype.ContactGroup.TYPE.ALL_KNOWN_CONTACTS);
        Object obj = new ProptableImpl();
        lib.getPropertyTable(ai, ContactItem.CONTACT_PROPKEYS, ((Proptable) (obj)));
        int i = 0;
        do
        {
            if (i >= ((Proptable) (obj)).getCount())
            {
                break;
            }
            ContactItem contactitem = new ContactItem(((Proptable) (obj)), i);
            if (contactitem.getPopularityOrder() > 0 && !contactitem.isBlocked() && !isFavorite(contactitem, proptableimpl))
            {
                treeset.add(contactitem);
            }
            if (treeset.size() >= 9)
            {
                break;
            }
            i++;
        } while (true);
        boolean flag1 = false;
        obj = new ArrayList(treeset);
        if (treeset.size() < 9)
        {
            int ai1[] = getContactGroupObjectIds(com.skype.ContactGroup.TYPE.ALL_BUDDIES);
            ProptableImpl proptableimpl1;
            boolean flag;
            int j;
            if (ai1.length < 9)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ((List) (obj)).clear();
            }
            proptableimpl1 = new ProptableImpl();
            lib.getPropertyTable(ai1, ContactItem.CONTACT_PROPKEYS, proptableimpl1);
            j = 0;
            do
            {
                flag1 = flag;
                if (j >= proptableimpl1.getCount())
                {
                    break;
                }
                ContactItem contactitem1 = new ContactItem(proptableimpl1, j);
                if ((contactitem1.getPopularityOrder() <= 0 || flag) && !contactitem1.isBlocked() && !isFavorite(contactitem1, proptableimpl))
                {
                    ((List) (obj)).add(contactitem1);
                }
                flag1 = flag;
                if (((List) (obj)).size() >= 9)
                {
                    break;
                }
                j++;
            } while (true);
        }
        if (flag1)
        {
            Collections.sort(((List) (obj)), new ContactNameComparator());
        }
        return ((List) (obj));
    }
}
