// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.session;

import com.conviva.ConvivaContentInfo;
import com.conviva.StreamerError;
import com.conviva.monitor.Monitor;
import com.conviva.platforms.PlatformApi;
import com.conviva.utils.LivePassVersion;
import com.conviva.utils.PlatformUtils;
import com.conviva.utils.Settings;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;

// Referenced classes of package com.conviva.session:
//            EventQueue

public class Session
{

    private PlatformApi _api;
    private String _clv;
    private ConvivaContentInfo _contentInfo;
    private EventQueue _eventQueue;
    private int _heartbeatSequenceNumber;
    private Monitor _monitor;
    private Map _nativeReprTags;
    private int _sessionId;
    private Settings _settings;
    private double _startTimeMs;
    private PlatformUtils _utils;

    public Session(Object obj, ConvivaContentInfo convivacontentinfo, Map map, boolean flag)
        throws Exception
    {
        _contentInfo = null;
        _nativeReprTags = null;
        _utils = null;
        _api = null;
        _settings = null;
        _monitor = null;
        _eventQueue = null;
        _sessionId = 0;
        _startTimeMs = 0.0D;
        _heartbeatSequenceNumber = 0;
        _clv = LivePassVersion.getVersionStr();
        _utils = PlatformUtils.getInstance();
        _contentInfo = convivacontentinfo;
        _sessionId = _utils.randInt();
        if (_contentInfo.tags == null)
        {
            _utils.err("tags should not be null");
            _contentInfo.tags = new HashMap();
        }
        convivacontentinfo = _contentInfo.tags.keySet().iterator();
        do
        {
            if (!convivacontentinfo.hasNext())
            {
                break;
            }
            String s = (String)convivacontentinfo.next();
            if (_contentInfo.tags.get(s) == null)
            {
                _contentInfo.tags.put(s, "null");
            }
        } while (true);
        convivacontentinfo = _utils.getSettings().platformApiName;
        if (convivacontentinfo == null || convivacontentinfo.isEmpty())
        {
            break MISSING_BLOCK_LABEL_254;
        }
        convivacontentinfo = Class.forName(convivacontentinfo);
        if (convivacontentinfo != null)
        {
            try
            {
                _api = (PlatformApi)convivacontentinfo.getConstructor(new Class[] {
                    java/lang/Object
                }).newInstance(new Object[] {
                    obj
                });
            }
            // Misplaced declaration of an exception variable
            catch (ConvivaContentInfo convivacontentinfo)
            {
                convivacontentinfo.printStackTrace();
            }
        }
        if (_api == null)
        {
            _api = _utils.getSettings().platformApi;
        }
        _nativeReprTags = _contentInfo.tags;
        _settings = _utils.getSettings();
        _eventQueue = new EventQueue();
        if (!flag)
        {
            _monitor = new Monitor(obj, _eventQueue, _contentInfo, map, _sessionId, _api);
        }
        return;
    }

    private void createHBTimer(boolean flag)
    {
        int i = 0;
        if (!flag)
        {
            i = _settings.heartbeatIntervalMs;
        }
        _api.createTimer(new TimerTask() {

            final Session this$0;

            public void run()
            {
                sendHeartbeat();
            }

            
            {
                this$0 = Session.this;
                super();
            }
        }, i, _settings.heartbeatIntervalMs, "sendHeartbeat");
    }

    private void encodeAndPostHeartbeat(Map map)
    {
        map = _utils.jsonEncode(map);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        postHeartbeat(map);
        return;
        map;
        _utils.log((new StringBuilder()).append("JSON post error: ").append(map.toString()).toString());
        return;
    }

    private Map makeHeartbeat()
    {
        Object obj = _eventQueue.flushEvents();
        HashMap hashmap = new HashMap();
        hashmap.put("t", "CwsSessionHb");
        hashmap.put("evs", obj);
        hashmap.put("cid", _settings.customerKey);
        hashmap.put("clid", _utils.clientId);
        hashmap.put("sid", Integer.valueOf(_sessionId));
        hashmap.put("seq", Integer.valueOf(_heartbeatSequenceNumber));
        hashmap.put("pver", _settings.protocolVersion);
        hashmap.put("clv", _clv);
        hashmap.put("iid", Integer.valueOf(_settings.clientInstanceId));
        obj = _utils.getPlatformMetadata();
        if (obj != null)
        {
            hashmap.put("pm", obj);
        }
        hashmap.put("tags", _nativeReprTags);
        _utils.getClass();
        if ("Android" != null)
        {
            _utils.getClass();
            hashmap.put("pt", "Android");
        }
        if (_utils._PLATFORM_VER != null)
        {
            hashmap.put("ptv", _utils._PLATFORM_VER);
        }
        if (_contentInfo.viewerId != null)
        {
            hashmap.put("vid", _contentInfo.viewerId);
        }
        double d;
        if (_monitor != null)
        {
            hashmap.put("an", _contentInfo.assetName);
            hashmap.put("lv", Boolean.valueOf(_contentInfo.isLive));
            _monitor.updateHeartbeat(hashmap);
        } else
        {
            hashmap.put("sf", Integer.valueOf(0));
        }
        if (_contentInfo.playerName != null)
        {
            hashmap.put("pn", _contentInfo.playerName);
        }
        if (_settings.sendLogs)
        {
            hashmap.put("lg", _utils.getLogs(_sessionId));
        }
        d = _utils.epochTimeMs();
        hashmap.put("st", Integer.valueOf((int)(d - _startTimeMs)));
        hashmap.put("cts", Double.valueOf(d / 1000D));
        _heartbeatSequenceNumber = _heartbeatSequenceNumber + 1;
        return hashmap;
    }

    private void onHeartbeatResponse(String s)
    {
        if (s == null)
        {
            _utils.log("JSON: Received null response to POST request");
        } else
        {
            _utils.logConsole((new StringBuilder()).append("onHeartbeatResponse: data = ").append(s).toString());
            Map map = _utils.jsonDecode(s);
            if (map == null)
            {
                _utils.log("JSON: Received null decoded response");
                return;
            }
            if (map.containsKey("clid"))
            {
                _utils.setClientIdFromServer(map.get("clid").toString());
            }
            boolean flag;
            if (map.containsKey("slg") && ((Boolean)(Boolean)map.get("slg")).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != _settings.sendLogs)
            {
                PlatformUtils platformutils = _utils;
                StringBuilder stringbuilder = (new StringBuilder()).append("Turning ");
                long l;
                if (flag)
                {
                    s = "on";
                } else
                {
                    s = "off";
                }
                platformutils.log(stringbuilder.append(s).append(" sending of logs").toString());
                _settings.sendLogs = flag;
            }
            if (map.containsKey("hbi"))
            {
                l = ((Long)map.get("hbi")).longValue() * 1000L;
                if ((long)_settings.heartbeatIntervalMs != l)
                {
                    _utils.log((new StringBuilder()).append("Received hbIntervalMs from server ").append(l).toString());
                    _settings.heartbeatIntervalMs = (int)l;
                    createHBTimer(false);
                }
            }
            if (map.containsKey("gw"))
            {
                s = (String)(String)map.get("gw");
                if (!_settings.gatewayUrl.equals(s))
                {
                    _utils.log((new StringBuilder()).append("Received gatewayUrl from server ").append(s).toString());
                    _settings.gatewayUrl = s;
                    return;
                }
            }
        }
    }

    private void postHeartbeat(String s)
    {
        String s1 = (new StringBuilder()).append(_settings.gatewayUrl).append(_settings.gatewayPath).toString();
        _utils.logSession((new StringBuilder()).append("Send HB[").append(_heartbeatSequenceNumber - 1).append("]").toString(), _sessionId);
        _utils.logConsole((new StringBuilder()).append("heartbeat to be sent: ").append(s).toString());
        _utils.httpRequest(true, s1, s, "application/json", new com.conviva.utils.CallableWithParameters.With1() {

            final Session this$0;

            public volatile void exec(Object obj)
            {
                exec((String)obj);
            }

            public void exec(String s2)
            {
                onHeartbeatResponse(s2);
            }

            
            {
                this$0 = Session.this;
                super();
            }
        });
    }

    private void sendHeartbeat()
    {
        boolean flag = false;
        if (_eventQueue.size() > 0)
        {
            flag = true;
        } else
        if (_monitor == null)
        {
            return;
        }
        if (!flag && (_utils.inSleepingMode() || !_utils.isVisible()))
        {
            _utils.log("Do not send out heartbeat: player is sleeping or not visible");
        } else
        {
            Map map = makeHeartbeat();
            if (map != null)
            {
                encodeAndPostHeartbeat(map);
                return;
            }
        }
    }

    public void adEnd()
    {
        if (_monitor != null)
        {
            _monitor.adEnd();
        }
    }

    public void adStart()
    {
        if (_monitor != null)
        {
            _monitor.adStart();
        }
    }

    public void attachStreamer(Object obj)
        throws Exception
    {
        _monitor.attachStreamer(obj);
    }

    public void cleanup()
    {
        _utils.log("Schedule the last hb before session cleanup");
        if (_monitor != null)
        {
            sendSessionEndEvent();
        }
        sendHeartbeat();
        _api.cleanup();
        _api = null;
        if (_monitor != null)
        {
            _monitor.cleanup();
            _monitor = null;
        }
    }

    public void pauseMonitor()
        throws Exception
    {
        _monitor.pauseMonitor();
    }

    public void playerPaused(boolean flag)
    {
        _monitor.playerPaused(flag);
    }

    public void reportError(StreamerError streamererror)
    {
        if (_monitor != null)
        {
            _monitor.OnError(streamererror);
        }
    }

    public void sendCustomEvent(String s, Map map)
    {
        _utils.log((new StringBuilder()).append("cws.sendEvent ").append(s).toString());
        HashMap hashmap = new HashMap();
        hashmap.put("name", s);
        hashmap.put("attr", map);
        _eventQueue.enqueueEvent("CwsCustomEvent", hashmap, (int)(_utils.epochTimeMs() - _startTimeMs));
    }

    public void sendSessionEndEvent()
    {
        _utils.log("cws.sendSessionEndEvent()");
        HashMap hashmap = new HashMap();
        _eventQueue.enqueueEvent("CwsSessionEndEvent", hashmap, (int)(_utils.epochTimeMs() - _startTimeMs));
    }

    public void setBitrate(int i)
    {
        _monitor.setBitrate(i);
    }

    public void setCdnNameOrResource(String s)
    {
        if (_monitor != null)
        {
            _monitor.SetStream(-1, s, s);
        }
    }

    public void setMetadata(Map map)
    {
        _utils.log("cws.setMetadata");
        if (_monitor != null)
        {
            _monitor.OnMetadata(map);
        }
    }

    public void start()
    {
        _utils.log((new StringBuilder()).append("Session.start assetName=").append(_contentInfo.assetName).toString());
        _startTimeMs = _utils.epochTimeMs();
        try
        {
            if (_monitor != null)
            {
                _monitor.start(_startTimeMs);
            }
            _heartbeatSequenceNumber = 0;
            createHBTimer(true);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }


}
