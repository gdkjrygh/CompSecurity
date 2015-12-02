// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.orca.server.SendMessageByRecipientsParams;

public class f
{

    private final SendMessageByRecipientsParams a;
    private final String b;
    private final String c;

    public f(SendMessageByRecipientsParams sendmessagebyrecipientsparams, String s, String s1)
    {
        a = sendmessagebyrecipientsparams;
        b = s;
        c = s1;
    }

    static SendMessageByRecipientsParams a(f f1)
    {
        return f1.a;
    }

    static String b(f f1)
    {
        return f1.b;
    }

    static String c(f f1)
    {
        return f1.c;
    }
}
