// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.util.Log;
import com.android.slyce.report.c.ab;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            Survey, InAppNotification, ab, p

class o
{

    private String a;
    private final String b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final List e = new LinkedList();
    private final List f = new LinkedList();
    private final p g;
    private final ab h;

    public o(String s, p p1, ab ab1)
    {
        b = s;
        g = p1;
        h = ab1;
        a = null;
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

    public void a(List list, List list1, JSONArray jsonarray)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        h.a(jsonarray);
        jsonarray = list.iterator();
_L1:
        Survey survey;
        int i;
        do
        {
            if (!jsonarray.hasNext())
            {
                break MISSING_BLOCK_LABEL_99;
            }
            survey = (Survey)jsonarray.next();
            i = survey.b();
        } while (c.contains(Integer.valueOf(i)));
        c.add(Integer.valueOf(i));
        e.add(survey);
        flag = true;
          goto _L1
        jsonarray = list1.iterator();
_L2:
        InAppNotification inappnotification;
        int j;
        do
        {
            if (!jsonarray.hasNext())
            {
                break MISSING_BLOCK_LABEL_183;
            }
            inappnotification = (InAppNotification)jsonarray.next();
            j = inappnotification.b();
        } while (d.contains(Integer.valueOf(j)));
        d.add(Integer.valueOf(j));
        f.add(inappnotification);
        flag = true;
          goto _L2
        if (ab.a)
        {
            Log.v("MixpanelAPI.DecideUpdates", (new StringBuilder()).append("New Decide content has become available. ").append(list.size()).append(" surveys and ").append(list1.size()).append(" notifications have been added.").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        if (c() && g != null)
        {
            g.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public InAppNotification b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.isEmpty()) goto _L2; else goto _L1
_L1:
        if (ab.a)
        {
            Log.v("MixpanelAPI.DecideUpdates", "No unseen notifications exist, none will be returned.");
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
        if (!ab.a)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.v("MixpanelAPI.DecideUpdates", (new StringBuilder()).append("Recording notification ").append(inappnotification).append(" as seen.").toString());
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

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag = e.isEmpty();
        if (flag) goto _L3; else goto _L2
_L2:
        flag = true;
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
