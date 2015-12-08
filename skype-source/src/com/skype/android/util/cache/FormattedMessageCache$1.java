// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import com.skype.Message;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.util.cache:
//            FormattedMessageCache

final class b
    implements Callable
{

    final Message a;
    final int b;
    final FormattedMessageCache c;

    public final Object call()
        throws Exception
    {
        return FormattedMessageCache.a(c, a, b);
    }

    (FormattedMessageCache formattedmessagecache, Message message, int i)
    {
        c = formattedmessagecache;
        a = message;
        b = i;
        super();
    }
}
