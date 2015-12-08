// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.timeline;

import rx.b;

public interface TimelineStorage
{

    public abstract b timelineItems(int i);

    public abstract b timelineItemsBefore(long l, int i);
}
