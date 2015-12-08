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
//            ii, ik, it, ip, 
//            is

public class iq extends ii
{
    private class a
        implements Runnable
    {

        final iq Hu;

        public void run()
        {
            boolean flag;
            flag = false;
            iq.a(Hu, false);
            long l = SystemClock.elapsedRealtime();
            for (Iterator iterator = iq.a(Hu).iterator(); iterator.hasNext(); ((it)iterator.next()).e(l, 2102)) { }
            Object obj = it.Hz;
            obj;
            JVM INSTR monitorenter ;
            for (Iterator iterator1 = iq.a(Hu).iterator(); iterator1.hasNext();)
            {
                if (((it)iterator1.next()).fV())
                {
                    flag = true;
                }
            }

            obj;
            JVM INSTR monitorexit ;
            iq.b(Hu, flag);
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a()
        {
            Hu = iq.this;
            super();
        }

    }


    private static final long Hb;
    private static final long Hc;
    private static final long Hd;
    private static final long He;
    private static final String NAMESPACE = ik.aG("com.google.cast.media");
    private long Hf;
    private MediaStatus Hg;
    private final it Hh;
    private final it Hi;
    private final it Hj;
    private final it Hk;
    private final it Hl;
    private final it Hm;
    private final it Hn;
    private final it Ho;
    private final it Hp;
    private final it Hq;
    private final List Hr;
    private final Runnable Hs;
    private boolean Ht;
    private final Handler mHandler;

    public iq()
    {
        this(null);
    }

    public iq(String s)
    {
        super(NAMESPACE, "MediaControlChannel", s);
        mHandler = new Handler(Looper.getMainLooper());
        Hs = new a();
        Hr = new ArrayList();
        Hh = new it(Hc);
        Hr.add(Hh);
        Hi = new it(Hb);
        Hr.add(Hi);
        Hj = new it(Hb);
        Hr.add(Hj);
        Hk = new it(Hb);
        Hr.add(Hk);
        Hl = new it(Hd);
        Hr.add(Hl);
        Hm = new it(Hb);
        Hr.add(Hm);
        Hn = new it(Hb);
        Hr.add(Hn);
        Ho = new it(Hb);
        Hr.add(Ho);
        Hp = new it(Hb);
        Hr.add(Hp);
        Hq = new it(Hb);
        Hr.add(Hq);
        fT();
    }

    private void H(boolean flag)
    {
label0:
        {
            if (Ht != flag)
            {
                Ht = flag;
                if (!flag)
                {
                    break label0;
                }
                mHandler.postDelayed(Hs, He);
            }
            return;
        }
        mHandler.removeCallbacks(Hs);
    }

    static List a(iq iq1)
    {
        return iq1.Hr;
    }

    private void a(long l, JSONObject jsonobject)
        throws JSONException
    {
        int i;
        int j;
label0:
        {
            j = 1;
            boolean flag1 = Hh.p(l);
            boolean flag;
            if (Hl.fV() && !Hl.p(l))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (Hm.fV())
            {
                flag = j;
                if (!Hm.p(l))
                {
                    break label0;
                }
            }
            if (Hn.fV() && !Hn.p(l))
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
        if (flag1 || Hg == null)
        {
            Hg = new MediaStatus(jsonobject);
            Hf = SystemClock.elapsedRealtime();
            i = 7;
        } else
        {
            i = Hg.a(jsonobject, j);
        }
        if ((i & 1) != 0)
        {
            Hf = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0)
        {
            Hf = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0)
        {
            onMetadataUpdated();
        }
        for (jsonobject = Hr.iterator(); jsonobject.hasNext(); ((it)jsonobject.next()).d(l, 0)) { }
    }

    static boolean a(iq iq1, boolean flag)
    {
        iq1.Ht = flag;
        return flag;
    }

    static void b(iq iq1, boolean flag)
    {
        iq1.H(flag);
    }

    private void fT()
    {
        H(false);
        Hf = 0L;
        Hg = null;
        Hh.clear();
        Hl.clear();
        Hm.clear();
    }

    public long a(is is)
        throws IOException
    {
        JSONObject jsonobject = new JSONObject();
        long l = fz();
        Ho.a(l, is);
        H(true);
        try
        {
            jsonobject.put("requestId", l);
            jsonobject.put("type", "GET_STATUS");
            if (Hg != null)
            {
                jsonobject.put("mediaSessionId", Hg.fw());
            }
        }
        // Misplaced declaration of an exception variable
        catch (is is) { }
        a(jsonobject.toString(), l, null);
        return l;
    }

    public long a(is is, double d, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l;
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        }
        jsonobject1 = new JSONObject();
        l = fz();
        Hm.a(l, is);
        H(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", fw());
        is = new JSONObject();
        is.put("level", d);
        jsonobject1.put("volume", is);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (is is) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(is is, long l, int i, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = fz();
        Hl.a(l1, is);
        H(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "SEEK");
        jsonobject1.put("mediaSessionId", fw());
        jsonobject1.put("currentTime", ik.o(l));
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
            catch (is is) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
_L2:
        if (i != 2) goto _L4; else goto _L3
_L3:
        jsonobject1.put("resumeState", "PLAYBACK_PAUSE");
          goto _L4
    }

    public long a(is is, MediaInfo mediainfo, boolean flag, long l, long al[], JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = fz();
        Hh.a(l1, is);
        H(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "LOAD");
        jsonobject1.put("media", mediainfo.bK());
        jsonobject1.put("autoplay", flag);
        jsonobject1.put("currentTime", ik.o(l));
        if (al == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (al.length <= 0)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        is = new JSONArray();
        int i = 0;
_L2:
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        is.put(i, al[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("activeTrackIds", is);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (is is) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
    }

    public long a(is is, TextTrackStyle texttrackstyle)
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = fz();
        Hq.a(l, is);
        H(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        if (texttrackstyle == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        jsonobject.put("textTrackStyle", texttrackstyle.bK());
        jsonobject.put("mediaSessionId", fw());
_L2:
        a(jsonobject.toString(), l, null);
        return l;
        is;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long a(is is, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fz();
        Hi.a(l, is);
        H(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PAUSE");
        jsonobject1.put("mediaSessionId", fw());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (is is) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(is is, boolean flag, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fz();
        Hn.a(l, is);
        H(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", fw());
        is = new JSONObject();
        is.put("muted", flag);
        jsonobject1.put("volume", is);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (is is) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(is is, long al[])
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = fz();
        Hp.a(l, is);
        H(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        jsonobject.put("mediaSessionId", fw());
        is = new JSONArray();
        int i = 0;
_L2:
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        is.put(i, al[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("activeTrackIds", is);
        }
        // Misplaced declaration of an exception variable
        catch (is is) { }
        a(jsonobject.toString(), l, null);
        return l;
    }

    public final void aD(String s)
    {
        Go.b("message received: %s", new Object[] {
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
            Hg = null;
            onStatusUpdated();
            onMetadataUpdated();
            Ho.d(l, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Go.d("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s
            });
        }
        return;
        if (((String) (obj1)).equals("INVALID_PLAYER_STATE"))
        {
            Go.d("received unexpected error: Invalid Player State.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (obj1 = Hr.iterator(); ((Iterator) (obj1)).hasNext(); ((it)((Iterator) (obj1)).next()).b(l, 2100, ((JSONObject) (obj)))) { }
            break MISSING_BLOCK_LABEL_346;
        }
        if (((String) (obj1)).equals("LOAD_FAILED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            Hh.b(l, 2100, ((JSONObject) (obj)));
            return;
        }
        if (((String) (obj1)).equals("LOAD_CANCELLED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            Hh.b(l, 2101, ((JSONObject) (obj)));
            return;
        }
        if (((String) (obj1)).equals("INVALID_REQUEST"))
        {
            Go.d("received unexpected error: Invalid Request.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (Iterator iterator = Hr.iterator(); iterator.hasNext(); ((it)iterator.next()).b(l, 2100, ((JSONObject) (obj)))) { }
        }
    }

    public long b(is is, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fz();
        Hk.a(l, is);
        H(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "STOP");
        jsonobject1.put("mediaSessionId", fw());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (is is) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public void b(long l, int i)
    {
        for (Iterator iterator = Hr.iterator(); iterator.hasNext(); ((it)iterator.next()).d(l, i)) { }
    }

    public long c(is is, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fz();
        Hj.a(l, is);
        H(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PLAY");
        jsonobject1.put("mediaSessionId", fw());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (is is) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public void fA()
    {
        fT();
    }

    public long fw()
        throws IllegalStateException
    {
        if (Hg == null)
        {
            throw new IllegalStateException("No current media session");
        } else
        {
            return Hg.fw();
        }
    }

    public long getApproximateStreamPosition()
    {
        long l;
        long l1;
        MediaInfo mediainfo;
        for (mediainfo = getMediaInfo(); mediainfo == null || Hf == 0L;)
        {
            return 0L;
        }

        double d = Hg.getPlaybackRate();
        long l2 = Hg.getStreamPosition();
        int i = Hg.getPlayerState();
        if (d == 0.0D || i != 2)
        {
            return l2;
        }
        l = SystemClock.elapsedRealtime() - Hf;
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
        if (l1 <= 0L || l <= l1) goto _L2; else goto _L1
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
        if (Hg == null)
        {
            return null;
        } else
        {
            return Hg.getMediaInfo();
        }
    }

    public MediaStatus getMediaStatus()
    {
        return Hg;
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
        Hb = TimeUnit.HOURS.toMillis(24L);
        Hc = TimeUnit.HOURS.toMillis(24L);
        Hd = TimeUnit.HOURS.toMillis(24L);
        He = TimeUnit.SECONDS.toMillis(1L);
    }
}
