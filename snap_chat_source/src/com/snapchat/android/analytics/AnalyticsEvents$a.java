// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import com.snapchat.android.model.chat.ChatFeedItem;
import java.util.Comparator;

// Referenced classes of package com.snapchat.android.analytics:
//            AnalyticsEvents

static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (ChatFeedItem)obj;
        return (int)((((ChatFeedItem)obj1).W() - ((ChatFeedItem) (obj)).W()) % 0x7fffffffL);
    }

    ()
    {
    }
}
