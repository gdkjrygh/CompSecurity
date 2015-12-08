// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.database.DatabaseUtils;
import com.skype.Account;
import com.skype.Contact;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem, ContactNameComparator

public class ContactSearchLoader
    implements Callable
{

    private Account account;
    private List excludedContactDbIds;
    private SkyLib lib;
    private ObjectIdMap map;
    private String searchTerm;

    public ContactSearchLoader(SkyLib skylib, ObjectIdMap objectidmap, Account account1, String s, List list)
    {
        lib = skylib;
        map = objectidmap;
        account = account1;
        searchTerm = s;
        excludedContactDbIds = new ArrayList();
        if (list.size() > 0)
        {
            for (int i = 0; i < list.size(); i++)
            {
                excludedContactDbIds.add(Integer.valueOf(((Contact)list.get(i)).getDbID()));
            }

        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (searchTerm != null)
        {
            String s = DatabaseUtils.sqlEscapeString((new StringBuilder("%")).append(searchTerm).append('%').toString());
            stringbuilder.append("(isauthorized = 1 AND ((displayname LIKE ");
            stringbuilder.append(s);
            stringbuilder.append(") OR (skypename LIKE ");
            stringbuilder.append(s);
            stringbuilder.append(")))");
            stringbuilder.append(" AND ");
        }
        stringbuilder.append("type = ");
        stringbuilder.append(com.skype.Contact.TYPE.SKYPE.toInt());
        stringbuilder.append(" AND ");
        stringbuilder.append(" id NOT IN (");
        if (excludedContactDbIds.size() > 0)
        {
            for (int i = 0; i < excludedContactDbIds.size(); i++)
            {
                stringbuilder.append(excludedContactDbIds.get(i));
                stringbuilder.append(',');
            }

        }
        stringbuilder.append(((Contact)map.a(account.getContactObjectID(), com/skype/Contact)).getDbID());
        stringbuilder.append(")");
        stringbuilder.append(" AND ");
        stringbuilder.append("(skypename <> 'echo123')");
        stringbuilder.append(" AND ");
        stringbuilder.append("(buddystatus <> 1 AND buddystatus <> 2)");
        stringbuilder.append(" AND ");
        stringbuilder.append("(isblocked is NULL OR isblocked <> 1)");
        Object obj = lib.findObjects(com.skype.SkyLib.OBJECTTYPE.CONTACT, stringbuilder.toString());
        if (((com.skype.SkyLib.FindObjects_Result) (obj)).m_return)
        {
            ProptableImpl proptableimpl = new ProptableImpl();
            lib.getPropertyTable(((com.skype.SkyLib.FindObjects_Result) (obj)).m_objectIDList, ContactItem.CONTACT_PROPKEYS, proptableimpl);
            obj = new ArrayList(proptableimpl.getCount());
            for (int j = 0; j < proptableimpl.getCount(); j++)
            {
                ((List) (obj)).add(new ContactItem(proptableimpl, j));
            }

            try
            {
                Collections.sort(((List) (obj)), new ContactNameComparator());
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return ((List) (obj));
            }
            return ((List) (obj));
        } else
        {
            return Collections.emptyList();
        }
    }

    public String getSearch()
    {
        return searchTerm;
    }
}
