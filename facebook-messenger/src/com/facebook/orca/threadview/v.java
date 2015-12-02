// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.threads.ui.name.g;
import com.google.common.a.es;

public class v extends g
{

    private final ParticipantInfo a;
    private final boolean b;
    private final long c;

    public v(boolean flag, String s, es es, boolean flag1, ParticipantInfo participantinfo, long l)
    {
        super(flag, s, es);
        b = flag1;
        a = participantinfo;
        c = l;
    }

    public ParticipantInfo d()
    {
        return a;
    }

    public long e()
    {
        if (a != null)
        {
            return c;
        } else
        {
            return -1L;
        }
    }

    public boolean f()
    {
        return b;
    }
}
