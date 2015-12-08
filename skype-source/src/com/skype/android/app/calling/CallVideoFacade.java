// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.calling.CallView;
import com.skype.android.calling.CameraControl;
import com.skype.android.calling.CameraFacing;
import com.skype.android.calling.VideoCall;
import com.skype.android.util.ConversationViewState;
import com.skype.android.util.ViewStateManager;
import com.skype.android.video.ControlUnit;
import com.skype.android.video.OnVideoDisplayChangedListener;
import java.util.Set;

// Referenced classes of package com.skype.android.app.calling:
//            VideoFacade, OnSetCameraFacingListener

public class CallVideoFacade
    implements VideoFacade
{

    private OnSetCameraFacingListener cameraListener;
    private ConversationViewState conversationState;
    private ViewStateManager stateManager;
    private VideoCall videoCall;
    private CallView videoCallView;

    CallVideoFacade(ViewStateManager viewstatemanager)
    {
        stateManager = viewstatemanager;
    }

    private CameraFacing getDefaultCamera()
    {
        if (ControlUnit.hasFrontCamera())
        {
            return CameraFacing.a;
        }
        if (ControlUnit.hasFrontCamera())
        {
            return CameraFacing.b;
        } else
        {
            return CameraFacing.c;
        }
    }

    public void destroy()
    {
        if (videoCallView != null)
        {
            videoCallView.c();
        }
    }

    public int getOverlayWidth()
    {
        return videoCallView.a();
    }

    public Set getPossibleCameraFacing()
    {
        return videoCall.j().j();
    }

    public void initialize(SkyLib skylib, Conversation conversation, ViewGroup viewgroup)
    {
        if (conversation == null)
        {
            throw new IllegalArgumentException("null conversation");
        }
        if (viewgroup == null)
        {
            throw new IllegalArgumentException("null videoCallView");
        } else
        {
            videoCall = VideoCall.a(skylib, conversation);
            conversationState = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
            videoCallView = (CallView)viewgroup;
            ((CallView)viewgroup).a(videoCall);
            return;
        }
    }

    public boolean isVideoDisplayed()
    {
        return videoCall.e();
    }

    public void setCameraFacing(CameraFacing camerafacing)
    {
        CameraFacing camerafacing1 = camerafacing;
        if (camerafacing == null)
        {
            camerafacing1 = CameraFacing.c;
        }
        videoCall.j().a(camerafacing1);
        conversationState.a(camerafacing1);
        if (cameraListener != null)
        {
            cameraListener.onSetCameraFacing(camerafacing1);
        }
    }

    public void setOnCameraFacingChangedListener(OnSetCameraFacingListener onsetcamerafacinglistener)
    {
        cameraListener = onsetcamerafacinglistener;
    }

    public void setOverlayDragListener(com.skype.android.video.ViewSnapper.ViewSnapperListener viewsnapperlistener)
    {
        videoCallView.setViewSnapperListener(viewsnapperlistener);
    }

    public void setOverlayLayoutParams(Rect rect)
    {
        videoCallView.setOverlayBounds(rect);
    }

    public void setOverlayVisible(boolean flag)
    {
    }

    public void setVideoDisplayChangedListener(OnVideoDisplayChangedListener onvideodisplaychangedlistener)
    {
    }

    public void showControls(boolean flag)
    {
        videoCallView.a(flag);
    }

    public void start()
    {
        CameraFacing camerafacing1 = conversationState.e();
        CameraFacing camerafacing = camerafacing1;
        if (camerafacing1 == null)
        {
            camerafacing = getDefaultCamera();
        }
        setCameraFacing(camerafacing);
    }

    public void stop()
    {
        if (videoCallView != null)
        {
            videoCallView.c();
        }
    }
}
