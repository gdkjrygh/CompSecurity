// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.error;

import com.netflix.mediaclient.ui.Asset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.error:
//            Signal

public final class CrashReport
{

    public static final String EP_ID = "NF_CrashReport.episodeId";
    public static final String ERROR_CODE = "NF_CrashReport.errorCode";
    public static final String ERROR_NUMBER = "NF_CrashReport.errorNumber";
    public static final String MOVIE_ID = "NF_CrashReport.movieId";
    public static final String PID = "NF_CrashReport.pid";
    public static final String SIGNAL = "NF_CrashReport.signal";
    public static final String SIG_NUMBER = "NF_CrashReport.sigNumber";
    public static final String TRACK_ID = "NF_CrashReport.trackId";
    public static final String TS = "NF_CrashReport.ts";
    private String episodeId;
    private long errorCode;
    private long errorNumber;
    private String movieId;
    private int pid;
    private long sigNumber;
    private Signal signal;
    private int trkId;
    private long ts;

    public CrashReport(Signal signal1, long l, long l1, long l2, 
            int i)
    {
        this(signal1, l, l1, l2, null, null, 0, System.currentTimeMillis(), i);
    }

    public CrashReport(Signal signal1, long l, long l1, long l2, 
            String s, String s1, int i, long l3, int j)
    {
        movieId = "";
        episodeId = "";
        trkId = 0;
        signal = signal1;
        sigNumber = l;
        errorNumber = l1;
        errorCode = l2;
        ts = l3;
        movieId = toNoNullString(s);
        episodeId = toNoNullString(s1);
        trkId = i;
        pid = j;
    }

    private String toGmtString(Date date)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpledateformat.format(date);
    }

    private String toNoNullString(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public String getCrashTime()
    {
        return toGmtString(new Date(ts));
    }

    public String getEpisodeId()
    {
        return episodeId;
    }

    public long getErrorCode()
    {
        return errorCode;
    }

    public long getErrorNumber()
    {
        return errorNumber;
    }

    public String getMovieId()
    {
        return movieId;
    }

    public int getPid()
    {
        return pid;
    }

    public long getSigNumber()
    {
        return sigNumber;
    }

    public Signal getSignal()
    {
        return signal;
    }

    public long getTimestamp()
    {
        return ts;
    }

    public int getTrkId()
    {
        return trkId;
    }

    public void setAsset(Asset asset)
    {
        if (asset == null)
        {
            return;
        }
        setTrkId(asset.getTrackId());
        if (asset.isEpisode())
        {
            setMovieId(asset.getPlayableId());
            return;
        } else
        {
            setMovieId(asset.getParentId());
            setEpisodeId(asset.getPlayableId());
            return;
        }
    }

    public void setEpisodeId(String s)
    {
        episodeId = toNoNullString(s);
    }

    public void setMovieId(String s)
    {
        movieId = toNoNullString(s);
    }

    public void setTrkId(int i)
    {
        trkId = i;
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("signal", signal.getDescription());
        jsonobject.put("signumber", sigNumber);
        jsonobject.put("errorCode", errorCode);
        jsonobject.put("errorNumber", errorNumber);
        jsonobject.put("movieId", movieId);
        jsonobject.put("epId", episodeId);
        jsonobject.put("trkId", trkId);
        jsonobject.put("ts", ts);
        jsonobject.put("pid", pid);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CrashReport [errorCode=").append(errorCode).append(", errorNumber=").append(errorNumber).append(", sigNumber=").append(sigNumber).append(", signal=").append(signal.getDescription()).append(", ts=").append(getCrashTime()).append(", movieId=").append(movieId).append(", epId=").append(episodeId).append(", trkId=").append(trkId).append("]").toString();
    }
}
