// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import java.util.Comparator;

// Referenced classes of package com.skype.android.app.search:
//            MessageItem

public class MessageComparator
    implements Comparator
{

    public MessageComparator()
    {
    }

    public int compare(MessageItem messageitem, MessageItem messageitem1)
    {
        return Long.signum(messageitem1.getTimestamp() - messageitem.getTimestamp());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((MessageItem)obj, (MessageItem)obj1);
    }
}
