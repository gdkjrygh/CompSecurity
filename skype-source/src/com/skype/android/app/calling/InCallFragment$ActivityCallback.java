// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

public static interface 
{

    public abstract void callFragmentResumed(InCallFragment incallfragment);

    public abstract void cancelCallControlsTimeout(boolean flag);

    public abstract void endCall();

    public abstract void onAudioRouteChanged();

    public abstract void onConfirmedTap();

    public abstract void onVoiceStatusChanged();

    public abstract void setCallControlsVisible(boolean flag);

    public abstract void setSwipingAllowed(boolean flag);

    public abstract void showChat();

    public abstract void videoCountChanged(int i);
}
