// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import Bb;
import Br;
import Bt;
import IJ;
import IP;
import LY;
import QJ;
import QK;
import QS;
import QV;
import Rj;
import UG;
import Uh;
import android.os.SystemClock;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.util.FriendSectionizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import mr;
import yn;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, FriendAction

public final class Friend
    implements Comparable, yn
{
    public static final class AddSourceType extends Enum
    {

        private static final AddSourceType $VALUES[];
        public static final AddSourceType ADDED_BY_ADDED_ME_BACK;
        public static final AddSourceType ADDED_BY_NEARBY;
        public static final AddSourceType ADDED_BY_OFFICIAL_STORY_SEARCH;
        public static final AddSourceType ADDED_BY_PHONE;
        public static final AddSourceType ADDED_BY_QR_CODE;
        public static final AddSourceType ADDED_BY_SUGGESTED;
        public static final AddSourceType ADDED_BY_USERNAME;
        public static final AddSourceType UNKNOWN;

        public static AddSourceType fromValue(String s1)
        {
            if (TextUtils.isEmpty(s1))
            {
                break MISSING_BLOCK_LABEL_40;
            }
            s1 = valueOf(s1);
            return s1;
            s1;
            Timber.e("Friend", (new StringBuilder("Invalid enum for AddSourceType ")).append(s1).toString(), new Object[0]);
            return UNKNOWN;
        }

        public static AddSourceType valueOf(String s1)
        {
            return (AddSourceType)Enum.valueOf(com/snapchat/android/model/Friend$AddSourceType, s1);
        }

        public static AddSourceType[] values()
        {
            return (AddSourceType[])$VALUES.clone();
        }

        public final String getMetricName()
        {
            return name();
        }

        static 
        {
            ADDED_BY_PHONE = new AddSourceType("ADDED_BY_PHONE", 0);
            ADDED_BY_USERNAME = new AddSourceType("ADDED_BY_USERNAME", 1);
            ADDED_BY_QR_CODE = new AddSourceType("ADDED_BY_QR_CODE", 2);
            ADDED_BY_ADDED_ME_BACK = new AddSourceType("ADDED_BY_ADDED_ME_BACK", 3);
            ADDED_BY_NEARBY = new AddSourceType("ADDED_BY_NEARBY", 4);
            ADDED_BY_SUGGESTED = new AddSourceType("ADDED_BY_SUGGESTED", 5);
            ADDED_BY_OFFICIAL_STORY_SEARCH = new AddSourceType("ADDED_BY_OFFICIAL_STORY_SEARCH", 6);
            UNKNOWN = new AddSourceType("UNKNOWN", 7);
            $VALUES = (new AddSourceType[] {
                ADDED_BY_PHONE, ADDED_BY_USERNAME, ADDED_BY_QR_CODE, ADDED_BY_ADDED_ME_BACK, ADDED_BY_NEARBY, ADDED_BY_SUGGESTED, ADDED_BY_OFFICIAL_STORY_SEARCH, UNKNOWN
            });
        }

        private AddSourceType(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class Direction extends Enum
    {

        private static final Direction $VALUES[];
        public static final Direction BOTH;
        public static final Direction INCOMING;
        public static final Direction OUTGOING;
        public static final Direction UNKNOWN;

        public static Direction fromValue(String s1)
        {
            try
            {
                s1 = valueOf(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return UNKNOWN;
            }
            return s1;
        }

        public static Direction valueOf(String s1)
        {
            return (Direction)Enum.valueOf(com/snapchat/android/model/Friend$Direction, s1);
        }

        public static Direction[] values()
        {
            return (Direction[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new Direction("UNKNOWN", 0);
            INCOMING = new Direction("INCOMING", 1);
            OUTGOING = new Direction("OUTGOING", 2);
            BOTH = new Direction("BOTH", 3);
            $VALUES = (new Direction[] {
                UNKNOWN, INCOMING, OUTGOING, BOTH
            });
        }

        private Direction(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class SuggestReason extends Enum
    {

        private static final SuggestReason $VALUES[];
        public static final SuggestReason FRIEND_GRAPH;
        public static final SuggestReason NEW_CONTACT;
        public static final SuggestReason NEW_SNAPCHATTER;
        public static final SuggestReason UNKNOWN;
        public static final SuggestReason UNRECOGNIZED_VALUE;
        private final String value;

        public static SuggestReason fromValue(String s1)
        {
            try
            {
                s1 = valueOf(s1.toUpperCase(Locale.US));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return UNRECOGNIZED_VALUE;
            }
            return s1;
        }

        public static SuggestReason valueOf(String s1)
        {
            return (SuggestReason)Enum.valueOf(com/snapchat/android/model/Friend$SuggestReason, s1);
        }

        public static SuggestReason[] values()
        {
            return (SuggestReason[])$VALUES.clone();
        }

        public final String toString()
        {
            return value;
        }

        public final String value()
        {
            return value;
        }

        static 
        {
            NEW_CONTACT = new SuggestReason("NEW_CONTACT", 0, "new_contact");
            NEW_SNAPCHATTER = new SuggestReason("NEW_SNAPCHATTER", 1, "new_snapchatter");
            FRIEND_GRAPH = new SuggestReason("FRIEND_GRAPH", 2, "friend_graph");
            UNKNOWN = new SuggestReason("UNKNOWN", 3, "unknown");
            UNRECOGNIZED_VALUE = new SuggestReason("UNRECOGNIZED_VALUE", 4, "UNRECOGNIZED_VALUE");
            $VALUES = (new SuggestReason[] {
                NEW_CONTACT, NEW_SNAPCHATTER, FRIEND_GRAPH, UNKNOWN, UNRECOGNIZED_VALUE
            });
        }

        private SuggestReason(String s1, int i1, String s2)
        {
            super(s1, i1);
            value = s2;
        }
    }

    public static final class SuggestState extends Enum
    {

        private static final SuggestState $VALUES[];
        public static final SuggestState ADDRESS_BOOK;
        public static final SuggestState DOES_NOT_EXIST;
        public static final SuggestState EXISTS;
        public static final SuggestState FAILED;
        public static final SuggestState NOT_SUGGESTION;
        public static final SuggestState PENDING;

        public static SuggestState valueOf(String s1)
        {
            return (SuggestState)Enum.valueOf(com/snapchat/android/model/Friend$SuggestState, s1);
        }

        public static SuggestState[] values()
        {
            return (SuggestState[])$VALUES.clone();
        }

        static 
        {
            NOT_SUGGESTION = new SuggestState("NOT_SUGGESTION", 0);
            PENDING = new SuggestState("PENDING", 1);
            FAILED = new SuggestState("FAILED", 2);
            EXISTS = new SuggestState("EXISTS", 3);
            DOES_NOT_EXIST = new SuggestState("DOES_NOT_EXIST", 4);
            ADDRESS_BOOK = new SuggestState("ADDRESS_BOOK", 5);
            $VALUES = (new SuggestState[] {
                NOT_SUGGESTION, PENDING, FAILED, EXISTS, DOES_NOT_EXIST, ADDRESS_BOOK
            });
        }

        private SuggestState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class SuggestType extends Enum
    {

        private static final SuggestType $VALUES[];
        public static final SuggestType ADDRESS_BOOK;
        public static final SuggestType NONE;
        public static final SuggestType OFFICIAL_STORY;
        public static final SuggestType USERNAME;

        public static SuggestType valueOf(String s1)
        {
            return (SuggestType)Enum.valueOf(com/snapchat/android/model/Friend$SuggestType, s1);
        }

        public static SuggestType[] values()
        {
            return (SuggestType[])$VALUES.clone();
        }

        static 
        {
            USERNAME = new SuggestType("USERNAME", 0);
            ADDRESS_BOOK = new SuggestType("ADDRESS_BOOK", 1);
            OFFICIAL_STORY = new SuggestType("OFFICIAL_STORY", 2);
            NONE = new SuggestType("NONE", 3);
            $VALUES = (new SuggestType[] {
                USERNAME, ADDRESS_BOOK, OFFICIAL_STORY, NONE
            });
        }

        private SuggestType(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class a extends FriendSectionizer
    {

        public static com.snapchat.android.util.FriendSectionizer.FriendSection a(Friend friend)
        {
            if (friend.j() && friend.mStubFriend)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.BEST_FRIEND;
            }
            if (friend.mIsRecent && friend.mStubFriend)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.RECENT;
            }
            if (friend.mSelectedForNeedsLove && friend.mStubFriend)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.NEEDS_LOVE;
            }
            if (friend.g().equals(Bt.q()) && friend.mStubFriend)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.ME;
            }
            if (friend.mStubFriend)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.STORIES;
            }
            if (friend.mJustAdded)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.JUST_ADDED;
            }
            if (friend.m())
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.SUGGESTED;
            }
            if (friend.mIsBlocked)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.BLOCKED;
            } else
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.ALPHABETICAL;
            }
        }

        public final volatile com.snapchat.android.util.FriendSectionizer.FriendSection a(Object obj, int i1)
        {
            return a((Friend)obj);
        }

        public a()
        {
        }
    }


    private static final String OFFICIAL_STORIES_FRIENDMOJI_PREFIX = "official_story";
    private static final String SNAP_STREAK = "snap_streak";
    private static final String TAG = "Friend";
    private static final int USERNAME_MATCH_LENGTH_OFFICIAL_STORIES_FRIEND_SEARCH = 5;
    public String mAddSource;
    public AddSourceType mAddSourceType;
    public int mBestFriendIndex;
    public boolean mCanSeeCustomStories;
    public boolean mCandidateForNeedsLove;
    public TD.a mCashEligibility;
    public String mCustomDescription;
    public String mCustomTitle;
    public Direction mDirection;
    public String mDisplayName;
    private final FriendManager mFriendManager;
    public com.snapchat.android.util.FriendSectionizer.FriendSection mFriendSection;
    private String mFriendmojiString;
    private List mFriendmojiSymbols;
    public boolean mHasBeenAddedAsFriend;
    public boolean mHasProfileImages;
    public long mIAddedThemTimestamp;
    public boolean mIsBlocked;
    public boolean mIsFollowing;
    public boolean mIsHidden;
    public boolean mIsIgnored;
    public boolean mIsLocalStory;
    public boolean mIsPending;
    public boolean mIsRecent;
    public boolean mIsRecommended;
    public boolean mIsSharedStory;
    public boolean mIsVerifiedSearchResult;
    public boolean mJustAdded;
    private long mLastUpdatedFriendmojiDictStamp;
    public FriendAction mPendingAction;
    private int mPendingSnapsCount;
    public String mPhoneNumber;
    public long mProfileImagesLastFetchedTimestamp;
    private Set mSearchKeywords;
    public boolean mSelectedForNeedsLove;
    public String mSharedStoryId;
    public boolean mShouldFetchCustomDescription;
    public int mSnapStreakCount;
    public boolean mStubFriend;
    public String mSuggestReason;
    public String mSuggestReasonDisplay;
    public SuggestType mSuggestType;
    public SuggestState mSuggestionState;
    public long mTheyAddedMeTimestamp;
    public String mUserId;
    public final Provider mUserProvider;
    public String mUsername;

    public Friend(QS qs)
    {
        boolean flag1 = false;
        this(qs.name, qs.display);
        QS.a a1 = QS.a.a(qs.type);
        if (a1 == QS.a.BLOCKED)
        {
            mIsBlocked = true;
        } else
        {
            mUserId = qs.userId;
            mTheyAddedMeTimestamp = IJ.a(qs.ts);
            mPendingSnapsCount = IJ.a(qs.pendingSnapsCount);
            mIsSharedStory = IJ.a(qs.isSharedStory);
            mShouldFetchCustomDescription = IJ.a(qs.hasCustomDescription);
            mSharedStoryId = qs.sharedStoryId;
            mIsLocalStory = IJ.a(qs.localStory);
            mIsIgnored = IJ.a(qs.ignoredLink);
            mIsHidden = IJ.a(qs.hiddenLink);
            mDirection = Direction.fromValue(qs.direction);
            mAddSource = qs.addSource;
            mAddSourceType = AddSourceType.fromValue(qs.addSourceType);
            boolean flag;
            if (a1 == QS.a.PENDING)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mIsPending = flag;
            flag = flag1;
            if (a1 == QS.a.FOLLOWING)
            {
                flag = true;
            }
            mIsFollowing = flag;
            mDirection = Direction.fromValue(qs.direction);
            if (mDirection == Direction.OUTGOING && a1 == QS.a.FRIEND)
            {
                mDirection = Direction.BOTH;
            }
            mFriendmojiSymbols = qs.friendmojiSymbols;
            mSnapStreakCount = IJ.a(qs.snapStreakCount);
            mCandidateForNeedsLove = IJ.a(qs.needsLove);
            mCanSeeCustomStories = IJ.a(qs.canSeeCustomStories);
            if (mFriendManager.f())
            {
                a((Br)mUserProvider.get());
                if (mFriendManager.c(g()))
                {
                    mHasBeenAddedAsFriend = true;
                    return;
                }
            }
        }
    }

    public Friend(QV qv)
    {
        this(qv.b(), qv.c());
        mIsBlocked = false;
        mUserId = qv.a();
        mIsVerifiedSearchResult = true;
        mSuggestType = SuggestType.OFFICIAL_STORY;
        mSuggestionState = SuggestState.EXISTS;
        Object obj = qv.f();
        mSearchKeywords = new HashSet();
        String s1;
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); mSearchKeywords.add(IP.a(s1)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        mFriendmojiSymbols = qv.d();
        obj = (Br)mUserProvider.get();
        if (obj != null)
        {
            ((Br) (obj)).b(qv.e());
        }
        if (mFriendManager.f())
        {
            a((Br)mUserProvider.get());
            if (mFriendManager.c(g()))
            {
                mHasBeenAddedAsFriend = true;
            }
        }
    }

    public Friend(UG ug)
    {
        this(ug.b(), ug.e());
        mUserId = ug.a();
        mSuggestReason = ug.c();
        mSuggestReasonDisplay = ug.d();
    }

    public Friend(Uh uh)
    {
        this(((QS) (uh)));
        mIsRecommended = uh.a().booleanValue();
    }

    public Friend(String s1)
    {
        this(s1, "");
    }

    public Friend(String s1, String s2)
    {
        this(s1, s2, "");
    }

    public Friend(String s1, String s2, String s3)
    {
        this(s1, s2, s3, Br.UNSAFE_USER_PROVIDER, FriendManager.e());
    }

    private Friend(String s1, String s2, String s3, Provider provider, FriendManager friendmanager)
    {
        mSuggestionState = SuggestState.NOT_SUGGESTION;
        mSuggestType = SuggestType.NONE;
        mJustAdded = false;
        mHasBeenAddedAsFriend = false;
        mIAddedThemTimestamp = 0L;
        mBestFriendIndex = -1;
        mPendingAction = FriendAction.NONE;
        mDirection = Direction.UNKNOWN;
        mLastUpdatedFriendmojiDictStamp = -1L;
        mAddSourceType = AddSourceType.UNKNOWN;
        mCanSeeCustomStories = true;
        mProfileImagesLastFetchedTimestamp = 0L;
        mFriendSection = com.snapchat.android.util.FriendSectionizer.FriendSection.NONE;
        mStubFriend = false;
        String s4 = s1;
        if (s1 == null)
        {
            s4 = "";
        }
        mUsername = s4;
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        a(s1);
        mPhoneNumber = s3;
        mUserProvider = provider;
        mFriendManager = friendmanager;
    }

    private String a(Br br)
    {
        StringBuilder stringbuilder = new StringBuilder();
        mLastUpdatedFriendmojiDictStamp = br.mUpdateFriendmojiDictStamp;
        br = br.j();
        if (mFriendmojiSymbols != null && !mFriendmojiSymbols.isEmpty())
        {
            Iterator iterator = mFriendmojiSymbols.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    if (((String) (obj)).equals("snap_streak"))
                    {
                        stringbuilder.append(mSnapStreakCount);
                    } else
                    {
                        obj = (QJ)br.get(obj);
                        if (obj != null && ((QJ) (obj)).b() == QK.UNICODE)
                        {
                            stringbuilder.append(((QJ) (obj)).c());
                        }
                    }
                }
            } while (true);
        }
        mFriendmojiString = stringbuilder.toString();
        return mFriendmojiString;
    }

    public final int a(Friend friend)
    {
        int j1 = IP.d(c().toLowerCase(Locale.US), friend.c().toLowerCase(Locale.US));
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = IP.d(g().toLowerCase(Locale.US), friend.g().toLowerCase(Locale.US));
        }
        return i1;
    }

    public final String a()
    {
        return c();
    }

    public final void a(int i1)
    {
        mSnapStreakCount = i1;
        Br br = (Br)mUserProvider.get();
        if (br != null)
        {
            a(br);
        }
    }

    public final void a(String s1)
    {
        mDisplayName = IP.b(s1);
    }

    public final void a(List list)
    {
        mFriendmojiSymbols = list;
        list = (Br)mUserProvider.get();
        if (list != null)
        {
            a(((Br) (list)));
        }
    }

    public final String b()
    {
        if (f())
        {
            return mUsername;
        } else
        {
            return null;
        }
    }

    public final boolean b(String s1)
    {
        s1 = IP.a(s1);
        for (String s2 = IP.a(mUsername); IP.c(s2, s1) || s1.length() >= 5 && IP.a(s2, s1);)
        {
            return true;
        }

        if (mSearchKeywords != null)
        {
            return mSearchKeywords.contains(s1);
        } else
        {
            return false;
        }
    }

    public final String c()
    {
        if (!f())
        {
            return mUsername;
        } else
        {
            return mDisplayName;
        }
    }

    public final int compareTo(Object obj)
    {
        return a((Friend)obj);
    }

    public final String d()
    {
        if (TextUtils.isEmpty(mDisplayName))
        {
            return mUsername;
        }
        String as[] = mDisplayName.split(" ");
        if (as.length <= 0)
        {
            return mUsername;
        } else
        {
            return as[0];
        }
    }

    public final String e()
    {
        String s1 = d();
        FriendManager friendmanager = mFriendManager;
        String s2 = s1.toUpperCase(Locale.ENGLISH);
        if (friendmanager.mDuplicateFirstNames.contains(s2))
        {
            s1 = c();
        }
        return s1;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Friend))
        {
            return false;
        }
        obj = (Friend)obj;
        if (TextUtils.isEmpty(mUsername))
        {
            return TextUtils.equals(mPhoneNumber, ((Friend) (obj)).mPhoneNumber);
        } else
        {
            return TextUtils.equals(mUsername, ((Friend) (obj)).g());
        }
    }

    public final boolean f()
    {
        return !TextUtils.isEmpty(mDisplayName);
    }

    public final String g()
    {
        if (mUsername == null)
        {
            throw new NullPointerException();
        } else
        {
            return mUsername;
        }
    }

    public final boolean h()
    {
        return !TextUtils.isEmpty(mUsername);
    }

    public final int hashCode()
    {
        return mUsername.hashCode();
    }

    public final boolean i()
    {
        return !TextUtils.isEmpty(mPhoneNumber);
    }

    public final boolean j()
    {
        return mBestFriendIndex >= 0;
    }

    public final boolean k()
    {
        return TextUtils.equals(mUsername, Bt.q());
    }

    public final boolean l()
    {
        return !TextUtils.isEmpty(mSuggestReason);
    }

    public final boolean m()
    {
        return mSuggestionState != SuggestState.NOT_SUGGESTION;
    }

    public final boolean n()
    {
        return mIsSharedStory || mIsLocalStory;
    }

    public final TD.a o()
    {
        if (mCashEligibility == null)
        {
            mCashEligibility = TD.a.SERVICE_NOT_AVAILABLE_TO_RECIPIENT;
        }
        return mCashEligibility;
    }

    public final void p()
    {
        Bb bb;
        String s1;
label0:
        {
            if ((mIsSharedStory || mIsLocalStory) && mShouldFetchCustomDescription)
            {
                bb = Bb.a();
                s1 = mSharedStoryId;
                if (Br.a() != null)
                {
                    long l1 = SystemClock.elapsedRealtime();
                    if (bb.mSharedDescriptions.containsKey(s1) && !bb.mLastFetchTime.containsKey(s1))
                    {
                        Timber.d("SharedStoryDescriptionManager", "This shouldn't have happened. sharedId:%s present in list of shared descriptions but not in last fetch times. Refetching.", new Object[] {
                            s1
                        });
                    }
                    boolean flag;
                    if (bb.mSharedDescriptions.containsKey(s1) && bb.mLastFetchTime.containsKey(s1))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag && l1 - ((Long)bb.mLastFetchTime.get(s1)).longValue() <= 0x493e0L)
                    {
                        flag = false;
                    } else
                    {
                        flag = true;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    (new mr(s1)).execute();
                }
            }
            return;
        }
        bb.a((Rj)bb.mSharedDescriptions.get(s1));
    }

    public final String q()
    {
        if ((mFriendmojiSymbols == null || mFriendmojiSymbols.isEmpty()) && LY.b())
        {
            return LY.a();
        }
        Br br = (Br)mUserProvider.get();
        if (br == null)
        {
            return "";
        }
        if (TextUtils.isEmpty(mFriendmojiString) || mLastUpdatedFriendmojiDictStamp != br.mUpdateFriendmojiDictStamp)
        {
            a(br);
        }
        return mFriendmojiString;
    }

    public final List r()
    {
        if (mFriendmojiSymbols == null)
        {
            return Collections.emptyList();
        } else
        {
            return mFriendmojiSymbols;
        }
    }

    public final List s()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = r().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.contains("official_story"))
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    public final String t()
    {
        if (mUserId == null)
        {
            return (new StringBuilder("username-")).append(g()).toString();
        } else
        {
            return mUserId;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Friend [mLiveDisplayName=")).append(mDisplayName).append(", mUsername=").append(mUsername).append("]").toString();
    }
}
