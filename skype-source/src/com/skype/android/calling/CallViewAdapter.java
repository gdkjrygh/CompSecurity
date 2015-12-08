// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.view.View;
import com.skype.Participant;

public interface CallViewAdapter
{

    public abstract void bindTileView(View view, Participant participant);

    public abstract void onDisplayedVideoCountChanged(int i);

    public abstract void onFocusModeChanged();

    public abstract void onMinimizedParticipantCountChanged(int i);

    public abstract void onParticipantTileViewStatusChanged(Participant participant, View view);

    public abstract void onVideoDisplayChanged(String s, com.skype.Video.STATUS status);
}
