// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.presentation:
//            PresentationEvent

public class PresentationRequest
{

    public static final String API = "sw_version";
    public static final String APPLICATION_NAME = "application_name";
    public static final String APPLICATION_VER = "application_v";
    public static final String APP_NAME_VAL = "andorid";
    public static final String COUNTRY = "country";
    protected static final boolean DEBUG = false;
    public static final String DEVICE_TYPE = "device_type";
    public static final String ESN = "esn";
    public static final String EVENTS = "data";
    public static final String NRDP_VERSION = "sdk_version";
    private static String TAG = "nf_presentation";
    public static final long USER_GLANCE_TIME = 300L;
    private String api;
    private String app_name;
    private String app_ver;
    private Context context;
    private String country;
    private String device_type;
    private String esn;
    private List events;
    private String nrdp_ver;

    public PresentationRequest()
    {
        events = new ArrayList();
        app_name = "andorid";
    }

    public PresentationRequest(Context context1, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface)
    {
        events = new ArrayList();
        app_name = "andorid";
        context = context1;
        esn = configurationagentinterface.getEsnProvider().getEsn();
        country = useragentinterface.getGeoCountry();
        device_type = configurationagentinterface.getEsnProvider().getDeviceModel();
        app_ver = AndroidManifestUtils.getVersion(context1);
        nrdp_ver = SecurityRepository.getNrdLibVersion();
        api = Integer.toString(AndroidUtils.getAndroidVersion());
    }

    private static void addToSlidingWindow(LinkedList linkedlist, PresentationEvent presentationevent, int i)
    {
        if (linkedlist.size() >= i)
        {
            PresentationEvent presentationevent1 = (PresentationEvent)linkedlist.removeFirst();
            Log.d(TAG, String.format("t %d, row %d, rank %d,  %s - !Drop", new Object[] {
                Long.valueOf(presentationevent1.getTime()), Integer.valueOf(presentationevent1.getRow()), Integer.valueOf(presentationevent1.getRank()), presentationevent1.getVideoIds()
            }));
        }
        linkedlist.add(presentationevent);
    }

    private static List filterFastScrollEvents(Context context1, List list)
    {
        ArrayList arraylist = new ArrayList();
        LinkedList linkedlist = new LinkedList();
        int i = getNumPagesVisibileToUser(context1);
        for (context1 = list.iterator(); context1.hasNext(); addToSlidingWindow(linkedlist, list, i))
        {
            list = (PresentationEvent)context1.next();
            if (shouldFlushSlidingWindow(linkedlist, list, i))
            {
                arraylist.addAll(linkedlist);
                linkedlist.clear();
            }
        }

        arraylist.addAll(linkedlist);
        return arraylist;
    }

    private static int getNumPagesVisibileToUser(Context context1)
    {
        int i = 2;
        if (DeviceUtils.isPortrait(context1))
        {
            int j = 2 + 1;
            i = j;
            if (DeviceUtils.isTabletByContext(context1))
            {
                i = j + 1;
            }
        }
        return i;
    }

    private static boolean shouldFlushSlidingWindow(LinkedList linkedlist, PresentationEvent presentationevent, int i)
    {
        if (linkedlist.size() != 0)
        {
            linkedlist = (PresentationEvent)linkedlist.getLast();
            if (linkedlist.getRow() == presentationevent.getRow() || !StringUtils.safeEquals(linkedlist.getLocation(), presentationevent.getLocation()))
            {
                return true;
            }
            if (presentationevent.getTime() - linkedlist.getTime() > 300L)
            {
                return true;
            }
        }
        return false;
    }

    public void addAllEvent(List list)
    {
        list = filterFastScrollEvents(context, list);
        events.addAll(list);
    }

    public void initFromString(String s)
        throws JSONException
    {
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Cant create PT request from empty string");
        }
        s = new JSONObject(s);
        esn = JsonUtils.getString(s, "esn", null);
        country = JsonUtils.getString(s, "country", null);
        device_type = JsonUtils.getString(s, "device_type", null);
        app_name = JsonUtils.getString(s, "application_name", null);
        app_ver = JsonUtils.getString(s, "application_v", null);
        nrdp_ver = JsonUtils.getString(s, "sdk_version", null);
        api = JsonUtils.getString(s, "sw_version", null);
        s = new JSONArray(JsonUtils.getString(s, "data", null));
        for (int i = 0; i < s.length(); i++)
        {
            PresentationEvent presentationevent = PresentationEvent.createInstance(s.getJSONObject(i));
            if (presentationevent != null)
            {
                events.add(presentationevent);
            }
        }

    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("esn", esn);
        if (StringUtils.isNotEmpty(country))
        {
            jsonobject.putOpt("country", country);
        }
        jsonobject.putOpt("device_type", device_type);
        jsonobject.putOpt("application_name", app_name);
        jsonobject.putOpt("application_v", app_ver);
        jsonobject.putOpt("sdk_version", nrdp_ver);
        jsonobject.putOpt("sw_version", api);
        if (events != null)
        {
            JSONArray jsonarray = new JSONArray();
            jsonobject.put("data", jsonarray);
            for (Iterator iterator = events.iterator(); iterator.hasNext();)
            {
                JSONArray jsonarray1 = ((PresentationEvent)iterator.next()).toJSONArray();
                int i = 0;
                while (i < jsonarray1.length()) 
                {
                    jsonarray.put(jsonarray1.getJSONObject(i));
                    i++;
                }
            }

        }
        return jsonobject;
    }

    public Map toRequestParams()
    {
        HashMap hashmap;
        JSONArray jsonarray;
        Iterator iterator;
        hashmap = new HashMap();
        hashmap.put("esn", esn);
        hashmap.put("country", country);
        hashmap.put("device_type", device_type);
        hashmap.put("application_name", app_name);
        hashmap.put("application_v", app_ver);
        hashmap.put("sdk_version", nrdp_ver);
        hashmap.put("sw_version", api);
        if (events == null)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        jsonarray = new JSONArray();
        iterator = events.iterator();
_L4:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (PresentationEvent)iterator.next();
        Log.d(TAG, String.format("t %d, row %d, rank %d, %s - sending", new Object[] {
            Long.valueOf(((PresentationEvent) (obj)).getTime()), Integer.valueOf(((PresentationEvent) (obj)).getRow()), Integer.valueOf(((PresentationEvent) (obj)).getRank()), ((PresentationEvent) (obj)).getVideoIds()
        }));
        obj = ((PresentationEvent) (obj)).toJSONArray();
        int i = 0;
_L2:
        if (i >= ((JSONArray) (obj)).length())
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonarray.put(((JSONArray) (obj)).getJSONObject(i));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        JSONException jsonexception;
        jsonexception;
        Log.d(TAG, String.format("Error in event json exception %s", new Object[] {
            jsonexception
        }));
        if (true) goto _L4; else goto _L3
_L3:
        hashmap.put("data", jsonarray.toString());
        return hashmap;
    }

}
