// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.messages.model.threads.Message;

public class am
{

    private final Message a;
    private final String b;
    private final String c;

    public am(Message message, String s, String s1)
    {
        a = message;
        b = s;
        c = s1;
    }

    static Message a(am am1)
    {
        return am1.a;
    }

    static String b(am am1)
    {
        return am1.b;
    }

    static String c(am am1)
    {
        return am1.c;
    }
}
