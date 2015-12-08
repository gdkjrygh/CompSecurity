// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.addlive.service.listener.AddLiveServiceListener;
import java.util.List;

// Referenced classes of package com.addlive.service:
//            Responder, ConnectionDescriptor, DrawRequest, MediaConnection, 
//            MediaType, VideoStreamDescriptor, RenderRequest, AudioOutputDevice

public interface AddLiveService
{
    public static class VideoFrameMetadata
    {

        private int height;
        private android.hardware.Camera.CameraInfo info;
        private int orientation;
        private int width;

        public int getHeight()
        {
            return height;
        }

        public android.hardware.Camera.CameraInfo getInfo()
        {
            return info;
        }

        public int getOrientation()
        {
            return orientation;
        }

        public int getWidth()
        {
            return width;
        }

        public void setHeight(int i)
        {
            height = i;
        }

        public void setInfo(android.hardware.Camera.CameraInfo camerainfo)
        {
            info = camerainfo;
        }

        public void setOrientation(int i)
        {
            orientation = i;
        }

        public void setWidth(int i)
        {
            width = i;
        }

        public VideoFrameMetadata()
        {
        }
    }


    public abstract void addServiceListener(Responder responder, AddLiveServiceListener addliveservicelistener);

    public abstract void connect(Responder responder, ConnectionDescriptor connectiondescriptor);

    public abstract void disconnect(Responder responder, String s);

    public abstract void disconnect(Responder responder, String s, int i);

    public abstract void draw(DrawRequest drawrequest);

    public abstract void flushEvents(Responder responder, String s, Long long1);

    public abstract void getAudioOutputDevice(Responder responder);

    public abstract void getAudioOutputDeviceNames(Responder responder);

    public abstract MediaConnection getConnectionByScope(String s);

    public abstract void getEventsChecksum(Responder responder);

    public abstract void getProperty(Responder responder, String s);

    public abstract void getVersion(Responder responder);

    public abstract void getVideoCaptureDevice(Responder responder);

    public abstract void getVideoCaptureDeviceNames(Responder responder);

    public abstract void injectFrame(byte abyte0[], VideoFrameMetadata videoframemetadata);

    public abstract void monitorSpeechActivity(Responder responder, String s, boolean flag);

    public abstract void networkTest(Responder responder, ConnectionDescriptor connectiondescriptor);

    public abstract void publish(Responder responder, String s, MediaType mediatype);

    public abstract void reconfigureVideo(Responder responder, String s, VideoStreamDescriptor videostreamdescriptor);

    public abstract void removeServiceListener(Responder responder, AddLiveServiceListener addliveservicelistener);

    public abstract int renderSink(RenderRequest renderrequest);

    public abstract void sendMessage(Responder responder, String s, String s1);

    public abstract void sendMessage(Responder responder, String s, String s1, Long long1);

    public abstract void sendMessage(Responder responder, String s, byte abyte0[]);

    public abstract void sendMessage(Responder responder, String s, byte abyte0[], Long long1);

    public abstract void sendReportWithCredentials(Responder responder, String s, String s1);

    public abstract void setAllowedSenders(Responder responder, String s, MediaType mediatype, List list);

    public abstract void setAudioOutputDevice(Responder responder, AudioOutputDevice audiooutputdevice);

    public abstract void setAudioOutputDevice(Responder responder, String s);

    public abstract void setProperty(Responder responder, String s, String s1);

    public abstract void setProxyServer(Responder responder, String s, String s1, int i);

    public abstract void setVideoCaptureDevice(Responder responder, String s);

    public abstract void setVideoCaptureDevice(Responder responder, String s, SurfaceView surfaceview);

    public abstract void startEventsTracking(Responder responder, String s);

    public abstract void startLocalVideo(Responder responder, SurfaceView surfaceview);

    public abstract void startLocalVideo(Responder responder, TextureView textureview);

    public abstract void startLocalVideo(Responder responder, FrameLayout framelayout);

    public abstract void startMeasuringStats(Responder responder, String s, int i);

    public abstract void stopLocalVideo(Responder responder);

    public abstract void stopMeasuringStats(Responder responder, String s);

    public abstract void stopRender(int i);

    public abstract void unpublish(Responder responder, String s, MediaType mediatype);
}
