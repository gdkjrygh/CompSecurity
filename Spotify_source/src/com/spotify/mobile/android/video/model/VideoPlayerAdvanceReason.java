// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class VideoPlayerAdvanceReason
    implements JacksonModel
{

    public Reason reason;
    public UnplayableReason unplayableReason;

    public VideoPlayerAdvanceReason(Reason reason1, UnplayableReason unplayablereason)
    {
        reason = reason1;
        unplayableReason = unplayablereason;
    }
}
