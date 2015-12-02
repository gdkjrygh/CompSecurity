// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.messages.model.threads.ParticipantInfo;

class f
{

    private final long a;
    private final long b;
    private final long c;
    private final boolean d;
    private final String e;
    private final String f;
    private final ParticipantInfo g;

    f(long l, long l1, long l2, boolean flag, 
            String s)
    {
        a = l;
        b = l1;
        c = l2;
        d = flag;
        e = s;
        f = null;
        g = null;
    }

    f(long l, long l1, long l2, boolean flag, 
            String s, String s1, ParticipantInfo participantinfo)
    {
        a = l;
        b = l1;
        c = l2;
        d = flag;
        e = s;
        f = s1;
        g = participantinfo;
    }

    static f a(f f1, String s, ParticipantInfo participantinfo)
    {
        return new f(f1.a, f1.b, f1.c, f1.d, f1.e, s, participantinfo);
    }

    long a()
    {
        return a;
    }

    long b()
    {
        return b;
    }

    long c()
    {
        return c;
    }

    boolean d()
    {
        return d;
    }

    String e()
    {
        return e;
    }

    String f()
    {
        return f;
    }

    ParticipantInfo g()
    {
        return g;
    }
}
