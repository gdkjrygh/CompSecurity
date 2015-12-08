// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;


public class ChronologicalQueryParams extends com.soundcloud.android.commands.PagedQueryCommand.PageParams
{

    private final long timestamp;

    public ChronologicalQueryParams(int i, long l)
    {
        super(i);
        timestamp = l;
    }

    public long getTimestamp()
    {
        return timestamp;
    }
}
