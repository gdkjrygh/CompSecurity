// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.database.DatabaseUtils;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.app.recents.RecentItem;
import com.skype.android.app.search.ConversationComparator;
import com.skype.android.app.settings.UserPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class ConversationLoader
    implements Callable
{

    public static String CONTACTS_BLOCKED_BY_ME = "0x200";
    public static String DECLINED_CONTACTS = "0";
    public static String SCD_CONTACTS = "0x40000";
    private boolean isConversationEnabled;
    private final SkyLib lib;
    private final UserPreferences userPrefs;

    public ConversationLoader(SkyLib skylib, UserPreferences userpreferences, boolean flag)
    {
        isConversationEnabled = false;
        isConversationEnabled = flag;
        lib = skylib;
        userPrefs = userpreferences;
    }

    public String buildConversationQuery()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = DatabaseUtils.sqlEscapeString("%%");
        stringbuilder.append("identity NOT IN (SELECT Contacts.skypename FROM Contacts WHERE ");
        stringbuilder.append("Contacts.skypename IS NOT NULL AND (");
        if (!userPrefs.isAutoBuddyEnabledInLocalCache())
        {
            stringbuilder.append("Contacts.group_membership &").append(SCD_CONTACTS).append(" > 0 OR ");
        }
        stringbuilder.append("Contacts.group_membership & ").append(CONTACTS_BLOCKED_BY_ME).append(" > 0 OR ");
        stringbuilder.append("Contacts.group_membership = ").append(DECLINED_CONTACTS).append(")) AND ");
        stringbuilder.append("(displayname LIKE ").append(s);
        stringbuilder.append(" AND (type = ");
        stringbuilder.append(com.skype.Conversation.TYPE.DIALOG.toInt());
        if (isConversationEnabled)
        {
            stringbuilder.append(" OR type = ");
            stringbuilder.append(com.skype.Conversation.TYPE.CONFERENCE.toInt());
        }
        stringbuilder.append("))");
        return stringbuilder.toString();
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
    {
        Object obj = lib.findObjects(com.skype.SkyLib.OBJECTTYPE.CONVERSATION, buildConversationQuery());
        if (((com.skype.SkyLib.FindObjects_Result) (obj)).m_return)
        {
            ProptableImpl proptableimpl = new ProptableImpl();
            lib.getPropertyTable(((com.skype.SkyLib.FindObjects_Result) (obj)).m_objectIDList, RecentItem.CONVERSATION_PROPKEYS, proptableimpl);
            obj = new ArrayList(proptableimpl.getCount());
            for (int i = 0; i < proptableimpl.getCount(); i++)
            {
                ((List) (obj)).add(new RecentItem(proptableimpl, i));
            }

            try
            {
                Collections.sort(((List) (obj)), new ConversationComparator());
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

}
