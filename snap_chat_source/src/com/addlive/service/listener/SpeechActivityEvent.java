// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class SpeechActivityEvent
{
    public class ActivityInfo
    {

        private Integer activity;
        final SpeechActivityEvent this$0;
        private Long userId;

        public Integer getActivity()
        {
            return activity;
        }

        public Long getUserId()
        {
            return userId;
        }

        public String toString()
        {
            return (new StringBuilder("{userId=")).append(userId).append(", activity=").append(activity).append('}').toString();
        }

        private ActivityInfo(JSONObject jsonobject)
        {
            this$0 = SpeechActivityEvent.this;
            super();
            userId = Long.valueOf(jsonobject.getLong("userId"));
            activity = Integer.valueOf(jsonobject.getInt("activity"));
        }

    }


    private List activeSpeakers;
    private String scopeId;
    private List speechActivity;

    public SpeechActivityEvent(JSONObject jsonobject)
    {
        boolean flag = false;
        super();
        activeSpeakers = new LinkedList();
        speechActivity = new LinkedList();
        scopeId = jsonobject.getString("scopeId");
        JSONArray jsonarray = jsonobject.getJSONArray("activeSpeakers");
        jsonobject = jsonobject.getJSONArray("speechActivity");
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= jsonobject.length())
            {
                break;
            }
            speechActivity.add(new ActivityInfo(jsonobject.getJSONObject(i)));
            i++;
        } while (true);
        for (; j < jsonarray.length(); j++)
        {
            activeSpeakers.add(Long.valueOf(jsonarray.getLong(j)));
        }

    }

    public List getActiveSpeakers()
    {
        return activeSpeakers;
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public List getSpeechActivity()
    {
        return speechActivity;
    }

    public String toString()
    {
        return (new StringBuilder("SpeechActivityEvent{scopeId='")).append(scopeId).append('\'').append(", activeSpeakers=").append(activeSpeakers).append(", speechActivity=").append(speechActivity).append('}').toString();
    }
}
