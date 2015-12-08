// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.addlive.service.DrawRequest;
import com.addlive.service.RenderRequest;
import com.addlive.service.listener.AddLiveServiceListener;
import java.util.Map;

// Referenced classes of package com.addlive.impl:
//            BaseResultAdapter, ServiceRequest

public interface ADLNativeWrapper
{

    public abstract void addServiceListener(AddLiveServiceListener addliveservicelistener);

    public abstract void draw(DrawRequest drawrequest);

    public abstract Map getActiveConnections();

    public abstract void initCamOnNative();

    public abstract int initPlatform();

    public abstract void invoke(BaseResultAdapter baseresultadapter, ServiceRequest servicerequest);

    public abstract void releasePlatform();

    public abstract void removeServiceListener(AddLiveServiceListener addliveservicelistener);

    public abstract int renderSink(RenderRequest renderrequest);

    public abstract void reportDisconnect(String s);

    public abstract void setAudioPublishingState(boolean flag, String s);

    public abstract void setLoudSpeaker(boolean flag);

    public abstract void startLocalVideo(BaseResultAdapter baseresultadapter, SurfaceView surfaceview);

    public abstract void startLocalVideo(BaseResultAdapter baseresultadapter, TextureView textureview);

    public abstract void startLocalVideo(BaseResultAdapter baseresultadapter, FrameLayout framelayout);

    public abstract void stopRender(int i);

    public abstract void updateAudioSettings();
}
