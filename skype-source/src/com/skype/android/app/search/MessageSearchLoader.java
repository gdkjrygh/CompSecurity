// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.skype.Proptable;
import com.skype.SkyLib;
import java.util.Collections;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultLoader, MessageItem, MessageComparator

public class MessageSearchLoader extends SearchResultLoader
{

    public MessageSearchLoader(SkyLib skylib, String s)
    {
        super(com.skype.SkyLib.OBJECTTYPE.MESSAGE, MessageItem.MESSAGE_PROPKEYS, new MessageComparator(), skylib, s);
    }

    public String buildQuery()
    {
        String s = DatabaseUtils.sqlEscapeString((new StringBuilder("%")).append(searchTerm).append('%').toString());
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("chatmsg_type=3");
        if (!TextUtils.isEmpty(searchTerm))
        {
            stringbuilder.append(" AND body_xml LIKE ").append(s);
        }
        return stringbuilder.toString();
    }

    public SearchResultLoader.SearchResult call()
    {
        if (TextUtils.isEmpty(searchTerm) || searchTerm.length() < 3)
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

    public MessageItem getItem(Proptable proptable, int i)
    {
        return new MessageItem(lib, proptable, i);
    }

    public volatile Object getItem(Proptable proptable, int i)
    {
        return getItem(proptable, i);
    }
}
