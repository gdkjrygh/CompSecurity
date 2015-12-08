// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;


// Referenced classes of package com.google.android.gms.nearby.messages:
//            SubscribeOptions, Strategy, MessageFilter

public static final class _MY_TYPES
{

    private MessageFilter mFilter;
    public Strategy mStrategy;

    public final SubscribeOptions build()
    {
        return new SubscribeOptions(mStrategy, mFilter, null, (byte)0);
    }

    public ()
    {
        mStrategy = Strategy.DEFAULT;
        mFilter = MessageFilter.INCLUDE_ALL_MY_TYPES;
    }
}
