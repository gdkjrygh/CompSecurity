// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import Bj;
import Br;
import Bt;
import By;
import Jc;
import Jh;
import Ks;
import Mf;
import Nw;
import Pr;
import QS;
import Ra;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.chat.ChatConversation;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import sz;
import zD;

// Referenced classes of package com.snapchat.android.model:
//            Friend, SharedPreferenceGroup

public final class FriendManager
    implements zD
{
    public static final class FriendRequestRate extends Enum
    {

        private static final FriendRequestRate $VALUES[];
        public static final FriendRequestRate HIGH;
        public static final FriendRequestRate LOW;
        public static final FriendRequestRate MEDIUM;

        public static FriendRequestRate valueOf(String s1)
        {
            return (FriendRequestRate)Enum.valueOf(com/snapchat/android/model/FriendManager$FriendRequestRate, s1);
        }

        public static FriendRequestRate[] values()
        {
            return (FriendRequestRate[])$VALUES.clone();
        }

        static 
        {
            LOW = new FriendRequestRate("LOW", 0);
            MEDIUM = new FriendRequestRate("MEDIUM", 1);
            HIGH = new FriendRequestRate("HIGH", 2);
            $VALUES = (new FriendRequestRate[] {
                LOW, MEDIUM, HIGH
            });
        }

        private FriendRequestRate(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static final int DEFAULT_NUM_RECENT_FINDFRIENDS_REQUEST = 10;
    public static final int DEFAULT_NUM_RECENT_FIND_SUGGESTED_FRIENDS_REQUEST = 10;
    private static final String DELIMITER = "~";
    protected static final Jc.c FRIEND_KEY_RETRIEVER = new Jc.c() {

        public final Object a(Object obj)
        {
            return ((Friend)obj).g();
        }

    };
    private static FriendManager INSTANCE = new FriendManager();
    private static final String TAG = "FriendManager";
    public static long THREE_DAYS_MILLIS = 0xf731400L;
    public List mBests;
    public List mContactsNotOnSnapchat;
    public final List mContactsOnSnapchat;
    public final Set mContactsOnSnapchatSet;
    public final Set mDuplicateFirstNames;
    public List mFriendsBlockedFromSeeingMyStory;
    public final List mFriendsWhoAddedMe;
    public final Jc mOutgoingFriendsListMap;
    public final List mRecents;
    public final Bj mStoryLibrary;
    public final List mSuggestedFriends;
    private final Bt mUserPrefs;
    public final Provider mUserProvider;

    FriendManager()
    {
        this(Bt.a(), Bj.a(), Br.UNSAFE_USER_PROVIDER, new Jc(FRIEND_KEY_RETRIEVER));
    }

    private FriendManager(Bt bt, Bj bj, Provider provider, Jc jc)
    {
        mBests = Collections.synchronizedList(new ArrayList());
        mRecents = new ArrayList(22);
        mContactsNotOnSnapchat = Collections.synchronizedList(new ArrayList());
        mContactsOnSnapchat = Collections.synchronizedList(new ArrayList());
        mContactsOnSnapchatSet = Collections.synchronizedSet(new HashSet());
        mDuplicateFirstNames = Collections.synchronizedSet(new HashSet());
        mSuggestedFriends = Collections.synchronizedList(new ArrayList());
        mFriendsWhoAddedMe = Collections.synchronizedList(new ArrayList());
        mFriendsBlockedFromSeeingMyStory = Collections.synchronizedList(new ArrayList());
        mUserPrefs = bt;
        mStoryLibrary = bj;
        mUserProvider = provider;
        mOutgoingFriendsListMap = jc;
    }

    public static void a(int i1)
    {
        SharedPreferenceKey.IDENTITY_SUGGESTED_FRIEND_FETCH_THRESHOLD.putInt(i1);
    }

    private void a(List list, List list1)
    {
        HashSet hashset;
        hashset = new HashSet(22);
        Object obj = By.c().f().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ChatConversation chatconversation = (ChatConversation)((Iterator) (obj)).next();
            int i1;
            if (Ks.a(chatconversation))
            {
                a(chatconversation.mTheirUsername.replaceAll("\\s+", "").split(","), ((Set) (hashset)));
            } else
            {
                a(a(chatconversation.mTheirUsername), ((Set) (hashset)));
            }
        } while (hashset.size() < 22);
        list = list.iterator();
        i1 = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            obj = (Friend)list.next();
            if (c(((Friend) (obj)).g()) && a(((Friend) (obj)), ((Set) (hashset))))
            {
                i1++;
            }
        } while (i1 < 22);
        list1;
        JVM INSTR monitorenter ;
        list = list1.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            obj = (Friend)list.next();
            if (!((Friend) (obj)).g().equals(Bt.q()))
            {
                a(((Friend) (obj)), ((Set) (hashset)));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_228;
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
        list1;
        JVM INSTR monitorexit ;
        list = new ArrayList(hashset);
        e(list);
        list1 = list.subList(0, Math.min(list.size(), 22));
        synchronized (mRecents)
        {
            mRecents.clear();
            mRecents.addAll(list1);
        }
        return;
        list1;
        list;
        JVM INSTR monitorexit ;
        throw list1;
    }

    public static void a(boolean flag)
    {
        SharedPreferenceKey.FIND_FRIENDS_TRIMMED.putBoolean(flag);
    }

    private void a(String as[], Set set)
    {
        int j1 = as.length;
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    a(a(as[i1].trim()), set);
                    if (set.size() < 22)
                    {
                        break label0;
                    }
                }
                return;
            }
            i1++;
        } while (true);
    }

    public static boolean a(Friend friend)
    {
        return friend != null && friend.mDirection == Friend.Direction.BOTH;
    }

    public static boolean a(Friend friend, long l1)
    {
        return friend.mTheyAddedMeTimestamp > l1;
    }

    private boolean a(Friend friend, Set set)
    {
        if (friend == null || mBests.contains(friend) || friend.mIsPending || friend.mDirection == Friend.Direction.INCOMING || friend.mIsBlocked)
        {
            return false;
        }
        friend = f(friend);
        friend.mIsRecent = true;
        if (set.add(friend))
        {
            return true;
        }
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend1 = (Friend)iterator.next();
            if (!friend1.equals(friend))
            {
                continue;
            }
            if (Math.max(friend.mIAddedThemTimestamp, friend.mTheyAddedMeTimestamp) > Math.max(friend1.mIAddedThemTimestamp, friend1.mTheyAddedMeTimestamp))
            {
                set.remove(friend1);
                set.add(friend);
                return true;
            }
            break;
        } while (true);
        return false;
    }

    private boolean a(Friend friend, boolean flag)
    {
        boolean flag1;
        if (!friend.mIsIgnored && !friend.mIsBlocked && !friend.mIsHidden)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            if (!c(friend.g()))
            {
                return true;
            }
            boolean flag2;
            if (friend.mAddSourceType == Friend.AddSourceType.ADDED_BY_NEARBY)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if ((!flag2 || flag) && a(friend, Bt.m()))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(List list, String s1)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Friend friend = (Friend)iterator.next();
            if (friend.g().equals(s1))
            {
                return list.remove(friend);
            }
        }

        return false;
    }

    private Friend c(String s1, boolean flag)
    {
label0:
        {
            Friend friend;
            synchronized (mFriendsWhoAddedMe)
            {
                Iterator iterator = mFriendsWhoAddedMe.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    friend = (Friend)iterator.next();
                } while (!TextUtils.equals(friend.g(), s1));
                friend.mIsBlocked = flag;
            }
            return friend;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static FriendManager e()
    {
        return INSTANCE;
    }

    private void e(List list)
    {
        final HashMap timestamps = new HashMap();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            Friend friend = (Friend)iterator.next();
            ChatConversation chatconversation = sz.b(friend.g());
            long l1;
            if (chatconversation == null)
            {
                l1 = Math.max(friend.mTheyAddedMeTimestamp, friend.mIAddedThemTimestamp);
            } else
            {
                l1 = chatconversation.mTimestamp;
            }
            timestamps.put(friend, new Long(l1));
        }
        Collections.sort(list, new Comparator() {

            final FriendManager this$0;
            final HashMap val$timestamps;

            private long a(Friend friend1)
            {
                friend1 = (Long)timestamps.get(friend1);
                if (friend1 == null)
                {
                    return 0L;
                } else
                {
                    return friend1.longValue();
                }
            }

            public final int compare(Object obj, Object obj1)
            {
                obj = (Friend)obj;
                return Long.signum(a((Friend)obj1) - a(((Friend) (obj))));
            }

            
            {
                this$0 = FriendManager.this;
                timestamps = hashmap;
                super();
            }
        });
    }

    public static boolean e(Friend friend)
    {
        if (friend != null) goto _L2; else goto _L1
_L1:
        if (Bt.j() != com.snapchat.android.fragments.settings.SettingsFragment.PrivacyOptions.EVERYONE.ordinal()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (friend.mIsLocalStory || friend.mIsSharedStory || friend.mIsBlocked)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static Friend f(Friend friend)
    {
        Friend friend1 = new Friend(friend.g(), friend.mDisplayName, null);
        friend1.mTheyAddedMeTimestamp = friend.mTheyAddedMeTimestamp;
        friend1.mIAddedThemTimestamp = friend.mIAddedThemTimestamp;
        friend1.a(friend.r());
        friend1.a(friend.mSnapStreakCount);
        friend1.mBestFriendIndex = friend.mBestFriendIndex;
        friend1.mDirection = friend.mDirection;
        friend1.mStubFriend = true;
        return friend1;
    }

    private void f(List list)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = ((Friend)list.next()).d().toUpperCase(Locale.ENGLISH);
            if (!hashset1.add(s1))
            {
                hashset.add(s1);
            }
        } while (true);
        synchronized (mDuplicateFirstNames)
        {
            mDuplicateFirstNames.clear();
            mDuplicateFirstNames.addAll(hashset);
        }
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void g(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Friend friend = (Friend)list.next();
            if (!friend.mCanSeeCustomStories)
            {
                arraylist.add(friend.g());
            }
        } while (true);
        c(arraylist);
    }

    private void h(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        Object obj;
        for (list = list.iterator(); list.hasNext(); arraylist.add(obj))
        {
            obj = (QS)list.next();
            Friend friend = (Friend)mOutgoingFriendsListMap.a(((QS) (obj)).name);
            obj = new Friend(((QS) (obj)));
            if (friend != null)
            {
                obj.mDirection = Friend.Direction.BOTH;
                friend.mDirection = Friend.Direction.BOTH;
                friend.mTheyAddedMeTimestamp = ((Friend) (obj)).mTheyAddedMeTimestamp;
            }
        }

        a(arraylist);
    }

    public static boolean o(String s1)
    {
        return TextUtils.equals(Bt.q(), s1);
    }

    private static List p(String s1)
    {
        Object obj = Jh.a(s1, "~");
        s1 = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s2 = (String)((Iterator) (obj)).next();
            long l1;
            try
            {
                l1 = Long.parseLong(s2);
            }
            catch (NumberFormatException numberformatexception)
            {
                Timber.a("failed to parse long from string", numberformatexception);
                l1 = System.currentTimeMillis();
            }
            s1.add(Long.valueOf(l1));
        } while (true);
        return s1;
    }

    public static List u()
    {
        return p(SharedPreferenceKey.FINDFRIENDS_TIMESTAMPS.getString());
    }

    public static boolean v()
    {
        return SharedPreferenceKey.FIND_FRIENDS_TRIMMED.getBoolean();
    }

    public static boolean w()
    {
        SharedPreferences sharedpreferences = SharedPreferenceKey.HAS_GIVEN_ACCESS_TO_CONTACTS.getGroup().getSharedPreferences();
        boolean flag = sharedpreferences.getBoolean(SharedPreferenceKey.HAS_GIVEN_ACCESS_TO_CONTACTS.getKey(), false);
        String s1 = SharedPreferenceKey.USERNAME.getString();
        if (flag)
        {
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            if (!TextUtils.isEmpty(s1))
            {
                editor.putBoolean((new StringBuilder()).append(s1.hashCode()).append(SharedPreferenceKey.HAS_GIVEN_ACCESS_TO_CONTACTS.getKey()).toString(), true).apply();
            }
            editor.putBoolean(SharedPreferenceKey.HAS_GIVEN_ACCESS_TO_CONTACTS.getKey(), false).apply();
        }
        if (TextUtils.isEmpty(s1))
        {
            return false;
        } else
        {
            return sharedpreferences.getBoolean((new StringBuilder()).append(s1.hashCode()).append(SharedPreferenceKey.HAS_GIVEN_ACCESS_TO_CONTACTS.getKey()).toString(), false);
        }
    }

    public static List x()
    {
        return p(SharedPreferenceKey.IDENTITY_SUGGESTED_FRIEND_FIND_TIMESTAMPS.getString());
    }

    public static int y()
    {
        return SharedPreferenceKey.IDENTITY_SUGGESTED_FRIEND_FETCH_THRESHOLD.getInt();
    }

    public final int a(long l1)
    {
        Iterator iterator = p().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (a(friend, false) && a(friend, l1))
            {
                i1++;
            }
        } while (true);
        return i1;
    }

    public final Friend a(String s1)
    {
        return (Friend)mOutgoingFriendsListMap.a(s1);
    }

    public final List a()
    {
        return mOutgoingFriendsListMap.b();
    }

    public final List a(Set set, int i1)
    {
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = p().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            boolean flag;
            if (set != null && set.contains(friend.g()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (a(friend, flag))
            {
                linkedlist.add(friend);
            }
        } while (linkedlist.size() < i1);
        return linkedlist;
    }

    public final void a(String s1, String s2)
    {
        if (s1.equals(Bt.q()))
        {
            Bt.e(s2);
        } else
        {
            s1 = a(s1);
            if (s1 != null)
            {
                s1.a(s2);
                return;
            }
        }
    }

    public final void a(String s1, boolean flag)
    {
        Friend friend = a(s1);
        Friend friend1 = c(s1, flag);
        if (friend != null)
        {
            friend.mIsBlocked = flag;
            return;
        }
        if (friend1 != null)
        {
            d(friend1);
            return;
        } else
        {
            s1 = new Friend(s1);
            s1.mIsBlocked = true;
            d(s1);
            return;
        }
    }

    public final void a(List list)
    {
        Collections.sort(list, new Comparator() {

            final FriendManager this$0;

            public final volatile int compare(Object obj, Object obj1)
            {
                obj = (Friend)obj;
                long l1 = ((Friend)obj1).mTheyAddedMeTimestamp - ((Friend) (obj)).mTheyAddedMeTimestamp;
                if (l1 < 0xffffffff80000000L)
                {
                    return 0x80000000;
                }
                if (l1 > 0x7fffffffL)
                {
                    return 0x7fffffff;
                } else
                {
                    return (int)l1;
                }
            }

            
            {
                this$0 = FriendManager.this;
                super();
            }
        });
        synchronized (mFriendsWhoAddedMe)
        {
            mFriendsWhoAddedMe.clear();
            mFriendsWhoAddedMe.addAll(list);
        }
        Mf.a().a(new Nw());
        return;
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final boolean a(Ra ra)
    {
        Ra.a a1;
        ArrayList arraylist;
        HashSet hashset;
        int i1;
        if (!f())
        {
            Timber.e("FriendManager", "Don't sync friends because FriendManager hasn't been initialized!", new Object[0]);
            return false;
        }
        if (ra == null)
        {
            break MISSING_BLOCK_LABEL_560;
        }
        Object obj = ra.a();
        List list = ra.e();
        a1 = ra.c();
        arraylist = new ArrayList();
        hashset = new HashSet();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (QS)((Iterator) (obj)).next();
            if (((QS) (obj1)).name.equals(Bt.q()))
            {
                Bt.e(((QS) (obj1)).display);
            }
            hashset.add(((QS) (obj1)).name);
            if (QS.a.a(((QS) (obj1)).type) != QS.a.DELETED)
            {
                obj1 = new Friend(((QS) (obj1)));
                if (!arraylist.contains(obj1))
                {
                    obj1.mBestFriendIndex = list.indexOf(((Friend) (obj1)).g());
                    Friend friend = (Friend)mOutgoingFriendsListMap.a(((Friend) (obj1)).g());
                    if (friend != null)
                    {
                        obj1.mIAddedThemTimestamp = friend.mIAddedThemTimestamp;
                        obj1.mCustomTitle = friend.mCustomTitle;
                        obj1.mCustomDescription = friend.mCustomDescription;
                        obj1.mCashEligibility = friend.o();
                    }
                    ((Friend) (obj1)).p();
                    arraylist.add(obj1);
                }
            }
        } while (true);
        Timber.c("FriendManager", (new StringBuilder("setFriendsFromServer - new friends #: ")).append(arraylist.size()).append(", deleted #: ").append(hashset.size()).append(", friendsSyncType: ").append(a1).append(", existing outgoing friends #: ").append(mOutgoingFriendsListMap.c()).toString(), new Object[0]);
        i1 = mOutgoingFriendsListMap.c();
        static final class _cls4
        {

            static final int $SwitchMap$com$snapchat$soju$android$FriendsResponse$FriendsSyncType[];

            static 
            {
                $SwitchMap$com$snapchat$soju$android$FriendsResponse$FriendsSyncType = new int[Ra.a.values().length];
                try
                {
                    $SwitchMap$com$snapchat$soju$android$FriendsResponse$FriendsSyncType[Ra.a.PARTIAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$FriendsResponse$FriendsSyncType[Ra.a.FULL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4..SwitchMap.com.snapchat.soju.android.FriendsResponse.FriendsSyncType[a1.ordinal()];
        JVM INSTR tableswitch 1 1: default 364
    //                   1 522;
           goto _L1 _L2
_L1:
        mOutgoingFriendsListMap.a(arraylist);
_L4:
        h();
        int j1 = mOutgoingFriendsListMap.c();
        (new EasyMetric("FRIENDS_SYNC")).a("sync_type", a1.value).a("outgoing_friends_before_sync", Integer.valueOf(i1)).a("outgoing_friends_after_sync", Integer.valueOf(j1)).a("delta", Integer.valueOf(j1 - i1)).a("new_friends_from_server", Integer.valueOf(arraylist.size())).a("deleted_friends_from_server", Integer.valueOf(hashset.size())).b(true);
        Bt.y(ra.b());
        h(ra.d());
        Timber.c("FriendManager", (new StringBuilder("syncFriends - friendsSyncToken: ")).append(ra.b()).toString(), new Object[0]);
        return true;
_L2:
        synchronized (mOutgoingFriendsListMap)
        {
            mOutgoingFriendsListMap.a(hashset);
            mOutgoingFriendsListMap.b(arraylist);
        }
        if (true) goto _L4; else goto _L3
_L3:
        ra;
        jc;
        JVM INSTR monitorexit ;
        throw ra;
        t();
        return false;
    }

    public final Friend b(String s1)
    {
label0:
        {
            Friend friend;
            synchronized (mFriendsWhoAddedMe)
            {
                Iterator iterator = mFriendsWhoAddedMe.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    friend = (Friend)iterator.next();
                } while (!friend.g().equals(s1));
            }
            return friend;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final List b()
    {
        return mBests;
    }

    public final void b(String s1, boolean flag)
    {
        Object obj = a(s1);
        if (obj != null)
        {
            obj.mHasBeenAddedAsFriend = flag;
        }
        obj = m().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Friend friend = (Friend)((Iterator) (obj)).next();
            if (!TextUtils.equals(friend.g(), s1))
            {
                continue;
            }
            friend.mHasBeenAddedAsFriend = flag;
            break;
        } while (true);
    }

    public final void b(List list)
    {
        synchronized (mSuggestedFriends)
        {
            mSuggestedFriends.clear();
            mSuggestedFriends.addAll(list);
        }
        return;
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final boolean b(Friend friend)
    {
        boolean flag;
        synchronized (mContactsNotOnSnapchat)
        {
            flag = mContactsOnSnapchatSet.contains(friend);
        }
        return flag;
        friend;
        list;
        JVM INSTR monitorexit ;
        throw friend;
    }

    public final List c()
    {
        return mRecents;
    }

    public final void c(List list)
    {
        synchronized (mFriendsBlockedFromSeeingMyStory)
        {
            mFriendsBlockedFromSeeingMyStory.clear();
            mFriendsBlockedFromSeeingMyStory.addAll(list);
        }
        return;
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final boolean c(Friend friend)
    {
        boolean flag;
        synchronized (mFriendsWhoAddedMe)
        {
            flag = mFriendsWhoAddedMe.contains(friend);
        }
        return flag;
        friend;
        list;
        JVM INSTR monitorexit ;
        throw friend;
    }

    public final boolean c(String s1)
    {
        return mOutgoingFriendsListMap.b(s1);
    }

    public final List d()
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = mOutgoingFriendsListMap.b().iterator();
_L9:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Friend friend = (Friend)iterator.next();
        if (!friend.mCandidateForNeedsLove) goto _L4; else goto _L3
_L3:
        if (friend.mDirection != Friend.Direction.INCOMING && !friend.mIsPending && !friend.mIsBlocked && !friend.mIsFollowing) goto _L6; else goto _L5
_L5:
        boolean flag = false;
_L7:
        if (flag)
        {
            friend = f(friend);
            friend.mSelectedForNeedsLove = true;
            arraylist.add(friend);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (mRecents.contains(friend) || mBests.contains(friend))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (!friend.g().equals(Bt.q()))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        return (new Pr()).a(arraylist);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void d(Friend friend)
    {
        if (friend != null)
        {
            mOutgoingFriendsListMap.a(friend);
        }
    }

    public final void d(String s1)
    {
label0:
        {
            synchronized (mSuggestedFriends)
            {
                Iterator iterator = mSuggestedFriends.iterator();
                Friend friend;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    friend = (Friend)iterator.next();
                } while (!friend.g().equals(s1));
                mSuggestedFriends.remove(friend);
            }
            return;
        }
        list;
        JVM INSTR monitorexit ;
        return;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void d(List list)
    {
        if (list == null || list.isEmpty())
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (QS)list.next();
            if (QS.a.a(((QS) (obj)).type) != QS.a.DELETED)
            {
                obj = new Friend(((QS) (obj)));
                ((Friend) (obj)).p();
                arraylist.add(obj);
            }
        } while (true);
        mOutgoingFriendsListMap.b(arraylist);
    }

    public final void e(String s1)
    {
        List list = mFriendsWhoAddedMe;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mFriendsWhoAddedMe.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (TextUtils.equals(friend.g(), s1))
            {
                friend.mIsIgnored = true;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_63;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void f(String s1)
    {
        Friend friend = new Friend(s1);
        mOutgoingFriendsListMap.b(friend);
        List list1 = p();
        int i1 = list1.indexOf(friend);
        if (i1 != -1)
        {
            ((Friend)list1.get(i1)).mHasBeenAddedAsFriend = false;
        }
        boolean flag;
        synchronized (mFriendsWhoAddedMe)
        {
            flag = a(mFriendsWhoAddedMe, s1);
        }
        if (flag)
        {
            Mf.a().a(new Nw());
        }
        h(s1);
        g(s1);
        Bj.a().d(s1);
        s1 = sz.b(s1);
        if (s1 != null)
        {
            s1.c(false);
        }
        return;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean f()
    {
        return mUserProvider.get() != null && Bt.u();
    }

    public final void g()
    {
        a(p(), mOutgoingFriendsListMap.b());
    }

    public final void g(String s1)
    {
        a(mRecents, s1);
    }

    public final void h()
    {
        ArrayList arraylist = mOutgoingFriendsListMap.b();
        List list = p();
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (friend.j())
            {
                arraylist1.add(f(friend));
            }
        } while (true);
        Collections.sort(arraylist1, new Comparator() {

            final FriendManager this$0;

            public final int compare(Object obj, Object obj1)
            {
                obj = (Friend)obj;
                obj1 = (Friend)obj1;
                return Integer.valueOf(((Friend) (obj)).mBestFriendIndex).compareTo(Integer.valueOf(((Friend) (obj1)).mBestFriendIndex));
            }

            
            {
                this$0 = FriendManager.this;
                super();
            }
        });
        synchronized (mBests)
        {
            mBests.clear();
            mBests.addAll(arraylist1);
        }
        a(list, arraylist);
        f(arraylist);
        g(arraylist);
        return;
        exception;
        list1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void h(String s1)
    {
        a(mBests, s1);
    }

    public final Friend i(String s1)
    {
        if (f())
        {
            Friend friend = a(s1);
            if (friend != null)
            {
                return friend;
            }
        }
        return new Friend(s1);
    }

    public final ArrayList i()
    {
        final ArrayList friends = new ArrayList();
        mOutgoingFriendsListMap.a(new Jc.b() {

            final FriendManager this$0;
            final ArrayList val$friends;

            public final void a(Object obj)
            {
                boolean flag1;
                flag1 = true;
                obj = (Friend)obj;
                if (TextUtils.equals(((Friend) (obj)).g(), Bt.q()) || ((Friend) (obj)).mIsBlocked) goto _L2; else goto _L1
_L1:
                boolean flag;
                if (Bj.a().c(((Friend) (obj)).mUsername) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || ((Friend) (obj)).mIsSharedStory) goto _L2; else goto _L3
_L3:
                flag = flag1;
_L5:
                if (flag)
                {
                    friends.add(obj);
                }
                return;
_L2:
                flag = false;
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                this$0 = FriendManager.this;
                friends = arraylist;
                super();
            }
        });
        return friends;
    }

    public final ArrayList j()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mOutgoingFriendsListMap.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (!friend.g().equals(Bt.q()) && !friend.mIsBlocked && !friend.n())
            {
                arraylist.add(friend);
            }
        } while (true);
        Collections.sort(arraylist);
        return arraylist;
    }

    public final boolean j(String s1)
    {
        if (f())
        {
            s1 = a(s1);
            if (s1 != null)
            {
                return s1.f();
            }
        }
        return false;
    }

    public final String k(String s1)
    {
        Object obj1 = s1;
        if (f())
        {
            obj1 = a(s1);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = b(s1);
            }
            obj1 = s1;
            if (obj != null)
            {
                obj1 = ((Friend) (obj)).c();
            }
        }
        return ((String) (obj1));
    }

    public final List k()
    {
        final ArrayList friends = new ArrayList();
        mOutgoingFriendsListMap.a(new Jc.b() {

            final FriendManager this$0;
            final List val$friends;

            public final void a(Object obj)
            {
                obj = (Friend)obj;
                if (FriendManager.e(((Friend) (obj))))
                {
                    friends.add(obj);
                }
            }

            
            {
                this$0 = FriendManager.this;
                friends = list;
                super();
            }
        });
        return friends;
    }

    public final List l()
    {
        ArrayList arraylist;
        synchronized (mContactsNotOnSnapchat)
        {
            arraylist = new ArrayList(mContactsNotOnSnapchat);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean l(String s1)
    {
        return a(s1) != null;
    }

    public final List m()
    {
        ArrayList arraylist;
        synchronized (mContactsOnSnapchat)
        {
            arraylist = new ArrayList(mContactsOnSnapchat);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean m(String s1)
    {
        return e(a(s1));
    }

    public final List n()
    {
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet(mOutgoingFriendsListMap.b());
        Iterator iterator = m().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (!friend.mIsBlocked && !hashset.contains(friend))
            {
                arraylist.add(friend);
            }
        } while (true);
        return arraylist;
    }

    public final boolean n(String s1)
    {
        if (f())
        {
            s1 = a(s1);
            if (s1 != null && ((Friend) (s1)).mIsLocalStory)
            {
                return true;
            }
        }
        return false;
    }

    public final int o()
    {
        final AtomicInteger bidirectionalFriendCount = new AtomicInteger();
        mOutgoingFriendsListMap.a(new Jc.b() {

            final FriendManager this$0;
            final AtomicInteger val$bidirectionalFriendCount;

            public final void a(Object obj)
            {
                if (FriendManager.a((Friend)obj))
                {
                    bidirectionalFriendCount.incrementAndGet();
                }
            }

            
            {
                this$0 = FriendManager.this;
                bidirectionalFriendCount = atomicinteger;
                super();
            }
        });
        return bidirectionalFriendCount.intValue();
    }

    public final List p()
    {
        ArrayList arraylist;
        synchronized (mFriendsWhoAddedMe)
        {
            arraylist = new ArrayList(mFriendsWhoAddedMe);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long q()
    {
        Iterator iterator = p().iterator();
        long l1;
        for (l1 = 0L; iterator.hasNext(); l1 = Math.max(((Friend)iterator.next()).mTheyAddedMeTimestamp, l1)) { }
        return l1;
    }

    public final List r()
    {
        final Object blockedFriends;
        final HashSet blockedFriendsSet;
        blockedFriends = new ArrayList();
        blockedFriendsSet = new HashSet();
        mOutgoingFriendsListMap.a(new Jc.b() {

            final FriendManager this$0;
            final ArrayList val$blockedFriends;
            final Set val$blockedFriendsSet;

            public final void a(Object obj)
            {
                obj = (Friend)obj;
                if (((Friend) (obj)).mIsBlocked)
                {
                    blockedFriends.add(obj);
                    blockedFriendsSet.add(obj);
                }
            }

            
            {
                this$0 = FriendManager.this;
                blockedFriends = arraylist;
                blockedFriendsSet = set;
                super();
            }
        });
        List list = mFriendsWhoAddedMe;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = mFriendsWhoAddedMe.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (friend.mIsBlocked && !blockedFriendsSet.contains(friend))
            {
                ((ArrayList) (blockedFriends)).add(friend);
                blockedFriendsSet.add(friend);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_116;
        blockedFriends;
        list;
        JVM INSTR monitorexit ;
        throw blockedFriends;
        list;
        JVM INSTR monitorexit ;
        return ((List) (blockedFriends));
    }

    public final List s()
    {
        ArrayList arraylist;
        synchronized (mSuggestedFriends)
        {
            arraylist = new ArrayList(mSuggestedFriends);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void t()
    {
        mOutgoingFriendsListMap.a(new Jc.b() {

            final FriendManager this$0;

            public final void a(Object obj)
            {
                ((Friend)obj).p();
            }

            
            {
                this$0 = FriendManager.this;
                super();
            }
        });
    }


    // Unreferenced inner class com/snapchat/android/model/FriendManager$10

/* anonymous class */
    public final class _cls10
        implements Jc.a
    {

        final FriendManager this$0;
        final String val$sharedStoryId;

        public final boolean a(Object obj)
        {
            return TextUtils.equals(((Friend)obj).mSharedStoryId, sharedStoryId);
        }

            public 
            {
                this$0 = FriendManager.this;
                sharedStoryId = s1;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/model/FriendManager$2

/* anonymous class */
    public final class _cls2
        implements Comparator
    {

        final FriendManager this$0;

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (Friend)obj;
            long l1 = ((Friend)obj1).mTheyAddedMeTimestamp - ((Friend) (obj)).mTheyAddedMeTimestamp;
            if (l1 < 0xffffffff80000000L)
            {
                return 0x80000000;
            }
            if (l1 > 0x7fffffffL)
            {
                return 0x7fffffff;
            } else
            {
                return (int)l1;
            }
        }

            public 
            {
                this$0 = FriendManager.this;
                super();
            }
    }

}
