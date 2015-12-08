// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            PluginCallBacks

class PluginCallBackSnapShot
{

    public long bytesLoaded;
    public int droppedFrames;
    public float getFps;
    public boolean isLive;
    public boolean isPlaying;
    public float playBackRate;
    public String serverIP;
    public float streamHeadPosition;
    public float streamLength;
    public String streamURL;
    public String videoSize;
    public String viewSize;

    public PluginCallBackSnapShot(PluginCallBacks plugincallbacks)
    {
        if (plugincallbacks == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        try
        {
            streamHeadPosition = plugincallbacks.streamHeadPosition();
        }
        catch (Exception exception10) { }
        try
        {
            streamLength = plugincallbacks.streamLength();
        }
        catch (Exception exception9) { }
        try
        {
            getFps = plugincallbacks.getFps();
        }
        catch (Exception exception8) { }
        try
        {
            streamURL = plugincallbacks.streamURL();
        }
        catch (Exception exception7) { }
        try
        {
            isLive = plugincallbacks.isLive();
        }
        catch (Exception exception6) { }
        try
        {
            videoSize = plugincallbacks.videoSize();
        }
        catch (Exception exception5) { }
        try
        {
            viewSize = plugincallbacks.viewSize();
        }
        catch (Exception exception4) { }
        try
        {
            bytesLoaded = plugincallbacks.bytesLoaded();
        }
        catch (Exception exception3) { }
        try
        {
            serverIP = plugincallbacks.serverIP();
        }
        catch (Exception exception2) { }
        try
        {
            playBackRate = plugincallbacks.playBackRate();
        }
        catch (Exception exception1) { }
        try
        {
            droppedFrames = plugincallbacks.droppedFrames();
        }
        catch (Exception exception) { }
        isPlaying = plugincallbacks.isPlaying();
        return;
        plugincallbacks;
    }
}
