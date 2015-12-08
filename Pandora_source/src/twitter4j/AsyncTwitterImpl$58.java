// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            TwitterMethod

class ncTask extends ncTask
{

    final AsyncTwitterImpl this$0;
    final String val$profileBackgroundColor;
    final String val$profileLinkColor;
    final String val$profileSidebarBorderColor;
    final String val$profileSidebarFillColor;
    final String val$profileTextColor;

    public void invoke(List list)
        throws TwitterException
    {
        User user = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).updateProfileColors(val$profileBackgroundColor, val$profileTextColor, val$profileLinkColor, val$profileSidebarFillColor, val$profileSidebarBorderColor);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.updatedProfileColors(user);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(String s3, 
            String s4)
    {
        this$0 = final_asynctwitterimpl;
        val$profileBackgroundColor = s;
        val$profileTextColor = s1;
        val$profileLinkColor = String.this;
        val$profileSidebarFillColor = s3;
        val$profileSidebarBorderColor = s4;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
