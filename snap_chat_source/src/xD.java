// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class xD
{

    private static boolean a;

    public xD()
    {
    }

    public static int a(List list, List list1, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (list.isEmpty())
        {
            list1.add(new BA());
            return 1;
        }
        boolean flag1 = DateUtils.isToday(((ChatFeedItem)list.get(list.size() - 1)).W());
        int k = list.size() - 1;
        int j = -1;
        do
        {
            int i;
label0:
            {
                if (k >= 0)
                {
                    ChatFeedItem chatfeeditem1 = (ChatFeedItem)list.get(k);
                    ChatFeedItem chatfeeditem;
                    if (k > 0)
                    {
                        chatfeeditem = (ChatFeedItem)list.get(k - 1);
                    } else
                    {
                        chatfeeditem = null;
                    }
                    if (!a && chatfeeditem1 == null)
                    {
                        throw new AssertionError((new StringBuilder("Message ")).append(k).append(" is null!").toString());
                    }
                    int l = j;
                    if (j == -1)
                    {
                        if ((chatfeeditem1 instanceof StatefulChatFeedItem) && !chatfeeditem1.aq() && !TextUtils.equals(chatfeeditem1.j(), Bt.q()))
                        {
                            i = 1;
                        } else
                        if ((chatfeeditem1 instanceof AT) && !((AT)chatfeeditem1).D())
                        {
                            i = 1;
                        } else
                        if (flag1 && DateUtils.isToday(chatfeeditem1.W()))
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                        l = j;
                        if (i == 0)
                        {
                            j = arraylist.size();
                            i = j;
                            if (flag)
                            {
                                break label0;
                            }
                            l = j;
                        }
                    }
                    arraylist.add(chatfeeditem1);
                    if (DateUtils.isToday(chatfeeditem1.W()) && (chatfeeditem == null || !DateUtils.isToday(chatfeeditem.W())))
                    {
                        arraylist.add(new BA());
                    }
                    if (ReleaseManager.f() && (chatfeeditem1 instanceof Chat) && ((Chat)chatfeeditem1).t() != null)
                    {
                        Timber.f("ConversationProcessor", "[Conversation] Processing message %s.", new Object[] {
                            Ks.a(((Chat)chatfeeditem1).t())
                        });
                    }
                    k--;
                    j = l;
                    continue;
                }
                i = j;
            }
            Collections.reverse(arraylist);
            if (i == -1)
            {
                i = arraylist.size();
            }
            j = i;
            if (!flag1)
            {
                arraylist.add(new BA());
                j = i + 1;
            }
            list1.addAll(arraylist);
            return j;
        } while (true);
    }

    static 
    {
        boolean flag;
        if (!xD.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
