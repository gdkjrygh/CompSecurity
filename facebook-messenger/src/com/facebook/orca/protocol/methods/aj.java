// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.orca.server.SendMessageByRecipientsParams;

public class aj
{

    private final SendMessageByRecipientsParams a;
    private final String b;

    public aj(SendMessageByRecipientsParams sendmessagebyrecipientsparams, String s)
    {
        a = sendmessagebyrecipientsparams;
        b = s;
    }

    static SendMessageByRecipientsParams a(aj aj1)
    {
        return aj1.a;
    }

    static String b(aj aj1)
    {
        return aj1.b;
    }
}
