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
    final boolean val$isPublicList;
    final String val$newDescription;
    final String val$newListName;
    final long val$ownerId;
    final String val$slug;

    public void invoke(List list)
        throws TwitterException
    {
        UserList userlist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).updateUserList(val$ownerId, val$slug, val$newListName, val$isPublicList, val$newDescription);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.updatedUserList(userlist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(boolean flag, String s2)
    {
        this$0 = final_asynctwitterimpl;
        val$ownerId = l;
        val$slug = s;
        val$newListName = String.this;
        val$isPublicList = flag;
        val$newDescription = s2;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
