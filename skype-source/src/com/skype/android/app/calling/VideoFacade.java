// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.calling.CameraFacing;
import com.skype.android.video.OnVideoDisplayChangedListener;
import java.util.Set;

// Referenced classes of package com.skype.android.app.calling:
//            OnSetCameraFacingListener

public interface VideoFacade
{

    public abstract void destroy();

    public abstract int getOverlayWidth();

    public abstract Set getPossibleCameraFacing();

    public abstract void initialize(SkyLib skylib, Conversation conversation, ViewGroup viewgroup);

    public abstract boolean isVideoDisplayed();

    public abstract void setCameraFacing(CameraFacing camerafacing);

    public abstract void setOnCameraFacingChangedListener(OnSetCameraFacingListener onsetcamerafacinglistener);

    public abstract void setOverlayDragListener(com.skype.android.video.ViewSnapper.ViewSnapperListener viewsnapperlistener);

    public abstract void setOverlayLayoutParams(Rect rect);

    public abstract void setOverlayVisible(boolean flag);

    public abstract void setVideoDisplayChangedListener(OnVideoDisplayChangedListener onvideodisplaychangedlistener);

    public abstract void showControls(boolean flag);

    public abstract void start();

    public abstract void stop();
}
