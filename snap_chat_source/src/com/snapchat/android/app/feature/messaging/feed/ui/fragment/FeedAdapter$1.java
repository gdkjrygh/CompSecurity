// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;


// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedAdapter

static final class edViewType
{

    static final int a[];

    static 
    {
        a = new int[edViewType.values().length];
        try
        {
            a[edViewType.CONVERSATION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[edViewType.LOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[edViewType.ADD_CONTACTS_FOOTER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
