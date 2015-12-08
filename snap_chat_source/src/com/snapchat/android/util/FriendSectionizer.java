// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.content.Context;
import android.text.TextUtils;
import com.snapchat.android.model.Friend;
import java.util.Locale;

public abstract class FriendSectionizer
{
    public static final class FriendSection extends Enum
    {

        private static final FriendSection $VALUES[];
        public static final FriendSection ADD_FRIEND;
        public static final FriendSection ALPHABETICAL;
        public static final FriendSection BEST_FRIEND;
        public static final FriendSection BLOCKED;
        public static final FriendSection DEFAULT;
        public static final FriendSection FRIENDS_WHO_ADDED_ME;
        public static final FriendSection INVITE;
        public static final FriendSection JUST_ADDED;
        public static final FriendSection LIVE;
        public static final FriendSection ME;
        public static final FriendSection MY_ADDRESS_BOOK;
        public static final FriendSection MY_FRIENDS;
        public static final FriendSection NEEDS_LOVE;
        public static final FriendSection NEW_FRIEND;
        public static final FriendSection NONE;
        public static final FriendSection ON_SNAPCHAT;
        public static final FriendSection ON_SNAPCHAT_TRUNCATED;
        public static final FriendSection PENDING;
        public static final FriendSection RECENT;
        public static final FriendSection RECOMMENDED;
        public static final FriendSection STORIES;
        public static final FriendSection SUGGESTED;
        public static final FriendSection SUGGESTED_FRIEND;
        public static final FriendSection USERNAME;
        public static final FriendSection VERIFIED;

        public static FriendSection valueOf(String s)
        {
            return (FriendSection)Enum.valueOf(com/snapchat/android/util/FriendSectionizer$FriendSection, s);
        }

        public static FriendSection[] values()
        {
            return (FriendSection[])$VALUES.clone();
        }

        static 
        {
            STORIES = new FriendSection("STORIES", 0);
            LIVE = new FriendSection("LIVE", 1);
            VERIFIED = new FriendSection("VERIFIED", 2);
            SUGGESTED = new FriendSection("SUGGESTED", 3);
            ADD_FRIEND = new FriendSection("ADD_FRIEND", 4);
            PENDING = new FriendSection("PENDING", 5);
            BLOCKED = new FriendSection("BLOCKED", 6);
            BEST_FRIEND = new FriendSection("BEST_FRIEND", 7);
            RECENT = new FriendSection("RECENT", 8);
            NEEDS_LOVE = new FriendSection("NEEDS_LOVE", 9);
            DEFAULT = new FriendSection("DEFAULT", 10);
            JUST_ADDED = new FriendSection("JUST_ADDED", 11);
            NEW_FRIEND = new FriendSection("NEW_FRIEND", 12);
            ALPHABETICAL = new FriendSection("ALPHABETICAL", 13);
            ON_SNAPCHAT = new FriendSection("ON_SNAPCHAT", 14);
            INVITE = new FriendSection("INVITE", 15);
            ME = new FriendSection("ME", 16);
            FRIENDS_WHO_ADDED_ME = new FriendSection("FRIENDS_WHO_ADDED_ME", 17);
            MY_FRIENDS = new FriendSection("MY_FRIENDS", 18);
            USERNAME = new FriendSection("USERNAME", 19);
            NONE = new FriendSection("NONE", 20);
            MY_ADDRESS_BOOK = new FriendSection("MY_ADDRESS_BOOK", 21);
            SUGGESTED_FRIEND = new FriendSection("SUGGESTED_FRIEND", 22);
            ON_SNAPCHAT_TRUNCATED = new FriendSection("ON_SNAPCHAT_TRUNCATED", 23);
            RECOMMENDED = new FriendSection("RECOMMENDED", 24);
            $VALUES = (new FriendSection[] {
                STORIES, LIVE, VERIFIED, SUGGESTED, ADD_FRIEND, PENDING, BLOCKED, BEST_FRIEND, RECENT, NEEDS_LOVE, 
                DEFAULT, JUST_ADDED, NEW_FRIEND, ALPHABETICAL, ON_SNAPCHAT, INVITE, ME, FRIENDS_WHO_ADDED_ME, MY_FRIENDS, USERNAME, 
                NONE, MY_ADDRESS_BOOK, SUGGESTED_FRIEND, ON_SNAPCHAT_TRUNCATED, RECOMMENDED
            });
        }

        private FriendSection(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class a extends FriendSectionizer
    {

        public final volatile FriendSection a(Object obj, int i)
        {
            obj = (Friend)obj;
            if (((Friend) (obj)).mIsVerifiedSearchResult)
            {
                return FriendSection.VERIFIED;
            }
            if (i == 0)
            {
                return FriendSection.USERNAME;
            }
            if (((Friend) (obj)).mDirection == com.snapchat.android.model.Friend.Direction.INCOMING)
            {
                return FriendSection.FRIENDS_WHO_ADDED_ME;
            }
            if (((Friend) (obj)).mFriendSection == FriendSection.MY_ADDRESS_BOOK)
            {
                return FriendSection.MY_ADDRESS_BOOK;
            }
            if (((Friend) (obj)).mDirection == com.snapchat.android.model.Friend.Direction.OUTGOING || ((Friend) (obj)).mDirection == com.snapchat.android.model.Friend.Direction.BOTH)
            {
                return FriendSection.MY_FRIENDS;
            } else
            {
                return FriendSection.NONE;
            }
        }

        public a()
        {
        }
    }

    public static final class b extends FriendSectionizer
    {

        public final volatile FriendSection a(Object obj, int i)
        {
            return FriendSection.ALPHABETICAL;
        }

        public b()
        {
        }
    }

    public static final class c extends FriendSectionizer
    {

        public final volatile FriendSection a(Object obj, int i)
        {
            return FriendSection.NONE;
        }

        public c()
        {
        }
    }

    public static final class d extends FriendSectionizer
    {

        public final volatile FriendSection a(Object obj, int i)
        {
            obj = ((Friend)obj).mFriendSection;
            if (obj == FriendSection.ON_SNAPCHAT_TRUNCATED)
            {
                return FriendSection.ON_SNAPCHAT_TRUNCATED;
            }
            if (obj == FriendSection.INVITE)
            {
                return FriendSection.INVITE;
            } else
            {
                return FriendSection.NONE;
            }
        }

        public d()
        {
        }
    }

    public static final class e extends FriendSectionizer
    {

        public final volatile FriendSection a(Object obj, int i)
        {
            obj = ((Friend)obj).mFriendSection;
            if (obj == FriendSection.ON_SNAPCHAT)
            {
                return FriendSection.ON_SNAPCHAT;
            }
            if (obj == FriendSection.INVITE)
            {
                return FriendSection.INVITE;
            } else
            {
                return FriendSection.NONE;
            }
        }

        public e()
        {
        }
    }

    public static final class f extends FriendSectionizer
    {

        public final volatile FriendSection a(Object obj, int i)
        {
            if (((Friend)obj).mFriendSection == FriendSection.SUGGESTED_FRIEND)
            {
                return FriendSection.SUGGESTED_FRIEND;
            } else
            {
                return FriendSection.NONE;
            }
        }

        public f()
        {
        }
    }


    public FriendSectionizer()
    {
    }

    public static long a(FriendSection friendsection, Context context)
    {
        return (long)Math.abs(b(friendsection, context).hashCode());
    }

    public static String a(FriendSection friendsection, Object obj, Context context)
    {
        if (friendsection == FriendSection.ALPHABETICAL)
        {
            return b((Friend)obj);
        } else
        {
            return b(friendsection, context);
        }
    }

    public static String b(Friend friend)
    {
        friend = friend.c();
        if (TextUtils.isEmpty(friend))
        {
            return "";
        } else
        {
            int i = friend.codePointAt(0);
            return (new StringBuilder()).appendCodePoint(i).toString().toUpperCase(Locale.getDefault());
        }
    }

    private static String b(FriendSection friendsection, Context context)
    {
        int i = 0x7f080186;
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[];

            static 
            {
                $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection = new int[FriendSection.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.SUGGESTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.STORIES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.ADD_FRIEND.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.PENDING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.BLOCKED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.BEST_FRIEND.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.RECENT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.NEEDS_LOVE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.ME.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.DEFAULT.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.JUST_ADDED.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.NEW_FRIEND.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.ON_SNAPCHAT.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.ON_SNAPCHAT_TRUNCATED.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.INVITE.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.FRIENDS_WHO_ADDED_ME.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.LIVE.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.MY_FRIENDS.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.USERNAME.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.MY_ADDRESS_BOOK.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.SUGGESTED_FRIEND.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.VERIFIED.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.RECOMMENDED.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$FriendSectionizer$FriendSection[FriendSection.NONE.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.android.util.FriendSectionizer.FriendSection[friendsection.ordinal()];
        JVM INSTR tableswitch 1 24: default 120
    //                   1 125
    //                   2 134
    //                   3 140
    //                   4 146
    //                   5 152
    //                   6 158
    //                   7 164
    //                   8 170
    //                   9 128
    //                   10 128
    //                   11 176
    //                   12 182
    //                   13 188
    //                   14 194
    //                   15 200
    //                   16 206
    //                   17 212
    //                   18 218
    //                   19 224
    //                   20 230
    //                   21 236
    //                   22 242
    //                   23 248
    //                   24 254;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L10:
        break; /* Loop/switch isn't completed */
_L1:
        return friendsection.name();
_L2:
        i = 0x7f080032;
_L25:
        return context.getString(i);
_L3:
        i = 0x7f08014e;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f08024d;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0801d7;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f080074;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f080068;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x7f080215;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x7f080192;
        continue; /* Loop/switch isn't completed */
_L11:
        i = 0x7f08024e;
        continue; /* Loop/switch isn't completed */
_L12:
        i = 0x7f08024f;
        continue; /* Loop/switch isn't completed */
_L13:
        i = 0x7f080044;
        continue; /* Loop/switch isn't completed */
_L14:
        i = 0x7f080045;
        continue; /* Loop/switch isn't completed */
_L15:
        i = 0x7f080041;
        continue; /* Loop/switch isn't completed */
_L16:
        i = 0x7f080049;
        continue; /* Loop/switch isn't completed */
_L17:
        i = 0x7f080174;
        continue; /* Loop/switch isn't completed */
_L18:
        i = 0x7f08014b;
        continue; /* Loop/switch isn't completed */
_L19:
        i = 0x7f08014d;
        continue; /* Loop/switch isn't completed */
_L20:
        i = 0x7f08014a;
        continue; /* Loop/switch isn't completed */
_L21:
        i = 0x7f080209;
        continue; /* Loop/switch isn't completed */
_L22:
        i = 0x7f08014c;
        continue; /* Loop/switch isn't completed */
_L23:
        i = 0x7f080046;
        if (true) goto _L25; else goto _L24
_L24:
        return "";
    }

    public abstract FriendSection a(Object obj, int i);
}
