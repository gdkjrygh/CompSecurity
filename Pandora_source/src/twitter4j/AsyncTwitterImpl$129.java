// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            TwitterMethod

class cTask extends cTask
{

    final AsyncTwitterImpl this$0;
    final String val$description;
    final boolean val$isPublicList;
    final String val$listName;

    public void invoke(List list)
        throws TwitterException
    {
        UserList userlist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).createUserList(val$listName, val$isPublicList, val$description);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.createdUserList(userlist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(boolean flag, String s1)
    {
        this$0 = final_asynctwitterimpl;
        val$listName = String.this;
        val$isPublicList = flag;
        val$description = s1;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
