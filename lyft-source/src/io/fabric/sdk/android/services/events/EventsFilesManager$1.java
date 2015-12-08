// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import java.util.Comparator;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsFilesManager

class a
    implements Comparator
{

    final EventsFilesManager a;

    public int a(leWithTimestamp lewithtimestamp, leWithTimestamp lewithtimestamp1)
    {
        return (int)(lewithtimestamp.b - lewithtimestamp1.b);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((leWithTimestamp)obj, (leWithTimestamp)obj1);
    }

    leWithTimestamp(EventsFilesManager eventsfilesmanager)
    {
        a = eventsfilesmanager;
        super();
    }
}
