// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushInbox, RichPushMessage

static class 
    implements Comparator
{

    public int compare(RichPushMessage richpushmessage, RichPushMessage richpushmessage1)
    {
        return richpushmessage1.getSentDate().compareTo(richpushmessage.getSentDate());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((RichPushMessage)obj, (RichPushMessage)obj1);
    }

    ()
    {
    }
}
