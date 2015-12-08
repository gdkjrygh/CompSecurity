// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.streamerProxies.Native;

import android.media.MediaPlayer;
import com.conviva.ConvivaStreamerProxy;
import com.conviva.StreamerError;
import com.conviva.monitor.IMonitorNotifier;
import com.conviva.utils.PlatformUtils;
import java.util.HashMap;
import java.util.Map;

public abstract class NativeStreamerProxy
    implements android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, ConvivaStreamerProxy
{

    private static final String ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK";
    private static final String ERR_SERVERDIED = "MEDIA_ERROR_SERVER_DIED";
    private static final String ERR_UNKNOWN = "MEDIA_ERROR_UNKNOWN";
    private final int MEDIA_INFO_BUFFERING_END = 702;
    private final int MEDIA_INFO_BUFFERING_START = 701;
    private int _apiLevel;
    protected int _duration;
    protected boolean _inListener;
    protected MediaPlayer _mPlayer;
    protected IMonitorNotifier _notifier;
    protected android.media.MediaPlayer.OnErrorListener _onErrorListenerOrig;
    protected android.media.MediaPlayer.OnInfoListener _onInfoListenerOrig;
    private boolean _preparedState;
    protected PlatformUtils _utils;

    public NativeStreamerProxy()
        throws Exception
    {
        _mPlayer = null;
        _utils = null;
        _notifier = null;
        _duration = -1;
        _onErrorListenerOrig = null;
        _onInfoListenerOrig = null;
        _apiLevel = 0;
        _preparedState = false;
        _inListener = false;
        _utils = PlatformUtils.getInstance();
        _apiLevel = android.os.Build.VERSION.SDK_INT;
    }

    public void Cleanup()
    {
        Log("NativeStreamerProxy: clean up callbacks");
        if (_mPlayer != null)
        {
            _mPlayer.setOnErrorListener(_onErrorListenerOrig);
            _mPlayer.setOnInfoListener(_onInfoListenerOrig);
            _mPlayer = null;
        }
        _onErrorListenerOrig = null;
        _onInfoListenerOrig = null;
    }

    public int GetCapabilities()
    {
        return 3;
    }

    public int GetDroppedFrames()
    {
        return -1;
    }

    public int GetIsLive()
    {
        return 0;
    }

    public int GetMinBufferLengthMs()
    {
        return 1500;
    }

    public int GetPlayheadTimeMs()
    {
        if (_mPlayer == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (_preparedState)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        _preparedState = true;
        return -1;
        int i = _mPlayer.getCurrentPosition();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (_duration == -1)
        {
            _duration = _mPlayer.getDuration();
            HashMap hashmap = new HashMap();
            hashmap.put("duration", String.valueOf(_duration));
            _notifier.OnMetadata(hashmap);
        }
        return i;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        return -1;
    }

    public double GetRenderedFrameRate()
    {
        return -1D;
    }

    public String GetServerAddress()
    {
        return null;
    }

    public int GetStartingBufferLengthMs()
    {
        return 11000;
    }

    public String GetStreamerVersion()
    {
        return null;
    }

    public void Log(String s)
    {
        if (_notifier != null)
        {
            _notifier.Log(s);
            return;
        } else
        {
            _utils.log(s);
            return;
        }
    }

    public int getApiLevel()
    {
        return _apiLevel;
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (_inListener)
        {
            return true;
        }
        Log((new StringBuilder()).append("Proxy: onError (").append(i).append(", ").append(j).append(")").toString());
        Object obj;
        boolean flag;
        if (i == 1)
        {
            obj = "MEDIA_ERROR_UNKNOWN";
        } else
        if (i == 100)
        {
            obj = "MEDIA_ERROR_SERVER_DIED";
        } else
        if (i == 200)
        {
            obj = "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK";
        } else
        {
            obj = "MEDIA_ERROR_UNKNOWN";
        }
        obj = StreamerError.makeUnscopedError(((String) (obj)), 1);
        _notifier.OnError(((StreamerError) (obj)));
        if (_onErrorListenerOrig == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        _inListener = true;
        flag = _onErrorListenerOrig.onError(mediaplayer, i, j);
        _inListener = false;
        return flag;
        mediaplayer;
        _inListener = false;
        throw mediaplayer;
        return true;
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (_inListener)
        {
            return true;
        }
        Log("Proxy: onInfo");
        byte byte1;
        boolean flag1;
        if (_apiLevel >= 9)
        {
            byte byte0;
            boolean flag;
            if (i == 701)
            {
                Log("Buffering start event");
                byte0 = 6;
            } else
            if (i == 702)
            {
                Log("Buffering end event");
                byte0 = 3;
            } else
            {
                Log((new StringBuilder()).append("other events: ").append(i).append(" : ignored").toString());
                byte0 = 100;
            }
            byte1 = byte0;
            if (byte0 != 100)
            {
                _notifier.SetPlayingState(byte0);
                byte1 = byte0;
            }
        } else
        {
            byte1 = 100;
        }
        if (_onInfoListenerOrig == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        _inListener = true;
        flag = _onInfoListenerOrig.onInfo(mediaplayer, i, j);
        _inListener = false;
        return flag;
        mediaplayer;
        _inListener = false;
        throw mediaplayer;
        if (byte1 != 100)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    public void setMonitoringNotifier(IMonitorNotifier imonitornotifier)
    {
        _notifier = imonitornotifier;
    }

    public void start()
    {
    }
}
