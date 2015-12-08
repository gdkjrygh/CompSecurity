// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.audio.AudioRoute;
import com.skype.android.calling.CameraFacing;
import java.util.EnumSet;

interface d
{

    public abstract void addParticipantsToCall();

    public abstract boolean canAddParticipants();

    public abstract void endCall();

    public abstract AudioRoute getAudioRoute();

    public abstract CameraFacing getCameraFacing();

    public abstract EnumSet getPossibleCameraFacing();

    public abstract boolean hasUnconsumedMessages();

    public abstract boolean isAudioCall();

    public abstract boolean isCallOnHold();

    public abstract boolean isDialogCall();

    public abstract boolean isDialpadShowing();

    public abstract boolean isMicrophoneMuted();

    public abstract boolean isPreCall();

    public abstract boolean isSkypeOutCall();

    public abstract void onControlsClicked(boolean flag);

    public abstract void sendDTMF(com.skype.Participant.DTMF dtmf);

    public abstract void setAudioRoute(AudioRoute audioroute);

    public abstract void setCameraFacing(CameraFacing camerafacing);

    public abstract void setMicrophoneMuted(boolean flag);

    public abstract void showChat();

    public abstract void showDialpad(boolean flag);
}
