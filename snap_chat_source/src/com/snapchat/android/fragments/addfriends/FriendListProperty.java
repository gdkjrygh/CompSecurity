// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


public final class FriendListProperty
{
    public static final class Style extends Enum
    {

        private static final Style $VALUES[];
        public static final Style OPAQUE_CHECKBOX;
        public static final Style TRANSPARENT_CHECKBOX;
        public static final Style WHITE_TEXT;
        private int a;

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/snapchat/android/fragments/addfriends/FriendListProperty$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])$VALUES.clone();
        }

        public final int getBackgroundResId()
        {
            return a;
        }

        static 
        {
            OPAQUE_CHECKBOX = new Style("OPAQUE_CHECKBOX", 0, 0x7f020077);
            TRANSPARENT_CHECKBOX = new Style("TRANSPARENT_CHECKBOX", 1, 0x7f020078);
            WHITE_TEXT = new Style("WHITE_TEXT", 2, 0x7f020079);
            $VALUES = (new Style[] {
                OPAQUE_CHECKBOX, TRANSPARENT_CHECKBOX, WHITE_TEXT
            });
        }

        private Style(String s, int i1, int j1)
        {
            super(s, i1);
            a = j1;
        }
    }

    public static final class TouchMode extends Enum
    {

        private static final TouchMode $VALUES[];
        public static final TouchMode ALWAYS_TAPPABLE;
        public static final TouchMode NON_TAPPABLE;
        public static final TouchMode SWIPEABLE;
        public static final TouchMode TAPPABLE_FRIENDS;

        public static TouchMode valueOf(String s)
        {
            return (TouchMode)Enum.valueOf(com/snapchat/android/fragments/addfriends/FriendListProperty$TouchMode, s);
        }

        public static TouchMode[] values()
        {
            return (TouchMode[])$VALUES.clone();
        }

        static 
        {
            ALWAYS_TAPPABLE = new TouchMode("ALWAYS_TAPPABLE", 0);
            TAPPABLE_FRIENDS = new TouchMode("TAPPABLE_FRIENDS", 1);
            SWIPEABLE = new TouchMode("SWIPEABLE", 2);
            NON_TAPPABLE = new TouchMode("NON_TAPPABLE", 3);
            $VALUES = (new TouchMode[] {
                ALWAYS_TAPPABLE, TAPPABLE_FRIENDS, SWIPEABLE, NON_TAPPABLE
            });
        }

        private TouchMode(String s, int i1)
        {
            super(s, i1);
        }
    }


    public final TouchMode a;
    public final Style b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public FriendListProperty(TouchMode touchmode, Style style)
    {
        c = false;
        d = true;
        e = false;
        f = false;
        g = false;
        h = false;
        i = true;
        j = false;
        k = false;
        l = false;
        m = false;
        a = touchmode;
        b = style;
    }

    public final FriendListProperty a(boolean flag)
    {
        if (a != TouchMode.NON_TAPPABLE && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        return this;
    }

    public final boolean a()
    {
        return a == TouchMode.SWIPEABLE;
    }

    public final String toString()
    {
        return (new StringBuilder(getClass().getSimpleName())).append(" [mTouchMode ").append(a).append("] [mStyle ").append(b.name()).append("] [mHideCheckMark ").append(c).append("] [mShowSettingsButtonOnTap ").append(d).append("] [mShowSnapButtonOnTap ").append(e).append("] [mShowChatButtonOnTap ").append(f).append("] [mTransparentBackgroundEnabled ").append(g).append("] [mShowFriendmoji ").append(h).append("] [mShowBlockSwipableButtonOnly ").append(j).append("]").toString();
    }
}
