// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.support.v4.app.Fragment;

// Referenced classes of package com.fitbit.friends.ui:
//            FriendsFragment, LeaderboardFragment, MessagesFragment

static abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    final int titleId;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/fitbit/friends/ui/FriendsFragment$FriendFragmentType, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    abstract Fragment a();

    static 
    {
        a = new FriendsFragment.FriendFragmentType("LEADERBOARD", 0, 0x7f080233) {

            Fragment a()
            {
                return LeaderboardFragment.a();
            }

        };
        b = new FriendsFragment.FriendFragmentType("MESSAGES", 1, 0x7f08031f) {

            Fragment a()
            {
                return MessagesFragment.a();
            }

        };
        c = (new c[] {
            a, b
        });
    }

    private _cls2(String s, int i, int j)
    {
        super(s, i);
        titleId = j;
    }

    titleId(String s, int i, int j, titleId titleid)
    {
        this(s, i, j);
    }
}
