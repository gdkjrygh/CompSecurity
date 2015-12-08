// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.Message;
import java.util.Comparator;

// Referenced classes of package com.google.inject.internal:
//            Errors

class this._cls0
    implements Comparator
{

    final Errors this$0;

    public int compare(Message message, Message message1)
    {
        return message.getSource().compareTo(message1.getSource());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Message)obj, (Message)obj1);
    }

    ()
    {
        this$0 = Errors.this;
        super();
    }
}
