// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import com.urbanairship.restclient.Request;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushManager, RichPushUser

public class RichPushUserAuthenticatedRequest extends Request
{

    public RichPushUserAuthenticatedRequest(String s, String s1)
    {
        super(s, s1);
        s = RichPushManager.shared().getRichPushUser();
        setPreemptiveAuth(s.getId(), s.getPassword());
    }
}
