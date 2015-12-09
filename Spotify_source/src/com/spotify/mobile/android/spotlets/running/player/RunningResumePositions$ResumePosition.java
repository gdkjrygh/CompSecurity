// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.player;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class timestamp
    implements JacksonModel
{

    public final int page;
    public final long position;
    public final long timestamp;
    public final int track;

    public (int i, int j, long l, long l1)
    {
        page = i;
        track = j;
        position = l;
        timestamp = l1;
    }
}
