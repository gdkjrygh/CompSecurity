// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import AO;
import AS;
import AT;
import AY;
import BL;
import BN;
import BO;
import Br;
import Bt;
import By;
import Fe;
import Hb;
import IP;
import IY;
import Iu;
import JY;
import KO;
import KP;
import KQ;
import Ka;
import Ks;
import Ll;
import MF;
import Mf;
import Mp;
import Nv;
import OE;
import Pl;
import Qm;
import Qy;
import Rm;
import Sk;
import Su;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.app.feature.messaging.feed.model.FeedIconChangeType;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.database.table.CashFeedItemTable;
import com.snapchat.android.database.table.ClearedChatIdsTable;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.Snap;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;
import com.snapchat.android.util.CashUtils;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mt;
import oz;
import pK;
import pT;
import sD;
import sl;
import st;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatFeedItem, ChatMedia, CashFeedItem, StatefulChatFeedItem, 
//            Chat

public final class ChatConversation
    implements AO, Comparable, pT
{
    public static final class SequenceNumberState extends Enum
    {

        private static final SequenceNumberState $VALUES[];
        public static final SequenceNumberState NOT_UPDATED;
        public static final SequenceNumberState UPDATED;
        public static final SequenceNumberState UPDATING;

        public static SequenceNumberState valueOf(String s1)
        {
            return (SequenceNumberState)Enum.valueOf(com/snapchat/android/model/chat/ChatConversation$SequenceNumberState, s1);
        }

        public static SequenceNumberState[] values()
        {
            return (SequenceNumberState[])$VALUES.clone();
        }

        static 
        {
            NOT_UPDATED = new SequenceNumberState("NOT_UPDATED", 0);
            UPDATING = new SequenceNumberState("UPDATING", 1);
            UPDATED = new SequenceNumberState("UPDATED", 2);
            $VALUES = (new SequenceNumberState[] {
                NOT_UPDATED, UPDATING, UPDATED
            });
        }

        private SequenceNumberState(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static final String CHAT_ID_DELIMITER = "~";
    private static final int FAILED_CHATS_RETENTION_PERIOD_MS = 0x5265c00;
    public static final String FRIEND_EVENT = "friend_event";
    public static final int MS_TO_SHOW_FAILED_AND_NONRECOVERABLE_IN_FEED = 2000;
    public static final int NUM_CONVERSATIONS_TO_PRELOAD = 4;
    public static final int NUM_MEDIA_MESSAGES_TO_PRELOAD = 5;
    private static final int RECIPIENT_PRESENCE_TIME_INTERVAL = 16000;
    private static final int SENDER_PRESENCE_TIME_INTERVAL = 7000;
    private static final String TAG = "ChatConversation";
    private static final int TIME_BEFORE_DELETING_FAILED_CHATS_IN_MILLISECONDS = 0x36ee80;
    public boolean mAmIPresent;
    private boolean mAmITyping;
    public boolean mBeingCleared;
    public final List mChats;
    public String mChatsIterToken;
    public boolean mChatsSorted;
    public Set mClearedChatIds;
    public String mConversationInteractionEventType;
    public boolean mEnteredConversationFromRecentStoryReply;
    public Set mFailedChatMessages;
    public Set mFailedReleaseMessages;
    public Set mFailedSnaps;
    private pK mFeedIconUpdater;
    private final FriendManager mFriendManager;
    public Iu mGsonWrapper;
    public boolean mHasUnreleasedReceivedChats;
    public boolean mHasUnviewedCash;
    public boolean mHasUnviewedReceivedSnaps;
    public boolean mHasUnviewedSnapsWithAudio;
    public Rm mHereAuth;
    public final String mId;
    public boolean mIsDisplayingVideo;
    public boolean mIsNotifyingRecipientAboutTyping;
    public boolean mIsRecipientPresent;
    public boolean mIsSavableConversation;
    public boolean mIsStub;
    public boolean mIsUserInConversation;
    public List mItemsForFeedIcon;
    public String mIterToken;
    public CashFeedItem mLastCashFromServer;
    public Chat mLastChatFromServer;
    public long mLastSCCPMessageSentTimestamp;
    public long mLastSeqNumOfMyChatIDeleted;
    public long mLastSeqNumOfMyChatTheyReleased;
    public long mLastSeqNumOfTheirChatIDeleted;
    public long mLastSeqNumOfTheirChatIDisplayed;
    public long mLastSeqNumOfTheirChatIReleased;
    public Snap mLastSnapFromServer;
    public long mLastTimestampOfReceivedSnapReadReceiptIDeleted;
    public long mLastTimestampOfReceivedSnapReadReceiptIReleased;
    public long mLastTimestampOfSentSnapReadReceiptIDeleted;
    public long mLastTimestampOfSentSnapReadReceiptIReleased;
    JY mMediaImageCache;
    public Su mMessagingAuthToken;
    public long mMyLastAckedSeqNum;
    public long mMyLastConnSeqNum;
    public long mMyLastSeqNum;
    public String mMyUsername;
    public int mNumSCCPChatMessagesSendingOrSent;
    public int mPendingRainBills;
    public long mPendingRainTransactionTimestamp;
    public List mPendingReceivedChats;
    private final AS mPreloadSettings;
    private final Handler mRecipientPresenceHandler;
    private final Runnable mRecipientPresenceRunnable;
    public boolean mRecipientSupportsHere;
    private int mSecondsLeftInUnviewedSnaps;
    private final Handler mSenderPresenceHandler;
    private final Runnable mSenderPresenceRunnable;
    public sl mSendingCashManager;
    private Set mSendingChatFeedItemIds;
    public final Set mSendingMessages;
    public SequenceNumberState mSequenceNumberState;
    public KO mSlightlySecurePreferences;
    public long mTheirLastConnSeqNum;
    public long mTheirLastSeqNum;
    public String mTheirUsername;
    public long mTimestamp;
    private int mTotalSeconds;

    public ChatConversation(String s1, String s2)
    {
        this(s1, s2, FriendManager.e());
    }

    private ChatConversation(String s1, String s2, FriendManager friendmanager)
    {
        this(Ks.a(s1, s2), s1, s2, AS.a(), friendmanager);
    }

    private ChatConversation(String s1, String s2, String s3, AS as, FriendManager friendmanager)
    {
        mMediaImageCache = Ka.CHAT_MEDIA_IMAGE_CACHE;
        mChats = new ArrayList();
        mPendingReceivedChats = new ArrayList();
        mSendingMessages = new HashSet();
        mFailedChatMessages = new HashSet();
        mFailedReleaseMessages = new HashSet();
        mClearedChatIds = new HashSet();
        mFailedSnaps = new HashSet();
        mHasUnreleasedReceivedChats = false;
        mPendingRainBills = 0;
        mPendingRainTransactionTimestamp = 0L;
        mItemsForFeedIcon = new CopyOnWriteArrayList();
        mSendingChatFeedItemIds = new HashSet();
        mSecondsLeftInUnviewedSnaps = 0;
        mTotalSeconds = 0;
        mEnteredConversationFromRecentStoryReply = false;
        mIsSavableConversation = true;
        SnapchatApplication.getDIComponent().a(this);
        mId = s1;
        mMyUsername = s2;
        mTheirUsername = s3;
        mPreloadSettings = as;
        mFriendManager = friendmanager;
        s1 = Looper.getMainLooper();
        mSenderPresenceHandler = new Handler(s1);
        mRecipientPresenceHandler = new Handler(s1);
        mSenderPresenceRunnable = new Runnable() {

            final ChatConversation this$0;

            public final void run()
            {
                b(true);
            }

            
            {
                this$0 = ChatConversation.this;
                super();
            }
        };
        mRecipientPresenceRunnable = new Runnable() {

            final ChatConversation this$0;

            public final void run()
            {
                ChatConversation.a(ChatConversation.this);
                ChatConversation.b(ChatConversation.this);
                Mf.a().a(new Nv(com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY, ChatConversation.c(ChatConversation.this), false, "presence timeout (16000 seconds)"));
            }

            
            {
                this$0 = ChatConversation.this;
                super();
            }
        };
        s1 = new KP((new StringBuilder()).append(KQ.PER_CONVERSATION_AUTH.mKey).append(mTheirUsername).toString(), KQ.PER_CONVERSATION_AUTH.mType);
        s1 = mSlightlySecurePreferences.a(s1);
        if (s1 != null)
        {
            mMessagingAuthToken = (Su)mGsonWrapper.a(s1, Su);
        }
        mSequenceNumberState = SequenceNumberState.NOT_UPDATED;
        mFeedIconUpdater = new pK(this);
    }

    public ChatConversation(String s1, String s2, boolean flag)
    {
        this(s1, s2);
        mIsStub = flag;
    }

    private AT L()
    {
label0:
        {
            Object obj;
            synchronized (mChats)
            {
                v();
                obj = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)((Iterator) (obj)).next();
                } while (!(chatfeeditem instanceof AT) || ((AT)chatfeeditem).D() || ((AT)chatfeeditem).B());
                obj = (AT)chatfeeditem;
            }
            return ((AT) (obj));
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private List M()
    {
        ArrayList arraylist = new ArrayList(5);
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        int i1;
        v();
        i1 = mChats.size() - 1;
_L2:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        ChatFeedItem chatfeeditem = (ChatFeedItem)mChats.get(i1);
        if (!(chatfeeditem instanceof ChatMedia) || !((ChatMedia)chatfeeditem).s() || chatfeeditem.aq())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        arraylist.add((ChatMedia)chatfeeditem);
        if (arraylist.size() != 5)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        list;
        JVM INSTR monitorexit ;
        return arraylist;
        list;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Rm a(ChatConversation chatconversation)
    {
        chatconversation.mHereAuth = null;
        return null;
    }

    private List b(int i1)
    {
        ArrayList arraylist;
label0:
        {
            arraylist = new ArrayList(i1);
            synchronized (mChats)
            {
                v();
                Iterator iterator = mChats.iterator();
                do
                {
                    ChatFeedItem chatfeeditem;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        chatfeeditem = (ChatFeedItem)iterator.next();
                    } while (!(chatfeeditem instanceof AT) || ((AT)chatfeeditem).D());
                    arraylist.add((AT)chatfeeditem);
                } while (arraylist.size() != i1);
            }
            return arraylist;
        }
        list;
        JVM INSTR monitorexit ;
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean b(ChatConversation chatconversation)
    {
        chatconversation.mIsRecipientPresent = false;
        return false;
    }

    static String c(ChatConversation chatconversation)
    {
        return chatconversation.mTheirUsername;
    }

    public final void A()
    {
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mFailedChatMessages.iterator();
_L1:
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_92;
            }
            obj = (Qm)iterator.next();
        } while (System.currentTimeMillis() - ((Qm) (obj)).g().longValue() < 0x36ee80L);
        obj = f(((Qm) (obj)).c());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        mChats.remove(obj);
        iterator.remove();
          goto _L1
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        Iterator iterator1 = mChats.iterator();
        obj = new ArrayList();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)iterator1.next();
            if (chatfeeditem instanceof CashFeedItem)
            {
                CashFeedItem cashfeeditem = (CashFeedItem)chatfeeditem;
                if (cashfeeditem.R() && System.currentTimeMillis() - chatfeeditem.W() >= 0x36ee80L)
                {
                    ((List) (obj)).add(cashfeeditem);
                    iterator1.remove();
                }
            }
        } while (true);
        CashFeedItemTable.b(SnapchatApplication.get(), ((Collection) (obj)));
        list;
        JVM INSTR monitorexit ;
    }

    public final void B()
    {
        synchronized (mChats)
        {
            if (!mChats.isEmpty())
            {
                mChatsSorted = false;
                v();
                mTimestamp = ((ChatFeedItem)mChats.get(mChats.size() - 1)).W();
                Timber.f("ChatConversation", "[Conversation] Sorting conversation %s. New timestamp: %d.", new Object[] {
                    mId, Long.valueOf(mTimestamp)
                });
            }
        }
        By.c().h();
        Mf.a().a(new OE());
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean C()
    {
label0:
        {
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((ChatFeedItem)iterator.next()).p());
            }
            return false;
        }
        if (!mItemsForFeedIcon.isEmpty()) goto _L2; else goto _L1
_L1:
        exception = null;
_L5:
        if (!mChats.isEmpty())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (exception == null) goto _L4; else goto _L3
_L3:
        if (exception.p())
        {
            break MISSING_BLOCK_LABEL_120;
        }
          goto _L4
_L6:
        list;
        JVM INSTR monitorexit ;
        boolean flag;
        return flag;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        exception = (ChatFeedItem)mItemsForFeedIcon.get(0);
          goto _L5
_L4:
        flag = false;
          goto _L6
        flag = true;
          goto _L6
    }

    public final void D()
    {
        mRecipientPresenceHandler.removeCallbacks(mRecipientPresenceRunnable);
        if (mIsRecipientPresent)
        {
            mRecipientPresenceHandler.postDelayed(mRecipientPresenceRunnable, 16000L);
        }
    }

    public final long E()
    {
        if (mItemsForFeedIcon != null && !mItemsForFeedIcon.isEmpty())
        {
            long l1 = ((ChatFeedItem)mItemsForFeedIcon.get(0)).W();
            if (l1 >= mTimestamp)
            {
                return l1;
            }
        }
        return mTimestamp;
    }

    public final List F()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(mTheirUsername);
        return arraylist;
    }

    public final void G()
    {
        if (mPreloadSettings.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag = mPreloadSettings.mTravelModeEnabled;
        Object obj = M();
        if (!((List) (obj)).isEmpty())
        {
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ChatMedia chatmedia = (ChatMedia)((Iterator) (obj)).next();
                Timber.f("ChatConversation", "[Conversation] Prefetching chat media message with id: %s.", new Object[] {
                    chatmedia.d()
                });
                (new Fe(chatmedia, null)).a(SnapchatApplication.get(), flag);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean H()
    {
        return mHasUnreleasedReceivedChats || mHasUnviewedReceivedSnaps || mHasUnviewedCash;
    }

    public final boolean I()
    {
label0:
        {
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)iterator.next();
                } while (!chatfeeditem.R() || !chatfeeditem.T());
            }
            return true;
        }
        list;
        JVM INSTR monitorexit ;
        return false;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean J()
    {
label0:
        {
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)iterator.next();
                } while (!chatfeeditem.Q() && !chatfeeditem.R());
            }
            return true;
        }
        list;
        JVM INSTR monitorexit ;
        return false;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List K()
    {
        Object obj = new ArrayList();
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mChats.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (ChatFeedItem)iterator.next();
            if (obj1 instanceof CashFeedItem)
            {
                obj1 = (CashFeedItem)obj1;
                CashTransaction cashtransaction = ((CashFeedItem) (obj1)).mCashTransaction;
                if (((StatefulChatFeedItem) (obj1)).mSendReceiveStatus == StatefulChatFeedItem.SendReceiveStatus.RECEIVED && cashtransaction.mTransactionStatus == com.snapchat.android.model.CashTransaction.TransactionStatus.WAITING_ON_RECIPIENT)
                {
                    ((List) (obj)).add(obj1);
                }
            }
        } while (true);
        break MISSING_BLOCK_LABEL_106;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        list;
        JVM INSTR monitorexit ;
        return ((List) (obj));
    }

    public final String V_()
    {
        return mId;
    }

    public final com.snapchat.android.app.feature.messaging.feed.ui.fragment.FeedAdapter.FeedViewType W_()
    {
        return com.snapchat.android.app.feature.messaging.feed.ui.fragment.FeedAdapter.FeedViewType.CONVERSATION;
    }

    public final int a(int i1)
    {
        return a(i1, new AtomicBoolean(false), new AtomicInteger(0));
    }

    public final volatile int a(int i1, Hb hb)
    {
        return a(i1);
    }

    public final int a(int i1, AtomicBoolean atomicboolean, AtomicInteger atomicinteger)
    {
        int j1;
        boolean flag;
        flag = false;
        j1 = 0;
        if (mPreloadSettings.b()) goto _L2; else goto _L1
_L1:
        return j1;
_L2:
        boolean flag1 = mPreloadSettings.mTravelModeEnabled;
        Object obj = b(i1);
        if (((List) (obj)).isEmpty())
        {
            continue;
        }
        obj = ((List) (obj)).iterator();
        i1 = ((flag) ? 1 : 0);
        do
        {
            j1 = i1;
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            AT at = (AT)((Iterator) (obj)).next();
            if (!at.O())
            {
                if (!at.U())
                {
                    (new mt(at, atomicboolean, atomicinteger, Br.UNSAFE_USER_PROVIDER, flag1)).a();
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final long a(long l1)
    {
        long l2 = l1;
        if (mTimestamp > l1)
        {
            l2 = mTimestamp + 1L;
        }
        return l2;
    }

    public final void a()
    {
    }

    public final void a(long l1, boolean flag)
    {
        if (l1 >= mMyLastAckedSeqNum)
        {
            mMyLastAckedSeqNum = l1;
            if (mMyLastAckedSeqNum > mMyLastSeqNum || flag)
            {
                Timber.f("ChatConversation", "[seqNum] mMyLastSeqNum: %d. mMyLastAckedSeqNum: %d. resetLastSeqNum: %b.Updating mMyLastSeqNum to %d", new Object[] {
                    Long.valueOf(mMyLastSeqNum), Long.valueOf(mMyLastAckedSeqNum), Boolean.valueOf(flag), Long.valueOf(mMyLastAckedSeqNum)
                });
                mMyLastSeqNum = mMyLastAckedSeqNum;
            }
        }
    }

    public final void a(AY ay, boolean flag)
    {
        k(ay.d());
        mTimestamp = System.currentTimeMillis();
        ay.a(mTimestamp);
        B();
        Timber.f("ChatConversation", "[Conversation] Snap %s sent successfully. Updating snap timestamp to %d.", new Object[] {
            mId, Long.valueOf(mTimestamp)
        });
        AY ay1 = (AY)d(ay.d());
        if (ay1 != null)
        {
            if (flag)
            {
                ay1.l();
            } else
            {
                ay1.i();
            }
            a(((ChatFeedItem) (ay)), FeedIconChangeType.SENT);
        }
        Mf.a().a(new Mp(mId));
    }

    public final volatile void a(Hb hb, SnapViewSessionStopReason snapviewsessionstopreason, int i1)
    {
    }

    public final void a(Qy qy)
    {
        synchronized (mSendingMessages)
        {
            mSendingMessages.remove(qy);
        }
        return;
        qy;
        set;
        JVM INSTR monitorexit ;
        throw qy;
    }

    public final void a(Sk sk)
    {
        if (sk.a() == Sk.a.DELETE)
        {
            Map map = sk.b();
            long l1 = ((Long)map.get(mTheirUsername)).longValue();
            if (l1 > mLastSeqNumOfTheirChatIDeleted)
            {
                mLastSeqNumOfTheirChatIDeleted = l1;
            }
            l1 = ((Long)map.get(mMyUsername)).longValue();
            if (l1 > mLastSeqNumOfMyChatIDeleted)
            {
                mLastSeqNumOfMyChatIDeleted = l1;
            }
            sk = sk.c();
            l1 = ((Long)sk.get(mTheirUsername)).longValue();
            if (l1 > mLastTimestampOfSentSnapReadReceiptIDeleted)
            {
                mLastTimestampOfSentSnapReadReceiptIDeleted = l1;
            }
            l1 = ((Long)sk.get(mMyUsername)).longValue();
            if (l1 > mLastTimestampOfReceivedSnapReadReceiptIDeleted)
            {
                mLastTimestampOfReceivedSnapReadReceiptIDeleted = l1;
                return;
            }
        }
    }

    public final void a(Su su)
    {
        mMessagingAuthToken = su;
        KP kp = new KP((new StringBuilder()).append(KQ.PER_CONVERSATION_AUTH.mKey).append(mTheirUsername).toString(), KQ.PER_CONVERSATION_AUTH.mType);
        if (mMessagingAuthToken == null)
        {
            su = null;
        } else
        {
            su = mGsonWrapper.a(su);
        }
        mSlightlySecurePreferences.a(kp, su);
    }

    public final void a(Chat chat)
    {
        chat.d(a(chat.W()));
    }

    public final void a(ChatFeedItem chatfeeditem)
    {
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Object obj;
        if (mChatsSorted && !mChats.isEmpty())
        {
            long l1 = ((ChatFeedItem)mChats.get(mChats.size() - 1)).W();
            if (chatfeeditem.W() < l1)
            {
                mChatsSorted = false;
            }
        }
        obj = mChats;
        boolean flag;
        boolean flag1;
        long l2;
        if ((chatfeeditem instanceof ChatMedia) && ((ChatMedia)chatfeeditem).mIsRetriedByUser)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((chatfeeditem instanceof AY) && ((AY)chatfeeditem).mIsRetriedByUser)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L1
_L14:
        mChats.add(chatfeeditem);
        if (!(chatfeeditem instanceof AT)) goto _L3; else goto _L2
_L2:
        chatfeeditem = (AT)chatfeeditem;
        if (!chatfeeditem.D())
        {
            mHasUnviewedReceivedSnaps = true;
            if (chatfeeditem.al())
            {
                mHasUnviewedSnapsWithAudio = true;
            }
        }
_L13:
        list;
        JVM INSTR monitorexit ;
        return;
_L15:
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (!((List) (obj)).isEmpty()) goto _L6; else goto _L5
_L10:
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!((ChatFeedItem) (obj)).R() && IP.c(((ChatFeedItem) (obj)).j(), chatfeeditem.j())) goto _L9; else goto _L8
_L8:
        Timber.f("ChatGroup", "[GroupId] Assign new group id for %s. Use item timestamp as group id %d.", new Object[] {
            chatfeeditem.d(), Long.valueOf(chatfeeditem.W())
        });
        l2 = chatfeeditem.W();
_L11:
        chatfeeditem.c(l2);
        break; /* Loop/switch isn't completed */
        chatfeeditem;
        list;
        JVM INSTR monitorexit ;
        throw chatfeeditem;
_L6:
        obj = (ChatFeedItem)((List) (obj)).get(((List) (obj)).size() - 1);
          goto _L10
_L9:
        Timber.f("ChatGroup", "[GroupId] Assign new group id for %s. Use group id of the previous item %d.", new Object[] {
            chatfeeditem.d(), Long.valueOf(((ChatFeedItem) (obj)).ae())
        });
        l2 = ((ChatFeedItem) (obj)).ae();
          goto _L11
_L3:
        if (!(chatfeeditem instanceof CashFeedItem)) goto _L13; else goto _L12
_L12:
        chatfeeditem = (CashFeedItem)chatfeeditem;
        obj = ((CashFeedItem) (chatfeeditem)).mCashTransaction.mTransactionStatus;
        if (((CashFeedItem) (chatfeeditem)).mCashTransaction.mFromRain && !Ks.a(chatfeeditem) && !chatfeeditem.i() && obj == com.snapchat.android.model.CashTransaction.TransactionStatus.COMPLETED)
        {
            mPendingRainBills = mPendingRainBills + ((CashFeedItem) (chatfeeditem)).mCashTransaction.mAmount / 100;
            if (mPendingRainTransactionTimestamp == 0L || mPendingRainTransactionTimestamp > chatfeeditem.W())
            {
                mPendingRainTransactionTimestamp = chatfeeditem.W();
            }
            if (!Ks.a(chatfeeditem))
            {
                chatfeeditem.mCanShowSparkle = true;
            }
        }
          goto _L13
_L1:
        if (!flag && !flag1) goto _L15; else goto _L14
_L5:
        obj = null;
          goto _L10
    }

    public final void a(ChatFeedItem chatfeeditem, FeedIconChangeType feediconchangetype)
    {
        if (mFeedIconUpdater.a(chatfeeditem, feediconchangetype))
        {
            Mf.a().a(new MF(mId));
        }
    }

    public final void a(ChatMedia chatmedia)
    {
        if (!chatmedia.mIsRetriedByUser)
        {
            chatmedia.d(a(chatmedia.mTimestamp.longValue()));
            a(((ChatFeedItem) (chatmedia)));
            B();
        }
        chatmedia.b(b(chatmedia));
        a(((ChatFeedItem) (chatmedia)), FeedIconChangeType.SENDING);
        Mf.a().a(new Mp(mId));
    }

    public final volatile void a(Object obj, FeedIconChangeType feediconchangetype)
    {
        a((ChatFeedItem)obj, feediconchangetype);
    }

    public final void a(String s1, boolean flag)
    {
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mChats.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ChatFeedItem)iterator.next();
            if (obj instanceof AT)
            {
                obj = (AT)obj;
                if (((AT) (obj)).ar())
                {
                    ((AT) (obj)).a(s1, flag);
                }
            }
        } while (true);
        break MISSING_BLOCK_LABEL_78;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(Collection collection)
    {
        mSendingChatFeedItemIds.clear();
        ChatFeedItem chatfeeditem;
        for (collection = collection.iterator(); collection.hasNext(); mSendingChatFeedItemIds.add(chatfeeditem.d()))
        {
            chatfeeditem = (ChatFeedItem)collection.next();
        }

    }

    public final void a(HashMap hashmap, List list, boolean flag)
    {
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        list = list.listIterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (ChatFeedItem)list.next();
            if (obj instanceof CashFeedItem)
            {
                CashFeedItem cashfeeditem = (CashFeedItem)obj;
                obj = CashUtils.a(this, (CashFeedItem)hashmap.remove(((ChatFeedItem) (obj)).d()), cashfeeditem);
                if (obj != null)
                {
                    list.set(obj);
                    arraylist1.add(obj);
                    if (CashUtils.a(mMyUsername, ((CashFeedItem) (obj))))
                    {
                        arraylist.add(obj);
                    }
                }
            }
        } while (true);
        CashFeedItemTable.a(SnapchatApplication.get(), arraylist1);
        if (flag && !mIsUserInConversation)
        {
            hashmap = hashmap.values();
            for (list = hashmap.iterator(); list.hasNext(); CashUtils.a(this, (CashFeedItem)list.next(), null)) { }
            CashFeedItemTable.b(SnapchatApplication.get(), hashmap);
        }
        sl.b(this, arraylist);
    }

    public final void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        List list1 = mChats;
        list1;
        JVM INSTR monitorenter ;
        if (!mChats.isEmpty())
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ChatFeedItem chatfeeditem = (ChatFeedItem)iterator.next();
                if ((chatfeeditem instanceof CashFeedItem) && ((CashFeedItem)chatfeeditem).mCashTransaction.mFailToSendReleaseMessage)
                {
                    arraylist.add((CashFeedItem)chatfeeditem);
                }
                if (mChats.contains(chatfeeditem))
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_120;
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
        mChats.addAll(list);
        Collections.sort(mChats, new BL());
        st.a(mChats);
        mChatsSorted = true;
        list1;
        JVM INSTR monitorexit ;
        if (!arraylist.isEmpty())
        {
            sl.a(mId, arraylist);
        }
        return;
    }

    public final void a(Set set)
    {
        mClearedChatIds.addAll(set);
    }

    public final boolean a(Qm qm)
    {
label0:
        {
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!((ChatFeedItem)iterator.next()).d().equals(qm.c()));
            }
            return true;
        }
        list;
        JVM INSTR monitorexit ;
        return false;
        qm;
        list;
        JVM INSTR monitorexit ;
        throw qm;
    }

    public final boolean a(String s1)
    {
        Object obj = new ArrayList();
        if (mFriendManager.f() && mFriendManager.j(mTheirUsername))
        {
            String s2 = mFriendManager.k(mTheirUsername);
            ((ArrayList) (obj)).add(s2);
            ((ArrayList) (obj)).addAll(Arrays.asList(s2.split(" ")));
        }
        ((ArrayList) (obj)).add(mTheirUsername);
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (IP.a((String)((Iterator) (obj)).next(), s1))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean a(boolean flag)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag4;
        flag4 = false;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator;
        v();
        mChatsIterToken = null;
        iterator = mChats.iterator();
        boolean flag1 = false;
_L18:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s1;
        ChatFeedItem chatfeeditem;
        chatfeeditem = (ChatFeedItem)iterator.next();
        s1 = chatfeeditem.an();
        if (!TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        if (!(chatfeeditem instanceof BO)) goto _L6; else goto _L5
_L5:
        Object obj = (BO)chatfeeditem;
_L24:
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!((BO) (obj)).f() && !((BO) (obj)).o()) goto _L8; else goto _L9
_L23:
        Exception exception;
        String s2;
        boolean flag2;
        boolean flag3;
        long l1;
        if ((chatfeeditem instanceof AT) && ((AT)chatfeeditem).x())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag2 || flag3) goto _L11; else goto _L10
_L10:
        if (chatfeeditem.aq() && !chatfeeditem.Q() && !chatfeeditem.R()) goto _L12; else goto _L11
_L11:
        if (!flag) goto _L14; else goto _L13
_L13:
        if (chatfeeditem.p()) goto _L12; else goto _L14
_L14:
        obj = chatfeeditem.d();
        s2 = mId;
        if (!(chatfeeditem instanceof Chat)) goto _L16; else goto _L15
_L15:
        l1 = ((Chat)chatfeeditem).w();
_L25:
        Timber.f("ChatConversation", "[Conversation] NOT clearing chat with id[%s] conv[%s] text[%s] seq_num[%d].", new Object[] {
            obj, s2, s1, Long.valueOf(l1)
        });
        arraylist.add(chatfeeditem);
        if (flag1) goto _L18; else goto _L17
_L17:
        if (!(chatfeeditem instanceof BN)) goto _L18; else goto _L19
_L19:
        mChatsIterToken = ((BN)chatfeeditem).l();
        flag1 = true;
          goto _L18
_L4:
        s1 = s1.substring(0, Math.min(3, s1.length()));
          goto _L3
_L12:
        obj = chatfeeditem.d();
        s2 = mId;
        if (!(chatfeeditem instanceof Chat))
        {
            break MISSING_BLOCK_LABEL_559;
        }
        l1 = ((Chat)chatfeeditem).w();
_L26:
        Timber.f("ChatConversation", "[Conversation] Clearing chat with id[%s] conv[%s] text[%s] seq_num[%d].", new Object[] {
            obj, s2, s1, Long.valueOf(l1)
        });
        mClearedChatIds.add(chatfeeditem.d());
        ClearedChatIdsTable.a(SnapchatApplication.get(), chatfeeditem.d(), mId);
        if (!(chatfeeditem instanceof ChatMedia)) goto _L21; else goto _L20
_L20:
        mMediaImageCache.e(chatfeeditem.d());
          goto _L22
_L21:
        if (chatfeeditem instanceof CashFeedItem)
        {
            arraylist1.add((CashFeedItem)chatfeeditem);
        }
          goto _L22
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        mChats.clear();
        mChats.addAll(arraylist);
        CashFeedItemTable.b(SnapchatApplication.get(), arraylist1);
        list;
        JVM INSTR monitorexit ;
        return flag4;
_L9:
        flag2 = true;
          goto _L23
_L6:
        obj = null;
          goto _L24
_L8:
        flag2 = false;
          goto _L23
_L16:
        l1 = -1L;
          goto _L25
_L22:
        flag4 = true;
          goto _L18
        l1 = -1L;
          goto _L26
    }

    public final long b(Chat chat)
    {
        long l1;
        ArrayList arraylist = new ArrayList();
        synchronized (mChats)
        {
            arraylist.addAll(mChats);
        }
        int i1 = arraylist.size();
        l1 = -1L;
        i1--;
        do
        {
            if (i1 < 0)
            {
                break;
            }
            obj = (ChatFeedItem)arraylist.get(i1);
            if (System.currentTimeMillis() - ((ChatFeedItem) (obj)).W() >= 0x5265c00L)
            {
                break;
            }
            if ((obj instanceof Chat) && obj != chat && !((ChatFeedItem) (obj)).r())
            {
                obj = (Chat)obj;
                boolean flag;
                if (!((Chat) (obj)).R() || ((StatefulChatFeedItem) (obj)).mSendReceiveStatus == StatefulChatFeedItem.SendReceiveStatus.FAILED_TIMED_OUT)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && ((Chat) (obj)).w() > l1)
                {
                    l1 = ((Chat) (obj)).w();
                }
            }
            i1--;
        } while (true);
        break MISSING_BLOCK_LABEL_168;
        chat;
        obj;
        JVM INSTR monitorexit ;
        throw chat;
        long l2 = mMyLastSeqNum;
        if (chat == null)
        {
            chat = "";
        } else
        {
            chat = chat.d();
        }
        Timber.f("ChatConversation", "[seqNum] Last seqNum found in the conversation: %d. mMyLastSeqNum: %d. ignore chat id: %s.", new Object[] {
            Long.valueOf(l1), Long.valueOf(l2), chat
        });
        if (l1 < mMyLastSeqNum)
        {
            return mMyLastSeqNum + 1L;
        } else
        {
            return l1 + 1L;
        }
    }

    public final Chat b(long l1)
    {
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        int i1 = mChats.size() - 1;
_L2:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        Object obj;
        obj = (ChatFeedItem)mChats.get(i1);
        if (!(obj instanceof Chat))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj = (Chat)obj;
        if (!TextUtils.equals(((Chat) (obj)).j(), mMyUsername) || ((Chat) (obj)).w() != l1)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        list;
        JVM INSTR monitorexit ;
        return ((Chat) (obj));
        list;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b()
    {
    }

    public final void b(ChatFeedItem chatfeeditem)
    {
        synchronized (mChats)
        {
            mChats.remove(chatfeeditem);
        }
        return;
        chatfeeditem;
        list;
        JVM INSTR monitorexit ;
        throw chatfeeditem;
    }

    public final void b(String s1)
    {
        mClearedChatIds.remove(s1);
        ClearedChatIdsTable.a(SnapchatApplication.get(), s1);
    }

    public final void b(boolean flag)
    {
        mAmIPresent = flag;
        if (flag)
        {
            mHasUnreleasedReceivedChats = false;
            mHasUnviewedCash = false;
        } else
        {
            mIsDisplayingVideo = false;
        }
        mSenderPresenceHandler.removeCallbacks(mSenderPresenceRunnable);
        if (mAmIPresent)
        {
            mSenderPresenceHandler.postDelayed(mSenderPresenceRunnable, 7000L);
        }
        sD.a().a(this, mAmIPresent, mIsRecipientPresent, mIsDisplayingVideo);
    }

    public final AY c(String s1)
    {
label0:
        {
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)iterator.next();
                } while (!(chatfeeditem instanceof AY) || !TextUtils.equals(chatfeeditem.d(), s1));
                s1 = (AY)chatfeeditem;
            }
            return s1;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final List c()
    {
        return mItemsForFeedIcon;
    }

    public final List c(Chat chat)
    {
        ArrayList arraylist;
        int j1;
        if (st.a(chat))
        {
            return Arrays.asList(new Chat[] {
                chat
            });
        }
        arraylist = new ArrayList();
        synchronized (mChats)
        {
            arraylist.addAll(mChats);
        }
        obj = new ArrayList();
        int i1 = arraylist.indexOf(chat);
        do
        {
            j1 = i1;
            if (i1 <= 0)
            {
                break;
            }
            j1 = i1;
            if (((ChatFeedItem)arraylist.get(i1 - 1)).ae() != chat.ae())
            {
                break;
            }
            i1--;
        } while (true);
        break MISSING_BLOCK_LABEL_117;
        chat;
        obj;
        JVM INSTR monitorexit ;
        throw chat;
        do
        {
            if (j1 < 0 || j1 >= arraylist.size())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)arraylist.get(j1);
            if (!(chatfeeditem instanceof Chat) || chatfeeditem.ae() != chat.ae())
            {
                break;
            }
            ((ArrayList) (obj)).add((Chat)chatfeeditem);
            j1++;
        } while (true);
        return ((List) (obj));
    }

    public final void c(long l1)
    {
        if (l1 > mMyLastSeqNum)
        {
            Timber.f("ChatConversation", "[seqNum] mMyLastSeqNum: %d. New seqNum: %d. Updating mMyLastSeqNum to %d", new Object[] {
                Long.valueOf(mMyLastSeqNum), Long.valueOf(l1), Long.valueOf(l1)
            });
            mMyLastSeqNum = l1;
        }
    }

    public final void c(ChatFeedItem chatfeeditem)
    {
        synchronized (mChats)
        {
            mChats.remove(chatfeeditem);
            a(chatfeeditem);
        }
        Mf.a().a(new Mp(mId, chatfeeditem.d()));
        return;
        chatfeeditem;
        list;
        JVM INSTR monitorexit ;
        throw chatfeeditem;
    }

    public final void c(boolean flag)
    {
        mIsRecipientPresent = flag;
        D();
    }

    public final int compareTo(Object obj)
    {
        return Pl.a(((ChatConversation)obj).mTimestamp, mTimestamp);
    }

    public final ChatFeedItem d(String s1)
    {
label0:
        {
            ChatFeedItem chatfeeditem;
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)iterator.next();
                } while (!s1.equals(chatfeeditem.d()));
            }
            return chatfeeditem;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void d(long l1)
    {
        if (l1 > mTheirLastSeqNum)
        {
            mTheirLastSeqNum = l1;
        }
    }

    public final void d(boolean flag)
    {
        if (!mAmIPresent)
        {
            mHasUnreleasedReceivedChats = flag;
        }
    }

    public final boolean d()
    {
        return n() != null;
    }

    public final Hb e()
    {
        return L();
    }

    public final CashFeedItem e(String s1)
    {
label0:
        {
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)iterator.next();
                } while (!(chatfeeditem instanceof CashFeedItem) || !s1.equals(chatfeeditem.d()));
                s1 = (CashFeedItem)chatfeeditem;
            }
            return s1;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void e(boolean flag)
    {
        if (mAmITyping != flag)
        {
            mAmITyping = flag;
            if (flag && !mIsNotifyingRecipientAboutTyping)
            {
                (new oz(this)).execute();
            }
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ChatConversation)
        {
            return mId.equals(((ChatConversation)obj).mId);
        } else
        {
            return false;
        }
    }

    public final Hb f()
    {
        return n();
    }

    public final Chat f(String s1)
    {
label0:
        {
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)iterator.next();
                } while (!(chatfeeditem instanceof Chat) || !s1.equals(chatfeeditem.d()));
                s1 = (Chat)chatfeeditem;
            }
            return s1;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final MediaOpenOrigin g()
    {
        return null;
    }

    public final Chat g(String s1)
    {
label0:
        {
            Object obj;
            synchronized (mChats)
            {
                Iterator iterator = mChats.iterator();
                do
                {
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        obj = (ChatFeedItem)iterator.next();
                    } while (!(obj instanceof Chat));
                    obj = (Chat)obj;
                } while (!s1.equals(((Chat) (obj)).v()));
            }
            return ((Chat) (obj));
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final Qy h(String s1)
    {
label0:
        {
            Qy qy;
            synchronized (mSendingMessages)
            {
                Iterator iterator = mSendingMessages.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    qy = (Qy)iterator.next();
                } while (!TextUtils.equals(qy.l(), s1));
            }
            return qy;
        }
        set;
        JVM INSTR monitorexit ;
        return null;
        s1;
        set;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean h()
    {
        return false;
    }

    public final int hashCode()
    {
        return mId.hashCode();
    }

    public final int i()
    {
        return mSecondsLeftInUnviewedSnaps;
    }

    public final AY i(String s1)
    {
label0:
        {
            Object obj;
            synchronized (mChats)
            {
                s1 = IY.a(s1);
                Iterator iterator = mChats.iterator();
                do
                {
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        obj = (ChatFeedItem)iterator.next();
                    } while (!(obj instanceof AY));
                    obj = (AY)obj;
                } while (!TextUtils.equals(s1, IY.a(((AY) (obj)).ai())));
            }
            return ((AY) (obj));
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void j(String s1)
    {
        mSendingChatFeedItemIds.add(s1);
        mTimestamp = System.currentTimeMillis();
        Timber.f("ChatConversation", "[Conversation] Adding message %s to sending IDs list. Conversation id: %s. New timestamp: %d.", new Object[] {
            s1, mId, Long.valueOf(mTimestamp)
        });
        By.c().h();
    }

    public final int k()
    {
        int i1 = 0;
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mChats.iterator();
_L1:
        ChatFeedItem chatfeeditem;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        chatfeeditem = (ChatFeedItem)iterator.next();
        if ((chatfeeditem instanceof AT) && !((AT)chatfeeditem).D())
        {
            i1++;
        }
          goto _L1
        list;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void k(String s1)
    {
        mSendingChatFeedItemIds.remove(s1);
        Timber.f("ChatConversation", "[Conversation] Removing sent message %s from sending IDs list. Conversation id: %s.", new Object[] {
            s1, mId
        });
    }

    public final Friend l()
    {
        return mFriendManager.i(mTheirUsername);
    }

    public final void l(String s1)
    {
        Timber.f("ChatConversation", "[Conversation] Removing failed message %s from sending IDs list. Conversation id: %s.", new Object[] {
            s1, mId
        });
        mSendingChatFeedItemIds.remove(s1);
    }

    public final String m()
    {
        if (mMyUsername.equals(Bt.q()))
        {
            return mTheirUsername;
        } else
        {
            return mMyUsername;
        }
    }

    public final AT n()
    {
        Object obj;
        mSecondsLeftInUnviewedSnaps = 0;
        mTotalSeconds = 0;
        obj = null;
        mHasUnviewedSnapsWithAudio = false;
        mHasUnviewedReceivedSnaps = false;
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator;
        v();
        iterator = mChats.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj2 = (ChatFeedItem)iterator.next();
        Object obj1 = obj;
        if (!(obj2 instanceof AT))
        {
            break MISSING_BLOCK_LABEL_162;
        }
        obj2 = (AT)obj2;
        mTotalSeconds = (int)((double)mTotalSeconds + ((AT) (obj2)).G());
        obj1 = obj;
        if (((AT) (obj2)).D())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        obj = obj2;
_L3:
        if (((AT) (obj2)).al())
        {
            mHasUnviewedSnapsWithAudio = true;
        }
        mHasUnviewedReceivedSnaps = true;
        obj1 = obj;
        break MISSING_BLOCK_LABEL_162;
        mSecondsLeftInUnviewedSnaps = (int)((double)mSecondsLeftInUnviewedSnaps + ((AT) (obj2)).G());
          goto _L3
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        list;
        JVM INSTR monitorexit ;
        return ((AT) (obj));
        obj = obj1;
          goto _L4
    }

    public final void o()
    {
        mNumSCCPChatMessagesSendingOrSent = mNumSCCPChatMessagesSendingOrSent - 1;
    }

    public final void p()
    {
        mNumSCCPChatMessagesSendingOrSent = 0;
        mLastSCCPMessageSentTimestamp = 0L;
    }

    public final long q()
    {
        long l1 = mMyLastConnSeqNum + 1L;
        mMyLastConnSeqNum = l1;
        return l1;
    }

    public final AT r()
    {
label0:
        {
            Object obj;
            synchronized (mChats)
            {
                v();
                obj = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)((Iterator) (obj)).next();
                } while (!(chatfeeditem instanceof Snap) || !((Snap)chatfeeditem).ar());
                obj = (AT)chatfeeditem;
            }
            return ((AT) (obj));
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean r_()
    {
        return false;
    }

    public final AT s()
    {
label0:
        {
            Object obj;
            synchronized (mChats)
            {
                v();
                obj = mChats.iterator();
                ChatFeedItem chatfeeditem;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    chatfeeditem = (ChatFeedItem)((Iterator) (obj)).next();
                } while (!(chatfeeditem instanceof AT) || !((AT)chatfeeditem).x());
                obj = (AT)chatfeeditem;
            }
            return ((AT) (obj));
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int s_()
    {
        return mTotalSeconds;
    }

    public final void t()
    {
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mChats.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)iterator.next();
            if ((chatfeeditem instanceof AT) && ((AT)chatfeeditem).ar())
            {
                ((AT)chatfeeditem).v();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_68;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final List u()
    {
        v();
        return mChats;
    }

    public final void v()
    {
        synchronized (mChats)
        {
            if (!mChatsSorted)
            {
                Collections.sort(mChats, new BL());
                mChatsSorted = true;
            }
        }
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List w()
    {
        ArrayList arraylist;
        synchronized (mChats)
        {
            v();
            arraylist = new ArrayList(mChats);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void x()
    {
        if (mFeedIconUpdater.a())
        {
            Mf.a().a(new MF(mId));
        }
    }

    public final void y()
    {
        boolean flag = false;
        if (mHasUnreleasedReceivedChats || mHasUnviewedCash)
        {
            mHasUnreleasedReceivedChats = false;
            mHasUnviewedCash = false;
            flag = true;
        }
        if (a(true) || flag)
        {
            x();
        }
    }

    public final void z()
    {
        List list = mChats;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mChats.iterator();
_L3:
        Object obj;
        String s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        obj = (ChatFeedItem)iterator.next();
        s1 = ((ChatFeedItem) (obj)).d();
        if (!(obj instanceof ChatMedia) && !(obj instanceof AY)) goto _L2; else goto _L1
_L1:
        Ka.CHAT_MEDIA_IMAGE_CACHE.e(s1);
        Ka.DSNAP_MEDIA_CACHE.e(s1);
        Ka.UNENCRYPTED_VIDEO_CACHE.e(s1);
        Ka.DISCOVER_SHARE.e(s1);
          goto _L3
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!(obj instanceof AT)) goto _L3; else goto _L4
_L4:
        obj = (AT)obj;
        Ka.SNAP_RECEIVED_IMAGE_CACHE.e(((AT) (obj)).i());
        Ka.SNAP_RECEIVED_VIDEO_CACHE.e(((AT) (obj)).i());
          goto _L3
        list;
        JVM INSTR monitorexit ;
    }

    // Unreferenced inner class com/snapchat/android/model/chat/ChatConversation$3

/* anonymous class */
    public final class _cls3
        implements Comparator
    {

        final ChatConversation this$0;

        public final int compare(Object obj, Object obj1)
        {
            obj = (Chat)obj;
            obj1 = (Chat)obj1;
            if (((Chat) (obj)).w() < ((Chat) (obj1)).w())
            {
                return -1;
            }
            return ((Chat) (obj)).w() <= ((Chat) (obj1)).w() ? 0 : 1;
        }

            public 
            {
                this$0 = ChatConversation.this;
                super();
            }
    }

}
