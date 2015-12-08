// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder

final class i
    implements Serializable, Comparator
{

    public i()
    {
    }

    public final int compare(MessageHolder messageholder, MessageHolder messageholder1)
    {
        return (int)((messageholder.getTimestamp() & 0xffffffffL) - (messageholder1.getTimestamp() & 0xffffffffL));
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((MessageHolder)obj, (MessageHolder)obj1);
    }
}
