// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gh, gj, gs, go, 
//            gr

public class gp extends gh
{
    private class a
        implements Runnable
    {

        final gp CF;

        public void run()
        {
            boolean flag;
            flag = false;
            gp.a(CF, false);
            long l = SystemClock.elapsedRealtime();
            for (Iterator iterator = gp.a(CF).iterator(); iterator.hasNext(); ((gs)iterator.next()).d(l, 3)) { }
            Object obj = gs.CK;
            obj;
            JVM INSTR monitorenter ;
            for (Iterator iterator1 = gp.a(CF).iterator(); iterator1.hasNext();)
            {
                if (((gs)iterator1.next()).eq())
                {
                    flag = true;
                }
            }

            obj;
            JVM INSTR monitorexit ;
            gp.b(CF, flag);
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a()
        {
            CF = gp.this;
            super();
        }

    }


    private static final long Cm;
    private static final long Cn;
    private static final long Co;
    private static final long Cp;
    private static final String NAMESPACE = gj.al("com.google.cast.media");
    private final gs CA;
    private final gs CB;
    private final List CC;
    private final Runnable CD;
    private boolean CE;
    private long Cq;
    private MediaStatus Cr;
    private final gs Cs;
    private final gs Ct;
    private final gs Cu;
    private final gs Cv;
    private final gs Cw;
    private final gs Cx;
    private final gs Cy;
    private final gs Cz;
    private final Handler mHandler;

    public gp()
    {
        this(null);
    }

    public gp(String s)
    {
        super(NAMESPACE, "MediaControlChannel", s);
        mHandler = new Handler(Looper.getMainLooper());
        CD = new a();
        CC = new ArrayList();
        Cs = new gs(Cn);
        CC.add(Cs);
        Ct = new gs(Cm);
        CC.add(Ct);
        Cu = new gs(Cm);
        CC.add(Cu);
        Cv = new gs(Cm);
        CC.add(Cv);
        Cw = new gs(Co);
        CC.add(Cw);
        Cx = new gs(Cm);
        CC.add(Cx);
        Cy = new gs(Cm);
        CC.add(Cy);
        Cz = new gs(Cm);
        CC.add(Cz);
        CA = new gs(Cm);
        CC.add(CA);
        CB = new gs(Cm);
        CC.add(CB);
        eo();
    }

    static List a(gp gp1)
    {
        return gp1.CC;
    }

    private void a(long l, JSONObject jsonobject)
        throws JSONException
    {
        int i;
        int j;
label0:
        {
            j = 1;
            boolean flag1 = Cs.p(l);
            boolean flag;
            if (Cw.eq() && !Cw.p(l))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (Cx.eq())
            {
                flag = j;
                if (!Cx.p(l))
                {
                    break label0;
                }
            }
            if (Cy.eq() && !Cy.p(l))
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
        if (flag1 || Cr == null)
        {
            Cr = new MediaStatus(jsonobject);
            Cq = SystemClock.elapsedRealtime();
            i = 7;
        } else
        {
            i = Cr.a(jsonobject, j);
        }
        if ((i & 1) != 0)
        {
            Cq = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0)
        {
            Cq = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0)
        {
            onMetadataUpdated();
        }
        for (jsonobject = CC.iterator(); jsonobject.hasNext(); ((gs)jsonobject.next()).c(l, 0)) { }
    }

    static boolean a(gp gp1, boolean flag)
    {
        gp1.CE = flag;
        return flag;
    }

    static void b(gp gp1, boolean flag)
    {
        gp1.z(flag);
    }

    private void eo()
    {
        z(false);
        Cq = 0L;
        Cr = null;
        Cs.clear();
        Cw.clear();
        Cx.clear();
    }

    private void z(boolean flag)
    {
label0:
        {
            if (CE != flag)
            {
                CE = flag;
                if (!flag)
                {
                    break label0;
                }
                mHandler.postDelayed(CD, Cp);
            }
            return;
        }
        mHandler.removeCallbacks(CD);
    }

    public long a(gr gr)
        throws IOException
    {
        JSONObject jsonobject = new JSONObject();
        long l = dY();
        Cz.a(l, gr);
        z(true);
        try
        {
            jsonobject.put("requestId", l);
            jsonobject.put("type", "GET_STATUS");
            if (Cr != null)
            {
                jsonobject.put("mediaSessionId", Cr.dV());
            }
        }
        // Misplaced declaration of an exception variable
        catch (gr gr) { }
        a(jsonobject.toString(), l, null);
        return l;
    }

    public long a(gr gr, double d, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l;
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        }
        jsonobject1 = new JSONObject();
        l = dY();
        Cx.a(l, gr);
        z(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", dV());
        gr = new JSONObject();
        gr.put("level", d);
        jsonobject1.put("volume", gr);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (gr gr) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(gr gr, long l, int i, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = dY();
        Cw.a(l1, gr);
        z(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "SEEK");
        jsonobject1.put("mediaSessionId", dV());
        jsonobject1.put("currentTime", gj.o(l));
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
            catch (gr gr) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
_L2:
        if (i != 2) goto _L4; else goto _L3
_L3:
        jsonobject1.put("resumeState", "PLAYBACK_PAUSE");
          goto _L4
    }

    public long a(gr gr, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = dY();
        Cs.a(l1, gr);
        z(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "LOAD");
        jsonobject1.put("media", mediainfo.dU());
        jsonobject1.put("autoplay", flag);
        jsonobject1.put("currentTime", gj.o(l));
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (gr gr) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
    }

    public long a(gr gr, TextTrackStyle texttrackstyle)
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = dY();
        CB.a(l, gr);
        z(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        if (texttrackstyle == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        jsonobject.put("textTrackStyle", texttrackstyle.dU());
        jsonobject.put("mediaSessionId", dV());
_L2:
        a(jsonobject.toString(), l, null);
        return l;
        gr;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long a(gr gr, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dY();
        Ct.a(l, gr);
        z(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PAUSE");
        jsonobject1.put("mediaSessionId", dV());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (gr gr) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(gr gr, boolean flag, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dY();
        Cy.a(l, gr);
        z(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", dV());
        gr = new JSONObject();
        gr.put("muted", flag);
        jsonobject1.put("volume", gr);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (gr gr) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(gr gr, long al[])
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = dY();
        CA.a(l, gr);
        z(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        jsonobject.put("mediaSessionId", dV());
        gr = new JSONArray();
        int i = 0;
_L2:
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        gr.put(i, al[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("activeTrackIds", gr);
        }
        // Misplaced declaration of an exception variable
        catch (gr gr) { }
        a(jsonobject.toString(), l, null);
        return l;
    }

    public void a(long l, int i)
    {
        for (Iterator iterator = CC.iterator(); iterator.hasNext(); ((gs)iterator.next()).c(l, i)) { }
    }

    public final void ai(String s)
    {
        BA.b("message received: %s", new Object[] {
            s
        });
        Object obj;
        Object obj1;
        long l;
        obj = new JSONObject(s);
        obj1 = ((JSONObject) (obj)).getString("type");
        l = ((JSONObject) (obj)).optLong("requestId", -1L);
        if (!((String) (obj1)).equals("MEDIA_STATUS"))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj = ((JSONObject) (obj)).getJSONArray("status");
        if (((JSONArray) (obj)).length() > 0)
        {
            a(l, ((JSONArray) (obj)).getJSONObject(0));
            return;
        }
        try
        {
            Cr = null;
            onStatusUpdated();
            onMetadataUpdated();
            Cz.c(l, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            BA.d("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s
            });
        }
        return;
        if (((String) (obj1)).equals("INVALID_PLAYER_STATE"))
        {
            BA.d("received unexpected error: Invalid Player State.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (obj1 = CC.iterator(); ((Iterator) (obj1)).hasNext(); ((gs)((Iterator) (obj1)).next()).b(l, 1, ((JSONObject) (obj)))) { }
            break MISSING_BLOCK_LABEL_338;
        }
        if (((String) (obj1)).equals("LOAD_FAILED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            Cs.b(l, 1, ((JSONObject) (obj)));
            return;
        }
        if (((String) (obj1)).equals("LOAD_CANCELLED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            Cs.b(l, 2, ((JSONObject) (obj)));
            return;
        }
        if (((String) (obj1)).equals("INVALID_REQUEST"))
        {
            BA.d("received unexpected error: Invalid Request.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (Iterator iterator = CC.iterator(); iterator.hasNext(); ((gs)iterator.next()).b(l, 1, ((JSONObject) (obj)))) { }
        }
    }

    public long b(gr gr, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dY();
        Cv.a(l, gr);
        z(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "STOP");
        jsonobject1.put("mediaSessionId", dV());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (gr gr) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long c(gr gr, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = dY();
        Cu.a(l, gr);
        z(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PLAY");
        jsonobject1.put("mediaSessionId", dV());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (gr gr) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long dV()
        throws IllegalStateException
    {
        if (Cr == null)
        {
            throw new IllegalStateException("No current media session");
        } else
        {
            return Cr.dV();
        }
    }

    public void dZ()
    {
        eo();
    }

    public long getApproximateStreamPosition()
    {
        long l;
        long l1;
        MediaInfo mediainfo;
        for (mediainfo = getMediaInfo(); mediainfo == null || Cq == 0L;)
        {
            return 0L;
        }

        double d = Cr.getPlaybackRate();
        long l2 = Cr.getStreamPosition();
        int i = Cr.getPlayerState();
        if (d == 0.0D || i != 2)
        {
            return l2;
        }
        l = SystemClock.elapsedRealtime() - Cq;
        if (l < 0L)
        {
            l = 0L;
        }
        if (l == 0L)
        {
            return l2;
        }
        l1 = mediainfo.getStreamDuration();
        l = l2 + (long)((double)l * d);
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
        if (Cr == null)
        {
            return null;
        } else
        {
            return Cr.getMediaInfo();
        }
    }

    public MediaStatus getMediaStatus()
    {
        return Cr;
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
        Cm = TimeUnit.HOURS.toMillis(24L);
        Cn = TimeUnit.HOURS.toMillis(24L);
        Co = TimeUnit.HOURS.toMillis(24L);
        Cp = TimeUnit.SECONDS.toMillis(1L);
    }
}
