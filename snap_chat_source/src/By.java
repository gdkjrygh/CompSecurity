// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.chat.ChatFragment;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.Snap;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class By
    implements AR, pP, pU
{

    private static final String TAG = "ChatConversationManager";
    private static By sInstance;
    private final sq mChatConnectionMonitor;
    private final sw mChatMessageReleaser;
    private final sr mConversationUpdater;
    public final List mConversations = Collections.synchronizedList(new ArrayList());
    public final IB mConversationsForListView = new IB();
    final List mFeedItems = new CopyOnWriteArrayList();
    final FriendManager mFriendManager;
    public String mIterToken;
    private final AS mPreloadSettings;
    private final ReleaseManager mReleaseManager;
    private final sD mSendingMailman;

    private By(sr sr1, sw sw1, sD sd, AS as, sq sq1, FriendManager friendmanager, ReleaseManager releasemanager)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(SnapchatApplication.get());
        mConversationUpdater = sr1;
        mChatMessageReleaser = sw1;
        mSendingMailman = sd;
        mIterToken = sharedpreferences.getString(SharedPreferenceKey.CONVERSATIONS_ITER_TOKEN.getKey(), null);
        mPreloadSettings = as;
        mChatConnectionMonitor = sq1;
        mFriendManager = friendmanager;
        mReleaseManager = releasemanager;
        mPreloadSettings.a(this);
        mChatConnectionMonitor.a = this;
    }

    private ChatConversation a(String s, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        List list = mConversations;
        list;
        JVM INSTR monitorenter ;
        Object obj = c(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        Timber.f("ChatConversationManager", "[Conversation] Found existing conversation with %s.", new Object[] {
            s
        });
        list;
        JVM INSTR monitorexit ;
        return ((ChatConversation) (obj));
        obj = Bt.q();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
        Timber.f("ChatConversationManager", "[Conversation] Create new conversation with %s.", new Object[] {
            s
        });
        if (s.isEmpty() && mReleaseManager.c())
        {
            throw new IllegalArgumentException("Recipient username must not be empty!");
        }
        obj = new ChatConversation(((String) (obj)), s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        mSendingMailman.c(((ChatConversation) (obj)));
        Timber.f("ChatConversationManager", "[Conversation] Adding conversation %s-%s to mConversations.", new Object[] {
            ((ChatConversation) (obj)).m(), ((ChatConversation) (obj)).mTheirUsername
        });
        synchronized (mConversations)
        {
            mConversations.add(obj);
        }
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        h();
        obj.mIsStub = flag1;
        obj.mIsSavableConversation = flag2;
        list;
        JVM INSTR monitorexit ;
        return ((ChatConversation) (obj));
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static By c()
    {
        By;
        JVM INSTR monitorenter ;
        Object obj;
        if (sInstance != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = sD.a();
        ss ss1 = ss.a();
        Bf bf = Bf.a();
        oy oy1 = oy.a();
        sq sq1 = sq.b();
        lw lw1 = lw.a();
        lo.a();
        sInstance = new By(new sr(((sD) (obj)), ss1, bf, oy1, sq1, lw1), sw.a(), sD.a(), AS.a(), sq.b(), FriendManager.e(), ReleaseManager.a());
        obj = AndroidNotificationManager.a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj.b = sInstance;
        Timber.f("ChatConversationManager", "Creating new instance: %s.", new Object[] {
            sInstance.toString()
        });
        obj = sInstance;
        By;
        JVM INSTR monitorexit ;
        return ((By) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public static void d()
    {
        By;
        JVM INSTR monitorenter ;
        if (sInstance != null)
        {
            Timber.f("ChatConversationManager", "Calling clearInstance: %s.", new Object[] {
                sInstance.toString()
            });
            By by = sInstance;
            by.mPreloadSettings.mListeners.remove(by);
            by.mChatConnectionMonitor.a = null;
        }
        sInstance = null;
        By;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void i()
    {
        Iterator iterator = mFeedItems.iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        pT pt;
        Iterator iterator1;
        pt = (pT)iterator.next();
        iterator1 = pt.c().iterator();
_L4:
        Object obj;
        if (!iterator1.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((ChatFeedItem)iterator1.next()).k();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (!((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (mReleaseManager.c())
        {
            throw new RuntimeException("Found conversation with null or empty recipients");
        }
        mFeedItems.remove(pt);
        continue; /* Loop/switch isn't completed */
        obj = ((List) (obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty((String)((Iterator) (obj)).next())) goto _L6; else goto _L5
_L5:
        if (mReleaseManager.c())
        {
            throw new RuntimeException("Found conversation with empty string recipient username");
        }
        mFeedItems.remove(pt);
          goto _L4
        Exception exception;
        exception;
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final ChatConversation a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("friendUserName is null.");
        } else
        {
            return a(s, false, true);
        }
    }

    public final ChatConversation a(String s, boolean flag)
    {
        return a(s, flag, true, true, false);
    }

    public final ChatConversation a(String s, boolean flag, boolean flag1)
    {
        return a(s, flag, false, flag1, true);
    }

    public final List a()
    {
        i();
        return mFeedItems;
    }

    public final void a(Sc sc)
    {
        static final class _cls3
        {

            static final int $SwitchMap$com$snapchat$soju$android$PreloadMode[];

            static 
            {
                $SwitchMap$com$snapchat$soju$android$PreloadMode = new int[Sc.values().length];
                try
                {
                    $SwitchMap$com$snapchat$soju$android$PreloadMode[Sc.NO_PRELOAD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$PreloadMode[Sc.PRELOAD.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$PreloadMode[Sc.WIFI_ONLY_PRELOAD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.snapchat.soju.android.PreloadMode[sc.ordinal()])
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
        case 3: // '\003'
            a(new AtomicBoolean(false));
            break;
        }
        g();
    }

    public final void a(ChatConversation chatconversation, Qi qi, boolean flag, boolean flag1, long l)
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        sr sr1;
        String s;
        Rt rt;
        sr1 = mConversationUpdater;
        s = chatconversation.mId;
        if (qi.n())
        {
            chatconversation.a(qi.m().a());
        }
        sr1.a(chatconversation, qi, flag1, l);
        chatconversation.mTimestamp = Math.max(IJ.a(qi.j()), chatconversation.mTimestamp);
        obj = chatconversation.w();
        if (!((List) (obj)).isEmpty())
        {
            chatconversation.mTimestamp = Math.max(((ChatFeedItem)((List) (obj)).get(((List) (obj)).size() - 1)).W(), chatconversation.mTimestamp);
        }
        com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus sendreceivestatus;
        if (qi.c())
        {
            obj = IY.a(qi.b());
            if (!sr.c && obj == null)
            {
                throw new AssertionError();
            }
            obj2 = chatconversation.mLastSnapFromServer;
            Object obj5;
            RP.a a1;
            if (obj2 == null || ((Snap) (obj)).W() > ((Snap) (obj2)).W())
            {
                chatconversation.mLastSnapFromServer = ((Snap) (obj));
            } else
            if (((Snap) (obj)).W() == ((Snap) (obj2)).W() && (!(obj2 instanceof AT) || !(obj instanceof AT) || !((AT)obj2).D()))
            {
                chatconversation.mLastSnapFromServer = ((Snap) (obj));
            }
        }
        if (qi.i())
        {
            obj = new CashFeedItem(com.snapchat.android.model.CashTransaction.a.a(qi.h()));
            obj2 = chatconversation.mLastCashFromServer;
            if (obj2 == null || ((CashFeedItem) (obj)).W() > ((CashFeedItem) (obj2)).W())
            {
                chatconversation.mLastCashFromServer = ((CashFeedItem) (obj));
            } else
            if (((CashFeedItem) (obj)).W() == ((CashFeedItem) (obj2)).W() && !((CashFeedItem) (obj2)).aq())
            {
                chatconversation.mLastCashFromServer = ((CashFeedItem) (obj));
            }
        }
        rt = qi.d();
        if (rt == null || TextUtils.isEmpty(rt.b()))
        {
            break MISSING_BLOCK_LABEL_787;
        }
        obj2 = chatconversation.mMyUsername;
        obj3 = chatconversation.mTheirUsername;
        if (TextUtils.equals(rt.b(), ((CharSequence) (obj2))))
        {
            sendreceivestatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.SENT;
            obj = obj2;
            obj4 = obj3;
        } else
        {
            sendreceivestatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.RECEIVED;
            obj = obj3;
            obj4 = obj2;
        }
        obj5 = rt.d();
        l = IJ.a(rt.c());
        a1 = RP.a.a(((String) (obj5)));
        obj5 = a1;
        if (a1 == RP.a.UNRECOGNIZED_VALUE)
        {
            obj5 = RP.a.TEXT;
        }
        Ks._cls3.$SwitchMap$com$snapchat$soju$android$MessageBody$Type[((RP.a) (obj5)).ordinal()];
        JVM INSTR tableswitch 1 4: default 372
    //                   1 638
    //                   2 657
    //                   3 657
    //                   4 676;
           goto _L1 _L2 _L3 _L3 _L4
_L1:
        obj = (new BG.a(((String) (obj)), ((String) (obj4)))).a();
_L5:
        obj.mSendReceiveStatus = sendreceivestatus;
        ((Chat) (obj)).d(l);
        if (IJ.a(rt.a()) > IJ.a(rt.c()))
        {
            ((Chat) (obj)).a(IJ.a(rt.a()));
            obj3 = obj;
        } else
        if (TextUtils.equals(((CharSequence) (obj4)), ((CharSequence) (obj3))) && chatconversation.mMyLastSeqNum == chatconversation.mLastSeqNumOfMyChatTheyReleased)
        {
            ((Chat) (obj)).a(IJ.a(rt.c()));
            obj3 = obj;
        } else
        {
            obj3 = obj;
            if (TextUtils.equals(((CharSequence) (obj4)), ((CharSequence) (obj2))))
            {
                obj3 = obj;
                if (chatconversation.mTheirLastSeqNum == chatconversation.mLastSeqNumOfTheirChatIReleased)
                {
                    ((Chat) (obj)).a(IJ.a(rt.c()));
                    obj3 = obj;
                }
            }
        }
_L6:
        if (obj3 != null)
        {
            obj = chatconversation.mLastChatFromServer;
            if (obj == null || ((Chat) (obj3)).W() > ((Chat) (obj)).W())
            {
                chatconversation.mLastChatFromServer = ((Chat) (obj3));
            } else
            if (((Chat) (obj3)).W() == ((Chat) (obj)).W() && !((Chat) (obj)).u())
            {
                chatconversation.mLastChatFromServer = ((Chat) (obj3));
            }
        }
        obj = chatconversation.mItemsForFeedIcon;
        if (!((List) (obj)).isEmpty())
        {
            obj3 = ((List) (obj)).iterator();
            obj = null;
            do
            {
                obj2 = obj;
                if (!((Iterator) (obj3)).hasNext())
                {
                    break;
                }
                obj2 = (ChatFeedItem)((Iterator) (obj3)).next();
                if (obj == null)
                {
                    obj = obj2;
                } else
                if (((ChatFeedItem) (obj2)).W() > ((ChatFeedItem) (obj)).W())
                {
                    obj = obj2;
                }
            } while (true);
        } else
        {
            obj2 = null;
        }
        break MISSING_BLOCK_LABEL_852;
_L2:
        obj = (new com.snapchat.android.model.chat.ChatMedia.a(((String) (obj)), ((String) (obj4)))).a();
          goto _L5
_L3:
        obj = (new BC.a(((String) (obj)), ((String) (obj4)))).a();
          goto _L5
_L4:
        obj = (new BK.a(((String) (obj)), ((String) (obj4)))).b();
          goto _L5
        obj3 = null;
          goto _L6
        boolean flag2;
        if (obj2 != null)
        {
            chatconversation.mTimestamp = Math.max(((ChatFeedItem) (obj2)).W(), chatconversation.mTimestamp);
        }
        chatconversation.mIterToken = qi.o();
        sr1.b.c.remove(s);
        Object obj1 = Mf.a();
        if (chatconversation.H() && flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((Bus) (obj1)).a(new Mp(s, flag1));
        if (flag)
        {
            chatconversation.a(3);
            chatconversation.G();
        }
        qi = qi.p();
        if (qi == null)
        {
            break MISSING_BLOCK_LABEL_1149;
        }
        qi = qi.a();
        if (qi == null)
        {
            break MISSING_BLOCK_LABEL_1149;
        }
        obj1 = chatconversation.mMyUsername;
        if (qi.containsKey(obj1))
        {
            l = IJ.a((Long)qi.get(obj1));
        } else
        {
            l = 0L;
        }
        if (chatconversation.mMyLastSeqNum > l)
        {
            Timber.f("ChatConversationUpdater", "[seqNum] Local myLastSeqNum %d is larger than myLastSeqNum %d returned by the server.", new Object[] {
                Long.valueOf(chatconversation.mMyLastSeqNum), Long.valueOf(l)
            });
        }
        if (chatconversation.mMyLastSeqNum > l)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
_L7:
        if (flag2)
        {
            if (sq.b().d)
            {
                Timber.f("ChatConversationUpdater", "[seqNum] OLD myLastSeqNum > NEW myLastSeqNum and now on SCCP", new Object[0]);
                chatconversation.mSequenceNumberState = com.snapchat.android.model.chat.ChatConversation.SequenceNumberState.UPDATED;
                chatconversation.mNumSCCPChatMessagesSendingOrSent = 0;
                sr1.a.a(chatconversation, chatconversation.mMyLastSeqNum);
            }
        } else
        {
            chatconversation.mSequenceNumberState = com.snapchat.android.model.chat.ChatConversation.SequenceNumberState.UPDATED;
        }
        sr1.a.b(chatconversation);
        Timber.c("ChatConversationUpdater", "FEEDICON-LOG: update calling updateFeedIcons", new Object[0]);
        chatconversation.x();
        return;
        flag2 = false;
          goto _L7
    }

    public final void a(ChatConversation chatconversation, List list)
    {
        if (chatconversation == null || list == null || list.isEmpty())
        {
            return;
        }
        Timber.f("ChatConversationManager", "[Conversation] Updating conversation %s-%s with push notification. newMessages count: %d", new Object[] {
            chatconversation.m(), chatconversation.mTheirUsername, Integer.valueOf(list.size())
        });
        ArrayList arraylist = new ArrayList();
        Qm qm;
        for (list = list.iterator(); list.hasNext(); arraylist.add((new Qo()).a(qm)))
        {
            qm = (Qm)list.next();
        }

        list = (new Qj()).a(arraylist);
        list = (new Qi()).a(list);
        mConversationUpdater.a(chatconversation, list, false, -1L);
        chatconversation.x();
        h();
    }

    public final void a(List list, long l)
    {
        a(list, true, false, false, l);
    }

    public final void a(List list, boolean flag, boolean flag1, boolean flag2, long l)
    {
        if (list.isEmpty())
        {
            Timber.f("ChatConversationManager", "[Conversation] Conversations list returned by the server is empty.", new Object[0]);
            return;
        }
        List list1 = mConversations;
        list1;
        JVM INSTR monitorenter ;
        if (!mConversations.isEmpty()) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
_L11:
        long l2 = IJ.a(((Qi)list.get(list.size() - 1)).j());
        Object obj;
        ChatConversation chatconversation;
        ChatConversation chatconversation1;
        HashSet hashset;
        Iterator iterator;
        Qi qi;
        boolean flag3;
        if (flag && l2 > l1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        l1 = 0x7fffffffffffffffL;
        hashset = new HashSet();
        iterator = list.iterator();
_L10:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        qi = (Qi)iterator.next();
        chatconversation = sz.a(qi.a());
        if (chatconversation == null) goto _L6; else goto _L5
_L5:
        Timber.f("ChatConversationManager", "[Conversation] Updating existing conversation %s-%s.", new Object[] {
            chatconversation.m(), chatconversation.mTheirUsername
        });
        a(chatconversation, qi, false, true, l);
        if (!chatconversation.mIsUserInConversation)
        {
            Timber.f("ChatConversationManager", "[Conversation] Sending release message for %s.", new Object[] {
                chatconversation.mId
            });
            mChatMessageReleaser.a(chatconversation, Sk.a.DELETE);
        }
        obj = chatconversation;
        if (!chatconversation.mIsStub) goto _L8; else goto _L7
_L7:
        Timber.f("ChatConversationManager", "[Conversation] Marking conversation %s-%s as non-stub.", new Object[] {
            chatconversation.m(), chatconversation.mTheirUsername
        });
        chatconversation.mIsStub = false;
        obj = chatconversation;
_L8:
        if (obj == null) goto _L10; else goto _L9
_L9:
        l2 = ((ChatConversation) (obj)).mTimestamp;
        if (l2 < l1)
        {
            l1 = l2;
        }
        if (qi.g())
        {
            obj.mConversationInteractionEventType = qi.f().a();
        }
        hashset.add(((ChatConversation) (obj)).mId);
          goto _L10
_L2:
        l1 = ((ChatConversation)mConversations.get(0)).mTimestamp;
          goto _L11
_L6:
        chatconversation1 = IU.a(qi, l);
        obj = chatconversation;
        if (chatconversation1 == null) goto _L8; else goto _L12
_L12:
        Timber.f("ChatConversationManager", "[Conversation] Adding conversation %s-%s to mConversations.", new Object[] {
            chatconversation1.m(), chatconversation1.mTheirUsername
        });
        mConversations.add(chatconversation1);
        obj = chatconversation1;
          goto _L8
_L4:
        Mf.a().a(new NG());
        a(new AtomicBoolean(flag2));
        g();
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        obj = mConversations.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            chatconversation = (ChatConversation)((Iterator) (obj)).next();
            if (chatconversation.mTimestamp <= l1 && !chatconversation.J() && !hashset.contains(chatconversation.mId) && !chatconversation.mIsUserInConversation && !TextUtils.equals(chatconversation.mTheirUsername, ChatFragment.c))
            {
                Timber.f("ChatConversationManager", "[Conversation] Removing conversation %s-%s from mConversations.", new Object[] {
                    chatconversation.m(), chatconversation.mTheirUsername
                });
                ((Iterator) (obj)).remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_589;
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_621;
        }
        mIterToken = ((Qi)list.get(list.size() - 1)).o();
        e();
        h();
        list1;
        JVM INSTR monitorexit ;
          goto _L10
    }

    public final void a(AtomicBoolean atomicboolean)
    {
        AtomicInteger atomicinteger = new AtomicInteger(0);
        for (Iterator iterator = mConversations.iterator(); iterator.hasNext(); ((ChatConversation)iterator.next()).a(3, atomicboolean, atomicinteger)) { }
    }

    public final ChatConversation b(String s)
    {
        if (s == null)
        {
            if (ReleaseManager.e())
            {
                throw new NullPointerException("Attempt to get/start conversation with null friend.");
            } else
            {
                return null;
            }
        } else
        {
            return a(s, true, false);
        }
    }

    public final void b()
    {
        List list = mConversations;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mConversations.iterator();
_L2:
        ChatConversation chatconversation;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        chatconversation = (ChatConversation)iterator.next();
        Exception exception;
        boolean flag;
        if (chatconversation.mMyLastSeqNum != 0L || chatconversation.mTheirLastSeqNum != 0L || chatconversation.mLastTimestampOfReceivedSnapReadReceiptIReleased != 0L || chatconversation.mLastTimestampOfSentSnapReadReceiptIReleased != 0L || chatconversation.mLastChatFromServer != null || chatconversation.mLastCashFromServer != null || chatconversation.mLastSnapFromServer != null && (!chatconversation.mLastSnapFromServer.p() || !chatconversation.C()))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!chatconversation.C()) goto _L2; else goto _L3
_L3:
        Timber.f("ChatConversationManager", "[Conversation] Removing failed and non recoverable snap conversation %s-%s", new Object[] {
            chatconversation.m(), chatconversation.mTheirUsername
        });
        iterator.remove();
          goto _L2
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        mFeedItems.clear();
        mFeedItems.addAll(mConversations);
        list;
        JVM INSTR monitorexit ;
        i();
        return;
    }

    public final void b(String s, boolean flag)
    {
        List list = mConversations;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator;
        ChatConversation chatconversation;
        iterator = mConversations.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_121;
            }
            chatconversation = (ChatConversation)iterator.next();
        } while (!chatconversation.mId.equals(s));
        Timber.f("ChatConversationManager", "[Conversation] Removing conversation %s-%s. isStub: %b. shouldClearCache: %b", new Object[] {
            chatconversation.m(), chatconversation.mTheirUsername, Boolean.valueOf(chatconversation.mIsStub), Boolean.valueOf(flag)
        });
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        chatconversation.z();
        iterator.remove();
        h();
        list;
        JVM INSTR monitorexit ;
        return;
        list;
        JVM INSTR monitorexit ;
        return;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final ChatConversation c(String s)
    {
        String s1 = Bt.q();
        if (s1 == null)
        {
            return null;
        }
        s1 = Ks.a(s1, s);
        ChatConversation chatconversation;
        synchronized (mConversations)
        {
            Iterator iterator = mConversations.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_75;
                }
                chatconversation = (ChatConversation)iterator.next();
            } while (!TextUtils.equals(s1, chatconversation.mId));
        }
        return chatconversation;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        s;
        JVM INSTR monitorexit ;
        return null;
    }

    public final void e()
    {
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(SnapchatApplication.get()).edit();
        if (mIterToken == null)
        {
            editor.remove(SharedPreferenceKey.CONVERSATIONS_ITER_TOKEN.getKey());
        } else
        {
            editor.putString(SharedPreferenceKey.CONVERSATIONS_ITER_TOKEN.getKey(), sInstance.mIterToken);
        }
        editor.apply();
    }

    public final List f()
    {
        return Collections.unmodifiableList(new ArrayList(mConversations));
    }

    public final void g()
    {
        for (int j = 0; j < 4 && j < mConversations.size(); j++)
        {
            ((ChatConversation)mConversations.get(j)).G();
        }

    }

    public final void h()
    {
        PG.b(new Runnable() {

            final By this$0;

            public final void run()
            {
                By by;
                by = By.this;
                PG.b();
                Timber.f("ChatConversationManager", "[Conversation] Sorting mConversations.", new Object[0]);
                synchronized (by.mConversations)
                {
                    Collections.sort(by.mConversations);
                }
_L2:
                PG.a(by. new Runnable() {

                    final By this$0;

                    public final void run()
                    {
                        By by = By.this;
                        PG.a();
                        synchronized (by.mConversations)
                        {
                            by.mFeedItems.clear();
                            by.mFeedItems.addAll(by.mConversations);
                            by.mConversationsForListView.clear();
                            by.mConversationsForListView.addAll(by.mConversations);
                        }
                        Mf.a().a(new Mu());
                        if (by.mFriendManager.f())
                        {
                            by.mFriendManager.g();
                        }
                        return;
                        exception;
                        list;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                this$0 = By.this;
                super();
            }
                });
                return;
                exception;
                list;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    Timber.e("ChatConversationManager", "Comparison method violates its general contract! ChatConversation timestamp transitivity is not preserved in the sorting process.", new Object[0]);
                }
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = By.this;
                super();
            }
        });
    }
}
