// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;


// Referenced classes of package com.snapchat.android.stories.ui:
//            ExplorerPageNavigationMethod

static final class 
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
