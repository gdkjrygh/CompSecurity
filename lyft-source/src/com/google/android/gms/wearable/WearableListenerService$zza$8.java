// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

class a
    implements Runnable
{

    final ChannelEventParcelable a;
    final e b;

    public void run()
    {
        a.a(b.b);
    }

    e(e e, ChannelEventParcelable channeleventparcelable)
    {
        b = e;
        a = channeleventparcelable;
        super();
    }
}
