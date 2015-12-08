// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;

import android.content.Context;
import com.conviva.monitor.PlayerStates;
import com.conviva.session.Session;
import com.conviva.session.SessionFactory;
import com.conviva.utils.PlatformUtils;
import com.conviva.utils.Settings;
import com.conviva.utils.Utils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.conviva:
//            StreamerError, ConvivaContentInfo

public class LivePass
{

    public static final String OPTION_EXPLICIT_PLAYER_PAUSED = "explicitPlayerPaused";
    public static final String OPTION_EXTERNAL_BITRATE_REPORTING = "externalBitrateReporting";
    private static int _globalSessionId = -1;
    private static SessionFactory _sessionFactory = null;
    private static Settings _settings = null;
    private static boolean _toggleTracesSet = false;
    private static boolean _toggleTracesSetValue = false;
    private static PlatformUtils _utils = null;
    private static boolean readyState = false;
    public final int STREAM_SELECTION_FAILURE = 1;
    public final int STREAM_SELECTION_SUCC = 0;
    public final int STREAM_SELECTION_TIMEOUT = 2;

    public LivePass()
    {
    }

    public static void adEnd(int i)
    {
        if (!readyState && _utils != null)
        {
            _utils.ping("adEnd before LivePass.init");
        }
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.adEnd(): session not found");
            return;
        } else
        {
            session.adEnd();
            return;
        }
    }

    public static void adStart(int i)
    {
        if (!readyState && _utils != null)
        {
            _utils.ping("adStart before LivePass.init");
        }
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.adStart(): session not found");
            return;
        } else
        {
            session.adStart();
            return;
        }
    }

    public static void attachStreamer(int i, Object obj)
        throws Exception
    {
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.attachStreamer(): session not found");
            return;
        } else
        {
            session.attachStreamer(obj);
            return;
        }
    }

    public static void cleanup()
    {
        if (_utils != null)
        {
            _utils.runProtected(new Callable() {

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Void call()
                    throws Exception
                {
                    if (LivePass._sessionFactory != null)
                    {
                        LivePass._sessionFactory.cleanup();
                    }
                    LivePass._sessionFactory = null;
                    LivePass._globalSessionId = -1;
                    if (LivePass._utils != null)
                    {
                        LivePass._utils.cleanup();
                    }
                    LivePass._utils = null;
                    LivePass.readyState = false;
                    return null;
                }

            }, "LivePass.cleanup");
        }
    }

    public static void cleanupSession(int i)
    {
        if (!readyState)
        {
            return;
        } else
        {
            _utils.runProtected(new Callable(i) {

                final int val$sessionId;

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Void call()
                    throws Exception
                {
                    LivePass._sessionFactory.cleanupSession(sessionId);
                    return null;
                }

            
            {
                sessionId = i;
                super();
            }
            }, "Livepass.cleanupSession");
            return;
        }
    }

    public static int createSession(Object obj, ConvivaContentInfo convivacontentinfo)
        throws Exception
    {
        return createSessionWorker(obj, convivacontentinfo, null, false);
    }

    public static int createSession(Object obj, ConvivaContentInfo convivacontentinfo, Map map)
        throws Exception
    {
        return createSessionWorker(obj, convivacontentinfo, map, false);
    }

    private static int createSessionWorker(Object obj, ConvivaContentInfo convivacontentinfo, Map map, boolean flag)
        throws Exception
    {
        if (!readyState)
        {
            if (_utils != null)
            {
                _utils.ping("createSession before LivePass.init");
            }
            throw new Exception("createSession before LivePass.init");
        }
        if (_settings.customerKey == null)
        {
            throw new Exception("Cannot create session: customerKey is null");
        } else
        {
            int i = _sessionFactory.newSessionId();
            _utils.runProtected(new Callable(obj, convivacontentinfo, map, i, flag) {

                final ConvivaContentInfo val$contentInfo;
                final boolean val$global;
                final Map val$sessionOptions;
                final int val$sid;
                final Object val$streamer;

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Void call()
                    throws Exception
                {
                    LivePass._sessionFactory.makeSession(streamer, contentInfo, sessionOptions, sid, global);
                    LivePass._utils.log("LivePass Session Created");
                    return null;
                }

            
            {
                streamer = obj;
                contentInfo = convivacontentinfo;
                sessionOptions = map;
                sid = i;
                global = flag;
                super();
            }
            }, "LivePass.createSession");
            return i;
        }
    }

    public static void init(String s, Context context)
        throws Exception
    {
        initWithSettings(s, null, context);
    }

    public static void initWithSettings(String s, Map map, Context context)
        throws Exception
    {
        if (s == null || s.length() == 0)
        {
            throw new Exception((new StringBuilder()).append("invalid customerKey: ").append(s).toString());
        }
        if (readyState)
        {
            return;
        } else
        {
            _utils = Utils.CreateUtils(map, context);
            _utils.startFetchClientId();
            _settings = _utils.getSettings();
            _settings.clientInstanceId = _utils.randUInt();
            _settings.customerKey = s;
            _settings.sendLogs = false;
            _utils.runProtected(new Callable() {

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Void call()
                    throws Exception
                {
                    if (LivePass._toggleTracesSet)
                    {
                        LivePass._settings.enableLogging = LivePass._toggleTracesSetValue;
                    }
                    LivePass._utils.log((new StringBuilder()).append("LivePass.init url=").append(LivePass._settings.gatewayUrl).append(", customerKey=").append(LivePass._settings.customerKey).toString());
                    PlayerStates.init();
                    LivePass._sessionFactory = new SessionFactory();
                    LivePass.readyState = true;
                    return null;
                }

            }, "LivePass.init");
            return;
        }
    }

    public static void pauseMonitor(int i)
        throws Exception
    {
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.pauseSession(): session not found");
            return;
        } else
        {
            session.pauseMonitor();
            return;
        }
    }

    public static void playerPaused(int i, boolean flag)
    {
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.playerPaused(): session not found");
            return;
        } else
        {
            session.playerPaused(flag);
            return;
        }
    }

    public static void reportError(int i, String s, int j)
    {
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.reportError(): session not found");
            return;
        } else
        {
            session.reportError(StreamerError.makeUnscopedError(s, j));
            return;
        }
    }

    public static void resumeMonitor(int i, Object obj)
        throws Exception
    {
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.resumeSession(): session not found");
            return;
        } else
        {
            session.attachStreamer(obj);
            return;
        }
    }

    public static void sendEvent(String s, Map map)
    {
        if (!readyState)
        {
            if (_utils != null)
            {
                _utils.ping("sendGlobalEvent before LivePass.init");
            }
            return;
        } else
        {
            _utils.runProtected(new Callable(s, map) {

                final Map val$attributes;
                final String val$name;

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Void call()
                    throws Exception
                {
                    if (LivePass._globalSessionId < 0)
                    {
                        LivePass._globalSessionId = LivePass.createSessionWorker(null, new ConvivaContentInfo("", new HashMap()), null, true);
                    }
                    LivePass.sendSessionEvent(LivePass._globalSessionId, name, attributes);
                    return null;
                }

            
            {
                name = s;
                attributes = map;
                super();
            }
            }, "LivePass.sendGlobalEvent");
            return;
        }
    }

    public static void sendSessionEvent(int i, String s, Map map)
    {
        if (!readyState)
        {
            if (_utils != null)
            {
                _utils.ping("sendEvent before LivePass.init");
            }
            return;
        } else
        {
            _utils.runProtected(new Callable(i, s, map) {

                final Map val$eventAttrDictCS;
                final String val$name;
                final int val$sessionId;

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Void call()
                    throws Exception
                {
                    LivePass._sessionFactory.getSession(sessionId).sendCustomEvent(name, eventAttrDictCS);
                    return null;
                }

            
            {
                sessionId = i;
                name = s;
                eventAttrDictCS = map;
                super();
            }
            }, "LivePass.sendSessionEvent");
            return;
        }
    }

    public static void setBitrate(int i, int j)
    {
        if (!readyState)
        {
            if (_utils != null)
            {
                _utils.ping("setBitrate before LivePass.init");
            }
            return;
        } else
        {
            _utils.runProtected(new Callable(i, j) {

                final int val$bitrateKbps;
                final int val$sessionId;

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

                public Void call()
                    throws Exception
                {
                    LivePass._sessionFactory.getSession(sessionId).setBitrate(bitrateKbps);
                    return null;
                }

            
            {
                sessionId = i;
                bitrateKbps = j;
                super();
            }
            }, "setBitrate");
            return;
        }
    }

    public static void setCdnNameOrResource(int i, String s)
    {
        Session session = _sessionFactory.getSession(i);
        if (session == null)
        {
            _utils.log("LivePass.setResource(): session not found");
            return;
        } else
        {
            session.setCdnNameOrResource(s);
            return;
        }
    }

    public static void setCurrentStreamMetadata(int i, Map map)
    {
        if (!readyState)
        {
            if (_utils != null)
            {
                _utils.ping("setCurrentMetadata before LivePass.init");
            }
            return;
        }
        HashMap hashmap = new HashMap();
        hashmap.putAll(map);
        if (hashmap.containsKey("duration"))
        {
            hashmap.put("duration", Integer.toString(_utils.parseInt((String)hashmap.get("duration"), -1) * 1000));
        }
        _utils.runProtected(new Callable(i, hashmap) {

            final Map val$localMetadata;
            final int val$sessionId;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                LivePass._sessionFactory.getSession(sessionId).setMetadata(localMetadata);
                return null;
            }

            
            {
                sessionId = i;
                localMetadata = map;
                super();
            }
        }, "setMetadata");
    }

    public static void toggleTraces(boolean flag)
    {
        _toggleTracesSet = true;
        if (_settings != null)
        {
            _settings.enableLogging = flag;
            return;
        } else
        {
            _toggleTracesSetValue = flag;
            return;
        }
    }







/*
    static PlatformUtils access$302(PlatformUtils platformutils)
    {
        _utils = platformutils;
        return platformutils;
    }

*/



/*
    static SessionFactory access$402(SessionFactory sessionfactory)
    {
        _sessionFactory = sessionfactory;
        return sessionfactory;
    }

*/


/*
    static boolean access$502(boolean flag)
    {
        readyState = flag;
        return flag;
    }

*/



/*
    static int access$602(int i)
    {
        _globalSessionId = i;
        return i;
    }

*/

}
