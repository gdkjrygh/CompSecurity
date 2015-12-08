// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;
import com.comscore.applications.ApplicationMeasurement;
import com.comscore.applications.EventType;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.CSLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;

// Referenced classes of package com.comscore.streaming:
//            State, Playlist, StreamSenseEventType, Clip, 
//            StreamSenseListener, d, e, f, 
//            a, b, c, StreamSenseMediaPlayer, 
//            StreamSenseVideoView, StreamSenseUtils

public class StreamSense
{

    protected Core a;
    private HashMap b;
    private String c;
    private long d;
    private long e;
    private State f;
    private int g;
    private Playlist h;
    private Timer i;
    private boolean j;
    private Timer k;
    private f l;
    private Timer m;
    private long n;
    private int o;
    private long p;
    private boolean q;
    private State r;
    private String s;
    private String t;
    private HashMap u;
    private List v;
    private List w;

    public StreamSense()
    {
        c = null;
        f = null;
        h = null;
        i = null;
        j = true;
        l = null;
        CSLog.d(this, "StreamSense()");
        a = comScore.getCore();
        b = new HashMap();
        g = 1;
        f = State.IDLE;
        h = new Playlist();
        i = null;
        j = true;
        m = null;
        o = 0;
        f();
        k = null;
        l = null;
        q = false;
        r = null;
        e = 0L;
        v = new ArrayList();
        w = o();
        reset();
    }

    private long a(long l1)
    {
        for (Iterator iterator = w.iterator(); iterator.hasNext();)
        {
            HashMap hashmap = (HashMap)iterator.next();
            Long long1 = (Long)hashmap.get("playingtime");
            if (long1 == null || l1 < long1.longValue())
            {
                return ((Long)hashmap.get("interval")).longValue();
            }
        }

        return 0L;
    }

    private State a(StreamSenseEventType streamsenseeventtype)
    {
        if (streamsenseeventtype == StreamSenseEventType.PLAY)
        {
            return State.PLAYING;
        }
        if (streamsenseeventtype == StreamSenseEventType.PAUSE)
        {
            return State.PAUSED;
        }
        if (streamsenseeventtype == StreamSenseEventType.BUFFER)
        {
            return State.BUFFERING;
        }
        if (streamsenseeventtype == StreamSenseEventType.END)
        {
            return State.IDLE;
        } else
        {
            return null;
        }
    }

    private HashMap a(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
    {
        CSLog.d(this, (new StringBuilder()).append("createMeasurementLabels(").append(streamsenseeventtype).append(")").toString());
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_ts"))
        {
            hashmap1.put("ns_ts", String.valueOf(System.currentTimeMillis()));
        }
        if (streamsenseeventtype != null && !hashmap1.containsKey("ns_st_ev"))
        {
            hashmap1.put("ns_st_ev", streamsenseeventtype.toString());
        }
        hashmap1.putAll(getLabels());
        b(streamsenseeventtype, hashmap1);
        h.a(streamsenseeventtype, hashmap1);
        h.getClip().a(streamsenseeventtype, hashmap1);
        if (!hashmap1.containsKey("ns_st_mp"))
        {
            hashmap1.put("ns_st_mp", s);
        }
        if (!hashmap1.containsKey("ns_st_mv"))
        {
            hashmap1.put("ns_st_mv", t);
        }
        if (!hashmap1.containsKey("ns_st_ub"))
        {
            hashmap1.put("ns_st_ub", "0");
        }
        if (!hashmap1.containsKey("ns_st_br"))
        {
            hashmap1.put("ns_st_br", "0");
        }
        if (!hashmap1.containsKey("ns_st_pn"))
        {
            hashmap1.put("ns_st_pn", "1");
        }
        if (!hashmap1.containsKey("ns_st_tp"))
        {
            hashmap1.put("ns_st_tp", "1");
        }
        if (!hashmap1.containsKey("ns_st_it"))
        {
            hashmap1.put("ns_st_it", "c");
        }
        hashmap1.put("ns_st_sv", "4.1401.31");
        return hashmap1;
    }

    private void a(State state, HashMap hashmap)
    {
        long l1 = 0L;
        CSLog.d(this, (new StringBuilder()).append("transitionTo(").append(state).append(", ").append(hashmap).append(")").toString());
        l();
        if (c(state))
        {
            State state1 = n();
            long l2 = d;
            long l3 = f(hashmap);
            if (l2 >= 0L)
            {
                l1 = l3 - l2;
            }
            b(n(), hashmap);
            c(state, hashmap);
            d(state);
            for (Iterator iterator = v.iterator(); iterator.hasNext(); ((StreamSenseListener)iterator.next()).onStateChange(state1, state, hashmap, l1)) { }
            c(hashmap);
            h.b(hashmap, state);
            h.getClip().b(hashmap, state);
            state = a(state.toEventType(), hashmap);
            state.putAll(hashmap);
            if (b(f))
            {
                a(((HashMap) (state)));
                r = f;
                g = g + 1;
            }
        }
    }

    private void a(State state, HashMap hashmap, long l1)
    {
        CSLog.d(this, (new StringBuilder()).append("transitionTo(").append(state).append(", ").append(hashmap).append(", ").append(l1).append(")").toString());
        l();
        if (c(state))
        {
            l = new d(this, state);
            l.schedule(new e(this, state, hashmap), l1);
        }
    }

    static void a(StreamSense streamsense)
    {
        streamsense.j();
    }

    static void a(StreamSense streamsense, State state, HashMap hashmap)
    {
        streamsense.a(state, hashmap);
    }

    private boolean a(State state)
    {
        return state == State.PLAYING || state == State.PAUSED;
    }

    public static StreamSense analyticsFor(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        StreamSense streamsense = new StreamSense();
        streamsense.engageTo(streamsensemediaplayer);
        streamsense.setPausePlaySwitchDelayEnabled(true);
        return streamsense;
    }

    public static StreamSense analyticsFor(StreamSenseVideoView streamsensevideoview)
    {
        StreamSense streamsense = new StreamSense();
        streamsense.engageTo(streamsensevideoview);
        return streamsense;
    }

    private HashMap b(StreamSenseEventType streamsenseeventtype, HashMap hashmap)
    {
label0:
        {
label1:
            {
                long l1;
                long l2;
                long l3;
                if (hashmap == null)
                {
                    hashmap = new HashMap();
                }
                hashmap.put("ns_st_ec", String.valueOf(g));
                if (hashmap.containsKey("ns_st_po"))
                {
                    break label0;
                }
                l2 = e;
                l3 = f(hashmap);
                if (streamsenseeventtype != StreamSenseEventType.PLAY && streamsenseeventtype != StreamSenseEventType.KEEP_ALIVE && streamsenseeventtype != StreamSenseEventType.HEART_BEAT)
                {
                    l1 = l2;
                    if (streamsenseeventtype != null)
                    {
                        break label1;
                    }
                    l1 = l2;
                    if (f != State.PLAYING)
                    {
                        break label1;
                    }
                }
                l1 = l2 + (l3 - h.getClip().g());
            }
            hashmap.put("ns_st_po", String.valueOf(l1));
        }
        if (streamsenseeventtype == StreamSenseEventType.HEART_BEAT)
        {
            hashmap.put("ns_st_hc", String.valueOf(o));
            hashmap.put("ns_st_pe", "1");
        }
        return hashmap;
    }

    private void b(State state, HashMap hashmap)
    {
        CSLog.d(this, (new StringBuilder()).append("onExit(").append(state).append(", ").append(hashmap).append(")").toString());
        long l1 = f(hashmap);
        if (state == State.PLAYING)
        {
            h.a(l1);
            e();
            h();
        } else
        {
            if (state == State.BUFFERING)
            {
                h.b(l1);
                k();
                return;
            }
            if (state == State.IDLE)
            {
                getClip().reset(getClip().getLabels().keySet());
                return;
            }
        }
    }

    private void b(HashMap hashmap)
    {
        if (f(hashmap) < 0L)
        {
            hashmap.put("ns_ts", String.valueOf(System.currentTimeMillis()));
        }
    }

    private boolean b(State state)
    {
        while (state == State.PAUSED && (r == State.IDLE || r == null) || state == State.BUFFERING || r == state) 
        {
            return false;
        }
        return true;
    }

    private void c()
    {
        k();
        if (isPauseOnBufferingEnabled() && b(State.PAUSED))
        {
            i = new Timer();
            i.schedule(new a(this), 500L);
        }
    }

    private void c(State state, HashMap hashmap)
    {
        long l1;
        CSLog.d(this, (new StringBuilder()).append("onEnter(").append(state).append(", ").append(hashmap).append(")").toString());
        l1 = f(hashmap);
        e = e(hashmap);
        if (state != State.PLAYING) goto _L2; else goto _L1
_L1:
        d();
        g();
        h.getClip().c(l1);
        if (b(state))
        {
            h.getClip().d();
            if (h.a() < 1)
            {
                h.a(1);
            }
        }
_L4:
        return;
_L2:
        if (state != State.PAUSED)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b(state))
        {
            h.f();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (state != State.BUFFERING)
        {
            continue; /* Loop/switch isn't completed */
        }
        h.getClip().d(l1);
        if (!j) goto _L4; else goto _L5
_L5:
        c();
        return;
        if (state != State.IDLE) goto _L4; else goto _L6
_L6:
        f();
        return;
    }

    private void c(HashMap hashmap)
    {
        String s1;
        s1 = (String)hashmap.get("ns_st_mp");
        if (s1 != null)
        {
            s = s1;
            hashmap.remove("ns_st_mp");
        }
        s1 = (String)hashmap.get("ns_st_mv");
        if (s1 != null)
        {
            t = s1;
            hashmap.remove("ns_st_mv");
        }
        s1 = (String)hashmap.get("ns_st_ec");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        g = Integer.parseInt(s1);
        hashmap.remove("ns_st_ec");
        return;
        hashmap;
    }

    private boolean c(State state)
    {
        return state != null && n() != state;
    }

    private void d()
    {
        i();
        if (w != null)
        {
            long l1;
            if (n >= 0L)
            {
                l1 = n;
                CSLog.d(this, (new StringBuilder()).append("Resuming heart beat timer. Next event in ").append(l1).append(" ms").toString());
            } else
            {
                l1 = a(h.getClip().f());
                CSLog.d(this, (new StringBuilder()).append("Starting heart beat timer. Next event in ").append(l1).append(" ms").toString());
            }
            if (l1 > 0L)
            {
                p = System.currentTimeMillis() + l1;
                m = new Timer();
                m.schedule(new b(this), l1);
            }
        }
    }

    private void d(State state)
    {
        f = state;
        d = System.currentTimeMillis();
    }

    private void d(HashMap hashmap)
    {
        u = g(null);
        u.putAll(hashmap);
    }

    private long e(HashMap hashmap)
    {
        if (hashmap.containsKey("ns_st_po"))
        {
            long l1;
            try
            {
                l1 = Long.valueOf((String)hashmap.get("ns_st_po")).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                return -1L;
            }
            return l1;
        } else
        {
            return -1L;
        }
    }

    private void e()
    {
        CSLog.d(this, "Pausing heartbeat timer.");
        i();
        n = p - System.currentTimeMillis();
        p = -1L;
    }

    private long f(HashMap hashmap)
    {
        if (hashmap.containsKey("ns_ts"))
        {
            long l1;
            try
            {
                l1 = Long.valueOf((String)hashmap.get("ns_ts")).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                return -1L;
            }
            return l1;
        } else
        {
            return -1L;
        }
    }

    private void f()
    {
        CSLog.d(this, "Resetting heartbeat timer.");
        n = -1L;
        p = -1L;
        o = 0;
    }

    private HashMap g(HashMap hashmap)
    {
        return a(f.toEventType(), hashmap);
    }

    private void g()
    {
        CSLog.d(this, "Starting keep alive timer");
        h();
        k = new Timer();
        k.scheduleAtFixedRate(new c(this), 0x124f80L, 0x124f80L);
    }

    public static String getVersion()
    {
        return "4.1401.31";
    }

    private void h()
    {
        CSLog.d(this, "stopKeepAliveTimer()");
        if (k != null)
        {
            k.cancel();
            k = null;
        }
    }

    private void i()
    {
        CSLog.d(this, "releaseHeartBeatTimer()");
        if (m != null)
        {
            m.cancel();
            m = null;
        }
    }

    private void j()
    {
        CSLog.d(this, "Firing paused on buffering event");
        if (r == State.PLAYING)
        {
            h.h();
            h.f();
            a(a(StreamSenseEventType.PAUSE, ((HashMap) (null))));
            g = g + 1;
            r = State.PAUSED;
        }
    }

    private void k()
    {
        CSLog.d(this, "stopPausedOnBufferingTimer()");
        if (i != null)
        {
            i.cancel();
            i = null;
        }
    }

    private void l()
    {
        CSLog.d(this, "stopDelayedTransitionTimer()");
        if (l != null)
        {
            l.cancel();
            l = null;
        }
    }

    private boolean m()
    {
        android.content.Context context = a.getAppContext();
        String s1 = a.getPublisherSecret();
        String s2 = a.getPixelURL();
        return context == null || s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0;
    }

    private State n()
    {
        return f;
    }

    private List o()
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        hashmap.put("playingtime", Long.valueOf(60000L));
        hashmap.put("interval", Long.valueOf(10000L));
        arraylist.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("playingtime", null);
        hashmap.put("interval", Long.valueOf(60000L));
        arraylist.add(hashmap);
        return arraylist;
    }

    protected void a()
    {
        CSLog.d(this, "Firing heart beat");
        o = o + 1;
        a(a(StreamSenseEventType.HEART_BEAT, ((HashMap) (null))));
        n = -1L;
        d();
    }

    protected void a(HashMap hashmap)
    {
        a(hashmap, true);
    }

    protected void a(HashMap hashmap, boolean flag)
    {
        CSLog.d(this, (new StringBuilder()).append("dispatch(").append(hashmap).append(", ").append(flag).append(")").toString());
        if (flag)
        {
            d(hashmap);
        }
        if (!m())
        {
            hashmap = ApplicationMeasurement.newApplicationMeasurement(a, EventType.HIDDEN, hashmap, c);
            a.getMeasurementDispatcher().sendMeasurmement(hashmap, true);
        }
    }

    public void addListener(StreamSenseListener streamsenselistener)
    {
        v.add(streamsenselistener);
    }

    protected void b()
    {
        CSLog.d(this, "Firing keep alive");
        a(a(StreamSenseEventType.KEEP_ALIVE, ((HashMap) (null))));
        g = g + 1;
    }

    public void engageTo(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        streamsensemediaplayer.setStreamSense(this);
    }

    public void engageTo(StreamSenseVideoView streamsensevideoview)
    {
        streamsensevideoview.setStreamSense(this);
    }

    public HashMap exportState()
    {
        return u;
    }

    public Clip getClip()
    {
        return h.getClip();
    }

    public String getLabel(String s1)
    {
        return (String)b.get(s1);
    }

    public HashMap getLabels()
    {
        return b;
    }

    public String getPixelURL()
    {
        return c;
    }

    public Playlist getPlaylist()
    {
        return h;
    }

    public void importState(HashMap hashmap)
    {
        reset();
        hashmap = new HashMap(hashmap);
        h.b(hashmap, null);
        h.getClip().b(hashmap, null);
        c(hashmap);
        g = g + 1;
    }

    public boolean isPauseOnBufferingEnabled()
    {
        return j;
    }

    public boolean isPausePlaySwitchDelayEnabled()
    {
        return q;
    }

    public void notify(StreamSenseEventType streamsenseeventtype, long l1)
    {
        notify(streamsenseeventtype, new HashMap(), l1);
    }

    public void notify(StreamSenseEventType streamsenseeventtype, HashMap hashmap, long l1)
    {
        CSLog.d(this, (new StringBuilder()).append("notify(").append(streamsenseeventtype).append(", ").append(hashmap).append(")").toString());
        State state = a(streamsenseeventtype);
        hashmap = new HashMap(hashmap);
        b(hashmap);
        if (!hashmap.containsKey("ns_st_po"))
        {
            hashmap.put("ns_st_po", String.valueOf(l1));
        }
        if (streamsenseeventtype == StreamSenseEventType.PLAY || streamsenseeventtype == StreamSenseEventType.PAUSE || streamsenseeventtype == StreamSenseEventType.BUFFER || streamsenseeventtype == StreamSenseEventType.END)
        {
            if (isPausePlaySwitchDelayEnabled() && c(state) && a(f) && a(state))
            {
                a(state, hashmap, 500L);
                return;
            } else
            {
                a(state, hashmap);
                return;
            }
        } else
        {
            streamsenseeventtype = a(streamsenseeventtype, hashmap);
            streamsenseeventtype.putAll(hashmap);
            a(streamsenseeventtype, false);
            g = g + 1;
            return;
        }
    }

    public void removeListener(StreamSenseListener streamsenselistener)
    {
        v.remove(streamsenselistener);
    }

    public void reset()
    {
        reset(null);
    }

    public void reset(Set set)
    {
        CSLog.d(this, "Reset()");
        h.reset(set);
        h.d(0);
        h.setPlaylistId((new StringBuilder()).append(System.currentTimeMillis()).append("_1").toString());
        h.getClip().reset(set);
        if (set != null && !set.isEmpty())
        {
            StreamSenseUtils.filterMap(b, set);
        } else
        {
            b.clear();
        }
        g = 1;
        o = 0;
        e();
        f();
        h();
        k();
        l();
        f = State.IDLE;
        d = -1L;
        r = null;
        s = "android_puppet";
        t = "4.1401.31";
        u = null;
    }

    public void setClip(HashMap hashmap)
    {
        setClip(hashmap, false);
    }

    public void setClip(HashMap hashmap, boolean flag)
    {
        if (f == State.IDLE)
        {
            h.getClip().reset();
            h.getClip().a(hashmap, null);
            if (flag)
            {
                h.b();
            }
        }
    }

    public void setHeartbeatIntervals(List list)
    {
        w = list;
    }

    public void setLabel(String s1, String s2)
    {
        if (s2 == null)
        {
            b.remove(s1);
            return;
        } else
        {
            b.put(s1, s2);
            return;
        }
    }

    public void setLabels(HashMap hashmap)
    {
label0:
        {
            if (hashmap != null)
            {
                if (b != null)
                {
                    break label0;
                }
                b = hashmap;
            }
            return;
        }
        b.putAll(hashmap);
    }

    public void setPauseOnBufferingEnabled(boolean flag)
    {
        j = flag;
    }

    public void setPausePlaySwitchDelayEnabled(boolean flag)
    {
        q = flag;
    }

    public String setPixelURL(String s1)
    {
        int j1;
        if (s1 == null || s1.length() == 0)
        {
            return null;
        }
        j1 = s1.indexOf('?');
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = s1;
        if (j1 < s1.length() - 1)
        {
            obj = s1.substring(j1 + 1).split("&");
            int k1 = obj.length;
            int i1 = 0;
            while (i1 < k1) 
            {
                String as[] = obj[i1].split("=");
                if (as.length == 2)
                {
                    setLabel(as[0], as[1]);
                } else
                if (as.length == 1)
                {
                    setLabel("name", as[0]);
                }
                i1++;
            }
            obj = s1.substring(0, j1 + 1);
        }
_L4:
        c = ((String) (obj));
        return c;
_L2:
        obj = (new StringBuilder()).append(s1).append('?').toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setPlaylist(HashMap hashmap)
    {
        if (f == State.IDLE)
        {
            h.i();
            h.reset();
            h.getClip().reset();
            h.a(hashmap, null);
        }
    }
}
