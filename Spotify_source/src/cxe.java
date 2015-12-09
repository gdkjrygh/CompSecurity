// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.Survey;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cxe
{

    private static final Set j = new HashSet();
    public final String a;
    private String b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final List e = new LinkedList();
    private final List f = new LinkedList();
    private final cxf g;
    private final czi h;
    private JSONArray i;

    public cxe(String s, cxf cxf1, czi czi1)
    {
        a = s;
        g = cxf1;
        h = czi1;
        b = null;
    }

    private boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.isEmpty() || !e.isEmpty()) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = i;
        if (jsonarray == null) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final Survey a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = e.isEmpty();
        if (!flag1) goto _L2; else goto _L1
_L1:
        Survey survey = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return survey;
_L2:
        Survey survey1 = (Survey)e.remove(0);
        survey = survey1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        e.add(e.size(), survey1);
        survey = survey1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s = b;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        e.clear();
        f.clear();
        b = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void a(List list, List list1, JSONArray jsonarray, JSONArray jsonarray1)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        h.a(jsonarray);
        jsonarray = list.iterator();
        boolean flag = false;
_L2:
        if (!jsonarray.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Survey survey = (Survey)jsonarray.next();
        int k = survey.a;
        if (c.contains(Integer.valueOf(k)))
        {
            continue; /* Loop/switch isn't completed */
        }
        c.add(Integer.valueOf(k));
        e.add(survey);
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        jsonarray = list1.iterator();
_L3:
        InAppNotification inappnotification;
        int l;
        do
        {
            if (!jsonarray.hasNext())
            {
                break MISSING_BLOCK_LABEL_186;
            }
            inappnotification = (InAppNotification)jsonarray.next();
            l = inappnotification.b;
        } while (d.contains(Integer.valueOf(l)));
        d.add(Integer.valueOf(l));
        f.add(inappnotification);
        flag = true;
          goto _L3
        int j1 = jsonarray1.length();
        int i1 = 0;
_L14:
        if (i1 >= j1) goto _L5; else goto _L4
_L4:
        jsonarray = jsonarray1.getJSONObject(i1);
        if (j.contains(Integer.valueOf(jsonarray.getInt("id")))) goto _L7; else goto _L6
_L6:
        i = jsonarray1;
        flag = true;
        i1 = ((flag1) ? 1 : 0);
_L12:
        if (i1 == 0) goto _L9; else goto _L8
_L8:
        j.clear();
        i1 = 0;
_L10:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray = i.getJSONObject(i1);
        j.add(Integer.valueOf(jsonarray.getInt("id")));
_L11:
        i1++;
        if (true) goto _L10; else goto _L9
        jsonarray;
        Log.e("MixpanelAPI.DecideUpdts", (new StringBuilder("Could not convert variants[")).append(i1).append("] into a JSONObject while comparing the new variants").toString(), jsonarray);
        break; /* Loop/switch isn't completed */
        jsonarray;
        Log.e("MixpanelAPI.DecideUpdts", (new StringBuilder("Could not convert variants[")).append(i1).append("] into a JSONObject while updating the map").toString(), jsonarray);
          goto _L11
        list;
        throw list;
_L9:
        if (cxi.a)
        {
            Log.v("MixpanelAPI.DecideUpdts", (new StringBuilder("New Decide content has become available. ")).append(list.size()).append(" surveys, ").append(list1.size()).append(" notifications and ").append(jsonarray1.length()).append(" experiments have been added.").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        if (c() && g != null)
        {
            g.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L5:
        i1 = 0;
        if (true) goto _L12; else goto _L7
_L7:
        i1++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final InAppNotification b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.isEmpty()) goto _L2; else goto _L1
_L1:
        if (cxi.a)
        {
            Log.v("MixpanelAPI.DecideUpdts", "No unseen notifications exist, none will be returned.");
        }
        Object obj = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((InAppNotification) (obj));
_L2:
        InAppNotification inappnotification = (InAppNotification)f.remove(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        f.add(f.size(), inappnotification);
        obj = inappnotification;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        obj = inappnotification;
        if (!cxi.a)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.v("MixpanelAPI.DecideUpdts", (new StringBuilder("Recording notification ")).append(inappnotification).append(" as seen.").toString());
        obj = inappnotification;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final JSONArray b()
    {
        this;
        JVM INSTR monitorenter ;
        JSONArray jsonarray = i;
        this;
        JVM INSTR monitorexit ;
        return jsonarray;
        Exception exception;
        exception;
        throw exception;
    }

}
