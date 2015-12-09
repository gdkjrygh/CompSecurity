// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            em, eo, ev, er, 
//            eu

public class es extends em
{
    private class a
        implements Runnable
    {

        final es zW;

        public void run()
        {
            boolean flag;
            flag = false;
            es.a(zW, false);
            long l = SystemClock.elapsedRealtime();
            es.a(zW).d(l, 3);
            es.b(zW).d(l, 3);
            es.c(zW).d(l, 3);
            es.d(zW).d(l, 3);
            es.e(zW).d(l, 3);
            es.f(zW).d(l, 3);
            es.g(zW).d(l, 3);
            es.h(zW).d(l, 3);
            Object obj = ev.Ab;
            obj;
            JVM INSTR monitorenter ;
            Exception exception;
            if (es.a(zW).dU() || es.e(zW).dU() || es.f(zW).dU() || es.g(zW).dU() || es.h(zW).dU())
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            es.b(zW, flag);
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a()
        {
            zW = es.this;
            super();
        }

    }


    private static final String NAMESPACE = eo.X("com.google.cast.media");
    private static final long zG;
    private static final long zH;
    private static final long zI;
    private static final long zJ;
    private final Handler mHandler;
    private long zK;
    private MediaStatus zL;
    private final ev zM;
    private final ev zN;
    private final ev zO;
    private final ev zP;
    private final ev zQ;
    private final ev zR;
    private final ev zS;
    private final ev zT;
    private final Runnable zU;
    private boolean zV;

    public es()
    {
        this(null);
    }

    public es(String s)
    {
        super(NAMESPACE, "MediaControlChannel", s);
        mHandler = new Handler(Looper.getMainLooper());
        zU = new a();
        zM = new ev(zH);
        zN = new ev(zG);
        zO = new ev(zG);
        zP = new ev(zG);
        zQ = new ev(zI);
        zR = new ev(zG);
        zS = new ev(zG);
        zT = new ev(zG);
        dS();
    }

    static ev a(es es1)
    {
        return es1.zM;
    }

    private void a(long l, JSONObject jsonobject)
        throws JSONException
    {
        int i;
        int j;
label0:
        {
            j = 1;
            boolean flag1 = zM.n(l);
            boolean flag;
            if (zQ.dU() && !zQ.n(l))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (zR.dU())
            {
                flag = j;
                if (!zR.n(l))
                {
                    break label0;
                }
            }
            if (zS.dU() && !zS.n(l))
            {
                flag = j;
            } else
            {
                flag = false;
            }
        }
        if (i != 0)
        {
            i = 2;
        } else
        {
            i = 0;
        }
        j = i;
        if (flag)
        {
            j = i | 1;
        }
        if (flag1 || zL == null)
        {
            zL = new MediaStatus(jsonobject);
            zK = SystemClock.elapsedRealtime();
            i = 7;
        } else
        {
            i = zL.a(jsonobject, j);
        }
        if ((i & 1) != 0)
        {
            zK = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0)
        {
            zK = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0)
        {
            onMetadataUpdated();
        }
        zM.c(l, 0);
        zN.c(l, 0);
        zO.c(l, 0);
        zP.c(l, 0);
        zQ.c(l, 0);
        zR.c(l, 0);
        zS.c(l, 0);
        zT.c(l, 0);
    }

    static boolean a(es es1, boolean flag)
    {
        es1.zV = flag;
        return flag;
    }

    static ev b(es es1)
    {
        return es1.zN;
    }

    static void b(es es1, boolean flag)
    {
        es1.w(flag);
    }

    static ev c(es es1)
    {
        return es1.zO;
    }

    static ev d(es es1)
    {
        return es1.zP;
    }

    private void dS()
    {
        w(false);
        zK = 0L;
        zL = null;
        zM.clear();
        zQ.clear();
        zR.clear();
    }

    static ev e(es es1)
    {
        return es1.zQ;
    }

    static ev f(es es1)
    {
        return es1.zR;
    }

    static ev g(es es1)
    {
        return es1.zS;
    }

    static ev h(es es1)
    {
        return es1.zT;
    }

    private void w(boolean flag)
    {
label0:
        {
            if (zV != flag)
            {
                zV = flag;
                if (!flag)
                {
                    break label0;
                }
                mHandler.postDelayed(zU, zJ);
            }
            return;
        }
        mHandler.removeCallbacks(zU);
    }

    public final void U(String s)
    {
        yY.b("message received: %s", new Object[] {
            s
        });
        Object obj;
        String s1;
        long l;
        obj = new JSONObject(s);
        s1 = ((JSONObject) (obj)).getString("type");
        l = ((JSONObject) (obj)).optLong("requestId", -1L);
        if (!s1.equals("MEDIA_STATUS"))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        obj = ((JSONObject) (obj)).getJSONArray("status");
        if (((JSONArray) (obj)).length() > 0)
        {
            a(l, ((JSONArray) (obj)).getJSONObject(0));
            return;
        }
        try
        {
            zL = null;
            onStatusUpdated();
            onMetadataUpdated();
            zT.c(l, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            yY.d("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s
            });
        }
        return;
        if (s1.equals("INVALID_PLAYER_STATE"))
        {
            yY.d("received unexpected error: Invalid Player State.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            zM.b(l, 1, ((JSONObject) (obj)));
            zN.b(l, 1, ((JSONObject) (obj)));
            zO.b(l, 1, ((JSONObject) (obj)));
            zP.b(l, 1, ((JSONObject) (obj)));
            zQ.b(l, 1, ((JSONObject) (obj)));
            zR.b(l, 1, ((JSONObject) (obj)));
            zS.b(l, 1, ((JSONObject) (obj)));
            zT.b(l, 1, ((JSONObject) (obj)));
            return;
        }
        if (s1.equals("LOAD_FAILED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            zM.b(l, 1, ((JSONObject) (obj)));
            return;
        }
        if (s1.equals("LOAD_CANCELLED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            zM.b(l, 2, ((JSONObject) (obj)));
            return;
        }
        if (s1.equals("INVALID_REQUEST"))
        {
            yY.d("received unexpected error: Invalid Request.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            zM.b(l, 1, ((JSONObject) (obj)));
            zN.b(l, 1, ((JSONObject) (obj)));
            zO.b(l, 1, ((JSONObject) (obj)));
            zP.b(l, 1, ((JSONObject) (obj)));
            zQ.b(l, 1, ((JSONObject) (obj)));
            zR.b(l, 1, ((JSONObject) (obj)));
            zS.b(l, 1, ((JSONObject) (obj)));
            zT.b(l, 1, ((JSONObject) (obj)));
        }
        return;
    }

    public long a(eu eu)
        throws IOException
    {
        JSONObject jsonobject = new JSONObject();
        long l = dE();
        zT.a(l, eu);
        w(true);
        try
        {
            jsonobject.put("requestId", l);
            jsonobject.put("type", "GET_STATUS");
            if (zL != null)
            {
                jsonobject.put("mediaSessionId", zL.dC());
            }
        }
        // Misplaced declaration of an exception variable
        catch (eu eu) { }
        a(jsonobject.toString(), l, null);
        return l;
    }

    public long a(eu eu, double d1, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l;
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        }
        jsonobject1 = new JSONObject();
        l = dE();
        zR.a(l, eu);
        w(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", dC());
        eu = new JSONObject();
        eu.put("level", d1);
        jsonobject1.put("volume", eu);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (eu eu) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(eu eu, long l, int i, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = dE();
        zQ.a(l1, eu);
        w(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "SEEK");
        jsonobject1.put("mediaSessionId", dC());
        jsonobject1.put("currentTime", eo.m(l));
        if (i != 1) goto _L2; else goto _L1
_L1:
        jsonobject1.put("resumeState", "PLAYBACK_START");
_L4:
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (eu eu) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
_L2:
        if (i != 2) goto _L4; else goto _L3
_L3:
        jsonobject1.put("resumeState", "PLAYBACK_PAUSE");
          goto _L4
    }

    public long a(eu eu, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = dE();
        zM.a(l1, eu);
        w(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "LOAD");
        jsonobject1.put("media", mediainfo.dB());
        jsonobject1.put("autoplay", flag);
        jsonobject1.put("currentTime", eo.m(l));
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (eu eu) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
    }

    public long a(eu eu, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dE();
        zN.a(l, eu);
        w(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PAUSE");
        jsonobject1.put("mediaSessionId", dC());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (eu eu) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(eu eu, boolean flag, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dE();
        zS.a(l, eu);
        w(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", dC());
        eu = new JSONObject();
        eu.put("muted", flag);
        jsonobject1.put("volume", eu);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (eu eu) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public void a(long l, int i)
    {
        zM.c(l, i);
        zN.c(l, i);
        zO.c(l, i);
        zP.c(l, i);
        zQ.c(l, i);
        zR.c(l, i);
        zS.c(l, i);
        zT.c(l, i);
    }

    public long b(eu eu, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dE();
        zP.a(l, eu);
        w(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "STOP");
        jsonobject1.put("mediaSessionId", dC());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (eu eu) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long c(eu eu, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dE();
        zO.a(l, eu);
        w(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PLAY");
        jsonobject1.put("mediaSessionId", dC());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (eu eu) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long dC()
        throws IllegalStateException
    {
        if (zL == null)
        {
            throw new IllegalStateException("No current media session");
        } else
        {
            return zL.dC();
        }
    }

    public void dF()
    {
        dS();
    }

    public long getApproximateStreamPosition()
    {
        long l;
        long l1;
        MediaInfo mediainfo;
        for (mediainfo = getMediaInfo(); mediainfo == null || zK == 0L;)
        {
            return 0L;
        }

        double d1 = zL.getPlaybackRate();
        long l2 = zL.getStreamPosition();
        int i = zL.getPlayerState();
        if (d1 == 0.0D || i != 2)
        {
            return l2;
        }
        l = SystemClock.elapsedRealtime() - zK;
        if (l < 0L)
        {
            l = 0L;
        }
        if (l == 0L)
        {
            return l2;
        }
        l1 = mediainfo.getStreamDuration();
        l = l2 + (long)((double)l * d1);
        if (l <= l1) goto _L2; else goto _L1
_L1:
        l = l1;
_L4:
        return l;
_L2:
        if (l < 0L)
        {
            l = 0L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public MediaInfo getMediaInfo()
    {
        if (zL == null)
        {
            return null;
        } else
        {
            return zL.getMediaInfo();
        }
    }

    public MediaStatus getMediaStatus()
    {
        return zL;
    }

    public long getStreamDuration()
    {
        MediaInfo mediainfo = getMediaInfo();
        if (mediainfo != null)
        {
            return mediainfo.getStreamDuration();
        } else
        {
            return 0L;
        }
    }

    protected void onMetadataUpdated()
    {
    }

    protected void onStatusUpdated()
    {
    }

    static 
    {
        zG = TimeUnit.HOURS.toMillis(24L);
        zH = TimeUnit.HOURS.toMillis(24L);
        zI = TimeUnit.HOURS.toMillis(24L);
        zJ = TimeUnit.SECONDS.toMillis(1L);
    }
}
