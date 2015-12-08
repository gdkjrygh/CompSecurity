// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import AB;
import Fd;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui:
//            FrivolousAnimationView

public class FeedReplayAnimationView extends FrivolousAnimationView
{

    private static int b = 0x7f020163;
    private static int c = 0x7f020037;

    public FeedReplayAnimationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private static boolean a(Fd fd)
    {
        return System.currentTimeMillis() - fd.c <= 500L;
    }

    public static boolean a(ChatFeedItem chatfeeditem)
    {
        return (chatfeeditem instanceof AB) && !TextUtils.isEmpty(((AB)chatfeeditem).mSecondaryText) && !((AB)chatfeeditem).D();
    }

    public static boolean a(List list)
    {
        if (list == null || list.size() == 0)
        {
            return false;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            if (a((ChatFeedItem)list.next()))
            {
                return true;
            }
        }

        return false;
    }

    public void setDisplayedIcon(List list, ChatConversation chatconversation)
    {
        Fd fd;
        setBackgroundResource(0);
        super.a = 0x8000000000000000L;
        fd = null;
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        if (chatconversation != null && (chatconversation.mIsStub || TextUtils.equals(chatconversation.mConversationInteractionEventType, "friend_event")))
        {
            fd = new Fd(b);
        } else
        {
            fd = new Fd(c);
        }
_L4:
        if (fd != null)
        {
            if (a(fd))
            {
                a(fd.c);
            }
            setIconResource(fd);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (list.size() == 1)
        {
            fd = ((ChatFeedItem)list.get(0)).a(this, chatconversation);
        }
        if (true) goto _L4; else goto _L3
_L3:
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Fd fd1 = ((ChatFeedItem)iterator.next()).a(this, chatconversation);
            if (fd1 != null && a(fd1))
            {
                a(fd1.c);
                setIconResource(fd1);
                return;
            }
        }

        AnimationDrawable animationdrawable = new AnimationDrawable();
        animationdrawable.setOneShot(false);
        Resources resources = getResources();
        boolean flag = a(list);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)list.next();
            Fd fd2 = chatfeeditem.a(this, chatconversation);
            if (fd2 != null)
            {
                if (!flag)
                {
                    animationdrawable.addFrame(resources.getDrawable(fd2.b), 1000);
                } else
                if (a(chatfeeditem))
                {
                    animationdrawable.addFrame(resources.getDrawable(fd2.b), 1000);
                }
            }
        } while (true);
        setBackgroundDrawable(animationdrawable);
        animationdrawable.start();
        setIconResource(new Fd(0));
        return;
    }

}
