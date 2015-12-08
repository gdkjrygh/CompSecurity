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
//            il, in, iw, is, 
//            iv

public class it extends il
{
    private class a
        implements Runnable
    {

        final it Ik;

        public void run()
        {
            boolean flag;
            flag = false;
            it.a(Ik, false);
            long l = SystemClock.elapsedRealtime();
            for (Iterator iterator = it.a(Ik).iterator(); iterator.hasNext(); ((iw)iterator.next()).e(l, 2102)) { }
            Object obj = iw.Ip;
            obj;
            JVM INSTR monitorenter ;
            for (Iterator iterator1 = it.a(Ik).iterator(); iterator1.hasNext();)
            {
                if (((iw)iterator1.next()).gr())
                {
                    flag = true;
                }
            }

            obj;
            JVM INSTR monitorexit ;
            it.b(Ik, flag);
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a()
        {
            Ik = it.this;
            super();
        }

    }


    private static final long HR;
    private static final long HS;
    private static final long HT;
    private static final long HU;
    private static final String NAMESPACE = in.aG("com.google.cast.media");
    private long HV;
    private MediaStatus HW;
    private final iw HX;
    private final iw HY;
    private final iw HZ;
    private final iw Ia;
    private final iw Ib;
    private final iw Ic;
    private final iw Id;
    private final iw Ie;
    private final iw If;
    private final iw Ig;
    private final List Ih;
    private final Runnable Ii;
    private boolean Ij;
    private final Handler mHandler;

    public it()
    {
        this(null);
    }

    public it(String s)
    {
        super(NAMESPACE, "MediaControlChannel", s);
        mHandler = new Handler(Looper.getMainLooper());
        Ii = new a();
        Ih = new ArrayList();
        HX = new iw(HS);
        Ih.add(HX);
        HY = new iw(HR);
        Ih.add(HY);
        HZ = new iw(HR);
        Ih.add(HZ);
        Ia = new iw(HR);
        Ih.add(Ia);
        Ib = new iw(HT);
        Ih.add(Ib);
        Ic = new iw(HR);
        Ih.add(Ic);
        Id = new iw(HR);
        Ih.add(Id);
        Ie = new iw(HR);
        Ih.add(Ie);
        If = new iw(HR);
        Ih.add(If);
        Ig = new iw(HR);
        Ih.add(Ig);
        gp();
    }

    private void J(boolean flag)
    {
label0:
        {
            if (Ij != flag)
            {
                Ij = flag;
                if (!flag)
                {
                    break label0;
                }
                mHandler.postDelayed(Ii, HU);
            }
            return;
        }
        mHandler.removeCallbacks(Ii);
    }

    static List a(it it1)
    {
        return it1.Ih;
    }

    private void a(long l, JSONObject jsonobject)
        throws JSONException
    {
        int i;
        int j;
label0:
        {
            j = 1;
            boolean flag1 = HX.p(l);
            boolean flag;
            if (Ib.gr() && !Ib.p(l))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (Ic.gr())
            {
                flag = j;
                if (!Ic.p(l))
                {
                    break label0;
                }
            }
            if (Id.gr() && !Id.p(l))
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
        if (flag1 || HW == null)
        {
            HW = new MediaStatus(jsonobject);
            HV = SystemClock.elapsedRealtime();
            i = 7;
        } else
        {
            i = HW.a(jsonobject, j);
        }
        if ((i & 1) != 0)
        {
            HV = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0)
        {
            HV = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0)
        {
            onMetadataUpdated();
        }
        for (jsonobject = Ih.iterator(); jsonobject.hasNext(); ((iw)jsonobject.next()).d(l, 0)) { }
    }

    static boolean a(it it1, boolean flag)
    {
        it1.Ij = flag;
        return flag;
    }

    static void b(it it1, boolean flag)
    {
        it1.J(flag);
    }

    private void gp()
    {
        J(false);
        HV = 0L;
        HW = null;
        HX.clear();
        Ib.clear();
        Ic.clear();
    }

    public long a(iv iv)
        throws IOException
    {
        JSONObject jsonobject = new JSONObject();
        long l = fU();
        Ie.a(l, iv);
        J(true);
        try
        {
            jsonobject.put("requestId", l);
            jsonobject.put("type", "GET_STATUS");
            if (HW != null)
            {
                jsonobject.put("mediaSessionId", HW.fR());
            }
        }
        // Misplaced declaration of an exception variable
        catch (iv iv) { }
        a(jsonobject.toString(), l, null);
        return l;
    }

    public long a(iv iv, double d, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l;
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        }
        jsonobject1 = new JSONObject();
        l = fU();
        Ic.a(l, iv);
        J(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", fR());
        iv = new JSONObject();
        iv.put("level", d);
        jsonobject1.put("volume", iv);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (iv iv) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(iv iv, long l, int i, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = fU();
        Ib.a(l1, iv);
        J(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "SEEK");
        jsonobject1.put("mediaSessionId", fR());
        jsonobject1.put("currentTime", in.o(l));
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
            catch (iv iv) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
_L2:
        if (i != 2) goto _L4; else goto _L3
_L3:
        jsonobject1.put("resumeState", "PLAYBACK_PAUSE");
          goto _L4
    }

    public long a(iv iv, MediaInfo mediainfo, boolean flag, long l, long al[], JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = fU();
        HX.a(l1, iv);
        J(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "LOAD");
        jsonobject1.put("media", mediainfo.toJson());
        jsonobject1.put("autoplay", flag);
        jsonobject1.put("currentTime", in.o(l));
        if (al == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (al.length <= 0)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        iv = new JSONArray();
        int i = 0;
_L2:
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        iv.put(i, al[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("activeTrackIds", iv);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (iv iv) { }
        }
        a(jsonobject1.toString(), l1, null);
        return l1;
    }

    public long a(iv iv, TextTrackStyle texttrackstyle)
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = fU();
        Ig.a(l, iv);
        J(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        if (texttrackstyle == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        jsonobject.put("textTrackStyle", texttrackstyle.toJson());
        jsonobject.put("mediaSessionId", fR());
_L2:
        a(jsonobject.toString(), l, null);
        return l;
        iv;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long a(iv iv, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fU();
        HY.a(l, iv);
        J(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PAUSE");
        jsonobject1.put("mediaSessionId", fR());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (iv iv) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(iv iv, boolean flag, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fU();
        Id.a(l, iv);
        J(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", fR());
        iv = new JSONObject();
        iv.put("muted", flag);
        jsonobject1.put("volume", iv);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (iv iv) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long a(iv iv, long al[])
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = fU();
        If.a(l, iv);
        J(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        jsonobject.put("mediaSessionId", fR());
        iv = new JSONArray();
        int i = 0;
_L2:
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        iv.put(i, al[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("activeTrackIds", iv);
        }
        // Misplaced declaration of an exception variable
        catch (iv iv) { }
        a(jsonobject.toString(), l, null);
        return l;
    }

    public final void aD(String s)
    {
        He.b("message received: %s", new Object[] {
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
            HW = null;
            onStatusUpdated();
            onMetadataUpdated();
            Ie.d(l, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            He.d("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s
            });
        }
        return;
        if (((String) (obj1)).equals("INVALID_PLAYER_STATE"))
        {
            He.d("received unexpected error: Invalid Player State.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (obj1 = Ih.iterator(); ((Iterator) (obj1)).hasNext(); ((iw)((Iterator) (obj1)).next()).b(l, 2100, ((JSONObject) (obj)))) { }
            break MISSING_BLOCK_LABEL_346;
        }
        if (((String) (obj1)).equals("LOAD_FAILED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            HX.b(l, 2100, ((JSONObject) (obj)));
            return;
        }
        if (((String) (obj1)).equals("LOAD_CANCELLED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            HX.b(l, 2101, ((JSONObject) (obj)));
            return;
        }
        if (((String) (obj1)).equals("INVALID_REQUEST"))
        {
            He.d("received unexpected error: Invalid Request.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (Iterator iterator = Ih.iterator(); iterator.hasNext(); ((iw)iterator.next()).b(l, 2100, ((JSONObject) (obj)))) { }
        }
    }

    public long b(iv iv, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fU();
        Ia.a(l, iv);
        J(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "STOP");
        jsonobject1.put("mediaSessionId", fR());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (iv iv) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public void b(long l, int i)
    {
        for (Iterator iterator = Ih.iterator(); iterator.hasNext(); ((iw)iterator.next()).d(l, i)) { }
    }

    public long c(iv iv, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = fU();
        HZ.a(l, iv);
        J(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PLAY");
        jsonobject1.put("mediaSessionId", fR());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (iv iv) { }
        }
        a(jsonobject1.toString(), l, null);
        return l;
    }

    public long fR()
        throws IllegalStateException
    {
        if (HW == null)
        {
            throw new IllegalStateException("No current media session");
        } else
        {
            return HW.fR();
        }
    }

    public void fV()
    {
        gp();
    }

    public long getApproximateStreamPosition()
    {
        long l;
        long l1;
        MediaInfo mediainfo;
        for (mediainfo = getMediaInfo(); mediainfo == null || HV == 0L;)
        {
            return 0L;
        }

        double d = HW.getPlaybackRate();
        long l2 = HW.getStreamPosition();
        int i = HW.getPlayerState();
        if (d == 0.0D || i != 2)
        {
            return l2;
        }
        l = SystemClock.elapsedRealtime() - HV;
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
        if (HW == null)
        {
            return null;
        } else
        {
            return HW.getMediaInfo();
        }
    }

    public MediaStatus getMediaStatus()
    {
        return HW;
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
        HR = TimeUnit.HOURS.toMillis(24L);
        HS = TimeUnit.HOURS.toMillis(24L);
        HT = TimeUnit.HOURS.toMillis(24L);
        HU = TimeUnit.SECONDS.toMillis(1L);
    }
}
