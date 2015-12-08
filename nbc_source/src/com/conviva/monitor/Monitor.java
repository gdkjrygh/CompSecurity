// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.monitor;

import com.conviva.ConvivaContentInfo;
import com.conviva.ConvivaStreamerProxy;
import com.conviva.StreamerError;
import com.conviva.platforms.PlatformApi;
import com.conviva.session.EventQueue;
import com.conviva.streamerProxies.Native.NativeStreamerProxy;
import com.conviva.utils.PlatformUtils;
import com.conviva.utils.SlidingWindow;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;

// Referenced classes of package com.conviva.monitor:
//            IMonitorNotifier, PlayerStates

public class Monitor
    implements IMonitorNotifier
{

    private static PlatformUtils _utils = null;
    private final int _NUM_PHT_OBSERVATIONS = 5;
    private final int _PHT_MIN_SAMPLES = 3;
    private final int _PHT_PAUSED_EXPECTED_SPEED = 0;
    private final int _PHT_PLAY_EXPECTED_SPEED = 1;
    private final float _PHT_TOLERANCE = 0.5F;
    private double _adStartTimeMs;
    private int _adTimeMs;
    private PlatformApi _api;
    private int _bitrateKbps;
    private int _bufferingEventCount;
    private String _cdn;
    private ConvivaContentInfo _contentInfo;
    private int _contentLenMs;
    private Map _cumulativeTimePerState;
    private int _encodedFps;
    private EventQueue _eventQueue;
    private boolean _explicitPlayerPaused;
    private boolean _externalBitrateReporting;
    private boolean _isProxyCreatedOutside;
    private int _joinTimeMs;
    private SlidingWindow _lastPHTSpeeds;
    private int _lastPlayHeadTimeMs;
    private double _lastPollTimeMs;
    private double _lastStateUpdateTimeMs;
    private double _nominalPlayingBitsTotal;
    private int _playingFpsObservationCount;
    private double _playingFpsTotal;
    private int _playingState;
    private TimerTask _pollStreamerTask;
    private boolean _preGingerBread;
    private String _resource;
    private int _sessionFlags;
    private int _sessionId;
    private double _startTimeMs;
    private ConvivaStreamerProxy _streamer;
    private Object _streamerObject;

    public Monitor(Object obj, EventQueue eventqueue, ConvivaContentInfo convivacontentinfo, Map map, int i, PlatformApi platformapi)
        throws Exception
    {
        boolean flag1 = true;
        super();
        _sessionId = 0;
        _streamer = null;
        _streamerObject = null;
        _eventQueue = null;
        _contentInfo = null;
        _api = null;
        _startTimeMs = 0.0D;
        _adStartTimeMs = 0.0D;
        _adTimeMs = 0;
        _lastStateUpdateTimeMs = 0.0D;
        _explicitPlayerPaused = false;
        _externalBitrateReporting = false;
        _preGingerBread = false;
        _isProxyCreatedOutside = false;
        _playingState = 100;
        _bitrateKbps = -1;
        _cdn = null;
        _resource = null;
        _sessionFlags = 1;
        _cumulativeTimePerState = null;
        _joinTimeMs = -1;
        _bufferingEventCount = 0;
        _nominalPlayingBitsTotal = 0.0D;
        _encodedFps = -1;
        _contentLenMs = -1;
        _playingFpsObservationCount = 0;
        _playingFpsTotal = 0.0D;
        _lastPHTSpeeds = null;
        _pollStreamerTask = new TimerTask() {

            final Monitor this$0;

            public void run()
            {
                pollStreamer();
            }

            
            {
                this$0 = Monitor.this;
                super();
            }
        };
        _lastPollTimeMs = 0.0D;
        _lastPlayHeadTimeMs = 0;
        _eventQueue = eventqueue;
        _utils = PlatformUtils.getInstance();
        _contentInfo = convivacontentinfo;
        _sessionId = i;
        _api = platformapi;
        _startTimeMs = 0.0D;
        _adStartTimeMs = 0.0D;
        _adTimeMs = 0;
        _lastStateUpdateTimeMs = 0.0D;
        _cumulativeTimePerState = new HashMap();
        for (eventqueue = PlayerStates.stateToInt.entrySet().iterator(); eventqueue.hasNext(); _cumulativeTimePerState.put(convivacontentinfo.getValue(), Integer.valueOf(0)))
        {
            convivacontentinfo = (java.util.Map.Entry)eventqueue.next();
        }

        _joinTimeMs = -1;
        _bufferingEventCount = 0;
        _nominalPlayingBitsTotal = 0.0D;
        _encodedFps = -1;
        _contentLenMs = -1;
        _playingFpsObservationCount = 0;
        _playingFpsTotal = 0.0D;
        _streamerObject = obj;
        obj = (NativeStreamerProxy)_streamer;
        if (obj != null && ((NativeStreamerProxy) (obj)).getApiLevel() < 9)
        {
            _preGingerBread = true;
        }
        if (map != null)
        {
            boolean flag;
            if (map.containsKey("explicitPlayerPaused") && ((Boolean)map.get("explicitPlayerPaused")).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _explicitPlayerPaused = flag;
            if (map.containsKey("externalBitrateReporting") && ((Boolean)map.get("externalBitrateReporting")).booleanValue())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            _externalBitrateReporting = flag;
        }
    }

    private void InferPlayingState(double d)
    {
        if (_streamer != null)
        {
            if (_joinTimeMs < 0 && _streamer.GetRenderedFrameRate() > 0.0D)
            {
                _joinTimeMs = -3;
                Log((new StringBuilder()).append("infer state to PLAYING, rendered frame rate is ").append(_streamer.GetRenderedFrameRate()).toString());
                SetPlayingState(3);
                return;
            }
            if (com/conviva/streamerProxies/Native/NativeStreamerProxy.isInstance(_streamer) && _lastPHTSpeeds != null && _lastPHTSpeeds.size() >= 3)
            {
                Iterator iterator = _lastPHTSpeeds.getSlots().iterator();
                float f;
                for (f = 0.0F; iterator.hasNext(); f = ((Number)iterator.next()).floatValue() + f) { }
                f /= _lastPHTSpeeds.size();
                if (_playingState != 3 && Math.abs(f - 1.0F) < 0.5F)
                {
                    Log("infer state PLAYING, PHT is moving");
                    SetPlayingState(3);
                    return;
                }
                if (_joinTimeMs >= 0 && f == 0.0F)
                {
                    if (_playingState != 1 && (_lastPlayHeadTimeMs == 0 || _lastPlayHeadTimeMs == _contentLenMs))
                    {
                        Log("infer STOPPED state, PHT is not moving and is 0");
                        SetPlayingState(1);
                        return;
                    }
                    int k = _streamer.GetBufferLengthMs();
                    if (_playingState == 3 || _playingState == 100)
                    {
                        if (k >= 0)
                        {
                            int j = _streamer.GetMinBufferLengthMs();
                            int i = j;
                            if (j > _contentLenMs - _lastPlayHeadTimeMs)
                            {
                                i = _contentLenMs - _lastPlayHeadTimeMs;
                            }
                            if (k < i)
                            {
                                Log("infer BUFFERING state, PHT is not moving and buffer length is less than minBufferlen");
                                SetPlayingState(6);
                            } else
                            {
                                Log("infer PAUSED state, PHT is not moving");
                                SetPlayingState(12);
                            }
                        } else
                        if (_explicitPlayerPaused || _preGingerBread)
                        {
                            Log("infer BUFFERING state, PHT is not moving and buffer length is unavailable");
                            SetPlayingState(6);
                        } else
                        {
                            Log("infer PAUSED state, PHT is not moving and buffer events are available");
                            SetPlayingState(12);
                        }
                    }
                    if (_playingState == 6 && _streamer.GetStartingBufferLengthMs() > 0 && k > _streamer.GetStartingBufferLengthMs())
                    {
                        Log("infer PAUSED state, buffer length grew longer than starting bufferLen.");
                        SetPlayingState(12);
                        return;
                    }
                }
            }
        }
    }

    private void clearPHTSamples()
    {
        if (_lastPHTSpeeds != null)
        {
            _lastPHTSpeeds.clear();
        }
    }

    private void enqueueBitrateChangeEvent(int i)
    {
        if (i <= 0 || _bitrateKbps == i)
        {
            return;
        }
        Log((new StringBuilder()).append("enqueueBitrateChangeEvent, new bitrate: ").append(i).toString());
        Integer integer = null;
        if (_bitrateKbps > 0)
        {
            integer = Integer.valueOf(_bitrateKbps);
        }
        _bitrateKbps = i;
        updateStateCumulativeTime();
        enqueueStateChange("br", integer, Integer.valueOf(i));
    }

    private void enqueueEvent(String s, Map map)
    {
        if (_eventQueue != null)
        {
            _eventQueue.enqueueEvent(s, map, (int)(_utils.epochTimeMs() - _startTimeMs));
        }
    }

    private void enqueueStateChange(String s, Object obj, Object obj1)
    {
        HashMap hashmap = new HashMap();
        if (obj != null)
        {
            HashMap hashmap1 = new HashMap();
            hashmap1.put(s, obj);
            hashmap.put("old", hashmap1);
        }
        obj = new HashMap();
        ((HashMap) (obj)).put(s, obj1);
        hashmap.put("new", obj);
        enqueueEvent("CwsStateChangeEvent", hashmap);
    }

    private void pollStreamer()
    {
        if (_streamer == null)
        {
            return;
        }
        int i = _streamer.GetPlayheadTimeMs();
        double d = _utils.epochTimeMs();
        if (i >= 0 && _lastPollTimeMs > 0.0D && d > _lastPollTimeMs)
        {
            _lastPHTSpeeds.add(Float.valueOf((float)(i - _lastPlayHeadTimeMs) / (float)(d - _lastPollTimeMs)));
        }
        _lastPollTimeMs = d;
        _lastPlayHeadTimeMs = i;
        InferPlayingState(d);
    }

    private void updateMetrics()
    {
        if (_streamer == null)
        {
            return;
        }
        if (_playingState == 3)
        {
            double d = _streamer.GetRenderedFrameRate();
            if (d >= 0.0D)
            {
                _playingFpsTotal = d + _playingFpsTotal;
                _playingFpsObservationCount = _playingFpsObservationCount + 1;
            }
        }
        updateStateCumulativeTime();
    }

    private void updateStateCumulativeTime()
    {
        double d = _utils.epochTimeMs();
        if (_playingState != 100)
        {
            int i = (int)(d - _lastStateUpdateTimeMs);
            _cumulativeTimePerState.put(Integer.valueOf(_playingState), Integer.valueOf(((Integer)_cumulativeTimePerState.get(Integer.valueOf(_playingState))).intValue() + i));
            if (_playingState == 3 && _bitrateKbps != -1)
            {
                double d1 = _nominalPlayingBitsTotal;
                _nominalPlayingBitsTotal = (double)(_bitrateKbps * i) + d1;
            }
        }
        _lastStateUpdateTimeMs = d;
    }

    private ConvivaStreamerProxy wrapInConvivaStreamerProxy(Object obj)
        throws Exception
    {
        if (com/conviva/ConvivaStreamerProxy.isInstance(obj))
        {
            _isProxyCreatedOutside = true;
            Log("streamer is ConvivaStreamerProxy");
            return (ConvivaStreamerProxy)obj;
        } else
        {
            _isProxyCreatedOutside = false;
            _utils.err((new StringBuilder()).append("The streamer is not recognizable, class: ").append(obj.getClass().getName()).toString());
            throw new Exception("Monitoring unimplemented for streamer");
        }
    }

    public void Log(String s)
    {
        _utils.logSession(s, _sessionId);
    }

    public void OnError(StreamerError streamererror)
    {
        boolean flag = true;
        Log("Enqueue CwsErrorEvent");
        HashMap hashmap;
        if (streamererror.getSeverity() != 1)
        {
            flag = false;
        }
        hashmap = new HashMap();
        hashmap.put("ft", Boolean.valueOf(flag));
        hashmap.put("err", streamererror.getErrorCode().toString());
        enqueueEvent("CwsErrorEvent", hashmap);
        if (flag && _joinTimeMs < 0)
        {
            _joinTimeMs = -2;
        }
    }

    public void OnMetadata(Map map)
    {
        try
        {
            if (map.containsKey("framerate"))
            {
                _encodedFps = _utils.parseInt((String)map.get("framerate"), -1);
            }
            if (map.containsKey("duration"))
            {
                _contentLenMs = _utils.parseInt((String)map.get("duration"), -1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log((new StringBuilder()).append("monitor.OnMetadata() error: ").append(map.toString()).toString());
        }
    }

    public void SetPlayingState(int i)
    {
        boolean flag1 = false;
        if (_playingState == i)
        {
            return;
        }
        Log((new StringBuilder()).append("Change state to ").append(i).toString());
        updateStateCumulativeTime();
        boolean flag;
        boolean flag2;
        if (_joinTimeMs >= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag = flag1;
        if (!flag2)
        {
            flag = flag1;
            if (i == 3)
            {
                _cumulativeTimePerState.put(Integer.valueOf(6), Integer.valueOf(0));
                if (_adStartTimeMs > 0.0D)
                {
                    adEnd();
                }
                _joinTimeMs = (int)(_utils.epochTimeMs() - _startTimeMs - (double)_adTimeMs);
                if (_joinTimeMs < 0)
                {
                    _joinTimeMs = 0;
                }
                flag = true;
            }
        }
        flag1 = flag;
        if (flag2)
        {
            flag1 = flag;
            if (i == 6)
            {
                _bufferingEventCount = _bufferingEventCount + 1;
                flag1 = true;
            }
        }
        flag = flag1;
        if (_playingState == 6)
        {
            flag = flag1;
            if (i == 3)
            {
                flag = true;
            }
        }
        if (flag)
        {
            clearPHTSamples();
        }
        enqueueStateChange("ps", Integer.valueOf(_playingState), Integer.valueOf(i));
        _playingState = i;
    }

    public void SetStream(int i, String s, String s1)
    {
        if (!_externalBitrateReporting)
        {
            enqueueBitrateChangeEvent(i);
        }
        if (s != null && !_cdn.equals(s))
        {
            Log((new StringBuilder()).append("monitor.SetStream(): cdn changed to: ").append(s).toString());
            enqueueStateChange("cdn", _cdn, s);
            _cdn = s;
        }
        if (s1 != null && !_resource.equals(s1))
        {
            Log((new StringBuilder()).append("monitor.SetStream(): resource changed to: ").append(s1).toString());
            enqueueStateChange("rs", _resource, s1);
            _resource = s1;
        }
    }

    public void adEnd()
    {
        Log("monitor.adEnd()");
        Boolean boolean1;
        boolean flag;
        if (_adStartTimeMs > 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        boolean1 = Boolean.valueOf(flag);
        if (boolean1.booleanValue())
        {
            _adTimeMs = (int)((double)_adTimeMs + (_utils.epochTimeMs() - _adStartTimeMs));
        }
        _adStartTimeMs = 0.0D;
        enqueueStateChange("pj", boolean1, Boolean.valueOf(false));
    }

    public void adStart()
    {
        Log("monitor.adStart()");
        boolean flag;
        if (_adStartTimeMs > 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _adStartTimeMs = _utils.epochTimeMs();
        enqueueStateChange("pj", Boolean.valueOf(flag), Boolean.valueOf(true));
    }

    public void attachStreamer(Object obj)
        throws Exception
    {
        if (obj == null)
        {
            Log("monitor.attachStreamer() received a null streamer");
            SetPlayingState(98);
            return;
        }
        SetPlayingState(100);
        Log("monitor.attachStreamer()");
        _streamer = wrapInConvivaStreamerProxy(obj);
        _sessionFlags = _streamer.GetCapabilities();
        if (_externalBitrateReporting)
        {
            _sessionFlags = _sessionFlags | 0x10;
        }
        _streamer.setMonitoringNotifier(this);
        _lastPollTimeMs = 0.0D;
        _api.createPollTask(_pollStreamerTask, 200);
    }

    public void cleanup()
    {
        Log("monitor.cleanup()");
        pauseMonitor();
        _api = null;
        _eventQueue = null;
        _contentInfo = null;
    }

    public ConvivaStreamerProxy getStreamer()
    {
        return _streamer;
    }

    public void pauseMonitor()
    {
        Log("monitor.pauseMonitor()");
        updateMetrics();
        if (_streamer != null)
        {
            _streamer.setMonitoringNotifier(null);
            if (!_isProxyCreatedOutside)
            {
                ConvivaStreamerProxy convivastreamerproxy = _streamer;
                _streamer = null;
                convivastreamerproxy.Cleanup();
            } else
            {
                Log("Streamer Proxy is not created by Conviva and will not be cleaned up by Conviva Library");
                _streamer = null;
            }
        }
        if (_lastPHTSpeeds != null)
        {
            _lastPHTSpeeds.clear();
        }
        SetPlayingState(98);
    }

    public void playerPaused(boolean flag)
    {
        if (flag)
        {
            Log("Player state is paused via explicit call");
            SetPlayingState(12);
        } else
        {
            Log("Player state is un-paused via explicit call");
            SetPlayingState(100);
        }
        clearPHTSamples();
    }

    public void setBitrate(int i)
    {
        if (_externalBitrateReporting)
        {
            enqueueBitrateChangeEvent(i);
            return;
        } else
        {
            Log("setBitrate(): call ignored, enable external bitrate reporting first");
            return;
        }
    }

    public void start(double d)
        throws Exception
    {
        Log("monitor starts");
        _startTimeMs = d;
        _lastStateUpdateTimeMs = d;
        if (_contentInfo != null)
        {
            _cdn = _contentInfo.defaultReportingCdnName;
            if (_contentInfo.defaultReportingResource == null)
            {
                _resource = _cdn;
            } else
            {
                _resource = _contentInfo.defaultReportingResource;
            }
            _bitrateKbps = _contentInfo.defaultReportingBitrateKbps;
        } else
        {
            _cdn = "OTHER";
            _resource = "OTHER";
        }
        attachStreamer(_streamerObject);
        _streamerObject = null;
        _lastPHTSpeeds = new SlidingWindow(5);
        _lastPlayHeadTimeMs = 0;
    }

    public void updateHeartbeat(Map map)
    {
        boolean flag = false;
        updateMetrics();
        int l = ((Integer)_cumulativeTimePerState.get(Integer.valueOf(3))).intValue();
        int i;
        int j;
        int k;
        if (_joinTimeMs >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            j = ((Integer)_cumulativeTimePerState.get(Integer.valueOf(6))).intValue();
        } else
        {
            j = 0;
        }
        map.put("ps", Integer.valueOf(_playingState));
        if (_adStartTimeMs > 0.0D)
        {
            flag = true;
        }
        map.put("pj", Boolean.valueOf(flag));
        map.put("sf", Integer.valueOf(_sessionFlags));
        if (_streamer != null)
        {
            map.put("fw", _streamer.GetStreamerType());
            String s = _streamer.GetStreamerVersion();
            if (s != null)
            {
                map.put("fwv", s);
            }
        }
        if (_contentInfo != null && _contentInfo.streamUrl != null)
        {
            map.put("url", _contentInfo.streamUrl);
        }
        map.put("rs", _resource);
        map.put("cdn", _cdn);
        if (_contentLenMs >= 0)
        {
            map.put("cl", Integer.valueOf((int)((double)_contentLenMs / 1000D)));
        }
        if (_encodedFps >= 0)
        {
            map.put("efps", Integer.valueOf(_encodedFps));
        }
        if (_playingFpsObservationCount > 0)
        {
            k = (int)((_playingFpsTotal + 0.0D) / (double)_playingFpsObservationCount);
        } else
        {
            k = -1;
        }
        if (k >= 0)
        {
            map.put("afps", Integer.valueOf(k));
        }
        map.put("tpt", Integer.valueOf(l));
        map.put("tbt", Integer.valueOf(j));
        map.put("tpst", _cumulativeTimePerState.get(Integer.valueOf(12)));
        map.put("tst", _cumulativeTimePerState.get(Integer.valueOf(1)));
        map.put("jt", Integer.valueOf(_joinTimeMs));
        map.put("tbe", Integer.valueOf(_bufferingEventCount));
        if (_bitrateKbps > 0)
        {
            map.put("cbr", Integer.valueOf(_bitrateKbps));
            map.put("br", Integer.valueOf(_bitrateKbps));
        }
        if (i != 0 && _nominalPlayingBitsTotal >= 0.0D)
        {
            i = (int)((_nominalPlayingBitsTotal + 0.0D) / (double)l);
        } else
        {
            i = -1;
        }
        if (i > 0)
        {
            map.put("abr", Integer.valueOf(i));
        }
    }


}
