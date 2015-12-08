// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzc, zzf, zzp, zzl, 
//            zzo

public class zzm extends zzc
{

    private static final String NAMESPACE = zzf.zzbp("com.google.cast.media");
    private long zzOm;
    private MediaStatus zzOn;
    private final List zzOo = new ArrayList();
    private final zzp zzOp = new zzp(0x5265c00L);
    private final zzp zzOq = new zzp(0x5265c00L);
    private final zzp zzOr = new zzp(0x5265c00L);
    private final zzp zzOs = new zzp(0x5265c00L);
    private final zzp zzOt = new zzp(0x5265c00L);
    private final zzp zzOu = new zzp(0x5265c00L);
    private final zzp zzOv = new zzp(0x5265c00L);
    private final zzp zzOw = new zzp(0x5265c00L);
    private final zzp zzOx = new zzp(0x5265c00L);
    private final zzp zzOy = new zzp(0x5265c00L);

    public zzm(String s)
    {
        super(NAMESPACE, "MediaControlChannel", s, 1000L);
        zzOo.add(zzOp);
        zzOo.add(zzOq);
        zzOo.add(zzOr);
        zzOo.add(zzOs);
        zzOo.add(zzOt);
        zzOo.add(zzOu);
        zzOo.add(zzOv);
        zzOo.add(zzOw);
        zzOo.add(zzOx);
        zzOo.add(zzOy);
        zzkr();
    }

    private void zza(long l, JSONObject jsonobject)
        throws JSONException
    {
        int i;
        int j;
label0:
        {
            j = 1;
            boolean flag1 = zzOp.zzz(l);
            boolean flag;
            if (zzOt.zzkt() && !zzOt.zzz(l))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (zzOu.zzkt())
            {
                flag = j;
                if (!zzOu.zzz(l))
                {
                    break label0;
                }
            }
            if (zzOv.zzkt() && !zzOv.zzz(l))
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
        if (flag1 || zzOn == null)
        {
            zzOn = new MediaStatus(jsonobject);
            zzOm = SystemClock.elapsedRealtime();
            i = 7;
        } else
        {
            i = zzOn.zza(jsonobject, j);
        }
        if ((i & 1) != 0)
        {
            zzOm = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 2) != 0)
        {
            zzOm = SystemClock.elapsedRealtime();
            onStatusUpdated();
        }
        if ((i & 4) != 0)
        {
            onMetadataUpdated();
        }
        for (jsonobject = zzOo.iterator(); jsonobject.hasNext(); ((zzp)jsonobject.next()).zzc(l, 0)) { }
    }

    private void zzkr()
    {
        zzOm = 0L;
        zzOn = null;
        for (Iterator iterator = zzOo.iterator(); iterator.hasNext(); ((zzp)iterator.next()).clear()) { }
    }

    public long getApproximateStreamPosition()
    {
        long l;
        long l1;
        MediaInfo mediainfo;
        for (mediainfo = getMediaInfo(); mediainfo == null || zzOm == 0L;)
        {
            return 0L;
        }

        double d = zzOn.getPlaybackRate();
        long l2 = zzOn.getStreamPosition();
        int i = zzOn.getPlayerState();
        if (d == 0.0D || i != 2)
        {
            return l2;
        }
        l = SystemClock.elapsedRealtime() - zzOm;
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
        if (zzOn == null)
        {
            return null;
        } else
        {
            return zzOn.getMediaInfo();
        }
    }

    public MediaStatus getMediaStatus()
    {
        return zzOn;
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

    public long zza(zzo zzo)
        throws IOException
    {
        JSONObject jsonobject = new JSONObject();
        long l = zzjX();
        zzOw.zza(l, zzo);
        zzM(true);
        try
        {
            jsonobject.put("requestId", l);
            jsonobject.put("type", "GET_STATUS");
            if (zzOn != null)
            {
                jsonobject.put("mediaSessionId", zzOn.zzjT());
            }
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo) { }
        zza(jsonobject.toString(), l, null);
        return l;
    }

    public long zza(zzo zzo, double d, JSONObject jsonobject)
        throws IOException, IllegalStateException, IllegalArgumentException
    {
        JSONObject jsonobject1;
        long l;
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        }
        jsonobject1 = new JSONObject();
        l = zzjX();
        zzOu.zza(l, zzo);
        zzM(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", zzjT());
        zzo = new JSONObject();
        zzo.put("level", d);
        jsonobject1.put("volume", zzo);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (zzo zzo) { }
        }
        zza(jsonobject1.toString(), l, null);
        return l;
    }

    public long zza(zzo zzo, long l, int i, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = zzjX();
        zzOt.zza(l1, zzo);
        zzM(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "SEEK");
        jsonobject1.put("mediaSessionId", zzjT());
        jsonobject1.put("currentTime", zzf.zzy(l));
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
            catch (zzo zzo) { }
        }
        zza(jsonobject1.toString(), l1, null);
        return l1;
_L2:
        if (i != 2) goto _L4; else goto _L3
_L3:
        jsonobject1.put("resumeState", "PLAYBACK_PAUSE");
          goto _L4
    }

    public long zza(zzo zzo, MediaInfo mediainfo, boolean flag, long l, long al[], JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l1;
        jsonobject1 = new JSONObject();
        l1 = zzjX();
        zzOp.zza(l1, zzo);
        zzM(true);
        jsonobject1.put("requestId", l1);
        jsonobject1.put("type", "LOAD");
        jsonobject1.put("media", mediainfo.toJson());
        jsonobject1.put("autoplay", flag);
        jsonobject1.put("currentTime", zzf.zzy(l));
        if (al == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        zzo = new JSONArray();
        int i = 0;
_L2:
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        zzo.put(i, al[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject1.put("activeTrackIds", zzo);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (zzo zzo) { }
        }
        zza(jsonobject1.toString(), l1, null);
        return l1;
    }

    public long zza(zzo zzo, TextTrackStyle texttrackstyle)
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = zzjX();
        zzOy.zza(l, zzo);
        zzM(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        if (texttrackstyle == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        jsonobject.put("textTrackStyle", texttrackstyle.toJson());
        jsonobject.put("mediaSessionId", zzjT());
_L2:
        zza(jsonobject.toString(), l, null);
        return l;
        zzo;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long zza(zzo zzo, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = zzjX();
        zzOq.zza(l, zzo);
        zzM(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PAUSE");
        jsonobject1.put("mediaSessionId", zzjT());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (zzo zzo) { }
        }
        zza(jsonobject1.toString(), l, null);
        return l;
    }

    public long zza(zzo zzo, boolean flag, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = zzjX();
        zzOv.zza(l, zzo);
        zzM(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "SET_VOLUME");
        jsonobject1.put("mediaSessionId", zzjT());
        zzo = new JSONObject();
        zzo.put("muted", flag);
        jsonobject1.put("volume", zzo);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (zzo zzo) { }
        }
        zza(jsonobject1.toString(), l, null);
        return l;
    }

    public long zza(zzo zzo, long al[])
        throws IOException
    {
        JSONObject jsonobject;
        long l;
        jsonobject = new JSONObject();
        l = zzjX();
        zzOx.zza(l, zzo);
        zzM(true);
        jsonobject.put("requestId", l);
        jsonobject.put("type", "EDIT_TRACKS_INFO");
        jsonobject.put("mediaSessionId", zzjT());
        zzo = new JSONArray();
        int i = 0;
_L2:
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        zzo.put(i, al[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("activeTrackIds", zzo);
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo) { }
        zza(jsonobject.toString(), l, null);
        return l;
    }

    public long zzb(zzo zzo, JSONObject jsonobject)
        throws IOException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = zzjX();
        zzOs.zza(l, zzo);
        zzM(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "STOP");
        jsonobject1.put("mediaSessionId", zzjT());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (zzo zzo) { }
        }
        zza(jsonobject1.toString(), l, null);
        return l;
    }

    public void zzb(long l, int i)
    {
        for (Iterator iterator = zzOo.iterator(); iterator.hasNext(); ((zzp)iterator.next()).zzc(l, i)) { }
    }

    public final void zzbm(String s)
    {
        zzNv.zzb("message received: %s", new Object[] {
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
            zza(l, ((JSONArray) (obj)).getJSONObject(0));
            return;
        }
        try
        {
            zzOn = null;
            onStatusUpdated();
            onMetadataUpdated();
            zzOw.zzc(l, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzNv.zzd("Message is malformed (%s); ignoring: %s", new Object[] {
                ((JSONException) (obj)).getMessage(), s
            });
        }
        return;
        if (((String) (obj1)).equals("INVALID_PLAYER_STATE"))
        {
            zzNv.zzd("received unexpected error: Invalid Player State.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (obj1 = zzOo.iterator(); ((Iterator) (obj1)).hasNext(); ((zzp)((Iterator) (obj1)).next()).zzb(l, 2100, obj)) { }
            break MISSING_BLOCK_LABEL_342;
        }
        if (((String) (obj1)).equals("LOAD_FAILED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            zzOp.zzb(l, 2100, obj);
            return;
        }
        if (((String) (obj1)).equals("LOAD_CANCELLED"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            zzOp.zzb(l, 2101, obj);
            return;
        }
        if (((String) (obj1)).equals("INVALID_REQUEST"))
        {
            zzNv.zzd("received unexpected error: Invalid Request.", new Object[0]);
            obj = ((JSONObject) (obj)).optJSONObject("customData");
            for (Iterator iterator = zzOo.iterator(); iterator.hasNext(); ((zzp)iterator.next()).zzb(l, 2100, obj)) { }
        }
    }

    public long zzc(zzo zzo, JSONObject jsonobject)
        throws IOException, IllegalStateException
    {
        JSONObject jsonobject1;
        long l;
        jsonobject1 = new JSONObject();
        l = zzjX();
        zzOr.zza(l, zzo);
        zzM(true);
        jsonobject1.put("requestId", l);
        jsonobject1.put("type", "PLAY");
        jsonobject1.put("mediaSessionId", zzjT());
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("customData", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (zzo zzo) { }
        }
        zza(jsonobject1.toString(), l, null);
        return l;
    }

    public long zzjT()
        throws IllegalStateException
    {
        if (zzOn == null)
        {
            throw new IllegalStateException("No current media session");
        } else
        {
            return zzOn.zzjT();
        }
    }

    public void zzjW()
    {
        super.zzjW();
        zzkr();
    }

    protected boolean zzx(long l)
    {
        for (Iterator iterator = zzOo.iterator(); iterator.hasNext(); ((zzp)iterator.next()).zzd(l, 2102)) { }
        Object obj = zzp.zzOD;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator1 = zzOo.iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((zzp)iterator1.next()).zzkt()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
