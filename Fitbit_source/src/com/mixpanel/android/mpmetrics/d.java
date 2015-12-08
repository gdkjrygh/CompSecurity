// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;
import com.mixpanel.android.viewcrawler.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Survey, InAppNotification, g

class d
{
    public static interface a
    {

        public abstract void a();
    }


    private static final String j = "MixpanelAPI.DecideUpdts";
    private String a;
    private final String b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final List e = new LinkedList();
    private final List f = new LinkedList();
    private final a g;
    private final i h;
    private JSONArray i;

    public d(String s, a a1, i k)
    {
        b = s;
        g = a1;
        h = k;
        a = null;
    }

    public Survey a(int k, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int l = 0;
_L3:
        if (l >= e.size())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (((Survey)e.get(l)).b() != k) goto _L2; else goto _L1
_L1:
        Survey survey = (Survey)e.get(l);
        Object obj;
        obj = survey;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        e.remove(l);
        obj = survey;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Survey) (obj));
_L2:
        l++;
          goto _L3
        obj;
        throw obj;
        obj = null;
          goto _L4
    }

    public Survey a(boolean flag)
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

    public String a()
    {
        return b;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        e.clear();
        f.clear();
        a = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(List list, List list1, JSONArray jsonarray, JSONArray jsonarray1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        h.a(jsonarray);
        jsonarray = list.iterator();
_L1:
        Survey survey;
        int k;
        do
        {
            if (!jsonarray.hasNext())
            {
                break MISSING_BLOCK_LABEL_99;
            }
            survey = (Survey)jsonarray.next();
            k = survey.b();
        } while (c.contains(Integer.valueOf(k)));
        c.add(Integer.valueOf(k));
        e.add(survey);
        flag = true;
          goto _L1
        jsonarray = list1.iterator();
_L2:
        InAppNotification inappnotification;
        int l;
        do
        {
            if (!jsonarray.hasNext())
            {
                break MISSING_BLOCK_LABEL_183;
            }
            inappnotification = (InAppNotification)jsonarray.next();
            l = inappnotification.c();
        } while (d.contains(Integer.valueOf(l)));
        d.add(Integer.valueOf(l));
        f.add(inappnotification);
        flag = true;
          goto _L2
        i = jsonarray1;
        if (g.b)
        {
            Log.v("MixpanelAPI.DecideUpdts", (new StringBuilder()).append("New Decide content has become available. ").append(list.size()).append(" surveys and ").append(list1.size()).append(" notifications have been added.").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        if (d() && g != null)
        {
            g.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public InAppNotification b(int k, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int l = 0;
_L3:
        if (l >= f.size())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (((InAppNotification)f.get(l)).c() != k) goto _L2; else goto _L1
_L1:
        InAppNotification inappnotification = (InAppNotification)f.get(l);
        Object obj;
        obj = inappnotification;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        f.remove(l);
        obj = inappnotification;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((InAppNotification) (obj));
_L2:
        l++;
          goto _L3
        obj;
        throw obj;
        obj = null;
          goto _L4
    }

    public InAppNotification b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.isEmpty()) goto _L2; else goto _L1
_L1:
        if (g.b)
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
        if (!g.b)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.v("MixpanelAPI.DecideUpdts", (new StringBuilder()).append("Recording notification ").append(inappnotification).append(" as seen.").toString());
        obj = inappnotification;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s = a;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public JSONArray c()
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

    public boolean d()
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
}
