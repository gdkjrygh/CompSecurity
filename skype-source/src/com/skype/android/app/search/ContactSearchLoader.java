// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.skype.Proptable;
import com.skype.SkyLib;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.settings.UserPreferences;
import java.util.Collections;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultLoader, ContactComparator

public class ContactSearchLoader extends SearchResultLoader
{

    public static String CONTACTS_BLOCKED_BY_ME = "0x200";
    public static String DECLINED_CONTACTS = "0";
    public static String SCD_CONTACTS = "0x40000";
    private final UserPreferences userPrefs;

    public ContactSearchLoader(SkyLib skylib, String s, UserPreferences userpreferences)
    {
        super(com.skype.SkyLib.OBJECTTYPE.CONTACT, ContactItem.CONTACT_PROPKEYS, new ContactComparator(), skylib, s);
        userPrefs = userpreferences;
    }

    public String buildQuery()
    {
        String s = DatabaseUtils.sqlEscapeString((new StringBuilder("%")).append(searchTerm).append('%').toString());
        StringBuilder stringbuilder = new StringBuilder();
        if (!userPrefs.isAutoBuddyEnabledInLocalCache())
        {
            stringbuilder.append("group_membership &").append(SCD_CONTACTS).append(" = 0 AND ");
        }
        stringbuilder.append("group_membership &").append(CONTACTS_BLOCKED_BY_ME).append(" = 0 AND ");
        stringbuilder.append("group_membership != ").append(DECLINED_CONTACTS);
        if (!TextUtils.isEmpty(searchTerm))
        {
            stringbuilder.append(" AND (displayname LIKE ").append(s);
            stringbuilder.append(" OR skypename LIKE ").append(s).append(")");
        }
        return stringbuilder.toString();
    }

    public SearchResultLoader.SearchResult call()
    {
        if (TextUtils.isEmpty(searchTerm))
        {
            return new SearchResultLoader.SearchResult(this, Collections.emptyList(), searchTerm);
        } else
        {
            return super.call();
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public ContactItem getItem(Proptable proptable, int i)
    {
        return new ContactItem(proptable, i);
    }

    public volatile Object getItem(Proptable proptable, int i)
    {
        return getItem(proptable, i);
    }

}
