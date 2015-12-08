// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.UiLocation;
import com.netflix.mediaclient.util.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PresentationEvent
{

    private static final String LOCATION = "location";
    private static final String RANK = "rank";
    private static final String REQUEST_ID = "request_id";
    private static final String ROW = "row";
    private static String TAG = "nf_presentation";
    private static final String TIME = "time";
    private static final String TRACK_ID = "track_id";
    private static final String VIDEO_ID = "video_id";
    private static final String VIDEO_IDS = "video_ids";
    private String location;
    private int rank;
    private String requestId;
    private int row;
    private long time;
    private int trackId;
    private List videoIds;

    public PresentationEvent()
    {
        videoIds = new ArrayList();
    }

    public PresentationEvent(Trackable trackable, List list, int i, UiLocation uilocation)
    {
        videoIds = list;
        requestId = trackable.getRequestId();
        trackId = trackable.getTrackId();
        row = trackable.getListPos();
        rank = i;
        location = uilocation.getValue();
        time = System.currentTimeMillis();
    }

    public static PresentationEvent createInstance(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        PresentationEvent presentationevent = new PresentationEvent();
        try
        {
            String s = JsonUtils.getString(jsonobject, "video_id", null);
            presentationevent.videoIds.add(s);
            presentationevent.requestId = JsonUtils.getString(jsonobject, "request_id", null);
            presentationevent.trackId = JsonUtils.getInt(jsonobject, "track_id", 0);
            presentationevent.row = JsonUtils.getInt(jsonobject, "row", 0);
            presentationevent.rank = JsonUtils.getInt(jsonobject, "rank", 0);
            presentationevent.location = JsonUtils.getString(jsonobject, "location", null);
            presentationevent.time = JsonUtils.getLong(jsonobject, "time", 0L);
        }
        catch (Exception exception)
        {
            Log.d(TAG, String.format("fail to create PT event from json: %s ", new Object[] {
                jsonobject.toString()
            }));
            return null;
        }
        return presentationevent;
    }

    public String getLocation()
    {
        return location;
    }

    public int getRank()
    {
        return rank;
    }

    public int getRow()
    {
        return row;
    }

    public long getTime()
    {
        return time;
    }

    public String getVideoIds()
    {
        return videoIds.toString();
    }

    public JSONArray toJSONArray()
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        int i = rank;
        JSONObject jsonobject;
        for (Iterator iterator = videoIds.iterator(); iterator.hasNext(); jsonarray.put(jsonobject))
        {
            String s = (String)iterator.next();
            jsonobject = new JSONObject();
            jsonobject.putOpt("video_id", s);
            jsonobject.putOpt("request_id", requestId);
            jsonobject.putOpt("track_id", Integer.valueOf(trackId));
            jsonobject.putOpt("row", Integer.valueOf(row));
            jsonobject.putOpt("rank", Integer.valueOf(i));
            jsonobject.putOpt("location", location);
            jsonobject.putOpt("time", Long.valueOf(time));
            i++;
        }

        return jsonarray;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = videoIds.iterator(); iterator.hasNext(); jsonarray.put((String)iterator.next())) { }
        JSONObject jsonobject = new JSONObject();
        jsonobject.putOpt("video_ids", jsonarray.toString());
        jsonobject.putOpt("request_id", requestId);
        jsonobject.putOpt("track_id", Integer.valueOf(trackId));
        jsonobject.putOpt("row", Integer.valueOf(row));
        jsonobject.putOpt("rank", Integer.valueOf(rank));
        jsonobject.putOpt("location", location);
        jsonobject.putOpt("time", Long.valueOf(time));
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PresentationEvent [videoIds=").append(videoIds).append(", requestId=").append(requestId).append(", trackId=").append(trackId).append(", row=").append(row).append(", rank=").append(rank).append(", location=").append(location).append(", time=").append(time).append("]").toString();
    }

}
