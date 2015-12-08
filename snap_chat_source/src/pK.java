// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.app.feature.messaging.feed.model.FeedIconChangeType;
import com.snapchat.android.controller.countdown.SnapCountdownController;
import com.snapchat.android.model.Snap;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class pK
{

    final ChatConversation a;
    private final SnapCountdownController b;
    private final Object c;
    private com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority d;
    private int e;

    public pK(ChatConversation chatconversation)
    {
        this(chatconversation, SnapCountdownController.a());
    }

    private pK(ChatConversation chatconversation, SnapCountdownController snapcountdowncontroller)
    {
        a = chatconversation;
        b = snapcountdowncontroller;
        c = new Object();
    }

    private static List a(List list)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)iterator.next();
            if (chatfeeditem instanceof Snap)
            {
                list = com/snapchat/android/model/Snap.getSimpleName();
            } else
            if (chatfeeditem instanceof Chat)
            {
                list = com/snapchat/android/model/chat/Chat.getSimpleName();
            } else
            if (chatfeeditem instanceof CashFeedItem)
            {
                list = com/snapchat/android/model/chat/CashFeedItem.getSimpleName();
            } else
            {
                list = chatfeeditem.getClass().getSimpleName();
            }
            if (hashmap.containsKey(list))
            {
                if (chatfeeditem.W() < ((ChatFeedItem)hashmap.get(list)).W())
                {
                    hashmap.put(list, chatfeeditem);
                }
            } else
            {
                hashmap.put(list, chatfeeditem);
            }
        } while (true);
        return new ArrayList(hashmap.values());
    }

    private void a(ChatFeedItem chatfeeditem)
    {
        if (chatfeeditem.q() || chatfeeditem.r()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Snap snap;
        if (!(chatfeeditem instanceof Snap))
        {
            break; /* Loop/switch isn't completed */
        }
        if ((snap = a.mLastSnapFromServer) == null || chatfeeditem.W() >= snap.W())
        {
            a.mLastSnapFromServer = (Snap)chatfeeditem;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!(chatfeeditem instanceof Chat))
        {
            continue; /* Loop/switch isn't completed */
        }
        Chat chat = a.mLastChatFromServer;
        if (chat == null || chatfeeditem.W() >= chat.W())
        {
            a.mLastChatFromServer = (Chat)chatfeeditem;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!(chatfeeditem instanceof CashFeedItem)) goto _L1; else goto _L4
_L4:
        CashFeedItem cashfeeditem = a.mLastCashFromServer;
        if (cashfeeditem == null || chatfeeditem.W() >= cashfeeditem.W())
        {
            a.mLastCashFromServer = (CashFeedItem)chatfeeditem;
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private boolean a(ChatFeedItem chatfeeditem, com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority feediconpriority, com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority feediconpriority1)
    {
        if (d != null && d.compareTo(feediconpriority) > 0)
        {
            Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: updateItemForFeedIconAndPriorityIfNecessary not updating because ")).append(feediconpriority).append(" < ").append(d).toString(), new Object[0]);
            return false;
        } else
        {
            feediconpriority = a.mItemsForFeedIcon;
            feediconpriority.clear();
            feediconpriority.add(chatfeeditem);
            Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: updateItemForFeedIconAndPriorityIfNecessary updated icons. Previous priority: ")).append(d).append(" new priority: ").append(feediconpriority1).append(" items: ").append(chatfeeditem).toString(), new Object[0]);
            d = feediconpriority1;
            return true;
        }
    }

    private static boolean a(List list, List list1)
    {
        while (list.size() != list1.size() || !(new HashSet(list)).equals(new HashSet(list1))) 
        {
            return true;
        }
        return false;
    }

    private static ChatFeedItem b(List list)
    {
        Iterator iterator = list.iterator();
        list = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)iterator.next();
            if (list == null)
            {
                list = chatfeeditem;
            } else
            if (chatfeeditem.W() > list.W())
            {
                list = chatfeeditem;
            }
        } while (true);
        return list;
    }

    private List b()
    {
        Object obj = new ArrayList();
        List list = a.u();
        list;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj2;
        Object obj3;
        CashFeedItem cashfeeditem;
        c(list);
        obj1 = new HashSet(list);
        obj2 = a.mLastSnapFromServer;
        obj3 = a.mLastChatFromServer;
        cashfeeditem = a.mLastCashFromServer;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (!TextUtils.isEmpty(((Snap) (obj2)).d()))
        {
            ((Set) (obj1)).add(obj2);
        }
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        ((Set) (obj1)).add(obj3);
        if (cashfeeditem == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ((Set) (obj1)).add(cashfeeditem);
        if (((Set) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_340;
        }
        obj2 = new ArrayList();
        obj1 = ((Set) (obj1)).iterator();
        int i = -1;
_L2:
        int k;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj3 = (ChatFeedItem)((Iterator) (obj1)).next();
        k = ((ChatFeedItem) (obj3)).b(a);
        int j;
        j = i;
        if (k <= i)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ((List) (obj2)).clear();
        j = k;
        i = j;
        if (k != j) goto _L2; else goto _L1
_L1:
        ((List) (obj2)).add(obj3);
        i = j;
          goto _L2
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        obj1 = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.values()[i];
        if (obj1 != com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.UNOPENED_SNAP_AVAILABLE_NEXT) goto _L4; else goto _L3
_L3:
        ((List) (obj)).add(a.n());
_L5:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: getHighestPriorityItemsForIcon for ")).append(a.mId).append(" (").append(obj1).append("): ").append(obj).toString(), new Object[0]);
_L6:
        list;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L4:
label0:
        {
            if (obj1 != com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.NEW)
            {
                break label0;
            }
            obj = a(((List) (obj2)));
        }
          goto _L5
        ((List) (obj)).add(b(((List) (obj2))));
          goto _L5
        Timber.d("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: getHighestPriorityItemForIcon but no items in conversation ")).append(a.mId).toString(), new Object[0]);
          goto _L6
    }

    private void c(List list)
    {
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); a((ChatFeedItem)iterator.next())) { }
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final boolean a()
    {
        List list;
        List list1;
label0:
        {
            Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: updateFeedIcons for ")).append(a.mId).toString(), new Object[0]);
            synchronized (c)
            {
                list = a.mItemsForFeedIcon;
                list1 = b();
                if (!list1.isEmpty())
                {
                    break label0;
                }
                Timber.c("ConversationFeedIconUpdater", "FEEDICON-LOG: updateFeedIcons highest priority icons is empty", new Object[0]);
            }
            return false;
        }
        com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority feediconpriority = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.values()[((ChatFeedItem)list1.get(0)).b(a)];
        boolean flag;
        if (feediconpriority != com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.CURRENTLY_TICKING && d == feediconpriority && !a(list, list1))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        list.clear();
        list.addAll(list1);
        d = feediconpriority;
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: updateFeedIcons determined priority ")).append(d).append(" with items: ").append(list).toString(), new Object[0]);
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(ChatFeedItem chatfeeditem, FeedIconChangeType feediconchangetype)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        static final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[FeedIconChangeType.values().length];
                try
                {
                    a[FeedIconChangeType.RECEIVED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[FeedIconChangeType.VIEWING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[FeedIconChangeType.VIEWED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[FeedIconChangeType.SENDING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[FeedIconChangeType.SENT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[FeedIconChangeType.FAILED_TO_SEND.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[FeedIconChangeType.LOADING.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FeedIconChangeType.LOADED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FeedIconChangeType.FAILED_TO_LOAD.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[feediconchangetype.ordinal()];
        JVM INSTR tableswitch 1 9: default 1087
    //                   1 68
    //                   2 359
    //                   3 426
    //                   4 732
    //                   5 776
    //                   6 877
    //                   7 955
    //                   8 999
    //                   9 1043;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return false;
_L2:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemReceived ")).append(chatfeeditem).toString(), new Object[0]);
        if (d == null || d.compareTo(com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.NEW) <= 0) goto _L12; else goto _L11
_L11:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: Previous priority is > NEW ")).append(d).toString(), new Object[0]);
        boolean flag = false;
_L17:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        chatfeeditem;
        obj;
        JVM INSTR monitorexit ;
        throw chatfeeditem;
_L12:
        a(chatfeeditem);
        if (d == null || !d.equals(com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.NEW)) goto _L14; else goto _L13
_L13:
        Timber.c("ConversationFeedIconUpdater", "FEEDICON-LOG: Priority was new, adding icon and finding oldest of each type", new Object[0]);
        feediconchangetype = new ArrayList(a.mItemsForFeedIcon);
        feediconchangetype.add(chatfeeditem);
        chatfeeditem = a(((List) (feediconchangetype)));
        if (!a(a.mItemsForFeedIcon, ((List) (chatfeeditem)))) goto _L16; else goto _L15
_L15:
        a.mItemsForFeedIcon.clear();
        a.mItemsForFeedIcon.addAll(chatfeeditem);
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: items for feed icon: ")).append(feediconchangetype).toString(), new Object[0]);
_L18:
        d = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.NEW;
        flag = true;
          goto _L17
_L16:
        Timber.c("ConversationFeedIconUpdater", "FEEDICON-LOG: oldest items of each type didn't change", new Object[0]);
        flag = false;
          goto _L17
_L14:
        Timber.c("ConversationFeedIconUpdater", "FEEDICON-LOG: Previous priority not NEW, clearing feed icons and adding received item", new Object[0]);
        a.mItemsForFeedIcon.clear();
        a.mItemsForFeedIcon.add(chatfeeditem);
          goto _L18
_L3:
        int i = b.e(chatfeeditem.d());
        if (!com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.CURRENTLY_TICKING.equals(d) || e != i) goto _L20; else goto _L19
_L19:
        flag = false;
_L21:
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L20:
        e = i;
        feediconchangetype = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.CURRENTLY_TICKING;
        flag = a(chatfeeditem, ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)), ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)));
          goto _L21
_L4:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemViewed ")).append(chatfeeditem).toString(), new Object[0]);
        feediconchangetype = a.mItemsForFeedIcon;
        if (!(chatfeeditem instanceof AT)) goto _L23; else goto _L22
_L22:
        com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority feediconpriority;
        int j = chatfeeditem.b(a);
        feediconpriority = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.values()[j];
        feediconchangetype.clear();
        if (feediconpriority != com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.UNOPENED_SNAP_AVAILABLE_NEXT) goto _L25; else goto _L24
_L24:
        feediconchangetype.add(a.n());
_L26:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemViewed previous priority: ")).append(d).append(" and priority is now ").append(feediconpriority).append(" with icon ").append(feediconchangetype).toString(), new Object[0]);
        d = feediconpriority;
        a(chatfeeditem);
        if (feediconpriority == com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.UNOPENED_SNAP_AVAILABLE_NEXT || feediconpriority == com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.RECENTLY_OPENED_LAST_SNAP)
        {
            (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

                private pK a;

                public final void run()
                {
                    Timber.c("ConversationFeedIconUpdater", "FEEDICON-LOG: onItemViewed calling updateFeedIcons", new Object[0]);
                    a.a.x();
                }

            
            {
                a = pK.this;
                super();
            }
            }, 5000L);
        }
        e = 0;
        flag = true;
_L29:
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L25:
        feediconchangetype.add(chatfeeditem);
          goto _L26
_L23:
        if (!(chatfeeditem instanceof AY) && !(chatfeeditem instanceof Chat) || feediconchangetype.size() != 1 || !((ChatFeedItem)feediconchangetype.get(0)).equals(chatfeeditem)) goto _L28; else goto _L27
_L27:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemViewed ")).append(chatfeeditem).append(" and updating last item as viewed. Previous priority: ").append(d).toString(), new Object[0]);
        a(chatfeeditem);
        flag = true;
          goto _L29
_L5:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemSending ")).append(chatfeeditem).toString(), new Object[0]);
        feediconchangetype = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.SENDING;
        flag = a(chatfeeditem, ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)), ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)));
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L6:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemSent ")).append(chatfeeditem).toString(), new Object[0]);
        flag = a(chatfeeditem, com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.SENDING, com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.RECENTLY_SENT);
        a(chatfeeditem);
        long l = chatfeeditem.W();
        long l1 = System.currentTimeMillis();
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

            private pK a;

            public final void run()
            {
                Timber.c("ConversationFeedIconUpdater", "FEEDICON-LOG: onItemSent calling updateFeedIcons", new Object[0]);
                a.a.x();
            }

            
            {
                a = pK.this;
                super();
            }
        }, Math.max((l - l1) + 1000L, 1000L) + 1L);
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L7:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemFailedToSend ")).append(chatfeeditem).toString(), new Object[0]);
        flag = a(chatfeeditem, com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.SENDING, com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.FAILED);
        if (chatfeeditem.p())
        {
            (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

                private pK a;

                public final void run()
                {
                    Timber.c("ConversationFeedIconUpdater", "FEEDICON-LOG: onItemFailedToSend calling updateFeedIcons after clearing failed and non-recoverable items", new Object[0]);
                    a.a.x();
                }

            
            {
                a = pK.this;
                super();
            }
            }, 2000L);
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L8:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemLoading ")).append(chatfeeditem).toString(), new Object[0]);
        feediconchangetype = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.NEW;
        flag = a(chatfeeditem, ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)), ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)));
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L9:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemLoaded ")).append(chatfeeditem).toString(), new Object[0]);
        feediconchangetype = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.NEW;
        flag = a(chatfeeditem, ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)), ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)));
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L10:
        Timber.c("ConversationFeedIconUpdater", (new StringBuilder("FEEDICON-LOG: onItemFailedToLoad ")).append(chatfeeditem).toString(), new Object[0]);
        feediconchangetype = com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority.NEW;
        flag = a(chatfeeditem, ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)), ((com.snapchat.android.model.chat.ChatFeedItem.FeedIconPriority) (feediconchangetype)));
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L28:
        flag = false;
          goto _L29
    }
}
