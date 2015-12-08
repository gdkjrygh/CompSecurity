// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;
import java.util.EnumSet;

// Referenced classes of package com.skype.android.push:
//            PushMessageFactory, ConciergePushMessage, PushServiceType, PushEventType, 
//            PushMessage

static final class nit> extends nit>
{

    final PushMessage createPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
    {
        return new ConciergePushMessage(pushservicetype, pusheventtype, intent);
    }

    (String s, int i, EnumSet enumset)
    {
        super(s, i, enumset, null);
    }
}
