// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import hp;

public final class ExplorerPageNavigationMethod extends Enum
{

    private static final ExplorerPageNavigationMethod $VALUES[];
    public static final ExplorerPageNavigationMethod SWIPE_DOWN;
    public static final ExplorerPageNavigationMethod SWIPE_UP;
    public static final ExplorerPageNavigationMethod TAP_CARET;
    public static final ExplorerPageNavigationMethod TAP_THUMBNAIL;

    private ExplorerPageNavigationMethod(String s, int i)
    {
        super(s, i);
    }

    public static ExplorerPageNavigationMethod valueOf(String s)
    {
        return (ExplorerPageNavigationMethod)Enum.valueOf(com/snapchat/android/stories/ui/ExplorerPageNavigationMethod, s);
    }

    public static ExplorerPageNavigationMethod[] values()
    {
        return (ExplorerPageNavigationMethod[])$VALUES.clone();
    }

    public final hp getExplorerPageAction()
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ExplorerPageNavigationMethod.values().length];
                try
                {
                    a[ExplorerPageNavigationMethod.SWIPE_UP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ExplorerPageNavigationMethod.SWIPE_DOWN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ExplorerPageNavigationMethod.TAP_CARET.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ExplorerPageNavigationMethod.TAP_THUMBNAIL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        default:
            return hp.SWIPE_UP;

        case 1: // '\001'
            return hp.SWIPE_UP;

        case 2: // '\002'
            return hp.SWIPE_DOWN;

        case 3: // '\003'
            return hp.TAP_CARET;

        case 4: // '\004'
            return hp.TAP_THUMBNAIL;
        }
    }

    static 
    {
        SWIPE_UP = new ExplorerPageNavigationMethod("SWIPE_UP", 0);
        SWIPE_DOWN = new ExplorerPageNavigationMethod("SWIPE_DOWN", 1);
        TAP_CARET = new ExplorerPageNavigationMethod("TAP_CARET", 2);
        TAP_THUMBNAIL = new ExplorerPageNavigationMethod("TAP_THUMBNAIL", 3);
        $VALUES = (new ExplorerPageNavigationMethod[] {
            SWIPE_UP, SWIPE_DOWN, TAP_CARET, TAP_THUMBNAIL
        });
    }
}
