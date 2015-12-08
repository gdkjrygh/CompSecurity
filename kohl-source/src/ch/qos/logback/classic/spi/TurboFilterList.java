// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.org.slf4j.Marker;
import java.util.concurrent.CopyOnWriteArrayList;

public final class TurboFilterList extends CopyOnWriteArrayList
{

    public TurboFilterList()
    {
    }

    public FilterReply getTurboFilterChainDecision(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
    {
        if (size() != 1) goto _L2; else goto _L1
_L1:
        FilterReply filterreply;
        try
        {
            filterreply = ((TurboFilter)get(0)).decide(marker, logger, level, s, aobj, throwable);
        }
        // Misplaced declaration of an exception variable
        catch (Marker marker)
        {
            return FilterReply.NEUTRAL;
        }
_L4:
        return filterreply;
_L2:
        Object aobj1[];
        int i;
        int j;
        aobj1 = toArray();
        j = aobj1.length;
        i = 0;
_L6:
        FilterReply filterreply1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        filterreply1 = ((TurboFilter)aobj1[i]).decide(marker, logger, level, s, aobj, throwable);
        filterreply = filterreply1;
        if (filterreply1 == FilterReply.DENY) goto _L4; else goto _L3
_L3:
        filterreply = filterreply1;
        if (filterreply1 == FilterReply.ACCEPT) goto _L4; else goto _L5
_L5:
        i++;
          goto _L6
        return FilterReply.NEUTRAL;
    }
}
