// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.common.w.n;
import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.threads.Message;

public class i
{

    public i()
    {
    }

    public static boolean a(Message message, Share share)
    {
        return n.c(message.k()) && n.a(share.a()) && n.a(share.c());
    }
}
