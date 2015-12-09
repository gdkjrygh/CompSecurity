// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.NumberUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class DataContext
{

    public static final String RANK = "rank";
    public static final String REQUEST_ID = "requestId";
    public static final String ROW = "row";
    public static final String TRACK_ID = "trackId";
    public static final String VIDEO_ID = "videoId";
    public static final String XID = "xid";
    private Integer rank;
    private String requestId;
    private Integer row;
    private Integer trackId;
    private Integer videoId;
    private String xid;

    public DataContext()
    {
    }

    public DataContext(Trackable trackable)
    {
        this(trackable, Integer.valueOf(0), null);
    }

    public DataContext(Trackable trackable, Integer integer, String s)
    {
        if (trackable != null)
        {
            setRow(Integer.valueOf(trackable.getListPos()));
            setRequestId(trackable.getRequestId());
            setTrackId(Integer.valueOf(trackable.getTrackId()));
        }
        setRank(integer);
        setVideoId(NumberUtils.toIntegerSafely(s, null));
    }

    public DataContext(PlayContext playcontext, String s)
    {
        this(((Trackable) (playcontext)), Integer.valueOf(playcontext.getVideoPos()), s);
    }

    public static DataContext createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        }
        DataContext datacontext = new DataContext();
        int i = JsonUtils.getInt(jsonobject, "rank", -1);
        Integer integer;
        if (i < 0)
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(i);
        }
        datacontext.rank = integer;
        i = JsonUtils.getInt(jsonobject, "videoId", -1);
        if (i < 0)
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(i);
        }
        datacontext.videoId = integer;
        i = JsonUtils.getInt(jsonobject, "row", -1);
        if (i < 0)
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(i);
        }
        datacontext.row = integer;
        i = JsonUtils.getInt(jsonobject, "trackId", -1);
        if (i < 0)
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(i);
        }
        datacontext.trackId = integer;
        datacontext.requestId = JsonUtils.getString(jsonobject, "requestId", null);
        datacontext.xid = JsonUtils.getString(jsonobject, "xid", null);
        return datacontext;
    }

    public Integer getRank()
    {
        return rank;
    }

    public String getRequestId()
    {
        return requestId;
    }

    public Integer getRow()
    {
        return row;
    }

    public Integer getTrackId()
    {
        return trackId;
    }

    public Integer getVideoId()
    {
        return videoId;
    }

    public String getXid()
    {
        return xid;
    }

    public void setRank(Integer integer)
    {
        rank = integer;
    }

    public void setRequestId(String s)
    {
        requestId = s;
    }

    public void setRow(Integer integer)
    {
        row = integer;
    }

    public void setTrackId(Integer integer)
    {
        trackId = integer;
    }

    public void setVideoId(Integer integer)
    {
        videoId = integer;
    }

    public void setXid(String s)
    {
        xid = s;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (requestId != null)
        {
            jsonobject.put("requestId", requestId);
        }
        if (trackId != null)
        {
            jsonobject.put("trackId", trackId);
        }
        if (videoId != null)
        {
            jsonobject.put("videoId", videoId);
        }
        if (xid != null)
        {
            jsonobject.put("xid", xid);
        }
        if (row != null)
        {
            jsonobject.put("row", row);
        }
        if (rank != null)
        {
            jsonobject.put("rank", rank);
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DataContext [requestId=").append(requestId).append(", trackId=").append(trackId).append(", videoId=").append(videoId).append(", xid=").append(xid).append(", row=").append(row).append(", rank=").append(rank).append("]").toString();
    }
}
