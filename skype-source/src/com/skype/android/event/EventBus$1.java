// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.event;

import android.os.Message;

// Referenced classes of package com.skype.android.event:
//            EventBus, a

final class a
    implements android.os.lback
{

    final EventBus a;

    public final boolean handleMessage(Message message)
    {
        a a1 = a.a(message.what);
        if (a1 != null)
        {
            a1.a(message);
            return true;
        } else
        {
            return false;
        }
    }

    (EventBus eventbus)
    {
        a = eventbus;
        super();
    }
}
