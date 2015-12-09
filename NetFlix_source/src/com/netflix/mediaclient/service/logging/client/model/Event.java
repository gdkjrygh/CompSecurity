// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.service.logging.JsonSerializer;
import com.netflix.mediaclient.util.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            EventType, DataContext, SessionKey

public abstract class Event
    implements JsonSerializer
{

    public static final String ACTIVE_SESSIONS = "activeSessions";
    public static final String CATEGORY = "category";
    public static final String CUSTOM = "custom";
    public static final String DATA = "data";
    public static final String DATA_CONTEXT = "dataContext";
    public static final String KIDS = "kids";
    public static final String MODAL_VIEW = "modalView";
    public static final String NAME = "name";
    public static final String SEQUENCE = "sequence";
    public static final String SEVERITY = "severity";
    public static final String TIME = "eventTime";
    public static final String TIME_LEGACY = "time";
    public static final String TYPE = "type";
    public static final String UPTIME = "uptime";
    protected List activeSessions;
    protected String category;
    protected DataContext dataContext;
    protected boolean kids;
    protected com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalView;
    protected String name;
    protected long sequence;
    protected long time;
    protected EventType type;
    protected long uptime;

    public Event()
    {
        activeSessions = new ArrayList();
        time = System.currentTimeMillis();
    }

    public Event(JSONObject jsonobject)
        throws JSONException
    {
        activeSessions = new ArrayList();
        time = System.currentTimeMillis();
        String s = JsonUtils.getString(jsonobject, "type", null);
        if (s != null)
        {
            type = EventType.valueOf(s);
        }
        kids = JsonUtils.getBoolean(jsonobject, "kids", false);
        s = JsonUtils.getString(jsonobject, "modalView", null);
        if (s != null)
        {
            modalView = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        category = JsonUtils.getString(jsonobject, "category", null);
        name = JsonUtils.getString(jsonobject, "name", null);
        time = JsonUtils.getLong(jsonobject, "eventTime", 0L);
        sequence = JsonUtils.getLong(jsonobject, "sequence", 0L);
        uptime = JsonUtils.getLong(jsonobject, "uptime", 0L);
        dataContext = DataContext.createInstance(JsonUtils.getJSONObject(jsonobject, "dataContext", null));
        jsonobject = JsonUtils.getJSONArray(jsonobject, "activeSessions");
        if (jsonobject != null)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                activeSessions.add(SessionKey.createInstance(jsonobject.getJSONObject(i)));
            }

        }
    }

    public static Event createEvent(JSONObject jsonobject)
    {
        return null;
    }

    public void addActiveSession(SessionKey sessionkey)
    {
        activeSessions.add(sessionkey);
    }

    public void addAllActiveSession(List list)
    {
        activeSessions.addAll(list);
    }

    public String getCategory()
    {
        return category;
    }

    protected JSONObject getCustomData()
        throws JSONException
    {
        return null;
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1 = getCustomData();
        if (jsonobject1 != null)
        {
            jsonobject = new JSONObject();
            jsonobject.put("custom", jsonobject1);
        }
        return jsonobject;
    }

    public DataContext getDataContext()
    {
        return dataContext;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getModalView()
    {
        return modalView;
    }

    public String getName()
    {
        return name;
    }

    public long getSequence()
    {
        return sequence;
    }

    long getTime()
    {
        return time;
    }

    public EventType getType()
    {
        return type;
    }

    public long getUptime()
    {
        return uptime;
    }

    public boolean isKids()
    {
        return kids;
    }

    public void setCategory(String s)
    {
        category = s;
    }

    public void setDataContext(DataContext datacontext)
    {
        dataContext = datacontext;
    }

    public void setKids(boolean flag)
    {
        kids = flag;
    }

    public void setModalView(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        modalView = modalview;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setSequence(long l)
    {
        sequence = l;
    }

    public void setTime(long l)
    {
        time = l;
    }

    public void setUptime(long l)
    {
        uptime = l;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (category != null)
        {
            jsonobject.put("category", category);
        }
        if (name != null)
        {
            jsonobject.put("name", name);
        }
        if (type != null)
        {
            jsonobject.put("type", type.name());
        }
        if (modalView != null)
        {
            jsonobject.put("modalView", modalView.name());
        }
        if (dataContext != null)
        {
            jsonobject.put("dataContext", dataContext.toJSONObject());
        }
        JSONObject jsonobject1 = getData();
        if (jsonobject1 != null)
        {
            jsonobject.put("data", jsonobject1);
        }
        jsonobject.put("eventTime", time);
        jsonobject.put("time", time);
        jsonobject.put("sequence", sequence);
        jsonobject.put("uptime", uptime);
        jsonobject.put("kids", kids);
        if (activeSessions != null)
        {
            JSONArray jsonarray = new JSONArray();
            jsonobject.put("activeSessions", jsonarray);
            for (Iterator iterator = activeSessions.iterator(); iterator.hasNext(); jsonarray.put(((SessionKey)iterator.next()).toJSONArray())) { }
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Event [type=").append(type).append(", category=").append(category).append(", name=").append(name).append(", time=").append(time).append(", sequence=").append(sequence).append(", kids=").append(kids).append(", uptime=").append(uptime).append(", modalView=").append(modalView).append(", dataContex=").append(dataContext).append("]").toString();
    }
}
