// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;

public final class dkk
{

    final Optional a;
    final com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus b;

    private dkk(Optional optional, com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus linkingstatus)
    {
        boolean flag;
        if (linkingstatus == com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus.b || optional.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Empty linked username is allowed only for failed attempts");
        a = optional;
        b = linkingstatus;
    }

    private dkk(com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus linkingstatus)
    {
        this(Optional.e(), linkingstatus);
    }

    dkk(com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus linkingstatus, byte byte0)
    {
        this(linkingstatus);
    }

    private dkk(String s, com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus linkingstatus)
    {
        this(Optional.b(s), linkingstatus);
    }

    dkk(String s, com.spotify.mobile.android.arsenal.ArsenalLinkingFragment.LinkingStatus linkingstatus, byte byte0)
    {
        this(s, linkingstatus);
    }
}
