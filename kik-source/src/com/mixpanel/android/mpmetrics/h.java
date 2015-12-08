// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Survey, InAppNotification

final class h
{
    public static interface a
    {

        public abstract void a();
    }


    private final String a;
    private final String b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final List e = new LinkedList();
    private final List f = new LinkedList();
    private final a g;
    private final AtomicBoolean h = new AtomicBoolean(false);

    public h(String s, String s1, a a1)
    {
        a = s;
        b = s1;
        g = a1;
    }

    private boolean d()
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
        return a;
    }

    public final void a(List list, List list1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        list = list.iterator();
_L1:
        Survey survey;
        int i;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_86;
            }
            survey = (Survey)list.next();
            i = survey.a();
        } while (c.contains(Integer.valueOf(i)));
        c.add(Integer.valueOf(i));
        e.add(survey);
        flag = true;
          goto _L1
        list = list1.iterator();
_L2:
        int j;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_167;
            }
            list1 = (InAppNotification)list.next();
            j = list1.b();
        } while (d.contains(Integer.valueOf(j)));
        d.add(Integer.valueOf(j));
        f.add(list1);
        flag = true;
          goto _L2
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_195;
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

    public final InAppNotification b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = f.isEmpty();
        if (!flag1) goto _L2; else goto _L1
_L1:
        InAppNotification inappnotification = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return inappnotification;
_L2:
        InAppNotification inappnotification1 = (InAppNotification)f.remove(0);
        inappnotification = inappnotification1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        f.add(f.size(), inappnotification1);
        inappnotification = inappnotification1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final String b()
    {
        return b;
    }

    public final boolean c()
    {
        return h.get();
    }
}
