// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.messages.model.threads.ParticipantInfo;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.threadview:
//            ac

public class ai extends ac
{

    private final ParticipantInfo a;

    public ai(ParticipantInfo participantinfo)
    {
        a = participantinfo;
    }

    public int a()
    {
        return 5;
    }

    public ParticipantInfo b()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ai) && Objects.equal(a.e(), ((ai)obj).b().e());
    }

    public int hashCode()
    {
        return a();
    }

    public String toString()
    {
        return (new StringBuilder()).append("RowTypingItem{otherUser=").append(a.d()).append('}').toString();
    }
}
