// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories;

import android.content.Context;

public final class StoriesSection extends Enum
{

    private static final StoriesSection $VALUES[];
    public static final StoriesSection ADDRESS_BOOK;
    public static final StoriesSection ALL_STORIES;
    public static final StoriesSection DISCOVER;
    public static final StoriesSection FRIENDS;
    public static final StoriesSection LIVE;
    public static final StoriesSection ME;
    public static final StoriesSection NONE;
    public static final StoriesSection OFFICIAL_STORIES;
    public static final StoriesSection RECENT_UPDATES;
    public static final StoriesSection USERNAME;
    private int a;

    private StoriesSection(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static StoriesSection valueOf(String s)
    {
        return (StoriesSection)Enum.valueOf(com/snapchat/android/stories/StoriesSection, s);
    }

    public static StoriesSection[] values()
    {
        return (StoriesSection[])$VALUES.clone();
    }

    public final String getString(Context context)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[StoriesSection.values().length];
                try
                {
                    a[StoriesSection.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        default:
            return context.getString(a);

        case 1: // '\001'
            return "none";
        }
    }

    static 
    {
        ME = new StoriesSection("ME", 0, 0x7f080186);
        DISCOVER = new StoriesSection("DISCOVER", 1, 0x7f080116);
        LIVE = new StoriesSection("LIVE", 2, 0x7f080174);
        RECENT_UPDATES = new StoriesSection("RECENT_UPDATES", 3, 0x7f0802bc);
        ALL_STORIES = new StoriesSection("ALL_STORIES", 4, 0x7f0802bb);
        USERNAME = new StoriesSection("USERNAME", 5, 0x7f08014d);
        FRIENDS = new StoriesSection("FRIENDS", 6, 0x7f08014b);
        ADDRESS_BOOK = new StoriesSection("ADDRESS_BOOK", 7, 0x7f08014a);
        OFFICIAL_STORIES = new StoriesSection("OFFICIAL_STORIES", 8, 0x7f08014c);
        NONE = new StoriesSection("NONE", 9, -1);
        $VALUES = (new StoriesSection[] {
            ME, DISCOVER, LIVE, RECENT_UPDATES, ALL_STORIES, USERNAME, FRIENDS, ADDRESS_BOOK, OFFICIAL_STORIES, NONE
        });
    }
}
