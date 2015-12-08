// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.akamai.android.analytics:
//            CSMAKEYS

public class VisitMetrics
{

    public long firstILineTime;
    public int visitAdAbandonCount;
    public int visitAdPlayClockTime;
    public int visitAdStartCount;
    public int visitAttempts;
    public HashMap visitBitRateTimes;
    public int visitErrors;
    public String visitId;
    public int visitInterval;
    public Object visitLock;
    public int visitPlayClockTime;
    public float visitPlayStreamTime;
    public int visitPlays;
    public int visitRebufferCount;
    public int visitRebufferTime;
    public int visitStartupErrors;
    public int visitUniqueTitles;
    public String visitUniqueTitlesList;
    public int visitViews;

    public VisitMetrics()
    {
        visitLock = new Object();
        visitBitRateTimes = new HashMap();
        visitUniqueTitlesList = "";
        visitUniqueTitles = 0;
    }

    public void giveVisitMetrics(HashMap hashmap, Long long1)
    {
        hashmap.put(CSMAKEYS.visitattempts.toString(), Integer.toString(visitAttempts));
        hashmap.put(CSMAKEYS.visitplays.toString(), Integer.toString(visitPlays));
        hashmap.put(CSMAKEYS.visitviews.toString(), Integer.toString(visitViews));
        hashmap.put(CSMAKEYS.visiterrors.toString(), Integer.toString(visitErrors));
        Integer integer;
        int i;
        int j;
        int k;
        try
        {
            hashmap.put(CSMAKEYS.visitinterval.toString(), Long.toString(long1.longValue() - firstILineTime));
        }
        // Misplaced declaration of an exception variable
        catch (Long long1) { }
        hashmap.put(CSMAKEYS.visitplayclocktime.toString(), Integer.toString(visitPlayClockTime));
        hashmap.put(CSMAKEYS.visitplaystreamtime.toString(), Float.toString(visitPlayStreamTime));
        hashmap.put(CSMAKEYS.visitrebuffercount.toString(), Integer.toString(visitRebufferCount));
        hashmap.put(CSMAKEYS.visitrebuffertime.toString(), Integer.toString(visitRebufferTime));
        hashmap.put(CSMAKEYS.visitstartuperrors.toString(), Integer.toString(visitStartupErrors));
        hashmap.put(CSMAKEYS.visituniquetitles.toString(), Integer.toString(visitUniqueTitles));
        hashmap.put(CSMAKEYS.visitadplayclocktime.toString(), Integer.toString(visitAdPlayClockTime));
        hashmap.put(CSMAKEYS.visitadabandoncount.toString(), Integer.toString(visitAdAbandonCount));
        hashmap.put(CSMAKEYS.visitadstartcount.toString(), Integer.toString(visitAdStartCount));
        j = 0;
        i = 0;
        long1 = visitBitRateTimes.keySet().iterator();
_L4:
        if (long1.hasNext()) goto _L2; else goto _L1
_L1:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        try
        {
            long1 = (new StringBuilder("0")).append(Integer.toString(j / 0x7a120)).toString();
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return;
        }
        if (j <= 0x4c4b40)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        long1 = Integer.toString(j / 0x7a120);
        hashmap.put(CSMAKEYS.visitmaxpersistentbitratebucket.toString(), long1);
        return;
_L2:
        integer = (Integer)long1.next();
        k = ((Integer)visitBitRateTimes.get(integer)).intValue();
        if (i >= k) goto _L4; else goto _L3
_L3:
        j = integer.intValue();
        i = k;
          goto _L4
    }

    public void setVisitAttempts(int i)
    {
        if (visitAttempts == 0 && i > 0)
        {
            firstILineTime = System.currentTimeMillis();
        }
        visitAttempts = i;
    }
}
