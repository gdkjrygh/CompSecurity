// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.o;

import android.os.Parcelable;
import com.facebook.fbservice.c.c;
import com.facebook.messages.model.threads.Message;
import com.google.common.base.Preconditions;

public class a extends Exception
    implements c
{

    private final Message a;

    public a(Throwable throwable, Message message)
    {
        super(throwable);
        a = (Message)Preconditions.checkNotNull(message);
    }

    public Parcelable a()
    {
        return b();
    }

    public Message b()
    {
        return a;
    }
}
