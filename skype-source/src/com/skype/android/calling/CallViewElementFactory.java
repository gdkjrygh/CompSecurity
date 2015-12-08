// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.view.View;
import com.skype.Participant;

public interface CallViewElementFactory
{

    public abstract View createCameraSwitchView();

    public abstract View createParticipantDisplayName(Participant participant);

    public abstract View createParticipantPlusView();

    public abstract View createParticipantTileView();

    public abstract View createTileView();
}
