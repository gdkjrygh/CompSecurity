// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.deeplink;


// Referenced classes of package com.snapchat.android.stories.deeplink:
//            StoriesDeepLinkProcessor

static final class oryRetryableBreakPoint
{

    static final int a[];

    static 
    {
        a = new int[oryRetryableBreakPoint.values().length];
        try
        {
            a[oryRetryableBreakPoint.GETTING_METADATA_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[oryRetryableBreakPoint.PREFETCH_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
