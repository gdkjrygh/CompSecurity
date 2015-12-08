// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            CsiTimer, Timer, TickItem

public final class Ticker
{

    private String action;
    private final long birth;
    private LinkedHashMap customizedParams;
    private boolean reportIrt;
    private final LinkedList ticks;
    private final Timer timer;

    public Ticker(String s)
    {
        this(s, ((Timer) (new CsiTimer())));
    }

    public Ticker(String s, Timer timer1)
    {
        customizedParams = new LinkedHashMap();
        reportIrt = false;
        action = s;
        ticks = new LinkedList();
        timer = timer1;
        birth = timer1.elapsedRealtime();
    }

    private static Map generateReportItems(String s, Map map, StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        LinkedHashMap linkedhashmap = null;
        if (stringbuilder.length() > 0)
        {
            LinkedHashMap linkedhashmap1 = new LinkedHashMap();
            if (s != null)
            {
                linkedhashmap1.put("action", s);
            }
            if (map != null && !map.isEmpty())
            {
                linkedhashmap1.putAll(map);
            }
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            linkedhashmap1.put("it", stringbuilder.toString());
            linkedhashmap = linkedhashmap1;
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.deleteCharAt(stringbuilder1.length() - 1);
                linkedhashmap1.put("irt", stringbuilder1.toString());
                linkedhashmap = linkedhashmap1;
            }
        }
        return linkedhashmap;
    }

    private static TickItem tick(long l)
    {
        return new TickItem(l, null, null);
    }

    private transient boolean tick(TickItem tickitem, long l, String as[])
    {
        int i = 0;
        if (tickitem == null)
        {
            tickitem = action;
            Log.e("Ticker", (new StringBuilder(String.valueOf(tickitem).length() + 41)).append("In action: ").append(tickitem).append(", label item shouldn't be null").toString());
            return false;
        }
        if (birth > l)
        {
            tickitem = action;
            Log.e("Ticker", (new StringBuilder(String.valueOf(tickitem).length() + 46)).append("In action: ").append(tickitem).append(", ticks can't be marked in the past").toString());
            return false;
        }
        for (int j = as.length; i < j; i++)
        {
            TickItem tickitem1 = new TickItem(l, as[i], tickitem);
            ticks.add(tickitem1);
        }

        return true;
    }

    public final Map getCustomizedParam()
    {
        return Collections.unmodifiableMap(customizedParams);
    }

    public final Map getReportItems()
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        Iterator iterator = ticks.iterator();
        do
        {
            if (iterator.hasNext())
            {
                TickItem tickitem = (TickItem)iterator.next();
                String s = tickitem.getEvent();
                TickItem tickitem1 = tickitem.getLabelItem();
                Long long1 = tickitem.getTime();
                long l;
                long l1;
                if (tickitem1 == null && tickitem.getCustomerValue() != null)
                {
                    l1 = tickitem.getCustomerValue().longValue();
                    l = tickitem.getCustomerValue().longValue();
                } else
                {
                    if (tickitem1 == null || long1.longValue() <= 0L)
                    {
                        continue;
                    }
                    l1 = long1.longValue() - tickitem1.getTime().longValue();
                    l = long1.longValue() - birth;
                }
                stringbuilder.append(s).append('.').append(l1).append(',');
                if (reportIrt)
                {
                    stringbuilder1.append(l).append(',');
                }
                continue;
            }
            return generateReportItems(action, customizedParams, stringbuilder, stringbuilder1);
        } while (true);
    }

    public final void putCustomizedParam(String s, String s1)
    {
        customizedParams.put(s, s1);
    }

    public final TickItem tick()
    {
        return tick(timer.elapsedRealtime());
    }

    public final transient boolean tick(long l, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            TickItem tickitem = new TickItem(l, as[i]);
            ticks.add(tickitem);
        }

        return true;
    }

    public final transient boolean tick(TickItem tickitem, String as[])
    {
        return tick(tickitem, timer.elapsedRealtime(), as);
    }
}
