// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface Milestone
    extends Parcelable, Freezable
{

    public abstract byte[] getCompletionRewardData();

    public abstract long getCurrentProgress();

    public abstract String getEventId();

    public abstract String getMilestoneId();

    public abstract int getState();

    public abstract long getTargetProgress();
}
