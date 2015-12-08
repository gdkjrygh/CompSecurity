// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.log.Logger;
import java.util.List;

class EventTrackingHttpLogEntryDeleteDelegate
{

    com.vungle.publisher.db.model.EventTrackingHttpLogEntry.Factory a;

    EventTrackingHttpLogEntryDeleteDelegate()
    {
    }

    final int a(List list)
    {
        int i;
        if (list == null)
        {
            i = 0;
        } else
        {
            i = list.size();
        }
        if (i == 0)
        {
            Logger.d("VungleReport", "no event tracking HTTP log entries to delete");
        } else
        {
            Logger.d("VungleReport", (new StringBuilder("deleting ")).append(i).append(" event tracking HTTP log entries").toString());
        }
        return a.a(list);
    }
}
