// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import com.facebook.user.UserKey;
import com.google.common.base.Objects;
import javax.inject.a;

// Referenced classes of package com.facebook.messages.model.threads:
//            Message, ParticipantInfo

public class f
{

    private a a;

    public f(a a1)
    {
        a = a1;
    }

    public boolean a(Message message)
    {
        return message.u() == 900;
    }

    public boolean b(Message message)
    {
        String s = (String)a.b();
        return message.i() != null && message.i().e() != null && Objects.equal(message.i().e().b(), s);
    }
}
