// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.skype.Proptable;
import com.skype.SkyLib;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.recents.RecentItem;
import java.util.Collections;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultLoader, ConversationComparator

public class ConversationSearchLoader extends SearchResultLoader
{

    public ConversationSearchLoader(SkyLib skylib, String s)
    {
        super(com.skype.SkyLib.OBJECTTYPE.CONVERSATION, RecentItem.CONVERSATION_PROPKEYS, new ConversationComparator(), skylib, s);
    }

    public String buildQuery()
    {
        String s = DatabaseUtils.sqlEscapeString((new StringBuilder("%")).append(searchTerm).append('%').toString());
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("type = ").append(com.skype.Conversation.TYPE.CONFERENCE.toInt());
        if (!TextUtils.isEmpty(searchTerm))
        {
            stringbuilder.append(" AND displayname LIKE ").append(s);
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

    public Recent getItem(Proptable proptable, int i)
    {
        return new RecentItem(proptable, i);
    }

    public volatile Object getItem(Proptable proptable, int i)
    {
        return getItem(proptable, i);
    }
}
